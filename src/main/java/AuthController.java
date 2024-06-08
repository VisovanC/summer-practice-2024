import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class  AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @PostMapping("/register")
    public String registerUser(@RequestBody UserDto userdto){
        User user = new User();
        user.setName(userdto.getName());
        user.setEmail(userdto.getEmail());
        user.setPassword(passwordEncoder.encode(userdto.getPassword()));
        userService.saveUser(user);
        return "Register succesful!";
    }
    @GetMapping("/login")
    public String login(){
        return "Please enter credentials";
    }


}
