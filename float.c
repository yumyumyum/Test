#include <stdlib.h>
#include <stdio.h>

main()
{
	float input;
	printf("Input float number: ");
	scanf("%f",&input);

	union ufloat {float f; unsigned int u;} u1;

	u1.f = input;	
	unsigned int holder = u1.u;
	int array[32]={0};
	int counter = 0;

	while (counter<32)
	{
		if((holder%2)>0)
			array[31-counter]=1;
		else
			array[31-counter]=0;
		holder = holder/2;
		counter++;
	}

	counter = 0;

	while(counter<32)
	{
		printf("%d",array[counter]);
		counter++;
	}

}