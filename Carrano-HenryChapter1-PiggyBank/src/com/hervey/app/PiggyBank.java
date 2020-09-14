package com.hervey.app;

public class PiggyBank {
	
	private BagInterface<Coin> coins;
	
	public PiggyBank() {
	
	}

	public BagInterface<Coin> getCoins() {
		return coins;
	}

	public void setCoins(BagInterface<Coin> coins) {
		this.coins = coins;
	}
	
	

}
