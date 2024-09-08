 #include<iostream>
 #include<vector>
 using namespace std;


 class Solution {
  public:
    // Function returns the second
    // largest elements
    int print2largest(vector<int> &arr) {
        // Code Here
        int largest = arr[0];
        int smallest = arr[0];
        
        int secondSmallest = INT32_MAX;
        int secondLargest = INT32_MIN;
        
        for(int i=0; i<arr.size(); i++) {
            if(largest <= arr[i]) {
                largest = arr[i];
            }
            if (smallest >= arr[i]) {
                smallest = arr[i];
            }
        }
        
        for (int i=0; i<arr.size(); i++) {
            if (secondLargest <= arr[i] && arr[i] != largest) {
                secondLargest = arr[i];
            }
            if (secondSmallest >= arr[i] && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        
        return secondLargest;
        
    }
};

int main() {
Solution s1;
vector<int> arr = {10, 10};
int ans = s1.print2largest(arr);
cout << ans;
return 0;
}


