INSERT INTO public.eps(id, nombre) VALUES (1, "Eps Sanitas");
INSERT INTO public.eps(id, nombre) VALUES (2, "Compensar");
INSERT INTO public.eps(id, nombre) VALUES (3, "Sura");
INSERT INTO public.eps(id, nombre) VALUES (4, "Famisanar");
INSERT INTO public.eps(id, nombre) VALUES (5, "Seguros Bolivar");
INSERT INTO public.eps(id, nombre) VALUES (6, "Nueva EPS");

INSERT INTO public.centro_salud(id, direccion, nombre, personas, tiempo, eps_id) VALUES (1, 'Calle 25 # 67','4.6576141', '-74.1122502','Clinica colombia', '90', '56', '1');
INSERT INTO public.centro_salud(id, direccion, nombre, personas, tiempo, eps_id) VALUES (2, 'Calle 26 # 66','4.6598157', '-74.1010175', 'Compensar de la 68', '40', '30', '2');
INSERT INTO public.centro_salud(id, direccion, nombre, personas, tiempo, eps_id) VALUES (3, 'Ak. 70 #49-23','4.6598424', '-74.1075836', 'CUIDARTE TU SALUD SAS', '10', '15', '3');
INSERT INTO public.centro_salud(id, direccion, nombre, personas, tiempo, eps_id) VALUES (4, 'Ac. 26 ##69-63','4.6599484', '-74.1338485' 'Boston Medical Group', 5, '5', 1);
INSERT INTO public.centro_salud(id, direccion, nombre, personas, tiempo, eps_id) VALUES (5, 'Ak. 70 #51-41','4.6669137', '-74.107867' 'IPS Marco Fidel', 7, 20, 1);
INSERT INTO public.centro_salud(id, direccion, nombre, personas, tiempo, eps_id) VALUES (6, 'Cra. 69b #23C-76','4.6669616', '-74.123188' 'Denti Salud', 12, 5, 1);

INSERT INTO public.turno(id, turno, estado, fecha_inicio, fecha_atencion, fecha_finalizacion, id_centro_salud)
    VALUES(1, '1', 'REGISTRADO', '1569707711',  '1569707712', '1569708677', 1);
INSERT INTO public.turno(id, turno, estado, fecha_inicio, fecha_atencion, fecha_finalizacion, id_centro_salud)
    VALUES(2, '2', 'REGISTRADO', '1569707711',  '1569707712', '1569708677', 1);
INSERT INTO public.turno(id, turno, estado, fecha_inicio, fecha_atencion, fecha_finalizacion, id_centro_salud)
    VALUES(3, '3', 'REGISTRADO', '1569707711',  '1569707712', '1569708677', 1);
INSERT INTO public.turno(id, turno, estado, fecha_inicio, fecha_atencion, fecha_finalizacion, id_centro_salud)
    VALUES(4, '1', 'REGISTRADO', '1569707711',  '1569707712', '1569708677', 2);
INSERT INTO public.turno(id, turno, estado, fecha_inicio, fecha_atencion, fecha_finalizacion, id_centro_salud)
    VALUES(5, '2', 'REGISTRADO', '1569707711',  '1569707712', '1569708677', 2);
INSERT INTO public.turno(id, turno, estado, fecha_inicio, fecha_atencion, fecha_finalizacion, id_centro_salud)
    VALUES(6, '3', 'REGISTRADO', '1569707711',  '1569707712', '1569708677', 2);