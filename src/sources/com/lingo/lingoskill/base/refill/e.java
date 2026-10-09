package com.lingo.lingoskill.base.refill;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f21698b;

    public /* synthetic */ e(h hVar, int i11) {
        this.f21697a = i11;
        this.f21698b = hVar;
    }

    @Override // tx.c
    public final void accept(Object obj) {
        switch (this.f21697a) {
            case 0:
                b0 it = (b0) obj;
                kotlin.jvm.internal.m.f(it, "it");
                h hVar = this.f21698b;
                hVar.f21722g++;
                h.a(hVar);
                break;
            case 1:
                b0 it2 = (b0) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                h hVar2 = this.f21698b;
                hVar2.f21722g++;
                h.a(hVar2);
                break;
            case 2:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                this.f21698b.f21722g++;
                break;
            default:
                b0 it4 = (b0) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                h hVar3 = this.f21698b;
                hVar3.f21722g++;
                h.a(hVar3);
                break;
        }
    }
}
