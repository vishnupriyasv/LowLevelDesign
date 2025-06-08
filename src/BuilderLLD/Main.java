package BuilderLLD;

public class Main {
    public static void main(String[] args) throws Exception{
        // Reusable builder
        Student.Builder sb = new Student.Builder();

        // First student
        Student s1 = sb.userName("priya").pswd("pasword@123").age(23).build();
        System.out.println("Student 1:\n" + s1);

        //irst student updatin fields
        s1 = sb.email("priya@gmail.com").build();
        System.out.println("Student 1:\n" + s1);

        // Reuse same builder and just set email
        Student s2 = sb.email("priya@gmail.com").build();
        System.out.println("Student 2:\n" + s2);

        // Update some fields for a new student
        Student s3 = sb.userName("vp").age(24).build();
        System.out.println("Student 3:\n" + s3);

        // Fresh new builder for independent student
        Student s4 = new Student.Builder()
                .userName("student3")
                .pswd("password456")
                .age(25)
                .build();
        System.out.println("Student 4:\n" + s4);
    }
}
