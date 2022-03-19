package step.hw.meo;

public class Comission implements TestOfDoc, Comparable<Comission> {

    private Doctors[] arrayDocs;

    public Comission(Doctors[] arrayDocs) {
        this.arrayDocs = arrayDocs;
    }

    @Override
    public boolean test(Recruit recruit) {
        boolean test = false;

        for (Doctors arrayDoc : arrayDocs) {
            if (!arrayDoc.test(recruit)) {
                recruit.getTotalDiagnosis().append(arrayDoc.toString()).append('\n');
            }
        }
        for (Doctors arrayDoc : arrayDocs) {
            if (arrayDoc.test(recruit)) {
                test = true;
            } else {
                test = false;
                break;
            }
        }

        recruit.setValid(test);
        return recruit.isValid();
    }

    @Override
    public int compareTo(Comission o) {
        if (this.arrayDocs.length > o.getArrayDocs().length) {
            return 1;
        } else if (this.arrayDocs.length < o.getArrayDocs().length) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "" + arrayDocs.length;
    }

    public Doctors[] getArrayDocs() {
        return arrayDocs;
    }

    public void setArrayDocs(Doctors[] arrayDocs) {
        this.arrayDocs = arrayDocs;
    }
}
