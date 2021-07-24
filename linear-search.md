# Scope
Write pseudo-code for linear search with characteristics:

input: array [a1..an] and key v  
output: index of key v in array or value NIL if not found

Prove algorithm correct using loop invariant.

# Pseudo-code
```
LINEAR-SEARCH(A, V)
	FOR i = 1 to A.length
		if A[i] == V THEN
			return i
	return NIL
```

# Loop invariant
A[1..i-1] does not contain V

**INITIALIZATION:** The subarray is empty and thus loop invariant true.  
**MAINTENANCE**: Loop is terminated by returning index if subarray contains V while i not yet incremented to value which exceeds for loop bound.
**TERMINATION**: i = A.length + 1 which makes subarray of [A..A.length]. Whole array evaluated and V not found. NIL returned.
