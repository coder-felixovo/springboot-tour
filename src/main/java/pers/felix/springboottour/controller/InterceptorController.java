package pers.felix.springboottour.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Felix
 * @date 2023-05-06 19:39:47
 */
@RestController
@RequestMapping("/interceptor")
public class InterceptorController {

    @GetMapping("/demo1")
    public void interceptorDemo1() {
        System.out.println("/interceptor/demo1");
    }
}
