package ac;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xb.e f535c;

    public e(Drawable drawable, boolean z11, xb.e eVar) {
        this.f533a = drawable;
        this.f534b = z11;
        this.f535c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f533a, eVar.f533a) && this.f534b == eVar.f534b && this.f535c == eVar.f535c;
    }

    public final int hashCode() {
        return this.f535c.hashCode() + defpackage.e.e(this.f533a.hashCode() * 31, 31, this.f534b);
    }
}
