INSERT INTO catagory (name) VALUES( 'Fish'), ('Meat'),('Fruits'), ('Veges'),('Whole Grains');
INSERT INTO vendor ( name) VALUES( 'Lafeber Company'), ('Bravo Packing, Inc.'), ('Central Nebraska Packing, Inc.'),( 'Animal Specialties Inc'), ('HMS Zoo Diets Inc'), ('Milliken Meat Products');
INSERT INTO condition (name) VALUES( 'Good'), ('Bad'),('Criminal'), ('Fence'), ('Broken');

INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'Premium Daily Diet', 5, 1);
INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'GIRAFFE - FARE', 5, 2);
INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'Carnivore Feed', 2, 6);
INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'Banana', 3, 2);

INSERT INTO animal ( cname, link, sname, favfoodid) VALUES( 'Monkey', 'https://en.wikipedia.org/wiki/Monkey', 'Cercopithecidae', 4),('Giraffe','https://en.wikipedia.org/wiki/Giraffe','Giraffa camelopardalis',2);
--INSERT INTO public.enclosure( count, name, "time", animalid, conditionid) VALUES (1, 'monkey', '04:04 AM', 1, 1);
