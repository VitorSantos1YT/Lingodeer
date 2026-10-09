package ce;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements td.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6853b;

    public f(int i11) {
        this.f6852a = i11;
        switch (i11) {
            case 1:
                this.f6853b = new f(2);
                break;
            case 2:
                this.f6853b = new re.v(11);
                break;
            default:
                this.f6853b = new f(2);
                break;
        }
    }

    @Override // td.l
    public final vd.b0 a(Object obj, int i11, int i12, td.j jVar) {
        switch (this.f6852a) {
            case 0:
                return ((f) this.f6853b).c(ImageDecoder.createSource((ByteBuffer) obj), i11, i12, jVar);
            case 1:
                return ((f) this.f6853b).c(ImageDecoder.createSource(pe.b.b((InputStream) obj)), i11, i12, jVar);
            default:
                return c(c3.a.k(obj), i11, i12, jVar);
        }
    }

    @Override // td.l
    public final /* bridge */ /* synthetic */ boolean b(Object obj, td.j jVar) {
        switch (this.f6852a) {
            case 0:
                break;
            case 1:
                break;
            default:
                c3.a.k(obj);
                break;
        }
        return true;
    }

    public c c(ImageDecoder.Source source, int i11, int i12, td.j jVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new be.b(i11, i12, jVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new c(bitmapDecodeBitmap, (re.v) this.f6853b);
    }
}
