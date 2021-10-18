const args = process.argv.slice(2)

function areaOfCircle(radius) {
    console.log(`Yaricapi ${radius} olan dairenin alani: ${3.14 * radius**2}`)
}

areaOfCircle(args[0]*1)