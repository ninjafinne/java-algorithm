#Scope
input: Array A[a1,a2,...,an]

output: Array A sorted in ascending order.

# Pseudo-code
```
SELECTION-SORT(A)
	FOR i = 1 to A.length - 1
		min = i
		FOR j = i + 1 to A.length
			IF A[j] < A[min]
				min = j
		SWAP A[i] with A[min]
	return A
```

# Loop invariant
A[1..i] is sorted in ascending order

INITIALIZATION: Single element in subarray and thus sorted

MAINTENANCE: If A[i+1] > A[i] they will be swapped before next iteration of outer loop

TERMINATION: A[i+1] is implicitly sorted as it was swapped if needed in final inner loop.

# Big-O
O(n^2) -> Two loops

# Execution time
```
SELECTION-SORT(A)
	FOR i = 1 to A.length - 1         | c1  n
		min = i                        | c2  n - 1
		FOR j = i + 1 to A.length      | c3  SUM(n, i=2) = tj
			IF A[j] < A[min]            | c4  SUM(n, i=2) = (tj - 1)
				min = j                  | c5  SUM(n, i=2) = (tj - 1)
		SWAP A[i] with A[min]          | c6  n - 1
	return A                          |
	
T(n) = c1n + c2(n-1) + c3SUM(n, i=2)tj + c4 SUM(n, i=2)(tj-1) + c5 SUM(n, i=2)(tj-1) + c6(n-1)
```A