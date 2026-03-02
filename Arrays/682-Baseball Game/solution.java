class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> k=new ArrayList<>();
        for(String i :operations){
            if(i.equals("+")){
                k.add(k.get(k.size()-1) +k.get(k.size()-2));
            }
            else if(i.equals("D")){
                k.add(k.get(k.size()-1)*2);
            }else if(i.equals("C")){
                k.remove((k.size()-1));
            }else{
                k.add(Integer.parseInt(i));
            }
        }
        int sum=0;
        for(int i : k){
            sum+=i;
        }
        return sum;
    }
}
