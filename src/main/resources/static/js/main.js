
$(".edit").on("click", function (){
    let postId = $(this).attr("data-id")
    window.location = "/posts/" + postId
});

