package encryption;

public class App 
{
    public static void main(String arg[]) 
    {

        String keys = "12";
        String codes = "my name is rounak";
        StringBuilder result = new StringBuilder();

        char[] codeList = codes.toCharArray();
        char[] keyList  = keys.toCharArray();

        int maxCount = keys.length();
        System.out.println("The length is "+maxCount);
        int i = 0;

         for (Character code : codeList) {

             int key = Character.getNumericValue(keyList[i]);

                 if(key % 2 == 0)
                    {
                      int res = code+key;
                      result.append((char)res);
                    }
                    else
                    {
                       int res = code-key;
                      result.append((char)res);
                    }
                 i++;
                 if(i==maxCount)
                 {
                    i = 0;
                 }
             }
         System.out.println("The result is "+result.toString());
        }
}
