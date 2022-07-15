CREATE TABLE IF NOT EXISTS public.Village_visitors (
    id bigserial NOT NULL,
    village bigint,
    district bigint,
    block bigint,
    pincode bigint,
    village_image bigint,
    contact_person character varying(255),
    contact_number bigint,
    no_of_households bigint,
    number_of_kirana_shops bigint,
    number_of_cosmetics_shops bigint,
    number_of_tea_small_eatries_shops bigint,
    number_of_other_shops bigint,
    number_of_milk_call_centers bigint,
    activities  smallint NOT NULL DEFAULT 1,
    banking_and_lending_institutions bigint,
    suitable_for_pragati_operations_and_no_of_clients bigint,
    CONSTRAINT Village_visitors_pkey PRIMARY KEY (id),
);

CREATE TABLE IF NOT EXISTS public.BankAndLendingIntitutions (
    id bigserial NOT NULL,
    name character varying(255) NOT NULL,
    type character varying(255) NOT NULL,
    client bigint NOT NULL,
    CONSTRAINT BankAndLendingIntitutions_pkey PRIMARY KEY (id),
    foreign key (id) references public.Village_visitors(id),
);

CREATE TABLE IF NOT EXISTS public.Activities (
    id bigserial NOT NULL,
    created_user character varying(255) NOT NULL,
    primary_activity character varying(255) NOT NULL,
    secondary_activity character varying(255) NOT NULL,
    CONSTRAINT Activities_pkey PRIMARY KEY (id),
    foreign key (Activities) references public.Village_visitors(id),
);





