package uz.jl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 15:00 (Friday)
 * @project: lombok_test
 */
public class ToStringTest {
    public static void main(String[] args) {
        Admin admin = new Admin(
                "john",
                "123",
                Arrays.asList("CREATE_USER", "DELETE_USER"));
        System.out.println("admin = " + admin);

    }
}

@NoArgsConstructor
@AllArgsConstructor
@ToString(
        includeFieldNames = false,
//        exclude = {"password","login"},
        of = {"login"}
)
class User {
    private String login;
    private String password;
}

@ToString(
        callSuper = true,
        includeFieldNames = false
)
@NoArgsConstructor
@AllArgsConstructor
class Admin extends User {
    private List<String> priviliges = new ArrayList<>();

    public Admin(String login, String password, List<String> priviliges) {
        super(login, password);
        this.priviliges = priviliges;
    }
}