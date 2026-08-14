
class AdditionApplication {

    public static void main(String[] args) {
        Addition al = new Addition();
        System.out.println(al.add(20, 30));
        System.out.println(al.add(10, 20, 30));
        System.out.println(al.add(20.5, 40.2));
        System.out.println(al.add(12, 23.2));
        System.out.println(al.add(12.2, 23));
        System.out.println(al.add(23, 45, 56.6));
        System.out.println(al.add(23.4, 45.5, 56.6));
        System.out.println(al.add(20, 44, 32.6));

    }
}
