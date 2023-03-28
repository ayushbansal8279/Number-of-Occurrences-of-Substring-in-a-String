public class Main {
    public static void main(String[] args) {
        String str="AAABAAAAA";
        String sub="AA";
        int index=0;
        int count=0;
        while (true){
            index=str.indexOf(sub, index);
            if(index!=-1){
                count++;
                index+=sub.length();
            }
            else break;
        }
        System.out.println(count);
    }
}
