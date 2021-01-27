package com.demo.pratice.features;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.*;
public class  PopupFormController{

private static final String FORM_PAGE_NAME="sign_in";


@GetMapping("/form")
public String getSignInForm(){
//TODO:Added for branch feature-103
return FORM_PAGE_NAME;
}

}
