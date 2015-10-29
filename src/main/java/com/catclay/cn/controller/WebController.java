package com.catclay.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by clay on 2015/10/23.
 */
@RequestMapping(value = "/web")
@Controller
public class WebController {

    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
    public String main(){
        System.out.println("click:/index.html");
        return "index";
    }

    @RequestMapping(value = "/blog-content.html", method = RequestMethod.GET)
    public String getBlogContent(){
        System.out.println("click:/blog-content.html");
        return "blog-content";
    }

    @RequestMapping(value = "/blog-list.html", method = RequestMethod.GET)
    public String getBlogList(){
        System.out.println("click: /blog-list.html");
        return "blog-list";
    }

    @RequestMapping(value = "/contact.html", method = RequestMethod.GET)
    public String getContact(){
        System.out.println("click: /contatc.html");
        return "contact";
    }

    @RequestMapping(value = "/about.html", method = RequestMethod.GET)
    public String getAbout(){
        System.out.println("click: /about.html");
        return "about";
    }
}
