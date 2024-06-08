import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
public class FriendGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "FriendGroups")
    private List<User> users;

    @OneToMany(mappedBy = "FriendGroups")
    private List<Recommendation> Recommendations;
}
