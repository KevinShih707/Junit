package letterGrade;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class letterGradeTest {

	private letterGrade letterGradeChecker;
	
	@Before
	public void setUp() throws Exception {
		letterGradeChecker = new letterGrade();
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testLessThanZero() {
//		char exceptedGrade = 'X';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(-1));
//	}
//	
//	@Test
//	public void testLargerThanHundred() {
//		char exceptedGrade = 'X';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(101));
//	}
//	
//	@Test
//	public void testA1() {
//		char exceptedGrade = 'A';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(100));
//	}
//	
//	@Test
//	public void testA2() {
//		char exceptedGrade = 'A';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(90));
//	}
//	
//	@Test
//	public void testB1() {
//		char exceptedGrade = 'B';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(89));
//	}
//	
//	@Test
//	public void testB2() {
//		char exceptedGrade = 'B';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(80));
//	}
//	
//	@Test
//	public void testC1() {
//		char exceptedGrade = 'C';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(79));
//	}
//	
//	@Test
//	public void testC2() {
//		char exceptedGrade = 'C';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(70));
//	}
//	
//	@Test
//	public void testD1() {
//		char exceptedGrade = 'D';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(69));
//	}
//	
//	@Test
//	public void testD2() {
//		char exceptedGrade = 'D';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(60));
//	}
//	
//	@Test
//	public void testF1() {
//		char exceptedGrade = 'F';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(59));
//	}
//	
//	@Test
//	public void testF2() {
//		char exceptedGrade = 'F';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(0));
//	}

	@Test
	public void testA() {
		char exceptedGrade = 'A';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(95));
	}
	
	@Test
	public void testB() {
		char exceptedGrade = 'B';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(85));
	}
	
	@Test
	public void testC() {
		char exceptedGrade = 'C';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(75));
	}
	
	@Test
	public void testD() {
		char exceptedGrade = 'D';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(65));
	}
	
	@Test
	public void testF() {
		char exceptedGrade = 'F';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(35));
	}	
	
	@Test
	public void testX1() {
		char exceptedGrade = 'X';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(101));
	}
	
	@Test
	public void testX2() {
		char exceptedGrade = 'X';
		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(-1));
	}
	
//	@Test
//	public void test100_1() {
//		char exceptedGrade = 'X';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(101));
//	}
//	
//	@Test
//	public void test100_2() {
//		char exceptedGrade = 'A';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(100));
//	}
//	
//	@Test
//	public void test100_3() {
//		char exceptedGrade = 'A';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(99));
//	}
//	
//	@Test
//	public void test90_1() {
//		char exceptedGrade = 'A';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(91));
//	}
//	
//	@Test
//	public void test90_2() {
//		char exceptedGrade = 'A';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(90));
//	}
//	@Test
//	public void test90_3() {
//		char exceptedGrade = 'B';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(89));
//	}
//	
//	@Test
//	public void test80_1() {
//		char exceptedGrade = 'B';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(81));
//	}
//	
//	@Test
//	public void test80_2() {
//		char exceptedGrade = 'B';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(80));
//	}
//	
//	@Test
//	public void test80_3() {
//		char exceptedGrade = 'C';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(79));
//	}
//	
//	@Test
//	public void test70_1() {
//		char exceptedGrade = 'C';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(71));
//	}
//	
//	@Test
//	public void test70_2() {
//		char exceptedGrade = 'C';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(70));
//	}
//	
//	@Test
//	public void test70_3() {
//		char exceptedGrade = 'D';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(69));
//	}
//	
//	@Test
//	public void test60_1() {
//		char exceptedGrade = 'D';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(61));
//	}
//	
//	@Test
//	public void test60_2() {
//		char exceptedGrade = 'D';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(60));
//	}
//	
//	@Test
//	public void test60_3() {
//		char exceptedGrade = 'F';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(59));
//	}
//	
//	@Test
//	public void test0_1() {
//		char exceptedGrade = 'F';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(1));
//	}
//	
//	@Test
//	public void test0_2() {
//		char exceptedGrade = 'F';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(0));
//	}
//	
//	@Test
//	public void test0_3() {
//		char exceptedGrade = 'X';
//		assertEquals(exceptedGrade, letterGradeChecker.TransferletterGrade(-1));
//	}
}
