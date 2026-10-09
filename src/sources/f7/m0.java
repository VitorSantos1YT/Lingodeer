package f7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.b0 f26842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f26850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26851j;

    public m0(p7.b0 b0Var, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        b7.a.d(!z15 || z13);
        b7.a.d(!z14 || z13);
        if (z12 && (z13 || z14 || z15)) {
            z16 = false;
        }
        b7.a.d(z16);
        this.f26842a = b0Var;
        this.f26843b = j11;
        this.f26844c = j12;
        this.f26845d = j13;
        this.f26846e = j14;
        this.f26847f = z11;
        this.f26848g = z12;
        this.f26849h = z13;
        this.f26850i = z14;
        this.f26851j = z15;
    }

    public final m0 a(long j11) {
        if (j11 == this.f26844c) {
            return this;
        }
        return new m0(this.f26842a, this.f26843b, j11, this.f26845d, this.f26846e, this.f26847f, this.f26848g, this.f26849h, this.f26850i, this.f26851j);
    }

    public final m0 b(long j11) {
        if (j11 == this.f26843b) {
            return this;
        }
        return new m0(this.f26842a, j11, this.f26844c, this.f26845d, this.f26846e, this.f26847f, this.f26848g, this.f26849h, this.f26850i, this.f26851j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f26843b == m0Var.f26843b && this.f26844c == m0Var.f26844c && this.f26845d == m0Var.f26845d && this.f26846e == m0Var.f26846e && this.f26847f == m0Var.f26847f && this.f26848g == m0Var.f26848g && this.f26849h == m0Var.f26849h && this.f26850i == m0Var.f26850i && this.f26851j == m0Var.f26851j && Objects.equals(this.f26842a, m0Var.f26842a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f26842a.hashCode() + 527) * 31) + ((int) this.f26843b)) * 31) + ((int) this.f26844c)) * 31) + ((int) this.f26845d)) * 31) + ((int) this.f26846e)) * 31) + (this.f26847f ? 1 : 0)) * 31) + (this.f26848g ? 1 : 0)) * 31) + (this.f26849h ? 1 : 0)) * 31) + (this.f26850i ? 1 : 0)) * 31) + (this.f26851j ? 1 : 0);
    }
}
