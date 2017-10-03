CREATE TABLE public.employee (
    id integer NOT NULL,
    name character varying(128) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);