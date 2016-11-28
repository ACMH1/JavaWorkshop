CREATE TABLE `club`.`member` (
  `MemberNumber` INT NOT NULL,
  `surName` VARCHAR(45) NOT NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `secondName` VARCHAR(45) NULL,
  PRIMARY KEY (`MemberNumber`));
  
  CREATE TABLE `club`.`facility` (
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  PRIMARY KEY (`name`));
  
INSERT INTO `club`.`member` (`MemberNumber`, `surName`, `firstName`, `secondName`) VALUES ('1', 'a', 'alice', 'aa');
INSERT INTO `club`.`member` (`MemberNumber`, `surName`, `firstName`, `secondName`) VALUES ('2', 'b', 'bob', 'bb');
INSERT INTO `club`.`member` (`MemberNumber`, `surName`, `firstName`, `secondName`) VALUES ('3', 'c', 'carol', 'cc');
INSERT INTO `club`.`member` (`MemberNumber`, `surName`, `firstName`, `secondName`) VALUES ('4', 'd', 'daniel', 'dd');
INSERT INTO `club`.`member` (`MemberNumber`, `surName`, `firstName`, `secondName`) VALUES ('5', 'e', 'eve', 'ee');

INSERT INTO `club`.`facility` (`name`, `description`) VALUES ('hall a', 'a sports hall');
INSERT INTO `club`.`facility` (`name`, `description`) VALUES ('hall b', 'not a sports hall');
INSERT INTO `club`.`facility` (`name`, `description`) VALUES ('room c', 'a sports room');
INSERT INTO `club`.`facility` (`name`, `description`) VALUES ('room d', 'not a sports room');