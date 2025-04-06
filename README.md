 # 🔐 PhotoEncrypter

A simple Java-based desktop application that allows users to **encrypt** and **decrypt** image files using a basic XOR-based algorithm. Built using **Java Swing**, this tool provides an intuitive interface to obfuscate and restore image data using a secret key.

---

## 🎯 Features

- 🖼 **Encrypt/Decrypt Any Image**: Works with PNG, JPEG, BMP, and other image formats.
- 🔑 **XOR-based Algorithm**: Uses a user-provided numeric key to alter byte data.
- 🧠 **Single Button Interface**: Easy to use with file chooser and key input.
- 📦 **Cross-platform**: Run on any system with Java installed.
- 🛠 **Built with**: Java, Swing (AWT), and VS Code compatible.

---

## 📸 How It Works

1. Select an image from your local system.
2. Enter a numeric key in the text field.
3. Click **Open Image**.
4. The selected file will be overwritten with the encrypted/decrypted content.
5. Run again with the same key to revert to original (XOR is reversible).

---

## 🛠 Installation & Run (VS Code )

### ⚙️ Requirements

- Java JDK 8 or higher
- Any IDE (e.g., VS Code)
- Basic knowledge of Java

### 💻 Run in VS Code

1. **Clone the Repository** *(or create your own project)*:
    ```bash
    git clone  https://github.com/ArjunPatil15/PhotoEncrypter.git
    ```

2. **Open the folder in VS Code**  
   Make sure to have the Java Extension Pack installed.

3. **Paste the code in `PhotoEncrypter.java`**

4. **Run the program** from the "Run" menu or click ▶️.

---

## 🧪 Sample Usage

- Enter key: `123`
- Select an image `photo.jpg`
- Click **Open Image**
- The file gets encrypted and is no longer viewable
- Run again with same key: `123` → File is restored

---

## ⚠️ Warnings

- The selected image will be overwritten. Make sure to keep a backup.
- This encryption method is **not secure for real-world applications**. It's for learning/demo purposes.

---

## 🌟 Support

If you find this helpful, give it a ⭐ on GitHub and share with others!


