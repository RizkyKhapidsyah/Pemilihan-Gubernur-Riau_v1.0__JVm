<html>  
    <head>  
    <meta charset="utf-8">  
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">    
  
    <link rel="stylesheet" href="jquery/dily.css">  
    <script type="text/javascript" src="jquery/jquery-1.6.4.min.js"></script>  
    <script type="text/javascript" src="jquery/jquery-1.6.4.mobile.js"></script>  
</head>  
<body >   
<body>    
<div data-role="page" > 
 
    <header data-role="header" data-theme="b">  
        <h1>Hasil <br>Pemilihan <br>Gubernur Riau</h1>  
    </header>  
  
    <div data-role="content" >  
	
<?php
$conn = mysql_connect("localhost","root","");
    mysql_select_db("projek1");

$query=mysql_query("SELECT calon_gubri.Ketua, calon_gubri.Wakil, count( pilihan ) AS hasil
FROM calon_gubri, rincian
WHERE calon_gubri.No_urut = rincian.pilihan
GROUP BY No_urut
ORDER BY hasil DESC");
?>

<table border ="1"  bordercolor="blue" cellpadding="3dp">
<tr  align ="center" bgcolor="iceblue">
<th> Cagub </th>
<th> Cawagub </th>
<th> Hasil </th>
</tr>
<tr >
<?php
while($row=mysql_fetch_array($query)){
?>

<td align ="center" bgcolor="#90BFFF"> 
 <?php echo $row['Ketua'];?> 
</td>
<td align ="center" bgcolor="#A9BFFF"> 
 <?php echo $row['Wakil'];?> 
</td>
<td align ="center" bgcolor="#B9BFFF"> 
 <?php echo $row['hasil'];?> 
</td>
</tr>

<?php
	}
?>
	
</table>
</div>

<br><br><br>
    <footer data-role="footer" data-theme="b"> 
        <h2>copyright KPU Riau &copy; </h2>  
    </footer>  
</div>


  
</body>  
</html>  
</body>  
</html>  