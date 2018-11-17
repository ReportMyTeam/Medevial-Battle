package HomeWork;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Army {
	List<Integer> list = new LinkedList<Integer>();
	
	Army army1;
	Army army2;
	int army_rand;
	int skill_test; 
	Random rand= new Random();
	
	public int get_size()
	{
		return list.size();
	}
	
	public int get_size_random()
	{
		return rand.nextInt(get_size());	
	}
	
	public int Generate_rand()
	{
		return list.get( get_size_random());
	}
	
	public void AddWarrior_test(int skill_test)
	{
		list.add(skill_test);
	}
}
