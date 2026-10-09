package ny;

import com.bumptech.glide.d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nx.e;
import nx.f;
import nx.g;
import uw.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f44299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f44300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f44301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f44302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f44303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44304f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f44298t = new Object[0];
    public static final a[] H = new a[0];
    public static final a[] K = new a[0];

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f44301c = reentrantReadWriteLock.readLock();
        this.f44302d = reentrantReadWriteLock.writeLock();
        this.f44300b = new AtomicReference(H);
        this.f44299a = new AtomicReference();
        this.f44303e = new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.d
    public final void K(k kVar) {
        gy.a aVar;
        Object obj;
        a aVar2 = new a(kVar, this);
        kVar.b(aVar2);
        AtomicReference atomicReference = this.f44300b;
        while (true) {
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == K) {
                Throwable th2 = (Throwable) this.f44303e.get();
                if (th2 == e.f44289a) {
                    kVar.onComplete();
                    return;
                } else {
                    kVar.onError(th2);
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar2;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar2.f44297t) {
                        O(aVar2);
                        return;
                    }
                    if (aVar2.f44297t) {
                        return;
                    }
                    synchronized (aVar2) {
                        try {
                            if (aVar2.f44297t) {
                                return;
                            }
                            if (aVar2.f44293c) {
                                return;
                            }
                            b bVar = aVar2.f44292b;
                            Lock lock = bVar.f44301c;
                            lock.lock();
                            aVar2.H = bVar.f44304f;
                            Object obj2 = bVar.f44299a.get();
                            lock.unlock();
                            aVar2.f44294d = obj2 != null;
                            aVar2.f44293c = true;
                            if (obj2 == null || aVar2.test(obj2)) {
                                return;
                            }
                            while (!aVar2.f44297t) {
                                synchronized (aVar2) {
                                    try {
                                        aVar = aVar2.f44295e;
                                        if (aVar == null) {
                                            aVar2.f44294d = false;
                                            return;
                                        }
                                        aVar2.f44295e = null;
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                for (Object[] objArr = aVar.f29890a; objArr != null; objArr = objArr[4]) {
                                    for (int i11 = 0; i11 < 4 && (obj = objArr[i11]) != null; i11++) {
                                        if (aVar2.test(obj)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f44300b;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                aVarArr = H;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i11);
                System.arraycopy(aVarArr2, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                }
            }
            return;
        }
    }

    @Override // uw.k
    public final void b(ww.b bVar) {
        if (this.f44303e.get() != null) {
            bVar.dispose();
        }
    }

    @Override // uw.k
    public final void onComplete() {
        AtomicReference atomicReference;
        nx.d dVar = e.f44289a;
        do {
            atomicReference = this.f44303e;
            if (atomicReference.compareAndSet(null, dVar)) {
                g gVar = g.COMPLETE;
                AtomicReference atomicReference2 = this.f44300b;
                a[] aVarArr = K;
                a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
                if (aVarArr2 != aVarArr) {
                    Lock lock = this.f44302d;
                    lock.lock();
                    this.f44304f++;
                    this.f44299a.lazySet(gVar);
                    lock.unlock();
                }
                for (a aVar : aVarArr2) {
                    aVar.a(this.f44304f, gVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // uw.k
    public final void onError(Throwable th2) {
        AtomicReference atomicReference;
        ax.d.a(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        do {
            atomicReference = this.f44303e;
            if (atomicReference.compareAndSet(null, th2)) {
                f fVar = new f(th2);
                AtomicReference atomicReference2 = this.f44300b;
                a[] aVarArr = K;
                a[] aVarArr2 = (a[]) atomicReference2.getAndSet(aVarArr);
                if (aVarArr2 != aVarArr) {
                    Lock lock = this.f44302d;
                    lock.lock();
                    this.f44304f++;
                    this.f44299a.lazySet(fVar);
                    lock.unlock();
                }
                for (a aVar : aVarArr2) {
                    aVar.a(this.f44304f, fVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
        qx.b.B(th2);
    }

    @Override // uw.k
    public final void onNext(Object obj) {
        ax.d.a(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f44303e.get() != null) {
            return;
        }
        Lock lock = this.f44302d;
        lock.lock();
        this.f44304f++;
        this.f44299a.lazySet(obj);
        lock.unlock();
        for (a aVar : (a[]) this.f44300b.get()) {
            aVar.a(this.f44304f, obj);
        }
    }
}
