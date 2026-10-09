package ee;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import gb.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import td.j;
import td.l;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25485b;

    public /* synthetic */ b(c cVar, int i11) {
        this.f25484a = i11;
        this.f25485b = cVar;
    }

    @Override // td.l
    public final b0 a(Object obj, int i11, int i12, j jVar) {
        switch (this.f25484a) {
            case 0:
                return c.a(ImageDecoder.createSource((ByteBuffer) obj), i11, i12, jVar);
            default:
                return c.a(ImageDecoder.createSource(pe.b.b((InputStream) obj)), i11, i12, jVar);
        }
    }

    @Override // td.l
    public final boolean b(Object obj, j jVar) throws IOException {
        switch (this.f25484a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeX = r.x(this.f25485b.f25486a, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeX == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeX == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                c cVar = this.f25485b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeW = r.w(cVar.f25486a, (InputStream) obj, cVar.f25487b);
                return imageHeaderParser$ImageTypeW == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeW == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }
}
