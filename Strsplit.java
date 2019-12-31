class Strsplit
{
  public static void main(String[] args)
  {
      String s="Something to be,written and shown,to me";
	  String[] s1= s.split(",");
	  for(int i=0;i<s1.length;i++)
	   System.out.println(s1[i]);
	}
}