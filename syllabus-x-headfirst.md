# IB Computer Science SL (first assessment 2027) mapped to Head First Java, 2nd edition

**Syllabus:** IB Computer science guide, first assessment 2027, syllabus content pp. 28-42.
**Book:** Head First Java, 2nd ed. (Sierra & Bates, 2005, Java 5). Chapter and section names are from the O'Reilly contents listing.

**Scope of this file:** SL statements only (HL-only statements are left out). Only items where the book gives real support are listed. SL items the book does not cover are listed by code at the end, with no detail.

**Reliability:** Ratings are based on the book's chapter and section headings, not on reading the chapter text. Check depth against your copy before using a rating to plan lessons.

- **Covered** = a chapter or section teaches the topic at about the depth the statement asks for.
- **Partial** = related material exists, but part of the statement is not taught (the note says what).

---

## Student reading guide (SL): what to read and what to skip

Use this as a supplementary reading list alongside class. It follows the book's order. "Read" means the sections that match the SL syllabus. "Skip" means HL-only, off-syllabus or dated material that would only add load. Section names are the book's own headings, so they are easy to find in the contents.

**General tips**
- The book is from 2005 (Java 5). The core language it teaches is still current, but a few topics are dated (noted below).
- Do the chapter's code and exercises for the "Read" sections. For Paper 2 the skill that matters is writing and tracing small programs.
- Where a topic is only in the book as a story (the Dot Com game), read it as a worked example of problem-solving, not as content to memorise.

**Ch 1: Breaking the Surface**
- Read: The Way Java Works (just the idea of compiling and running); Code structure in Java; Anatomy of a class; Writing a class with a main; What can you say in the main method?; Looping and looping and...; Simple boolean tests; Example of a while loop; Conditional branching.
- Optional practice: Phrase-O-Matic.
- Skip: What you'll do in Java; A very brief history of Java.

