package g7;

import java.util.Objects;
import p7.b0;
import y6.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f28785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f28787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f28788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f28789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f28791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f28792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f28793j;

    public a(long j11, o0 o0Var, int i11, b0 b0Var, long j12, o0 o0Var2, int i12, b0 b0Var2, long j13, long j14) {
        this.f28784a = j11;
        this.f28785b = o0Var;
        this.f28786c = i11;
        this.f28787d = b0Var;
        this.f28788e = j12;
        this.f28789f = o0Var2;
        this.f28790g = i12;
        this.f28791h = b0Var2;
        this.f28792i = j13;
        this.f28793j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f28784a == aVar.f28784a && this.f28786c == aVar.f28786c && this.f28788e == aVar.f28788e && this.f28790g == aVar.f28790g && this.f28792i == aVar.f28792i && this.f28793j == aVar.f28793j && Objects.equals(this.f28785b, aVar.f28785b) && Objects.equals(this.f28787d, aVar.f28787d) && Objects.equals(this.f28789f, aVar.f28789f) && Objects.equals(this.f28791h, aVar.f28791h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f28784a), this.f28785b, Integer.valueOf(this.f28786c), this.f28787d, Long.valueOf(this.f28788e), this.f28789f, Integer.valueOf(this.f28790g), this.f28791h, Long.valueOf(this.f28792i), Long.valueOf(this.f28793j));
    }
}
