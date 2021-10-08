let userName = prompt("Adiniz nedir?")
document.querySelector(".name").innerHTML = userName

var clock;
function now() {
    var nowClock = new Date()

    var dayHour = nowClock.getHours()
    var dayMin = nowClock.getMinutes()
    var daySec = nowClock.getSeconds()

    clock = dayHour + ':' + ((dayMin < 10) ? '0' : "") + dayMin + ':' + ((daySec < 10) ? '0' : "") + daySec
    document.querySelector(".dateHour").innerHTML = clock
    setTimeout("now()", 1000)
}

let today = new Date()
let localDay = new Array(7)

localDay[0] = "Pazar";
localDay[1] = "Pazartesi";
localDay[2] = "Sali";
localDay[3] = "Carsamba";
localDay[4] = "Persembe";
localDay[5] = "Cuma";
localDay[6] = "Cumartesi";

let n = localDay[today.getDay()];

document.querySelector(".dateDay").innerHTML = n