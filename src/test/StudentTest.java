package test;

import model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ingridmayer on 29/03/2017.
 */

public class StudentTest {
    private Student s1;
    private Student s2;
    @Before
    public void setUp() throws Exception {
        s1 = new Student("studentu1 nr 1","Ingrid Mayer",731);
        s2 = new Student( "studentul nr 2", "Ingrid Mayer", 721);
    }
    // constructor

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRegNumber() throws Exception {
        assertEquals("getRegNumber fail", "studentul nr 1",s1.getRegNumber());
        assertEquals("getRegNumber fail", "studentul nr 2",s2.getRegNumber());
    }

    @Test
    public void setRegNumber() throws Exception {
        s1.setRegNumber("studentul1");
        assertEquals("setRegNumber crapat", "studentul1",s1.getRegNumber());

        s1.setRegNumber("studentul2");
        assertEquals("setRegNumber crapat", "studentul2",s1.getRegNumber());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("getName crapat", "student1", s1.getName());
        assertEquals("getName crapat", "student2", s2.getName());
    }

    @Test
    public void setName() throws Exception {
        s1.setName("student2");
        assertEquals("setName fail", "student1", s1.getName());

        s1.setName("student2");
        assertEquals("setName fail", "student2", s1.getName());
    }

    @Test
    public void getGroup() throws Exception {
        assertEquals("getGroup crapat", 731, s1.getGroup());
        assertEquals("getGroup crapat", 733, s2.getGroup());
    }

    @Test
    public void setGroup() throws Exception {
        s1.setGroup(363);
        assertEquals("setGroup crapat", 363, s1.getGroup());

        s1.setGroup(345);
        assertEquals("setGroup crapat", 345, s1.getGroup());

    }

}