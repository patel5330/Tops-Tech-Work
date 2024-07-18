#include<iostream>
using namespace std;
class Shape{
    public:
    void  setWidht(int w){
        Widht=w;
    }
    void setHeight(int h){
        Height=h;
    }
    protected:
    int widht;
    int height;
};
class Rectangle:public Shape{
    public:
    int getArea(){
        return(widht * height)
    }

};
int main(){
    Rectangle rect;
    rect.setWidht(5);
    rect.setHeight(7);
    cout<<" Area of Rectangle:"<<rect.getArea()<<endl;
    return 0;
}