package ny;

import nx.f;
import nx.g;
import uw.k;
import yw.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ww.b, d {
    public long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f44291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f44292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gy.a f44295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44296f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f44297t;

    public a(k kVar, b bVar) {
        this.f44291a = kVar;
        this.f44292b = bVar;
    }

    public final void a(long j11, Object obj) {
        if (this.f44297t) {
            return;
        }
        if (!this.f44296f) {
            synchronized (this) {
                try {
                    if (this.f44297t) {
                        return;
                    }
                    if (this.H == j11) {
                        return;
                    }
                    if (this.f44294d) {
                        gy.a aVar = this.f44295e;
                        if (aVar == null) {
                            aVar = new gy.a(1);
                            this.f44295e = aVar;
                        }
                        int i11 = aVar.f29892c;
                        if (i11 == 4) {
                            Object[] objArr = new Object[5];
                            aVar.f29891b[4] = objArr;
                            aVar.f29891b = objArr;
                            i11 = 0;
                        }
                        aVar.f29891b[i11] = obj;
                        aVar.f29892c = i11 + 1;
                        return;
                    }
                    this.f44293c = true;
                    this.f44296f = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        test(obj);
    }

    @Override // ww.b
    public final void dispose() {
        if (this.f44297t) {
            return;
        }
        this.f44297t = true;
        this.f44292b.O(this);
    }

    @Override // yw.d
    public final boolean test(Object obj) {
        if (this.f44297t) {
            return true;
        }
        k kVar = this.f44291a;
        if (obj == g.COMPLETE) {
            kVar.onComplete();
            return true;
        }
        if (obj instanceof f) {
            kVar.onError(((f) obj).f44290a);
            return true;
        }
        kVar.onNext(obj);
        return false;
    }
}
