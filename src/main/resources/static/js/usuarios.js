// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#dataTable').DataTable();
});

async function cargarUsuarios(){
    const request = await fetch('usuario/115', {
    method: 'GET',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        }
    });
    const usuarios = await request.json();

    console.log(usuarios);

    let usuario = '<tr><td>222</td><td>Jose Test Vallejo</td><td>jvalfdev@gmail.com</td><td>636595454</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';

    document.querySelector('#usuarios tbody').outerHTML = usuario;
}
