let Date = ('2030-08-13');
let weekdays = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
let date = new Date(Date);
let day = weekdays[date.getDay()];
console.log(day)


