

import java.util.ArrayList;
import java.util.Scanner;


public class Member1 {
public static ArrayList<MainMember1> MainMember1 = new ArrayList<>();
public static void main(String[] args) {
        MainMember1 s1 = new MainMember1();
        s1.setNama("Tiara");
        s1.setTeam("Kelas E");
        s1.setUmur("19");
        s1.setPenampilan(88);
        s1.setSuara(80);
        s1.setAttitude(80);

        MainMember1 s2 = new MainMember1();
        s2.setNama("JUVA");
        s2.setTeam("Kelas E");
        s2.setUmur("18");
        s2.setPenampilan(85);
        s2.setSuara(85);
        s2.setAttitude(85);

        MainMember1 s3 = new MainMember1();
        s3.setNama("MALA");
        s3.setTeam("Kelas E");
        s3.setUmur("19");
        s3.setPenampilan(87);
        s3.setSuara(79);
        s3.setAttitude(80);

        MainMember1 s4 = new MainMember1();
        s4.setNama("VITRI");
        s4.setTeam("Kelas E");
        s4.setUmur("18");
        s4.setPenampilan(83);
        s4.setSuara(85);
        s4.setAttitude(78);

        MainMember1.add(s1);
        MainMember1.add(s2);
        MainMember1.add(s3);
        MainMember1.add(s4);
        Output();
    }

    public static void Output() {
        for (int i = 0; i < MainMember1.size(); i++) {
            System.out.println("Nama\t: " + MainMember1.get(i).getNama());
            System.out.println("Team\t: " + MainMember1.get(i).getTeam());
            System.out.println("Umur\t: " + MainMember1.get(i).getUmur());
            System.out.println("Nilai\t: " + MainMember1.get(i).getNilai());
            System.out.println("========================");

        }

    }
}

        // TODO code application logic here
   
