class Solution {
public:
    int strStr(string haystack, string needle) {
        int m=haystack.size();
        int n=needle.size();
        int i,j,k;
        int counter=0;
        for(i=0;i<m;i++){
            if(haystack[i]==needle[0]){
                for(j=0;j<n;j++){
                    if(haystack[i+j]==needle[j])
                        counter++;
                    else
                        break;
                    
                }
                }
            if(counter==n)
             return i;
        }
        
        
        return -1;
    }
};