package com.alibaba.cloud.solution.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description
 * @Author kaituozhesh
 * @Date 2020/4/2 8:37
 * @Version V1.0.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
}
