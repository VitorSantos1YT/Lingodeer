package mw;

import com.google.common.base.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lw.b f42304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lw.z f42305c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f42303a.equals(a0Var.f42303a) && this.f42304b.equals(a0Var.f42304b) && Objects.a(null, null) && Objects.a(this.f42305c, a0Var.f42305c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42303a, this.f42304b, null, this.f42305c});
    }
}
