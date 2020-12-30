package com.wujie.springcloud.study.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wujie.common.utils.PageUtils;
import com.wujie.common.utils.Query;

import com.wujie.springcloud.study.dao.ViewLogDao;
import com.wujie.springcloud.study.entity.ViewLogEntity;
import com.wujie.springcloud.study.service.ViewLogService;


@Service("viewLogService")
public class ViewLogServiceImpl extends ServiceImpl<ViewLogDao, ViewLogEntity> implements ViewLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ViewLogEntity> page = this.page(
                new Query<ViewLogEntity>().getPage(params),
                new QueryWrapper<ViewLogEntity>()
        );

        return new PageUtils(page);
    }

}