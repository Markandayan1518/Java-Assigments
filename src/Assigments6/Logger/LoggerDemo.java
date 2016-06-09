package Assigments6.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggerDemo 
{
	public static void main(String[] args) 
	{
                BasicConfigurator.configure();
		int arr[] = {1, 2, 3, 5, 7};
		LoggerDemo log4jTester = new LoggerDemo();
		log4jTester.displayArrayValues(arr);
	}


	public void displayArrayValues(int[] arr) throws ArrayIndexOutOfBoundsException
	{
		//getting logger object
		Logger logger = Logger.getLogger(this.getClass());
		try
		{
			//logging the message for logging level "info"
			logger.info("The maximum array index is always one less than length of the array");

			for(int index=0; index<=7; index++)       //throws AIOB exception
			{
				if(index==arr.length-1)
				{
					//logging the message for logging level "warn"
					logger.warn("The array index value has reached maximum value of (array_length-1)");

				}

				System.out.println(arr[index]);
			}
		}
		catch(ArrayIndexOutOfBoundsException exception) //AIOB exception is handled
		{
			//logging the message for logging level "error"
			logger.error(exception.getMessage(), exception);

			//logging the message for logging level "fatal"
			logger.fatal("The method execution was unsuccessful, program terminated");
		}
	}

}
