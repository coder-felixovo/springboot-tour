package pers.felix.springboottour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import pers.felix.springboottour.entity.Anime;

/**
 * @author Felix Lee
 * @date 2023/4/23 18:47
 */
@RestController
public class DemoController {

    @RequestMapping(path = "/test01", method = RequestMethod.GET)
    public Anime Test01() {
        Anime a3 = new Anime("铃芽之旅", "新海诚");
        return a3;
    }

    @GetMapping(value = "/test02")
    public Anime Test02() {
        Anime a2 = new Anime("天气之子", "新海诚");
        return a2;
    }

    @PostMapping(value = "/test03")
    public Anime Test03() {
        Anime a1 = new Anime("你的名字", "新海诚");
        return a1;
    }
}
