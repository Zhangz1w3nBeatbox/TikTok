package com.zzw.testController;

import com.zzw.grace.result.GraceJSONResult;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class testControllor {


    @GetMapping("/test")
    public Object test(){
        return GraceJSONResult.ok("Hello,Word!");
    }

    @GetMapping("/hello")
    public String tt(){
        return "zryiou";
    }

    @GetMapping("/cal")
    public Integer cal(@PathVariable Integer a){
        return a+1;
    }

    public static void main(String[] args) {
        char c = '+';
        boolean b = c < '(';

        System.out.println(b);
    }

}
