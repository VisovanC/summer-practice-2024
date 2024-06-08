import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDB extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
