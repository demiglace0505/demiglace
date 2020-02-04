#! python3
import PyPDF2
import os

os.chdir(r'C:\Users\kuchai\Documents\demiglace')

#choose pdf file
filename = input('Insert pdf filename: ')
pdfFile = open(filename, 'rb') #reading binary

#load into reader variable
reader = PyPDF2.PdfFileReader(pdfFile)

#total no. of pages
print('Your PDF file has ' + str(reader.numPages ) + ' pages')

#extract chosen page text
targetPage = input('Enter page to extract text from ')
page = reader.getPage((int(targetPage) - 1))
print(page.extractText())

#extract text from all pages
#for pageNum in range(reader.numPages):
#    print(reader.getPage(pageNum).extractText())


