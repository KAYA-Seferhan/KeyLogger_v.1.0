//Gerekli Kütüphanelerin Projeye Dahil Edilmesi.
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.time.LocalDateTime;

//Klavye loglama işlemi için gerekli sınıfın dahil edildiği bir sınıf tanımlaması.
public class KlavyeLogger implements KeyListener {
    Logger nesnem = new Logger();

    //Log işleminin aktifliği için kontrol değişkeni.
    private boolean klavyeloglama = false;
    public void setKlavyeloglama(boolean klavyeloglama) {
        this.klavyeloglama = klavyeloglama;
    }

    //Klavye tuşuna basıldığında yapılacak işlemler.
    @Override
    public void keyPressed(KeyEvent e) {
        if (klavyeloglama){
            try {
                //Basılan tuş sayı yada harf dışında ise ne olduğunun karşılaştırılarak bulunması.
                LocalDateTime timestamp = LocalDateTime.now();
                if (!Character.isLetterOrDigit(e.getKeyChar())){
                    if (e.getKeyCode()==KeyEvent.VK_ENTER){
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Enter\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Back Space\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_TAB) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Tab\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SHIFT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Shift\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_CONTROL) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Ctrl\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_ALT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Alt\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PAUSE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Pause\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_CAPS_LOCK) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Caps\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Esc\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SPACE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Space\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PAGE_UP) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Page Up\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PAGE_DOWN) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Page Down\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_END) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"End\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_HOME) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Home\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"←\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_UP) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"↑\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"→\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"↓\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_COMMA) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \",\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_MINUS) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"-\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PERIOD) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \".\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SLASH) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"/\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SEMICOLON) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \";\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_EQUALS) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"=\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_MULTIPLY) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"*\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_ADD) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"+\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SUBTRACT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"-\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DECIMAL) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \".\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DIVIDE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"/\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DELETE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Del\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_NUM_LOCK) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Num Lock\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SCROLL_LOCK) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Scroll Lock\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F1) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F1\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F2) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F2\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F3) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F3\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F4) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F4\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F5) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F5\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F6) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F6\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F7) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F7\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F8) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F8\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F9) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F9\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F10) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F10\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F11) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F11\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F12) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"F12\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PRINTSCREEN) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"PrtScr\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_INSERT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Ins\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_WINDOWS) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Windows\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_CONTEXT_MENU) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Windows Context Menu\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"Bilinmeyen Tuş\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    }
                }
                else {
                    nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Basıldı: \"%c\"\n", nesnem.zamandamgasi(timestamp), e.getKeyChar()));
                    nesnem.logyazici.flush();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    //Klavye tuşu bırakıldığında yapılacak işlemler.
    @Override
    public void keyReleased(KeyEvent e) {
        if (klavyeloglama){
            try {
                LocalDateTime timestamp = LocalDateTime.now();
                //Bırakılan tuş sayı yada harf dışında ise ne olduğunun karşılaştırılarak bulunması.
                if (!Character.isLetterOrDigit(e.getKeyChar())){
                    if (e.getKeyCode()==KeyEvent.VK_ENTER){
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Enter\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Back Space\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_TAB) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Tab\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SHIFT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Shift\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_CONTROL) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Ctrl\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_ALT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Alt\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PAUSE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Pause\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_CAPS_LOCK) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Caps\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_ESCAPE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Esc\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SPACE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Space\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PAGE_UP) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Page Up\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PAGE_DOWN) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Page Down\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_END) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"End\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_HOME) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Home\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"←\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_UP) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"↑\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"→\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"↓\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_COMMA) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \",\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_MINUS) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"-\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PERIOD) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \".\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SLASH) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"/\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SEMICOLON) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \";\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_EQUALS) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"=\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_MULTIPLY) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"*\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_ADD) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"+\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SUBTRACT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"-\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DECIMAL) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \".\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DIVIDE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"/\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_DELETE) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Del\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_NUM_LOCK) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Num Lock\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_SCROLL_LOCK) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Scroll Lock\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F1) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F1\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F2) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F2\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F3) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F3\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F4) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F4\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F5) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F5\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F6) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F6\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F7) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F7\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F8) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F8\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F9) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F9\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F10) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F10\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F11) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F11\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_F12) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"F12\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_PRINTSCREEN) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"PrtScr\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_INSERT) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Ins\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_WINDOWS) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Windows\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else if (e.getKeyCode()==KeyEvent.VK_CONTEXT_MENU) {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Windows Context Menu\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    } else {
                        nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"Bilinmeyen Tuş\"\n", nesnem.zamandamgasi(timestamp)));
                        nesnem.logyazici.flush();
                    }
                }
                else {
                    nesnem.logyazici.write(String.format("[%s] Klavyeden Tuş Bırakıldı: \"%c\"\n", nesnem.zamandamgasi(timestamp), e.getKeyChar()));
                    nesnem.logyazici.flush();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //İlgili sınıfa dahil edilen dinleyici sınıflar gereği tanımlanması gereken methodlar, isteğe bağlı geliştirilebilir.
    }
}
