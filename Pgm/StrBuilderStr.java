
public class StrBuilderStr {

	public static void main(String[] args) {

		StringBuilder strBuf = new StringBuilder("String using");
		strBuf.append(" String Buffer!!");
		System.out.println(strBuf);
		// strBuffr are mutable & All Methods in strBuff is synchronized

		String str = "String using";
		str.concat(" String concat");
		System.out.println(str);
	}

}
