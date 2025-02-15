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

	for i := len(A) - 1; i >= 0; i-- {
		for j := 0; j <= i-1; j++ {
			if A[j] > A[j+1] {
				var temp int = A[j]
				A[j] = A[j+1]
				A[j+1] = temp
			}
		}
	}

	for i := 0; i < len(A); i++ {
		fmt.Print(A[i], " ")
	}

}
