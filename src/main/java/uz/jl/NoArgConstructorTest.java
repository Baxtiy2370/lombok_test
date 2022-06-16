package uz.jl;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 15:42 (Friday)
 * @project: lombok_test
 */
@NoArgsConstructor(access = AccessLevel.MODULE, staticName = "createObj")
public class NoArgConstructorTest {
    private String field;

    public void hello() {
        System.out.println("Hello Dummies");
    }
}
