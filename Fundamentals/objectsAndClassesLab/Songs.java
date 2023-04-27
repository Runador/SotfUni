package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");
            String typeSong = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song(typeSong, name, time);
            songs.add(song);
        }

        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
                for (Song song : songs) {
                    if (song.getTypeList().equals(typeList)) {
                        System.out.println(song.getName());
                    }
            }
        }

    }

    private static class Song {
        private String typeList;
        private String name;
        private String time;

        private Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return typeList;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
    }
}
