package BuilderLLD;

public class StudentBuilder {
    private String userName;
    private String pswd;
    private String email;
    private int age;
    private long phone;

    //constructor
    public StudentBuilder()
    {
        
    }

    //load the current studentBuilder object values and return the current object
    public StudentBuilder userName(String username)
    {
        this.userName = username;
        return this;
    }

    public StudentBuilder pswd(String pswd)
    {
        this.pswd = pswd;
        return this;
    }

    public StudentBuilder email(String email)
    {
        this.email = email;
        return this;
    }

    public StudentBuilder age(int age)
    {
        this.age = age;
        return this;
    }

    public StudentBuilder phone(long phone)
    {
        this.phone = phone;
        return this;
    }
 
    

    //calls constructor of Student
    public Student build() throws Exception
    {
        return new Student(this);
    }
    

    //getter methods, used inside student constructor to fetch the details
    public String getUserName() {
        return userName;
    }

    public String getPswd() {
        return pswd;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public long getPhone() {
        return phone;
    }
    
}