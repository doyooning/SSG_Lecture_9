function drawTbl() {
  // 행, 열 가져오기
  let rows = document.querySelector('#rows').value;
  let columns = document.querySelector('#columns').value;

  // 테이블 만들기
  let newTbl = document.createElement('table');
  for (i = 0; i < rows; i++) {
    // row만큼 반복
    // tr 태그를 생성할 newTr
    let newTr = document.createElement('tr');
    for (j = 0; j < columns; j++) {
      // column만큼 반복
      // td 태그를 생성할 newTd
      let newTd = document.createElement('td');
      // 텍스트 노드를 생성할 tblText
      let tblText = document.createTextNode(i + ', ' + j);
      // 테이블 column의 텍스트 생성
      newTd.appendChild(tblText);
      // 테이블 column 생성
      newTr.appendChild(newTd);
    }
    // 테이블 row 생성
    newTbl.appendChild(newTr);
  }
  // contents 가져오기
  let contents = document.querySelector('#contents');
  // contents에 만든 테이블 생성
  contents.appendChild(newTbl);
}
