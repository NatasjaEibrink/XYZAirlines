
var baseUrl = "http://localhost:8080/api/"

$(document).ready(function() {
     console.log("Ready ... page loaded");

     $("#addButton").click(function() {

            var jsonObject = {
                flightNumber: $("#flightNumber").val(),
                currentDestination: $("#currentDestination").val(),
                fuelLevel: Number($("#fuelLevel").val())
            };
             $.ajax({
                    contentType : "application/json",
                     // waar moet hij de request op uitvoeren
                     url : baseUrl+"airplanes",
                     // type actie
                     type : "post",
                     data: JSON.stringify(jsonObject),
                     // als de actie lukt, voer deze functie uit
                     success: function(data){ // so the data is the bulb of the response of the Spring Boot REST controller
                          console.log(data);
                     }
                 });
          });
});