# Java Swing Custom Button Grid Application

Java Swing kütüphanesi kullanılarak geliştirilmiş, dinamik durum yönetimine ve özel buton davranışlarına sahip bir masaüstü arayüz (GUI) uygulamasıdır.

---

## Proje Hakkında

Bu proje, 4x4 ızgara (GridLayout) düzeninde yerleştirilmiş 16 adet özelleştirilmiş butonun durum ve renk yönetimini gerçekleştirir.

* Her buton `JButton` sınıfından türetilen `CustomButton` yapısıyla özelleştirilmiştir.
* Butonlar aktif/pasif durum geçişlerine sahiptir ve tıklama olayında arka plan rengi ile metinlerini günceller.
* Butonlara özel veri bağlantıları (`graphQLSchema`) atanabilir durumdadır.
* Seçilen buton aktif edildiğinde konsola ilgili butonun şema bilgisi yazdırılır.

---

## Kullanılan Teknolojiler

* **Dil:** Java
* **Arayüz:** Java Swing & AWT (`JFrame`, `JButton`, `GridLayout`, `ActionListener`)

---

## Kurulum ve Çalıştırma

```bash
# Derleme
javac CustomButton.java

# Çalıştırma
java CustomButton
