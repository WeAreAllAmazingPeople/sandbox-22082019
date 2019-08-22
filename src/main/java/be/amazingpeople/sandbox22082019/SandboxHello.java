package be.amazingpeople.sandbox22082019;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SandboxHello {
    @RequestMapping("/")
    @ResponseBody
    String beKind() {
        return "Hello everybody @ Sandbox 22/08/2019 \uD83C\uDF55 \uD83C\uDF55 \uD83C\uDF55";
    }
}