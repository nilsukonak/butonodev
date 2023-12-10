//Nilsu Konak 1220505028
//Esra Ceren Altınok 1220505003


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomButton extends JButton {

    public CustomButton(String text) {

    super(text);
    this.graphQLSchema = "";
    this.activeRenk = Color.BLUE;
    this.pasifRenk = Color.BLACK;
    this.aktif = false;

    pasifDurumuAyarla();

    addActionListener(new ButonTiklamalistener());
}
    private String graphQLSchema;
    private Color activeRenk;
    private Color pasifRenk;
    private boolean aktif;



    public void setGraphQLSchema(String schema) {
        this.graphQLSchema = schema;
    }

    public void setAktifRenk(Color color) {
        this.activeRenk = color;
    }

    public void setPasifRenk(Color color) {
        this.pasifRenk = color;
    }

    private void pasifDurumuAyarla() {
        setBackground(pasifRenk);
        setText("Pasif");
        aktif = false;
    }

    private void aktifDurumuAyarla() {
        setBackground(activeRenk);
        setText("Aktif");
        aktif = true;
    }

    private class ButonTiklamalistener implements ActionListener {  //butonları aktif yapmak için
        @Override
        public void actionPerformed(ActionEvent e) {
            if (aktif) {
                mevcutdisiButonlarPasif();
            } else {
                aktifDurumuAyarla();
                System.out.println("Çalıştırıldı: " + graphQLSchema);
            }
        }
    }

    private void mevcutdisiButonlarPasif() {  //aktif olan butonları tekrardan pasif yapmak için
        for (Component component : getParent().getComponents()) {
            if (component instanceof CustomButton && component != this) {
                ((CustomButton) component).pasifDurumuAyarla();
            }
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Buton Paneli");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 4, 10, 10));

            CustomButton[] butonlar = new CustomButton[16];

            for (int i = 0; i < 16; i++) {

                butonlar[i] = new CustomButton("Buton " + (i + 1));
                frame.add(butonlar[i]);
            }

            butonlar[0].setGraphQLSchema("https://api.example.com/graphql");

            butonlar[1].setGraphQLSchema("https://api.anotherexample.com/graphql");

            butonlar[2].setGraphQLSchema("https://api.yetanotherexample.com/graphql");

            frame.setSize(400, 400);
            frame.setVisible(true);
        });

    }
}