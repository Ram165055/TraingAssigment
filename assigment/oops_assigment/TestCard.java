package com.assigment.oops;
abstract class PrepaidCard{
	int CardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(int amount);
	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
		void rechargeCard(int amount) {
			availableBalance=availableBalance+amount;
		}
	
}
class TravelCard extends PrepaidCard implements Rewardable{

	@Override
	boolean swipeCard(int amount) {
		// TODO Auto-generated method stub
		
			int amount1=amount*60;
		
		if(amount1<swipeLimit&&amount1<availableBalance) {
			availableBalance=availableBalance-amount1-((amount1*5)/100);
			
			System.out.println(rewardspoint(amount1));
			return true;
		}
		
		return false;
	}
	int rewardPoints;
	@Override
	public int rewardspoint(int amount) {
		// TODO Auto-generated method stub
		rewardPoints=rewardPoints+5*(amount/100);
		return rewardPoints;
	}
}
interface Rewardable{
	int rewardspoint(int amount); 
}

public class TestCard {

	public static void main(String[] args) {
		
TravelCard travelCard=new TravelCard();
travelCard.CardNo=1000999;
travelCard.swipeLimit=10000;
travelCard.rechargeCard(3000);

travelCard.swipeCard(20);
System.out.println(travelCard.toString());
	}

}
