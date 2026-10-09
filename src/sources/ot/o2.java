package ot;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.m f45934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f45935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah.b f45936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f45937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f45938e = Collections.synchronizedSet(new LinkedHashSet());

    public o2(wt.m mVar, i0 i0Var, ah.b bVar, vt.n0 n0Var) {
        this.f45934a = mVar;
        this.f45935b = i0Var;
        this.f45936c = bVar;
        this.f45937d = n0Var;
    }

    public final void a() {
        List listA1;
        Set activeDlServices = this.f45938e;
        kotlin.jvm.internal.m.e(activeDlServices, "activeDlServices");
        synchronized (activeDlServices) {
            Set activeDlServices2 = this.f45938e;
            kotlin.jvm.internal.m.e(activeDlServices2, "activeDlServices");
            listA1 = ry.m.a1(activeDlServices2);
        }
        Iterator it = listA1.iterator();
        while (it.hasNext()) {
            ((fv.c) it.next()).b();
        }
        this.f45938e.clear();
    }
}
