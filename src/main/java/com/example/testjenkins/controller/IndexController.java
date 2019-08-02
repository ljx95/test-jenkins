package com.example.testjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author LinJianXiong
 * @date 2019/8/2 14:26
 */
@RestController
public class IndexController {

    /**
     *功能描述
     * @author LJX
     * @date 2019/8/2  14:27
     * @param
     * @return java.lang.String
     */
    @RequestMapping("/test")
    public String test(){
        return "aaaabbbddd";
    }
}
