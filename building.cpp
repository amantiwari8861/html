#include<iostream>
using namespace std;
class building1
{
	public:
	int cement;
	building1(int a)
	{
		cement=a;
	}
	void con()
	{
		cout<<"the value of cement is "<<cement<<endl; 
	}
};
int main()
{
	// int a;
	// cin>>a;
	// cout<<"the value of a= "<<a<<endl;
	building1 object(10);
	// building1 object1;
	// building1 object2;
	// cin>>object.cement;
	object.con();
	return 0;
}