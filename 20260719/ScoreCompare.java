public class ScoreCompare implements Comparable<Student>{

    @Override
    public int compare(Student o1,Student o2) {
        return (int)(o1.score-o2.score);
    }
}
