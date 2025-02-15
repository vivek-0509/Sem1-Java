package main

import (
	"fmt"
)

func main() {
	var N int
	fmt.Scan(&N)

	A := make([]int, N)

	for i := 0; i < len(A); i++ {
		fmt.Scan(&A[i])
	}

	for i := 0; i < len(A); i++ {

		for j := i; j > 0; j-- {
			if A[j] < A[j-1] {
				var temp = A[j]
				A[j] = A[j-1]
				A[j-1] = temp
			}
		}

	}

	for i := 0; i < len(A); i++ {
		fmt.Print(A[i], " ")
	}

}
