
public class SumaNum2 {
	
    public int Suma (int [] array) {

        int num = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i]%10==2) {
                num = num+array[i];
            }
        }
        
        return num;
    }
    public int contPares (int [] array) {

        int num1 = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i]%10==2) {
                num1++;
            }
        }
        
        return num1;
    }
}
