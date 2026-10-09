package xb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import m00.d0;
import o20.y;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f55983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.l f55984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a00.g f55985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f55986d;

    public d(o oVar, gc.l lVar, a00.g gVar, j jVar) {
        this.f55983a = oVar;
        this.f55984b = lVar;
        this.f55985c = gVar;
        this.f55986d = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    public static f a(d dVar) throws Exception {
        i iVar;
        boolean z11;
        int i11;
        int iMin;
        double dMax;
        Bitmap bitmapCreateBitmap;
        ColorSpace colorSpace;
        y5.h hVar;
        int iC;
        boolean z12;
        int i12;
        BitmapFactory.Options options = new BitmapFactory.Options();
        gc.l lVar = dVar.f55984b;
        o oVar = dVar.f55983a;
        y yVar = new y(oVar.b());
        d0 d0VarC = m00.b.c(yVar);
        int i13 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new m00.g(d0VarC.c(), 1), null, options);
        Exception exc = (Exception) yVar.f44621b;
        if (exc != null) {
            throw exc;
        }
        options.inJustDecodeBounds = false;
        Paint paint = k.f55993a;
        String str = options.outMimeType;
        j jVar = dVar.f55986d;
        Set set = m.f55995a;
        int i14 = l.f55994a[jVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar = new y5.h(new pe.a(new m00.g(d0VarC.c(), 1)));
                iC = hVar.c();
                if (iC != 2 || iC == 7 || iC == 4 || iC == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                switch (hVar.c()) {
                    case 3:
                    case 4:
                        i12 = AchievementLevelType.DAY_STREAK_LV_8;
                        break;
                    case 5:
                    case 8:
                        i12 = 270;
                        break;
                    case 6:
                    case 7:
                        i12 = 90;
                        break;
                    default:
                        i12 = 0;
                        break;
                }
                iVar = new i(z12, i12);
            } else {
                iVar = i.f55990c;
            }
        } else if (str == null || !m.f55995a.contains(str)) {
            iVar = i.f55990c;
        } else {
            hVar = new y5.h(new pe.a(new m00.g(d0VarC.c(), 1)));
            iC = hVar.c();
            if (iC != 2) {
                z12 = true;
            } else {
                z12 = true;
            }
            switch (hVar.c()) {
                case 3:
                case 4:
                    i12 = AchievementLevelType.DAY_STREAK_LV_8;
                    break;
                case 5:
                case 8:
                    i12 = 270;
                    break;
                case 6:
                case 7:
                    i12 = 90;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            iVar = new i(z12, i12);
        }
        int i15 = iVar.f55992b;
        boolean z13 = iVar.f55991a;
        Exception exc2 = (Exception) yVar.f44621b;
        if (exc2 != null) {
            throw exc2;
        }
        options.inMutable = false;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26 && (colorSpace = lVar.f29046c) != null) {
            options.inPreferredColorSpace = colorSpace;
        }
        boolean z14 = lVar.f29051h;
        Context context = lVar.f29044a;
        hc.g gVar = lVar.f29047d;
        options.inPremultiplied = z14;
        Bitmap.Config config = lVar.f29045b;
        if ((z13 || i15 > 0) && (config == null || z6.c.k(config))) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (lVar.f29050g && config == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.m.a(options.outMimeType, "image/jpeg")) {
            config = Bitmap.Config.RGB_565;
        }
        if (i16 >= 26) {
            Bitmap.Config config2 = options.outConfig;
            Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
            if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                config = config3;
            }
        }
        options.inPreferredConfig = config;
        com.bumptech.glide.e eVarA = oVar.a();
        if ((eVarA instanceof p) && kotlin.jvm.internal.m.a(gVar, hc.g.f32180c)) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((p) eVarA).f56002b;
            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
            i13 = 1;
            context = context;
            z11 = false;
        } else {
            int i17 = options.outWidth;
            if (i17 <= 0 || (i11 = options.outHeight) <= 0) {
                options.inSampleSize = i13;
                z11 = false;
                options.inScaled = false;
            } else {
                int i18 = (i15 == 90 || i15 == 270) ? i11 : i17;
                if (i15 != 90 && i15 != 270) {
                    i17 = i11;
                }
                hc.f fVar = lVar.f29048e;
                hc.g gVar2 = hc.g.f32180c;
                int iD = kotlin.jvm.internal.m.a(gVar, gVar2) ? i18 : kc.h.d(gVar.f32181a, fVar);
                int iD2 = kotlin.jvm.internal.m.a(gVar, gVar2) ? i17 : kc.h.d(gVar.f32182b, fVar);
                int iHighestOneBit = Integer.highestOneBit(i18 / iD);
                int iHighestOneBit2 = Integer.highestOneBit(i17 / iD2);
                int[] iArr = g.f55989a;
                int i19 = iArr[fVar.ordinal()];
                if (i19 == 1) {
                    iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                } else {
                    if (i19 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                }
                if (iMin < 1) {
                    iMin = 1;
                }
                options.inSampleSize = iMin;
                double d5 = i18;
                context = context;
                double d11 = iMin;
                double d12 = ((double) iD) / (d5 / d11);
                double d13 = ((double) iD2) / (((double) i17) / d11);
                int i21 = iArr[fVar.ordinal()];
                if (i21 == 1) {
                    dMax = Math.max(d12, d13);
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dMax = Math.min(d12, d13);
                }
                if (lVar.f29049f && dMax > 1.0d) {
                    dMax = 1.0d;
                }
                boolean z15 = dMax == 1.0d;
                options.inScaled = !z15;
                if (!z15) {
                    if (dMax > 1.0d) {
                        options.inDensity = hz.b.P(((double) Integer.MAX_VALUE) / dMax);
                        options.inTargetDensity = Integer.MAX_VALUE;
                    } else {
                        options.inDensity = Integer.MAX_VALUE;
                        options.inTargetDensity = hz.b.P(((double) Integer.MAX_VALUE) * dMax);
                    }
                }
                z11 = false;
                i13 = 1;
            }
        }
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new m00.g(d0VarC, i13), null, options);
            d0VarC.close();
            Exception exc3 = (Exception) yVar.f44621b;
            if (exc3 != null) {
                throw exc3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
            if (z13 || i15 > 0) {
                Matrix matrix = new Matrix();
                float width = bitmapDecodeStream.getWidth() / 2.0f;
                float height = bitmapDecodeStream.getHeight() / 2.0f;
                if (z13) {
                    matrix.postScale(-1.0f, 1.0f, width, height);
                }
                if (i15 > 0) {
                    matrix.postRotate(i15, width, height);
                }
                RectF rectF = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                matrix.mapRect(rectF);
                float f5 = rectF.left;
                if (f5 != CropImageView.DEFAULT_ASPECT_RATIO || rectF.top != CropImageView.DEFAULT_ASPECT_RATIO) {
                    matrix.postTranslate(-f5, -rectF.top);
                }
                if (i15 == 90 || i15 == 270) {
                    int height2 = bitmapDecodeStream.getHeight();
                    int width2 = bitmapDecodeStream.getWidth();
                    Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                } else {
                    int width3 = bitmapDecodeStream.getWidth();
                    int height3 = bitmapDecodeStream.getHeight();
                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                    if (config5 == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, k.f55993a);
                bitmapDecodeStream.recycle();
                bitmapDecodeStream = bitmapCreateBitmap;
            }
            return new f(new BitmapDrawable(context.getResources(), bitmapDecodeStream), (options.inSampleSize > 1 || options.inScaled) ? true : z11);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ns.o.m(d0VarC, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(xy.c cVar) throws Throwable {
        c cVar2;
        d dVar;
        Object obj;
        Object obj2;
        Throwable th2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f55982e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f55982e = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj3 = cVar2.f55980c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar2.f55982e;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj3);
                cVar2.f55978a = this;
                a00.g gVar = this.f55985c;
                cVar2.f55979b = gVar;
                cVar2.f55982e = 1;
                if (((a00.j) gVar).c(cVar2) != aVar) {
                    dVar = this;
                    obj = gVar;
                }
                return aVar;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = (a00.g) cVar2.f55978a;
                try {
                    com.bumptech.glide.e.F(obj3);
                    obj2 = obj2;
                    f fVar = (f) obj3;
                    ((a00.j) obj2).e();
                    return fVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((a00.j) obj2).e();
                    throw th2;
                }
            }
            Object obj4 = cVar2.f55979b;
            dVar = (d) cVar2.f55978a;
            com.bumptech.glide.e.F(obj3);
            obj = obj4;
            xa.a aVar2 = new xa.a(dVar, 1);
            cVar2.f55978a = obj;
            cVar2.f55979b = null;
            cVar2.f55982e = 2;
            Object objM = e0.M(vy.j.f54321a, new nu.b(aVar2, null, 9), cVar2);
            if (objM != aVar) {
                obj2 = obj;
                obj3 = objM;
                f fVar2 = (f) obj3;
                ((a00.j) obj2).e();
                return fVar2;
            }
            return aVar;
        } catch (Throwable th4) {
            obj2 = obj;
            th2 = th4;
            ((a00.j) obj2).e();
            throw th2;
        }
    }
}
