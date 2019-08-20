package pack1;
public class SomeClass
{
	public static MyInterface getMyInterface()
	{
		return new MyInterface()
				{
					@Override
					public void disp() {
						System.out.println("inside anonymous inner class disp");
						
					}
				};
	}
}
