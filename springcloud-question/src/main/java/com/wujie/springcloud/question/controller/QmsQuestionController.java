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

import com.wujie.springcloud.question.entity.QmsQuestionEntity;
import com.wujie.springcloud.question.service.QmsQuestionService;
import com.wujie.common.utils.PageUtils;
import com.wujie.common.utils.R;



/**
 * 
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 10:34:44
 */
@RestController
@RequestMapping("generator/qmsquestion")
public class QmsQuestionController {
    @Autowired
    private QmsQuestionService qmsQuestionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:qmsquestion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qmsQuestionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:qmsquestion:info")
    public R info(@PathVariable("id") Long id){
		QmsQuestionEntity qmsQuestion = qmsQuestionService.getById(id);

        return R.ok().put("qmsQuestion", qmsQuestion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:qmsquestion:save")
    public R save(@RequestBody QmsQuestionEntity qmsQuestion){
		qmsQuestionService.save(qmsQuestion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:qmsquestion:update")
    public R update(@RequestBody QmsQuestionEntity qmsQuestion){
		qmsQuestionService.updateById(qmsQuestion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:qmsquestion:delete")
    public R delete(@RequestBody Long[] ids){
		qmsQuestionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
