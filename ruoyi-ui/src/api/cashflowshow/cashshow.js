import request from '@/utils/request'

// 查询资金信息列表
export function listCashshow(query) {
  return request({
    url: '/cashflowshow/cashshow/list',
    method: 'get',
    params: query
  })
}

// 查询资金信息详细
export function getCashshow(cashId) {
  return request({
    url: '/cashflowshow/cashshow/' + cashId,
    method: 'get'
  })
}

// 新增资金信息
export function addCashshow(data) {
  return request({
    url: '/cashflowshow/cashshow',
    method: 'post',
    data: data
  })
}

// 修改资金信息
export function updateCashshow(data) {
  return request({
    url: '/cashflowshow/cashshow',
    method: 'put',
    data: data
  })
}

// 删除资金信息
export function delCashshow(cashId) {
  return request({
    url: '/cashflowshow/cashshow/' + cashId,
    method: 'delete'
  })
}
