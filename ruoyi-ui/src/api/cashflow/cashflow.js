import request from '@/utils/request'

// 查询资金信息列表
export function listCashflow(query) {
  return request({
    url: '/cashflow/cashflow/list',
    method: 'get',
    params: query
  })
}

// 查询资金信息详细
export function getCashflow(cashId) {
  return request({
    url: '/cashflow/cashflow/' + cashId,
    method: 'get'
  })
}

// 新增资金信息
export function addCashflow(data) {
  return request({
    url: '/cashflow/cashflow',
    method: 'post',
    data: data
  })
}

// 修改资金信息
export function updateCashflow(data) {
  return request({
    url: '/cashflow/cashflow',
    method: 'put',
    data: data
  })
}

// 删除资金信息
export function delCashflow(cashId) {
  return request({
    url: '/cashflow/cashflow/' + cashId,
    method: 'delete'
  })
}
