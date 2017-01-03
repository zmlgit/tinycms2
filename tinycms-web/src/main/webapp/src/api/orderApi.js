import request from './request'

export const getOrderList = params => {
  return request('/api/order/find', params)
}
