public class Student {

    // Encapsulation - private fields
    private String studentId;
    private String name;
    // int for numbers
    private int age;
    // subject
    private String major;

    // Constructor - Initializes student data.
    public Student(String studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
    }

        // Getters - to read student info

        public String getStudentId () {
            return studentId;
        }

        public String getName () {
            return name;
        }

        public int getAge () {
            return age;
        }

        public String getMajor () {
            return major;
        }

        // Setters - to update student information.
        // Set name if it isn't empty
        public void setName (String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name can't be empty.");
        }
        }

        // Updates age
        public void setAge ( int age) {
        // Add rule
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Error: The age must be a positive number!");
            }
        }


        public void setMajor (String major){
        if (major != null && !major.isEmpty()) {
            this.major = major;
        } else {
            System.out.println("Error: The major can't be empty!");
        }
        }
    }