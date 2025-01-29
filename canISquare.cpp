#include<bits/stdc++.h>
using namespace std;

bool canSquare(long long n) {
    long long low = 1, high = 1e9;
    while (low<=high) {
        long long mid = low + (high-low)/2;
        long long val = mid * mid;
        if (val == n) return true;
        if (val < n) low = mid + 1;
        else high = mid - 1;
    }
    return false;
}

int main() {
    int t;
    cin>>t;
    while (t-- >0) {
        int buckets;
        cin>>buckets;
        vector<int> nums(buckets);
        for (int i = 0; i < buckets; i++) {
            cin>>nums[i];
        }
        long long summ = accumulate(nums.begin(), nums.end(), 0);
        if (canSquare(summ)) cout<<"YES" << endl;
        else cout<< "NO" << endl;
    }
    return 0;
}