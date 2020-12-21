#include <iostream>

using namespace std;

int main()
{
    int sum,i,j,a[250],k;
    for(i=0;i<200;i++)
        {

        cin>>a[i];
        }
        for(k=0;k<200;k++)
        {
            for(j=k;j<200;j++)
                {
                    for(i=k;i<200;i++)
                        {
                            sum = a[i]+a[j]+a[k];
                            if(sum==2020)
                                {
                                    cout<<endl<<a[i]*a[j]*a[k]<<endl;
                                    break;
                                }

                        }
                }

        }

    return 0;
}
