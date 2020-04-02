#include <iostream>

using namespace std;

int main() {
    int x = 13;
    if (x == 13) {
        cout << 15 << endl;
    }
    x = 42;
    int a = 89;
    if (x >= a) {
        cout << a << endl;
    } else {
        cout << x << endl;
    }
    while (x < a) {
        x = x + 7;
        cout << x << endl;
    }
    return 0;
}