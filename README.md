# sp-dubbo-parent
springboot-dubbo demo

一个基于springboot的dubbo微服务demo

### demo中的表结构
-- auto-generated definition

create table clone_chapter
(
    id       bigint auto_increment comment '主键'
        primary key,
    book_id  bigint       not null comment '书籍ID',
    title    varchar(255) null comment '章节标题',
    no       int          null comment '章节序号',
    content  text         null comment '章节内容',
    url      varchar(255) null comment '章节url',
    sim_hash varchar(100) null comment '码距值'
);

create index idx_bookid
    on clone_chapter (book_id);


### 需要外部资源：
1.mysql
2.zookeeper 单机即可
