package test;

import model.Laboratory;
import model.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import repository.FileDataPersistence;

import static org.junit.Assert.*;


/**
 * Created by ingridmayer on 29/03/2017.
 */

public class FileDataPersistenceTest {
    private Laboratory l1,l2,l3;
    private Student s1,s2;
    private FileDataPersistence stuRepo;
    private FileDataPersistence labRepo;

    @Before
    public void setUp() throws Exception {
        s1 = new Student("student1","numele",567);
        s2 = new Student("student2","Tembelica", 788);
        l1 = new Laboratory(1, "09/07/2013",1, "student1");
        l2 = new Laboratory(2, "05/30/2016", 2, "student2");
        l3 = new Laboratory(1,"03/01/2003",1,"student1");

        stuRepo = new FileDataPersistence("testStud.txt");
        labRepo = new FileDataPersistence("testLab.txt");


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFile() throws Exception {
        assertEquals("getFile crapat", "testStud.txt",stuRepo.getFile());
        assertEquals("getFile crapat", "testLab.txt",labRepo.getFile());
    }

    @Test
    public void setFile() throws Exception {
    }

    @Test
    public void saveStudent() throws Exception {
    }

    @Test
    public void saveLaboratory() throws Exception {
    }

    @Test
    public void addGrade() throws Exception {
    }

    @Test
    public void getLaboratoryMap() throws Exception {
    }

    @Test
    public void getStudentsList() throws Exception {
    }

}