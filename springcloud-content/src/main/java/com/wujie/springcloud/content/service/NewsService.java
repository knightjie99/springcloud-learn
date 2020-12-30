package com.wujie.springcloud.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujie.common.utils.PageUtils;
import com.wujie.springcloud.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:00:02
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

