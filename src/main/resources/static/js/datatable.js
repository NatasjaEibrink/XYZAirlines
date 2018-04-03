$(document).ready(function() {
        $('#test').DataTable( {
            "order": [[ 2, "asc" ]],
            "ajax": {
                    url: 'http://localhost:8080/api/airplanes',
                    dataSrc: ''
                },
            "columns": [
                { "data": "flightNumber" },
                { "data": "currentDestination" },
                { "data": "fuelLevel" }
            ]
        } );
    } );

