package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(10);

    // тестируем объекты радио
    @Test
    public void currentRadioStationеUnderMaxOverMin() {
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationеOverMax() {
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentRadioStationеUnderMin() {
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void currentVolumeUnerMaxOverMin() {
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMax() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeUnderMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    // тестируем переключение станций
    @Test
    public void changeOverLastRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderFirstRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.next();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(4);
        radio.prev();
        assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void changeOverPenultRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.next();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderAfterTheFirstRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.prev();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    // тестируем переключение громкости
    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(100);
        radio.volumePlus();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(0);
        radio.volumeMinus();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(49);
        radio.volumePlus();
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(70);
        radio.volumeMinus();
        assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    public void volumeDownUnderAfterMin() {
        radio.setCurrentVolume(1);
        radio.volumeMinus();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeOverPenultMax() {
        radio.setCurrentVolume(99);
        radio.volumePlus();
        assertEquals(100, radio.getCurrentVolume());
    }
}