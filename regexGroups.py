#! /usr/bin/python3

#Groups are created in regex strings with parenthesis


import re

message = 'My phone number is 0917-123-4567'
phoneNumRegex = re.compile(r'(\d\d\d\d)-(\d\d\d-\d\d\d\d)')

match = phoneNumRegex.search(message)


print(message)
print(match.group())

#printing accdg to grouping
print(match.group(1))
print(match.group(2))
print(match.group(0))

print('######################')
#matching multiple characters using |

batMessage = 'Batman has joined the chat, he is currently on the Batmobile and will transfer to the Battank soon'
print(batMessage)
batRegex = re.compile(r'Bat(man|mobile|copter|tank)')
print(batRegex.findall(batMessage))

print('#######################')
#Using ()? to find phone numbers without area code

regEx = re.compile(r'(\d\d\d\d-)?\d\d\d-\d\d\d\d')
sampleNumber1 = 'My Number is 0917-123-4567'
sampleNumber2 = 'My Number is 123-4567'
print(sampleNumber1)
print(sampleNumber2)


sample1 = regEx.search(sampleNumber1)
sample2 = regEx.search(sampleNumber2)
print(sample1.group())
print(sample2.group())

print('#######################')

#Using asterisk ()* for multiple appearance (zero or more)
#plus ()+ is used for instance appearing at least once

batRegex = re.compile(r'Bat(wo)*man')
batMessage1 = 'The adventures of Batman'
batMessage2 = 'The adventures of Batwoman'
batMessage3 = 'The adventures of Batwowowowowowowoman'

print(batMessage1)
match1 = batRegex.search(batMessage1)
print(match1.group())

print(batMessage2)
match2 = batRegex.search(batMessage2)
print(match2.group())

print(batMessage3)
match3 = batRegex.search(batMessage3)
print(match3.group())


print('#######################')

#search for instance appearing specific times: use (){x}


haRegex = re.compile(r'(Ha){3}')
print('He said HaHaHa')
print(haRegex.search('He said HaHaHa'))

#find 3 phone numbers in a row which are separated by commas

phoneRegex = re.compile(r'((\d\d\d\d-)?\d\d\d-\d\d\d\d(,)?){3}')
print('My numbers are 0917-123-4567,123-4567,0999-854-1234')
print(phoneRegex.search(('My numbers are 0917-123-4567,123-4567,0999-854-1234')))


print('#######################')
#for range of possible repetitions, use (){x,y} - at least x, at most y times\
#note that python does greedy matching (max prioritized)
haRegex = re.compile(r'(Ha){3,5}')
print('He said HaHaHa')
print(haRegex.search('He said HaHaHa'))

haRegex = re.compile(r'(Ha){3,5}')
print('He said HaHaHaHaHa')
print(haRegex.search('He said HaHaHaHaHa'))

haRegex = re.compile(r'(Ha){3,5}')
print('He said HaHaHaHaHaHaHaHaHaHa')
print(haRegex.search('He said HaHaHaHaHaHaHaHaHaHa'))

# for non greedy match, use (){x,y}?

haRegex = re.compile(r'(Ha){3,5}?')
print('He said HaHaHa')
print(haRegex.search('He said HaHaHa'))

haRegex = re.compile(r'(Ha){3,5}?')
print('He said HaHaHaHaHa')
print(haRegex.search('He said HaHaHaHaHa'))

haRegex = re.compile(r'(Ha){3,5}?')
print('He said HaHaHaHaHaHaHaHaHaHa')
print(haRegex.search('He said HaHaHaHaHaHaHaHaHaHa'))