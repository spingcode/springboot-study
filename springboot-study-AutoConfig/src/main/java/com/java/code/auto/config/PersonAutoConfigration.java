package com.java.code.auto.config;


import com.java.code.auto.component.Person;
import com.java.code.auto.properties.PersonProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zouw
 * @date Created in 4:02 PM 2019/5/13
 */
@Configuration
@EnableConfigurationProperties({PersonProperties.class})
public class PersonAutoConfigration {

    private PersonProperties personProperties;

    public PersonAutoConfigration(PersonProperties personProperties) {
        this.personProperties = personProperties;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setAge(personProperties.getAge());
        person.setName(personProperties.getName());
        person.setId(personProperties.getId());
        System.out.println("person:"+person);
        return person;
    }
}
