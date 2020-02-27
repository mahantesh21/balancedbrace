package com.balancedbraces;

public class BalancedBraces {
	private static String[] bracesCollection = { "()", "{}", "[]" };

	public static void main(String[] args) {
		String input = "[a,dfsd&]{}{{(([[]]))}}";
		System.out.println("Input String balance check is " + isBalanced(input.trim()));
	}

	private static boolean isBalanced(String input) {
		System.out.println("Original Input before operation >> " + input);
		input = input.replaceAll("[^\\[\\]\\{\\}\\(\\)]", "");
		System.out.println("Input after removing non brace chars >> " + input);

		while (checkBraceSetExists(input)) {
			for (String brace : bracesCollection) {
				input = input.replace(brace, "");
			}
		}
		return input.isEmpty();
	}

	private static boolean checkBraceSetExists(String input) {
		for (String brace : bracesCollection) {
			if (input.contains(brace)) {
				return true;
			}
		}
		return false;
	}
}
