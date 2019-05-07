//: generics/SimplerPets.java
package generics; /* Added by Eclipse.py */

import java.util.List;
import java.util.Map;

import net.mindview.util.*;
import typeinfo.pets.*;

public class SimplerPets {

    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} ///:~
