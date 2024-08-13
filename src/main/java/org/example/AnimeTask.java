package org.example;// ✨ Этот класс был создан Николасом
// 📅 Дата создания: 14.08.2024
// ⏰ Время создания: 0:23
// 🏢 Корпорация: ɴɪɢʜᴛᴡɪꜱᴇᴅᴇᴠ

import java.util.*;

public class AnimeTask {
    private static Map<String, Boolean> anime = new HashMap<>();
    List<String> sortedKeys = new ArrayList<>(anime.keySet());
    private String prefix;

    public void viewedAnime() {
        int numeration = 0;
        Collections.sort(sortedKeys);
        for (String media : sortedKeys) {
            Boolean status = anime.get(media);
            prefix = (status != null && status) ? "\nСтатус: Просмотрено " : "\nСтатус: В процессе";
            numeration++;
            System.out.println(numeration + ". " + media + prefix);
        }
    }

    public static Map<String, Boolean> getAnime() {
        return anime;
    }
}
