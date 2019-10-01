package com.luzhiqing.bamboo;

import com.luzhiqing.common.annotion.BambooApplication;
import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/9/30 23:22
 */
@BambooApplication
@EnableSwagger2
public class AuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class,args);
    }

}
