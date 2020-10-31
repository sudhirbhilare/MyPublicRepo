import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumbertToWordTest {

	@Test
	void test() {
		NumbertToWord ntw = new NumbertToWord();
		System.out.println(NumbertToWord.mainFun(44));
		String value = NumbertToWord.mainFun(44);
		assertEquals("Rs. Four Forty- Four 0/100 Only", value);
	}

}
