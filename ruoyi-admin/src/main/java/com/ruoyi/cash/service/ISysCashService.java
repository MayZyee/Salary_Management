package com.ruoyi.cash.service;

import java.util.List;
import com.ruoyi.cash.domain.SysCash;

/**
 * 资金信息Service接口
 * 
 * @author admin
 * @date 2024-06-20
 */
public interface ISysCashService 
{
    /**
     * 查询资金信息
     * 
     * @param cashId 资金信息主键
     * @return 资金信息
     */
    public SysCash selectSysCashByCashId(Long cashId);

    /**
     * 查询资金信息列表
     * 
     * @param sysCash 资金信息
     * @return 资金信息集合
     */
    public List<SysCash> selectSysCashList(SysCash sysCash);

    /**
     * 新增资金信息
     * 
     * @param sysCash 资金信息
     * @return 结果
     */
    public int insertSysCash(SysCash sysCash);

    /**
     * 修改资金信息
     * 
     * @param sysCash 资金信息
     * @return 结果
     */
    public int updateSysCash(SysCash sysCash);

    /**
     * 批量删除资金信息
     * 
     * @param cashIds 需要删除的资金信息主键集合
     * @return 结果
     */
    public int deleteSysCashByCashIds(Long[] cashIds);

    /**
     * 删除资金信息信息
     * 
     * @param cashId 资金信息主键
     * @return 结果
     */
    public int deleteSysCashByCashId(Long cashId);
}
