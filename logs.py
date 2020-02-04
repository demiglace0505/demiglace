#! python3
import logging
logging.basicConfig(level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')
#logging to text file:
#logging.basicConfig(filename = 'logfilename.txt' level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')
#to disable logging:
logging.disable(logging.CRITICAL)

logging.debug('Program start')

def factorial(n):
	logging.debug('Start of factorial(%s)' % (n))
	total = 1
	for i in range (1, n+1):
		total = total * i
		logging.debug('i is %s, total is %s' % (i, total))

	logging.debug('Return value is %s' % (total))
	
	return total
print(factorial(5))

logging.debug('END')


