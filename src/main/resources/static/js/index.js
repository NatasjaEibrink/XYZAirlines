var baseUrl = "http://localhost:8080/api/"

$(document).ready(function() {
     console.log("Ready ... page loaded");

        $('#modalButton').click(modalToggle);

        function modalToggle (){
        $('#addFlightModal').modal('toggle');
        }

        $("#btnsubmit").click(function(){
            var jsonObject = {
                flightNumber: Number($("#flightNumber").val()),
                currentDestination: Number($("#currentDestination").val()),
                fuelLevel: Number($("#fuelLevel").val()),
            };
            $.ajax({
                contentType: "application/json",
                url: baseUrl+"airplanes",
                type: "post",
                data: JSON.stringify(jsonObject),
                succes: function(data){
                    console.log(data);
                }
            });
            updateTable();
            modalToggle();
        });
    });