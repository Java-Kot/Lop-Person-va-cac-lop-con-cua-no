public class Run {
    public static void main(String[] args) {
        Person human = new Person("John","Somewhere out there !");
        System.out.println(human);

        Student student = new Student("Nguyen A", "C0818", "Java", 2018, 22500000);
        System.out.println(student);

        Staff staff = new Staff("Giao Vien B", "C0618", "Codegym", 3.8);
        System.out.println(staff);
    }
}
