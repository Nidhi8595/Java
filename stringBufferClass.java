// Mutable
// Should be used in cases where data needs to be changed frequently to save memory
// belongs to java.lang package

public class stringBufferClass {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hey");

        // .append() instead of concat()
        s.append("There");
        System.out.println(s);

        // .capacity() :- how many letters are allowed
        StringBuffer s1 = new StringBuffer(); // 16
        System.out.println("\nDefault capacity-> " + s1.capacity());
        StringBuffer s2 = new StringBuffer("Hello");
        System.out.println(s2 + ".capacity() -> " + s2.capacity());
        StringBuffer s3 = new StringBuffer(5);
        System.out.println("Set capacity-> " + s3.capacity());
        // increased as 16*2 + 2

        // .delete()
        StringBuffer s4 = new StringBuffer("LearningJava");
        System.out.println("\n" + s4 + ".delete(5,8) -> " + s4.delete(5, 8));

        // .deleteCharAt()
        System.out.println("\n" + s2 + ".deleteCharAt(2) -> " + s2.deleteCharAt(2));

        // .equals() :- method inherited from Object class
        StringBuffer s5 = new StringBuffer("abc");
        StringBuffer s6 = new StringBuffer("abc");
        StringBuffer s7 = new StringBuffer("def");
        StringBuffer s8 = s5.append("def");
        System.out.println("\n" + s5 + ".equals(" + s6 + ") -> " + s5.equals(s6)); // data doesn't matter
        System.out.println(s6 + ".equals(" + s7 + ") -> " + s6.equals(s7));
        System.out.println(s5 + ".equals(" + s8 + ") -> " + s5.equals(s8)); // refers to same position

        // .insert()
        System.out.println("\n" + s2 + ".insert(2,'l') -> " + s2.insert(2, "l"));
        System.out.println(s4 + ".insert(5,'ing') -> " + s4.insert(5, "ing"));

        // .replace()
        System.out.println("\n" + s4 + ".replace(5,8,'CodingIn') -> " + s4.replace(5, 8, "codingIn"));

        // .reverse()
        StringBuffer s9 = new StringBuffer("Java");
        System.out.println("\n" + s9 + ".reverse() -> " + s9.reverse());

        // .setCharAt()
        StringBuffer s10 = new StringBuffer("Hey");
        s10.setCharAt(1, 'y');
        System.out.println("\n" + s10 + ".setCharAt(2,'y') -> " + s10);

        // .trimToSize()
        s3 = s3.append("xyz"); // it's original capacity was 5
        s3.trimToSize();
        System.out.println(s3.capacity());

    }
}
