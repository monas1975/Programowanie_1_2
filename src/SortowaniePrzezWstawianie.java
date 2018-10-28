public class SortowaniePrzezWstawianie {

    public static void main(String[] args){

        int[] tablica = {5,2,1,8,7,9,3};

        for (int i=0; i< tablica.length;i++){
            System.out.print(tablica[i] + " , ");
        }



        sortowaniePrzezWstawianie(tablica, 0);
        System.out.println("");
        for (int i=0; i< tablica.length;i++){
            System.out.print(tablica[i] + " , ");
        }
        System.out.println("");
        System.out.println("Szybkie sortowanie");
        int[] tablica2 = {5,2,1,8,7,9,3,4};

        for (int i=0; i< tablica2.length;i++){
            System.out.print(tablica2[i] + " , ");
        }
        System.out.println("");
        System.out.println("bbbbbb");
        szybkieSortowanie(tablica2,0,tablica2.length-1);
        System.out.println("");
        System.out.println("bbbbbb");
        for (int i=0; i< tablica2.length;i++){
            System.out.print(tablica2[i] + " , ");
        }

        System.out.println("Ala".compareTo("Ola"));
        System.out.println("Ola".compareTo("Ola"));

    }


    public static int[]  sortowaniePrzezWstawianie(int[] tab, int n){
        int x,i,j = tab.length -2;

        while(j>=0){
            x= tab[j];
            i=j+1;
            while((i<tab.length)&&(x>tab[i])){
                tab[i-1] = tab[i];
                i++;
            }
            tab[i-1] = x;
            j--;

        }
        return tab;
         }

         public static int[] szybkieSortowanie(int[] array, int left, int right){
             int  i =0; //szuka do przedostatniej pozycji
             int j=0;   //zapamietuje miejsce wstawienia elementow mniejszych od piwvotu
             int pivot =0;
             int temp;
             //wyznaczam element srodkowy 'pivot'

              i = (left+right)/2;
             pivot = array[i];
             array[i] = array[right];
             //zmien z ostatniemelementem zbioru

             for(j=i=left;i<right;i++)
                 if(array[i]<pivot){
                     temp =array[i];
                     array[i] = array[j];
                     array[j] = temp;
                     j++;
                 }
                 array[right] = array[j];
                 array[j] = pivot;
                 if (left<j-1) szybkieSortowanie(array,left,j-1);
                 if(j+1<right) szybkieSortowanie(array,j+1,right);
                 return array;
             }


         }








