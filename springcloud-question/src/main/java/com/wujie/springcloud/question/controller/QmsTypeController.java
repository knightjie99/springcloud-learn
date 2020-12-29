package com.wujie.springcloud.question.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wujie.springcloud.question.entity.QmsTypeEntity;
import com.wujie.springcloud.question.service.QmsTypeService;
import com.wujie.common.utils.PageUtils;
import com.wujie.common.utils.R;



/**
 * 题目-题目类型表
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 10:34:43
 */
@RestController
@RequestMapping("generator/qmstype")
public class QmsTypeController {
    @Autowired
    private QmsTypeService qmsTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:qmstype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qmsTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:qmstype:info")
    public R info(@PathVariable("id") Long id){
		QmsTypeEntity qmsType = qmsTypeService.getById(id);

        return R.ok().put("qmsType", qmsType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:qmstype:save")
    public R save(@RequestBody QmsTypeEntity qmsType){
		qmsTypeService.save(qmsType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:qmstype:update")
    public R update(@RequestBody QmsTypeEntity qmsType){
		qmsTypeService.updateById(qmsType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:qmstype:delete")
    public R delete(@RequestBody Long[] ids){
		qmsTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
