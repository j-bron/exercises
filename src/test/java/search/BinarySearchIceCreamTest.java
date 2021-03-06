package search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnit4.class)
public class BinarySearchIceCreamTest {

	@Test
	public void testCalc() {
		int[] t = {2, 2, 4, 3};
		assertEquals("1 2", BinarySearchIceCream.calc(t, 4));
	}

	@Test
	public void testCalc2() {
		int[] t = {591, 955, 829, 805, 312, 83, 764, 841, 12, 744, 104, 773, 627, 306, 731, 539, 349, 811, 662, 341, 465, 300, 491, 423, 569, 405, 508, 802, 500, 747, 689, 506, 129, 325, 918, 606, 918, 370, 623, 905, 321, 670, 879, 607, 140, 543, 997, 530, 356, 446, 444, 184, 787, 199, 614, 685, 778, 929, 819, 612, 737, 344, 471, 645, 726};
		assertEquals("11 56", BinarySearchIceCream.calc(t, 789));
	}


	@Test
	public void testCalc3() {
		int[] t = {230, 863, 916, 585, 981, 404, 316, 785, 88, 12, 70, 435, 384, 778, 887, 755, 740, 337, 86, 92, 325, 422, 815, 650, 920, 125, 277, 336, 221, 847, 168, 23, 677, 61, 400, 136, 874, 363, 394, 199, 863, 997, 794, 587, 124, 321, 212, 957, 764, 173, 314, 422, 927, 783, 930, 282, 306, 506, 44, 926, 691, 568, 68, 730, 933, 737, 531, 180, 414, 751, 28, 546, 60, 371, 493, 370, 527, 387, 43, 541, 13, 457, 328, 227, 652, 365, 430, 803, 59, 858, 538, 427, 583, 368, 375, 173, 809, 896, 370, 789};
		assertEquals("29 46", BinarySearchIceCream.calc(t, 542));
	}

	@Test
	public void testCalc4() {
		int t[] = {2, 1, 9, 4, 4, 56, 90, 3};
		assertEquals("4 5", BinarySearchIceCream.calc(t, 8));
	}

	@Test
	public void testCalc5() {
		int t[] = {150, 24, 79, 50, 88, 345, 3};
		assertEquals("1 4", BinarySearchIceCream.calc(t, 200));
	}

	@Test
	public void testCalc7() {
		int t[] = {678, 227, 764, 37, 956, 982, 118, 212, 177, 597, 519, 968, 866, 121, 771, 343, 561};
		assertEquals("7 9", BinarySearchIceCream.calc(t, 295));
	}

	@Test
	public void testCalc8() {
		int t[] = {22, 391, 140, 874, 75, 339, 439, 638, 158, 519, 570, 484, 607, 538, 459, 758, 608, 784, 26, 792, 389, 418, 682, 206, 232, 432, 537, 492, 232, 219, 3, 517, 460, 271, 946, 418, 741, 31, 874, 840, 700, 58, 686, 952, 293, 848, 55, 82, 623, 850, 619, 380, 359, 479, 48, 863, 813, 797, 463, 683, 22, 285, 522, 60, 472, 948, 234, 971, 517, 494, 218, 857, 261, 115, 238, 290, 158, 326, 795, 978, 364, 116, 730, 581, 174, 405, 575, 315, 101, 99, 295};
		assertEquals("55 74", BinarySearchIceCream.calc(t, 163));
	}

	@Test
	public void testCalc9() {
		int t[] = {286, 461, 830, 216, 539, 44, 989, 749, 340, 51, 505, 178, 50, 305, 341, 292, 415, 40, 239, 950, 404, 965, 29, 972, 536, 922, 700, 501, 730, 430, 630, 293, 557, 542, 598, 795, 28, 344, 128, 461, 368, 683, 903, 744, 430, 648, 290, 135, 437, 336, 152, 698, 570, 3, 827, 901, 796, 682, 391, 693, 161, 145};
		assertEquals("16 35", BinarySearchIceCream.calc(t, 890));
	}

	@Test
	public void testCalc10() {
		int t[] = {210, 582, 622, 337, 626, 580, 994, 299, 386, 274, 591, 921, 733, 851, 770, 300, 380, 225, 223, 861, 851, 525, 206, 714, 985, 82, 641, 270, 5, 777, 899, 820, 995, 397, 43, 973, 191, 885, 156, 9, 568, 256, 659, 673, 85, 26, 631, 293, 151, 143, 423};
		assertEquals("40 46", BinarySearchIceCream.calc(t, 35));
	}

	@Test
	public void testCalc11() {
		int t[] = {722, 600, 905, 54, 47,};
		assertEquals("4 5", BinarySearchIceCream.calc(t, 101));
	}
}