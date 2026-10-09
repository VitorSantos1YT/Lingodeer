package gd;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.c0;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.HashMap;
import ob.u;
import wc.v;
import wc.x;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {
    public final m D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final x H;
    public zc.p I;
    public zc.p J;
    public final zc.f K;
    public kd.j L;
    public c0 M;

    public f(v vVar, i iVar) {
        super(vVar, iVar);
        this.D = new m(3, 2);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = iVar.f29105g;
        wc.h hVar = vVar.f55010a;
        this.H = hVar == null ? null : (x) ((HashMap) hVar.c()).get(str);
        a9.i iVar2 = this.f29087p.f29121x;
        if (iVar2 != null) {
            this.K = new zc.f(this, this, iVar2);
        }
    }

    @Override // gd.c, yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Bitmap bitmapS;
        super.e(rectF, matrix, z11);
        x xVar = this.H;
        if (xVar != null) {
            int i11 = xVar.f55038b;
            int i12 = xVar.f55037a;
            float fC = kd.k.c();
            if (this.f29086o.P || (bitmapS = s()) == null) {
                rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i12 * fC, i11 * fC);
            } else {
                rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.f29085n.mapRect(rectF);
        }
    }

    @Override // gd.c, dd.g
    public final void f(Object obj, u uVar) {
        super.f(obj, uVar);
        if (obj == z.F) {
            if (uVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new zc.p(null, uVar);
                return;
            }
        }
        if (obj == z.I) {
            if (uVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new zc.p(null, uVar);
                return;
            }
        }
        zc.f fVar = this.K;
        if (obj == 5 && fVar != null) {
            fVar.f59104c.k(uVar);
            return;
        }
        if (obj == z.B && fVar != null) {
            fVar.c(uVar);
            return;
        }
        if (obj == z.C && fVar != null) {
            fVar.f59106e.k(uVar);
            return;
        }
        if (obj == z.D && fVar != null) {
            fVar.f59107f.k(uVar);
        } else {
            if (obj != z.E || fVar == null) {
                return;
            }
            fVar.f59108g.k(uVar);
        }
    }

    @Override // gd.c
    public final void k(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        x xVar;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (xVar = this.H) == null) {
            return;
        }
        float fC = kd.k.c();
        m mVar = this.D;
        mVar.setAlpha(i11);
        zc.p pVar = this.I;
        if (pVar != null) {
            mVar.setColorFilter((ColorFilter) pVar.f());
        }
        zc.f fVar = this.K;
        if (fVar != null) {
            bVar = fVar.a(matrix, i11);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z11 = this.f29086o.P;
        Rect rect2 = this.F;
        if (z11) {
            rect2.set(0, 0, (int) (xVar.f55037a * fC), (int) (xVar.f55038b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z12 = bVar != null;
        if (z12) {
            if (this.L == null) {
                this.L = new kd.j();
            }
            if (this.M == null) {
                this.M = new c0(7, (byte) 0);
            }
            c0 c0Var = this.M;
            c0Var.f7470b = 255;
            c0Var.f7471c = null;
            bVar.getClass();
            kd.b bVar2 = new kd.b(bVar);
            c0Var.f7471c = bVar2;
            bVar2.b(i11);
            float f5 = rect2.left;
            float f11 = rect2.top;
            float f12 = rect2.right;
            float f13 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f5, f11, f12, f13);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, mVar);
        if (z12) {
            this.L.c();
            if (this.L.f38101c == kd.i.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    public final Bitmap s() {
        Bitmap bitmapD;
        Bitmap bitmap;
        zc.p pVar = this.J;
        if (pVar != null && (bitmap = (Bitmap) pVar.f()) != null) {
            return bitmap;
        }
        String str = this.f29087p.f29105g;
        v vVar = this.f29086o;
        cd.a aVar = vVar.H;
        if (aVar != null) {
            Context contextI = vVar.i();
            Context context = aVar.f6827a;
            if (contextI != null) {
                if (context instanceof Application) {
                    contextI = contextI.getApplicationContext();
                }
                if (contextI != context) {
                    vVar.H = null;
                }
            } else if (context != null) {
                vVar.H = null;
            }
        }
        if (vVar.H == null) {
            vVar.H = new cd.a(vVar.getCallback(), vVar.K, vVar.f55010a.c());
        }
        cd.a aVar2 = vVar.H;
        if (aVar2 != null) {
            String str2 = aVar2.f6828b;
            x xVar = (x) aVar2.f6829c.get(str);
            if (xVar == null) {
                bitmapD = null;
            } else {
                int i11 = xVar.f55038b;
                int i12 = xVar.f55037a;
                bitmapD = xVar.f55042f;
                if (bitmapD == null) {
                    Context context2 = aVar2.f6827a;
                    if (context2 == null) {
                        bitmapD = null;
                    } else {
                        String str3 = xVar.f55040d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        kd.d.b("Decoded image `" + str + "` is null.");
                                        bitmapD = null;
                                    } else {
                                        bitmapD = kd.k.d(bitmapDecodeStream, i12, i11);
                                        synchronized (cd.a.f6826d) {
                                            ((x) aVar2.f6829c.get(str)).f55042f = bitmapD;
                                        }
                                    }
                                } catch (IllegalArgumentException e8) {
                                    kd.d.c("Unable to decode image `" + str + "`.", e8);
                                }
                            } catch (IOException e10) {
                                kd.d.c("Unable to open asset.", e10);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                    if (bitmapDecodeByteArray == null) {
                                        kd.d.b("Decoded image `" + str + "` is null.");
                                        bitmapD = null;
                                    } else {
                                        bitmapD = kd.k.d(bitmapDecodeByteArray, i12, i11);
                                        synchronized (cd.a.f6826d) {
                                            ((x) aVar2.f6829c.get(str)).f55042f = bitmapD;
                                        }
                                    }
                                } catch (IllegalArgumentException e11) {
                                    kd.d.c("Unable to decode image `" + str + "`.", e11);
                                }
                            } catch (IllegalArgumentException e12) {
                                kd.d.c("data URL did not have correct base64 format.", e12);
                            }
                        }
                    }
                }
            }
        } else {
            bitmapD = null;
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        x xVar2 = this.H;
        if (xVar2 != null) {
            return xVar2.f55042f;
        }
        return null;
    }
}
