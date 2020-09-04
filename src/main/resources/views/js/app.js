var button = document.getElementById('button-calculator');

console.log(button);
button.addEventListener('click', function () {
    var data = document.getElementById('inputnumbers').value;
    console.log(data);
    axios.post('https://gentle-beyond-63920.herokuapp.com/solve/sort/', data)
        .then(res => {
            var result = JSON.parse(res.data)
            document.getElementById("resultList").innerHTML = "["+ result.List + "]";
            document.getElementById("listSum").innerHTML = result.sum ;
            document.getElementById("listAvg").innerHTML = result.avg ;
            
        })
        .catch(function (err) {
            console.log(err);
        })
});