package pers.felix.springboottour.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Felix Lee
 * @date 2023/4/23 18:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anime extends Time {
    private String animeName;
    private String animeAuthor;
}
