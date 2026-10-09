package ce;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6856b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(td.g.f52121a);

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f6856b);
    }

    @Override // ce.d
    public final Bitmap c(wd.a aVar, Bitmap bitmap, int i11, int i12) {
        Paint paint = c0.f6845a;
        return (bitmap.getWidth() > i11 || bitmap.getHeight() > i12) ? c0.b(aVar, bitmap, i11, i12) : bitmap;
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // td.g
    public final int hashCode() {
        return -670243078;
    }
}
