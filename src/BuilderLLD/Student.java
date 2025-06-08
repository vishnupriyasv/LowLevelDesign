package BuilderLLD;

public class Student {
    private String userName;
    private String pswd;
    private String email;
    private int age;
    private long phone;

    // private constructor so only Builder can create objects
    private Student(Builder builder) throws Exception {
        if (builder.userName == null) {
            throw new Exception("UserName must not be null");
        }

        if (builder.pswd == null) {
            throw new Exception("Password must not be null or empty");
        }

        if (builder.age < 18) {
            throw new Exception("Age must be at least 18");
        }

        this.userName = builder.userName;
        this.pswd = builder.pswd;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public String toString() {
        return "User Name: " + userName + "\n" +
               "Password: " + pswd + "\n" +
               "Email: " + email + "\n" +
               "Age : " + age + "\n" +
               "Phone : " + phone + "\n";
    }

    // 💡 Static nested Builder class
    public static class Builder {
        private String userName;
        private String pswd;
        private String email;
        private int age;
        private long phone;

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder pswd(String pswd) {
            this.pswd = pswd;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(long phone) {
            this.phone = phone;
            return this;
        }

        public Student build() throws Exception {
            return new Student(this);
        }
    }
}