package com.gc_project.project;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.gc_project.User;
import com.gc_project.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Test
    public void testCreateUser() {
        // Membuat objek User baru
        User user = new User();
        user.setEmail("nur.afni38271@gmail.com");
        user.setPassword("sayangcaca");
        user.setFirstName("Muliasa");
        user.setLastName("Insani");

        // Menyimpan user ke database
        User savedUser = repo.save(user);

        // Mendapatkan user yang disimpan menggunakan ID
        User existUser = repo.findById(savedUser.getId()).orElse(null);

        // Memastikan email user yang disimpan sesuai
        assertThat(existUser).isNotNull();
        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
    
    @Test
    public void testFindUserByEmail() {
    	String email = "@gmail.com";
    	
    	User user = repo.findByEmail(email);
    	
    	assertThat(user).isNotNull();
    }
}
