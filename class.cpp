#include<bits/stdc++.h>
using namespace std;

class Car{
public:
  string brand;
  string color;
  int year;

  void start(){
    cout<<"Car is starting to move!"<<endl;
  }

  void accelerate(){
    cout<<"Car is speeding now"<<endl;
  }
};

int main(){

  Car c1;
  c1.brand="BMW";
  c1.color="black";
  c1.year=2022;
  cout<<"Car 1 is a "<<c1.brand<<" which was made in "<<c1.year<<" with "<<c1.color<<" polishing."<<endl;
  c1.start();

  Car c2;
  c2.brand="Toyota";
  c2.color="red";
  c2.year=2016;
  cout<<"Car 2 is a "<<c2.brand<<" which was made in "<<c2.year<<" with "<<c2.color<<" polishing."<<endl;
  c2.accelerate();

  return 0;
}