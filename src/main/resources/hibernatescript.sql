INSERT INTO catagory (name) VALUES( 'Fish'), ('Meat'),('Fruits'), ('Veges'),('Whole Grains');
INSERT INTO vendor ( name) VALUES( 'Lafeber Company'), ('Bravo Packing, Inc.'), ('Central Nebraska Packing, Inc.'),( 'Animal Specialties Inc'), ('HMS Zoo Diets Inc'), ('Milliken Meat Products'),('Exotic Animal Supply');
INSERT INTO condition (name) VALUES( 'Good'), ('Bad'),('Criminal'), ('Fence'), ('Broken');

INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'Premium Daily Diet', 5, 1);
INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'GIRAFFE - FARE', 5, 2);
INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'Carnivore Feed', 2, 6);
INSERT INTO favfood ( name, catagory_id, vendor_id) VALUES( 'Banana', 3, 2);

INSERT INTO animal ( cname, link, sname, favfoodid) VALUES( 'Monkey', 'https://en.wikipedia.org/wiki/Monkey', 'Cercopithecidae', 4),('Giraffe','https://en.wikipedia.org/wiki/Giraffe','Giraffa camelopardalis',2),('Lion','https://en.wikipedia.org/wiki/Lion','Panthera leo',3),('Flamingo','https://en.wikipedia.org/wiki/American_flamingo','Phoenicopteridae',1),('Elephant','https://en.wikipedia.org/wiki/African_elephant','Loxodonta',4);

INSERT INTO public.enclosure( count, name, "time", animalid, conditionid) VALUES (2, 'MonkeyHouse', '1970-01-01 11:11:00', 1, 1),(15,'FlamingoPond','1970-01-01 16:00:00',4,4 ),(2,'Elephants Open Plains','1970-01-01 10:00:00',5,5);

