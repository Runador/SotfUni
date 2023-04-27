package objectsAndClassesLab.songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        //"{typeList}_{name}_{time}"
        // favourite_DownTown_3:14

        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs; i++) {

            String[] songData = scanner.nextLine().split("_");

            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            Song song = new Song(typeList, name, time);
            songs.add(song);

        }

        String input = scanner.nextLine();

        for (Song song : songs) {
            if (input.equals("all")) {
                System.out.println(song.getName());
            }
        }

        for (Song song : songs) {
            if (input.equals(song.getTypeList())) {
                System.out.println(song.getName());
            }
        }

    }

}
