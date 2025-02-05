package wednesday;

import java.util.Optional;

interface UserService {
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }

    public String getPersonalizedMessage(String name) {
        return getUser(name)
                .map(user -> "Welcome, " + user + "!")
                .orElse(getWelcomeMessage());
    }
}

public class UserServiceExample {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        System.out.println(userService.getPersonalizedMessage("Gagan"));  
        System.out.println(userService.getPersonalizedMessage(null));     
    }
}
