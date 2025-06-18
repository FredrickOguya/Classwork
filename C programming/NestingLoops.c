#include <stdio.h>

void main()
{
    for(int i=0;i<10;i++)
    {
        printf("\ni = %d\n ",i);
        printf("j=");
        for(int j=1;j<4;j++)
        {
            printf("%d",j);
        }
    }
}