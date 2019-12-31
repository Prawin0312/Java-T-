import java.util.StringTokenizer;
class Strtoken
{
  public static void main(String[] args)
  {
   String s= "Something to be,written and shown,to me";
   StringTokenizer st = new StringTokenizer(s,",");
   System.out.println(st.countTokens());
   while(st.hasMoreTokens())
    System.out.println(st.nextToken());
}
}
