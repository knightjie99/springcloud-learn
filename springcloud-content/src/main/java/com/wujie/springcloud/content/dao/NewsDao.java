package com.wujie.springcloud.content.dao;

import com.wujie.springcloud.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:00:02
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
