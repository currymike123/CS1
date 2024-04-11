---
marp: true
author: Michael Curry
style: |
  .columns {
      display: grid;
      grid-template-columns: repeat(2, minmax(0, 1fr));
      gap: 1rem;
  }

  .small_table {

    transform: scaleY(0.9);

  }

  .boxed {
        color: black;
        border: 1px solid black;
        margin: 0px auto;
        padding: 5px;
        border-radius: 5px;
      }
---

# Week 11: Computer Science 1

## Arrays, Loops, Methods and Problem Solving

---

## Arrays, Loops, Methods, and Problem Solving

---

At this point in the course, you have learned about quite a few programming concepts. You have learned about variables, data types, operators, conditional statements, loops, and methods. You have also learned about arrays and how to use them in your programs.

These concepts are the building blocks of programming. You will use them in every program you write. The combination of these concepts allows you to solve complex problems by breaking them down into smaller, more manageable pieces.

---

The best way to learn programming is to write code. The more code you write, the better you will become. You will make mistakes, but that is okay. Mistakes are part of the learning process. The important thing is to learn from your mistakes and keep moving forward.

Working through a larger problem will help you understand how to apply the concepts you have learned. You will learn how to break down a problem into smaller pieces and solve each piece one at a time.

Let's continue creating games and solving problems.

---

So far we have created a few games such as the Number Guessing Game, the Rock, Paper, Scissors Game, hangman, and the Tic-Tac-Toe Game.

We used arrays, loops, and methods to create these games. We also used conditional statements to make decisions in our programs.

Tic-Tac-Toe allowed us to use a two-dimensional array to represent the game board. We used nested loops to iterate over the rows and columns of the array.

Let's continue to use the concept of a game board or grid to create a new game.

<b> The Game of Life! </b>

---

## The Game of Life

---

The Game of Life is a cellular automaton devised by the British mathematician John Horton Conway in 1970. It is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input.

Once the game is set up, the rules determine the next state of the game. The game is played on a two-dimensional grid of cells. Each cell can be in one of two states: alive or dead.

The game evolves in turns. Each turn, the game calculates the next state of each cell based on the current state of the cell and its neighbors.

---

The rules of the game are simple:

1. Any live cell with fewer than two live neighbors dies, as if by underpopulation.
2. Any live cell with two or three live neighbors lives on to the next generation.
3. Any live cell with more than three live neighbors dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

---
