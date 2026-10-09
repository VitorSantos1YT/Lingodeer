package l8;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f39805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j[] f39807g;

    public c(String str, int i11, int i12, long j11, long j12, j[] jVarArr) {
        super("CHAP");
        this.f39802b = str;
        this.f39803c = i11;
        this.f39804d = i12;
        this.f39805e = j11;
        this.f39806f = j12;
        this.f39807g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f39803c == cVar.f39803c && this.f39804d == cVar.f39804d && this.f39805e == cVar.f39805e && this.f39806f == cVar.f39806f && Objects.equals(this.f39802b, cVar.f39802b) && Arrays.equals(this.f39807g, cVar.f39807g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (((((((527 + this.f39803c) * 31) + this.f39804d) * 31) + ((int) this.f39805e)) * 31) + ((int) this.f39806f)) * 31;
        String str = this.f39802b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
