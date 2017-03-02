To start contributing use these steps

Create a folder and do

```
git init
git add .
git commit -m '<comment>'
git remote add origin https://github.com/vtkrishn/blueMartini.git
git push -u origin master
```

Add the folder to the your PATH

Running the file
```
java -classpath <jar references> com.vtkrishn.resumeMaker.client.ResumeClient <fileName>
```

related libraries are there in this location
```
src\com\vtkrishn\resumeMaker\lib
junit-4.12.jar
poi-3.16-beta2.jar
poi-excelant-3.16-beta2.jar
poi-ooxml-3.16-beta2.jar
poi-ooxml-schemas-3.16-beta2.jar
poi-scratchpad-3.16-beta2.jar
xmlbeans-2.6.0.jar
```

jar for the class should be distributed to
```
src\com\vtkrishn\resumeMaker\dist\resumeMaker-beta.jar
```
