DROP DATABASE cinema;
CREATE DATABASE cinema DEFAULT CHARACTER SET 'utf8';
USE cinema;

CREATE TABLE kategori (
	id	int	auto_increment,
    isim varchar(255) not null,
    constraint pk_kategori
		primary key (id)
);

CREATE TABLE film (
	id int auto_increment,
    isim varchar(255) not null,
    sure int not null,
    constraint pk_film
		primary key(id)
);

create table film_kategori (
	film_id int,
    kategori_id int,
    constraint pk_film_kategori
		primary key (film_id, kategori_id),
	constraint fk_film_id
		foreign key (film_id)
			references film (id),
	constraint fk_kategori_id
		foreign key (kategori_id)
			references kategori (id)
);

create table salon (
	id int auto_increment,
    isim varchar(255) not null,
    fiyat_carpani float not null,
	constraint pk_salon
		primary key (id)
);

create table koltuk (
	id int auto_increment,
    salon_id int not null,
    sutun int not null,
    sira char(1) not null,
    fiyat_carpani float not null,
    constraint pk_koltuk
		primary key(id),
	constraint fk_salon_id
		foreign key (salon_id)
			references salon(id)
);

create table seans (
	id int auto_increment,
    baslangic_saati datetime not null,
    film_id int not null,
    salon_id int not null,
    fiyat_carpani float not null,
    constraint pk_seans
		primary key (id),
	constraint fk_film_id
		foreign key (film_id)
			references film (id),
	constraint fk_salon_id
		foreign key (salon_id)
			references salon (id)
);

create table bilet (
	id int auto_increment,
    musteri varchar(255) not null,
    seans_id int not null,
    koltuk_id int not null,
    fiyat_carpani float not null,
    fiyat float not null,
    constraint pk_bilet
		primary key(id),
	constraint fk_seans_id
		foreign key (seans_id)
			references seans (id),
	constraint fk_koltuk_id
		foreign key (koltuk_id)
			references koltuk (id)
);