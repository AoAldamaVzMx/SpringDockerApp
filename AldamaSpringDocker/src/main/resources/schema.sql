CREATE TABLE PaymentSchedule (
    creditApplication   INTEGER      NOT NULL ,
    paymentNumber  INTEGER      NOT NULL ,
    paymentAmount   NUMERIC(20,6)      NOT NULL ,  
    paymentDate TIMESTAMP NOT NULL
);