# TicTacToe Game

Welcome to the TicTacToe Game! This Java application allows you to play the classic TicTacToe game against a computer
opponent. The game runs in the console and provides a simple and fun way to enjoy this timeless game.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Run](#how-to-run)
- [Gameplay Instructions](#gameplay-instructions)
- [Code Overview](#code-overview)
- [Future Enhancements](#future-enhancements)

## Features

- Play TicTacToe against a computer.
- Randomized computer moves.
- Simple console-based UI.
- Immediate feedback on invalid moves and game results.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Basic understanding of how to run Java programs from the command line.

## How to Run

1. **Clone the Repository:**
    ```sh
    git clone https://github.com/richardHaggioGwati/java_builds/tree/main/TicTacToe
    cd TicTacToe
    ```

2. **Compile the Java Code:**
    ```sh
    javac TicTacToe.java
    ```

3. **Run the Game:**
    ```sh
    java TicTacToe
    ```

## Gameplay Instructions

1. The game board is represented as a 3x3 grid, with positions numbered 1 through 9:
    ```
     1 | 2 | 3
    ---+---+---
     4 | 5 | 6
    ---+---+---
     7 | 8 | 9
    ```

2. You will be prompted to enter a value between 1 and 9 to place your mark (X).

3. The computer will then randomly select a position to place its mark (O).

4. The game will continue until there is a winner or the board is full.

5. The game will display the result: player wins, computer wins, or a draw (CAT).

## Code Overview

### Main Class: TicTacToe

- **Variables:**
    - `playerPositions`: Stores the positions chosen by the player.
    - `computerPositions`: Stores the positions chosen by the computer.

- **Methods:**
    - `main(String[] args)`: The entry point of the game. It initializes the game board and handles the game loop.
    - `printBoard(char[][] gameBoard)`: Prints the current state of the game board.
    - `placePiece(char[][] gameBoard, int position, String user)`: Places the player's or computer's mark on the board
      based on the position.
    - `checkWinner(char[][] gameBoard)`: Checks for a winning condition or a draw and returns the result.

### Game Logic

1. **Game Board Initialization:**
    - The game board is a 2D character array representing the 3x3 grid.

2. **Player Move:**
    - The player is prompted to enter a position (1-9).
    - The game ensures the position is not already taken.

3. **Computer Move:**
    - The computer randomly selects a position (1-9).
    - The game ensures the position is not already taken.

4. **Winner Check:**
    - The game checks for winning conditions after each move.
    - If a winning condition is met, the game declares the winner and prints the final board state.

## Future Enhancements

- Implement a more sophisticated AI for the computer using the Minimax algorithm.
- Add a graphical user interface (GUI) for a better user experience.
- Allow players to choose their symbol (X or O).
- Add functionality for two-player mode.

## Acknowledgements

- This project was inspired by the classic TicTacToe game.
- Thanks to the Java community for providing excellent resources and tutorials.

Enjoy playing TicTacToe! If you encounter any issues or have suggestions for improvements, feel free to open an issue or
submit a pull request. Happy coding! 🚀