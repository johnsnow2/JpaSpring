package ua.danni.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Artem on 24.04.2016.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        return "menu";
    }



}