package test;

import model.Laboratory;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by ingrid on 3/25/17.
 */
public class LaboratoryTest {
    private Laboratory l1, l2;
    @org.junit.Before
    public void setUp() throws Exception {
        l1 = new Laboratory(1, "07/07/2007", 1, "studentul1");
        l2 = new Laboratory(2, "03/04/2006", 2, new Float(7.0), "studentul2");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getNumber() throws Exception {
        assertEquals("getNumber crapat", 1,l1.getNumber());
        assertEquals("getNumber crapat",2,l2.getNumber());
        long i =999;
    }

    @org.junit.Test
    public void setNumber() throws Exception {
        l2.setNumber(3);
        assertEquals("setNumber crapat", 3, l2.getNumber());
    }

    @org.junit.Test
    public void getDate() throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        assertEquals("getDate crapat", format.parse("06/07/2000"), l2.getDate());
        int i =0;
    }

    @org.junit.Test
    public void setDate() throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = format.parse("03/04/2014");
        l2.setDate(d1);
        assertEquals("setDate fail", format.parse("03/04/2014"), l2.getDate());


    }

    @org.junit.Test
    public void getProblemNumber() throws Exception {
        assertEquals("getProblemNumber crapat", 1, l1.getProblemNumber());
        assertEquals("getProblemNumber crapat", 2, l2.getProblemNumber());
    }

    @org.junit.Test
    public void setProblemNumber() throws Exception {
        l1.setProblemNumber(4);
        assertEquals("setProblemNumber crapat",4,l1.getProblemNumber());
        l1.setProblemNumber(5);
        assertEquals("setProblemNumber crapat",5,l1.getProblemNumber());

    }

    @org.junit.Test
    public void getGrade() throws Exception {
        assertEquals("getGrade crapat",7.0,l2.getGrade(),0.00001);

    }

    @org.junit.Test
    public void setGrade() throws Exception {
        l1.setGrade((float)4.5);
        assertEquals("setGrade crapat",4.5,l1.getGrade(),0.00001);
        l1.setGrade((float)6.5);
        assertEquals("setGrade crapat",6.5,l1.getGrade(),0.00001);
    }

    @org.junit.Test
    public void getStudentRegNumber() throws Exception {
        assertEquals("getStudentRegNumber crapat", "1", l1.getStudentRegNumber());
        assertEquals("getStudentRegNumber crapat", "2", l2.getStudentRegNumber());

    }

    @org.junit.Test
    public void setStudentRegNumber() throws Exception {
        l1.setStudentRegNumber("l1");
        assertEquals("getStudentRegNumber crapat", "laborator1", l1.getStudentRegNumber());

        l2.setStudentRegNumber("l2");
        assertEquals("getStudentRegNumber crapat", "laborator2", l2.getStudentRegNumber());
    }



}