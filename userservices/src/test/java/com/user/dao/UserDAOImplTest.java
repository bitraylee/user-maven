package com.user.dao;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.user.model.User;

//import org.junit.Before;

public class UserDAOImplTest {

    @Test
    public void CerateShouldCreateAUser() {
        UserDAO dao = new UserDAOImpl();
        dao.create(new User(1, "Anshu", "anshu@gmail.com"));

        User result = dao.read(1);
        assertNotNull(result);
        assertEquals("Anshu", result.getName());
    }
}
