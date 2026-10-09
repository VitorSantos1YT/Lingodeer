package i10;

import d1.t;
import e5.m;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f34114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f34115b;

    public b() {
        t tVar = new t(1);
        tVar.f22991b = 16;
        tVar.f22992c = 21;
        tVar.f22994e = new m[16];
        this.f34114a = tVar;
        this.f34115b = new ReentrantLock();
    }

    public final Object a(long j11) {
        ReentrantLock reentrantLock = this.f34115b;
        reentrantLock.lock();
        try {
            Reference reference = (Reference) this.f34114a.d(j11);
            reentrantLock.unlock();
            if (reference != null) {
                return reference.get();
            }
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b(long j11, Object obj) {
        ReentrantLock reentrantLock = this.f34115b;
        reentrantLock.lock();
        try {
            this.f34114a.g(j11, new WeakReference(obj));
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // i10.a
    public final void c(Object obj, Object obj2) {
        this.f34114a.g(((Long) obj).longValue(), new WeakReference(obj2));
    }

    @Override // i10.a
    public final void clear() {
        ReentrantLock reentrantLock = this.f34115b;
        reentrantLock.lock();
        try {
            t tVar = this.f34114a;
            tVar.f22993d = 0;
            Arrays.fill((m[]) tVar.f22994e, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // i10.a
    public final Object d(Object obj) {
        Reference reference = (Reference) this.f34114a.d(((Long) obj).longValue());
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // i10.a
    public final Object get(Object obj) {
        return a(((Long) obj).longValue());
    }

    @Override // i10.a
    public final void lock() {
        this.f34115b.lock();
    }

    @Override // i10.a
    public final void m(int i11) {
        this.f34114a.i((i11 * 5) / 3);
    }

    @Override // i10.a
    public final boolean n(Object obj, Object obj2) {
        Long l9 = (Long) obj;
        ReentrantLock reentrantLock = this.f34115b;
        reentrantLock.lock();
        try {
            if (a(l9.longValue()) != obj2 || obj2 == null) {
                reentrantLock.unlock();
                return false;
            }
            reentrantLock.lock();
            try {
                this.f34114a.h(l9.longValue());
                reentrantLock.unlock();
                return true;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // i10.a
    public final void put(Object obj, Object obj2) {
        b(((Long) obj).longValue(), obj2);
    }

    @Override // i10.a
    public final void remove(Object obj) {
        Long l9 = (Long) obj;
        ReentrantLock reentrantLock = this.f34115b;
        reentrantLock.lock();
        try {
            this.f34114a.h(l9.longValue());
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // i10.a
    public final void t(ArrayList arrayList) {
        ReentrantLock reentrantLock = this.f34115b;
        reentrantLock.lock();
        try {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                this.f34114a.h(((Long) obj).longValue());
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // i10.a
    public final void unlock() {
        this.f34115b.unlock();
    }
}
