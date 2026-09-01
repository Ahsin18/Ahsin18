public class Equilibrium 
{
    public static int findEquilibrium(int[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++)
            {
                leftsum+=arr[j];
            }
            for(int k=i+1;k<n;k++)
            {
                rightsum+=arr[k];
            }
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String ahsin [])
    {
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        int result=findEquilibrium(arr);
        if(result==-1)
        {
            System.out.println("No equilibrium index found");
        }
        else
        {
            System.out.println("Equilibrium index is: "+result);
        }
    }
}

