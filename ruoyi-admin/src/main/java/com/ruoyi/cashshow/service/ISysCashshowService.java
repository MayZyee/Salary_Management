package com.ruoyi.cashshow.service;

import java.util.List;
import com.ruoyi.cashshow.domain.SysCashshow;

/**
 * 资金信息Service接口
 * 
 * @author admin
 * @date 2024-06-20
 */
public interface ISysCashshowService 
{
    /**
     * 查询资金信息
     * 
     * @param cashId 资金信息主键
     * @return 资金信息
     */
    public SysCashshow selectSysCashshowByCashId(Long cashId);

    /**
     * 查询资金信息列表
     * 
     * @param sysCashshow 资金信息
     * @return 资金信息集合
     */
    public List<SysCashshow> selectSysCashshowList(SysCashshow sysCashshow);

    /**
     * 新增资金信息
     * 
     * @param sysCashshow 资金信息
     * @return 结果
     */
    public int insertSysCashshow(SysCashshow sysCashshow);

    /**
     * 修改资金信息
     * 
     * @param sysCashshow 资金信息
     * @return 结果
     */
    public int updateSysCashshow(SysCashshow sysCashshow);

    /**
     * 批量删除资金信息
     * 
     * @param cashIds 需要删除的资金信息主键集合
     * @return 结果
     */
    public int deleteSysCashshowByCashIds(Long[] cashIds);

    /**
     * 删除资金信息信息
     * 
     * @param cashId 资金信息主键
     * @return 结果
     */
    public int deleteSysCashshowByCashId(Long cashId);
}
