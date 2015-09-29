<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="modules/header.jsp" />
<jsp:include page="modules/remote.jsp" />

<div class="section">
</div>
<div class="product row">
  <div class="col s12 m5 l4 offset-l1 z-depth-2 blue-grey lighten-3">
    <img class="materialboxed" src="<spring:url value="/resources/img/box.jpg" />">
    <div class="section"></div>
    <div class="center">
      <a class="btn-floating btn-large waves-effect waves-light red"><i class="material-icons">shopping_basket</i></a>

      <!-- Dropdown Trigger -->
      <a class='dropdown-button btn btn-floating btn-large waves-effect waves-light blue' href='#' data-activates='dropdown1'>
        <i class="mdi-social-share"></i>
      </a>

      <!-- Dropdown Structure -->
      <ul id='dropdown1' class='dropdown-buttons'>
        <li><a class="btn-floating red"></a></li>
        <li><a class="btn-floating yellow darken-1"></a></li>
        <li><a class="btn-floating green"></a></li>
        <li><a class="btn-floating blue"></a></li>
      </ul>

    </div>
    <div class="section"></div>
  </div>
  <div class="col s12 m7 offset-l1 l5">
    <h3 class="header blue-grey-text">${product.name}</h3>
      <hr>
      <p>${product.description}</p>
  </div>
</div>
<div class="section">
</div>

<hr>

<div class="section">
</div>

<div class="row">
  <h4 class="center">Similar Products</h4>
  <div class="section"></div>
  <div class="col l3 s6">
    <div class="card">
      <div class="card-image waves-effect waves-block waves-light">
        <img src="<spring:url value="/resources/img/gnome.JPG" />">
          <span class="card-title">Product Title
              <a class="btn-floating waves-effect waves-light red"><i class="material-icons">play_arrow</i></a>
          </span>
      </div>
    </div>
  </div>
  <div class="col l3 s6">
    <div class="card">
      <div class="card-image waves-effect waves-block waves-light">
        <img src="<spring:url value="/resources/img/gnome.JPG" />">
          <span class="card-title">Product Title
              <a class="btn-floating waves-effect waves-light red"><i class="material-icons">play_arrow</i></a>
          </span>
      </div>
    </div>
  </div>
  <div class="col l3 s6">
    <div class="card">
      <div class="card-image waves-effect waves-block waves-light">
        <img src="<spring:url value="/resources/img/gnome.JPG" />">
          <span class="card-title">Product Title
              <a class="btn-floating waves-effect waves-light red"><i class="material-icons">play_arrow</i></a>
          </span>
      </div>
    </div>
  </div>
  <div class="col l3 s6">
    <div class="card">
      <div class="card-image waves-effect waves-block waves-light">
        <img src="<spring:url value="/resources/img/gnome.JPG" />">
          <span class="card-title">Product Title
              <a class="btn-floating waves-effect waves-light red"><i class="material-icons">play_arrow</i></a>
          </span>
      </div>
    </div>
  </div>
</div>
<div class="section">
</div>

<jsp:include page="modules/gnome.jsp" />
<jsp:include page="modules/bestsellers.jsp" />
<jsp:include page="modules/footer.jsp" />