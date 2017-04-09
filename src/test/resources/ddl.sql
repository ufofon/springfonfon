create  table  tb_notice(
  id  int  primary key  auto_increment,
  title  varchar(80) not null,
  contents  varchar(800) not null
) engine=InnoDB;

트랜젝션 기능 사용 하기 위해 쓴다
수행 속도는 떨어 진다

insert  into  tb_notice(title,contents)
   values
   ('open Test','open 2017'),
   ('korea open','2017 seoul ');
   
    
   
  create  table  tb_user(
  id  int  primary key  auto_increment,
  name  varchar(80) not null,
  email varchar(80) not null
) engine=InnoDB;


 create  table  tb_user_account(
  user_id  int  primary key  ,
  login_id  varchar(80) not null,
  password varchar(400) not null,
  status  varchar(40) not null,
  del_yn  tinyint  default  0
) engine=InnoDB;

insert  into  tb_user_account(
           user_id,login_id,password,status
      ) values (1,'user11','1234','ACTIVE');


   
   