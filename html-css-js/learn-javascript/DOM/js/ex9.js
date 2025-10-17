let i = 0;
function buttonClick() {
  let button = this.document.getElementById('button');
  const text = '이 거 어 디 까 지 늘 어 나 는 거 에 요 ?';
  const arr = text.split(' ');
  button.textContent += arr[i];
  i++;
  if (i == arr.length) {
    i = 0;
  }
}
