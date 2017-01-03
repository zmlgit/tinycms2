import request from './request'

export const getEventList = params => {
  return request('/api/case/find', params)
}
