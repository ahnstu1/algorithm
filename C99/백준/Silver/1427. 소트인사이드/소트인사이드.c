#include <unistd.h>
 
int main()
{
    static int num[10];
    char       input[11];
    int        idx;
    char       output;
    
    read(0, input, 11);
    idx = 0;
    while (input[idx])
        num[input[idx++] - '0']++;
    for (int i = 9; i >= 0; i--)
    {
        output = i + '0';
        for (int j = 0; j < num[i]; j++)
        {
            write(1, &output, 1);
        }
    }
    write(1, "\n", 1);
    return 0;
}
