package studio7;

public class Die {
		// instance variable
		private int number;
		
		//constructor
		public Die(int number) {
			this.number = number;
		}
		
		public int roll_dice() {
//			int[] temp_array = new int[this.number];
			// Math.random()*(upper -lower +1) + lower
			int random = (int)(Math.random()*(this.number-1+1))+1;
			return random;
		}
		
		public static void main(String[] args){
			Die test1 = new Die(6);
			System.out.println(test1.roll_dice());
		}
}
