package y6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f57228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f57229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f57231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f57232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f57233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f57234g = b.f57174c;

    static {
        w4.c.s(0, 1, 2, 3, 4);
    }

    public final long a(int i11, int i12) {
        a aVarA = this.f57234g.a(i11);
        if (aVarA.f57142a != -1) {
            return aVarA.f57147f[i12];
        }
        return -9223372036854775807L;
    }

    public final int b(long j11) {
        a aVarA;
        int i11;
        b bVar = this.f57234g;
        long j12 = this.f57231d;
        int i12 = bVar.f57176a;
        if (j11 != Long.MIN_VALUE && (j12 == -9223372036854775807L || j11 < j12)) {
            int i13 = 0;
            while (i13 < i12) {
                bVar.a(i13).getClass();
                bVar.a(i13).getClass();
                if (0 > j11 && ((i11 = (aVarA = bVar.a(i13)).f57142a) == -1 || aVarA.a(-1) < i11)) {
                    break;
                }
                i13++;
            }
            if (i13 < i12) {
                if (j12 != -9223372036854775807L) {
                    bVar.a(i13).getClass();
                    if (0 <= j12) {
                    }
                }
                return i13;
            }
        }
        return -1;
    }

    public final int c(long j11) {
        b bVar = this.f57234g;
        int i11 = bVar.f57176a;
        int i12 = i11 - 1;
        if (i12 == i11 - 1) {
            bVar.a(i12).getClass();
        }
        while (i12 >= 0 && j11 != Long.MIN_VALUE) {
            bVar.a(i12).getClass();
            if (j11 >= 0) {
                break;
            }
            i12--;
        }
        if (i12 >= 0) {
            a aVarA = bVar.a(i12);
            int i13 = aVarA.f57142a;
            if (i13 != -1) {
                for (int i14 = 0; i14 < i13; i14++) {
                    int i15 = aVarA.f57146e[i14];
                    if (i15 != 0 && i15 != 1) {
                    }
                }
            }
            return i12;
        }
        return -1;
    }

    public final long d(int i11) {
        this.f57234g.a(i11).getClass();
        return 0L;
    }

    public final int e(int i11) {
        return this.f57234g.a(i11).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.class.equals(obj.getClass())) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Objects.equals(this.f57228a, m0Var.f57228a) && Objects.equals(this.f57229b, m0Var.f57229b) && this.f57230c == m0Var.f57230c && this.f57231d == m0Var.f57231d && this.f57232e == m0Var.f57232e && this.f57233f == m0Var.f57233f && Objects.equals(this.f57234g, m0Var.f57234g);
    }

    public final boolean f(int i11) {
        b bVar = this.f57234g;
        int i12 = bVar.f57176a;
        if (i11 != i12 - 1 || i11 != i12 - 1) {
            return false;
        }
        bVar.a(i11).getClass();
        return false;
    }

    public final boolean g(int i11) {
        this.f57234g.a(i11).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i11, long j11, long j12, b bVar, boolean z11) {
        this.f57228a = obj;
        this.f57229b = obj2;
        this.f57230c = i11;
        this.f57231d = j11;
        this.f57232e = j12;
        this.f57234g = bVar;
        this.f57233f = z11;
    }

    public final int hashCode() {
        Object obj = this.f57228a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f57229b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f57230c) * 31;
        long j11 = this.f57231d;
        int i11 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f57232e;
        return this.f57234g.hashCode() + ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f57233f ? 1 : 0)) * 31);
    }
}
