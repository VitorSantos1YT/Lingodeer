package d1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22994e;

    public /* synthetic */ t(int i11) {
        this.f22990a = i11;
    }

    public void a(int i11) {
        int[] iArr = (int[]) this.f22994e;
        int i12 = this.f22992c;
        iArr[i12] = i11;
        int i13 = this.f22993d & (i12 + 1);
        this.f22992c = i13;
        int i14 = this.f22991b;
        if (i13 == i14) {
            int length = iArr.length;
            int i15 = length - i14;
            int i16 = length << 1;
            if (i16 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i16];
            ry.l.H(0, i14, iArr, iArr2, length);
            ry.l.H(i15, 0, (int[]) this.f22994e, iArr2, this.f22991b);
            this.f22994e = iArr2;
            this.f22991b = 0;
            this.f22992c = length;
            this.f22993d = i16 - 1;
        }
    }

    public v b(int i11) {
        return new v(ue.f.u((j3.u0) this.f22994e, i11), i11, 1L);
    }

    public int c() {
        return this.f22993d - this.f22992c;
    }

    public Object d(long j11) {
        for (e5.m mVar = ((e5.m[]) this.f22994e)[((((int) (j11 >>> 32)) ^ ((int) j11)) & Integer.MAX_VALUE) % this.f22991b]; mVar != null; mVar = (e5.m) mVar.f24862c) {
            if (mVar.f24860a == j11) {
                return (WeakReference) mVar.f24861b;
            }
        }
        return null;
    }

    public int e(int i11) {
        return ((m1.l0) this.f22994e).f40799f[this.f22992c + i11];
    }

    public Object f(int i11) {
        return ((m1.l0) this.f22994e).f40801h[this.f22993d + i11];
    }

    public void g(long j11, WeakReference weakReference) {
        int i11 = ((((int) (j11 >>> 32)) ^ ((int) j11)) & Integer.MAX_VALUE) % this.f22991b;
        e5.m mVar = ((e5.m[]) this.f22994e)[i11];
        for (e5.m mVar2 = mVar; mVar2 != null; mVar2 = (e5.m) mVar2.f24862c) {
            if (mVar2.f24860a == j11) {
                mVar2.f24861b = weakReference;
                return;
            }
        }
        e5.m[] mVarArr = (e5.m[]) this.f22994e;
        e5.m mVar3 = new e5.m();
        mVar3.f24860a = j11;
        mVar3.f24861b = weakReference;
        mVar3.f24862c = mVar;
        mVarArr[i11] = mVar3;
        int i12 = this.f22993d + 1;
        this.f22993d = i12;
        if (i12 > this.f22992c) {
            i(this.f22991b * 2);
        }
    }

    public void h(long j11) {
        int i11 = ((((int) (j11 >>> 32)) ^ ((int) j11)) & Integer.MAX_VALUE) % this.f22991b;
        e5.m mVar = ((e5.m[]) this.f22994e)[i11];
        e5.m mVar2 = null;
        while (mVar != null) {
            e5.m mVar3 = (e5.m) mVar.f24862c;
            if (mVar.f24860a == j11) {
                if (mVar2 == null) {
                    ((e5.m[]) this.f22994e)[i11] = mVar3;
                } else {
                    mVar2.f24862c = mVar3;
                }
                this.f22993d--;
                return;
            }
            mVar2 = mVar;
            mVar = mVar3;
        }
    }

    public void i(int i11) {
        e5.m[] mVarArr = new e5.m[i11];
        int length = ((e5.m[]) this.f22994e).length;
        for (int i12 = 0; i12 < length; i12++) {
            e5.m mVar = ((e5.m[]) this.f22994e)[i12];
            while (mVar != null) {
                long j11 = mVar.f24860a;
                int i13 = ((((int) j11) ^ ((int) (j11 >>> 32))) & Integer.MAX_VALUE) % i11;
                e5.m mVar2 = (e5.m) mVar.f24862c;
                mVar.f24862c = mVarArr[i13];
                mVarArr[i13] = mVar;
                mVar = mVar2;
            }
        }
        this.f22994e = mVarArr;
        this.f22991b = i11;
        this.f22992c = (i11 * 4) / 3;
    }

    public String toString() {
        switch (this.f22990a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i11 = this.f22991b;
                sb2.append(i11);
                sb2.append('-');
                j3.u0 u0Var = (j3.u0) this.f22994e;
                sb2.append(ue.f.u(u0Var, i11));
                sb2.append(',');
                int i12 = this.f22992c;
                sb2.append(i12);
                sb2.append('-');
                sb2.append(ue.f.u(u0Var, i12));
                sb2.append("), prevOffset=");
                return ep.a.j(sb2, this.f22993d, ')');
            case 3:
                return BuildConfig.VERSION_NAME;
            default:
                return super.toString();
        }
    }

    public t(c10.a[] aVarArr) {
        this.f22990a = 4;
        this.f22991b = -1;
        this.f22992c = -1;
        this.f22993d = 0;
        this.f22994e = aVarArr;
    }

    public t() {
        this.f22990a = 5;
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f22993d = iHighestOneBit - 1;
        this.f22994e = new int[iHighestOneBit];
    }

    public t(m1.l0 l0Var) {
        this.f22990a = 2;
        this.f22994e = l0Var;
    }

    public t(int i11, int i12, int i13, j3.u0 u0Var) {
        this.f22990a = 0;
        this.f22991b = i11;
        this.f22992c = i12;
        this.f22993d = i13;
        this.f22994e = u0Var;
    }
}
