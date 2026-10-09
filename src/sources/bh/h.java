package bh;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.Model_Sentence_000;
import com.lingo.lingoskill.object.Model_Sentence_000Dao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4221a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j11, vy.d dVar) {
        super(2, dVar);
        this.f4221a = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new h(this.f4221a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    ij.d.f34419e = new ij.d(lingoSkillApplication);
                }
            }
        }
        ij.d dVar = ij.d.f34419e;
        kotlin.jvm.internal.m.c(dVar);
        Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
        kotlin.jvm.internal.m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
        k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(new Long(this.f4221a)), new k10.h[0]);
        gVarQueryBuilder.f37855f = 1;
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        Model_Sentence_000 model_Sentence_000 = (Model_Sentence_000) ry.m.s0(listD);
        if (model_Sentence_000 != null) {
            return ConvertUtilsKt.toCourseSentenceModel000(model_Sentence_000);
        }
        return null;
    }
}
