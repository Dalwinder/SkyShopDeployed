<%@ page import="com.springapp.model.Product" %>
<%@ page import="com.springapp.model.ProductCatalogue" %>
<%@ page import="java.util.List" %>
<html>
<body>

<%! public List<Product> products = ProductCatalogue.getCatalogue().getProducts(); %>

<ul>
	<% for(Product product: products){
		out.println("<li>" + product.getName() + "</li>");
	} %>
</ul>

</body>
</html>