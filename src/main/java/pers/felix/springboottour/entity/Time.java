package pers.felix.springboottour.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Felix Lee
 * @date 2023/4/23 20:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Time {
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
