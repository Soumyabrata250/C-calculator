#include <bits/stdc++.h>
using namespace std;

void addition()
{
    int a, b;
    cout << "Enter two numbers:";
    cin >> a >> b;
    cout << "Sum of " << a << " " << b << " are:" << a + b;
}

int main()
{
    int N;
    cout << "Please enter the number for the corresponding operation:\n";
    cout << "1: ADDITION\n";
    cout << "2: SUBTRACTION\n";
    cout << "3: MULTIPLICATION\n";
    cout << "4: DIVISION\n";
    cin >> N;
    switch (N)
    {
    case 1:
        addition();
        break;
    case 2:
        subtraction();
        break;
    case 3:
        multiplication();
        break;
    case 4:
        division();
        break;

    default:
        cout << "PLEASE ENTER VALID NUMBER" break;
    }

    return 0;
}