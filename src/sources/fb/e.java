package fb;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f27062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27063b;

    public e(boolean z11, Uri uri) {
        this.f27062a = uri;
        this.f27063b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f27062a, eVar.f27062a) && this.f27063b == eVar.f27063b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27063b) + (this.f27062a.hashCode() * 31);
    }
}
