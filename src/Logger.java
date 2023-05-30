//Gerekli Kütüphanelerin Projeye Dahil Edilmesi.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

//Log işlemlerinin kapsayan sınıfın tanımlanması.
public class Logger {
    //İlgili sınıf değişkenlernin tanımlanması.

    //Özel değişkenin ayarlanması için gerekli setter-getter methodları.
    private long GONDERIM_SURESI;
    public long getGONDERIM_SURESI() {
        return GONDERIM_SURESI;
    }
    public void setGONDERIM_SURESI(long GONDERIM_SURESI) {
        this.GONDERIM_SURESI = GONDERIM_SURESI * 60 * 1000;
    }

    //Özel değişkenin ayarlanması için gerekli setter-getter methodları.
    private int LOG_BOYUTU;
    public int getLOG_BOYUTU() {
        return LOG_BOYUTU;
    }
    public void setLOG_BOYUTU(int LOG_BOYUTU) {
        this.LOG_BOYUTU = LOG_BOYUTU * 1024 * 1024;
    }

    //Özel değişkenin ayarlanması için gerekli setter-getter methodları.
    private String LOG_DOSYASI = "log.txt";
    public String getLOG_DOSYASI() {
        return LOG_DOSYASI;
    }

    static BufferedWriter logyazici;
    private static Timer emailzamanlayici;

    //Log dosyasının boyutunun sıfırlanması için gerekli method.
    void logsifirla(){
        try {
            logyazici.close();
            logyazici = new BufferedWriter(new FileWriter(getLOG_DOSYASI(), false));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Zamanlayıcıyı başlatmak için gerekli method.
    void zamanlayicibaslat(){
        Mailat mailnesnesi = new Mailat();
        emailzamanlayici = new Timer();
        emailzamanlayici.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                mailnesnesi.MailGonder();
                File dosya = new File(getLOG_DOSYASI());
                if (dosya.length() > getLOG_BOYUTU()) {
                    logsifirla();
                }
            }
        }, getGONDERIM_SURESI(), getGONDERIM_SURESI());
    }

    //Zamanlayıcıyı durdurmak için gerekli method.
    void zamanlayicidurdur(){
        emailzamanlayici.cancel();
    }

    //Loglamayı başlatmak için gerekli method.
    void logger(){
        try {
            logyazici = new BufferedWriter(new FileWriter(getLOG_DOSYASI(), true));
            zamanlayicibaslat();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    //Log yazılırken kullanılan zaman damgası methodu.
    String zamandamgasi(LocalDateTime timestamp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        return timestamp.format(formatter);
    }
}
