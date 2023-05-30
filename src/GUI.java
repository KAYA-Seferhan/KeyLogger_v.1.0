//Gerekli Kütüphanelerin Projeye Dahil Edilmesi.
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.*;

//Arayüzün Ana Penceresi için sınıf oluşturulması.
public class GUI extends JFrame {
    //Kayıt ekranı için sınıfı oluşturulması
    public static class Kayit extends JFrame{
        //İlgili sınıf değişkenlernin tanımlanması.
        static String GONDEREN_MAIL;
        static String TOKEN;
        private JPanel kayiticerikpaneli;
        private JTextField gonderenmailalani;
        private JTextField tokenalani;

        public void kayitekrani() {
            try {
                //Arayüz penceresi stilinin ayarlanması.
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Throwable e) {
                e.printStackTrace();
            }
            //Pencerenin oluşturulması.
            JFrame kayitekrani = new JFrame("Kayıt");
            //Kapatma davranışının tanımlanması.
            kayitekrani.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            //Pencerenin görünür olarak ayarlanması.
            kayitekrani.setVisible(true);
            //Kapatma isteminin dinlenerek nasıl davranılacağının ayarlanması.
            kayitekrani.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    // Pencere kapatma istemiyle soru penceresinin açılması için gerekli tanımlama.
                    int secim = JOptionPane.showConfirmDialog(null, "Kayıt Penceresi yada Bu Pencereyi Kapatırsanız Uygulamadan Çıkılacaktır. Devam etmek istiyor musunuz?", "UYARI", JOptionPane.YES_NO_OPTION);
                    // Evet seçeneğine göre yapılacak işlemler.
                    if (secim == JOptionPane.YES_OPTION) {
                        //Penecenin kapatılarak uygulamanın sonlandırılması.
                        kayitekrani.dispose();
                        System.exit(0);
                    }
                    // Hayır seçeneğine göre yapılacak işlemler.
                    else if (secim == JOptionPane.NO_OPTION) {
                        //Önceki pencereye dönülmek için hiçbir işlem tanımlanmamıştır.
                    }
                    //Soru penceresinin kapatılması durumunda yapılacak işlemler.
                    else if (secim == JOptionPane.CLOSED_OPTION) {
                        //Penecenin kapatılarak uygulamanın sonlandırılması.
                        kayitekrani.dispose();
                        System.exit(0);
                    }
                }
            });
            //Boyut tanımlamaları.
            kayitekrani.setBounds(100, 100, 500, 250);
            //İçeriğin yer alacağı panelin tanımlanması.
            kayiticerikpaneli = new JPanel();
            //Kenarlık ayarlamaları.
            kayiticerikpaneli.setBorder(new EmptyBorder(5, 5, 5, 5));

            //İçerik panelinin pencereye eklenmesi.
            kayitekrani.setContentPane(kayiticerikpaneli);
            kayiticerikpaneli.setLayout(null);

            //Açıklayıcı metin ayarlanması ve içeriğe eklenmesi.
            JLabel mailmsj = new JLabel("Mail Adresiniz :");
            mailmsj.setFont(new Font("Tahoma", Font.PLAIN, 20));
            mailmsj.setBounds(10, 11, 150, 25);
            kayiticerikpaneli.add(mailmsj);

            //Açıklayıcı metin ayarlanması ve içeriğe eklenmesi.
            JLabel tokenmsj = new JLabel("Token :");
            tokenmsj.setFont(new Font("Tahoma", Font.PLAIN, 20));
            tokenmsj.setBounds(10, 47, 150, 25);
            kayiticerikpaneli.add(tokenmsj);

            //Metin girilecek alanın ayarlanması ve içeriğe eklenmesi.
            gonderenmailalani = new JTextField();
            gonderenmailalani.setBounds(170, 15, 300, 25);
            kayiticerikpaneli.add(gonderenmailalani);
            gonderenmailalani.setColumns(10);

            //Metin girilecek alanın ayarlanması ve içeriğe eklenmesi.
            tokenalani = new JTextField();
            tokenalani.setBounds(170, 51, 300, 25);
            kayiticerikpaneli.add(tokenalani);
            tokenalani.setColumns(10);

            //Buton ayarlanması ve eklemesi.
            JButton kaydetbtn = new JButton("Kaydet");
            //Butonun çalıştığında yapılacak işlemlerin tanımlanması.
            kaydetbtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //Metin kutusundan veri alınarak değişkenlere tanımlanması.
                    GONDEREN_MAIL=gonderenmailalani.getText();
                    TOKEN=tokenalani.getText();
                    //Pencerenin kapatılması.
                    kayitekrani.dispose();
                }
            });
            kaydetbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
            kaydetbtn.setBounds(112, 102, 250, 75);
            kayiticerikpaneli.add(kaydetbtn);
        }
    }

    //İlgili sınıf değişkenlernin tanımlanması.
    static String ALICI_MAIL;

    //Log alma işlemi için açılacak pencerenin açık olup olmaması durumu kontrolünü sağlayan değişken tanımı.
    private boolean logpenceresi = false;
    //Özel değişkenin ayarlanması için gerekli setter-getter methodları.
    public boolean isLogpenceresi() {
        return logpenceresi;
    }
    public void setLogpenceresi(boolean logpenceresi) {
        this.logpenceresi = logpenceresi;
    }
    private JPanel icerikpaneli;
    private JTextField SureAlani;
    private JTextField MailAlani;
    private JTextField BoyutAlani;

    //Main methodunun tanımlanması.
    public static void main(String[] args) {
        try {
            //Arayüz penceresi stilinin ayarlanması.
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Ana pencerenin çalıştırılması.
                    GUI frame = new GUI();
                    frame.setVisible(true);
                    //Kayıt penceresinin çalıştırılması.
                    Kayit kayitnesnem = new Kayit();
                    kayitnesnem.kayitekrani();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Ana uygulama penceresinin ayarlamaları için tanımlanmış method.
    public GUI() {
        //Ana pencerenin genel ayarlamalarının tanımlanması.
        setTitle("KeyLogger v.1.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 250);
        //İçerik panelinin tanımlanarak pencereye eklenmesi.
        icerikpaneli = new JPanel();
        icerikpaneli.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(icerikpaneli);
        icerikpaneli.setLayout(null);

        //Açıklayıcı metin ayarlanması ve içeriğe eklenmesi.
        JLabel SureYazisi = new JLabel("Mail Gönderme Aralıkları (DK) :");
        SureYazisi.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        SureYazisi.setBounds(10, 11, 300, 35);
        icerikpaneli.add(SureYazisi);

        //Açıklayıcı metin ayarlanması ve içeriğe eklenmesi.
        JLabel MailYazisi = new JLabel("Alıcı Mail Adresi :");
        MailYazisi.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        MailYazisi.setBounds(10, 57, 300, 35);
        icerikpaneli.add(MailYazisi);

        //Açıklayıcı metin ayarlanması ve içeriğe eklenmesi.
        JLabel BoyutYazisi = new JLabel("Max Log Dosyası Boyutu (MB) :");
        BoyutYazisi.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        BoyutYazisi.setBounds(10, 103, 300, 35);
        icerikpaneli.add(BoyutYazisi);

        //Metin girilecek alanın ayarlanması ve içeriğe eklenmesi.
        SureAlani = new JTextField();
        SureAlani.setBounds(320, 16, 250, 35);
        icerikpaneli.add(SureAlani);
        SureAlani.setColumns(10);

        //Metin girilecek alanın ayarlanması ve içeriğe eklenmesi.
        MailAlani = new JTextField();
        MailAlani.setBounds(320, 62, 250, 35);
        icerikpaneli.add(MailAlani);
        MailAlani.setColumns(10);

        //Metin girilecek alanın ayarlanması ve içeriğe eklenmesi.
        BoyutAlani = new JTextField();
        BoyutAlani.setBounds(320, 108, 250, 35);
        icerikpaneli.add(BoyutAlani);
        BoyutAlani.setColumns(10);

        //Onay Kutusu ayarlanması ve içeriğe eklenmesi.
        JCheckBox Farechckbx = new JCheckBox("Sadece Fare");
        Farechckbx.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Farechckbx.setBounds(625, 16, 200, 35);
        icerikpaneli.add(Farechckbx);

        //Onay Kutusu ayarlanması ve içeriğe eklenmesi.
        JCheckBox Klavyechckbx = new JCheckBox("Sadece Klavye");
        Klavyechckbx.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Klavyechckbx.setBounds(625, 62, 200, 35);
        icerikpaneli.add(Klavyechckbx);

        //Onay Kutusu ayarlanması ve içeriğe eklenmesi.
        JCheckBox Ikilichckbx = new JCheckBox("Her İkiside");
        Ikilichckbx.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Ikilichckbx.setBounds(625, 108, 200, 35);
        icerikpaneli.add(Ikilichckbx);

        //Buton ayarlanması ve eklemesi.
        JButton Baslatbtn = new JButton("Başlat");
        KlavyeLogger klavyenesnesi = new KlavyeLogger();
        FareLogger farenesnesi = new FareLogger();

        //Butonun çalıştığında yapılacak işlemlerin tanımlanması.
        Baslatbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //İlgili sınıftaki değişkenlere ulaşabilmek için nesne tanımlanması.
                Logger lognesnesi = new Logger();
                //Metin kutusundan veri alınarak değişkenlere tanımlanması.
                lognesnesi.setGONDERIM_SURESI(Integer.parseInt(SureAlani.getText()));
                ALICI_MAIL=MailAlani.getText();
                lognesnesi.setLOG_BOYUTU(Integer.parseInt(BoyutAlani.getText()));

                //Log alınacak pencerenin tanımlanarak çalıştırılması.
                JFrame logekrani = new JFrame();
                logekrani.setExtendedState(JFrame.MAXIMIZED_BOTH);
                //Kapatma davranışının tanımlanması.
                logekrani.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                logekrani.setVisible(true);

                //Kapatma isteminin dinlenerek nasıl davranılacağının ayarlanması.
                logekrani.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        // Pencere kapatıldığında loglama işleminin durdurulması.
                        klavyenesnesi.setKlavyeloglama(false);
                        farenesnesi.setFareloglama(false);
                        //Pencerenin kapalı olması durumunun değişken üzerinden ayarlanması.
                        setLogpenceresi(false);
                        // Pencerenin kapatılması.
                        logekrani.dispose();
                    }
                });

                //Log alınacak pencerenin diğer ayarlamaları.
                JPanel panel = new JPanel();
                panel.setBorder(new EmptyBorder(5, 5, 5, 5));
                logekrani.setContentPane(panel);
                panel.setLayout(null);
                //Bilgilendirme metninin tanımlanarak içeriğe eklenmesi.
                JLabel bilgi1 = new JLabel("LOGLAMA BAŞLADI.");
                bilgi1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                bilgi1.setBounds(100, 350, 200, 35);
                panel.add(bilgi1);
                //Bilgilendirme metninin tanımlanarak içeriğe eklenmesi.
                JLabel bilgi2 = new JLabel("LÜTFEN BU PENCEREYİ AKTİF TUTUN ÇÜNKÜ BAŞKA PENCERE AKTİF OLDUĞUNDA LOG TUTULAMAZ.");
                bilgi2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                bilgi2.setBounds(100, 450, 900, 35);
                panel.add(bilgi2);
                //Bilgilendirme metninin tanımlanarak içeriğe eklenmesi.
                JLabel bilgi3 = new JLabel("BU PENCEREYİ KAPATMAYIN AKSİ TAKDİRDE LOGLAMA İŞLEMİ DURUR FAKAT");
                bilgi3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                bilgi3.setBounds(100, 550, 700, 35);
                panel.add(bilgi3);
                //Bilgilendirme metninin tanımlanarak içeriğe eklenmesi.
                JLabel bilgi4 = new JLabel("ANA UYGULAMA PENCERESİNDEN 'DURDUR' BUTONUNA BASANA KADAR MAİL GÖNDERME İŞLEMİ DEVAM EDER!");
                bilgi4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                bilgi4.setBounds(100, 585, 1050, 35);
                panel.add(bilgi4);

                //Aksiyon dinleyicilerin pencereye eklenmesi.
                logekrani.addKeyListener(klavyenesnesi);
                logekrani.addMouseListener(farenesnesi);
                logekrani.addMouseWheelListener(farenesnesi);
                logekrani.addMouseMotionListener(farenesnesi);

                //Log penceresinin açık olma durumuna göre kontrol edilmesi.
                if (!isLogpenceresi()){
                    setLogpenceresi(true);
                }
                else {
                    //Açık log penceresi varsa uyarı mesajı göstererek yeni pencereyi kapatır.
                    JOptionPane.showMessageDialog(null, "Halihazırda Açık Bir Log Pencersi Bulunmakta!");
                    logekrani.dispose();
                }

                //Onay Kutusu durumlarının kontrolü ve hatalı seçim diyalog penceresi tanımı.
                if (Ikilichckbx.isSelected() && Farechckbx.isSelected() && Klavyechckbx.isSelected()) {
                    lognesnesi.logger();
                    klavyenesnesi.setKlavyeloglama(true);
                    farenesnesi.setFareloglama(true);
                }
                else if (Farechckbx.isSelected() && Klavyechckbx.isSelected()){
                    JOptionPane.showMessageDialog(null, "Hatalı Seçim!");
                    logekrani.dispose();
                    setLogpenceresi(false);
                }
                else if (Farechckbx.isSelected() && Ikilichckbx.isSelected()){
                    JOptionPane.showMessageDialog(null, "Hatalı Seçim!");
                    logekrani.dispose();
                    setLogpenceresi(false);
                }
                else if (Klavyechckbx.isSelected() && Ikilichckbx.isSelected()){
                    JOptionPane.showMessageDialog(null, "Hatalı Seçim!");
                    logekrani.dispose();
                    setLogpenceresi(false);
                }
                else if (Farechckbx.isSelected()) {
                    lognesnesi.logger();
                    farenesnesi.setFareloglama(true);
                }
                else if (Klavyechckbx.isSelected()) {
                    lognesnesi.logger();
                    klavyenesnesi.setKlavyeloglama(true);
                }
                else if (Ikilichckbx.isSelected()) {
                    lognesnesi.logger();
                    klavyenesnesi.setKlavyeloglama(true);
                    farenesnesi.setFareloglama(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Hatalı Seçim!");
                    logekrani.dispose();
                    setLogpenceresi(false);
                }
            }
        });
        Baslatbtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Baslatbtn.setBounds(350, 167, 150, 35);
        icerikpaneli.add(Baslatbtn);

        //Buton ayarlanması ve eklemesi.
        JButton Durdurbtn = new JButton("Durdur");
        //Butonun çalıştığında loglama ve mail gönderme methodlarının durdurulması.
        Durdurbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Logger loggernesnesi = new Logger();
                KlavyeLogger klavyenesnesi = new KlavyeLogger();
                FareLogger farenesnesi = new FareLogger();
                loggernesnesi.zamanlayicidurdur();
                klavyenesnesi.setKlavyeloglama(false);
                farenesnesi.setFareloglama(false);
            }
        });
        Durdurbtn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        Durdurbtn.setBounds(80, 167, 150, 35);
        icerikpaneli.add(Durdurbtn);
    }
}
