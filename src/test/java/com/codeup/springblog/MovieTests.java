package com.codeup.springblog;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.MovieRepository;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.servlet.http.HttpSession;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertNotNull;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MovieTests {

    @Autowired
    private MovieRepository movieDao;
    @Autowired
    private UserRepository userDao;

    @Autowired
    private PasswordEncoder pen;

    @Autowired
    private MockMvc mvc;

    private User testUser;

    private HttpSession session;


    private void setUpTestUser() {
        this.testUser = userDao.findByUsername("testUser");
        if (testUser == null) {
            testUser = new User();
            testUser.setEmail("test@email.com");
            testUser.setPassword(pen.encode("password"));
            testUser.setUsername("testUser");
            this.testUser = userDao.save(testUser);
        }
    }

    private void setUpSession() throws Exception {
        this.session = mvc.perform(post("/login").with(csrf()).param("username", testUser.getUsername()).param("password", "password"))
                .andExpect(status().isFound())
                .andReturn()
                .getRequest()
                .getSession();
    }

    @Before // runs before every test
    public void setUp() throws Exception {
        setUpTestUser();
        setUpSession();
    }

    @Test // ensures that  the session is setup and that the mvc mock is setup.
    public void testContext() {
        assertNotNull(mvc);
        assertNotNull(session);
    }

    // test post creation
    @Test
    public void testMovieCreation() throws Exception {

    }

    // test post show
    @Test
    public void testMovieShow() throws Exception {

    }

    @Test
    // test view single post
    public void testMovieIndex() throws Exception {

    }


    // test post edit
    @Test
    public void testMovieEdit() throws Exception {



    }

    // test post delete
    @Test
    public void testMovieDelete() throws Exception {

    }

}
