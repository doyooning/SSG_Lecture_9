var slides = document.querySelectorAll('#slides > img');
var prev = document.getElementById('prev');
var next = document.getElementById('next');

var current = 0;

showSlides(current);
prev.onclick = prevSlide;
next.onclick = nextSlide;

function showSlides(n) {
  for (var i = 0; i < slides.length; i++) {
    slides[i].style.display = 'none';
  } // 모든 이미지 감춤
  slides[n].style.display = 'block';
  // n번째 이미지만 표시
}

function prevSlide() {
  if (current > 0) {
    current -= 1;
  } else {
    current = slides.length - 1;
  }
  showSlides(current);
}

function nextSlide() {
  if (current < slides.length - 1) {
    current += 1;
  } else {
    current = 0;
  }
  showSlides(current);
}
