<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<html>
  <head>
        <!-- FONTS -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <!-- CSS -->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.css"/>

        <!-- JS -->
        <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js"></script>
        <title>Admin</title>
  </head>

    <body>
        <nav class="blue darken-1" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="#" class="brand-logo">SkyShop Admin</a>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <br><br>

                <div class="col s6 offset-s3">
                    <div class="row">
                        <div>
                            <ul class="tabs">
                                <li class="tab col s2"><a class="teal-text" href="#product-admin">Product</a></li>
                                <li class="tab col s2"><a class="teal-text active" href="#employee-admin">Employee</a></li>
                                <li class="tab col s2"><a class="teal-text" href="#supplier-admin">Supplier</a></li>
                            </ul>
                        </div>

                        <ul id="product-admin" class="collapsible" data-collapsible="accordion">
                            <li>
                                <div class="collapsible-header"><i class="material-icons">search</i>Search</div>
                                <div class="collapsible-body">
                                    <div class="container col s12">
                                        <form class="col s12">
                                            <input id="product_search" type="text" class="validate">
                                            <label for="product_search">Search Products</label>
                                            <div class="row">
                                                <button class="waves-effect waves-teal btn right">
                                                    SEARCH<i class="material-icons right">search</i>
                                                </button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </li>

                            <li>
                                <div class="collapsible-header"><i class="material-icons">add</i>Add New</div>
                                <div class="collapsible-body">
                                    <div class="container">
                                        <!-- FORM TO ADD NEW PRODUCT -->
                                        <br>
                                        <div class="row">
                                            <form class="col s12">
                                                <div class="row">
                                                    <div class="input-field col s9">
                                                        <input id="product_name" type="text" class="validate">
                                                        <label for="product_name">Product Name</label>
                                                    </div>
                                                    <div class="input-field col s3">
                                                      <input id="price" type="text" class="validate">
                                                      <label for="price">Price(&#163;)</label>
                                                    </div>
                                                </div>
                                              
                                                <div class="row">
                                                    <div class="input-field col s12">
                                                        <textarea id="description" class="materialize-textarea"></textarea>
                                                        <label for="description">Description</label>
                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <div class="input-field col s12">
                                                        <input id="supplier" type="text" class="validate">
                                                        <label for="supplier">Supplier</label>
                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <div class="input-field col s12">
                                                        <input id="product_code" type="text" class="validate">
                                                        <label for="product_code">Product Code</label>
                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <button class="waves-effect waves-teal btn right">
                                                        ADD<i class="material-icons right">done</i>
                                                    </button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </li>
                         </ul>

                        <ul id="employee-admin">

                        </ul>

                        <ul id="supplier-admin">

                        </ul>

                    </div>
                </div>
            </div><!-- div.row -->
        </div><!-- div.container -->
    </body>
</html>
