$(function() {
  $(document).on("click", "[data-confirm]", function(e) {
    e.preventDefault();
    var el = e.target;
    var $this = $(this);

    if(confirm($this.data('confirm'))) {
      $this.closest('form').submit();
    }
  })
})
