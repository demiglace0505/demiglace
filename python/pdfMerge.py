#! python3
import os
import PyPDF2

#This program merges two pdf files. The two files in this example is named
#meetingminutes1.pdf and meetingminutes2.pdf and the output combinedminutes.pdf

os.chdir(r'C:\Users\kuchai\Documents\demiglace')

pdf1File = open('meetingminutes1.pdf', 'rb')
pdf2File = open('meetingminutes2.pdf', 'rb')

#load into reader object
reader1 = PyPDF2.PdfFileReader(pdf1File)
reader2 = PyPDF2.PdfFileReader(pdf2File)

#initialize a blank writer object
writer = PyPDF2.PdfFileWriter()

#add pages to writer from PDF1
for pageNum in range(reader1.numPages):
    page = reader1.getPage(pageNum)
    writer.addPage(page)
#add pages to writer from PDF2
for pageNum in range(reader2.numPages):
    page = reader2.getPage(pageNum)
    writer.addPage(page)

#create pdf object to variable outputFile
outputFile = open('combinedminutes.pdf', 'wb')

#Save to actual pdf file in cwd
writer.write(outputFile)

outputFile.close()
pdf1File.close()
pdf2File.close()