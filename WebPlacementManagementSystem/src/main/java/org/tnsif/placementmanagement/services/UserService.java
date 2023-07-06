package org.tnsif.placementmanagement.services;
import org.tnsif.placementmanagement.entities.User;

public interface UserService {
    User createUser(User user);
    User login(String username, String password);
    void logout();
}