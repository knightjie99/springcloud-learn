package com.wujie.springcloud.question.dao;

import com.wujie.springcloud.question.entity.QmsTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 10:34:43
 */
@Mapper
public interface QmsTypeDao extends BaseMapper<QmsTypeEntity> {
	
}
