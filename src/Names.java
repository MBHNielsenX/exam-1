import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Names {
    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;

    public Names(String fullName) {
        this.fullName = fullName;
        String str[] = fullName.split(" ");
        if (str.length > 2) {
            this.firstName = str[0];
            this.middleName = str[1];
            this.lastName = str[2];
        } else {
            this.firstName = str[0];
            this.lastName = str[1];
        }
    }

    @Override
    public String toString() {
        return "Names{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
