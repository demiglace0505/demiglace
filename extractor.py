#! python3
import re
import pyperclip

#Extractor program


##############################
#Phone number regex
#Phone number possible formats: xxx-xxxx-xxx, (xxx)-xxxx-xxx, xxx-xxxx, xxx-xxxx ext 12345 ext.12345, x12345 
phoneRegex = re.compile(r'''(
((\d\d\d)|(\(\d\d\d\)))?		#area code, optional
(\s|-)?		#separator
\d\d\d		#first 3 digits
(\s|-)		#separator
\d\d\d\d		#last 4 digits
(((ext(\.)?\s)|x)	#extension, word part optional
	(\d{2,5}))?		#extension, number part optional

)''', re.VERBOSE)

###############################
#Email regex
#some.+_thing@something.xxx

emailRegex = re.compile(r'''(
[a-zA-Z0-9._%+-]+	#username part
@					#@
[a-zA-Z0-9._%+-]+	#domain

)''', re.VERBOSE)

##############################
#Extract from clipboard
text = str(pyperclip.paste())


###############################
#Extract from text

extractedPhone = phoneRegex.findall(text)
extractedEmail = emailRegex.findall(text)

allPhoneNumbers = []			#variable that stores all accumulated numbers
allEmailAddress = []

for phoneNum in extractedPhone:
	allPhoneNumbers.append(phoneNum[0])

for emailAd in extractedEmail:
	allEmailAddress.append(emailAd[0])


#################################
#copy to clipboard

results = '\n'.join(allPhoneNumbers) + '\n' + '\n'.join(extractedEmail)
pyperclip.copy(results)

print(results)
input("prompt: ")

