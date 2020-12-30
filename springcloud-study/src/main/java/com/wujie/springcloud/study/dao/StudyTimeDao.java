package com.wujie.springcloud.study.dao;

import com.wujie.springcloud.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 18:13:51
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
