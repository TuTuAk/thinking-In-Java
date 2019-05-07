//: generics/LimitsOfInference.java
package generics; /* Added by Eclipse.py */

import java.util.List;
import java.util.Map;

import typeinfo.pets.*;

public class LimitsOfInference {

    static void
    f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
} ///:~
