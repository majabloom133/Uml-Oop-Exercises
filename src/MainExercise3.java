public class MainExercise3 {

    public static void main(String[] args) {
        // Create a student (Maja, 29, studies java)
        Student s1 = new Student("S123", "Maja", 29, "Java");
        // Print info about student
        System.out.println("Student: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Major: " + s1.getMajor());
        // Change age with setter
        s1.setAge(30);
        // Print new age
        System.out.println("----------------");
        System.out.println("After birthday " + s1.getName() + " is now " + s1.getAge() + " years old. ");

        System.out.println("\n--- Testing Validation ---");
        // Try to set invalid age:
        s1.setAge(-5);
        System.out.println("Age after invalid update: " + s1.getAge());
    }
}
