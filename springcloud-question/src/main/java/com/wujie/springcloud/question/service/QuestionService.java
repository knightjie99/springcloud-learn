package com.wujie.springcloud.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujie.common.utils.PageUtils;
import com.wujie.springcloud.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:17:00
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

