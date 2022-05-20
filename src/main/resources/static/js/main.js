// redirect view
$(".edit").on("click", function (){
    let postId = $(this).attr("data-id")
    window.location = "/posts/" + postId
});

// form validation
$('#formId').submit(function (e) {
    if ($('#tag').val() == '') {
        alert("Please select an option");
        e.preventDefault(); //stop form submission
    } else {
        return true;
    }
});