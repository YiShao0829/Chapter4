
public class Page38 {

	public static void main(String[] args) 
	{
		iVehicle[] ivc;
		ivc=new iVehicle[2];
		
		ivc[0]=new Car2(1234,20.5);
		
		ivc[1]=new Plane2(232);
		
		for(int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}

}
