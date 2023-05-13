package NodeAndTree;

public class NotExternalException extends RuntimeException {
    public NotExternalException() {
        super("Node is not external");
    }
}