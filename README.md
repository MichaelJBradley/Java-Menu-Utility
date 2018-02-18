# Java Menu Utility
This menu utiliy makes creating and using text menus in Java fast and easy. 
Make a static or mutable menu that displays its 
contents with the just call of a function. Get proper input from even the
most destructive user who actively tries to break
your program! Want to make sure a user chooses each option before moving on?
This utility records it for you. All of this wrapped up in a neat little
library.

## Get It!
* [Download](https://s3-us-west-1.amazonaws.com/michaeljbradley/java-menu-utility/jmu-0-1.zip)
* [Dropbox](https://www.dropbox.com/s/2f6vpm6bclao4lg/jmu-0-1.zip?dl=0#)

### Includes
* Library (jmu-0-1.jar)
* Sources (jmu-0-1-sources.jar)

## Use It!
To include this library in an existing Java project, add jmu-0-1.jar to the
Java build path.

### Example
```Java
Menu m = new ImmutableMenu(new Option[] {new Option("First"),
 new Option("Second"), new Option("Exit")};
do {
    m.display().getInput();
    System.out.println("User chose option: " + m.getChoice());
} while (m.getChoice() != 3);
```
In the code above, an ImmutableMenu is created from an array of 3 options.
The menu is then printed to the standard output and waits for user input. It
prints out the chosen option and repeats as long as the Exit option was not
chosen.

## Feedback
Report bugs or any other issues [here](https://github.com/MichaelJBradley/Java-Menu-Utility/issues)

## Follow Along!
* [Roadmap](https://trello.com/b/QZTnrlXV/java-menu-utility)
* [Development Blog](http://mikedevving.tumblr.com)

## Connect
Feel free to email me with feedback or anything else at mbrad012@ucr.edu 

## License
[GNU GPL 3.0](https://www.gnu.org/licenses/gpl-3.0.en.html)
