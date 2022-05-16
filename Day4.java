import java.util.Stack;

class ptoi
{
    static boolean isoperand(char x)
    {
        return (x >='a' && x <='z') || (x >='A' && x <='Z');
    }
    static String getInfix(String s)
    {
        Stack<String> s1 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(isoperand(s.charAt(i)))
            {
                s1.push(s.charAt(i)+"");
            }
            else
            {
                String op1 = s1.peek();
                s1.pop();
                String op2 = s1.peek();
                s1.pop();
                s1.push("(" + op2 + s.charAt(i) +
                    op1 + ")");
            }
        }
        return s1.peek();
    }
}
public class stack
{
    public static void main(String[] args) {
        String a = "ab*c+";
        System.out.println(ptoi.getInfix(a));    
    }
}
