package com.market.comtrollerTest;

import com.market.bean.User;
import com.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author shuaixiaoji
 * @Description: ${TODO}(这里用一句话描述这个类的作用)
 * @date 14-12-1 上午10:20
 */
@Controller
@RequestMapping(value = "/test")
public class Test {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex(HttpServletRequest request, HttpSession session, Model model){
        String userId = request.getParameter("userId");
        User u = userService.getUserById(userId);
        model.addAttribute("user",u);
        return "/test/hehe";
    }
}
