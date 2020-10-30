/*
SQLyog Enterprise - MySQL GUI v8.2 RC2
MySQL - 5.5.27 : Database - projek1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projek1` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `projek1`;

/*Table structure for table `calon_gubri` */

DROP TABLE IF EXISTS `calon_gubri`;

CREATE TABLE `calon_gubri` (
  `No_urut` int(1) NOT NULL,
  `Ketua` varchar(15) NOT NULL,
  `Wakil` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `calon_gubri` */

insert  into `calon_gubri`(`No_urut`,`Ketua`,`Wakil`) values (1,'Drs.H. Achmad','Masrul'),(2,'Lukman Edy','Suryadi'),(3,'Jon Erizal','Mambang Mit'),(4,'Indra Mukhlis','Azin Zainal');

/*Table structure for table `pemilih` */

DROP TABLE IF EXISTS `pemilih`;

CREATE TABLE `pemilih` (
  `NIK` varchar(16) NOT NULL,
  `Nama` text NOT NULL,
  PRIMARY KEY (`NIK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pemilih` */

insert  into `pemilih`(`NIK`,`Nama`) values ('1','Abdul'),('1305140401940001','Ahmad'),('1307032108930001','Agusmar'),('1376012611920003','Nanda'),('14','Martha'),('1401030702930001','Hadi'),('1401052312920001','Iqhbal Delsal'),('1402010511930001','Ridho Novendra'),('1405112311930002','Hari Saputra'),('1406014703930001','Gema Rahmadani'),('1407101812930005','Deby Kholilah'),('1409030611930001','Saputra'),('1409032710920002','Agus Priadi'),('1471040108930003','Saputra'),('1471081103930022','Ramadhona'),('1471082009930021','Robi Anggara'),('1471082512920001','Ilham Guntur'),('1472016806930001','Wilda Hunafa'),('1478908765434 ','Budiman Santoso');

/*Table structure for table `rincian` */

DROP TABLE IF EXISTS `rincian`;

CREATE TABLE `rincian` (
  `NIK` varchar(16) NOT NULL,
  `pilihan` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `rincian` */

insert  into `rincian`(`NIK`,`pilihan`) values ('1305140401940001',3),('1376012611920003',4),('1409032710920002',3),('1405112311930002',4),('1406014703930001',1),('1471096111920021',1),('1471112101930022',1),('1471082512920001',3),('1402010511930001',3),('1472014101940006',2),('1307032108930001',3),('1407101812930005',4),('1472016806930001',2),('1401052312920001',1),('1471040108930003',1),('1409030611930001',3),('1401030702930001',2),('1471081103930022',4),('1471082009930021',1),('1471104805930021',3),('1472015606930021',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
