$(document).ready(function () {
    $('#timKiem').keyup(function() {
        var value = $(this).val().toLowerCase();
        $("#danh-sach-hoat-dong tbody tr").filter(function() {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });
})