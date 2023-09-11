def reverse_file(filename): 
    S = ArrayStack() 

    original = open(filename) 
    for line in original:  
        S.push(line.rstrip( '\n' )) 
   
    output = open(filename, w )   

    while not S.is_empty():  
        output.write(S.pop( ) + '\n' ) 

    original.close()
    output.close() 

