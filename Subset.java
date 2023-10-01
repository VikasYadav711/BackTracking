
public class Subset {

    public static void findsubset(String str, int i, StringBuilder ans)
    {
        if(i== str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null set");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }

        findsubset(str, i+1, ans.append(str.charAt(i)));
        
        findsubset(str, i+1, ans.delete(ans.length()-1, ans.length()));
    }

    public static void main(String args[])
    {
        StringBuilder ans=new StringBuilder("");
        findsubset("abc", 0, ans);
    }

    
}
