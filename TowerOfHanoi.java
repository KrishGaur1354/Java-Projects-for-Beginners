class TowerOfHanoi{
    static int count = 0;
    public static void toweOfHanoi(int n, String src,String help,String dest){
        if(n==1){
            //System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);
            count++;
            return;
        }
        toweOfHanoi(n-1,src,dest,help);
        //System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);
        toweOfHanoi(n-1,help,src,dest);
        count++;
    }
    public static void main(String[] args) {
        int n=100;
        toweOfHanoi(n,"S","H","D");
        System.out.println(count);
    }
}
//Time Complexity = O(2^n).