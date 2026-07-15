class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result=new ArrayList<>();
        int k=0;
        List<String> index=new ArrayList<>();
        
        for(int i=0;i<strs.length;i++){

            if(index.contains(strs[i])){
                continue;
            }
            
            char[] temp=strs[i].toCharArray();
            Arrays.sort(temp);
            result.add(new ArrayList<>());
            result.get(k).add(strs[i]);

            for(int j=i+1;j<strs.length;j++){
                
                if(strs[i].length()==strs[j].length()){
                    
                    char[] temp1= strs[j].toCharArray();
                    Arrays.sort(temp1);

                    if(Arrays.equals(temp,temp1)){
                        result.get(k).add(strs[j]);
                        index.add(strs[j]);
                    }

                }

            }

            k++;

        }

       return result;
    }
}
