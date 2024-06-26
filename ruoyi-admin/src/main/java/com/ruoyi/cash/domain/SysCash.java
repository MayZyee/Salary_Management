package com.ruoyi.cash.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资金信息对象 sys_cash
 * 
 * @author admin
 * @date 2024-06-20
 */
public class SysCash extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资金ID */
    private Long cashId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 部门ID */
    @Excel(name = "部门ID")
    private Long deptId;

    /** 资金类型 */
    @Excel(name = "资金类型")
    private Long cashType;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal cashNum;

    public void setCashId(Long cashId) 
    {
        this.cashId = cashId;
    }

    public Long getCashId() 
    {
        return cashId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setCashType(Long cashType) 
    {
        this.cashType = cashType;
    }

    public Long getCashType() 
    {
        return cashType;
    }
    public void setCashNum(BigDecimal cashNum) 
    {
        this.cashNum = cashNum;
    }

    public BigDecimal getCashNum() 
    {
        return cashNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cashId", getCashId())
            .append("userId", getUserId())
            .append("deptId", getDeptId())
            .append("cashType", getCashType())
            .append("cashNum", getCashNum())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
