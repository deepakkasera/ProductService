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
