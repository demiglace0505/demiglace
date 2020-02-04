#! python3
import os
import traceback


#sample program for using error exceptions and writing to log file

try:
	raise Exception('This is a sample error message')
except:
	errorFile = open('sample_error_log.txt', 'a')

	#traceback function
	errorFile.write(traceback.format_exc())
	errorFile.close()

	print(traceback.format_exc())
	print('The traceback info is written to ' + os.getcwd() + '\\sample_error_log.txt')

