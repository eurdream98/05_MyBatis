DROP TABLE `tbl_department`;

CREATE TABLE `tbl_department`
(
    `department_code`    INTEGER NOT NULL AUTO_INCREMENT
 COMMENT '진료과코드',
    `department_name`    VARCHAR(255) NOT NULL COMMENT '진료과이름',
 PRIMARY KEY ( `department_code` )
) COMMENT = '진료과';


DROP TABLE `tbl_doctor`;

CREATE TABLE `tbl_doctor`
(
    `doctor_code`    INTEGER NOT NULL AUTO_INCREMENT
 COMMENT '의사코드',
    `doctor_name`    VARCHAR(255) NOT NULL COMMENT '의사이름',
    `doctor_gender`    VARCHAR(255) NOT NULL COMMENT '의사성별',
    `doctor_phone`    VARCHAR(255) NOT NULL COMMENT '의사전화번호',
    `doctor_email`    VARCHAR(255) COMMENT '의사이메일',
    `rank_code`    INTEGER NOT NULL COMMENT '의사직급코드',
    `department_code`    INTEGER NOT NULL COMMENT '진료과코드',
 PRIMARY KEY ( `doctor_code` )
) COMMENT = '의사';


DROP TABLE `tbl_medical_history`;

CREATE TABLE `tbl_medical_history`
(
    `medical_history_code`    INTEGER NOT NULL AUTO_INCREMENT
 COMMENT '진료내역코드',
    `medical_history_detail`    VARCHAR(255) NOT NULL COMMENT '진료내용',
    `medical_history_price`    INTEGER NOT NULL COMMENT '진료비',
    `medical_history_ispay`    VARCHAR(255) NOT NULL COMMENT '진료비완납여부',
    `medical_history_datetime`    VARCHAR(255) NOT NULL COMMENT '진료시각',
    `medical_history_runtime`    INTEGER NOT NULL COMMENT '진료시간',
    `patient_code`    INTEGER NOT NULL COMMENT '환자코드',
    `doctor_code`    INTEGER NOT NULL COMMENT '의사코드',
 PRIMARY KEY ( `medical_history_code` )
) COMMENT = '진료내역';


DROP TABLE `tbl_patient`;

CREATE TABLE `tbl_patient`
(
    `patient_code`    INTEGER NOT NULL AUTO_INCREMENT
 COMMENT '환자코드',
    `patient_name`    VARCHAR(255) NOT NULL COMMENT '환자이름',
    `patient_age`    INTEGER NOT NULL COMMENT '환자나이',
    `patient_gender`    VARCHAR(255) NOT NULL COMMENT '환자성별',
    `patient_phone`    VARCHAR(255) NOT NULL COMMENT '환자전화번호',
    `patient_email`    VARCHAR(255) COMMENT '환자이메일',
    `patient_sick`    VARCHAR(255) NOT NULL COMMENT '환자병명',
    `patient_admission`    VARCHAR(255) NOT NULL COMMENT '현재입원여부',
    `department_code`    INTEGER NOT NULL COMMENT '진료과코드',
 PRIMARY KEY ( `patient_code` )
) COMMENT = '환자';


DROP TABLE `tbl_rank`;

CREATE TABLE `tbl_rank`
(
    `rank_code`    INTEGER NOT NULL AUTO_INCREMENT
 COMMENT '의사직급코드',
    `rank_name`    VARCHAR(255) NOT NULL COMMENT '의사직급명',
 PRIMARY KEY ( `rank_code` )
) COMMENT = '의사직급';