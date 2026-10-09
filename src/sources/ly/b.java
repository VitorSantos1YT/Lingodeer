package ly;

import gy.e;
import gy.f;
import java.util.concurrent.atomic.AtomicReference;
import qx.h;
import qx.k;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f40519c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a[] f40520d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f40521a = new AtomicReference(f40520d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f40522b;

    @Override // qx.k
    public final void c(rx.b bVar) {
        if (this.f40521a.get() == f40519c) {
            bVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qx.h
    public final void j(k kVar) {
        a aVar = new a(kVar, this);
        kVar.c(aVar);
        while (true) {
            AtomicReference atomicReference = this.f40521a;
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f40519c) {
                Throwable th2 = this.f40522b;
                if (th2 != null) {
                    kVar.onError(th2);
                    return;
                } else {
                    kVar.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get()) {
                        n(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f40521a;
            a[] aVarArr2 = (a[]) atomicReference.get();
            if (aVarArr2 == f40519c || aVarArr2 == (aVarArr = f40520d)) {
                return;
            }
            int length = aVarArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (aVarArr2[i11] == aVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i11);
                System.arraycopy(aVarArr2, i11 + 1, aVarArr, i11, (length - i11) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                }
            }
            return;
        }
    }

    @Override // qx.k
    public final void onComplete() {
        AtomicReference atomicReference = this.f40521a;
        Object obj = atomicReference.get();
        Object obj2 = f40519c;
        if (obj == obj2) {
            return;
        }
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (!aVar.get()) {
                aVar.f40517a.onComplete();
            }
        }
    }

    @Override // qx.k
    public final void onError(Throwable th2) {
        if (th2 == null) {
            throw f.a("onError called with a null Throwable.");
        }
        e eVar = f.f29893a;
        AtomicReference atomicReference = this.f40521a;
        Object obj = atomicReference.get();
        Object obj2 = f40519c;
        if (obj == obj2) {
            p.u(th2);
            return;
        }
        this.f40522b = th2;
        a[] aVarArr = (a[]) atomicReference.getAndSet(obj2);
        for (a aVar : aVarArr) {
            if (aVar.get()) {
                p.u(th2);
            } else {
                aVar.f40517a.onError(th2);
            }
        }
    }

    @Override // qx.k
    public final void onNext(Object obj) {
        if (obj == null) {
            throw f.a("onNext called with a null value.");
        }
        e eVar = f.f29893a;
        for (a aVar : (a[]) this.f40521a.get()) {
            if (!aVar.get()) {
                aVar.f40517a.onNext(obj);
            }
        }
    }
}
