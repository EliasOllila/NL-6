public class Main {
    public static void main(String[] args) {
        int[] a={4,4,6,11,-2,3};
        int[] b={5,11,11,-3,3,5};
        System.out.print("sym diff: ");
        symDiff(a,b);
    }
    static void symDiff(int[] a, int[] b)
    {
        System.out.print(traverseDiff(a,b));
        System.out.print(traverseDiff(b,a));
    }
    static String traverseDiff(int[] x, int[] y)
    {

        String store="";
        for(int i=0; i<x.length; i++)
        {
            boolean found=true;
            for(int n=0; n<x.length; n++)
                if(x[i]==y[n])
                    found=false;
            if(found==true)
                store=store+x[i]+" ";
        }
        return store;
    }
}