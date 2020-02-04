#! python3
import shelve

#Using shelves to store variable data to harddrive
#on windows, .bak .dir and .dat files are created

shelfFile = shelve.open('data')
shelfFile['count'] = ['ichi', 'ni', 'mi', 'yon', 'itsu']
shelfFile.close()

shelfFile = shelve.open('data')

print(shelfFile['count'])

#similar to dictionaries, shelves also has key value pairs

print(list(shelfFile.keys()))
print(list(shelfFile.values()))

input('prompt')