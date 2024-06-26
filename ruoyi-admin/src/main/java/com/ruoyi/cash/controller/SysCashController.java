package com.ruoyi.cash.controller;

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
import com.ruoyi.cash.domain.SysCash;
import com.ruoyi.cash.service.ISysCashService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 资金信息Controller
 * 
 * @author admin
 * @date 2024-06-20
 */
@RestController
@RequestMapping("/cashflow/cashflow")
public class SysCashController extends BaseController
{
    @Autowired
    private ISysCashService sysCashService;

    /**
     * 查询资金信息列表
     */
    @PreAuthorize("@ss.hasPermi('cashflow:cashflow:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCash sysCash)
    {
        startPage();
        List<SysCash> list = sysCashService.selectSysCashList(sysCash);
        return getDataTable(list);
    }

    /**
     * 导出资金信息列表
     */
    @PreAuthorize("@ss.hasPermi('cashflow:cashflow:export')")
    @Log(title = "资金信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCash sysCash)
    {
        List<SysCash> list = sysCashService.selectSysCashList(sysCash);
        ExcelUtil<SysCash> util = new ExcelUtil<SysCash>(SysCash.class);
        util.exportExcel(response, list, "资金信息数据");
    }

    /**
     * 获取资金信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('cashflow:cashflow:query')")
    @GetMapping(value = "/{cashId}")
    public AjaxResult getInfo(@PathVariable("cashId") Long cashId)
    {
        return success(sysCashService.selectSysCashByCashId(cashId));
    }

    /**
     * 新增资金信息
     */
    @PreAuthorize("@ss.hasPermi('cashflow:cashflow:add')")
    @Log(title = "资金信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCash sysCash)
    {
        return toAjax(sysCashService.insertSysCash(sysCash));
    }

    /**
     * 修改资金信息
     */
    @PreAuthorize("@ss.hasPermi('cashflow:cashflow:edit')")
    @Log(title = "资金信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCash sysCash)
    {
        return toAjax(sysCashService.updateSysCash(sysCash));
    }

    /**
     * 删除资金信息
     */
    @PreAuthorize("@ss.hasPermi('cashflow:cashflow:remove')")
    @Log(title = "资金信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cashIds}")
    public AjaxResult remove(@PathVariable Long[] cashIds)
    {
        return toAjax(sysCashService.deleteSysCashByCashIds(cashIds));
    }
}
