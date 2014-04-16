#include <stdlib.h>

#include <stdio.h>



main()

{

	unsigned int input;

	printf("Input integer: ");

	scanf("%i",&input);


	int mask = (1<<31);

	int counter = 32;



	while (counter>0)

	{
	
		if ((input & mask) > 0)
		
			printf("1");
	
		else
		
			printf("0");
	
		counter--;
            	mask = (1<<(counter-1));
	
	}







}