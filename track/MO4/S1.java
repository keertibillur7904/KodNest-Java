
public class S1 {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 4));
        System.out.println(str.indexOf("Nest"));
        System.out.println(str.lastIndexOf("Nest"));
        System.out.println(str.contains("Nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.endsWith("gies"));
        System.out.println(str.replace("Nest", "Nest"));
        System.out.println(str.trim());
        System.out.println(str.concat("Technologies"));
        System.out.println(str.isEmpty());
        System.out.println(str.equals("KodNest Technologies"));
        System.out.println(str.equalsIgnoreCase("KodNest Technologies"));
        System.out.println(str.compareTo("KodNest Technologies"));
        System.out.println(str.compareToIgnoreCase("KodNest Technologies"));
        System.out.println(str.substring(2, 4));

    }
}
