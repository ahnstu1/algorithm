#include <iostream>

int main()
{
    int cnt, num;

    num = 2;

    scanf("%d", &cnt);

    for (int i = 0; i < cnt; i++){

        num += (num - 1);

    }

    printf("%d", num * num);
    
}