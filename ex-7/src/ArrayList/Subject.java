package ArrayList;

public class Subject {

    private String name;
    private int scorePoint;

    public Subject (String name, int score){
        this.name =name ;
        this.scorePoint = score;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

}
