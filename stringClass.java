import java.util.*;

public class stringClass {

    void Equal(stringClass obj) {
        System.out.println(this == obj); // since 'this' refers to current object
    }

    public static void main(String[] args) {

        // .equals()
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2)); // value comparison
        System.out.println(s1 == s2); // reference comparison i.e referencing to the same literal in SCP
        // 2nd case
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4); // false since in this case s3 and s4 will refer to diff. objects of string
        // class in the Heap memory

        stringClass obj = new stringClass();
        obj.Equal(obj);

        // various Constructors
        // 1st
        String s5 = "first"; // only one object will be created in SCP not in Heap mem.

        // 2nd
        String s6 = new String("second"); // one in Heap mem. & second in SCP

        // 3rd

        // .length()
        String s11 = "second method of String class";
        System.out.println("\n" + s11 + " has length -> " + s11.length()); // counts the characters and spaces

        // .isEmpty()
        String s12 = "";
        String s13 = "third method of String class";
        System.out.println("\n" + s12 + " is Empty String -> " + s12.isEmpty());
        System.out.println(s13 + " is Empty String -> " + s13.isEmpty());

        // .trim()
        String s14 = "   fourth method of String class    ";
        System.out.println("\nBefore trim() -> " + s14 + "  & length of string -> " + s14.length());
        s14 = s14.trim();
        System.out.println("After trim() -> " + s14 + "  & length of string -> " + s14.length()); // only remove leading
        // and trailing spaces having unicode:- u0020

        String s15 = "   using trim and length() together";
        System.out.println(s15.trim().length());
        // System.out.println(s15.length().trim()); :- not valid

        // .equalsIgnoreCase()
        String s16 = "abc";
        String s17 = "ABC";
        System.out.println("\n" + s16 + ".equalsIgnoreCase(" + s17 + ") -> " + s16.equalsIgnoreCase(s17));

        // .compareTo()
        String s18 = "A";
        String s19 = "A";
        String s20 = "Z";
        System.out.println("\n" + s18 + ".compareTo(" + s19 + ") -> " + s18.compareTo(s19)); // firstly both strings are
        // converted into unicode values & then compared based on the diff. in that
        // value
        // i.e. s18-s19
        System.out.println(s19 + ".compareTo(" + s20 + ") -> " + s19.compareTo(s20));
        System.out.println(s20 + ".compareTo(" + s19 + ") -> " + s20.compareTo(s19));

        // .compareToIgnoreCase()
        String s21 = "a";
        String s22 = "A";
        String s23 = "Z";
        System.out.println("\n" + s21 + ".compareToIgnoreCase(" + s22 + ") -> " + s21.compareToIgnoreCase(s22));
        System.out.println(s21 + ".compareToIgnoreCase(" + s23 + ") -> " + s21.compareToIgnoreCase(s23));

        // .concat()
        String s24 = "Learning";
        String s25 = "Java";
        System.out.println("\n" + s24 + s25);
        System.out.println("Hello" + 10);
        System.out.println(s24 + s25 + 10);
        System.out.println("Hello" + 10 + 20);
        System.out.println(10 + 20 + "Hello"); // firstly addition then Concatenation
        System.out.println(s24.concat(s25));

        // .join() :- static
        String s26 = String.join(" - ", s24, s25);
        System.out.println("String.join(' - '," + s24 + " , " + s25 + " returns -> " + s26); // called in static way
        // using String method

        // .substring()
        String s27 = "using the substring method of String class";
        System.out.println(s27.substring(10, 18));
        System.out.println(s27.substring(10));

        // .replace()
        String s28 = "Old String";
        String s29 = "New";
        System.out.println("\n" + s28 + ".replace('Old','" + s29 + "') returns -> " + s28.replace("Old", s29));

        // .replaceFirst()
        String s30 = "Old String having Old characters";
        System.out
                .println("\n" + s30 + ".replaceFirst('Old','" + s29 + "') returns -> " + s30.replaceFirst("Old", s29));

        // .replaceAll()
        System.out
                .println("\n" + s30 + ".replaceAll('Old','" + s29 + "') returns -> " + s30.replaceAll("Old", s29));
        // we can provide Regular Expression which will terminate the string at the
        // replacing position
        System.out
                .println(s30 + ".replaceAll('Old.*','" + s29 + "') returns -> " + s30.replaceAll("Old.*", s29));

        // .indexOf()
        String s31 = "Hello";
        System.out.println("\n" + s31 + ".indexOf('l') returns -> " + s31.indexOf('l')); // returns first occurrence
        // If not present, returns -1
        System.out.println(s31 + ".indexOf('n') returns -> " + s31.indexOf('n'));
        // can pass string also
        String s32 = "Hey there";
        System.out.println(s32 + ".indexOf('there') returns -> " + s32.indexOf("there"));

        // .lastIndexOf()
        System.out.println("\n" + s31 + ".lastIndexOf('l') returns -> " + s31.lastIndexOf('l')); // last

        // .charAt()
        System.out.println("\n" + s31 + ".charAt(3) returns -> " + s31.charAt(3));

        // .contains()
        String s33 = "Java";
        System.out.println("\n" + s33 + ".contains('va') returns -> " + s33.contains("va"));
        System.out.println(s33 + ".contains('i') returns -> " + s33.contains("i"));

        // .startsWith()
        String s34 = "Good morning";
        System.out.println("\n" + s34 + ".startsWith('Good') returns -> " + s34.startsWith("Good"));
        System.out.println(s34 + ".startsWith('morning') returns -> " + s34.startsWith("morning"));

        // .endsWith()
        System.out.println("\n" + s34 + ".endsWith('Good') returns -> " + s34.endsWith("Good"));
        System.out.println(s34 + ".endsWith('morning') returns -> " + s34.endsWith("morning"));

        // .toUpperCase()
        String s35 = s33.toUpperCase();
        System.out.println("\n" + s33 + ".toUpperCase() returns -> " + s35);

        // .toLowerCase()
        System.out.println("\n" + s35 + ".toLowerCase() returns -> " + s35.toLowerCase());

        // .valueOf() :- static
        int i = 10;
        double d = 1.5;
        // converts every argument into string
        String s36 = String.valueOf(i);
        System.out.println("\nString.valueOf(" + i + ") returns -> " + s36 + " which is a string now");
        System.out.println("String.valueOf(" + d + ") returns -> " + String.valueOf(d));

        // .toCharArray() :- converts strings into charArray
        String s37 = "Good noon";
        // System.out.println("\n" + s37 + ".toCharArray() returns -> " +
        // s37.toCharArray()); // error
        char[] c = s37.toCharArray();
        System.out.println("\nThe length of char[] returned by " + s37 + ".toCharArray() returns -> ");
        System.out.println(c.length);

    }

}
