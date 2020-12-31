package com.wujie.springcloud.member.feign;

import com.wujie.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("springcloud-study")
public interface StudyTimeFeignService {

    @RequestMapping("study/studytime/member/list/test")
    public R getMemberStudyTimeListTest();
}
