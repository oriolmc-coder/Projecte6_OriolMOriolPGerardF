<?php

$mem_id = $_POST["mem_id"];
$username = $_POST["username"];
$password = $_POST["password"];
$fname = $_POST["fname"];
$lname = $_POST["lname"];
$address = $_POST["address"];

$servername = "localhost";
$username = "root";
$password = "12112017";
$db = "database";

$conn = new mysqli($servername, $username, $password, $db);

if ($conn->connect_error){
	die("Connection failed: ". $conn->connect_error);
}

$sql = "update member set username='$username', password='$password', fname='$fname', lname='$lname', address='$address' where mem_id='$mem_id'";

if ($conn->query($sql) === TRUE) {
	echo "Canvis realitzats: ".$fname."-".$lname;
} else {
	echo "Error: ".$sql."<br>".$conn->error;
}

$conn->close();

?>