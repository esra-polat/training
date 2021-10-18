const args = process.argv.slice(2)

function showPrimeNumbers(low, high) {
    for (let i = low; i <= high; i++) {
        let isPrime = true;
        for (let j = 2; j <= i; j++) {
            if (i % j === 0 && i !== j)
                isPrime = false;
        }
        if (isPrime)
            console.log(i)
    }
}

showPrimeNumbers(args[0]*1, args[1]*1)