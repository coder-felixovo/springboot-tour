package pers.felix.springboottour.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.felix.springboottour.entity.AnimeRole;

import java.util.List;

@Mapper
public interface AnimeRoleMapper {

    @Select("SELECT anime_role_id, anime_role_name, anime_role_age, anime_role_sex, create_time, update_time FROM anime_role")
    List<AnimeRole> selectAll();

    @Insert("INSERT INTO anime_role(anime_role_name) VALUES(#{animeRoleName})")
    int addAnimeRole(AnimeRole animeRole);
}
