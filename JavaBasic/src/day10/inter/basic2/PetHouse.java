package day10.inter.basic2;

public class PetHouse {

	//매개변수로 펫 타입을 받아서, 매개변수에 따라서, 알맞은 형변환을 진행하는 메서드
	public static void carePet(IPet pet) {
		if( pet instanceof Dog) {
			Dog baduk = (Dog)pet;
			baduk.eat();
			baduk.play();
		}
		if( pet instanceof Cat) {
			Cat shampoo = (Cat)pet;
			shampoo.eat();
			shampoo.play();
		}
		if( pet instanceof GoldFish) {
			GoldFish gol = (GoldFish)pet;
			gol.swim();
			gol.play();
		}
	}
}