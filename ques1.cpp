#include <string>
#include <iostream>

using namespace std;

int main () {
    int N;
    scanf("%d", &N);
    for(int i = 1; i <= N; i++) {
        if(i % 15 == 0) {
            cout << "HelloWorld ";
        }
        else if (i % 3 == 0) {
            cout << "Hello ";
        }
        else if (i % 5 == 0) {
            cout << "World ";
        }
        else {
            cout << i << " ";
        }
    }
    return 0;
}
