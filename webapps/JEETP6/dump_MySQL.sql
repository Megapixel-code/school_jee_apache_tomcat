CREATE TABLE IF NOT EXISTS etudiant 
(
  Nom varchar(10) NOT NULL,
  Prenom varchar(10) NOT NULL,
  Id int(5) NOT NULL AUTO_INCREMENT,
  Age int(5) NOT NULL,
  PRIMARY KEY (Id)
);

CREATE VIEW V_Etudiant AS SELECT Nom, Prenom, Age * Age AS AgeCarre FROM etudiant;

INSERT INTO etudiant (Nom, Prenom, Id, Age) VALUES
('Gibbon', 'Jean', 0, 3),
('Gerard', 'ijij', 13, 12),
('Cruise', 'Tom', 3, 43),
('Wilson', 'Robert', 2, 55),
('Vincent', 'Gardeux', 12, 27),

('Paul', 'Watson', 98, 3),
('Lord', 'Brice', 913, 12),
('Timothe', 'Chalomet', 93, 43),
('Kevin', 'Jonson', 992, 55),
('Olivier', 'Durand', 9812, 27);
