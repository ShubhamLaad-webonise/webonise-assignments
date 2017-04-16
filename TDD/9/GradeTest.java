import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradeTest {

	Grade gradeObject;

	@Before
	public void setUp() throws Exception {
		gradeObject=new Grade();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertSame("A", gradeObject.getGrade(70));
		assertSame("B", gradeObject.getGrade(60));
		assertSame("C", gradeObject.getGrade(50));
		assertSame("D", gradeObject.getGrade(40));
		assertSame("F", gradeObject.getGrade(30));
		assertSame("F", gradeObject.getGrade(0));
		
		
		
		assertSame("A", gradeObject.getGrade(75.55));
		assertSame("B", gradeObject.getGrade(63.33));
		assertSame("F", gradeObject.getGrade(39));
		assertSame(null, gradeObject.getGrade(-54));
	}

}