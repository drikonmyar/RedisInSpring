package com.redis.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private String userId;
    private String name;
    private String email;
    private String mobile;

}
