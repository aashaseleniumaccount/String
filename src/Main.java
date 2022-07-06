public class Main {
    static String firstname="Tejansh";
    static String lastname="Satyadev";
    static String fullname;

    public static void main(String[] args) {
        String s="Teju";
        System.out.println(s.length());    //case1 to find length of string//
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        int len=s.length();        //case2 to find length of string
        System.out.println(len);    //     by initilizing                  //
        System.out.println(s.contains("Teju"));
        //fullname=firstname+lastname;
        fullname=firstname.concat(lastname);
        System.out.println(fullname);
        System.out.println("full name of the string is:"+fullname);
        String s1="My Name is Siva";
        String s2="My Name is Siva";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3="World's Largest Bird";
        String s4="World's largest Bird";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s1.indexOf("Siva"));
        System.out.println(s1.indexOf('v'));
        System.out.println(s1.indexOf('v',11));
        System.out.println(s1.substring(11));
        System.out.println(s1.substring(11,14));
        int position=s1.indexOf('v');
        System.out.println(position);
        int startposition=s1.indexOf("Siva");

        int endposition=s1.indexOf('v',startposition);
        //System.out.println(s1.substring(startposition));

        System.out.println(s1.substring(startposition,endposition+2));

    }
}