package Homework08;
import fmi.informatics.extending.Student;
import fmi.informatics.functional.MySimpleInterface2;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StudentData {


    public static void testStudentInterface() {

        testFunction((p1, p2) -> p1 + p2);
}

    public static void testFunction(MySimpleInterface2 msi2) {
        String data = msi2.concatenate("test01 ", "test02");
        System.out.println(data);
    }

    public static  void testSortingData() {

        List<Student> Students =
                Arrays.asList(
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make());
        Students.sort((a, b) -> b.getSpeciality().compareTo(a.getSpeciality()));
        System.out.println(Students);
    }
        public static  void testSortingDataAscending() {

            List<Student> Students =
                    Arrays.asList(
                            Student.StudentGenerator.make(),
                            Student.StudentGenerator.make(),
                            Student.StudentGenerator.make(),
                            Student.StudentGenerator.make()
                    );

            Students.sort((b, a) -> a.getSpeciality().compareTo(b.getSpeciality()));
            System.out.println(Students);
        }

    }
