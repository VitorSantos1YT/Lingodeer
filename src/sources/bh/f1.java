package bh;

import com.lingo.lingoskill.object.LDCharacterDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LDCharacterDao f4208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(LDCharacterDao lDCharacterDao, vy.d dVar) {
        super(2, dVar);
        this.f4208b = lDCharacterDao;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        f1 f1Var = new f1(this.f4208b, dVar);
        f1Var.f4207a = obj;
        return f1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((List) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.f4207a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        k10.g gVarQueryBuilder = this.f4208b.queryBuilder();
        gVarQueryBuilder.f(LDCharacterDao.Properties.CharId.c(list), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }
}
