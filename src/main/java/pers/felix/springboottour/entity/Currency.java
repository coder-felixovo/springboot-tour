package pers.felix.springboottour.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Felix Lee
 * @date 2023/4/24 14:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
    private String currencyId;
    private String currencyName;
}
