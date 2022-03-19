package step.hw.meo;

public class Recruit implements Comparable<Recruit>, HaveID {
    private static Integer numId = 0;
    private int id;

    private String firstName;
    private String middleName;
    private String secondName;
    private Double weigh;
    private Integer height;
    private boolean valid = false;

    private String diagnosis;
    private int implantCount;
    private boolean flatFeet;
    private boolean fracture;
    private double cardiogram;
    private double visionCoeff;

    private StringBuilder totalDiagnosis = new StringBuilder();


    public Recruit(String firstName, String middleName, String secondName, String diagnosis,
                   int implantCount, boolean flatFeet, boolean fracture, double cardiogram, double visionCoeff,
                   double weigh, int height) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        this.diagnosis = diagnosis;
        this.implantCount = implantCount;
        this.flatFeet = flatFeet;
        this.fracture = fracture;
        this.cardiogram = cardiogram;
        this.visionCoeff = visionCoeff;
        this.weigh = weigh;
        this.height = height;
        this.id = numId++;
    }

    @Override
    public String toString() {
        if (valid) {
            return "Recruit " + firstName + " " + secondName + " " + middleName + " fit for service." + (weigh + height)
                    + " " + getID();
        } else {
            return "Recruit " + firstName + " " + secondName + " " + middleName + " unfit for service " +
                    "and has diagnosis:" + '\n' + getTotalDiagnosis();
        }
    }

    @Override
    public int compareTo(Recruit o) {
        if (this.weigh + this.height > o.getWeigh() + o.getHeight()) {
            return 1;
        } else if (this.weigh + this.height < o.getWeigh() + o.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int getID() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public void setImplantCount(int implantCount) {
        this.implantCount = implantCount;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public void setFlatFeet(boolean flatFeet) {
        this.flatFeet = flatFeet;
    }

    public boolean isFracture() {
        return fracture;
    }

    public void setFracture(boolean fracture) {
        this.fracture = fracture;
    }

    public double getCardiogram() {
        return cardiogram;
    }

    public void setCardiogram(double cardiogram) {
        this.cardiogram = cardiogram;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public void setVisionCoeff(double visionCoeff) {
        this.visionCoeff = visionCoeff;
    }

    public static void setNumId(Integer numId) {
        Recruit.numId = numId;
    }

    public StringBuilder getTotalDiagnosis() {
        return totalDiagnosis;
    }

    public void setTotalDiagnosis(StringBuilder totalDiagnosis) {
        this.totalDiagnosis = totalDiagnosis;
    }

    public Double getWeigh() {
        return weigh;
    }

    public void setWeigh(Double weigh) {
        this.weigh = weigh;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
