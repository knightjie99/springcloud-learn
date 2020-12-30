package com.wujie.springcloud.member.dao;

import com.wujie.springcloud.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:26:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
