public class ThreadExtend extends Thread {
	public void run(){
		System.out.println("Hello All");
	}
	public static void main(String args[]){
		ThreadExtend t1=new ThreadExtend();
		ThreadExtend t2=new ThreadExtend();
		ThreadExtend t3=new ThreadExtend();
		ThreadExtend t4=new ThreadExtend();
		ThreadExtend t5=new ThreadExtend();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
//executed on javaprogramiz
