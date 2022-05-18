package enumEx.kiril;

public enum EnumKiril {
    START() {
        public void tetName1() {
            START.name = "Bruce";
            START.surname = "Lee";
        }

        public void tetName2() {
            START.name = "John";
            START.surname = "Rambo";
        }
    },
    FINISH() {
        public void tetName1() {
            START.name = "Bruce";
            START.surname = "Lee";
        }

        public void tetName2() {
            START.name = "John";
            START.surname = "Rambo";
        }
    };

    private  String name;
    private  String surname;

    abstract public void tetName1();

    abstract public void tetName2();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
