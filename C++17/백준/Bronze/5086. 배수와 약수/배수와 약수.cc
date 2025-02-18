#include <iostream>

int main()
{
    int i, j;
    
    while (true)
    {
        scanf("%d %d", &i, &j);
        if ((i == 0 && j == 0))
            break;
        else if (i % j == 0)
          printf("%s\n", "multiple");
        else if (j % i == 0)
          printf("%s\n", "factor");
        else
          printf("%s\n", "neither");
    }
}