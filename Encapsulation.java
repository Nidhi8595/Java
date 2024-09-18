// variables of a class are hidden & accessed by only with methods :- data hiding

class Employee {

    int EmpId; // private :- data hiding

    // methods to access private variable
    public void setEmpId(int id) {

        EmpId = id;
    }

    public int getEmpId() {

        return EmpId;
    }
}

public class Encapsulation extends Employee {
    public static void main(String[] args) {

        Encapsulation e = new Encapsulation();

        e.setEmpId(101);
        int i = e.getEmpId();

        System.out.println("Employee ID -> " + i);
    }
}
