package accessmodifiers;

public class ClassA {
private void private1() {
	System.out.println("private modifier");
}
 void default1() {
	System.out.println("default modifier");
}
 protected  void protected1() {
	 System.out.println("protected modifier");
 }
 public void public1() {
	 System.out.println("public modifier");
 }
 public static void main(String[] args) {
	ClassA sai = new ClassA();
	sai.private1();
	sai.default1();
	sai.protected1();
	sai.public1();
}
}
