Linux task 20/12/24
Q01=Zip a directory.
Ans zip -r output.zip ./manish

Q02=Zip one file.
Ans zip example.zip file1.txt

Q03=unzip the archive.
unzip example.zip

Q04=Extract 3 files from the archive containing files
unzip example1.zip file1.txt file2.txt file3.txt

Q05:Name the zipfile backup.log
zip backup.log file1.txt file2.txt

Q06 Recursively zip a directory with its subdirectories
zip -r myfolder.zip . -i manish

Q07:Unzip to different locatio
unzip archive.zip -d /Downloads
