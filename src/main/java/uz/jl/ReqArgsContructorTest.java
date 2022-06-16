package uz.jl;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.With;


/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 15:47 (Friday)
 * @project: lombok_test
 */

@RequiredArgsConstructor
public class ReqArgsContructorTest {
    private final String field1;
    @With(AccessLevel.MODULE)
    final String field2;
    @NonNull
    private String field3;

    public static void main(String[] args) {
        ReqArgsContructorTest reqArgsContructorTest = new ReqArgsContructorTest("123", "123", "123");
    }
}
