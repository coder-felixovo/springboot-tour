package pers.felix.springboottour.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import pers.felix.springboottour.dao.AnimeDao;
import pers.felix.springboottour.entity.Anime;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Felix Lee
 * @date 2023/4/23 20:59
 */
@Service("animeDaoImpl")
public class AnimeDaoImpl implements AnimeDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Anime> selectAll() {
        String sql = "SELECT anime_id, anime_name, anime_author, create_time, update_time FROM anime";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Anime.class));
    }

    @Override
    public boolean addAnime(Anime anime) {
        String sql = "INSERT INTO anime(anime_name, anime_author) VALUES(?, ?)";
        Object[] params = {anime.getAnimeName(), anime.getAnimeAuthor()};
        return jdbcTemplate.update(sql, params) > 0;
    }

    @Override
    public boolean updateAnime(Anime anime) {
        return false;
    }

    @Override
    public boolean deleteAnimeById(int animeId) {
        return false;
    }
}
