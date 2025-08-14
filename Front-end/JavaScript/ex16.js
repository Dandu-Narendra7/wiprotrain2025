let images=[
    "box5_image.jpg",
    "box6_image.jpg",
    "box7_image.jpg",
    "box8_image.jpg"
];
galleryImage.src = images[currentIndex];
for (let i = 0; i < images.length; i++) {
  const img = new Image();
  img.src = images[i];
  console.log("Preloaded:", img.src);
}
const galleryImage = document.getElementById("galleryImage");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");
galleryImage.src = images[currentIndex];

prevBtn.addEventListener("click", function() {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  galleryImage.src = images[currentIndex];
});

nextBtn.addEventListener("click", function() {
  currentIndex = (currentIndex + 1) % images.length;
  galleryImage.src = images[currentIndex];
});



