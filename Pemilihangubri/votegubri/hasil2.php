 <?php
    $value=$_POST['pilihan'];
$nik=$_POST['nik'];
        	    	

    $conn = mysql_connect("localhost","root","");
    mysql_select_db("projek1");


$query = "INSERT INTO rincian (NIK,pilihan) values ('$nik','$value')";
$result = mysql_query($query) or die("REPORTGagal Query Simpan.");



 
   if (mysql_num_rows($result) == 1){
   
	    echo 1;
	}
   else {
 
	    // print status message
   	   echo 0;
	}


?>
