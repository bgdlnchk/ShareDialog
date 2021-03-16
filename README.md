# Share-Dialog
A simple Android library, which will help you to integrate share application functionality easier.

Add maven to build.gradle:
```
maven { url 'https://jitpack.io' }
```
After that add the library to the build.gradle(app):
```
implementation 'com.github.bgdlnchk:Share-Dialog:1.0.0'
```

An example of implementation:
```
val shareDialog = ShareDialog()
shareDialog.setLink("https://play.google.com/store/apps/details?id=com.instagram.android&hl=en_IN")
shareDialog.setDescription("I just downloaded this one application, you should try it for sure!")
shareDialog.setMessage("Do you want to share our application with your friends?")
shareDialog.showDialog(this)
```
        
How it looks like:\
![Screenshot_1615891687](https://user-images.githubusercontent.com/48859290/111297932-dee82f80-8656-11eb-9090-5695c9570c4a.png)
