package creation.prototype;

public class Student implements Cloneable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student that = (Student) super.clone();

        // 针对成员变量也进行拷贝
        // 若不拷贝，则该成员变量还是同一个地址
        that.name = new String(this.getName());

        return that;
    }
}
