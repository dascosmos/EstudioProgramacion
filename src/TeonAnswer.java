/**
 * Created by david on 20/01/18.
 */
public class TeonAnswer {

    public int answer(int[] t){
        int min = t[t.length-1];
        int pos = 0;
        for(int i = 0;i<t.length;i++){
            if(min>t[i]){
                min = t[i];
                pos = i+1;
            }
        }
        return pos;
    }
}
