package com.demo.pratice.features;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.*;
public class  PopupFormController{
//TODO:added for feature-102
private static final Long SessionId=new Random().getLong();
private static final String FORM_PAGE_NAME="sign_in";
@GetMapping("/form")
public String getSignInForm(){
//TODO:Added for branch feature-103
return FORM_PAGE_NAME;
}


}
