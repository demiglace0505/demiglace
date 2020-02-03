#! /usr/bin/python3

import re

#must begin with Hello ^
beginsWithHello = re.compile(r'^Hello')
print('Hello there!')
print(beginsWithHello.search('Hello there!'))

print('#######################')
#must end with world $
endsWithWorld = re.compile(r'world$')
print('Hi to the world')
print(endsWithWorld.search('Hi to the world'))

#using both ^$ string must both begin and end with pattern, exact match only
print('#######################')

#Using dot wildcard (any char except new line), for newline use , re.DOTALL
atRegex = re.compile(r'.at')
print('The cat in the hat sat on the flat mat')
print(atRegex.findall('The cat in the hat sat on the flat mat'))

print('#######################')
#Using dot star to find first name and last name

nameRegex = re.compile(r'First Name: (.*) Last Name: (.*)')
print('First Name: Gucci Last Name: Doge')
print(nameRegex.findall('First Name: Gucci Last Name: Doge'))

print('#######################')
#case insensitive regex

vowelRegex = re.compile(r'[aeiou]')
print('Ichi Ni Mi Yon Itsu')
print(vowelRegex.findall('Ichi Ni Mi Yon Itsu'))

print('Without cases using re.IGNORECASE')
vowelRegex = re.compile(r'[aeiou]', re.IGNORECASE)
print(vowelRegex.findall('Ichi Ni Mi Yon Itsu'))