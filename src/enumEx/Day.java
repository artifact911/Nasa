package enumEx;

//Filename: Day.java
public enum Day {
    MONDAY(1, "Понедельник"), TUESDAY(2, "Вторник"),
    WEDNESDAY(3, "Среда"), THURSDAY(4, "Четверг"),
    FRIDAY(5, "Пятница"), SATURDAY(6, "Суббота"), SUNDAY(7, "Воскресенье");

    private final int index;
    private final String rusName;


    Day(int index, String rusName) {
        this.index = index;
        this.rusName = rusName;
    }

    public int getIndex() {
        return index;
    }

    public String getRusName() {
        return rusName;
    }
}


enum Meal {
    // Each enum constant defines a constant-specific class body
    BREAKFAST(7, 30) { // (1)

        public double mealPrice(Day day) { // (2)
            double breakfastPrice = 10.50;
            if (day.equals(Day.SATURDAY) || day == Day.SUNDAY)
                breakfastPrice *= 1.5;
            return breakfastPrice;
        }

        public String toString() { // (3)
            return "Breakfast";
        }
    },

    LUNCH(12, 15) {
        public double mealPrice(Day day) { // (5)
            double lunchPrice = 20.50;
            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    lunchPrice *= 2.0;
            }
            return lunchPrice;
        }

        public String toString() {
            return "Lunch";
        }
    },

    DINNER(19, 45) {
        public double mealPrice(Day day) { // (6)
            double dinnerPrice = 25.50;
            if (day.compareTo(Day.SATURDAY) >= 0 && day.compareTo(Day.SUNDAY) <= 0)
                dinnerPrice *= 2.5;
            return dinnerPrice;
        }
    };


    // Abstract method implemented in constant-specific class bodies.
    abstract double mealPrice(Day day);

    // Enum constructor:
    Meal(int hh, int mm) {
        assert (hh >= 0 && hh <= 23) : "Illegal hour.";
        assert (mm >= 0 && mm <= 59) : "Illegal mins.";
        this.hh = hh;
        this.mm = mm;
    }

    // Instance fields: Time for the meal.
    private final int hh;
    private final int mm;

    // Instance methods:
    public int getHour() {
        return this.hh;
    }

    public int getMins() {
        return this.mm;
    }
}

