#include<bits/stdc++.h>
using namespace std;

string checker(string str) {
    string s = "hello";
    int index = 0;
    for (int i = 0; i < str.size(); i++) {
        if (str[i] == s[index]) index++;
        if (index == 5) break;
    }
    if (index == 5) return "YES";
    return "NO";
}

int main() {
    string str;
    cin>>str;
    cout<<checker(str);
    return 0;
}