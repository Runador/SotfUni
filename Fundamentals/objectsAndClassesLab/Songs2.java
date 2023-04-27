package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String typeList = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String input = scanner.nextLine();

        if (input.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(input)) {
                    System.out.println(song.getName());
                }
            }
        }
    }

}

class Song {

    private String typeList;
    private String name;
    private String time;

    /*public objectsAndClassesLab.Song (String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }*/

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
