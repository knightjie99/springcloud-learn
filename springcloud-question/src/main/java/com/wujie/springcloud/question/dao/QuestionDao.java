package com.wujie.springcloud.question.dao;

import com.wujie.springcloud.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:17:00
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
