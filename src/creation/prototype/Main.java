package creation.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("Lucas");
        Student student2 = (Student) student1.clone();

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.getName() == student2.getName());
    }
}
