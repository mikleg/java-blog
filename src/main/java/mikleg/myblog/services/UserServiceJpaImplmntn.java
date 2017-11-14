package mikleg.myblog.services;

import mikleg.myblog.models.User;
import mikleg.myblog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public class UserServiceJpaImplmntn implements UserService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public List<User> findAll() {
        return this.userRepo.findAll();
    }
    @Override
    public User findById(Integer id) {
        return this.userRepo.findOne(id);
    }
    @Override
    public User create(User user) {
        return this.userRepo.save(user);
    }
    @Override
    public User edit(User user) {
        return this.userRepo.save(user);
    }
    @Override
    public void deleteById(Integer id) {
        this.userRepo.delete(id);
    }
}