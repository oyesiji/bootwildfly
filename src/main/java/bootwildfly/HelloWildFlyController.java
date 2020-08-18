package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


  @RequestMapping("hello")
  public String sayHello() {
    return ("Hello, SpringBoot on Wildfly 1988");
  }


  @RequestMapping("hi")
  public String sayHi() {
    return ("Hello, SpringBoot on Wildfly 1988, say Hi");
  }
}
