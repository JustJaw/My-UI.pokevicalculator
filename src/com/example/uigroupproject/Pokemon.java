package com.example.uigroupproject;

public class Pokemon {

	//instance variables
	int HP;
	int Attack;
	int Defense;
	int SpecialAttack;
	int SpecialDefense;
	int Speed;
	String name;
	
	/**
	 * 
	 * @param h - HP
	 * @param a - Attack
	 * @param d - Defense
	 * @param sa - SpecialAttack
	 * @param sd - SpecialDefense
	 * @param sp - Speed
	 */
	public Pokemon(int h, int a, int d , int sa, int sd, int sp, String n)
	{
		HP = h;
		Attack = a;
		Defense = d;
		SpecialAttack = sa;
		SpecialDefense = sd;
		Speed = sp;
		name = n;
	}
	
	public int getHp()
	{
		return HP;
	}
	
	public int getAttack()
	{
		return Attack;
	}
	
	public int getDefense()
	{
		return Defense;
	}
	
	public int getSpecialAttack()
	{
		return SpecialAttack;
	}
	
	public int getSpecialDefense()
	{
		return SpecialDefense;
	}
	
	public int getSpeed()
	{
		return Speed;
	}
	

	public String getName()
	{
		return name;
	}
}
