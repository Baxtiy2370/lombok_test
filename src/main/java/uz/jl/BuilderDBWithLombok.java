package uz.jl;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 16:16 (Friday)
 * @project: lombok_test
 */

@Builder
@AllArgsConstructor
public class BuilderDBWithLombok {
    private String field1;
    private String field2;
    private String field3;
    private String field4;

    public static void main(String[] args) {
        BuilderDBWithLombok build = BuilderDBWithLombok.builder().build();


    }
}
