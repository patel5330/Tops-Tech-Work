#include<iosteam>
#include<string>
using namespace std;
 class cricketer{
    protected:
    string name;
    int age;
    
    public:
    void input_data(string n ,int g){
    name=n;
    age=a;
 }
 };
 class batsman:publice cricketer{
    private:
     int total_runs;
     float average_rens;
     int best_performance;

     public:
     void input_data_batsman(int total_runs,int best){
        total_runs=runs;
        best_performance=best;
     }
     void clculate_averge_runs(){
        average_rens=total_runs / 20;


     }
     void display_data(){
        cout<<"Batsman Name:"<<name<<endl;
        cout<<"age:"<<age<<endl;
        cout<<"Total Runs:"<<total_runs<<endl;
        cout<<"Average Runs:"<<average_rens<<endl;
        cout<<"Best Performance"<<best_performance<<endl;

     }
 };
 int main(){
    batsman player;
    player.input_data("playyer 1",25);
    player.input_data_batsman(500,1000);
    player.clculate_averge_runs();
    player.display_data();
    return 0;
 }

 }



















