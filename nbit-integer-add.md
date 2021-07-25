# Scope
input: add n-bit integers represented by arrays A[a1,a2,...,an] and B[b1,b2,...,bn]  
output: Return sum in array C[c1,c2,...,cn+1]

# Pseudo-code
```
NBIT-INTEGER-ADD(A, B)
	C = [A.length + 1]
	FOR i = 1 to A.length
		carry = C[i]
		C[i] = A[i] ^ B[i] ^ carry
		IF carry > 0
			C[i+1] = A | B
		ELSE
			C[i+1] = A & B
	return C
```

# Notes
|carry|A[i]|[B[i]|C[i]|C[i+1]|CONDITION
|-----|----|-----|----|------|---------
|0    |0   |0    |0   |0     | if carry < 1 -> C[i+1] = A & B
|0    |0   |1    |1   |0     | if carry < 1 -> C[i+1] = A & B
|0    |1   |0    |1   |0     | if carry < 1 -> C[i+1] = A & B
|0    |1   |1    |0   |1     | if carry < 1 -> C[i+1] = A & B
|1    |0   |0    |1   |0     | if carry > 0 -> C[i+1] = A | B
|1    |0   |1    |0   |1     | if carry > 0 -> C[i+1] = A | B
|1    |1   |0    |0   |1     | if carry > 0 -> C[i+1] = A | B
|1    |1   |1    |1   |1     | if carry > 0 -> C[i+1] = A | B

