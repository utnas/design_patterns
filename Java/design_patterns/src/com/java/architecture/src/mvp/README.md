===The Model-View-Presenter (MVP) pattern

This pattern is one of the most common patterns in developing large applications.
It is similar to the older Model-View-Controller (MVC) pattern, which is not as meaningful in development.

Instead of an implementation-aware controller, there is an implementation-agnostic presenter that operates the view through an interface.
The view does not interact directly with the model.
This isolates the view implementation better than in MVC and allows easier unit testing of the presenter and model.