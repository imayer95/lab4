package test;

        import model.Laboratory;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import validator.Validator;
        import model.Student;

        import static org.junit.Assert.*;

/**
 * Created by ingridmayer on 29/03/2017.
 */
public class ValidatorTest {
    private Validator vali;
    private Student s1,s2,s3;
    private Laboratory l1,l2,l3,l4;
    @Before
    public void setUp() throws Exception {
        s1 = new Student("bfig0004","bla bla",765);
        s2 = new Student("miig0020","bla bla@",765);
        s3 = new Student("dmig0011","asda",12346);
        vali = new Validator();

        l1 = new Laboratory(1,"02/02/2014",3,"bfig0004");
        l2 = new Laboratory(0,"02/02/2014",3,"bfig0004");
        l3 = new Laboratory(1,"02/02/2018",3,"bfig0004");
        l4 = new Laboratory(1,"02/02/2014",11,"bfig0004");

    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void validateStudent() throws Exception {

        assertTrue("validateStudent fail 1", vali.validateStudent(s1));
        assertFalse("validateStudent fail 2", vali.validateStudent(s2));
        assertFalse("validateStudent fail 3 ", vali.validateStudent(s3));
    }

    @Test
    public void validateLaboratory() throws Exception {

        assertTrue("validateLaboratory fail 1", vali.validateLaboratory(l1));
        assertFalse("validateLaboratory fail 2", vali.validateLaboratory(l2));
        assertFalse("validateLaboratory fail 3", vali.validateLaboratory(l3));
        assertFalse("validateLaboratory fail 4", vali.validateLaboratory(l4));
    }

    @Test
    public void validateGrade() throws Exception {
        assertTrue("validateGrade fail 1", vali.validateGrade((float)6.9));
        assertTrue("validateGrade fail 2", vali.validateGrade(10));
        assertTrue("validateGrade fail 3", vali.validateGrade(1));
        assertFalse("validateGrade fail 4", vali.validateGrade((float)0.9));
        assertFalse("validateGrade fail 4", vali.validateGrade((float)0.6));
        assertFalse("validateGrade fail 4", vali.validateGrade((float)11.1));
        assertFalse("validateGrade fail 4", vali.validateGrade((float)10.1));


    }

}