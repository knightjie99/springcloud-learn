package com.wujie.springcloud.channel.dao;

import com.wujie.springcloud.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:07:59
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
