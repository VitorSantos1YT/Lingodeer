package za;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.b f59076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f59077b;

    public k(ya.b bVar, float f5) {
        this.f59076a = bVar;
        this.f59077b = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.f59076a, kVar.f59076a) && this.f59077b == kVar.f59077b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f59077b) + (this.f59076a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f59076a);
        sb2.append(", density=");
        return defpackage.e.o(sb2, this.f59077b, ')');
    }

    public k(Rect rect, float f5) {
        this.f59076a = new ya.b(rect);
        this.f59077b = f5;
    }
}
