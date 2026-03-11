class Solution {
    List<String> result= new ArrayList<>();
    Map<Character,String> map=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return result;
        }
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
         map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(0,"",digits);
        return result;
    }
    public void backtrack(int index,String current,String digits){
        if(current.length()==digits.length()){
            result.add(current);
            return;
        }
        String letters=map.get(digits.charAt(index));
        for(int i=0;i<letters.length();i++){
            backtrack(index+1,current+letters.charAt(i),digits);
        }
    }
}
