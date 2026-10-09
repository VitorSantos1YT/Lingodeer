package gb;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends md.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.n f28942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f28943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f28944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28945f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fb.a0 f28947h;

    static {
        fb.l.c("WorkContinuationImpl");
    }

    public l(p pVar, String str, fb.n nVar, List list) {
        this.f28940a = pVar;
        this.f28941b = str;
        this.f28942c = nVar;
        this.f28943d = list;
        this.f28944e = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (nVar == fb.n.REPLACE && ((fb.x) list.get(i11)).f27115b.f44867u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((fb.x) list.get(i11)).f27114a.toString();
            kotlin.jvm.internal.m.e(string, "id.toString()");
            this.f28944e.add(string);
            this.f28945f.add(string);
        }
    }

    public static HashSet B(l lVar) {
        HashSet hashSet = new HashSet();
        lVar.getClass();
        return hashSet;
    }

    public final fb.a0 A() {
        if (this.f28946g) {
            fb.l lVarB = fb.l.b();
            TextUtils.join(", ", this.f28944e);
            lVarB.getClass();
        } else {
            p pVar = this.f28940a;
            this.f28947h = jh.h.n(pVar.f28954b.f27057l, "EnqueueRunnable_" + this.f28942c.name(), pVar.f28956d.f47694a, new cr.n(this, 25));
        }
        return this.f28947h;
    }
}
