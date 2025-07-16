package creation.builder.m1;

import java.util.List;

public class Student {
    private int id;
    private int age;
    // 年级
    private int grade;
    private String name;
    // 院校
    private String college;
    // 所属教授
    private String profession;
    // 获得奖项
    private List<String> awards;

    private Student(int id, int age, int grade, String name, String college, String profession, List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", profession='" + profession + '\'' +
                ", awards=" + awards +
                '}';
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    // 定义内部类
    // 用于构建时暂存
    public static class StudentBuilder {
        private int id;
        private int age;
        private int grade;
        private String name;
        private String college;
        private String profession;
        private List<String> awards;

        public StudentBuilder id(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder college(String college) {
            this.college = college;
            return this;
        }

        public StudentBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public StudentBuilder awards(List<String> awards) {
            this.awards = awards;
            return this;
        }

        public Student build() {
            return new Student(this.id, this.age, this.grade, this.name, this.college, this.profession, this.awards);
        }
    }
}
