package com.itaem.crazy.shirodemo.modules.shiro.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author CrazyJay
 * @Date 2019/3/31 10:56
 * @Version 1.0
 */

@Getter
@Setter
@Entity
public class SysToken implements Serializable {

    /**
     * 用户ID
     */
    @Id
    private Integer userId;

    /**
     * token
     */
    private String token;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
