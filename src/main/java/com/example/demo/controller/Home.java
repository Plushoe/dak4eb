package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Home {
  
  @GetMapping("/")
  public String home() {return "index";}
}
