// Selecciona todos los botones "Comprar"
const botonesComprar = document.querySelectorAll('.btn-comprar');

botonesComprar.forEach(boton => {
  boton.addEventListener('click', () => {
    // Mostrar alerta al hacer clic en "Comprar"
    alert('¡Gracias por tu compra! Pronto recibirás más información.');
  });
});
