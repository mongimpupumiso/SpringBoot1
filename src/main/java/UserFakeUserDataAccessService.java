import java.util.ArrayList;
import java.util.List;

public class UserFakeUserDataAccessService extends User {
    @Override
    public static final List< User > users;

    static {
        users = new ThreadLocal< List< User > >();
        for (User user : users = new ArrayList<>()) {

        }

    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
