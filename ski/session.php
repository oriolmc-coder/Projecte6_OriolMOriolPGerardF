<?php
include('db.php');
session_start();
$user_check=$_SESSION['login_user'];
$sql="select * from member where username='$user_check'";
$ses_sql = $con->query($sql);
$row=mysqli_fetch_array($ses_sql);
$loggedin_session=$row['username'];
$loggedin_id=$row['mem_id'];
if(!isset($loggedin_session) || $loggedin_session==NULL) {
	echo "Go back";
	header("Location: login.php");
}
?>