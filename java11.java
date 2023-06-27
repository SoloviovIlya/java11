import java.util.HashMap;
import java.util.Map;

public class java11{
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        System.out.println(getCondition(params1));
    }
 
    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder result = new StringBuilder("");
 
        for (Map.Entry<String, String> pair: params.entrySet()){
            try{
                if (!pair.getValue().equals(null)){
                    if(result.toString().length() > 1) {
                        result.append(" and ");
                    }
                    result.append(pair.getKey() + " = \'")
                            .append(pair.getValue() + "\'");
                }
            }catch (NullPointerException e){}
        }
        return result;
    }
}
