package org.spt.firstftl.Controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyGlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView customException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage());
        mv.setViewName("myerror");
        return mv;
    }

    @ModelAttribute(name="md")
    public Map<String,Object> mydata(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("age",99);
        map.put("gender","boy");
        return map;
    }

    @InitBinder("b")
    public void b(WebDataBinder b){
        b.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void a(WebDataBinder b){
        b.setFieldDefaultPrefix("a.");
    }
}
