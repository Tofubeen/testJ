package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //웹 어플리케이션에서 /hello로 들어오면 이 메소드를 호출한다
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        //data 변수에 "hello!!" 를 담아서 hello 로 반환한다
        return "hello";
    }
}
