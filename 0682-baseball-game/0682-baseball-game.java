class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> Stack=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                Stack.pop();
            }else if(op.equals("D")){
                Stack.push(2*Stack. peek());
            }else if(op.equals("+")){
                int top=Stack.pop();
                int newtop =top+Stack.peek();
                Stack.push(top);
                Stack.push(newtop);
            }else{
                Stack.push(Integer.parseInt (op));
            }
        }
        int total=0;
        for(int score:Stack ) total+=score;
        return total;
        
    }
}