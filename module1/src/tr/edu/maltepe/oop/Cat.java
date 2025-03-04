package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {
    private String name;
    private String breed; // Kedi cinsi

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void meow() {
        System.out.println(name + " (" + breed + ") miyavlıyor!");
        try {
            File soundFile = new File("/Users/alper/IdeaProjects/my-cat-class-Alperium/module1/miyav.wav"); // Ses dosyası proje klasöründe olmalı
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Ses çalınamadı: " + e.getMessage());
        }
    }
}

