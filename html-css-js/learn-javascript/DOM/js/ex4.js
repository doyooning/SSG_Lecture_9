window.onload = function () {
  const hd3 = document.querySelectorAll('h1');

  for (let i = 0; i < hd3.length; i++) {
    const header = hd3[i];
    header.style.color = 'orange';
    header.style.backgroundColor = 'green';
    header.innerHTML += '<br> From JavaScript';
  }
};
