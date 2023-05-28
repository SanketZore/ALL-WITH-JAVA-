public class _24_Why_Multiple_inheritance_is_not_supported_in_java {

    /*
    Is Multiple Inheritance allowed in java ?
    Multiple inheritance face problems when there exists methods with same signature in both the super classes.
    Due to such problems, Java doesnot support Multiple inheritance directly but the similar concept can be achieved using Interfaces.
    A class can implement multiple interfaces and extends a class at the same time.

    NOTE:-  1) Inheritances in Java is a bit like a class but with a significant difference.
            2) An Interface can only have method Signatures, fields and default methods.
            3) The class implementing an Interface needs to on declare the methods (Not Fields).
            4) You can Create a reference of Interfaces but not the object.
            5) Interface Method are public by default.



POLYMORPHISM USING INTERFACES


    (C)CellPhone       (I)GPS         (I)Camera        (I)Media-Player
        |                |                 |                  |
        -------------------------------------------------------
                                    |
                                SmartPhone


GPS g=new SmartPhone();     --> can only use GPS methods
SmartPhone s=new SmartPhone();      --> can only use SmartPhone methods


     */


    
}
