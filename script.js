let preveiwContainer = document.querySelector('.products-preview');
let previewBox = preveiwContainer.querySelectorAll('.preview');

document.querySelectorAll('.products-container .card').forEach(card =>{
  card.onclick = () =>{
    preveiwContainer.style.display = 'flex';
    let name = card.getAttribute('data-name');
    previewBox.forEach(preview =>{
      let target = preview.getAttribute('data-target');
      if(name == target){
        preview.classList.add('active');
      }
    });
  };
});

previewBox.forEach(close =>{
  close.querySelector('.fa-times').onclick = () =>{
    close.classList.remove('active');
    preveiwContainer.style.display = 'none';
  };
});

let preveiwContainer1 = document.querySelector('.products-preview-1');
let previewBox1 = preveiwContainer1.querySelectorAll('.preview-1');

document.querySelectorAll('.products-container-1 .card').forEach(card =>{
  card.onclick = () =>{
    preveiwContainer1.style.display = 'flex';
    let name = card.getAttribute('data-name');
    previewBox1.forEach(preview1 =>{
      let target = preview1.getAttribute('data-target');
      if(name == target){
        preview1.classList.add('active');
      }
    });
  };
});

previewBox1.forEach(close =>{
  close.querySelector('.fa-times').onclick = () =>{
    close.classList.remove('active');
    preveiwContainer1.style.display = 'none';
  };
});