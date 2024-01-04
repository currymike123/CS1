---
marp: true
author: Michael Curry
style: |
  .columns {
    display: grid;
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 1rem;
  }
---

### Command Line and the Development Environment

---

Before we start discussing computer science let's get comfortable with our computer.

Most computer users are familiar with using a GUI (Graphical User Interface) to interact with their computer. A GUI is a visual interface that allows users to interact with the computer using a mouse and keyboard.

But there is another way to interact with the computer called the <b>command line</b>.

---

### Using the Command Line

---

The <b>command line</b> is a text interface for the computer's operating system. It allows you to execute commands by typing them in and pressing enter on the keyboard. The command line is also called the <b>terminal</b> or <b>shell</b>.

Windows and Mac have a built in command line. On Windows it is called the Command Prompt and on Mac it is called the Terminal. Linux has multiple command line options. The most common is called <b>Bash</b>.

---

### Commands

<b>ls</b> (List): The ls command is used to list the contents of a directory. It displays the files and subdirectories present in the current directory.

<b>cd</b> (Change Directory): The cd command is used to navigate between directories (folders) in the command line.

<b>cd..</b> (Change Directory Up): The cd.. command is used to navigate up one directory (folder) in the command line.

<b>pwd</b> (Print Working Directory): The pwd command is used to print the current working directory.

<b>clear</b> (Clear): The clear command is used to clear the terminal screen.

<b>mkdir</b> (Make Directory): The mkdir command is used to create a new directory (folder).

---

Let's begin by creating a folder for our first project. Open the command line and type the following commands:

```bash
ls
```

You should see a list of folders and files. One of the folders should be <b>Desktop</b>. This is the folder where we will create our project.

```bash
cd Desktop
```

This command will change the current directory to the Desktop folder.

```bash
mkdir hello_world
```

This command will create a new folder called <b>hello-world</b>.

---

Let's now navigate to the <b>hello-world</b> folder.

```bash
cd hello_world
```

This command will change the current directory to the <b>hello-world</b> folder.

Your command prompt should now look like this:

<b>Windows</b>

```bash
Desktop\hello_world
```

<b>Mac</b>

```bash
Desktop/hello_world
```

---

Before we can start writing code we need to setup our development environment. A <b>development environment</b> is a collection of tools that we use to write code.

This is your code notebook, where you will all your work will be done, so make sure you have it setup correctly and that you are comfortable using it.

---

### Setting up your Java Development Environment

---

To run a Java program you first need the Java Development Kit (JDK) installed on your computer. You can download the JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or via Visual Studio Code which we will walk through.

You will need a text editor to write your Java code. You can use whichever text editor is native to your operating system, textEdit, notepad, etc. I recommend using [Visual Studio Code](https://code.visualstudio.com/).

Any text editor will work but having a text editor that is designed for programming will make your life easier. These text editors are called <b>Integrated Development Environments (IDE)</b>. Visual Studio Code is free and works on Windows, Mac, and Linux.

---

Installing Java in Visual Studio Code via the Java Extension Pack. This will install the Java Development Kit (JDK) and the Java Runtime Environment (JRE).

![bg right width:600px](https://miro.medium.com/v2/resize:fit:1100/format:webp/1*QlnEvJOwSnbdrkGvMAa-9w.png)
