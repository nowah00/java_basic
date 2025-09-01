package practice08_stream.pratice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class People implements Comparable<People> {
    private String name;
    private String dept;
    private int salary;

    @Override
    public int compareTo(People o) {
        return Integer.compare(this.salary, o.salary);
    }
}
