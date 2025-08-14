function showLength() {
  var inputText = document.getElementById("textInput").value;
  var length = inputText.length;
  document.getElementById("output").textContent = "Length of text: " + length;
}
