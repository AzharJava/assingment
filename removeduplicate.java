import java.util.*;
class duplicateRemove{
    //function to remove duplicate array.
    //create user define function.
    public static void removeDuplicate(int [] a){ 
        LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();  //scanner for create

        //adding elements to LinkedHashSet.

        for (int i=0; i<a.length; i++)
            set.add(a[i]);

        //print the element from LinkedHashSet
        System.out.print(set);

    }

    //now create main function.
    public static void main(String[] args) {
        int a[] = {5, 2, 6, 8, 6, 7, 5, 2, 8}; //array where duplicates number is 5, 6, 2, 8
        //calling function
        removeDuplicate(a);
    }
}



//output is:
//{5, 2, 6, 8, 7}
