package BuilderLLD;

public class Main {
    public static void main(String[] args) throws Exception{
        // Create a single StudentBuilder instance
        StudentBuilder sb = new StudentBuilder();

        // Build the first Student with mandatory fields: username, password, and age
        Student s = sb.userName("priya").pswd("pasword@123").age(23).build();
        System.out.println(s.toString());

        // Update the same builder with email and build again.
        s = sb.email("priya@gmail.com").build();
        System.out.println(s.toString());
        
        // Using the same builder instance, build another Student object
        // Notice the builder still holds previous values like email unless overwritten
        Student s2 = sb.userName("vp").pswd("pasword@123").age(24).build();
        System.out.println(s2.toString());


        // Create a completely new StudentBuilder instance to start fresh
        Student s3 = new StudentBuilder()
                .userName("student3")
                .pswd("password456")
                .age(25)
                .build();
         System.out.println(s3.toString());
    }
}
