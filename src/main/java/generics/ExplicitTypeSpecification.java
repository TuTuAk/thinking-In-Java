//: generics/ExplicitTypeSpecification.java
package generics; /* Added by Eclipse.py */

import java.util.List;
import java.util.Map;

import net.mindview.util.*;
import typeinfo.pets.*;

public class ExplicitTypeSpecification {

    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
