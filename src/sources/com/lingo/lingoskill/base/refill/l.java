package com.lingo.lingoskill.base.refill;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f21733b;

    public /* synthetic */ l(m mVar, int i11) {
        this.f21732a = i11;
        this.f21733b = mVar;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f21732a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.m.f(it, "it");
                m mVar = this.f21733b;
                mVar.f21736c.getTravelCategoryDao().deleteAll();
                mVar.f21736c.getTravelCategoryDao().insertOrReplaceInTx(it);
                mVar.f21738e++;
                m.a(mVar);
                break;
            default:
                List it2 = (List) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                m mVar2 = this.f21733b;
                mVar2.f21736c.getTravelPhraseDao().deleteAll();
                mVar2.f21736c.getTravelPhraseDao().insertOrReplaceInTx(it2);
                mVar2.f21738e++;
                m.a(mVar2);
                break;
        }
    }
}
