const API_HOST = 'http://localhost:8082'
import { Message } from 'element-ui'

const toQueryStr = params => {
  const queryStrs = []
  for (let p in params) {
    if (params.hasOwnProperty(p)) {
      let value = params[p]
      if (value === undefined || value === null) {
        value = ''
      }
      queryStrs.push(`${p}=${value}`)
    }
  }
  return queryStrs.join('&')
}

const checkInternalStatus = resp => {
  if (resp.status >= 200 && resp.status < 300) {
    return resp
  } else {
    const error = new Error(resp.statusText)
    error.resp = resp
    throw error
  }
}

const checkBizStatus = resp => {
  if (resp.errorCode === 200) {
    return resp
  } else {
    const error = new Error(resp.errorMessage || '未知错误')
    error.resp = resp
    throw error
  }
}

export default function(url, params = {}) {
  return new Promise((resolve, reject) => {
    /* eslint-disable no-undef  */
    fetch(`${API_HOST}${url}`, {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/x-www-form-urlencoded'
      },
      body: toQueryStr(params)
    })
    .then(checkInternalStatus)
    .then(resp => resp.json())
    .then(checkBizStatus)
    .then(({result}) => resolve(result))
    .catch(err => {
      Message.error(String(err))
      reject(err)
    })
  })
}
