#! /usr/bin/python3

import re

phoneNumRegex = re.compile(r'\d\d\d\d-\d\d\d-\d\d\d\d')

message = 'Call me at 0917-123-4567 or 0999-876-5432 tomorrow. 415-555-9999 is my office.'

print(phoneNumRegex.findall(message))
