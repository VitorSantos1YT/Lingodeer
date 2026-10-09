package jh;

import bp.t3;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWordDao;
import fr.o0;
import java.util.ArrayList;
import java.util.List;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f36362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36363b;

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new k(2, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36363b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            List listZ = nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listZ) {
                long jLongValue = ((Number) obj2).longValue();
                k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdWordDao().queryBuilder();
                k10.h hVarB = PdWordDao.Properties.LessonId.b(new Long(jLongValue));
                org.greenrobot.greendao.d dVar = PdWordDao.Properties.Lan;
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                gVarQueryBuilder.f(hVarB, dVar.b(bq.m.k(x.n().keyLanguage)));
                if (gVarQueryBuilder.d().isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            List listU0 = ry.m.U0(arrayList, 15);
            List listK0 = ry.m.k0(arrayList, 15);
            String strY0 = ry.m.y0(listU0, ";", null, null, null, 62);
            rl.h hVar = rl.h.f49283a;
            this.f36362a = listK0;
            this.f36363b = 1;
            if (hVar.a(strY0, this) == aVar) {
                return aVar;
            }
            list = listK0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f36362a;
            com.bumptech.glide.e.F(obj);
        }
        return e0.B(e0.c(rz.o0.f50940a), null, null, new t3(list, null, 12), 3);
    }
}
