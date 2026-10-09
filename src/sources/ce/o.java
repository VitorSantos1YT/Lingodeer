package ce;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.yalantis.ucrop.view.CropImageView;
import dl.ExOZ.xItStCyvVEZ;
import fr.p3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final td.i f6876f = td.i.a(td.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final td.i f6877g = new td.i("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, td.i.f52122e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final td.i f6878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final td.i f6879i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p3 f6880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f6881k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd.a f6882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f6883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.n f6884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f6886e = x.a();

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, wd.a aVar, m0.n nVar) {
        this.f6885d = arrayList;
        pe.f.c(displayMetrics, "Argument must not be null");
        this.f6883b = displayMetrics;
        pe.f.c(aVar, "Argument must not be null");
        this.f6882a = aVar;
        pe.f.c(nVar, "Argument must not be null");
        this.f6884c = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(ce.y r8, android.graphics.BitmapFactory.Options r9, ce.n r10, wd.a r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto La
            r10.g()
            r8.z()
        La:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = ce.c0.f6846b
            r3.lock()
            android.graphics.Bitmap r8 = r8.t(r9)     // Catch: java.lang.IllegalArgumentException -> L1d java.lang.Throwable -> L58
            r3.unlock()
            return r8
        L1d:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = w4.c.k(r5, r0, r6, r1, r7)     // Catch: java.lang.Throwable -> L58
            r0.append(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L58
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L58
            r0.append(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L58
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L58
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L57
            r11.d(r0)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            r0 = 0
            r9.inBitmap = r0     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L58
            java.util.concurrent.locks.Lock r9 = ce.c0.f6846b
            r9.unlock()
            return r8
        L56:
            throw r4     // Catch: java.lang.Throwable -> L58
        L57:
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = ce.c0.f6846b
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.o.c(ce.y, android.graphics.BitmapFactory$Options, ce.n, wd.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(y yVar, int i11, int i12, td.j jVar, n nVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f6884c.d(65536, byte[].class);
        synchronized (o.class) {
            arrayDeque = f6881k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        td.b bVar = (td.b) jVar.c(f6876f);
        td.k kVar = (td.k) jVar.c(f6877g);
        l lVar = (l) jVar.c(l.f6873g);
        boolean zBooleanValue = ((Boolean) jVar.c(f6878h)).booleanValue();
        td.i iVar = f6879i;
        try {
            c cVarE = c.e(b(yVar, options, lVar, bVar, kVar, jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue(), i11, i12, zBooleanValue, nVar), this.f6882a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return cVarE;
        } finally {
            e(options);
            ArrayDeque arrayDeque2 = f6881k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f6884c.i(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0215  */
    public final Bitmap b(y yVar, BitmapFactory.Options options, l lVar, td.b bVar, td.k kVar, boolean z11, int i11, int i12, boolean z12, n nVar) {
        char c11;
        boolean z13;
        float f5;
        boolean z14;
        boolean zHasAlpha;
        boolean z15;
        int i13;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        int i14;
        int i15;
        int iFloor;
        int iFloor2;
        int i16 = pe.h.f46822a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        wd.a aVar = this.f6882a;
        c(yVar, options, nVar, aVar);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i17 = iArr[0];
        int i18 = iArr[1];
        boolean z16 = (i17 == -1 || i18 == -1) ? false : z11;
        int i19 = yVar.i();
        switch (i19) {
            case 3:
            case 4:
                c11 = 180;
                break;
            case 5:
            case 6:
                c11 = 'Z';
                break;
            case 7:
            case 8:
                c11 = 270;
                break;
            default:
                c11 = 0;
                break;
        }
        switch (i19) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z13 = true;
                break;
            default:
                z13 = false;
                break;
        }
        int i21 = i11;
        if (i21 == Integer.MIN_VALUE) {
            i21 = (c11 == 'Z' || c11 == 270) ? i18 : i17;
        }
        if (i12 == -2147483648) {
            i12 = (c11 == 'Z' || c11 == 270) ? i17 : i18;
        }
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = yVar.C();
        String str = "Downsampler";
        if (i17 <= 0 || i18 <= 0) {
            f5 = 1.0f;
            if (Log.isLoggable(str, 3)) {
                Objects.toString(imageHeaderParser$ImageTypeC);
            }
        } else {
            f5 = 1.0f;
            if (c11 == 'Z' || c11 == 270) {
                i14 = i18;
                i15 = i17;
            } else {
                i15 = i18;
                i14 = i17;
            }
            float fB = lVar.b(i14, i15, i21, i12);
            if (fB <= CropImageView.DEFAULT_ASPECT_RATIO) {
                StringBuilder sb2 = new StringBuilder("Cannot scale with factor: ");
                sb2.append(fB);
                sb2.append(" from: ");
                sb2.append(lVar);
                sb2.append(", source: [");
                ep.a.v(i17, i18, "x", "], target: [", sb2);
                sb2.append(i21);
                sb2.append("x");
                sb2.append(i12);
                sb2.append("]");
                throw new IllegalArgumentException(sb2.toString());
            }
            z16 = z16;
            m mVarA = lVar.a(i14, i15, i21, i12);
            if (mVarA == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f11 = i14;
            int i22 = i14;
            float f12 = i15;
            int i23 = i22 / ((int) (((double) (fB * f11)) + 0.5d));
            int i24 = i15 / ((int) (((double) (fB * f12)) + 0.5d));
            m mVar = m.MEMORY;
            int iMax = Math.max(1, Integer.highestOneBit(mVarA == mVar ? Math.max(i23, i24) : Math.min(i23, i24)));
            if (mVarA == mVar && iMax < 1.0f / fB) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.JPEG) {
                float fMin = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f11 / fMin);
                iFloor2 = (int) Math.ceil(f12 / fMin);
                int i25 = iMax / 8;
                if (i25 > 0) {
                    iFloor /= i25;
                    iFloor2 /= i25;
                }
            } else if (imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeC == ImageHeaderParser$ImageType.PNG_A) {
                float f13 = iMax;
                iFloor = (int) Math.floor(f11 / f13);
                iFloor2 = (int) Math.floor(f12 / f13);
            } else if (imageHeaderParser$ImageTypeC.isWebp()) {
                float f14 = iMax;
                iFloor = Math.round(f11 / f14);
                iFloor2 = Math.round(f12 / f14);
            } else if (i22 % iMax == 0 && i15 % iMax == 0) {
                iFloor = i22 / iMax;
                iFloor2 = i15 / iMax;
            } else {
                options.inJustDecodeBounds = true;
                c(yVar, options, nVar, aVar);
                options.inJustDecodeBounds = false;
                int[] iArr2 = {options.outWidth, options.outHeight};
                iFloor = iArr2[0];
                iFloor2 = iArr2[1];
            }
            double dB = lVar.b(iFloor, iFloor2, i21, i12);
            int iRound = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            int i26 = (int) ((((double) iRound) * dB) + 0.5d);
            options.inTargetDensity = (int) (((dB / ((double) (i26 / iRound))) * ((double) i26)) + 0.5d);
            int iRound2 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
            options.inDensity = iRound2;
            int i27 = options.inTargetDensity;
            if (i27 <= 0 || iRound2 <= 0 || i27 == iRound2) {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            } else {
                options.inScaled = true;
            }
            str = "Downsampler";
        }
        boolean zC = this.f6886e.c(i21, i12, z16, z13);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z14 = false;
            options.inMutable = false;
        } else {
            z14 = false;
        }
        if (zC) {
            z15 = true;
        } else if (bVar != td.b.PREFER_ARGB_8888) {
            try {
                zHasAlpha = yVar.C().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable(str, 3)) {
                    Objects.toString(bVar);
                }
                zHasAlpha = z14;
            }
            Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config2;
            if (config2 == Bitmap.Config.RGB_565) {
                z15 = true;
                options.inDither = true;
            } else {
                z15 = true;
            }
        } else {
            z15 = true;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
        int i28 = Build.VERSION.SDK_INT;
        if (i17 < 0 || i18 < 0 || !z12) {
            int i29 = options.inTargetDensity;
            float f15 = (i29 <= 0 || (i13 = options.inDensity) <= 0 || i29 == i13) ? z14 : z15 ? i29 / options.inDensity : f5;
            float f16 = options.inSampleSize;
            int iCeil = (int) Math.ceil(i17 / f16);
            int iCeil2 = (int) Math.ceil(i18 / f16);
            int iRound3 = Math.round(iCeil * f15);
            i12 = Math.round(iCeil2 * f15);
            i21 = iRound3;
        }
        Bitmap bitmap2 = null;
        if (i21 > 0 && i12 > 0) {
            if (i28 < 26) {
                config = null;
            } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                config = options.outConfig;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = aVar.a(i21, i12, config);
        }
        if (kVar != null) {
            if (i28 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((kVar != td.k.DISPLAY_P3 || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) ? z14 : z15 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i28 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapC = c(yVar, options, nVar, aVar);
        nVar.n(bitmapC, aVar);
        if (Log.isLoggable(str, 2)) {
            d(bitmapC);
            d(options.inBitmap);
            Thread.currentThread().getName();
            SystemClock.elapsedRealtimeNanos();
        }
        if (bitmapC != null) {
            bitmapC.setDensity(this.f6883b.densityDpi);
            switch (i19) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    Matrix matrix = new Matrix();
                    switch (i19) {
                        case 2:
                            matrix.setScale(-1.0f, f5);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, f5);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, f5);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, f5);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                    bitmap = bitmapC;
                    bitmap2 = bitmapCreateBitmap;
                    break;
                default:
                    bitmap = bitmapC;
                    bitmap2 = bitmap;
                    break;
            }
            if (!bitmap.equals(bitmap2)) {
                aVar.d(bitmap);
            }
        }
        return bitmap2;
    }

    static {
        l lVar = l.f6868b;
        Boolean bool = Boolean.FALSE;
        f6878h = td.i.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f6879i = td.i.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", xItStCyvVEZ.tOWLSQwosujweq)));
        f6880j = new p3(4);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = pe.m.f46830a;
        f6881k = new ArrayDeque(0);
    }
}
