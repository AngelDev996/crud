//Autor: Angel Valladares
//Date: 01-09-2021
function eliminar(id){

  Swal.fire({
    title: '¿Estas Seguro?',
    text: "Esto sera irreversible",
    icon: 'warning',
    showCancelButton: true,
    confirmButtonColor: '#3085d6',
    cancelButtonColor: '#d33',
    confirmButtonText: 'Si, Eliminar'
  }).then((result) => {
    if (result.isConfirmed) {
      $.ajax({
        url:"/eliminar/"+id,
        success: function(res){
          console.log(res);
        }
      })
      Swal.fire(
        'Eliminado',
        'La entrada ha sido eliminada',
        'success'
      ).then((ok)=>{
        if(ok){
          location.href="/listar";
        }
      })
    }
  })

}