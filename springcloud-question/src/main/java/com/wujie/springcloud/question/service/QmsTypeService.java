package com.wujie.springcloud.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujie.common.utils.PageUtils;
import com.wujie.springcloud.question.entity.QmsTypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 10:34:43
 */
public interface QmsTypeService extends IService<QmsTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

