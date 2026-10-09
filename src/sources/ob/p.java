package ob;

import androidx.work.OverwritingInputMerger;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import fb.c0;
import fb.e0;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final nf.f f44847y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f44849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fb.j f44852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fb.j f44853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f44855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f44856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fb.f f44857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f44858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fb.a f44859l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f44860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f44861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f44862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f44864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f44865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f44866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f44867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f44868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f44869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f44870x;

    static {
        kotlin.jvm.internal.m.e(fb.l.c("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f44847y = new nf.f(6);
    }

    public p(String id2, e0 state, String workerClassName, String inputMergerClassName, fb.j input, fb.j jVar, long j11, long j12, long j13, fb.f constraints, int i11, fb.a backoffPolicy, long j14, long j15, long j16, long j17, boolean z11, c0 outOfQuotaPolicy, int i12, int i13, long j18, int i14, int i15, String str) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(workerClassName, "workerClassName");
        kotlin.jvm.internal.m.f(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.m.f(input, "input");
        kotlin.jvm.internal.m.f(jVar, kHfjNGauVgdF.zZESDBlT);
        kotlin.jvm.internal.m.f(constraints, "constraints");
        kotlin.jvm.internal.m.f(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.m.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f44848a = id2;
        this.f44849b = state;
        this.f44850c = workerClassName;
        this.f44851d = inputMergerClassName;
        this.f44852e = input;
        this.f44853f = jVar;
        this.f44854g = j11;
        this.f44855h = j12;
        this.f44856i = j13;
        this.f44857j = constraints;
        this.f44858k = i11;
        this.f44859l = backoffPolicy;
        this.m = j14;
        this.f44860n = j15;
        this.f44861o = j16;
        this.f44862p = j17;
        this.f44863q = z11;
        this.f44864r = outOfQuotaPolicy;
        this.f44865s = i12;
        this.f44866t = i13;
        this.f44867u = j18;
        this.f44868v = i14;
        this.f44869w = i15;
        this.f44870x = str;
    }

    public static p b(p pVar, String str, fb.j jVar) {
        String id2 = pVar.f44848a;
        e0 state = pVar.f44849b;
        String inputMergerClassName = pVar.f44851d;
        fb.j output = pVar.f44853f;
        long j11 = pVar.f44854g;
        long j12 = pVar.f44855h;
        long j13 = pVar.f44856i;
        fb.f constraints = pVar.f44857j;
        int i11 = pVar.f44858k;
        fb.a backoffPolicy = pVar.f44859l;
        long j14 = pVar.m;
        long j15 = pVar.f44860n;
        long j16 = pVar.f44861o;
        long j17 = pVar.f44862p;
        boolean z11 = pVar.f44863q;
        c0 outOfQuotaPolicy = pVar.f44864r;
        int i12 = pVar.f44865s;
        int i13 = pVar.f44866t;
        long j18 = pVar.f44867u;
        int i14 = pVar.f44868v;
        int i15 = pVar.f44869w;
        String str2 = pVar.f44870x;
        pVar.getClass();
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.m.f(output, "output");
        kotlin.jvm.internal.m.f(constraints, "constraints");
        kotlin.jvm.internal.m.f(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.m.f(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new p(id2, state, str, inputMergerClassName, jVar, output, j11, j12, j13, constraints, i11, backoffPolicy, j14, j15, j16, j17, z11, outOfQuotaPolicy, i12, i13, j18, i14, i15, str2);
    }

    public final long a() {
        return ff.h.f(this.f44849b == e0.ENQUEUED && this.f44858k > 0, this.f44858k, this.f44859l, this.m, this.f44860n, this.f44865s, d(), this.f44854g, this.f44856i, this.f44855h, this.f44867u);
    }

    public final boolean c() {
        return !kotlin.jvm.internal.m.a(fb.f.f27064j, this.f44857j);
    }

    public final boolean d() {
        return this.f44855h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f44848a, pVar.f44848a) && this.f44849b == pVar.f44849b && kotlin.jvm.internal.m.a(this.f44850c, pVar.f44850c) && kotlin.jvm.internal.m.a(this.f44851d, pVar.f44851d) && kotlin.jvm.internal.m.a(this.f44852e, pVar.f44852e) && kotlin.jvm.internal.m.a(this.f44853f, pVar.f44853f) && this.f44854g == pVar.f44854g && this.f44855h == pVar.f44855h && this.f44856i == pVar.f44856i && kotlin.jvm.internal.m.a(this.f44857j, pVar.f44857j) && this.f44858k == pVar.f44858k && this.f44859l == pVar.f44859l && this.m == pVar.m && this.f44860n == pVar.f44860n && this.f44861o == pVar.f44861o && this.f44862p == pVar.f44862p && this.f44863q == pVar.f44863q && this.f44864r == pVar.f44864r && this.f44865s == pVar.f44865s && this.f44866t == pVar.f44866t && this.f44867u == pVar.f44867u && this.f44868v == pVar.f44868v && this.f44869w == pVar.f44869w && kotlin.jvm.internal.m.a(this.f44870x, pVar.f44870x);
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f44869w, defpackage.e.b(this.f44868v, defpackage.e.f(this.f44867u, defpackage.e.b(this.f44866t, defpackage.e.b(this.f44865s, (this.f44864r.hashCode() + defpackage.e.e(defpackage.e.f(this.f44862p, defpackage.e.f(this.f44861o, defpackage.e.f(this.f44860n, defpackage.e.f(this.m, (this.f44859l.hashCode() + defpackage.e.b(this.f44858k, (this.f44857j.hashCode() + defpackage.e.f(this.f44856i, defpackage.e.f(this.f44855h, defpackage.e.f(this.f44854g, (this.f44853f.hashCode() + ((this.f44852e.hashCode() + defpackage.e.d(defpackage.e.d((this.f44849b.hashCode() + (this.f44848a.hashCode() * 31)) * 31, 31, this.f44850c), 31, this.f44851d)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31, this.f44863q)) * 31, 31), 31), 31), 31), 31);
        String str = this.f44870x;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return p0.o(new StringBuilder("{WorkSpec: "), this.f44848a, '}');
    }

    public /* synthetic */ p(String str, e0 e0Var, String str2, String str3, fb.j jVar, fb.j jVar2, long j11, long j12, long j13, fb.f fVar, int i11, fb.a aVar, long j14, long j15, long j16, long j17, boolean z11, c0 c0Var, int i12, long j18, int i13, int i14, String str4, int i15) {
        this(str, (i15 & 2) != 0 ? e0.ENQUEUED : e0Var, str2, (i15 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i15 & 16) != 0 ? fb.j.f27095b : jVar, (i15 & 32) != 0 ? fb.j.f27095b : jVar2, (i15 & 64) != 0 ? 0L : j11, (i15 & 128) != 0 ? 0L : j12, (i15 & 256) != 0 ? 0L : j13, (i15 & 512) != 0 ? fb.f.f27064j : fVar, (i15 & 1024) != 0 ? 0 : i11, (i15 & 2048) != 0 ? fb.a.EXPONENTIAL : aVar, (i15 & 4096) != 0 ? 30000L : j14, (i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? -1L : j15, (i15 & 16384) == 0 ? j16 : 0L, (32768 & i15) != 0 ? -1L : j17, (65536 & i15) != 0 ? false : z11, (131072 & i15) != 0 ? c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : c0Var, (262144 & i15) != 0 ? 0 : i12, 0, (1048576 & i15) != 0 ? Long.MAX_VALUE : j18, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (i15 & 8388608) != 0 ? null : str4);
    }
}
