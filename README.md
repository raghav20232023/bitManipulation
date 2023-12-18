# bitManipulation

 Implementation of Bit Manipulation operations like clearBit, getBit, setBit, updateBit in command line interface. 

 Note: I strongly suggest the reader to refer to the in code comments if they get stuck anywhere. In the code, necessary comments are written at all the places where someone reading the code might get stuck. All login flow and formulae/implementation is also explained via comments inside the code itself :). The comments will clear all of your doubts.

I would also like to mention that at the same time I have put considerable effort in making sure the code is as clean and readable as possible, and all the variable names are written in English language pertaining to the function they perform.

**1. clearBit :**

To clear the bit in a number input by the user at a given position (also input by the user).
Remember, both the input and output is a decimal number. 

source code : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/53893d72-8c19-4dda-9f25-826b879faa53)

output : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/a11c6d24-9b86-40ff-98d7-9620e5ea87ae)

117 is 1110101 in binary
we have selected position 1 (index 0) to be cleared.
it is 1 so after clearing it will become 0.
final binary becomes 1110100 which is 116 in binary.

**2. getBit :**

To get the bit in a number input by the user at a position also input by the user.
Remember, both the inout and output is a decimal number.

source code : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/355ef35c-dd9b-4f0f-a606-0d1748dfb400)

output : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/f2125426-d586-41a7-9604-fad84db40a60)

117 is 1110101 in binary and bit at 3rd position from right i.e. 2nd index is 1.

**3. setBit :**

To set the bit in a number input by the user at position input by the user.
Sets the bit (0 or 1) to 1.
Remember, both the input and output is a decimal number.

source code : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/29c66c78-e6bc-44f2-b378-9eb520970f68)

output : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/46f45e1e-55bf-46fd-88ec-698c33802b71)

117 is 1110101 in binary
bit at position 2 is 0
it is set to 1 
so binary becomes 1110111
which is 119 in decimal.

**4. updateBit :**

To update the bit in a number input by the user at position input by the user to either 0 or 1.
Remember, both the input and output is a decimal number.

source code : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/b4d0778e-2bc5-44a9-a685-b1b8a00557ce)
![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/6b656ebd-5323-47a5-8baf-b6392ec4847e)

output : 

![image](https://github.com/raghav20232023/bitManipulation/assets/153320363/11be0a07-c280-417d-a1ac-e9446a81b620)

117 in 1110101 in binary
bit at position 2 is 0
we have chosen to update it to 1
so final binary becomes 1110111
which is 119 in decimal.

end
















 
