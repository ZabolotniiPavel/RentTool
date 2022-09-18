$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/user"
    }).then(function(data){
        $(".userName").append(data.userName);
        $(".mobile").append(data.mobileNumber);
    });
});