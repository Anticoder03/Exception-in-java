package day11;

public class WrapperClasses {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		Integer obj_a = new Integer(a);
		System.out.println(obj_a);
		int b = obj_a.intValue();
		System.out.println(b);
		
		System.out.println("double");
		double c = 12.34;
		System.out.println(c);
		
		Double obj_c = new Double(c);
		System.out.println(obj_c);
		
		double d = obj_c.doubleValue();
		System.out.println(d);
		
		System.out.println("float");
		float e = (float) 12.34;
		System.out.println(e);
		
		Float obj_e = new Float(e);
		System.out.println(obj_e);
		
		double f = obj_c.doubleValue();
		System.out.println(f);
		
		System.out.println("boolean");
		boolean ans = true;
		System.out.println(ans);
		
		Boolean b1 = new Boolean(ans);
		System.out.println(b1);
		
		boolean b2 = b1.booleanValue();
		System.out.println(b2);
		
		
		
	}
}
