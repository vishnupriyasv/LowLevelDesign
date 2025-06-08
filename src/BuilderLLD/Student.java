package BuilderLLD;

public class Student{
    private String userName;
    private String pswd;
    private String email;
    private int age;
    private long phone;
    
    //only by passing student builder objet to student constructor can be called.
    public Student(StudentBuilder sh) throws Exception
    {
        if(sh.getUserName() == null){
            throw new Exception("UserName must not be null");
        }

        if (sh.getPswd() == null) {
            throw new Exception("Password must not be null or empty");
        }

        if (sh.getAge() < 18) {
            throw new Exception("Age must be at least 18");
        }

        this.userName = sh.getUserName();
        this.pswd = sh.getPswd();
        this.email = sh.getEmail();
        this.age = sh.getAge();
        this.phone = sh.getPhone();
    }

    public String toString()
    {
        return "User Name: " + userName + "\n" +
                "password: " + pswd + "\n" +
                "email: " + email + "\n" +
                "age : " + age + "\n" +
                "phone : " + phone + "\n";
    }
}