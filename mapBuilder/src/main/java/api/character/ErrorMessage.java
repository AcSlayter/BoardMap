package api.character;

public class ErrorMessage {

    public String getMessage() {
        return message;
    }

    public boolean isStatus() {
        return status;
    }

    private final String message;
    private final boolean status;

    public ErrorMessage(boolean b, String reason) {
        this.status = b;
        this.message = reason;
    }
}
