 $(function(){

// 展示首页数据
         $.ajax({
             type: "GET",
             url: "/homeData",
             dataType: "json",
             success: function(data){

               for(i=0;i<data.length;i++){

var $tr = $("<tr>"+
"<td>"+data[i].id+"</td>"+
"<td>"+data[i].storeName+"</td>"+
"<td>"+data[i].storeManager+"</td>"+
"</tr>");
//var $table = $(".table1");
$('.table1').append($tr);
               }
                   }
         });

//<!--获取表格行数-->
//    var mytable = document.getElementById("table1");
//    var rows = mytable.rows.length
//    console.log("*************"+rows);
//    console.log("*************"+mytable.rows.length);



});




