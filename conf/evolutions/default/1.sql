# Tasks schema

# --- !Ups

CREATE SEQUENCE recipe_id_seq;
CREATE TABLE recipe (
    id integer NOT NULL DEFAULT nextval('recipe_id_seq'),
    title varchar(255)
);

# --- !Downs

DROP TABLE recipe;
DROP SEQUENCE recipe_id_seq;