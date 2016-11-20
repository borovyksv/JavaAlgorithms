public class Euclidian
{
    public static void main(String[] args)
    {
        System.out.println(Euclidian(26, 39));
    }

    private static int Euclidian(int i, int i1)
    {
        while (true)
        {
            int temp = i1; //695
            i1=i%i1; //417
            if (i1==0) return temp;
            i=temp;
        }
    }
}
