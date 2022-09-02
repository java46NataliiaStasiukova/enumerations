package telran.measure.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import telran.measure.LengthUtil;


class LengthUtilTest {

	@Test
	void test() {
		assertEquals(1000, LengthUtil.KM.convertValue(LengthUtil.M, 1));
	}

}
