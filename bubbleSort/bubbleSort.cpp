#include <iostream>
using namespace std;

int main()
{
    int numbers[] = {5, 3, 5, 12, 23};
    int first;
    int second;
    int holder;
    int steps;

    for(first=0; first<4; first++){
        for(second=0; second<(4-first); second++){
            holder = numbers[second];
            if(numbers[second] > numbers[second+1]){
                numbers[second] = numbers[second+1];
                numbers[second+1] = holder;
            }
        }
    }

    cout<<"END RESULT: "<<endl;
    for(steps=0; steps<5; steps++){
        cout<<numbers[steps]<<" ";
    }
    cout<<endl;
    cout<<"------------"<<endl;
    return 0;
}
