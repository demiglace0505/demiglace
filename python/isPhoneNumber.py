#! /usr/bin/python3
#This is a sample python function that checks if a given set of numbers
#is in the Philippine format xxxx-xxx-xxxx
#Note that this is the "primitive way" of pattern finding, as the better
#and easier way is to use regex


def isPhoneNumber(text):
	#check if 13 digits
	if len(text) != 13:
		return False

	#check 1st 4 digits
	for i in range(0,4):
		if not text[i].isdecimal():
			return False

	#check 5th char if hyphen
	if text[4] != '-':
		return False

	#check next three digits
	for i in range (5,8):
		if not text[i].isdecimal():
			return False

	#check next hyphen
	if text[8] != '-':
		return False

	#check last 4 digits
	for i in range (9,13):
		if not text[i].isdecimal():
			return False
	#all conditions clear
	return True

print('0917-123-4567, is this a phone number')
print(isPhoneNumber('0917-123-4567'))
print('415-555-4242 is this a phone number')
print(isPhoneNumber('415-555-4242'))
print('Yahallo Yahallo is this a phone number')
print(isPhoneNumber('Yahallo Yahallo'))

######################################
#Finding phone number in a text body

message = 'Call me at 0917-123-4567 or 0999-876-5432 tomorrow. 415-555-9999 is my office.'
print(message)

foundNumber = False

for i in range(len(message)):
	chunk = message[i:i+13]
	if isPhoneNumber(chunk):
		print('Phone number detected: ' + chunk)
		foundNumber = True

if not foundNumber:
	print('No phone numbers found')




