$(document).ready(function (){
    dtalist();
    inicializarEvento();
function dtalist(){
    $('.informe').DataTable({
        "ajax":"../../create_informe",
        "type": "POST",
        "dataSrc": "lista",
        "columns": [
            {"data":"first_name"},
            {"data":"last_name"},
            {"data":"position"},
            {"data":"office"},
            {"data":"start_date"},
            {"data":"salary"}
        ]
    });
}

function inicializarEvento(){
$.ajax({
     type: 'POST',
         url: '../../create_informe',
         data:'opc=listax',
         error: function (data) {
              console.log("error lista");
         },
         success: function(data) {
             console.log(data);
              var html;
           $.each(data,function(i,json){
               $.each(json,function(j,item){
                   
                    html += '<tr>'
                    html += '<td>' + item.IDALUMNO + '</td>'
                    html += '<td>' + item.CODIGO + '</td>'
                    html += '<td>' + item.NOMBRE + '</td>'
                    html += '<td>' + item.APELL_PAT + '</td>'
                    html += '<td>' + item.APELL_MAT + '</td>'
                    html += '<td>' + item.DNI + '</td>'
                    html += '<td>' + item.CARRERA + '</td>'
                    html += '</tr>'
                    
               });
               $('.informe').append(html);
           });
           
         }
 });
 // var one =1;
  //listar_alumnos(one);
}
});