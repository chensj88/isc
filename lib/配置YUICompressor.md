settings-->选择Tools—>External Tools，点击右侧的“+”： 

css
```java
    java
    -jar D:\java\yuicompressor-2.4.8.jar --type css --charset utf-8 $FilePath$ -o $FileNameWithoutExtension$.min.css
    $FileDir$
```
js
```java
    java
    -jar D:\java\yuicompressor-2.4.8.jar --type js --charset utf-8 $FilePath$ -o $FileNameWithoutExtension$.min.js
    $FileDir$
```
    