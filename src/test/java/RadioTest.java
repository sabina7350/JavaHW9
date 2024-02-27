import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(99);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeImpossible() {
        radio.setCurrentVolume(101);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        radio.setCurrentVolume(1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeImpossible() {
        radio.setCurrentVolume(-2);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFM() {
        radio.setCurrentFM(9);

        int expected = 9;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFMMoreMax() {
        radio.setCurrentFM(10);

        int expected = 0;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setFMLessMin() {
        radio.setCurrentFM(-1);

        int expected = 0;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFM() {
        radio.setCurrentFM(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextFMAfterMax() {
        radio.setCurrentFM(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFM() {
        radio.setCurrentFM(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevFMAfterMin() {
        radio.setCurrentFM(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentFM();
        Assertions.assertEquals(expected, actual);
    }
}