#! python3
import webbrowser
import sys
import pyperclip

#program for searching an address in google maps
#to execute, add location as arguments to windows run OR leave the address in clipboard

sys.argv #listens for cmd arguments

if len(sys.argv) > 1:
    address = ' '.join(sys.argv[1:])

else: #if user did not use cmd args only used clipboard
    address = pyperclip.paste()

webbrowser.open('https://www.google.com/maps/place/' + address)