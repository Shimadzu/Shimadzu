package com.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shuaixiaoji
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 14-12-1 上午10:20
 */
@Controller
@RequestMapping(value = "/test")
public class Test {
        @RequestMapping(value = "/index", method = RequestMethod.GET)
        public String getIndex(){

             return "test/index";
        }
}
