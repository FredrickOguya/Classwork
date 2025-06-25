#include <stdio.h>

void main()
    {
        int n;
        for(n=2; n<=9;n++)
        {
            if(n==4)
            continue;
            
            printf("%d\n",n);
        }
        printf("out of loop");
    }