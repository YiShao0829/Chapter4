interface iVehicle 
{
	void vShow();
}

interface iMaterial
{
	void mShow();
}

class Car2 implements iVehicle,iMaterial
{
	private int num;
	private double gas;
	
	public Car2(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	
	public void vShow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	public void mShow()
	{
		System.out.println("車子的材質是鐵");
	}
}

/*
class Car2 implements iVehicle
{
	private int num;
	private double gas;
	
	public Car2(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class Plane2 implements iVehicle
{
	private int flight;
	
	public Plane2(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}
*/
