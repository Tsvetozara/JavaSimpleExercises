package TypeCasting;

public class TypeCastingObjects1 {

    public static void main(String[] args) {

        // upcasting
        Child c = new Child();
        System.out.println(c.name); //Parent
        c.m1(); //Parent
        System.out.println(c.id); //Child
        c.m2(); //Child


        Parent p = new Child(); //upcasting
        System.out.println(p.name); //Parent
        p.m1(); //Parent
        // System.out.println(p.id); Can't access
        // p.m2(); Can't access


        //downcasting
        Parent pr = new Parent();
        // Child ch = (Child) pr;  // Returns Typecast exception

        //System.out.println(ch.name);
        // System.out.println(ch.id);
        // ch.m1();  // Returns Typecast exception
        // ch.m2();  // Returns Typecast exception


    }
}
