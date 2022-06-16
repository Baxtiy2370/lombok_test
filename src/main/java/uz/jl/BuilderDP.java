package uz.jl;

import lombok.AllArgsConstructor;

/**
 * @author: Elmurodov Javohir
 * @time: 03/06/22 16:06 (Friday)
 * @project: lombok_test
 */
@AllArgsConstructor
public class BuilderDP {
    private String field1;
    private String field2;
    private String field3;
    private String field4;

    public static void main(String[] args) {
//        BuilderDPBuilder builder = BuilderDP.builder();
//        builder.field1("kjsdhjbfjhsdf");
//        builder.field4("sd;gjldfhgdfksjbgvdf")
//                .field3("skfhjgksdgfsdkgfsdkjf");
//        BuilderDP obj = builder.qur();
        BuilderDP obj = BuilderDP.builder()
                .field1("213213")
                .build();

    }

    public static BuilderDPBuilder builder() {
        return new BuilderDPBuilder();
    }


    public static class BuilderDPBuilder {
        private String field1;
        private String field2;
        private String field3;
        private String field4;

        public BuilderDPBuilder field1(String field1) {
            this.field1 = field1;
            return this;

        }

        public BuilderDPBuilder field2(String field2) {
            this.field2 = field2;
            return this;
        }

        public BuilderDPBuilder field3(String field3) {
            this.field3 = field3;
            return this;
        }

        public BuilderDPBuilder field4(String field4) {
            this.field4 = field4;
            return this;
        }

        public BuilderDP build() {
            return new BuilderDP(field1, field2, field3, field4);
        }
    }


}
