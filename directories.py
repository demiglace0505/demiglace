#! python3
import os

#script for listing all files and subfolders within a folder

userInput = input('Input the folder')

for folderName, subFolder, fileName in os.walk(userInput):
	print('The folder is ' + folderName)
	print('The subfolders in ' + folderName + ' are:' + str(subFolder))
	print('The files in ' + folderName + ' are:' + str(fileName))

input('prompt')