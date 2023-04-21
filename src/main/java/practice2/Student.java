package practice2;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private String name;
    private int age;
    private String address;
    private Date birthdate;

    public void setDateOfBirth(Date parse) {
    }
}
