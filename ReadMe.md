COMPX202-20B / COMPX242-20B Assignment 3
========================================

Due date Friday August 7th at 11:30pm.

The Observer Pattern
--------------------

Programs are easier to understand and maintain if the
classes from which they are built each have clear responsibilities
and hide implementation details.
This assignment explores a program built using the 
observer pattern.  The goals are firstly to understand the ideas of
the pattern and its implementation, and secondly to look at the way
in which this allows each of the classes to function with minimum
knowledge of each other.

Java libraries include implementations of the observer pattern in a 
number of contexts, but for this
assignment we are making our own.  The repository includes an
IntelliJ project as a starter program.  As usual you will FORK the
project and CLONE copies to local machines as you need for development.
Making good use of the repository by committing and pushing regularly
is a requirement of the project.  In addition to the programming work
there are questions in this document which can be answered in the spaces
provided.


Instructions
------------

1. Fork this project and **make sure that the visibility of your new 
   version of the project is set to
   private**. Clone your verion of the repository to your
   computer. As you work on the project, remember to commit regularly 
   with descriptive messages and 
   push your commits back to GitLab.

2. Try running the project.  The idea of the program (explained in 
   the Week 3 B Video) is as part of a typing tutor.  It asks its
   user to type, then counts words and the time taken.  Note that the
   program pops up two small windows on the left side of the screen.
   (You might need to reduce the size of the IntelliJ window, so that
   the program's windows are not lost behind it.)

3. The program's usefulness in timing input is limited by 
   uncertainty about when it will start.  If you 'Run' the program,
   there is a delay while it compiles and then while the display is
   reorganised and the user finds the right place to type.  Modify the
   program to display 
   
   `Press <Enter> to start`
    
    and only begin timing input once the user has pressed `<Enter>`.
    In the following paragraph you are asked about the program that
     you started with and about  
    your modification.  Write your answers in the places shown.
    
    ```
    Question 3.1:  What are the responsibilities of the Main class
                   as provided to you.

    > Handle the user's input and output. Create the wordlist and the observer.

    Question 3.2:  What is the secret of the ShowSpeed class as provided
                   to you.

    > It uses the system time to substract the start time (user press enter key) and divide by the wordlist size.

    Question 3.3:  How does your modification change or avoid changing
                   the responsibities and secrets of Main and ShowSpeed.

    > Give the user have more time to react to the editor.( more accurate)

    ```

4. Modify the Main class to add the observer ShowWords.

5. Modify the Main class to run a second copy of the ShowCount observer.
  This should result in two copies of the ShowCount window appearing on 
  screen.
  
6. When measuring the speed of typist in tests and competitions the following
   rule applies.  Count the total number of characters typed (including spaces
   and punctuation), divide by 5 and divide again by the time (in minutes).  The
   result is typing speed in 'words' per minute.  It assumes that words on average
   involve 5 characters. Write a new observer class called `ShowWPM` which displays
   the user's typing speed in a new window.
   
7. An issue with the observer pattern is that observers may be notified of changes
   more often than we would like.  If the processing cost is not great this usually 
   doesn't matter.  Most GUI systems have many more events happening than programmers
   are usually aware of.  Sometimes it matters though.  Another observer class, 
   called InlineCount, has been provided in this project.  Instead of opening
   a new window, it adds text to the 'terminal' interaction.
   
   Modify Main to start the observer 'InlineCount'.  Try running and using the program.
   
    ```
    Question 7.1:  What happens?

    > Print out the word count of the current word. It will print out its index when it is added.(Starts from 1)

    ``` 

8.  Your problem is to modify the program to improve the results from 7 - i.e. to 
   make the InlineCount observer only display one line (with the finished count) after
   processing all the words on each line of input.  It must still be programmed 
   as an observer (i.e. you can't add a println statement to Main).  Your modification 
   could involve changes
   to any or all of Main, WordList, and InlineCount.  The challenge is to make changes
   in such a way as to keep sensible secrets and responsibilities for each class.
   
    ```
    Question 8.1:  How did you make the change and which classes were altered?

    > I changed the codes in Main and WordList. Instead of loop through the words and given the word count. I create an 
    array and add the words into the array. After adding all the words, then notify the observer. 

    Question 8.2:  For each class you changed: How were its secrets 
                   or responsibilities changed? 

    > I didn't change too much codes to make sure the classes are hiding secretly from the users. In fact, the biggest 
    change I would say is the InlineCount class because instead print out every single time I changed to print out the 
    overall result in an single update.

    ```

Submitting
----------

Push your changes to your GitLab repository. Ensure that you can see
your changes on GitLab.

Grading
-------

| Weighting | Allocated to |
|:----------:|:----------|
| 8% | Correct repository usage with commit comments |
| 5% | Step 2 |
| 5%,18% | Step 3, Questions 1,2,3 |
| 5% | Step 4 |
| 5% | Step 5 |
| 15% | Step 6 |
|  6% | Question 7.1 |
| 15%, 18% | Step 8, Questions 1,2|
