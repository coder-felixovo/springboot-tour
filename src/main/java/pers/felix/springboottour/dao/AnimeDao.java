package pers.felix.springboottour.dao;

import pers.felix.springboottour.entity.Anime;

import java.util.List;

public interface AnimeDao {
    List<Anime> selectAll();
    boolean addAnime(Anime anime);
    boolean updateAnime(Anime anime);
    boolean deleteAnimeById(int animeId);
}
