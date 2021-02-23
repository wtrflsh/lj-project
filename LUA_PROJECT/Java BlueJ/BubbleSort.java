
/**
 * Write a description of class BubbleSort here.
 *
 * @author David L. Reimer
 * @version Coala
 */
public class BubbleSort
{
    private int temp;
    int[] array = new int[7];

    public BubbleSort()
    {
        int[] array = {1,2,0,0,3,1,2};

        for (int i=0; i<=array.length-1;i++)
            System.out.println((i+1) + " " + array[i]);

        System.out.println(" ");

        array = bubble(array);

        for (int i=0; i<=array.length-1;i++)
            System.out.println((i+1) + " " + array[i]);
    }

    public int[] bubble(int[] array){
        int j;
        for (int i= 1; i<=array.length; i++){

            j = i;
            if (j>0)
                while (swap(j, j+1, array))
                    j--;

        }
        return array;
    }

    public boolean swap(int a, int b, int[] table){

        if (a < 0 || a > (table.length-1)) // minus because arrays start at 0
            return false;
        if (b < 0 || b > (table.length-1))
            return false;

        if (table[a] > table[b]) {
            temp = table[a];
            table[a] = table[b];
            table[b] = temp;
            return true;
        }

        return false;

    }

}
