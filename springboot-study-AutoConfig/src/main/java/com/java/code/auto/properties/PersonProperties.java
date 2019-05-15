package com.java.code.auto.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zouw
 * @date Created in 4:02 PM 2019/5/13
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {
    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
