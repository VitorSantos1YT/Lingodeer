package ce;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6890b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(td.g.f52121a);

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f6890b);
    }

    @Override // ce.d
    public final Bitmap c(wd.a aVar, Bitmap bitmap, int i11, int i12) {
        return c0.b(aVar, bitmap, i11, i12);
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // td.g
    public final int hashCode() {
        return 1572326941;
    }
}
