package j2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import g2.f0;
import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f35567b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f35568c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f35569d = new d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35570a;

    public /* synthetic */ d(int i11) {
        this.f35570a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // j2.j
    public Object a(c cVar, vy.d dVar) {
        k kVar;
        ImageReader imageReader;
        switch (this.f35570a) {
            case 1:
                long j11 = cVar.f35563u;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j11 >> 32), (int) (j11 & 4294967295L), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Canvas canvas2 = g2.d.f28542a;
                g2.c cVar2 = new g2.c();
                cVar2.f28539a = canvas;
                cVar.c(cVar2, null);
                return bitmapCreateBitmap;
            default:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i11 = kVar.f35645d;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        kVar.f35645d = i11 - Integer.MIN_VALUE;
                    } else {
                        kVar = new k(this, (xy.c) dVar);
                    }
                } else {
                    kVar = new k(this, (xy.c) dVar);
                }
                Object objR = kVar.f35643b;
                Object objG = wy.a.COROUTINE_SUSPENDED;
                int i12 = kVar.f35645d;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(objR);
                    long j12 = cVar.f35563u;
                    Looper looperMyLooper = Looper.myLooper();
                    if (looperMyLooper == null) {
                        looperMyLooper = Looper.getMainLooper();
                    }
                    ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (j12 >> 32), (int) (4294967295L & j12), 1, 1);
                    try {
                        kVar.f35642a = imageReaderNewInstance;
                        kVar.f35645d = 1;
                        rz.m mVar = new rz.m(1, ue.f.x(kVar));
                        mVar.s();
                        imageReaderNewInstance.setOnImageAvailableListener(new l(mVar), md.a.h(looperMyLooper));
                        Surface surface = imageReaderNewInstance.getSurface();
                        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            canvasLockHardwareCanvas.drawColor(f0.E(x.f28615b), PorterDuff.Mode.CLEAR);
                            Canvas canvas3 = g2.d.f28542a;
                            g2.c cVar3 = new g2.c();
                            cVar3.f28539a = canvasLockHardwareCanvas;
                            cVar.c(cVar3, null);
                            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            objR = mVar.r();
                            if (objR != objG) {
                                imageReader = imageReaderNewInstance;
                            }
                            return objG;
                        } catch (Throwable th2) {
                            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        imageReader = imageReaderNewInstance;
                        throw th;
                    }
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                imageReader = kVar.f35642a;
                try {
                    com.bumptech.glide.e.F(objR);
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        hz.b.h(imageReader, th);
                        throw th5;
                    }
                }
                objG = ve.i.g((Image) objR);
                hz.b.h(imageReader, null);
                return objG;
        }
    }
}
