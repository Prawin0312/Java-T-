import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Maps
{
    public static void main(String[] args)
    {
     TreeMap<String,String> map = new TreeMap<>();
     map.put("abc@gmail.com","abc@123");
     map.put("xyz@gmail.com","xyz@123");
     map.put("a","lll@123");
     map.put("xmdm@gmail.com","ppp@123");
	 map.put("xmdm@gmail.com","newpass");
     //System.out.println(map.size());
     //System.out.println(map.get("abc@gmail.com")); 
     //Set<String> keys=map.keySet();
     //for(String k:keys)
        //System.out.println(k+"  "+map.get(k));
     //Collection<String> values = map.values();
     //for(String v:values)
        //System.out.println(v);  
     Set<Entry<String,String>> set=map.entrySet();
     for(Entry<String,String> s: set)
     System.out.println(s.getKey()+"   "+s.getValue());	 
    }

}
