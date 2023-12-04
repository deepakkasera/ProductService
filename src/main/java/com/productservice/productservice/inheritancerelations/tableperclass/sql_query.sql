select u1_0.id, u1_0.clazz_, u1_0.email, u1_0.name, u1_0.avg_rating, u1_0.psp, u1_0.ta_session
from (select id, email, name, null as avg_rating, null as psp, null as ta_session, 0 as clazz_
      from tpc_user
      union all
      select id, email, name, avg_rating, null as psp, null as ta_session, 1 as clazz_
      from tpc_mentor
      union all
      select id, email, name, null as avg_rating, psp, null as ta_session, 2 as clazz_
      from tpc_student
      union all
      select id, email, name, null as avg_rating, null as psp, ta_session, 3 as clazz_
      from tpc_ta) u1_0


select c1_0.id,
       c1_0.name,
       p1_0.category_id,
       p1_0.id,
       p1_0.description,
       p1_0.image,
       p1_0.price,
       p1_0.title
from category c1_0
         left join product p1_0 on c1_0.id = p1_0.category_id
where c1_0.id = ?


select c1_0.id,
       c1_0.name,
       p1_0.category_id,
       p1_0.id,
       p1_0.description,
       p1_0.image,
       p2_0.id,
       p2_0.currency,
       p2_0.value,
       p1_0.title
from category c1_0
         left join product p1_0 on c1_0.id = p1_0.category_id
         left join price p2_0 on p2_0.id = p1_0.price_id
where c1_0.id = ?
