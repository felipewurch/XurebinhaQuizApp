<?php
error_reporting (0);
if ($_SERVER['REQUEST_METHOD']=='POST'){

    require_once 'connect.php';

    $nome         = $_POST['nome'];
    $email        = $_POST['email'];
    $sql          = "INSERT INTO personalidade(nome,email) VALUES ('$nome','$email')";

    if(mysqli_query($conn, $sql)){
        $dados = mysqli_query($conn,"SELECT id FROM personalidade order by id desc");
        $linha = mysqli_fetch_assoc($dados);
        $id    = $linha['id'];

        $result["sucess"] = "1";
        $result["message"] = "sucess";
        $result["id"] = $id;
    }else{
        $result["sucess"] = "0";
        $result["message"] = "error";
    }
    echo json_encode($result);
    mysqli_close($conn);
}

?>
