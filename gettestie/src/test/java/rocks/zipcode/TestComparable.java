package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

    @Test
    public void testComparable1() {
        ArrayList<Person> list = new ArrayList();
        Person person1 = new Person("Billy", 1984);
        Person person2 = new Person("Satya", 1945);
        Person person3 = new Person("Mark", 1989);
        Person person4 = new Person("Graham", 2000);
        Person person5 = new Person("Kobe", 1001);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        //Collections.sort(list);

        for (Person person : list) {
            System.out.println(person.getName());
        }
    }
}
