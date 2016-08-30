<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="Header.jsp" %>


<script>
    $(document).ready(function(){
        $('.table').DataTable({
            "lengthMenu": [[1,2,3,5,10, -1], [1,2,3,5,10, "All"]]
        });
    });
</script>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Inventory Page</h1>


            <p class="lead">This is the product inventory page:</p>

        <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Proto Thumb</th>
                <th>Product Name</th>
              <!--   <th>Category</th> -->
                <th>Description</th>
                <th>Price</th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.productId}.jpg" />" alt="image" style="width:100%"/></td>
                    <td>${product.pname}</td>
                   <%--  <td>${product.productCategory}</td> --%>
                    <td>${product.pdescription}</td>
                    <td>${product.price} USD </td>
                    <td>
                        <a href="<spring:url value="/product/viewProduct/${product.productId}" />">View</a>
                        <a href="<spring:url value="/admin/product/deleteProduct/${product.productId}" />">delete</a>
                        <a href="<spring:url value="/admin/product/editProduct/${product.productId}" />">edit</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/product/addProduct" />" class="btn btn-primary">Add Product</a>
        

<%@ include file="/WEB-INF/views/Footer.jsp" %>