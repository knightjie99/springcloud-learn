package com.wujie.springcloud.question.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wujie.common.utils.PageUtils;
import com.wujie.common.utils.Query;

import com.wujie.springcloud.question.dao.QmsQuestionDao;
import com.wujie.springcloud.question.entity.QmsQuestionEntity;
import com.wujie.springcloud.question.service.QmsQuestionService;


@Service("qmsQuestionService")
public class QmsQuestionServiceImpl extends ServiceImpl<QmsQuestionDao, QmsQuestionEntity> implements QmsQuestionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QmsQuestionEntity> page = this.page(
                new Query<QmsQuestionEntity>().getPage(params),
                new QueryWrapper<QmsQuestionEntity>()
        );

        return new PageUtils(page);
    }

}