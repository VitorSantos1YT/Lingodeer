package iw;

import android.graphics.Bitmap;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f34890a;

    public g(Bitmap bitmap) {
        this.f34890a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && m.a(this.f34890a, ((g) obj).f34890a);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f34890a;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "Success(bitmap=" + this.f34890a + ')';
    }
}
