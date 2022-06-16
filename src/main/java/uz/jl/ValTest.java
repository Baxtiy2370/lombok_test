package uz.jl;

import lombok.*;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 14:48 (Friday)
 * @project: lombok_test
 */


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
public class ValTest {
    private String field1;

    public static void main(String[] args) {
        val name = new String("My Name");
    }
}
