===Model View Controller

Probably the widest quoted pattern in UI development is Model View Controller (MVC) - it's also the most misquoted.
I've lost count of the times I've seen something described as MVC which turned out to be nothing like it.
Frankly a lot of the reason for this is that parts of classic MVC don't really make sense for rich clients these days.
But for the moment we'll take a look at its origins.

As we look at MVC it's important to remember that this was one of the first attempts to do serious UI work on any kind of scale.
Graphical User Interfaces were not exactly common in the 70's.
The Forms and Controls model I've just described came after MVC - I've described it first because it's simpler, not always in a good way.
Again I'll discuss Smalltalk 80's MVC using the assessment example:
 - but be aware that I am taking a few liberties with the actual details of Smalltalk 80 to do this
 - for start it was a monochrome system.

At the heart of MVC, and the idea that was the most influential to later frameworks, is what I call Separated Presentation.
The idea behind Separated Presentation is to make a clear division between domain objects that model our perception of the real world,
and presentation objects that are the GUI elements we see on the screen.

Domain objects should be completely self contained and work without reference to the presentation,
they should also be able to support multiple presentations, possibly simultaneously.
This approach was also an important part of the Unix culture, and continues today allowing many applications
to be manipulated through both a graphical and command-line interface.