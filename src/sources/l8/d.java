package l8;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f39811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j[] f39812f;

    public d(String str, boolean z11, boolean z12, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f39808b = str;
        this.f39809c = z11;
        this.f39810d = z12;
        this.f39811e = strArr;
        this.f39812f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f39809c == dVar.f39809c && this.f39810d == dVar.f39810d && Objects.equals(this.f39808b, dVar.f39808b) && Arrays.equals(this.f39811e, dVar.f39811e) && Arrays.equals(this.f39812f, dVar.f39812f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (((527 + (this.f39809c ? 1 : 0)) * 31) + (this.f39810d ? 1 : 0)) * 31;
        String str = this.f39808b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
