package uu;

import kotlin.jvm.internal.m;
import qy.b0;
import s0.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2.l f53161b;

    public /* synthetic */ i(e2.l lVar, int i11) {
        this.f53160a = i11;
        this.f53161b = lVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f53160a) {
            case 0:
                p0 KeyboardActions = (p0) obj;
                m.f(KeyboardActions, "$this$KeyboardActions");
                e2.l.a(this.f53161b);
                break;
            case 1:
                p0 KeyboardActions2 = (p0) obj;
                m.f(KeyboardActions2, "$this$KeyboardActions");
                e2.l.a(this.f53161b);
                break;
            default:
                e2.l.a(this.f53161b);
                break;
        }
        return b0.f48488a;
    }
}
