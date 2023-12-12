package applysingleton;

import java.io.IOException;

public class OrderController {
    private Logger logger = new Logger();

    public OrderController() throws IOException {
        logger.log("Created : ");
    }
}
