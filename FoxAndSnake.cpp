#include <iostream>
using namespace std;

int main()
{
    int a, b;
    cin >> a >> b;
    bool l = true;
    for (int i = 1; i <= a; i++)
    {
        for (int j = 1; j <= b; j++)
        {
            if (i % 2 != 0)
            {
                cout << "#";
            }
            else
            {
                if (l)
                {
                    if (j == b)
                    {
                        cout << "#";
                    }
                    else
                    {
                        cout << "-";
                    }
                    l = !l;
                } else {
                    if (j == 1)
                    {
                        cout << "#";
                    }
                    else
                    {
                        cout << "-";
                    }
                    l = !l;
                }
            }
        }
        cout << endl;
    }
    return 0;
}