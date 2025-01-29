#include<bits/stdc++.h>
using namespace std;

int main() {
        int count = 0;
        int num;
        cin>>num;
        bool cond = false;
        while (num != 0) {
            if (num % 10 != 4 && num % 10 != 7) {
                cond = true;
            }
            if (num % 10 == 4 || num % 10 == 7) {
                count++;
            }
            num /= 10;
        }
        if (cond == true && (count % 4 == 0 || count % 7 == 0)) {
            cout<<"YES"<<endl;
        }
        else {
            cout <<"NO"<<endl;
        }
        
    return 0;
}