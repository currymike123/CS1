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

# Week 1: Computer Science 1

## Command Line and the Development Environment

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

This will include the <b>Java language</b> and a <b>text editor</b>, where all your work will be done. Therefore, make sure it is set up correctly and that you are comfortable using it

---

### Setting up your Java Development Environment

---

To run a Java program you first need the Java Development Kit (JDK) installed on your computer. The JDK is available from [Oracle](http://www.java.com), this is the company that developed the Java Lanaguage.

It is also available as a package with a text editor included. That's great because we need both!

[Visual Studio Code Coding Pack](https://code.visualstudio.com/docs/java/java-tutorial) includes both a text editor and the JDK. It is available for Windows & Mac. Follow the link and install the version for your operating system. You can use lab time to complete this task.

We are going to use the text editor available in the Coding Pack called [Visual Studio Code](https://code.visualstudio.com/).

Any text editor will work for writing code but having a text editor that is designed for programming will make your life easier. These text editors are called <b>Integrated Development Environments (IDE)</b>. Visual Studio Code is an IDE.

---

### Installing Visual Studio Coding Pack

---

Download and install [Visual Studio Code Coding Pack](https://code.visualstudio.com/docs/java/java-tutorial). Once you it installed open it up, you should have a screen that looks like this.

For future reference, this is the documentation for [Visual Studio Code Docs](https://code.visualstudio.com/docs). We will go through the basics of using Visual Studio Code in class but the documentation is a great resource if you get stuck.

![bg right width:600px](https://code.visualstudio.com/assets/docs/getstarted/tips-and-tricks/welcome-page.png)

---

Let's open the folder that we created earlier. Click the <b>Open Folder</b> link on the welcome screen. Then navigate to the <b>hello-world</b> folder and click <b>Select Folder</b>.

If you have VS Code previously installed. Click on <b>File</b> and then <b>Open Folder</b>. Navigate to the <b>hello-world</b> folder and click <b>Select Folder</b>.

You should now see the <b>hello-world</b> folder in the <b>Explorer</b> pane on the left side of the screen. VS Code now has access to all the files in the <b>hello-world</b> folder. There should be no files in the folder yet but we will start to make some soon.

You can also open the terminal by clicking <b>Terminal</b> in the top menu and then <b>New Terminal</b>. Notice the terminal is now open at the bottom of the screen and looks the same as the command line we used earlier.

---

We now have the Java language installed and a text editor to write our code in.

Let's begin to discuss computer science, the java language, and how to write code!

---
