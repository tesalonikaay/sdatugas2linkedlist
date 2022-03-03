import java.util.LinkedList;

public class tugas2
{
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("T");
        saya.add("e");
        saya.add("s");
        saya.add("a");
        saya.add("l");
        saya.add("o");
        saya.add("n");
        saya.add("i");
        saya.add("k");
        saya.add("a");
        saya.add("");
        saya.add("A");
        saya.add("s");
        saya.add("y");
        saya.add("e");
        saya.add("r");
        saya.add("a");
        saya.add("");
        saya.add("T");
        saya.add("a");
        saya.add("m");
        saya.add("p");
        saya.add("u");
        saya.add("b");
        saya.add("o");
        saya.add("l");
        saya.add("o");
        saya.add("n");
        
        System.out.println("Diketahui nama lengkap :");
        System.out.println(saya);
        System.out.println("");

        //1.Add character yang diinginkan
        saya.addFirst("M");
        saya.add(5,"J");
        saya.addLast("P");
        System.out.println("1. Output add karakter");
        System.out.println(saya);
        System.out.println("");

        //2.Sisipkan character yang diinginkan
        saya.set(4,"Z");
        saya.set(10,"B");
        System.out.println("2.Output sisip karakter");
        System.out.println(saya);
        System.out.println("");

        //3.Hapus beberapa karakter yang diinginkan
        saya.removeFirst();
        saya.remove(16);
        saya.remove(8);
        saya.removeLast();
        System.out.println("3.Output hapus karakter :");
        System.out.println(saya);
        System.out.println("");

        //4.Fungsi POP dan PUSH pada project
        saya.pop();
        System.out.println("4.Output POP :");
        System.out.println(saya);
        System.out.println("");
        
        saya.push("K");
        System.out.println("4.Output PUSH :");
        System.out.println(saya);
        System.out.println("");


    }
}