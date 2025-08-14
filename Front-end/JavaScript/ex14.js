let cities=["Anantapuramu","Chennai","Hyderbad","vijaywada"]
let button = document.getElementById("loadCities");
let dropdown = document.getElementById("cityDropdown");

sortedCities = cities.slice().sort();
sortedCities.forEach(function(city) {
    const option = document.createElement("option");
    option.text = city;
    option.value = city;
    dropdown.add(option);
  });


