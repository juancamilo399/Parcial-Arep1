var button = document.getElementById('button-calculator');

console.log(button);
button.addEventListener('click', function () {
    var data = document.getElementById('inputnumbers').value;
    console.log(data);
    var datos = data.split(",");

    console.log(datos);
    axios.post('http://localhost:4567/solve/sort/', data)
        //axios.post('http://localhost:4567/calculate', data)
        .then(res => {
            console.log("res")
            console.log(res)
            var result = JSON.parse(res.data)
            console.log("json result")
            console.log(result)

            document.getElementById("resultList").innerHTML = "["+ result.List + "]";
            document.getElementById("listSum").innerHTML = result.sum ;
            document.getElementById("listAvg").innerHTML = result.avg ;


        })
        .catch(function (err) {
            console.log(err);
        })
});