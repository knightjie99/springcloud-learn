package com.wujie.springcloud.study.dao;

import com.wujie.springcloud.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 18:13:50
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
