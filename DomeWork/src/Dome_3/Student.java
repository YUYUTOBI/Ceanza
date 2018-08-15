package Dome_3;
public class Student {
    private String numder;
    private String name;
    private  double score;

    @Override
    public String toString() {
        return "Student{" +
                "numder='" + numder + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(String numder, String name, double score) {

        this.numder = numder;
        this.name = name;
        this.score = score;
    }

    public String getNumder() {

        return numder;
    }

    public void setNumder(String numder) {
        this.numder = numder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score<0){
            throw new Myanomly("分数不能为负数");
        }
        this.score = score;
    }
}
