package com.tap5.hotelbooking.pages;

import com.tap5.hotelbooking.dal.CrudServiceDAO;
import com.tap5.hotelbooking.entities.User;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

/**
 * Created by Vitaliy on 08.12.2015.
 */
public class UserList {

    @Inject
    private CrudServiceDAO userDAO;

    @Property
    private User user;

    public List<User> getUsers() { return userDAO.findWithNamedQuery(user.ALL); }
}
