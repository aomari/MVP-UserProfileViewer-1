# Android MVP architecture phase 1: Sample App
[![AmjadOmari](https://firebasestorage.googleapis.com/v0/b/misc-31544.appspot.com/o/aomari.svg?alt=media&token=77658c30-5a06-4e1f-a783-2a51675d16b1)](http://www.amjadomari.com/)

In this tutorial we are demonstrating how to build an android MVP structure with Dagger2 dependency injection.
I've aimed to build a trivial small app to avoid the complexity, and to present the main point of the project in clear way.
<p align="center">
  <img src="https://firebasestorage.googleapis.com/v0/b/misc-31544.appspot.com/o/p2_2.PNG?alt=media&token=19460551-5dec-49f9-b197-a769c66a059d" width="250">
  <img src="https://firebasestorage.googleapis.com/v0/b/misc-31544.appspot.com/o/p2_1.PNG?alt=media&token=42118bb0-5756-4e4b-be3f-540a48fd7c34" width="250">
</p>
<br>
<br>

#### in this app I will avoid descripting any third part library to keep focus on the MVP structure and dagger2.

### What is Daggre2
Dagger 2 is dependency injection framework. It is based on the Java Specification Request (JSR) 330. It uses code generation and is based on annotations. The generated code is very relatively easy to read and debug.

### What is MVP
Model–view–presenter (MVP) is a derivation of the model–view–controller (MVC) architectural pattern, and is used mostly for building user interfaces. In MVP the presenter assumes the functionality of the "middle-man". In MVP, all presentation logic is pushed to the presenter.

### MVP divides the application into three basic components:
1. <B>Model:</B> It is responsible for handling the data part of the application.
2. <B>View:</B> It is responsible for laying out the views with specific data on the screen.
3. <B>Presenter:</B> It is a bridge that connects a Model and a View. It also acts as an instructor to the View.


### MVP lays few ground rules for the above mentioned components, as listed below:
1. A View’s sole responsibility is to draw UI as instructed by the Presenter. It is a dumb part of the application.
2. View delegates all the user interactions to its Presenter.
3. The View never communicates with Model directly.
4. The Presenter is responsible for delegating View’s requirements to Model and instructing View with actions for specific events.
5. Model is responsible for fetching the data from server, database and file system.


### Descripe the Splash Activity behavior.
<p align="center">
  <img src="https://firebasestorage.googleapis.com/v0/b/misc-31544.appspot.com/o/UserProfileVirewe%20phase%201%2Fsplash%20design.png?alt=media&token=36700694-780f-46ad-ab76-52d77875d6a2" width="400">
</p>

### Library reference resources:
1. calligraphy custom fonts: https://medium.com/@geekonjava/how-to-add-custom-font-in-android-using-calligraphy-library-5a086b28b569
2. Picasso image loader: http://square.github.io/picasso/
3. ButterKnife: http://jakewharton.github.io/butterknife/
4. Dagger2 dependency injection: https://medium.com/@iammert/new-android-injector-with-dagger-2-part-1-8baa60152abe

### Concept reference resources:
1. [MVP - mindorks](https://blog.mindorks.com/essential-guide-for-designing-your-android-app-architecture-mvp-part-1-74efaf1cda40)
2. [Dagger2](https://medium.com/@iammert/new-android-injector-with-dagger-2-part-1-8baa60152abe)
3. [Android developer](https://developer.android.com/index.html)

### aomari open source projects
[Check out amjadomari awesome open source projects here](http://www.amjadomari.com)


### Contributing to Android MVP Architecture
Just make pull request. You are in!
