package com.example.WebTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("home")
    public ModelAndView home(Data details)
    {   
        ModelAndView mv=new ModelAndView("home");
        mv.addObject("obj", details);
        if(details.ID!=0)
        {
            Template.registerUser(details);
        }
        return mv;
    }
    @RequestMapping("users")
    public ModelAndView test(Updatable update)
    {
        ModelAndView mv=new ModelAndView("users");
        if(update.name==null&&update.password==null)
        {
            Template.deleteRecords(update.ID);
        }
        Template.updateRecords(update);
        return mv;
    }
}
