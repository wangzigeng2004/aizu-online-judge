#include <iostream>
#include <cmath>
using namespace std;
int main() {
  double x1, y1, x2, y2;
  cin >> x1 >> y1 >> x2 >> y2;
  cout << hypot(x2-x1, y2-y1) << endl;
  return 0;
}