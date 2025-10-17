// 이벤트 연결

window.onload = function () {
  // 버튼 객체 선택
  let button1 = this.document.getElementById('button');

  // 이벤트 연결
  button1.onclick = function () {
    alert('click event');
  };
};

// 가장 일반적인 이벤트 속성 지정 형태
function buttonClick() {
  alert('onclick event handler');
}
