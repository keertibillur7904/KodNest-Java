
class StudentC {

    String name;
    int age;
    double height;

    StudentC() {
        name = "Anu";
        age = 19;
        height = 4.9;
    }

    StudentC(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    StudentC(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
