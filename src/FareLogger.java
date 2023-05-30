//Gerekli Kütüphanelerin Projeye Dahil Edilmesi.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.time.LocalDateTime;

//Fare loglama işlemi için gerekli sınıfların dahil edildiği bir sınıf tanımlaması.
public class FareLogger implements MouseListener, MouseWheelListener, MouseMotionListener {
    Logger nesnem = new Logger();

    //Log işleminin aktifliği için kontrol değişkeni.
    private boolean fareloglama = false;
    public void setFareloglama(boolean fareloglama) {
        this.fareloglama = fareloglama;
    }

    //Fare tuşuna basıldığında yapılacak işlemler.
    @Override
    public void mousePressed(MouseEvent e) {
        if (fareloglama){
            try {
                //Fare işaretçisinin ekrandaki konunmunu değişkenlere tanımlama.
                int x = MouseInfo.getPointerInfo().getLocation().x;
                int y = MouseInfo.getPointerInfo().getLocation().y;
                LocalDateTime zamandamgasi = LocalDateTime.now();

                //Basılan tuşun sağ sol kontrolü.
                if (SwingUtilities.isLeftMouseButton(e)) {
                    nesnem.logyazici.write(String.format("[%s] Fare Konumu: (x: %d, y: %d) : Fare Sol Tık Basıldı.\n", nesnem.zamandamgasi(zamandamgasi), x, y));
                    nesnem.logyazici.flush();
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    nesnem.logyazici.write(String.format("[%s] Fare Konumu: (x: %d, y: %d) : Fare Sağ Tık Basıldı.\n", nesnem.zamandamgasi(zamandamgasi), x, y));
                    nesnem.logyazici.flush();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    //Fare tuşu bırakıldığında yapılacak işlemler.
    @Override
    public void mouseReleased(MouseEvent e) {
        if (fareloglama){
            try {
                //Fare işaretçisinin ekrandaki konunmunu değişkenlere tanımlama.
                int x = MouseInfo.getPointerInfo().getLocation().x;
                int y = MouseInfo.getPointerInfo().getLocation().y;
                LocalDateTime zamandamgasi = LocalDateTime.now();

                //Basılan tuşun sağ sol kontrolü.
                if (SwingUtilities.isLeftMouseButton(e)) {
                    nesnem.logyazici.write(String.format("[%s] Fare Konumu: (x: %d, y: %d) : Fare Sol Tık Bırakıldı.\n", nesnem.zamandamgasi(zamandamgasi), x, y));
                    nesnem.logyazici.flush();
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    nesnem.logyazici.write(String.format("[%s] Fare Konumu: (x: %d, y: %d) : Fare Sağ Tık Bırakıldı.\n", nesnem.zamandamgasi(zamandamgasi), x, y));
                    nesnem.logyazici.flush();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    //Fare tekeri hareket ettirildiğinde yapılacak işlemler.
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (fareloglama){
            try {
                //Fare tekerinin yönünün kontrolü.
                int hareket = e.getWheelRotation();
                LocalDateTime timestamp = LocalDateTime.now();
                if (hareket < 0) {
                    nesnem.logyazici.write(String.format("[%s] Fare Tekeri Yukarı Doğru Döndürüldü.\n", nesnem.zamandamgasi(timestamp)));
                    nesnem.logyazici.flush();
                } else {
                    nesnem.logyazici.write(String.format("[%s] Fare Tekeri Aşağı Doğru Döndürüldü.\n", nesnem.zamandamgasi(timestamp)));
                    nesnem.logyazici.flush();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //İlgili sınıfa dahil edilen dinleyici sınıflar gereği tanımlanması gereken methodlar, isteğe bağlı geliştirilebilir.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //İlgili sınıfa dahil edilen dinleyici sınıflar gereği tanımlanması gereken methodlar, isteğe bağlı geliştirilebilir.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //İlgili sınıfa dahil edilen dinleyici sınıflar gereği tanımlanması gereken methodlar, isteğe bağlı geliştirilebilir.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //İlgili sınıfa dahil edilen dinleyici sınıflar gereği tanımlanması gereken methodlar, isteğe bağlı geliştirilebilir.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //İlgili sınıfa dahil edilen dinleyici sınıflar gereği tanımlanması gereken methodlar, isteğe bağlı geliştirilebilir.
    }
}
