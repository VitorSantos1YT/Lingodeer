package hy;

import gy.f;
import gy.g;
import gy.h;
import qx.k;
import qx.p;
import rx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements k, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f33858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f33859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gy.a f33861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f33862e;

    public a(k kVar) {
        this.f33858a = kVar;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f33859b.b();
    }

    @Override // qx.k
    public final void c(b bVar) {
        if (ux.b.f(this.f33859b, bVar)) {
            this.f33859b = bVar;
            this.f33858a.c(this);
        }
    }

    @Override // rx.b
    public final void dispose() {
        this.f33862e = true;
        this.f33859b.dispose();
    }

    @Override // qx.k
    public final void onComplete() {
        if (this.f33862e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f33862e) {
                    return;
                }
                if (!this.f33860c) {
                    this.f33862e = true;
                    this.f33860c = true;
                    this.f33858a.onComplete();
                } else {
                    gy.a aVar = this.f33861d;
                    if (aVar == null) {
                        aVar = new gy.a(0);
                        this.f33861d = aVar;
                    }
                    aVar.a(h.COMPLETE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (this.f33862e) {
            p.u(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = true;
                if (!this.f33862e) {
                    if (this.f33860c) {
                        this.f33862e = true;
                        gy.a aVar = this.f33861d;
                        if (aVar == null) {
                            aVar = new gy.a(0);
                            this.f33861d = aVar;
                        }
                        aVar.f29890a[0] = new g(th2);
                        return;
                    }
                    this.f33862e = true;
                    this.f33860c = true;
                    z11 = false;
                }
                if (z11) {
                    p.u(th2);
                } else {
                    this.f33858a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        Object obj2;
        if (this.f33862e) {
            return;
        }
        if (obj == null) {
            this.f33859b.dispose();
            onError(f.a("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f33862e) {
                    return;
                }
                if (this.f33860c) {
                    gy.a aVar = this.f33861d;
                    if (aVar == null) {
                        aVar = new gy.a(0);
                        this.f33861d = aVar;
                    }
                    aVar.a(obj);
                    return;
                }
                this.f33860c = true;
                this.f33858a.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            gy.a aVar2 = this.f33861d;
                            if (aVar2 == null) {
                                this.f33860c = false;
                                return;
                            }
                            this.f33861d = null;
                            k kVar = this.f33858a;
                            for (Object[] objArr = aVar2.f29890a; objArr != null; objArr = objArr[4]) {
                                for (int i11 = 0; i11 < 4 && (obj2 = objArr[i11]) != null; i11++) {
                                    if (obj2 == h.COMPLETE) {
                                        kVar.onComplete();
                                        return;
                                    } else {
                                        if (obj2 instanceof g) {
                                            kVar.onError(((g) obj2).f29894a);
                                            return;
                                        }
                                        kVar.onNext(obj2);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
