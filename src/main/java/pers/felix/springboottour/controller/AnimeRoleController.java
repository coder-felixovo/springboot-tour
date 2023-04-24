package pers.felix.springboottour.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pers.felix.springboottour.entity.AnimeRole;
import pers.felix.springboottour.entity.ResponseResult;
import pers.felix.springboottour.mapper.AnimeRoleMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Felix Lee
 * @date 2023/4/24 13:03
 */
@RestController
public class AnimeRoleController {

    @Resource
    private AnimeRoleMapper animeRoleMapper;

    @GetMapping(path = "/get_anime_role")
    public Object getAnimeRole() {
        ResponseResult res = new ResponseResult();
        List<AnimeRole> animeRoleList = animeRoleMapper.selectAll();
        res.setCode(1);
        res.setMessage("获取动画角色成功");
        res.setData(animeRoleList);
        return res;
    }

    @PostMapping(path = "/add_anime_role")
    public Object addAnimeRole(@RequestBody AnimeRole animeRole) {
        ResponseResult res = new ResponseResult();
        int count = animeRoleMapper.addAnimeRole(animeRole);
        if (count > 0) {
            res.setCode(1);
            res.setMessage("添加动画角色成功");
            return res;
        } else {
            res.setCode(-1);
            res.setMessage("点击动画角色失败");
            return res;
        }
    }
}
