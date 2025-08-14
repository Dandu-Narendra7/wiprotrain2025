document.getElementById('textInput').oninput = function () {
  document.getElementById('charCount').textContent =
    (50 - this.value.length) + ' characters remaining';
};
