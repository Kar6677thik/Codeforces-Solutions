#include <iostream>
using namespace std;

int main() {
    int count = 0;
    int num;
    cin >> num;
    while (num != 0) {
        if (num % 10 == 4 || num % 10 == 7) {
            count++;
        }
        num /= 10;
    }
    cout << count << endl;
    if (count == 4 || count == 7) {
        cout<<"YES"<<endl;
    }
    else {
        cout << "NO" << endl;
    }

    return 0;
}
