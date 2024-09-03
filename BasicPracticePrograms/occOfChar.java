public class occOfChar {
    public static void main(String[] args) {
        String s = "Java is a java with java in it";

        int c = s.length();
        System.out.println(c);
        int cAfterRemove = s.replace("J", "").length();
        System.out.println(cAfterRemove);
        int occ = c-cAfterRemove;
        System.out.println(occ);
        System.out.println("The occurences of j are "+occ);
    }
}
