package p7;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements t7.l {
    public long K;
    public d7.h L;
    public x7.e0 M;
    public boolean N;
    public final /* synthetic */ s0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f46443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.p f46444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f46445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0 f46446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b7.f f46447e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f46449t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kw.b f46448f = new kw.b();
    public boolean H = true;

    public p0(s0 s0Var, Uri uri, d7.f fVar, b bVar, s0 s0Var2, b7.f fVar2) {
        this.O = s0Var;
        this.f46443a = uri;
        this.f46444b = new d7.p(fVar);
        this.f46445c = bVar;
        this.f46446d = s0Var2;
        this.f46447e = fVar2;
        s.f46460b.getAndIncrement();
        this.L = a(0L);
    }

    public final d7.h a(long j11) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = s0.f46462r0;
        Uri uri = this.f46443a;
        b7.a.l(uri, "The uri must be set.");
        return new d7.h(uri, 1, null, map2, j11, -1L, null, 6);
    }

    @Override // t7.l
    public final void e() {
        d7.f rVar;
        x7.m mVar;
        int i11;
        int iG = 0;
        while (iG == 0 && !this.f46449t) {
            try {
                long j11 = this.f46448f.f38845a;
                d7.h hVarA = a(j11);
                this.L = hVarA;
                long jU = this.f46444b.u(hVarA);
                if (this.f46449t) {
                    if (iG != 1 && ((b) this.f46445c).a() != -1) {
                        this.f46448f.f38845a = ((b) this.f46445c).a();
                    }
                    com.bumptech.glide.e.j(this.f46444b);
                    return;
                }
                if (jU != -1) {
                    jU += j11;
                    s0 s0Var = this.O;
                    s0Var.S.post(new n0(s0Var, 2));
                }
                long j12 = jU;
                this.O.U = k8.b.d(this.f46444b.f23253a.p());
                d7.p pVar = this.f46444b;
                k8.b bVar = this.O.U;
                if (bVar == null || (i11 = bVar.f37970f) == -1) {
                    rVar = pVar;
                } else {
                    rVar = new r(pVar, i11, this);
                    x7.e0 e0VarC = this.O.C(new r0(0, true));
                    this.M = e0VarC;
                    e0VarC.b(s0.f46463s0);
                }
                ((b) this.f46445c).b(rVar, this.f46443a, this.f46444b.f23253a.p(), j11, j12, this.f46446d);
                if (this.O.U != null && (mVar = ((b) this.f46445c).f46326b) != null && (mVar instanceof q8.d)) {
                    ((q8.d) mVar).f47575q = true;
                }
                if (this.H) {
                    m0 m0Var = this.f46445c;
                    long j13 = this.K;
                    x7.m mVar2 = ((b) m0Var).f46326b;
                    mVar2.getClass();
                    mVar2.f(j11, j13);
                    this.H = false;
                }
                while (iG == 0 && !this.f46449t) {
                    try {
                        b7.f fVar = this.f46447e;
                        synchronized (fVar) {
                            while (!fVar.f3974b) {
                                try {
                                    fVar.f3973a.getClass();
                                    fVar.wait();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        m0 m0Var2 = this.f46445c;
                        kw.b bVar2 = this.f46448f;
                        b bVar3 = (b) m0Var2;
                        x7.m mVar3 = bVar3.f46326b;
                        mVar3.getClass();
                        x7.j jVar = bVar3.f46327c;
                        jVar.getClass();
                        iG = mVar3.g(jVar, bVar2);
                        long jA = ((b) this.f46445c).a();
                        if (jA > this.O.K + j11) {
                            b7.f fVar2 = this.f46447e;
                            synchronized (fVar2) {
                                fVar2.f3974b = false;
                            }
                            s0 s0Var2 = this.O;
                            s0Var2.S.post(s0Var2.R);
                            j11 = jA;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iG == 1) {
                    iG = 0;
                } else if (((b) this.f46445c).a() != -1) {
                    this.f46448f.f38845a = ((b) this.f46445c).a();
                }
                com.bumptech.glide.e.j(this.f46444b);
            } catch (Throwable th3) {
                if (iG != 1 && ((b) this.f46445c).a() != -1) {
                    this.f46448f.f38845a = ((b) this.f46445c).a();
                }
                com.bumptech.glide.e.j(this.f46444b);
                throw th3;
            }
        }
    }

    @Override // t7.l
    public final void k() {
        this.f46449t = true;
    }
}
