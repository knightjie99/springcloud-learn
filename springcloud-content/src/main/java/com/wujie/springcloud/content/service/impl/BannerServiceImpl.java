package com.wujie.springcloud.content.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wujie.common.utils.PageUtils;
import com.wujie.common.utils.Query;

import com.wujie.springcloud.content.dao.BannerDao;
import com.wujie.springcloud.content.entity.BannerEntity;
import com.wujie.springcloud.content.service.BannerService;


@Service("bannerService")
public class BannerServiceImpl extends ServiceImpl<BannerDao, BannerEntity> implements BannerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BannerEntity> page = this.page(
                new Query<BannerEntity>().getPage(params),
                new QueryWrapper<BannerEntity>()
        );

        return new PageUtils(page);
    }

}