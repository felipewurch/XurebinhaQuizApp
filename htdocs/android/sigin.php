<?php

if ($_SERVER['REQUEST_METHOD']=='POST'){

require_once 'connect.php';

$nome         = $_POST['nome'];
$email        = $_POST['email'];
$sql          = "INSERT INTO personalidade(nome,email) VALUES ('$nome','$email')";

mysql_query($conn, $sql);
mysql_insert_id();

}

?>
