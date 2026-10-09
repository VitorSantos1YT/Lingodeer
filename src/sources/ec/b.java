package ec;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f25457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25458b;

    public b(Bitmap bitmap, Map map) {
        this.f25457a = bitmap;
        this.f25458b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f25457a, bVar.f25457a) && m.a(this.f25458b, bVar.f25458b);
    }

    public final int hashCode() {
        return this.f25458b.hashCode() + (this.f25457a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f25457a + ", extras=" + this.f25458b + ')';
    }
}
