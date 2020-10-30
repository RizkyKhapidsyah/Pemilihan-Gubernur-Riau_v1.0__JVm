 <?php
    $nm=$_POST['nama'];
    $nk=$_POST['nik'];

    $conn = mysql_connect("localhost","root","");
    mysql_select_db("projek1");

$query = "INSERT INTO pemilih (NIK,Nama) values ('$nk','$nm')";
$result = mysql_query($query) or die("REPORTGagal Query Simpan.");



 
   if (mysql_num_rows($result) == 1){
   
	    echo 1;
	}
   else {
 
	    // print status message
   	   echo 0;
	}


?>
