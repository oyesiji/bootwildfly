package bootwildfly;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abbey.UserRepository;
import com.abbey.entity.User;

@RestController
public class HelloWildFlyController {

  @Autowired
  private UserRepository userRepository;


  @RequestMapping("hello")
  public String sayHello() {
    return ("Hello, SpringBoot on Wildfly 1988");
  }


  @RequestMapping("hi")
  public String sayHi() {
    return ("Hello, SpringBoot on Wildfly 1988, say Hi" + new Date().toString());
  }



  @RequestMapping("seun")
  public String saySeun() {
    return ("Hello,Seun" + new Date().toString());
  }


  @RequestMapping("save")
  public String save() {

    User n = new User();
    n.setName("Jubril Siji");
    n.setEmail("oyesiji@gmail.com");
    userRepository.save(n);
    return "Saved";
  }



}
