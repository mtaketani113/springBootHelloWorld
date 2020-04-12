package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author mtaketani
 *
 */
@Controller
public class HelloContoller {
	
	/**
	 * Hello World
	 * 
	 * @param mv
	 * @return
	 */
    @RequestMapping("/")
    public ModelAndView show(ModelAndView mv) {

        //set Form
        UserForm form = new UserForm();
        form.setName("mtaketani");
        mv.addObject("userForm", form);
        
        //show hello.html
        mv.setViewName("hello");

        return mv;
    }
}
