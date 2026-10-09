package com.android.billingclient.api;

import java.util.ArrayList;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7460b;

    public /* synthetic */ a0(Object obj, int i11) {
        this.f7459a = i11;
        this.f7460b = obj;
    }

    @Override // y4.a
    public final void accept(Object obj) {
        switch (this.f7459a) {
            case 0:
                j jVar = (j) obj;
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                rz.t tVar = (rz.t) ((a5.f) this.f7460b).f378b;
                kotlin.jvm.internal.m.c(jVar);
                tVar.J(new p(jVar, arrayList));
                return;
            case 1:
                ((a5.j) this.f7460b).n((j) obj);
                return;
            case 2:
                w4.f fVar = (w4.f) obj;
                if (fVar == null) {
                    fVar = new w4.f(-3);
                }
                ((qp.b) this.f7460b).b(fVar);
                return;
            default:
                w4.f fVar2 = (w4.f) obj;
                synchronized (w4.g.f54643c) {
                    try {
                        t0 t0Var = w4.g.f54644d;
                        ArrayList arrayList2 = (ArrayList) t0Var.get((String) this.f7460b);
                        if (arrayList2 == null) {
                            return;
                        }
                        t0Var.remove((String) this.f7460b);
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((y4.a) arrayList2.get(i11)).accept(fVar2);
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
