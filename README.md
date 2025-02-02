# Qe-MoneyTransfer-Project

![Allure Report](https://img.shields.io/badge/Allure-Report-blue.svg)
![Selenium](https://img.shields.io/badge/Selenium-Java-green.svg)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-yellow.svg)

Qe-MoneyTransfer-Project, Selenium WebDriver, Java, Cucumber ve Allure kullanarak oluşturulmuş bir test otomasyonu projesidir. Bu proje, para transferi süreçlerini test etmek için geliştirilmiştir.

## 📌 Proje Özellikleri
- **Selenium WebDriver**: Web UI test otomasyonu için kullanılır.
- **Cucumber (BDD)**: Test senaryolarını anlaşılır bir formatta yazmak için kullanılır.
- **JUnit/TestNG**: Testlerin çalıştırılması için framework desteği.
- **Allure Report**: Test sonuçlarını görselleştirmek için kullanılır.

---

## 🚀 Kurulum

### 1️⃣ Gereksinimler
Aşağıdaki araçların bilgisayarınızda kurulu olduğundan emin olun:
- [Java 11+](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA / Eclipse](https://www.jetbrains.com/idea/) veya başka bir IDE
- [Google Chrome](https://www.google.com/intl/en_us/chrome/)
- [Chromedriver](https://chromedriver.chromium.org/downloads) (Uygun sürümü kullanın)

### 2️⃣ Projeyi Klonlayın
```sh
 git clone https://github.com/metehancill/Qe-MoneyTransfer-Project.git
 cd Qe-MoneyTransfer-Project
```

### 3️⃣ Bağımlılıkları Yükleyin
```sh
mvn clean install
```

---

## 🔧 Kullanım

### Testleri Çalıştırma
Cucumber testlerini çalıştırmak için aşağıdaki komutu kullanabilirsiniz:
```sh
mvn test
```

Belirli bir etiketle işaretlenmiş senaryoları çalıştırmak için:
```sh
mvn test -Dcucumber.options="--tags @Transfer"
```

### Allure Raporu Oluşturma
Testleri çalıştırdıktan sonra Allure raporunu görmek için:
```sh
mvn allure:serve
```
Bu komut, Allure raporlarını tarayıcıda görüntüler.

### Raporları Temizleme
```sh
mvn clean
```
Bu komut, önceki test raporlarını temizler.

---

## 🛠 Yapılandırma
- **`src/test/resources/config.properties`** dosyasında gerekli ayarlamaları yapabilirsiniz.
- WebDriver konfigürasyonu, **`BaseTest`** sınıfında ayarlanmıştır.

---

## ❓ Sorun Giderme
### 1️⃣ WebDriver Versiyon Uyumsuzluğu
Hata: `SessionNotCreatedException: This version of ChromeDriver only supports Chrome version XX`
- Çözüm: Kullanılan Chrome sürümü ile uyumlu **chromedriver** versiyonunu indirin.

### 2️⃣ Maven Bağımlılık Sorunları
Hata: `Could not resolve dependencies`
- Çözüm: Aşağıdaki komutları çalıştırarak bağımlılıkları sıfırdan indirin:
```sh
mvn clean package
mvn dependency:resolve
```

### 3️⃣ Allure Raporu Açılmıyor
- Çözüm: Allure'u tekrar yükleyin:
```sh
npm install -g allure-commandline
```

---

## 📜 Lisans
Bu proje **MIT Lisansı** ile lisanslanmıştır.

---

## 👨‍💻 Katkıda Bulunma
Her türlü geri bildirime ve katkıya açığız! Lütfen PR oluşturmadan önce bir **issue** açarak tartışmaya katılın.

📩 İletişim: [GitHub Issues](https://github.com/metehancill/Qe-MoneyTransfer-Project/issues) üzerinden bize ulaşabilirsiniz.
