package mikleg.myblog.services;

import mikleg.myblog.models.User;

import java.util.List;
public interface UserService {
    List<User> findAll();
    User findById(Integer id);
    User create(User user);
    User edit(User user);
    void deleteById(Integer id);
}
