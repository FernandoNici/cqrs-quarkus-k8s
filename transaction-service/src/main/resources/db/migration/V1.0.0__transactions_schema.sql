CREATE TABLE transactions (
    id varchar not null primary key,
    beer_id varchar not null,
    description varchar not null,
    type varchar not null,
    value decimal not null
);
