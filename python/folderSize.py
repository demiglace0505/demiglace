#! python3
import os

#program for finding total size of all files inside a folder

#initialize totalSize
totalSize = 0

path = input('Enter filepath:')

for filename in os.listdir(path):
	if not os.path.isfile(os.path.join(path, filename)):
		continue
	totalSize = totalSize + os.path.getsize(os.path.join(path, filename))

print(totalSize)
input('prompt')

