/**  
* @Title: MYmathTest.java
* @Package test_JUnit4.test
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author A18ccms A18ccms_gmail_com  
* @date 2017��2��27�� ����11:36:47
* @version V1.0  
*/
package test_JUnit4.test;



import org.junit.Test;

import junit.framework.TestCase;
import test_JUnit4.junit04.MYmath;

/**
* @ClassName: MYmathTest
* @Description: TODO(������һ�仰��������������)
* @author A18ccms a18ccms_gmail_com
* @date 2017��2��27�� ����11:36:47
*
*/
public class MYmathTest {

	/**
	 * Test method for {@link test_JUnit4.junit04.MYmath#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		TestCase.assertEquals(MYmath.add(10, 20), 30,20);
	}

}
