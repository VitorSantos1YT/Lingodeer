package s7;

import android.os.SystemClock;
import b7.f0;
import java.util.Arrays;
import java.util.List;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f51404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f51406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y6.p[] f51407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f51408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51409f;

    public c(p0 p0Var, int[] iArr) {
        b7.a.j(iArr.length > 0);
        p0Var.getClass();
        y6.p[] pVarArr = p0Var.f57307d;
        this.f51404a = p0Var;
        int length = iArr.length;
        this.f51405b = length;
        this.f51407d = new y6.p[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f51407d[i11] = pVarArr[iArr[i11]];
        }
        Arrays.sort(this.f51407d, new bq.h(17));
        this.f51406c = new int[this.f51405b];
        int i12 = 0;
        while (true) {
            int i13 = this.f51405b;
            if (i12 >= i13) {
                this.f51408e = new long[i13];
                return;
            }
            int[] iArr2 = this.f51406c;
            y6.p pVar = this.f51407d[i12];
            int i14 = 0;
            while (true) {
                if (i14 >= pVarArr.length) {
                    i14 = -1;
                    break;
                } else if (pVar == pVarArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
            iArr2[i12] = i14;
            i12++;
        }
    }

    @Override // s7.s
    public final boolean a(int i11, long j11) {
        return this.f51408e[i11] > j11;
    }

    @Override // s7.s
    public final p0 b() {
        return this.f51404a;
    }

    @Override // s7.s
    public final int d(y6.p pVar) {
        for (int i11 = 0; i11 < this.f51405b; i11++) {
            if (this.f51407d[i11] == pVar) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f51404a.equals(cVar.f51404a) && Arrays.equals(this.f51406c, cVar.f51406c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s7.s
    public final y6.p f(int i11) {
        return this.f51407d[i11];
    }

    @Override // s7.s
    public final int h(int i11) {
        return this.f51406c[i11];
    }

    public final int hashCode() {
        if (this.f51409f == 0) {
            this.f51409f = Arrays.hashCode(this.f51406c) + (System.identityHashCode(this.f51404a) * 31);
        }
        return this.f51409f;
    }

    @Override // s7.s
    public int j(long j11, List list) {
        return list.size();
    }

    @Override // s7.s
    public final int l() {
        return this.f51406c[c()];
    }

    @Override // s7.s
    public final int length() {
        return this.f51406c.length;
    }

    @Override // s7.s
    public final y6.p m() {
        return this.f51407d[c()];
    }

    @Override // s7.s
    public final boolean o(int i11, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i11, jElapsedRealtime);
        int i12 = 0;
        while (i12 < this.f51405b && !zA) {
            zA = (i12 == i11 || a(i12, jElapsedRealtime)) ? false : true;
            i12++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f51408e;
        long j12 = jArr[i11];
        String str = f0.f3975a;
        long j13 = jElapsedRealtime + j11;
        if (((j11 ^ j13) & (jElapsedRealtime ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        jArr[i11] = Math.max(j12, j13);
        return true;
    }

    @Override // s7.s
    public final int u(int i11) {
        for (int i12 = 0; i12 < this.f51405b; i12++) {
            if (this.f51406c[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // s7.s
    public void g() {
    }

    @Override // s7.s
    public void k() {
    }

    @Override // s7.s
    public final void e(boolean z11) {
    }

    @Override // s7.s
    public void p(float f5) {
    }
}
