package com.wujie.springcloud.question;

import com.wujie.springcloud.question.entity.TypeEntity;
import com.wujie.springcloud.question.service.TypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringcloudQuestionApplicationTests {

    @Autowired
    TypeService typeService;

    @Test
    void contextLoads() {
        TypeEntity typeEntity = new TypeEntity();
        typeEntity.setType("javaBasic");
        typeService.save(typeEntity);
        System.out.println("创建成功");
    }

}
