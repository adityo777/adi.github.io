package id.portfolio.adityoportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class main_portfolio {

    @RequestMapping("")
    public String portfolio(HttpServletRequest servlet){
        return "index.html";
    }

}
