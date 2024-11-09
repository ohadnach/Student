public class Student {
    private String name;
    private int math;
    private int english;
    private int hebrew;

    public Student(String name, int math, int english, int hebrew) {
        this.name = name;
        this.math = math;
        this.english = english;
        this.hebrew = hebrew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getHebrew() {
        return hebrew;
    }

    public void setHebrew(int hebrew) {
        this.hebrew = hebrew;
    }

    public double avg() {
        return (this.math + this.english + this.hebrew) / 3.0;
    }

    public String toString() {
        return "grades of the student " + this.name + ": Math=" + this.math + ", English=" + this.english + ", Hebrew="
                + this.hebrew;
    }

}
