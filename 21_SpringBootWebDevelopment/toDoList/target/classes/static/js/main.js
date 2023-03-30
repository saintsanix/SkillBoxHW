$(function(){

   $('#delete').click(function(){
       let nameTask = document.getElementById("name").value;
       $.post('/todolist/name', {nameTask : nameTask}, function(response){
           if(response == 'true'){
           alert('Задание \'' + nameTask + '\' удалено!');
           } else {
           alert('Такого задания нет!');
           }
           location.reload();
       });
   });

   $('#delete-list').click(function(){
       document.getElementById('to-do-list-list').innerHTML = "";
       $.post('/todolist/delete',{}, function(){
       alert('Список задач очищен');
       location.reload();
       });
   });

   $('#save-task').click(function(){
       var data = $('#to-do-list-form').serialize();
       $.ajax({
           method: "POST",
           url: '/todolist/add',
           data: data,
           success: function(response){
               var task = {};
               task.id = response;
               var dataArray = $('#to-do-list-form').serializeArray();
               for(i in dataArray){
                   task[dataArray[i]['name']] = dataArray[i]['value'];
               }
               location.reload();
           }
       });
       return false;
   });
});