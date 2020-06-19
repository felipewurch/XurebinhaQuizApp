<?php

if ($_SERVER['REQUEST_METHOD']=='POST'){

require_once 'connect.php';

$id           = $_POST['id'];
$porcentagemR = $_POST['porcentagemR'];
$porcentagemI = $_POST['porcentagemI'];
$porcentagemA = $_POST['porcentagemA'];
$porcentagemS = $_POST['porcentagemS'];
$porcentagemE = $_POST['porcentagemE'];
$porcentagemC = $_POST['porcentagemC'];
$sql          = "UPDATE personalidade
                    SET porcentagemR = $porcentagemR,
                        porcentagemI = porcentagemI,
                        porcentagemA = porcentagemA,
                        porcentagemS = porcentagemS,
                        porcentagemE = porcentagemE,
                        porcentagemC = porcentagemC  WHERE ID = $id";
mysqli_query($conn, $sql);

}
?>
