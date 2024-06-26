package com.ruoyi.cashshow.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.common.utils.spring.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.cashshow.mapper.SysCashshowMapper;
import com.ruoyi.cashshow.domain.SysCashshow;
import com.ruoyi.cashshow.service.ISysCashshowService;

/**
 * 资金信息Service业务层处理
 * 
 * @author admin
 * @date 2024-06-20
 */
@Service
public class SysCashshowServiceImpl implements ISysCashshowService 
{
    @Autowired
    private SysCashshowMapper sysCashshowMapper;

    /**
     * 查询资金信息
     * 
     * @param cashId 资金信息主键
     * @return 资金信息
     */
    @Override
    public SysCashshow selectSysCashshowByCashId(Long cashId)
    {
        return sysCashshowMapper.selectSysCashshowByCashId(cashId);
    }

    /**
     * 查询资金信息列表
     * 
     * @param sysCashshow 资金信息
     * @return 资金信息
     */
    @Override
    @DataScope(deptAlias = "d", userAlias = "u")
    public List<SysCashshow> selectSysCashshowList(SysCashshow sysCashshow)
    {
        return sysCashshowMapper.selectSysCashshowList(sysCashshow);
    }

    /**
     * 新增资金信息
     * 
     * @param sysCashshow 资金信息
     * @return 结果
     */
    @Override
    public int insertSysCashshow(SysCashshow sysCashshow)
    {
        sysCashshow.setCreateTime(DateUtils.getNowDate());
        return sysCashshowMapper.insertSysCashshow(sysCashshow);
    }

    /**
     * 修改资金信息
     * 
     * @param sysCashshow 资金信息
     * @return 结果
     */
    @Override
    public int updateSysCashshow(SysCashshow sysCashshow)
    {
        sysCashshow.setUpdateTime(DateUtils.getNowDate());
        return sysCashshowMapper.updateSysCashshow(sysCashshow);
    }

    /**
     * 批量删除资金信息
     * 
     * @param cashIds 需要删除的资金信息主键
     * @return 结果
     */
    @Override
    public int deleteSysCashshowByCashIds(Long[] cashIds)
    {
        return sysCashshowMapper.deleteSysCashshowByCashIds(cashIds);
    }

    /**
     * 删除资金信息信息
     * 
     * @param cashId 资金信息主键
     * @return 结果
     */
    @Override
    public int deleteSysCashshowByCashId(Long cashId)
    {
        return sysCashshowMapper.deleteSysCashshowByCashId(cashId);
    }
}
