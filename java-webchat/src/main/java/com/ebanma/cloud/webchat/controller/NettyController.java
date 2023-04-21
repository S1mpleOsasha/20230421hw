package com.ebanma.cloud.webchat.controller;/**
 * @author 盛鑫
 * @date 2023/04/21
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 盛鑫
 * @version $ Id: NettyController, v 0.1 2023/04/21 16:19 盛鑫 Exp $
 */
@Controller
public class NettyController {
    @RequestMapping("/chat")
    public ModelAndView index() {
        return new ModelAndView("chat");
    }
}
