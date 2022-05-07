package first_package;

public class first_class {
    int roll,NID;
    float cgpa;

    public first_class(int roll, int NID, float cgpa) {
        this.roll = roll;
        this.NID = NID;
        this.cgpa = cgpa;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
