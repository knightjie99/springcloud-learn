package com.wujie.springcloud.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wujie.common.utils.PageUtils;
import com.wujie.springcloud.content.entity.BannerEntity;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author wujie
 * @email 18565684220@163.com
 * @date 2020-12-29 17:00:02
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

