class Emp implements Cloneable{
   int empId;
   String name;
   public Emp(int id, String name){
        this.empId = id;
        this.name = name;
        System.out.println("Emp class constructor");
   }
   Emp(Emp e){
       System.out.println("Emp Copy constructor is called");
       empId = e.empId;
       name = e.name;
   }
   public Object clone() throws CloneNotSupportedException{
       return super.clone();
   }
}
class Stud extends Emp implements Cloneable {
    Stud(int id, String name) {
        super(id, name);
        System.out.println("Stud class constructor");
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
public class Q5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Stud st = new Stud(1,"Nitin");
        Stud st2 = (Stud)st.clone();
        System.out.println(st.empId + ": " + st.name);
        System.out.println(st2.empId + ": " + st2.name);

        Emp e1 = new Emp(101,"harry");
        Emp e2 = new Emp(e1);
    }
}
