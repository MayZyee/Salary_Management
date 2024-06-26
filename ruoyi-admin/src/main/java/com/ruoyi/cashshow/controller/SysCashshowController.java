package com.ruoyi.cashshow.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.cashshow.domain.SysCashshow;
import com.ruoyi.cashshow.service.ISysCashshowService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 资金信息Controller
 * 
 * @author admin
 * @date 2024-06-20
 */
@RestController
@RequestMapping("/cashflowshow/cashshow")
public class SysCashshowController extends BaseController
{
    @Autowired
    private ISysCashshowService sysCashshowService;

    /**
     * 查询资金信息列表
     */
    @PreAuthorize("@ss.hasPermi('cashflowshow:cashshow:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCashshow sysCashshow)
    {
        startPage();
        List<SysCashshow> list = sysCashshowService.selectSysCashshowList(sysCashshow);
        return getDataTable(list);
    }

    /**
     * 导出资金信息列表
     */
    @PreAuthorize("@ss.hasPermi('cashflowshow:cashshow:export')")
    @Log(title = "资金信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCashshow sysCashshow)
    {
        List<SysCashshow> list = sysCashshowService.selectSysCashshowList(sysCashshow);
        ExcelUtil<SysCashshow> util = new ExcelUtil<SysCashshow>(SysCashshow.class);
        util.exportExcel(response, list, "资金信息数据");
    }

    /**
     * 获取资金信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('cashflowshow:cashshow:query')")
    @GetMapping(value = "/{cashId}")
    public AjaxResult getInfo(@PathVariable("cashId") Long cashId)
    {
        return success(sysCashshowService.selectSysCashshowByCashId(cashId));
    }
}
