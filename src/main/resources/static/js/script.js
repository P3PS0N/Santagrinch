$.getJSON('/products', function(data) {
	tbl_body = "";
	
	for(var i = 0; i < data.length; i++) {
		tbl_body += "<tr>\n<th scope=\"row\">";
		tbl_body += i + 1;
		tbl_body += "</th>";

		tbl_body += "<td>";
		tbl_body += data[i].name;
		tbl_body += "</td>";

		tbl_body += "<td>";
		tbl_body += data[i].desc;
		tbl_body += "</td>";

		tbl_body += "<td>";
		tbl_body += data[i].price;
		tbl_body += "</td>";

		tbl_body += "</tr>";
	}	



	$("#product_table").html(tbl_body);

});
