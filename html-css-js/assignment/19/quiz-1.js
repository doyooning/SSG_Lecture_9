window.onload = function () {
  let todos = this.document.querySelectorAll('.check');

  for (let i = 0; i < todos.length; i++) {
    todos[i].addEventListener('click', function () {
      this.style.color = '#ccc';
      this.parentNode.style.color = '#ccc';
      this.parentNode.style.textDecoration = 'line-through';
    });
  }
};
