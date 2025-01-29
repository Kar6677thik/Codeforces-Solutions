#include <iostream>

int main() {
    int t;
    std::cin >> t;
    while (t-- > 0) {
        long long can;
        std::cin >> can;
        long long a = can - 1;
        long long b = 1;
        int temp = 0;
        for (int i = 0; i < INT_MAX; i++) {
            if (b >= a) {
                int count = temp;
                std::cout << count << std::endl;
                break;
            }
            a--;
            b++;
            temp++;
        }
    }
    return 0;
}

