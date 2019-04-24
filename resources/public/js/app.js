document.addEventListener('DOMContentLoaded', function() {
  document.body.addEventListener("click", function(e) {
    e.preventDefault();

    var el = e.target;

    var confirmMessage = el.getAttribute("data-confirm");
    if(confirmMessage && confirm(confirmMessage)) {
      el.closest('form').submit();
    }
  });
});
