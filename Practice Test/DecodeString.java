package recurssionTest;

public class DecodeString {

	String decodeString(String s) {
		StringBuffer sb = new StringBuffer();
		int index = 0;
		while (index < s.length()) {
			char c = s.charAt(index);
			if (isDigit(c)) {
				String num = getNum(s, index);
				int mul = Integer.parseInt(num);
				int start = index + num.length();
				String str = newString(s, start);
				String result = decodeString(str.substring(1, str.length() - 1));
				for (int i = 0; i < mul; i++) {
					sb.append(result);
				}
				index = index + num.length() + str.length();
			} else {
				sb.append(c);
				index++;
			}
		}
		return sb.toString();
	}

	String newString(String s, int start) {
		int openCloseCount = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = start; i < s.length(); i++) {
			sb.append(s.charAt(i));
			if (s.charAt(i) == '[') {
				openCloseCount++;
			} else if (s.charAt(i) == ']') {
				openCloseCount--;
			}

			if (openCloseCount == 0) {
				break;
			}
		}
		return sb.toString();
	}

	String getNum(String s, int start) {
		StringBuffer num = new StringBuffer();
		while (isDigit(s.charAt(start))) {
			num.append(s.charAt(start));
			start++;
		}
		return num.toString();
	}

	boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	public static void main(String[] args) {
		DecodeString ds = new DecodeString();
//		String s = "3[a]2[bc]";
//		String s = "3[a2[c]]";
		String s = "2[abc]3[cd]ef";
		
		System.out.println(ds.decodeString(s));
	}
}
