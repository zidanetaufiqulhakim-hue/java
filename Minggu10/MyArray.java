public class MyArray{
    public static void main(String args[]){
        double[] myList = new double[4];

        myList[0] = 1.9;
        myList[1] = 2.9;
        myList[2] = 3.4;
        myList[3] = 3.5;

        for(int i = 0; i < myList.length; i++){
        System.out.println(myList[i]);
        }

        // CARA 2
        System.out.println("\n CARA 2: Masukin Langsung Nilainya Juga Bisa");
        String[] namaBulan = {"Januari", "Febuary", "Maret", "April", 
        "Mei", "Juni", "July", "Agustus", "September", "Oktober", "Nopember", "Desember"};
        
        for(int i = 0; i < namaBulan.length; i++){
        System.out.println(namaBulan[i]);
        }
        
        // Pake For Each alias
        System.out.println("Pake Alias\n");
        for(double d : myList){
            System.out.println(d);
        }

        for(String s : namaBulan){
            System.out.println(s);
        }

        // Pengisian Nilai Arrray pake For
        System.out.println("\nPengisian Nilai Arrray pake For\n");
        
        int[] nilai = new int[4];
        for(int i = 0; i < nilai.length; i++){
            nilai[i] = i + 1;
            System.out.println(nilai[i]);
        }
    }
}