package applysingleton;

import java.io.IOException;

public class UserController {
    private Logger logger = new Logger();

    public UserController() throws IOException {
    }

    public void login(String username, String password) throws IOException {
        logger.log(username + " logined!");
    }
}
