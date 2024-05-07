package java8feature;

public interface person {
	void show();

}

 class anonoymous1{
	
	public static void main(String [] args) {
		
		
		person p = new person() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
				System.out.print("hello");
			}
		
	};
	
	p.show();
}
}
