#include<bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t-- > 0) {
        int n;
        cin>>n;
        string str;
        cin>>str;
        int longestDot = 0, curr = 0, numDots = 0;
        for (int i = 0; i < str.size(); i++) {
            if (str[i] == '#') {
                longestDot = max(longestDot, curr);
                curr = 0;
            }
            else {
                curr++;
                numDots++;
                longestDot = max(longestDot, curr);
            }
        }
        if (longestDot >= 3) cout<<"2"<<endl;
        else cout<<numDots<<endl;
    }
    return 0;
}