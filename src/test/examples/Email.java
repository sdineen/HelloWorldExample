package test.examples;

public class Email {

	public boolean isValidEmail(String string) {
		String regex = "[\\w\\.]{2,20}@\\w{1,10}\\.\\w{2,6}";
		regex = "^\\S+@\\S+$";
		// TODO Auto-generated method stub
		boolean match = string.matches(regex);
		return match;
	}

}
