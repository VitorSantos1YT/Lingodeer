package g2;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final Bitmap a(h hVar) {
        if (hVar instanceof h) {
            return hVar.f28568a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap b(int i11, int i12, int i13, h2.c cVar) {
        ColorSpace rgb;
        ColorSpace colorSpaceA;
        ColorSpace colorSpace;
        Bitmap.Config configC = c(i13);
        if (kotlin.jvm.internal.m.a(cVar, h2.e.f31464e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31475q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31476r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31473o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31469j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31468i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31478t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31477s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31470k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31471l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31466g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31467h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.f31465f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (kotlin.jvm.internal.m.a(cVar, h2.e.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!kotlin.jvm.internal.m.a(cVar, h2.e.f31474p)) {
                if (kotlin.jvm.internal.m.a(cVar, h2.e.f31472n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = a0.a(cVar)) != null) {
                    rgb = colorSpaceA;
                    configC = configC;
                } else if (cVar instanceof h2.r) {
                    String str = cVar.f31456a;
                    h2.r rVar = (h2.r) cVar;
                    float[] fArrA = rVar.f31511d.a();
                    h2.s sVar = rVar.f31514g;
                    ColorSpace.Rgb.TransferParameters transferParameters = sVar != null ? new ColorSpace.Rgb.TransferParameters(sVar.f31525b, sVar.f31526c, sVar.f31527d, sVar.f31528e, sVar.f31529f, sVar.f31530g, sVar.f31524a) : null;
                    if (transferParameters != null) {
                        rgb = new ColorSpace.Rgb(str, rVar.f31515h, fArrA, transferParameters);
                    } else {
                        float[] fArr = rVar.f31515h;
                        final h2.q qVar = rVar.f31519l;
                        final int i14 = 0;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: g2.z
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d5) {
                                switch (i14) {
                                    case 0:
                                        break;
                                }
                                return ((Number) qVar.invoke(Double.valueOf(d5))).doubleValue();
                            }
                        };
                        final h2.q qVar2 = rVar.f31521o;
                        final int i15 = 1;
                        rgb = new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: g2.z
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d5) {
                                switch (i15) {
                                    case 0:
                                        break;
                                }
                                return ((Number) qVar2.invoke(Double.valueOf(d5))).doubleValue();
                            }
                        }, rVar.f31512e, rVar.f31513f);
                    }
                } else {
                    configC = configC;
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i11, i12, configC, true, rgb);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb = colorSpace;
        configC = configC;
        return Bitmap.createBitmap((DisplayMetrics) null, i11, i12, configC, true, rgb);
    }

    public static final Bitmap.Config c(int i11) {
        if (i11 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i11 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i11 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26 || i11 != 3) {
            return (i12 < 26 || i11 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    public static final int d(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i11 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
