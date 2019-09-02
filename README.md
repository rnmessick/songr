## Songr

**visit /hello for a warm greeting.**

**visit /albums to add your favorite albums to the site!**

**visit /albums/{album id} and see details of your favorite albums and even add song info too**

**visit /capitalize/{your word here} to turn your words into UPPER CASE.** For instance, you should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or you could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.

**visit /reverse to reverses the order of the words in a query parameter.** For example, if you visit /reverse?words=Hello world, it should return an HTML page containing world Hello.

### Instructions

In your terminal:

`git clone https://github.com/rnmessick/songr.git`

Type `psql` and type `CREATE DATABASE albums;`

Navigate to /Songr and
type:

`gradle bootRun`

visit: http://localhost:8080/hello

visit: http://localhost:8080/albums

### Collaborators and Resources

Matt Stuhring

Melfi Perez

Nick Paro

https://www.geeksforgeeks.org/reverse-words-given-string-java/
