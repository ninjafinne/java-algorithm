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
