function factorial(n)
	fact = 1
	for i = 1, n, 1
	do
		fact = fact * i
	end
	return fact
end

io.write("Enter a Number: ")
n = io.read("*n")
io.write("Factorial of ", n, " = ", factorial(n))