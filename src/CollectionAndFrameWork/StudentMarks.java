package CollectionAndFrameWork;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
    private int math;
    private int physics;

    public StudentMarks(int math, int physics) {
        this.math = math;
        this.physics = physics;
    }

    public int getMath() {
        return math;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "math=" + math +
                ", physics=" + physics +
                '}';
    }


    @Override
    public int compareTo(StudentMarks o) {

       /* if(this.math > o.math){
            return -1
        }
        if(this.math < o.math){
            return 1;
        }
        if(this.math == o.math){
            return 0;
        }
        */


        return this.math - o.math;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentMarks)) return false;
        StudentMarks that = (StudentMarks) o;
        return getMath() == that.getMath() && getPhysics() == that.getPhysics();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMath(), getPhysics());
    }
}
