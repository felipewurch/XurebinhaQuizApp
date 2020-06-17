<?php

if ($_SERVER['']=='POST'){

require_once 'connect.php';

$nome         = $POST ['nome'];
$email        = $POST ['email'];
$porcentagemR = $POST ['porcentagemR'];
$porcentagemI = $POST ['porcentagemI'];
$porcentagemA = $POST ['porcentagemA'];
$porcentagemS = $POST ['porcentagemS'];
$porcentagemE = $POST ['porcentagemE'];
$porcentagemC = $POST ['porcentagemC'];
$sql          = "INSERT INTO personalidade(nome,email,porcentagemR,porcentagemI,porcentagemA,porcentagemS,porcentagemE,porcentagemC) VALUES ('$nome','$email','$porcentagemR','$porcentagemI','$porcentagemA','$porcentagemS','$porcentagemE','$porcentagemC')";

mysql_query($conn, $sql);

}

