package fr;

import com.lingodeer.database.model.LanguageHistoryEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements vt.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.q0 f27998a;

    public z0(au.q0 q0Var) {
        this.f27998a = q0Var;
    }

    public final Object a(LanguageHistoryEntity languageHistoryEntity, xy.c cVar) {
        au.q0 q0Var = this.f27998a;
        Object objC = cf.x.C(cVar, q0Var.f3062a, false, true, new au.b(17, q0Var, languageHistoryEntity));
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? objC : b0Var;
    }
}
