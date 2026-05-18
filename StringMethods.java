
public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Java Program123";
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(i+":"+s1.charAt(i)+" ");
		}
		System.out.println();
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.startsWith("ava", 1));
		System.out.println(s1.endsWith("gram"));
		System.out.println(s1.indexOf("a",s1.indexOf("a")+1));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 7));
		System.out.println(s1.contains("Pro"));
		System.out.println(s1.concat("ming"));
		System.out.println(s1);
		System.out.println(s1.replace('a', 'v'));
		System.out.println(s1.replaceAll("[A-Z]","xyz"));
		
		String s2 = "";
		System.out.println(s2.isBlank());
		System.out.println(s2.isEmpty());
		
		String [] splitedData = s1.split(" ");
		System.out.println(splitedData.length);
		
		String s3 = "   Hello   ";
		
		System.out.println(s3);
		System.out.println(s3.trim());
		System.out.println(s3.strip());
		System.out.println(s3.stripLeading());
		System.out.println(s3.stripTrailing());
		
		String res = String.valueOf(56); //"56"
		
		
	}
}
