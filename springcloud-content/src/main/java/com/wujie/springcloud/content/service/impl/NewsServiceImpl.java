package com.wujie.springcloud.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wujie.common.utils.PageUtils;
import com.wujie.common.utils.Query;

import com.wujie.springcloud.content.dao.NewsDao;
import com.wujie.springcloud.content.entity.NewsEntity;
import com.wujie.springcloud.content.service.NewsService;


@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, NewsEntity> implements NewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<NewsEntity> page = this.page(
                new Query<NewsEntity>().getPage(params),
                new QueryWrapper<NewsEntity>()
        );

        return new PageUtils(page);
    }

}