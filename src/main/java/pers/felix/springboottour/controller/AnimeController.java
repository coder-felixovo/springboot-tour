package pers.felix.springboottour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.felix.springboottour.dao.impl.AnimeDaoImpl;
import pers.felix.springboottour.entity.Anime;
import pers.felix.springboottour.entity.ResponseResult;

import java.util.List;

/**
 * @author Felix Lee
 * @date 2023/4/23 21:28
 */
@RestController
public class AnimeController {

    @Autowired
    private AnimeDaoImpl animeDao;

    @RequestMapping(path = "/get_anime", method = RequestMethod.GET)
    public ResponseResult getAnime() {
        ResponseResult res = new ResponseResult();
        List<Anime> animeList = animeDao.selectAll();
        System.out.println(animeList);
        res.setCode(1);
        res.setMessage("查询动画列表成功");
        res.setData(animeList);
        return res;
    }

    @PostMapping(path = "/add_anime")
    public Object addAnime(@RequestBody Anime anime) {
        ResponseResult res = new ResponseResult();
        boolean isAdd = animeDao.addAnime(anime);
        if (isAdd) {
            res.setCode(1);
            res.setMessage("添加动画记录成功");
            res.setData(anime);
            return res;
        } else {
            res.setCode(-1);
            res.setMessage("添加动画记录失败");
            res.setData(anime);
            return res;
        }
    }
}
