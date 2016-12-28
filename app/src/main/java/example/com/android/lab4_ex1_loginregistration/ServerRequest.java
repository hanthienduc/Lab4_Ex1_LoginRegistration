package example.com.android.lab4_ex1_loginregistration;

/**
 * Created by Han on 28/12/2016.
 */

public class ServerRequest {
    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
