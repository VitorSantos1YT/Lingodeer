package m7;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41034c;

    public q(String str, boolean z11, boolean z12) {
        this.f41032a = str;
        this.f41033b = z11;
        this.f41034c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == q.class) {
            q qVar = (q) obj;
            if (TextUtils.equals(this.f41032a, qVar.f41032a) && this.f41033b == qVar.f41033b && this.f41034c == qVar.f41034c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((defpackage.e.d(31, 31, this.f41032a) + (this.f41033b ? 1231 : 1237)) * 31) + (this.f41034c ? 1231 : 1237);
    }
}
