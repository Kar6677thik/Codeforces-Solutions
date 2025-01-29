#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s = "codeforces";
    int n;
    cin >> n;
    int count = 0;
    while (n > 0)
    {
        count = 0;
        string t;
        cin >> t;
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] != t[i])
            {
                count++;
            }
        }
        cout << count << endl;
        n--;
    }
    return 0;
}