public class GreetingWorld {
    public static void main(String[] args) {
        String s1 = "Distance Learning Centre";
        String s2 = "Computer science";
        String s3 = "DISTANCE LEARNING CENTRE";
        System.out.println(s1.equals(s3));
        // output : false
        System.out.println(s2.compareTo(s1));
        // output : -1
        System.out.println(s1.compareToIgnoreCase(s3));
        // output : 0
        System.out.println(s1.indexOf('e'));
        // output : 7
        System.out.println(s2.substring(9));
        // output : science
        System.out.println(s3.charAt(2));
        // output : S
    }
}
