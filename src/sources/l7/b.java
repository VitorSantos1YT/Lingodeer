package l7;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import b7.f0;
import e7.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f39775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f39776o;

    public b(Context context) {
        super(new e7.d[1], new a[1]);
        this.f39775n = context;
        this.f39776o = -1;
    }

    @Override // e7.g
    public final e7.d f() {
        return new e7.d(1);
    }

    @Override // e7.g
    public final e7.e g() {
        return new a(this);
    }

    @Override // e7.g
    public final DecoderException h(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    @Override // e7.g
    public final DecoderException i(e7.d dVar, e7.e eVar, boolean z11) {
        a aVar = (a) eVar;
        ByteBuffer byteBuffer = dVar.f25115e;
        byteBuffer.getClass();
        b7.a.j(byteBuffer.hasArray());
        b7.a.d(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f39776o;
            if (iMax == -1) {
                Context context = this.f39775n;
                if (context != null) {
                    Point pointR = f0.r(context);
                    int i11 = pointR.x;
                    int i12 = pointR.y;
                    p pVar = dVar.f25113c;
                    if (pVar != null) {
                        int i13 = pVar.M;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = pVar.N;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    iMax = (Math.max(i11, i12) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            aVar.f39773e = com.bumptech.glide.d.l(byteBuffer.array(), byteBuffer.remaining(), iMax);
            aVar.f25118c = dVar.f25117t;
            return null;
        } catch (ParserException e8) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e8);
        } catch (IOException e10) {
            return new ImageDecoderException(e10);
        }
    }
}
