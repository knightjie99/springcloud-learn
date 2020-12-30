package com.wujie.springcloud.channel.dao;

import com.wujie.springcloud.channel.entity.ChannelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-渠道表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:07:59
 */
@Mapper
public interface ChannelDao extends BaseMapper<ChannelEntity> {
	
}
