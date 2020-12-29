package com.wujie.springcloud.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujie.common.utils.PageUtils;
import com.wujie.springcloud.question.entity.QmsQuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 10:34:44
 */
public interface QmsQuestionService extends IService<QmsQuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

