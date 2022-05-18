$(document).ready(function(){
    $(".ad").on('click', function(){
        let adId = $(this).attr("data-id");
        window.location = "/ads/" + adId;
    });
});