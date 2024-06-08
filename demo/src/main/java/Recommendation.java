import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

@Entity
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String link;
    private String message;
    private String platform;
    private int rating;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
