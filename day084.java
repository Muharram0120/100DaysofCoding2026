include <iostream>
using namespase std;

int main(){
  int [5] data;
  int max = data[0];
  for(int i = 0; i<data.length; i++){
    cin >> data[i];
    if(data[i] > max){
      max = data[i]
    }
  }
  cout << max;
}
