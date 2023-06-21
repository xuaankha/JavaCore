package com.kha.string;

public class StringBasic {
	public static void main(String[] args) {
		study009();
	}

    //thay thế chuỗi
	private static void study009() {
		String str = "Hello World";
		String newStr = str.replace("World", "Java"); // newStr = "Hello Java"

	}

	// Cắt chuỗi
	private static void study008() {
		String str = "Hello + World";
		String subStr = str.substring(0, 5);
		System.out.println(subStr);
		System.out.println(str);
	}

	// Khai báo chuỗi
	public static void study001() {
		// Case 1
		String str1 = "Java never die 1";
		// Case 2
		String str2 = new String();
		str2 = "Java never die 2 ";
		// Case 3
		String str3 = new String("Java never die 3");
		// Case 4
		String str4;
		str4 = "Java never die 4";
		System.out.println(str1);
	}

	// Nối chuỗi
	public static void study002() {
		// Cách 1
		String str1 = "JAVA";
		String str2 = "is not difficult";
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		// Cách 2
		String str4 = str1.concat(" ").concat(str2); // str1 + " "+str2
		System.out.println(str4);

	}

	// Chuyển đổi chuỗi số thành giá trị số
	public static void study003() {
		String str = "123";
		System.out.println(str + 4);
		// Dùng parseInt
		System.out.println(Integer.parseInt(str) + 4);
	}

	// Toán tử == so sánh địa chỉ vùng nhớ
	public static void study004() {
		String str1 = "java";
		// String str2 = "java";
		// String str2="jaVa";
		String str2 = new String("java");

		// 2 kiểu khai báo này khác địa chỉ vùng nhớ
		if (str2 == str1) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

	public static void study005() {
		String str1 = "Android.VN";
		String str2 = "Android.Vn";
		System.out.println("Compare uppercase and lowercase letters: " + str1.equals(str2));
		System.out.println("Compare case-insensitively: " + str1.equalsIgnoreCase(str2));
	}

	// Sự dư thừa vùng nhớ
	public static void study006() {
		String str1 = "JAVA is not difficult";
		str1 = "JAVA is not difficult";
		str1 = "Android is easy";
	}

	// Truy cập ký tự bất kỳ trong chuối
	private static void study007() {
		String str = "Hello World";

		char ch = str.charAt(0); // ch = 'H'
		System.out.println("ch = " + ch);
	}

}
