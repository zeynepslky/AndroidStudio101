using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _21Aralık
{
    class Program
    {

        /* 1. Dışarıdan parametre olarak bir dik üçgenin 2 kenarı verilecek ve hipotenüsü hesdaplayıp geri döndürecek fonk.*/

        /*public static double hesapla (int a, int b)
        {
            double hipotenus = Math.Sqrt(a * a + b * b);
            Console.WriteLine(hipotenus);
            return hipotenus;
        }*/

        /* 2. Dik kenarları ve hipotenüsü verilen bir üçgenin dik üçgen olup olmadığını döndüren fonk. */

        /*public static bool kontrol( int d1, int d2, double h)
        {
            if (h == Math.Sqrt(d1 * d1 + d2 * d2) )
            {
                Console.WriteLine("Dik Üçgen.");
                return true;
            }
            else
            {
                Console.WriteLine("Dik Üçgen değil.");
                return false;
            }
        }*/


        /* 3.  Kullanıcıdan alınan sayının faktörüyerini geri döndüren foksiyon */

        /*public static int faktoriyelhesapla(int a)
        {
            int carpim = 1;

            if (a == 0 || a == 1)

                return 1;

            for (int i = 1; i <= a; i++)
            {
                carpim = carpim * i;
            }

            return carpim;
        }*/

        /* 4. İkinci dereceden bir denklemin köklerini bulan fonksiyon ( ax^2 + bx + c,  D = b^2 - 4ac */

        public static double kokhesapla(int a, int b, int c)
        {

            double D = b * b - 4 * a * c;

            if (D == 0)
            {
                double k = -b / 2 * a;
                Console.WriteLine("Eşit iki kök vardır.");
                return k;

            }
            else if (D > 0)
            {

                double k1 = (-b + Math.Sqrt(D)) / 2 * a;
                double k2 = (-b - Math.Sqrt(D)) / 2 * a;
                Console.WriteLine("İki farklı kök vardır.");
                Console.WriteLine("1. kök:");
                Console.WriteLine(k1);
                Console.WriteLine("2. kök");
                Console.WriteLine(k2);

            }


            else
                Console.WriteLine("Reel kök yoktur.");

        }


        /* 5. kulanıcıdan alınan sayı kadar Fibonacci serisini hesaplayan fonksiyon. */


        /*public static void fibonacci(int sayi)
        {
            int ilksayi = 0;
            int ikincisayi = 1;
            int toplam = 0;

            Console.Write(ilksayi + "\t");
            Console.Write(ikincisayi + "\t");

            for ( int i = 0; i < sayi - 2; i++ )
            {
                toplam = ilksayi + ikincisayi;
                ilksayi = ikincisayi;
                ikincisayi = toplam;

                Console.Write(toplam + "\t");
            }


        }*/



        static void Main(string[] args)
            {

            /* 1.
            Console.WriteLine("1. Kenarı giriniz:");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("2. Kenarı giriniz:");
            int b = Convert.ToInt32(Console.ReadLine());

            hesapla(a, b);
            */


            /* 2.  

            Console.WriteLine("1. Kenarı giriniz:");
            int d1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("2. Kenarı giriniz:");
            int d2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Hipotenüsü giriniz:");
            double h = Convert.ToDouble(Console.ReadLine());

            kontrol(d1,d2,h);
            */


            /* 3. 

            Console.WriteLine("Sayıyı giriniz:");
            int a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(faktoriyelhesapla(a));
            */



            /* 4.  */

            Console.WriteLine("a,b ve c'yi giriniz:");
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());
            int c = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(kokhesapla(a, b, c));
            

            /* 5. */

            /*Console.Write("Sayı gir:");
            int sayi = Convert.ToInt32(Console.ReadLine());

            fibonacci(sayi);
            */








            }
        
    }
}
