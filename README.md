# Text Editor

A simple text editor implemented in Java using the Command Pattern to provide undo/redo functionality and handle text editing operations.

## Overview

This project implements a basic text editor with support for inserting and deleting text, as well as undoing and redoing changes. It utilizes the Command Pattern to encapsulate text editing operations as command objects, allowing for easy undo/redo functionality.

## Features

- Insert and delete text at specified positions.
- Undo and redo changes using the Command Pattern.
- Maintain a history of executed commands for undo/redo functionality.
- Simple and intuitive user interface for text editing.

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/text-editor.git
    ```

2. Compile the Java files:

    ```bash
    javac *.java
    ```

3. Run the `Main` class:

    ```bash
    java Main
    ```

4. Use the text editor to insert, delete, undo, and redo changes as needed.

## Command Pattern

The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations. In this project, text editing operations (e.g., insert, delete) are encapsulated as command objects, allowing for easy undo/redo functionality by maintaining a history of executed commands.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

- Yashodhara C H(https://github.com/Yashodhara-04)

Feel free to fork, contribute, or provide feedback on this project!
