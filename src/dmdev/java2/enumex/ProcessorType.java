package dmdev.java2.enumex;

public enum ProcessorType implements Describable {
    BIT_32("bit-32") {
        // переопределил в общем enum
//        @Override
//        public String getDescription() {
//            return "bit-32 description";
//        }
    },
    BIT_64("bit-64") {
        // переопределил в общем enum
//        @Override
//        public String getDescription() {
//            return "bit-64 description";
//        }
    };

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }

    public String getName() {
        return name;
    }
}
