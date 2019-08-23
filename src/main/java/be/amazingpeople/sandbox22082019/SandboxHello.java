package be.amazingpeople.sandbox22082019;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SandboxHello {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    @ResponseBody
    String beKind() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS sandbox");
        jdbcTemplate.execute("CREATE TABLE sandbox (id integer , name string)");

        jdbcTemplate.execute("insert into sandbox values(1, 'sandbox 20190822')");

        return "Hello everybody @ Sandbox 22/08/2019 \uD83C\uDF55 \uD83C\uDF55 \uD83C\uDF55";
    }
}