package Student;

public class Subject {

    private int subjectId;
    private String subjectName;
    private int score;

    public Subject (){}
    public Subject (int subjectId, String subjectName, int score){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.score = score;
    }

    @Override
    public String toString(){
        return "-" + subjectName + " : " + score + "점";
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
