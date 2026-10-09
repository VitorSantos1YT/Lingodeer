package q1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f47372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f47373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47374f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f47375t;

    public f(e eVar, m[] mVarArr) {
        super(eVar.f47368c, mVarArr);
        this.f47372d = eVar;
        this.f47375t = eVar.f47370e;
    }

    public final void c(int i11, l lVar, Object obj, int i12) {
        int i13 = i12 * 5;
        m[] mVarArr = this.f47363a;
        if (i13 <= 30) {
            int iA = 1 << com.bumptech.glide.f.A(i11, i13);
            if (lVar.h(iA)) {
                mVarArr[i12].a(Integer.bitCount(lVar.f47383a) * 2, lVar.f(iA), lVar.f47386d);
                this.f47364b = i12;
                return;
            }
            int iT = lVar.t(iA);
            l lVarS = lVar.s(iT);
            mVarArr[i12].a(Integer.bitCount(lVar.f47383a) * 2, iT, lVar.f47386d);
            c(i11, lVarS, obj, i12 + 1);
            return;
        }
        m mVar = mVarArr[i12];
        Object[] objArr = lVar.f47386d;
        mVar.a(objArr.length, 0, objArr);
        while (true) {
            m mVar2 = mVarArr[i12];
            if (kotlin.jvm.internal.m.a(mVar2.f47387a[mVar2.f47389c], obj)) {
                this.f47364b = i12;
                return;
            } else {
                mVarArr[i12].f47389c += 2;
            }
        }
    }

    @Override // q1.d, java.util.Iterator
    public final Object next() {
        if (this.f47372d.f47370e != this.f47375t) {
            throw new ConcurrentModificationException();
        }
        if (!this.f47365c) {
            throw new NoSuchElementException();
        }
        m mVar = this.f47363a[this.f47364b];
        this.f47373e = mVar.f47387a[mVar.f47389c];
        this.f47374f = true;
        return super.next();
    }

    @Override // q1.d, java.util.Iterator
    public final void remove() {
        if (!this.f47374f) {
            throw new IllegalStateException();
        }
        boolean z11 = this.f47365c;
        e eVar = this.f47372d;
        if (!z11) {
            c0.c(eVar).remove(this.f47373e);
        } else {
            if (!z11) {
                throw new NoSuchElementException();
            }
            m mVar = this.f47363a[this.f47364b];
            Object obj = mVar.f47387a[mVar.f47389c];
            c0.c(eVar).remove(this.f47373e);
            c(obj != null ? obj.hashCode() : 0, eVar.f47368c, obj, 0);
        }
        this.f47373e = null;
        this.f47374f = false;
        this.f47375t = eVar.f47370e;
    }
}
