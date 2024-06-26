package com.ruoyi.cash.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cash.mapper.SysCashMapper;
import com.ruoyi.cash.domain.SysCash;
import com.ruoyi.cash.service.ISysCashService;

/**
 * 资金信息Service业务层处理
 * 
 * @author admin
 * @date 2024-06-20
 */
@Service
public class SysCashServiceImpl implements ISysCashService 
{
    @Autowired
    private SysCashMapper sysCashMapper;

    /**
     * 查询资金信息
     * 
     * @param cashId 资金信息主键
     * @return 资金信息
     */
    @Override
    public SysCash selectSysCashByCashId(Long cashId)
    {
        return sysCashMapper.selectSysCashByCashId(cashId);
    }

    /**
     * 查询资金信息列表
     * 
     * @param sysCash 资金信息
     * @return 资金信息
     */
    @Override
    public List<SysCash> selectSysCashList(SysCash sysCash)
    {
        return sysCashMapper.selectSysCashList(sysCash);
    }

    /**
     * 新增资金信息
     * 
     * @param sysCash 资金信息
     * @return 结果
     */
    @Override
    public int insertSysCash(SysCash sysCash)
    {
        sysCash.setCreateTime(DateUtils.getNowDate());
        return sysCashMapper.insertSysCash(sysCash);
    }

    /**
     * 修改资金信息
     * 
     * @param sysCash 资金信息
     * @return 结果
     */
    @Override
    public int updateSysCash(SysCash sysCash)
    {
        sysCash.setUpdateTime(DateUtils.getNowDate());
        return sysCashMapper.updateSysCash(sysCash);
    }

    /**
     * 批量删除资金信息
     * 
     * @param cashIds 需要删除的资金信息主键
     * @return 结果
     */
    @Override
    public int deleteSysCashByCashIds(Long[] cashIds)
    {
        return sysCashMapper.deleteSysCashByCashIds(cashIds);
    }

    /**
     * 删除资金信息信息
     * 
     * @param cashId 资金信息主键
     * @return 结果
     */
    @Override
    public int deleteSysCashByCashId(Long cashId)
    {
        return sysCashMapper.deleteSysCashByCashId(cashId);
    }
}
