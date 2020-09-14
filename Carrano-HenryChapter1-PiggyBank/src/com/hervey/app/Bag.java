package com.hervey.app;

public abstract class Bag<Coin> implements BagInterface<Coin> {

	@Override
	public int getCurrentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Coin newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Coin remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Coin anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getFrequencyOf(Coin anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Coin anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Coin[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
