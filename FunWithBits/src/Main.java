
public class Main {


	public static void main(String[] args) {


		int binaryNumber = 0b10001111;

		int octalNumber = 0117;

		int hexNumber = 0x4F;

		System.out.println("0b10001111 = " + Integer.toBinaryString(binaryNumber));
		System.out.println("0117 = " + Integer.toBinaryString(octalNumber));
		System.out.println("0x4F = " + Integer.toBinaryString(hexNumber));

		System.out.println("0x4F = " + Integer.toString(hexNumber,5) + "in base 5");


		// Turn nth bit ON

		System.out.println("Original Number        = " + Integer.toBinaryString(binaryNumber));

		int pos = 6;

		int turnSixthBitOnMask = 1 << pos;

		System.out.println("Mask to Turn On Bit 6  =  " + Integer.toBinaryString(turnSixthBitOnMask));

		int numberWithSixthBitOn = binaryNumber  | turnSixthBitOnMask;

		System.out.println("Number With Bit 6 On   = " + Integer.toBinaryString(numberWithSixthBitOn));

		// Turn nth bit OFF

		pos = 2;

		int turnSecondBitOffMask = (-1 << (1+pos)) | (-1 >>> (32 - pos));

		System.out.println("Mask to Turn Off Bit 2 = " + Integer.toBinaryString(turnSecondBitOffMask));

		int numberWithSecondBittOff = binaryNumber & turnSecondBitOffMask;

		System.out.println("Number With Bit 2 Off  = " + Integer.toBinaryString(numberWithSecondBittOff));

		// Extract nth bit

		pos = 3;

		int numberShiftedRight = binaryNumber >>> pos;

		int one = 1;

		int extractedBit = numberShiftedRight & 1;

		System.out.println("Bit 3 from Number  = " + Integer.toBinaryString(extractedBit));

		pos = 4;

		numberShiftedRight = binaryNumber >>> pos;

		one = 1;

		extractedBit = numberShiftedRight & 1;

		System.out.println("Bit 4 from Number  = " + Integer.toBinaryString(extractedBit));

	}


}
