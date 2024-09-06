package ex03;

public class Animal2 {
	
		private String name;
		
		public Animal2(){}
		
		public Animal2(String name){
			this.name = name;
		}
		
		void speak() {
			
		}
		
		void info() {
			
			System.out.println(name + "입니다.");
		}
		
		String getName() {
			return name;
		}
		
		void setName() {
			this.name = name;
		}
		
	}


