package bh;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.TravelPhraseDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4353a = i11;
        this.f4354b = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4353a) {
            case 0:
                return new s(this.f4354b, dVar, 0);
            case 1:
                return new s(this.f4354b, dVar, 1);
            default:
                return new s(this.f4354b, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4353a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((s) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = false;
        switch (this.f4353a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(ks.b.n(FirebaseRemoteConfig.d().f("audiolesson_unit_ids")).contains(new Long(this.f4354b)));
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (dj.b.f23431e == null) {
                    synchronized (dj.b.class) {
                        if (dj.b.f23431e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            dj.b.f23431e = new dj.b(lingoSkillApplication);
                        }
                        break;
                    }
                }
                dj.b bVar = dj.b.f23431e;
                kotlin.jvm.internal.m.c(bVar);
                long j11 = this.f4354b;
                k10.g gVarQueryBuilder = bVar.c().queryBuilder();
                gVarQueryBuilder.f(TravelPhraseDao.Properties.CID.b(Long.valueOf(j11)), new k10.h[0]);
                gVarQueryBuilder.e(" ASC", TravelPhraseDao.Properties.ID);
                List listD = gVarQueryBuilder.d();
                kotlin.jvm.internal.m.e(listD, "list(...)");
                return listD;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                String id2 = b7.e0.k(this.f4354b, bq.m.k(cf.x.n().keyLanguage), "_");
                if (gh.c.f29196a == null) {
                    synchronized (gh.c.class) {
                        if (gh.c.f29196a == null) {
                            gh.c.f29196a = new gh.c();
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(gh.c.f29196a);
                kotlin.jvm.internal.m.f(id2, "id");
                PdLessonFav pdLessonFav = (PdLessonFav) PdLessonDbHelper.INSTANCE.pdLessonFavDao().load(id2);
                if (pdLessonFav != null && pdLessonFav.getFav() == 1) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
        }
    }
}
