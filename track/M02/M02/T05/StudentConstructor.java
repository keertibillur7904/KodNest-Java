
class StudentConstructor {

    public static void main(String[] args) {
        StudentC sc1 = new StudentC();
        sc1.display();
        StudentC sc2 = new StudentC("ram", 20, 6.0);
        sc2.display();
        StudentC sc3 = new StudentC("sham");
        sc3.display();

    }
}
