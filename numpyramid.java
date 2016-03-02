import java.io.Console;
public class numpyramid {
 
    public static void main(String[] args) 
{
    int i,j,rows;
    System.out.println("Enter the number of rows: ");
    Console console = System.console();
    rows = Integer.parseInt(console.readLine());
    for(i=1;i<=rows;++i)
    {
        for(j=1;j<=i;++j)
        {
           System.out.print(j);
        }
        System.out.print("\n");
    }


    for(i=rows;i>=1;--i)
    {
        for(j=1;j<=i;++j)
        {
           System.out.print(j);
        }
    System.out.print("\n");
    }
    
}
}