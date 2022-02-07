package com.example.springbootlogin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("alex@gmail.com");
        user.setPassword("alex");
        user.setFirstName("Alex");
        user.setLastName("Hebb");

        User savedUser = repo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

        Assertions.assertThat(existUser.getEmail()).isEqualTo(user.getEmail());

    }

    @Test
    public void testFindUserByEmail(){
        String email = "beka@gmail.com";
        User user = repo.findByEmail(email);

        Assertions.assertThat(user).isNotNull();
    }

}
