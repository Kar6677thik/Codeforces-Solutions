#include <bits/stdc++.h>
using namespace std;

long long alternatingSum(vector<int> &nums, int n)
{
    long long alt = 1;
    long long sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += nums[i] * alt;
        alt *= -1;
    }
    return sum;
}

int main()
{
    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n = 0;
        cin >> n;
        vector<int> nums(n);
        for (int i = 0; i < n; i++)
        {
            cin >> nums[i];
        }
        cout << alternatingSum(nums, n) << endl;
    }
    return 0;
}