package practice2;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

public class StudentCollectionPrinter {
    public static void printStudentList(Collection<Student> studentList) {
        if (studentList == null || studentList.isEmpty()) {
            System.out.println("No student data found.");
            return;
        }

        // Print header row with field names
        Field[] fields = Student.class.getDeclaredFields();
        for (Field field : fields) {
            StudentField studentField = field.getAnnotation(StudentField.class);
            if (studentField != null) {
                System.out.print(studentField.value() + "\t");
            }
        }
        System.out.println();

        // Print data rows
        for (Student student : studentList) {
            for (Field field : fields) {
                StudentField studentField = field.getAnnotation(StudentField.class);
                if (studentField != null) {
                    try {
                        Object value = field.get(student);
                        System.out.print(value + "\t");
                    } catch (IllegalAccessException e) {
                        System.out.print("N/A\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
