#include<iostream>
using namespace std;

class temp
{
    public:
    void function1()
    {
        cout<<"hello i am parent/base class"<<endl;
    }
	virtual void show() =0; //pure virtual function 
	//if i will not give the defination of this function in child class it will give the error

};
class temp2:public temp
{
    public:
    void function1()
    {
        cout<<"hello i am child/derived class"<<endl;
    }
	void show()
	{
		cout<<"hello i am body of pure virtual function "<<endl;
	}
};
int main()
{
    //temp2 obj=temp(); //gives error
     temp2 obj=temp2(); //only gives the child's overridden  function data parent's same_named_function(overridden data will be hidden) 
    // temp obj=temp(); //gives parent  class data bcz parent class object is created
    obj.function1();
    return 0;
}