# File I/O – CSV Read & Write

## 🎯 Objective
- Create a sample `products.csv` file with name and price.
- Use **BufferedReader** to read lines from the file.
- Split each line by comma to get name and price.
- Convert price to double and filter products with price > 1000.
- Use **FileWriter** to write matching products to a new CSV file.
- Print success message and verify the new file.

---

## 📚 Key Concepts Learned
- File handling in Java
- Reading and writing text files
- Parsing CSV data
- Using BufferedReader and FileWriter
- Exception handling with try-with-resources
- Checking file existence with `Files.exists()`

---

## 📂 Project Structure

Task_4/
│
├── src/
│ └── Task4/
│ └── ProductFilter.java
│
├── products.csv
├── expensive_products.csv
└── README.md

---

## ✅ Sample Input (products.csv)
```bash
Name,Price
Laptop,55000
Smartphone,1200
Headphones,800
Tablet,1500
Pen,50
Office Chair,3000
Desk,4500
Water Bottle,200
Backpack,900
Smartwatch,2500
```

---

## 📊 Sample Output (expensive_products.csv)
```bash
Name,Price
Laptop,55000
Smartphone,1200
Tablet,1500
Office Chair,3000
Desk,4500
Smartwatch,2500
```

---

## 👨‍💻 Outcome:
- Learned how to handle files, parse CSV data, apply filtering conditions, and write results to another file in Java.

---

## ▶️ How to Run
1. Place `products.csv` in the **Task_4** folder (outside `src/`).
2. Compile and run the program:
   ```bash
   javac src/Task4/ProductFilter.java
   java -cp src Task4.ProductFilter
   ```

