import java.util.Objects;

public class CourseSlot {
    private int period;
    private int course_offering_id;

    public CourseSlot(int period, int course_offering_id) {
        this.period = period;
        this.course_offering_id = course_offering_id;
    }

    public int getPeriod() {
        return period;
    }

    public int getCourse_offering_id() {
        return course_offering_id;
    }


    // some stuff I have to put in order to use this in a set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseSlot)) return false;
        CourseSlot other = (CourseSlot) o;
        return period == other.period && course_offering_id == other.course_offering_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, course_offering_id);
    }

}
