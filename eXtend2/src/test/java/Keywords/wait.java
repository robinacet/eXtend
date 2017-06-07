package Keywords;

public class wait {
	
	public static void waitForTime(String time) throws InterruptedException
	{
		int inttime= getText.getnumber(time);
		Thread.sleep(inttime);
	}

}
