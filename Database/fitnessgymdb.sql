
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

create database fitnessgym;

use fitnessgym;

create table login (name varchar(30), password varchar(16),FavColor varchar(200),HomeTown varchar(200),BirthYear varchar(200));


insert into login (name,password) values ("admin","1234");


CREATE TABLE `memberdatas` (
  `id` int NOT NULL,
  `Name` varchar(300) DEFAULT NULL,
  `Birthday` varchar(300) DEFAULT NULL,
  `PhoneNo` varchar(300) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Gender` varchar(10) NOT NULL,
  `FacebookAcc` varchar(300) NOT NULL,
  `Subscription` varchar(10) NOT NULL,
  `Amount` int DEFAULT NULL,
  `AmountStatus` varchar(10) DEFAULT NULL,
  `PendingAmount` int DEFAULT NULL,
  `StartDate` varchar(100) DEFAULT NULL,
  `EndDate` varchar(100) DEFAULT NULL,
  `Facility` varchar(300) DEFAULT NULL,
  `TotalBill` int DEFAULT NULL,
  `MemberID` varchar(300) Primary key,
  `Trainer` varchar(300) DEFAULT NULL
  );

CREATE TABLE `trainerdata` (
  `Id` int NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Birthday` varchar(100) DEFAULT NULL,
  `PhoneNo` varchar(100) DEFAULT NULL,
  `Address` varchar(500) DEFAULT NULL,
  `Gender` varchar(100) NOT NULL,
  `StartDate` varchar(100) DEFAULT NULL,
  `TID` varchar(300) Primary key
);
  
CREATE TABLE `facilitydata` (
  `Id` int Primary key auto_increment,
  `Type` varchar(100) DEFAULT NULL
  );