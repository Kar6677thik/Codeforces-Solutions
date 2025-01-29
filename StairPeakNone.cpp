#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    int a;
    int b;
    int c;
    while (t--> 0)
    {
        cin >> a >> b >> c;
        if (b > a && c > b)
        {
            cout << "STAIR" << endl;
        }
        else if (b > a && b > c)
        {
            cout << "PEAK" << endl;
        }
        else
        {
            cout << "NONE" << endl;
        }
    }
    return 0;
}