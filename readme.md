# TUGAS 1 ASISTENSI ALPRO - Jumat, 11 April 2019
NAMA  : RIDHO NUR ROHMAN WIJAYA
NRP   : 06111840000065

## DESKRIPSI SOAL
Input : Koefisien $a,b,c$ dari polinomial $P_2(x)=ax^2+bx+c$ dimana $a\neq0$.

Output :

1. Diskriminan
2. Akar-akar dari polinomial
3. Titik stasioner
4. Kecekungan Kurva
5. Nilai maksimum/minimum lokal

## METODE PENYELESAIAN
Diberikan suatu polinomial berderajat dua $P_2(x)$, dimana:

$P_2(x)=ax^2+bx+c$, dimana $a\neq0$; dan

Cara mencari akar-akar polinomial berderajat 2 secara eksak (*exact value*), $P_2(x)$ adalah dengan mencari nilai $x$ yang menyebabkan $P_2(x)=0$. Hal ini sudah diperlajari pada jenjang sekolah dahulu dengan menggunakan formula :

$x_{12}=\dfrac{-b\,\pm\,\sqrt{D}}{2a}$

dimana $D$ menyatakan diskriminan, dengan $D=b^2-4ac$.

Kemudian, dari polinomial tersebut didapat turunan pertama terhadap $x$ yaitu $P'_2(x)=2ax+b$. Untuk mencari titik stasioner dari kurva tersebut dicari suatu garis lurus dengan gradien yang sejajar sumbu $x$. Dengan kata lain 

$m=P'_2(x)=0$. 

Artinya, $x=-\dfrac{b}{2a}$ disebut absis titik stasioner dari $P_2(x)$. Lalu, untuk ordinat titik stasioner diberikan oleh 

$P_2(-\frac{b}{2a})=a(-\frac{b}{2a})^2+b(-\frac{b}{2a})+c=-\dfrac{b^2-4ac}{4a}=-\dfrac{D}{4a}$.

Sehingga, titik stasioner yang didapat adalah $(\frac{-b}{2a},-\frac{D}{4a})$.

Untuk mengecek kecekungan kurva, perlu dicari nilai dari turunan kedua $P''_2(x)=2a$. Bila $a>0$, maka kurva cekung ke atas (membuka ke atas). Bila $a<0$, maka kurva cekung ke bawah (membuka ke bawah).

Penentuan nilai maksimum / minimum lokal didapat dari nilai stasioner.

## Contoh Input - Output (I/O)
~~~~
Input :
0 1 -3

Output :
Nilai a tidak boleh 0
~~~~
~~~~
Input : 1 -2 3

Output :
Polinomial x^2 -2x -3 memiliki
1. Diskriminan               : 16
2. Akar-akar dari polinomial : 3 dan -1
3. Titik stasioner           : (1,-4)
4. Kecekungan Kurva          : Atas
5. Nilai minimum lokal       : -4
~~~~

## input yang harus di run:
~~~~
Input : -2 3 0

Output :
Polinomial -2.0x^2 + 3.0x + 0.0 memiliki
1. Diskriminan			: 9.0
2. Akar-akar dari polinomial	: 0.0 dan 1.5
3. Titik stasioner		: (0.75,1.125)
4. Kecekungan kurva		: Bawah
5. Nilai maksimum lokal		: 1.125
~~~~
~~~~
Input : 1 -2 1

Output :
Polinomial 1.0x^2 - 2.0x + 1.0 memiliki
1. Diskriminan			: 0.0
2. Akar-akar dari polinomial	: 1.0
3. Titik stasioner		: (1.0,0.0)
4. Kecekungan kurva		: Atas
5. Nilai minimum lokal		: 0.0
~~~~
~~~~
Input : -3 0 3

Output :
Polinomial -3.0x^2 + 0.0x - 3.0 memiliki
1. Diskriminan			: -36.0
2. Akar-akar dari polinomial	: 1.0i dan -1.0i
3. Titik stasioner		: (0.0,-3.0)
4. Kecekungan kurva		: Bawah
5. Nilai maksimum lokal		: -3.0
~~~~
~~~~
Input : 0 0 0

Output :
Nilai a tidak boleh 0
~~~~

## screenshot hasil running
![-230](https://user-images.githubusercontent.com/49511033/56494597-f545e900-651c-11e9-8efc-6849cac473d2.PNG)
![1-21tugas1](https://user-images.githubusercontent.com/49511033/56494601-fa0a9d00-651c-11e9-8bd8-28f5c7473853.PNG)
![-30-3tugas1](https://user-images.githubusercontent.com/49511033/56494611-00991480-651d-11e9-947e-ffa85d49e2a0.PNG)
![000tugas1](https://user-images.githubusercontent.com/49511033/56494621-07c02280-651d-11e9-848e-1b41007dd072.PNG)

[link ke laporan](https://github.com/asistensi-matematika/tugas1-RinRoya/blob/master/RidhoNurRohmanWijaya_Tugas1_Solution.java)
