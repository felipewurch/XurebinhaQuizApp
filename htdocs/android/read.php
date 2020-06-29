<?php
    include "connect.php";

    $sql_read = "SELECT * FROM personalidade ORDER BY id DESC";
    $result = $conn->query($sql_read);

    $resultado = array();

    while($c = $result->fetch_assoc()) {
    echo json_encode($c);
	}
 ?>
	