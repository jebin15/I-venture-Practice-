package iventure;

public class AddIntegerWithoutArithOperator {

	public Integer AddInteger(int a, int b) {
		if (b == 0)
			return a;
		int sum = a ^ b;
		int carry = (a & b) << 1;
		return AddInteger(sum, carry);
	}

	public static void main(String[] args) {
		AddIntegerWithoutArithOperator addInteger = new AddIntegerWithoutArithOperator();
		Integer sum = addInteger.AddInteger(10, 9);
		System.out.println(sum);
	}
}
