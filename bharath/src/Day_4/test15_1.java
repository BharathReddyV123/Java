package Day_4;

public class test15_1 {
	int x,y,z;
	
	public test15_1(){
		System.out.println("welcome to my profile");
	}
		public test15_1(int ssc) {
			this.x=ssc;
			System.out.println("ssc marks: "+x);
		}
		public test15_1(int ssc,int inter) {
			this.x=ssc;
			this.y=inter;
			System.out.println("ssc marks: "+x+"inter marks:"+y);
		}
		public test15_1(int ssc,int inter,int btech) {
			this.x=ssc;
			this.y=inter;
			this.z=btech;
			System.out.println("ssc marks:"+x+"inter marks:"+y+"btech marks:"+z);
		}
			
		public static void main(String[] args) {
			test15_1 t1=new test15_1();
			test15_1 t2=new test15_1(100);
			test15_1 t3=new test15_1(100,888);
			test15_1 t4=new test15_1(100,888,900);
			
		}
			
		}


