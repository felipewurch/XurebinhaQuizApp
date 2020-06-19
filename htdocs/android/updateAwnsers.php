<?php
error_reporting (0);
if ($_SERVER['REQUEST_METHOD']=='POST'){

    require_once 'connect.php';

    $id           = $_POST['id'];
    $porcentagemR = $_POST['porcentagemR'];
    $porcentagemI = $_POST['porcentagemI'];
    $porcentagemA = $_POST['porcentagemA'];
    $porcentagemS = $_POST['porcentagemS'];
    $porcentagemE = $_POST['porcentagemE'];
    $porcentagemC = $_POST['porcentagemC'];

    $sql          = "UPDATE personalidade ".
                    "   SET porcentagemR = $porcentagemR,".
                    "       porcentagemI = $porcentagemI,".
                    "       porcentagemA = $porcentagemA,".
                    "       porcentagemS = $porcentagemS,".
                    "       porcentagemE = $porcentagemE,".
                    "       porcentagemC = $porcentagemC  WHERE id = $id";

    if(mysqli_query($conn, $sql)){
        $result["sucess"] = "1";
        $result["message"] = "sucess";
    }else{
        $result["sucess"] = "0";
        $result["message"] = "error - ";
    }
    echo json_encode($result);
    mysqli_close($conn);

}
?>
