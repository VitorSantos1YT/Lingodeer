package mw;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.type.bACG.scNRoQgKSYX;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.c f42360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.c1 f42361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw.e1 f42362c;

    public b4(lw.e1 e1Var, lw.c1 c1Var, lw.c cVar) {
        Preconditions.k(e1Var, "method");
        this.f42362c = e1Var;
        Preconditions.k(c1Var, "headers");
        this.f42361b = c1Var;
        Preconditions.k(cVar, "callOptions");
        this.f42360a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            b4 b4Var = (b4) obj;
            if (Objects.a(this.f42360a, b4Var.f42360a) && Objects.a(this.f42361b, b4Var.f42361b) && Objects.a(this.f42362c, b4Var.f42362c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42360a, this.f42361b, this.f42362c});
    }

    public final String toString() {
        return "[method=" + this.f42362c + " headers=" + this.f42361b + " callOptions=" + this.f42360a + scNRoQgKSYX.arJfqUcxj;
    }
}
