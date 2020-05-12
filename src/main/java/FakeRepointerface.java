import java.io.DataInput;
import java.io.IOException;
import java.rmi.server.UID;

public interface FakeRepointerface {

    int insertUser(UID id, User user);

    default void addUse(User user) {
        DataInput dataInput = null;
        try {
            UID id = UID.read(dataInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
