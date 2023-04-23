package pers.felix.springboottour.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Felix Lee
 * @date 2023/4/23 19:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimeRole extends Anime {
    private String animeRoleName;
    private String animeRoleAge;
    private char animeRoleSex;
}
