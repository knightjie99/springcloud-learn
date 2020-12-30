package com.wujie.springcloud.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujie.common.utils.PageUtils;
import com.wujie.springcloud.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:26:02
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

