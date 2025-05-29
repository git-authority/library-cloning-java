# Library Cloning in Java

This project demonstrates **Shallow Cloning** and **Deep Cloning** in Java using a `Library` and `Book` class.

It helps understand how object references behave when cloned — whether changes in one object reflect in its clone or not.

---

## 📁 Project Structure
```
library-cloning-java/
│
├── src/
│ ├── Book.java         # Represents a book with title and author
│ ├── Library.java      # Supports shallow and deep cloning of a library
│ └── Clone.java        # Main class to demonstrate cloning behavior
│
└── README.md
```


---

## 🧪 Features

- Implements `Cloneable` interface.
- Demonstrates difference between:
  - **Shallow Clone**: Copies object, but references same `books` list.
  - **Deep Clone**: Copies object and creates a new list with new `Book` instances.
- Shows how changes in the original list affect clones differently.

---

## ▶️ How to Run

Make sure you're in the `src/` directory:

```bash
cd src
javac *.java
java Clone
```