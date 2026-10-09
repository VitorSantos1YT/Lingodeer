package xb;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f55987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f55988b;

    public f(BitmapDrawable bitmapDrawable, boolean z11) {
        this.f55987a = bitmapDrawable;
        this.f55988b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f55987a.equals(fVar.f55987a) && this.f55988b == fVar.f55988b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f55988b) + (this.f55987a.hashCode() * 31);
    }
}