**Ch 2: A Trip to Objectville**
- Read: Chair Wars: (or How Objects Can Change Your Life); When you design a class, think about the objects that will be created from that class type; Things an object knows about itself are called...; Things an object can do are called...; A class is not an object (but it's used to construct them); Making your first object; Making and testing Movie objects; Quick! Get out of main!
- Skip: The Guessing Game and Running the Guessing Game (practice only; do them if you want more coding).

**Ch 3: Know Your Variables**
- Read: Declaring a variable; "I'd like a double mocha, no, make it an int."; You really don't want to spill that...; An object reference is just another variable value; An array is like a tray of cups; Arrays are objects too; Make an array of Dogs; Control your Dog (with a reference variable).
- Skip: Back away from that keyword! and the reserved-words table; Life on the garbage-collectible heap and Life and death on the heap (memory management is not in the SL syllabus).

**Ch 4: How Objects Behave**
- Read nearly all of it: You can send things to a method; You can get things back from a method; You can send more than one thing to a method; Calling a two-parameter method, and sending it two arguments; Java is pass-by-value. That means pass-by-copy; Encapsulation; Do it or risk humiliation and ridicule; Hide the data; Encapsulating the GoodDog class; Declaring and initializing instance variables; The difference between instance and local variables.
- Optional: Comparing variables (primitives or references).

**Ch 5: Extra-Strength Methods**
- Read: First, a high-level design; The "Simple Dot Com Game" a gentler introduction; Developing a Class; Writing the method implementations; Writing test code for the SimpleDotCom class; More about for loops; Regular (non-enhanced) for loops; Trips through a loop; Difference between for and while; The enhanced for loop.
- Skim as a worked example of planning and testing: Prepcode for the SimpleDotComGame class; Everything happens in main(); What's this? A bug?
- Skip: random() and getUserInput(); One last class: GameHelper (library helper code, not syllabus); Casting primitives.

**Ch 6: Using the Java Library**
- Read: Wake up and smell the library; Some things you can do with ArrayList; Comparing ArrayList to a regular array; Super Powerful Boolean Expressions.
- Skim as a worked example: Let's build the REAL game: "Sink a Dot Com"; Who does what in the DotComBust game (and when); Prep code for the real DotComBust class.
- Skip: Using the Library (the Java API) and How to play with the API.

**Ch 7: Better Living in Objectville**
- Read only the concept introductions (the SL syllabus asks you to evaluate OOP, including inheritance and polymorphism, at a high level): Chair Wars Revisited...; Understanding Inheritance; An inheritance example; So what does all this inheritance really buy you?
- Skip (HL, B3.2): designing the inheritance tree, IS-A and HAS-A, rules for overriding, overloading.

**Ch 8: Serious Polymorphism**
- Skim only: Polymorphism in action, for the idea.
- Skip (HL): abstract classes, the Object class, interfaces, the Pet example.

**Ch 9: Life and Death of an Object**
- Read: The miracle of object creation; Construct a Duck; Initializing the state of a new Duck; Using the constructor to initialize important Duck state; Make it easy to make a Duck; Be sure you have a no-arg constructor; Doesn't the compiler always make a no-arg constructor for you? No!; Nanoreview: four things to remember about constructors.
- Skip: The Stack and the Heap; superclass constructors and inheritance; garbage collection (not in SL).

**Ch 10: Numbers Matter**
- Read: The difference between regular (non-static) and static methods; What it means to have a class with static methods; Static methods can't use non-static (instance) variables!; Static methods can't use non-static methods, either!; Static variable: value is the same for ALL instances of the class; Initializing a static variable; static final variables are constants.
- Skip: wrapper classes and autoboxing; number formatting; all the date and Calendar sections (the Calendar API is dated, modern Java uses java.time); static imports.

**Ch 11: Risky Behavior**
- Read from "What happens when a method you want to call (probably in a class you didn't write) is risky?" through "Exception Rules": Methods in Java use exceptions...; The compiler needs to know that YOU know you're calling a risky method; An exception is an object; Flow control in try/catch blocks; Finally: for the things you want to do no matter what; Catching multiple exceptions; Exceptions are polymorphic; Multiple catch blocks must be ordered from smallest to biggest; When you don't want to handle an exception...
- Skip: the Music Machine, JavaSound, Sequencer and MidiEvent sections (they are the book's example, not the topic).

**Ch 12, 13: GUI and Swing:** skip entirely.

**Ch 14: Saving Objects**
- Read only the text-file part: Writing a String to a Text File; Text File Example: e-Flashcards; Quiz Card Builder (code outline); The java.io.File class; Reading from a Text File; Quiz Card Player (code outline); Parsing with String split().
- Skip: serialization, Serializable, deserialization, serialVersionUID, saving and restoring the BeatBox and game characters.
- Note: the syllabus lists Scanner for Java file reading. The book teaches FileWriter and BufferedReader, which the syllabus also lists. Learn Scanner from class notes or another source.

**Ch 15: Make a Connection**
- Optional, one small link to Paper 1 (A2.1.4, A2.2.3): Make a network Socket connection; A TCP port is just a number; Writing a simple server; Writing a Chat Client.
- Skip: threads, concurrency, synchronization (not SL).

**Ch 16, 17, 18:** skip (collections and generics are HL; packages, JARs, Web Start and RMI are off-syllabus and dated).

**Appendix B: Top Ten Topics**
- Read: #2 Multidimensional Arrays (2D arrays are in B2.2.2); #3 String and StringBuffer/StringBuilder Methods (substrings, B2.1.2); #4 Access Levels and Access Modifiers (B3.1.5); #7 Block Scope (B2.3.4).
- Optional: #10 Bit Manipulation (weak link to A1.2).
- Skip: #1 Enumerations, #5 Anonymous and Static Nested Classes, #6 Linked Invocations, #8 Assertions, #9 Immutability.

**Appendix A (Final Code Kitchen):** skip.

---

## Where this matters for the exams (SL)

| Paper | Time / marks | Content | Relevance of this book |
|---|---|---|---|
| Paper 1, Section A | 1h15 total with Section B; 38 marks | Extended response, Theme A | Little (Theme A is mostly outside the book) |
| Paper 1, Section B | 12 marks | Short response on the pre-seen case study | Depends on the case study |
| Paper 2 | 1h15, 50 marks | Extended response, Theme B. Java and Python versions exist. One question is on algorithmic thinking with no code to read or write | **Main use of the book** |

---

## Theme B: Computational thinking and problem-solving (Paper 2)

### B1 Computational thinking

| Code | Syllabus statement | Rating | Head First Java sections | Notes |
|---|---|---|---|---|
| B1.1.1 | Construct a problem specification | Partial | Ch 1: Coding a Serious Business Application; Monday morning at Bob's. Ch 5: First, a high-level design; The "Simple Dot Com Game" a gentler introduction | Informal requirements only. Constraints, objectives, input/output specs and evaluation criteria are not taught. |
| B1.1.2 | Describe the fundamental concepts of computational thinking (abstraction, algorithmic design, decomposition, pattern recognition) | Partial | Ch 2: When you design a class, think about the objects that will be created from that class type. Ch 5: Developing a Class; The three things we'll write for each class | The ideas appear in practice (classes as abstraction, prepcode as algorithm design) but are never named. |
| B1.1.3 | Explain how computational thinking is applied to solve problems | Partial | Ch 5: Let's build a Battleship-style game: "Sink a Dot Com". Ch 6: Let's build the REAL game: "Sink a Dot Com" | The Dot Com game is a worked problem from design to code. Useful as a model, but not framed as computational thinking. |

### B2 Programming

| Code | Syllabus statement | Rating | Head First Java sections | Notes |
|---|---|---|---|---|
| B2.1.1 | Construct and trace programs using global and local variables of various data types | Covered | Ch 1: Writing a class with a main. Ch 3: Declaring a variable; "I'd like a double mocha, no, make it an int." Ch 4: The difference between instance and local variables. Ch 10: Static variable: value is the same for ALL instances of the class | Java has no true global variables. Static variables are the nearest equivalent. Syllabus types: Boolean, char, decimal, integer, string. |
| B2.1.2 | Construct programs that extract and manipulate substrings | Partial | Appendix B: #3 String and StringBuffer/StringBuilder Methods. Ch 14: Parsing with String split() | Appendix treatment only. Confirm that altering, concatenating and replacing are all shown. |
| B2.1.3 | Describe how programs use common exception handling techniques | Covered | Ch 11: Methods in Java use exceptions to tell the calling code, "Something Bad Happened. I failed."; Flow control in try/catch blocks; Finally: for the things you want to do no matter what; Catching multiple exceptions; Exceptions are polymorphic; Exception Rules | Syllabus names try/catch plus finally for Java. The chapter's examples are music-based. Add examples of unexpected input, unavailable resources and logic errors, which are the syllabus's failure points. |
| B2.1.4 | Construct and use common debugging techniques | Partial | Ch 5: Writing test code for the SimpleDotCom class; What's this? A bug? Ch 6: So what happened?; How do we fix it? | Bug-hunting narrative only. Trace tables, breakpoints and step-by-step execution are not taught. |
| B2.2.1 | Compare static and dynamic data structures | Covered | Ch 3: An array is like a tray of cups; Arrays are objects too. Ch 6: Wake up and smell the library; Comparing ArrayList to a regular array | Array vs ArrayList is the natural comparison. Memory allocation and resizing may need extra explanation. |
| B2.2.2 | Construct programs that apply arrays and Lists | Covered | Ch 3: Make an array of Dogs. Ch 5: The enhanced for loop. Ch 6: Some things you can do with ArrayList. Appendix B: #2 Multidimensional Arrays | 1D and 2D arrays plus ArrayList (the Java requirement). 2D arrays are only in the appendix. |
| B2.3.1 | Construct programs with the correct sequence of instructions | Partial | Ch 1: Code structure in Java; What can you say in the main method? | Basic structure only. Instruction-order errors, infinite loops and deadlock are not discussed. |
| B2.3.2 | Construct programs using selection structures | Covered | Ch 1: Simple boolean tests; Conditional branching. Ch 6: Super Powerful Boolean Expressions | Covers if/else and Boolean/relational operators. |
| B2.3.3 | Construct programs using looping structures | Covered | Ch 1: Looping and looping and...; Example of a while loop. Ch 5: More about for loops; Regular (non-enhanced) for loops; Trips through a loop; Difference between for and while; The enhanced for loop | Counted and conditional loops are both covered. |
| B2.3.4 | Construct functions and modularization (including scope) | Covered | Ch 4: You can send things to a method; You can get things back from a method; You can send more than one thing to a method; Java is pass-by-value. That means pass-by-copy. Ch 2: Quick! Get out of main! Appendix B: #7 Block Scope | Java calls functions "methods". Scope is mainly via local vs instance variables (Ch 4) and the appendix. |
| B2.5.1 | Construct code to perform file-processing operations | Covered | Ch 14: Writing a String to a Text File; Text File Example: e-Flashcards; The java.io.File class; Reading from a Text File; Quiz Card Builder (code outline); Quiz Card Player (code outline) | Syllabus names Scanner, FileWriter and BufferedReader for Java. The book's examples use FileWriter and BufferedReader. Scanner is not in the headings. Check that append mode is shown. |

### B3 Object-oriented programming (single class)

| Code | Syllabus statement | Rating | Head First Java sections | Notes |
|---|---|---|---|---|
| B3.1.1 | Evaluate the fundamentals of OOP | Covered | Ch 2: Chair Wars: (or How Objects Can Change Your Life); A class is not an object (but it's used to construct them). Ch 7: Understanding Inheritance; So what does all this inheritance really buy you? Ch 8: Polymorphism in action | Advantages are well covered. Disadvantages are thin, so add discussion for the "evaluate" command term. |
| B3.1.2 | Construct a design of classes, their methods and behaviour | Partial | Ch 2: Things an object knows about itself are called; Things an object can do are called. Ch 5: Developing a Class | Informal class design. UML class diagrams are not taught. |
| B3.1.3 | Distinguish between static and non-static variables and methods | Covered | Ch 10: The difference between regular (non-static) and static methods; What it means to have a class with static methods; Static methods can't use non-static (instance) variables!; Static variable: value is the same for ALL instances of the class; static final variables are constants. Ch 4: The difference between instance and local variables | Strong, direct coverage. |
| B3.1.4 | Construct code to define classes and instantiate objects | Covered | Ch 2: Making your first object; Making and testing Movie objects. Ch 9: Construct a Duck; Initializing the state of a new Duck; Using the constructor to initialize important Duck state; Be sure you have a no-arg constructor; Nanoreview: four things to remember about constructors | Includes constructors initialising state. |
| B3.1.5 | Explain and apply encapsulation and information hiding | Covered | Ch 4: Encapsulation; Do it or risk humiliation and ridicule; Hide the data; Encapsulating the GoodDog class. Appendix B: #4 Access Levels and Access Modifiers (Who Sees What) | Private/public access is covered. |

---

## Theme A: Concepts of computer science (Paper 1, Section A)

Only thin links to the book exist. Treat these as weak supplements, not coverage.

| Code | Syllabus statement | Rating | Head First Java sections | Notes |
|---|---|---|---|---|
| A1.2.2 | Explain how binary is used to store data | Partial | Ch 3: Declaring a variable. Appendix B: #10 Bit Manipulation | Primitive types and sizes only. Storage of text, images, audio and video is not covered. |
| A1.2.3 | Describe the purpose and use of logic gates | Partial | Ch 6: Super Powerful Boolean Expressions. Appendix B: #10 Bit Manipulation | Java's `&&`, `\|\|`, `!` and bitwise operators relate to AND/OR/NOT/XOR. Gates as circuits (NAND, NOR, XNOR) are not covered. |
| A2.1.4 | Describe the network protocols used for transport and application | Partial | Ch 15: Make a network Socket connection; A TCP port is just a number. A 16-bit number that identifies a specific program on the server | TCP ports and sockets only. UDP, HTTP, HTTPS and DHCP are not taught. |
| A2.2.3 | Compare and contrast networking models (client-server vs peer-to-peer) | Partial | Ch 15: Writing a Chat Client; Writing a simple server; The really really simple Chat Server | Client-server by example. Peer-to-peer and the comparison are not covered. |

---

## Quick view: which chapters earn their place for SL

| Chapter | Supports (SL) |
|---|---|
| Ch 1 Breaking the Surface | B2.1.1, B2.3.1, B2.3.2, B2.3.3, B1.1.1 |
| Ch 2 A Trip to Objectville | B3.1.1, B3.1.2, B3.1.4, B2.3.4, B1.1.2 |
| Ch 3 Know Your Variables | B2.1.1, B2.2.1, B2.2.2, A1.2.2 |
| Ch 4 How Objects Behave | B2.3.4, B3.1.5, B2.1.1 |
| Ch 5 Extra-Strength Methods | B2.3.3, B1.1.1, B1.1.2, B1.1.3, B2.1.4, B3.1.2, B2.2.2 |
| Ch 6 Using the Java Library | B2.2.1, B2.2.2, B2.3.2, B1.1.3, B2.1.4, A1.2.3 |
| Ch 7 Better Living in Objectville | B3.1.1 |
| Ch 8 Serious Polymorphism | B3.1.1 |
| Ch 9 Life and Death of an Object | B3.1.4 |
| Ch 10 Numbers Matter | B3.1.3, B2.1.1 |
| Ch 11 Risky Behavior | B2.1.3 |
| Ch 14 Saving Objects | B2.5.1, B2.1.2 |
| Ch 15 Make a Connection | A2.1.4, A2.2.3 |
| Appendix B Top Ten Topics | B2.1.2, B2.2.2, B2.3.4, B3.1.5, A1.2.2, A1.2.3 |

Chapters not needed for SL: Ch 12 (GUI), Ch 13 (Swing), Ch 16 (Collections and Generics), Ch 17 (Packages, JARs), Ch 18 (RMI). Ch 16 matters only for HL (B4).

---

## SL statements with no book support (for reference only)

- **Theme B:** B1.1.4 (flowcharts), B2.2.3 (stack), B2.2.4 (queue), B2.4.1 (Big O), B2.4.2 (linear and binary search), B2.4.3 (bubble and selection sort).
- **Theme A:** A1.1.1, A1.1.2, A1.1.4, A1.1.5, A1.1.7, A1.1.8, A1.1.9, A1.2.1, A1.2.4, A1.2.5, A1.3.1 to A1.3.4, A2.1.1 to A2.1.3, A2.2.1, A2.2.4, A2.3.1 to A2.3.3, A2.4.1, A2.4.4, A3.1.1, A3.2.1 to A3.2.7, A3.3.1 to A3.3.3, A4.1.1, A4.1.2, A4.4.1, A4.4.2.

The biggest gap for Paper 2 is B2.4 (search and sort algorithms and Big O), because Paper 2 is the paper this book mainly supports and that content is not in it.

---

## Notes for Part 2 (practice questions)

- Paper 2 SL is extended response on Theme B, 50 marks, 1h15, with a separate Java version. One question tests algorithmic thinking without reading or writing code.
- Assessment objectives are weighted 50% AO1 + AO2 (knowledge, application) and 50% AO3 (construct, synthesise, analyse, evaluate) for both papers.
- The guide's command terms on SL Theme B statements are: construct, trace, describe, compare, explain, evaluate, distinguish. I'll build the questions around these.
- Python's built-in functions (sort, pop, len, max, min) may be explicitly banned on some questions. Java versions will have equivalent restrictions on library methods such as `Collections.sort`.
