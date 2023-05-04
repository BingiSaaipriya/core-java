package om.objectsdemo;

public class Objectfinalizedemo {
	private int id;
	
	
	public Objectfinalizedemo(int id) {
		this.id=id;
		
	}
	public int getid() {
		return id;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method invovked************************");
	}
	
	
	
	
	public static void main(String[] args) {
		Objectfinalizedemo oo=new Objectfinalizedemo(1);
		System.out.println(oo.getid());
		
		for(int i=0; i<=10000;i++) {
			System.out.println(new Objectfinalizedemo(i));
		}
	}

}
