//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution{   
public:
    long maximumSumSubarray(int K, vector<int> &Arr , int N){
              
    long sum = 0; 
    long maxi = INT_MIN; 

    for (int i = 0; i < K; i++) {
        sum += Arr[i];
    }

    maxi = sum; 

    for (int i = K; i < N; i++) {
        sum += Arr[i] - Arr[i - K]; 
        maxi = max(maxi, sum); 
    }

    return maxi; 
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N,K;
        cin >> N >> K;;
        vector<int>Arr;
        for(int i=0;i<N;++i){
            int x;
            cin>>x;
            Arr.push_back(x);
        }
        Solution ob;
        cout << ob.maximumSumSubarray(K,Arr,N) << endl;
    }
    return 0; 
} 
// } Driver Code Ends