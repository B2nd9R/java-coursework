// ريبو قيت هب : لتجميع مشاريع جافا. بالانجلش: GitHub Repository: For Collecting Java Projects.

public class Main {
    public static void main(String[] args) {
        int [] a={43, 23, 12, 54, 34, 65, 76, 87, 98, 9}; // مصفوفة ارقام عشوائية

        // طباعة العناصر في المصفوفة
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        // إيجاد أكبر رقم في المصفوفة
        int max=a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max: " + max); // طباعة أكبر رقم في المصفوفة
    }
}