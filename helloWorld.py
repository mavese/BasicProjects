message = 'Ifz!Bccz'
out = ''
for i in range(0,26):
	for x in range(0,len(message)):
		out += chr(ord(message[x])-i)
	print(out)
	out = ''
print 'Matteo'