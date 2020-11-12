package com.tipalti;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// import org.junit.Assert.assertEquals;
// import org.junit.runners.JUnit4;
import java.util.Arrays;

// import com.exercise.Address;
// import com.exercise.Name;
// import com.exercise.Person;

public class GraphUtilTest {
    
    
    @Test
    public void testFindMinRelationLevel() {
        Person[] persons = createDemoData();
        assertEquals(-1, GraphUtil.findMinRelationLevel(persons[0], persons[4]));
        assertEquals(1, GraphUtil.findMinRelationLevel(persons[0], persons[1]));
        assertEquals(1, GraphUtil.findMinRelationLevel(persons[0], persons[2]));
        assertEquals(2, GraphUtil.findMinRelationLevel(persons[0], persons[3]));
    }


    private Person[] createDemoData() {
        Address address1 = new Address("Bletchley Park", "");
        Address address3 = new Address("", "London");
        Address address4 = new Address("", "New York");
        Address address5 = new Address("", "Cambridge");

        Name name1 = new Name("Alan", "Turing");
        Name name3 = new Name("Joan", "Clarke");
        Name name5 = new Name("Grace", "Hopper");

        Person AlanBletchley = new Person(name1, address1);
        Person AlanCambridge = new Person(name1, address5);
        Person JoanBletchley = new Person(name3, address1);
        Person JoanLondon = new Person(name3, address3);
        Person GraceNew = new Person(name5, address4);

        Person[] persons = { AlanBletchley, AlanCambridge, JoanBletchley, JoanLondon, GraceNew };
        return persons;
    }
}
