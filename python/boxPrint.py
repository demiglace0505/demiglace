#! python3

def boxPrint(symbol, width, height):
	
	#Error message
	if len(symbol) != 1:
		raise Exception('"symbol" needs to be one character only')
	if (width < 2) or (height < 2 ):
		raise Exception('width and height must be greater than or 2')

	#top layer
	print(symbol * width)

	#walls
	for i in range(height - 2):
		print(symbol + (' ' * (width - 2)) + symbol)

	#bottom layer
	print(symbol * width)

symbolInput = str(input('Choose symbol: '))
widthInput = int(input('Enter width: '))
heightInput = int(input('Enter height: '))
print(boxPrint(symbolInput, widthInput, heightInput))
