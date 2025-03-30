let images = [
    "../../assets/images/msd.jpg",
    "../../assets/images/Virat_Kohli.jpg",
    "../../assets/images/Ratan_Tata.jpg"
];
let index = 0;

function nextImage() {
    index = (index + 1) % images.length;
    document.getElementById("slider").src = images[index];
}

function prevImage() {
    index = (index - 1 + images.length) % images.length;
    document.getElementById("slider").src = images[index];
}
