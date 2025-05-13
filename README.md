# 📷PhotoEncrypter

**PhotoEncrypter** is a Java Swing-based desktop application that allows users to encrypt and decrypt image files using a simple XOR operation and a numeric key. It offers a basic graphical interface for selecting an image and applying the encryption in just a few clicks.

---

## About

This tool demonstrates how XOR-based encryption works by scrambling the bytes of an image file using a user-provided key. The same key can be used again to reverse the encryption and restore the original image.

> Note: This is a basic method and not suitable for secure encryption. It's meant for educational purposes only.

---

## Features

- Encrypt image files using a numeric key
- Decrypt using the same key
- Simple and minimal GUI built with Java Swing
- One-click image selection and encryption/decryption

---

## How to Run

1. Clone the repository: 
```bash
git clone https://github.com/ArjunPatil15/PhotoEncrypter.git
```
2. Navigate to the project directory:
3. Compile the Java file:
4. Run the application:

---

## How to Use

- Enter a numeric key (e.g., 123) in the text field.
- Click on the **"Open Image"** button.
- Select an image file from your computer.
- The image will be encrypted or decrypted based on the key.
- A confirmation message will be shown once the operation is done.

---

## Example

1. Enter key: `123`
2. Encrypt an image using this key
3. To decrypt, run the app again and enter the same key `123` on the same file
