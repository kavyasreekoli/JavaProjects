package datatypes;


public class DataTypeCode2 {
	public static void main(String[] args) {
		byte b1=126;
		Byte b=new Byte(b1);
		System.out.println("Byte = "+b);
		System.out.println("--------");
		short s1=12600;
		Short s=new Short(s1);
		System.out.println("Short = "+s);
		System.out.println("--------");
		int i1=1260000;
		Integer i=new Integer(i1);
		System.out.println("Int = "+i);
		System.out.println("---------");
		long ll1=12600000000l;
		Long l1=new Long(ll1);
		System.out.println("Long = "+l1);
		System.out.println("--------");
		float ff1=126.543f;
		Float f1=new Float(ff1);
		System.out.println("Float = "+f1);
		System.out.println("--------");
		double d1=126678923.12;
		Double d=new Double(d1);
		System.out.println("Double = "+d);
		System.out.println("--------");
		System.out.println("--------");
		char c1='r';
		Character c=new Character(c1);
		System.out.println("Character = "+c);
		String str="rana";
		String st=new String(str);
		System.out.println("String = "+st);
	}
}
