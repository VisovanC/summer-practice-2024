import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDB userDB;

    public User saveUser(User user) {
        return userDB.save(user);
    }

    public User findUserById(Long id) {
        return userDB.findById(id).orElse(null);
    }

    public User findUserByEmail(String email) {
        return userDB.findByEmail(email);
    }
}
