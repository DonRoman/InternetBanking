package Banking;

import java.util.Date;

/**
 * Created by Don on 31.07.2016.
 */

public class Currency {
    private double course;
    private String name;
    private Date date = new Date();

    public Currency(String name, double course) {
        this.name = name;
        this.course = course;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Currency{" +
                " name='" + name + '\'' +
                " course=" + course +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (Double.compare(currency.course, course) != 0) return false;
        if (!name.equals(currency.name)) return false;
        return date.equals(currency.date);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(course);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}