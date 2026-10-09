package g2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static t0 f28555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f28556b = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f28557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f28558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f28559e;

    public static final long A(f2.c cVar) {
        float f5 = cVar.f26574c - cVar.f26572a;
        return (((long) Float.floatToRawIntBits(cVar.f26575d - cVar.f26573b)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final Rect B(v3.k kVar) {
        return new Rect(kVar.f53494a, kVar.f53495b, kVar.f53496c, kVar.f53497d);
    }

    public static final RectF C(f2.c cVar) {
        return new RectF(cVar.f26572a, cVar.f26573b, cVar.f26574c, cVar.f26575d);
    }

    public static final Shader.TileMode D(int i11) {
        if (i11 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i11 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i11 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i11 == 3) {
            return Build.VERSION.SDK_INT >= 31 ? s0.b() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int E(long j11) {
        float[] fArr = h2.e.f31460a;
        return (int) (x.b(j11, h2.e.f31464e) >>> 32);
    }

    public static final f2.c F(Rect rect) {
        return new f2.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final f2.c G(RectF rectF) {
        return new f2.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static String H(int i11) {
        if (i11 == 0) {
            return "Clear";
        }
        if (i11 == 1) {
            return "Src";
        }
        if (i11 == 2) {
            return "Dst";
        }
        if (i11 == 3) {
            return "SrcOver";
        }
        if (i11 == 4) {
            return "DstOver";
        }
        if (i11 == 5) {
            return "SrcIn";
        }
        if (i11 == 6) {
            return "DstIn";
        }
        if (i11 == 7) {
            return "SrcOut";
        }
        if (i11 == 8) {
            return "DstOut";
        }
        if (i11 == 9) {
            return "SrcAtop";
        }
        if (i11 == 10) {
            return "DstAtop";
        }
        if (i11 == 11) {
            return "Xor";
        }
        if (i11 == 12) {
            return "Plus";
        }
        if (i11 == 13) {
            return "Modulate";
        }
        if (i11 == 14) {
            return "Screen";
        }
        if (i11 == 15) {
            return "Overlay";
        }
        if (i11 == 16) {
            return "Darken";
        }
        if (i11 == 17) {
            return "Lighten";
        }
        if (i11 == 18) {
            return "ColorDodge";
        }
        if (i11 == 19) {
            return "ColorBurn";
        }
        if (i11 == 20) {
            return "HardLight";
        }
        if (i11 == 21) {
            return "Softlight";
        }
        if (i11 == 22) {
            return "Difference";
        }
        if (i11 == 23) {
            return "Exclusion";
        }
        if (i11 == 24) {
            return "Multiply";
        }
        if (i11 == 25) {
            return "Hue";
        }
        if (i11 == 26) {
            return "Saturation";
        }
        if (i11 == 27) {
            return "Color";
        }
        return i11 == 28 ? "Luminosity" : "Unknown";
    }

    public static String I(int i11) {
        if (i11 == 0) {
            return "Clamp";
        }
        if (i11 == 1) {
            return "Repeated";
        }
        if (i11 == 2) {
            return "Mirror";
        }
        return i11 == 3 ? "Decal" : "Unknown";
    }

    public static final int K(float f5, float[] fArr, int i11) {
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = f5;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f5) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i11] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final c a(h hVar) {
        Canvas canvas = d.f28542a;
        c cVar = new c();
        cVar.f28539a = new Canvas(i.a(hVar));
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x018e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x019b  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x012e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:99:0x013d  */
    public static final long b(float f5, float f11, float f12, float f13, h2.c cVar) {
        int i11;
        int i12;
        int i13;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean zC = cVar.c();
        float f14 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (zC) {
            float f15 = f13 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f13;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i31 = ((int) ((f15 * 255.0f) + 0.5f)) << 24;
            float f16 = f5 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f5;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i32 = i31 | (((int) ((f16 * 255.0f) + 0.5f)) << 16);
            float f17 = f11 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : f11;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i33 = i32 | (((int) ((f17 * 255.0f) + 0.5f)) << 8);
            if (f12 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                f14 = f12;
            }
            long j11 = ((long) (i33 | ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i34 = x.f28623j;
            return j11;
        }
        long j12 = cVar.f31457b;
        int i35 = h2.b.f31455e;
        if (((int) (j12 >> 32)) != 3) {
            i0.a("Color only works with ColorSpaces with 3 components");
        }
        int i36 = cVar.f31458c;
        if (i36 == -1) {
            i0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i37 = 0;
        float fB3 = cVar.b(0);
        float fA3 = cVar.a(0);
        if (f5 >= fB3) {
            fB3 = f5;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i38 = iFloatToRawIntBits3 >>> 31;
        int i39 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i40 = iFloatToRawIntBits3 & 8388607;
        if (i39 == 255) {
            i12 = i40 != 0 ? 512 : 0;
            i11 = 31;
        } else {
            i11 = i39 - 112;
            if (i11 >= 31) {
                i12 = 0;
                i11 = 49;
            } else {
                if (i11 > 0) {
                    int i41 = i40 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i13 = (((i11 << 10) | i41) + 1) | (i38 << 15);
                    } else {
                        i12 = i41;
                    }
                    short s3 = (short) i13;
                    fB = cVar.b(1);
                    fA = cVar.a(1);
                    if (f11 >= fB) {
                        fB = f11;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i14 = iFloatToRawIntBits >>> 31;
                    i15 = (iFloatToRawIntBits >>> 23) & 255;
                    i16 = iFloatToRawIntBits & 8388607;
                    if (i15 == 255) {
                        if (i16 != 0) {
                            i19 = 512;
                        } else {
                            i19 = 0;
                        }
                        i17 = 31;
                    } else {
                        i17 = i15 - 112;
                        if (i17 >= 31) {
                            i19 = 0;
                            i17 = 49;
                        } else {
                            if (i17 <= 0) {
                                i18 = i16 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                                } else {
                                    i19 = i18;
                                }
                                short s11 = (short) i21;
                                fB2 = cVar.b(2);
                                fA2 = cVar.a(2);
                                if (f12 >= fB2) {
                                    fB2 = f12;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i23 = iFloatToRawIntBits2 >>> 31;
                                i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i25 = 8388607 & iFloatToRawIntBits2;
                                if (i24 == 255) {
                                    i28 = i25 != 0 ? 512 : 0;
                                    i37 = 31;
                                } else {
                                    i26 = i24 - 112;
                                    if (i26 >= 31) {
                                        i28 = 0;
                                        i37 = 49;
                                    } else {
                                        if (i26 <= 0) {
                                            i27 = i25 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                                            } else {
                                                i28 = i27;
                                                i37 = i26;
                                            }
                                            short s12 = (short) i29;
                                            if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                                f14 = f13;
                                            }
                                            long j13 = (((long) i36) & 63) | ((((long) s3) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i42 = x.f28623j;
                                            return j13;
                                        }
                                        if (i26 >= -10) {
                                            i30 = (i25 | 8388608) >> (1 - i26);
                                            if ((i30 & 4096) != 0) {
                                                i30 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                            }
                                            i28 = i30 >> 13;
                                        } else {
                                            i28 = 0;
                                        }
                                    }
                                }
                                i29 = i28 | (i23 << 15) | (i37 << 10);
                                short s13 = (short) i29;
                                if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    f14 = f13;
                                }
                                long j14 = (((long) i36) & 63) | ((((long) s3) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i43 = x.f28623j;
                                return j14;
                            }
                            if (i17 >= -10) {
                                i22 = (i16 | 8388608) >> (1 - i17);
                                if ((i22 & 4096) != 0) {
                                    i22 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                }
                                i19 = i22 >> 13;
                                i17 = 0;
                            } else {
                                i19 = 0;
                                i17 = 0;
                            }
                        }
                    }
                    i21 = i19 | (i14 << 15) | (i17 << 10);
                    short s14 = (short) i21;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i28 = i25 != 0 ? 512 : 0;
                        i37 = 31;
                    } else {
                        i26 = i24 - 112;
                        if (i26 >= 31) {
                            i28 = 0;
                            i37 = 49;
                        } else {
                            if (i26 <= 0) {
                                i27 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                                } else {
                                    i28 = i27;
                                    i37 = i26;
                                }
                                short s15 = (short) i29;
                                if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    f14 = f13;
                                }
                                long j15 = (((long) i36) & 63) | ((((long) s3) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i44 = x.f28623j;
                                return j15;
                            }
                            if (i26 >= -10) {
                                i30 = (i25 | 8388608) >> (1 - i26);
                                if ((i30 & 4096) != 0) {
                                    i30 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                }
                                i28 = i30 >> 13;
                            } else {
                                i28 = 0;
                            }
                        }
                    }
                    i29 = i28 | (i23 << 15) | (i37 << 10);
                    short s16 = (short) i29;
                    if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f14 = f13;
                    }
                    long j16 = (((long) i36) & 63) | ((((long) s3) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s16)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i45 = x.f28623j;
                    return j16;
                }
                if (i11 >= -10) {
                    int i46 = (i40 | 8388608) >> (1 - i11);
                    if ((i46 & 4096) != 0) {
                        i46 += OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i12 = i46 >> 13;
                    i11 = 0;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
            }
        }
        i13 = i12 | (i38 << 15) | (i11 << 10);
        short s17 = (short) i13;
        fB = cVar.b(1);
        fA = cVar.a(1);
        if (f11 >= fB) {
            fB = f11;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i14 = iFloatToRawIntBits >>> 31;
        i15 = (iFloatToRawIntBits >>> 23) & 255;
        i16 = iFloatToRawIntBits & 8388607;
        if (i15 == 255) {
            if (i16 != 0) {
                i19 = 512;
            } else {
                i19 = 0;
            }
            i17 = 31;
        } else {
            i17 = i15 - 112;
            if (i17 >= 31) {
                i19 = 0;
                i17 = 49;
            } else {
                if (i17 <= 0) {
                    i18 = i16 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                    } else {
                        i19 = i18;
                    }
                    short s18 = (short) i21;
                    fB2 = cVar.b(2);
                    fA2 = cVar.a(2);
                    if (f12 >= fB2) {
                        fB2 = f12;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i28 = i25 != 0 ? 512 : 0;
                        i37 = 31;
                    } else {
                        i26 = i24 - 112;
                        if (i26 >= 31) {
                            i28 = 0;
                            i37 = 49;
                        } else {
                            if (i26 <= 0) {
                                i27 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                                } else {
                                    i28 = i27;
                                    i37 = i26;
                                }
                                short s19 = (short) i29;
                                if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                                    f14 = f13;
                                }
                                long j17 = (((long) i36) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s19)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i47 = x.f28623j;
                                return j17;
                            }
                            if (i26 >= -10) {
                                i30 = (i25 | 8388608) >> (1 - i26);
                                if ((i30 & 4096) != 0) {
                                    i30 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                }
                                i28 = i30 >> 13;
                            } else {
                                i28 = 0;
                            }
                        }
                    }
                    i29 = i28 | (i23 << 15) | (i37 << 10);
                    short s110 = (short) i29;
                    if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f14 = f13;
                    }
                    long j18 = (((long) i36) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s18) & 65535) << 32) | ((65535 & ((long) s110)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i48 = x.f28623j;
                    return j18;
                }
                if (i17 >= -10) {
                    i22 = (i16 | 8388608) >> (1 - i17);
                    if ((i22 & 4096) != 0) {
                        i22 += OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i19 = i22 >> 13;
                    i17 = 0;
                } else {
                    i19 = 0;
                    i17 = 0;
                }
            }
        }
        i21 = i19 | (i14 << 15) | (i17 << 10);
        short s111 = (short) i21;
        fB2 = cVar.b(2);
        fA2 = cVar.a(2);
        if (f12 >= fB2) {
            fB2 = f12;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i23 = iFloatToRawIntBits2 >>> 31;
        i24 = (iFloatToRawIntBits2 >>> 23) & 255;
        i25 = 8388607 & iFloatToRawIntBits2;
        if (i24 == 255) {
            i28 = i25 != 0 ? 512 : 0;
            i37 = 31;
        } else {
            i26 = i24 - 112;
            if (i26 >= 31) {
                i28 = 0;
                i37 = 49;
            } else {
                if (i26 <= 0) {
                    i27 = i25 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i29 = (((i26 << 10) | i27) + 1) | (i23 << 15);
                    } else {
                        i28 = i27;
                        i37 = i26;
                    }
                    short s112 = (short) i29;
                    if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f14 = f13;
                    }
                    long j19 = (((long) i36) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s112)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i49 = x.f28623j;
                    return j19;
                }
                if (i26 >= -10) {
                    i30 = (i25 | 8388608) >> (1 - i26);
                    if ((i30 & 4096) != 0) {
                        i30 += OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i28 = i30 >> 13;
                } else {
                    i28 = 0;
                }
            }
        }
        i29 = i28 | (i23 << 15) | (i37 << 10);
        short s113 = (short) i29;
        if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            f14 = f13;
        }
        long j110 = (((long) i36) & 63) | ((((long) s17) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s113)) << 16) | ((((long) ((int) (((f14 <= 1.0f ? f14 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i410 = x.f28623j;
        return j110;
    }

    public static final long c(int i11) {
        long j11 = ((long) i11) << 32;
        int i12 = x.f28623j;
        return j11;
    }

    public static final long d(int i11, int i12, int i13, int i14) {
        return c(((i11 & 255) << 16) | ((i14 & 255) << 24) | ((i12 & 255) << 8) | (i13 & 255));
    }

    public static final long e(long j11) {
        long j12 = j11 << 32;
        int i11 = x.f28623j;
        return j12;
    }

    public static h g(int i11, int i12, int i13) {
        Bitmap bitmapCreateBitmap;
        h2.r rVar = h2.e.f31464e;
        Bitmap.Config configC = i.c(i13);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = i.b(i11, i12, i13, rVar);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, configC);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new h(bitmapCreateBitmap);
    }

    public static final a.a h() {
        return new a.a(new Paint(7));
    }

    public static final m i() {
        return new m(new PathMeasure());
    }

    public static final long j(float f5, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        int i11 = z0.f28632c;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long k(float f5, float f11, float f12, float f13, h2.c cVar) {
        int i11;
        int i12;
        int i13;
        int iFloatToRawIntBits;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int iFloatToRawIntBits2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        if (cVar.c()) {
            long j11 = ((long) ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f5 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32;
            int i29 = x.f28623j;
            return j11;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f5);
        int i30 = iFloatToRawIntBits3 >>> 31;
        int i31 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i32 = iFloatToRawIntBits3 & 8388607;
        int i33 = 49;
        int i34 = 0;
        if (i31 == 255) {
            i12 = i32 != 0 ? 512 : 0;
            i11 = 31;
        } else {
            i11 = i31 - 112;
            if (i11 >= 31) {
                i11 = 49;
                i12 = 0;
            } else {
                if (i11 > 0) {
                    int i35 = i32 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i13 = (((i11 << 10) | i35) + 1) | (i30 << 15);
                    } else {
                        i12 = i35;
                    }
                    short s3 = (short) i13;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f11);
                    i14 = iFloatToRawIntBits >>> 31;
                    i15 = (iFloatToRawIntBits >>> 23) & 255;
                    i16 = iFloatToRawIntBits & 8388607;
                    if (i15 == 255) {
                        if (i16 != 0) {
                            i19 = 512;
                        } else {
                            i19 = 0;
                        }
                        i17 = 31;
                    } else {
                        i17 = i15 - 112;
                        if (i17 >= 31) {
                            i17 = 49;
                            i19 = 0;
                        } else {
                            if (i17 <= 0) {
                                i18 = i16 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                                } else {
                                    i19 = i18;
                                }
                                short s11 = (short) i21;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                                i23 = iFloatToRawIntBits2 >>> 31;
                                i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i25 = 8388607 & iFloatToRawIntBits2;
                                if (i24 == 255) {
                                    i26 = i24 - 112;
                                    if (i26 < 31) {
                                        if (i26 <= 0) {
                                            i34 = i25 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                                            } else {
                                                i33 = i26;
                                            }
                                        } else if (i26 >= -10) {
                                            i28 = (i25 | 8388608) >> (1 - i26);
                                            if ((i28 & 4096) != 0) {
                                                i28 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                            }
                                            i33 = 0;
                                            i34 = i28 >> 13;
                                        } else {
                                            i33 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
                                    int i36 = x.f28623j;
                                    return jMax;
                                }
                                i34 = i25 == 0 ? 0 : 512;
                                i33 = 31;
                                i27 = (i23 << 15) | (i33 << 10) | i34;
                                long jMax2 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
                                int i37 = x.f28623j;
                                return jMax2;
                            }
                            if (i17 >= -10) {
                                i22 = (i16 | 8388608) >> (1 - i17);
                                if ((i22 & 4096) != 0) {
                                    i22 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                }
                                i19 = i22 >> 13;
                                i17 = 0;
                            } else {
                                i19 = 0;
                                i17 = 0;
                            }
                        }
                    }
                    i21 = i19 | (i14 << 15) | (i17 << 10);
                    short s12 = (short) i21;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i26 = i24 - 112;
                        if (i26 < 31) {
                            if (i26 <= 0) {
                                i34 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                                } else {
                                    i33 = i26;
                                }
                            } else if (i26 >= -10) {
                                i28 = (i25 | 8388608) >> (1 - i26);
                                if ((i28 & 4096) != 0) {
                                    i28 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                }
                                i33 = 0;
                                i34 = i28 >> 13;
                            } else {
                                i33 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
                        int i38 = x.f28623j;
                        return jMax3;
                    }
                    i34 = i25 == 0 ? 0 : 512;
                    i33 = 31;
                    i27 = (i23 << 15) | (i33 << 10) | i34;
                    long jMax4 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s3) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
                    int i39 = x.f28623j;
                    return jMax4;
                }
                if (i11 >= -10) {
                    int i40 = (i32 | 8388608) >> (1 - i11);
                    if ((i40 & 4096) != 0) {
                        i40 += OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i12 = i40 >> 13;
                    i11 = 0;
                } else {
                    i12 = 0;
                    i11 = 0;
                }
            }
        }
        i13 = i12 | (i30 << 15) | (i11 << 10);
        short s13 = (short) i13;
        iFloatToRawIntBits = Float.floatToRawIntBits(f11);
        i14 = iFloatToRawIntBits >>> 31;
        i15 = (iFloatToRawIntBits >>> 23) & 255;
        i16 = iFloatToRawIntBits & 8388607;
        if (i15 == 255) {
            if (i16 != 0) {
                i19 = 512;
            } else {
                i19 = 0;
            }
            i17 = 31;
        } else {
            i17 = i15 - 112;
            if (i17 >= 31) {
                i17 = 49;
                i19 = 0;
            } else {
                if (i17 <= 0) {
                    i18 = i16 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i21 = (((i17 << 10) | i18) + 1) | (i14 << 15);
                    } else {
                        i19 = i18;
                    }
                    short s14 = (short) i21;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                    i23 = iFloatToRawIntBits2 >>> 31;
                    i24 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i25 = 8388607 & iFloatToRawIntBits2;
                    if (i24 == 255) {
                        i26 = i24 - 112;
                        if (i26 < 31) {
                            if (i26 <= 0) {
                                i34 = i25 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                                } else {
                                    i33 = i26;
                                }
                            } else if (i26 >= -10) {
                                i28 = (i25 | 8388608) >> (1 - i26);
                                if ((i28 & 4096) != 0) {
                                    i28 += OSSConstants.DEFAULT_BUFFER_SIZE;
                                }
                                i33 = 0;
                                i34 = i28 >> 13;
                            } else {
                                i33 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
                        int i310 = x.f28623j;
                        return jMax5;
                    }
                    i34 = i25 == 0 ? 0 : 512;
                    i33 = 31;
                    i27 = (i23 << 15) | (i33 << 10) | i34;
                    long jMax6 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
                    int i311 = x.f28623j;
                    return jMax6;
                }
                if (i17 >= -10) {
                    i22 = (i16 | 8388608) >> (1 - i17);
                    if ((i22 & 4096) != 0) {
                        i22 += OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i19 = i22 >> 13;
                    i17 = 0;
                } else {
                    i19 = 0;
                    i17 = 0;
                }
            }
        }
        i21 = i19 | (i14 << 15) | (i17 << 10);
        short s15 = (short) i21;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
        i23 = iFloatToRawIntBits2 >>> 31;
        i24 = (iFloatToRawIntBits2 >>> 23) & 255;
        i25 = 8388607 & iFloatToRawIntBits2;
        if (i24 == 255) {
            i26 = i24 - 112;
            if (i26 < 31) {
                if (i26 <= 0) {
                    i34 = i25 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i27 = (((i26 << 10) | i34) + 1) | (i23 << 15);
                    } else {
                        i33 = i26;
                    }
                } else if (i26 >= -10) {
                    i28 = (i25 | 8388608) >> (1 - i26);
                    if ((i28 & 4096) != 0) {
                        i28 += OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i33 = 0;
                    i34 = i28 >> 13;
                } else {
                    i33 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
            int i312 = x.f28623j;
            return jMax7;
        }
        i34 = i25 == 0 ? 0 : 512;
        i33 = 31;
        i27 = (i23 << 15) | (i33 << 10) | i34;
        long jMax8 = ((((long) ((short) i27)) & 65535) << 16) | ((((long) s13) & 65535) << 48) | ((((long) s15) & 65535) << 32) | ((((long) ((int) ((Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f31458c) & 63);
        int i313 = x.f28623j;
        return jMax8;
    }

    public static final long l(long j11, long j12) {
        float f5;
        float f11;
        long jB = x.b(j11, x.g(j12));
        float fE = x.e(j12);
        float fE2 = x.e(jB);
        float f12 = 1.0f - fE2;
        float f13 = (fE * f12) + fE2;
        float fI = x.i(jB);
        float fI2 = x.i(j12);
        float f14 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f13 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        } else {
            f5 = (((fI2 * fE) * f12) + (fI * fE2)) / f13;
        }
        float fH = x.h(jB);
        float fH2 = x.h(j12);
        if (f13 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f11 = 0.0f;
        } else {
            f11 = (((fH2 * fE) * f12) + (fH * fE2)) / f13;
        }
        float f15 = x.f(jB);
        float f16 = x.f(j12);
        if (f13 != CropImageView.DEFAULT_ASPECT_RATIO) {
            f14 = (((f16 * fE) * f12) + (f15 * fE2)) / f13;
        }
        return k(f5, f11, f14, f13, x.g(j12));
    }

    public static final int m(List list) {
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iA = ns.o.A(list);
        for (int i12 = 1; i12 < iA; i12++) {
            if (x.e(((x) list.get(i12)).f28624a) == CropImageView.DEFAULT_ASPECT_RATIO) {
                i11++;
            }
        }
        return i11;
    }

    public static void n(i2.d dVar, f0 f0Var, long j11) {
        if (f0Var instanceof m0) {
            f2.c cVar = ((m0) f0Var).f28585f;
            float f5 = cVar.f26572a;
            dVar.z0(j11, (((long) Float.floatToRawIntBits(cVar.f26573b)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), A(cVar), 1.0f, 3);
            return;
        }
        boolean z11 = f0Var instanceof n0;
        i2.g gVar = i2.g.f34126a;
        if (!z11) {
            if (!(f0Var instanceof l0)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.s(((l0) f0Var).f28581f, j11, 1.0f, gVar);
            return;
        }
        n0 n0Var = (n0) f0Var;
        k kVar = n0Var.f28588g;
        if (kVar != null) {
            dVar.s(kVar, j11, 1.0f, gVar);
            return;
        }
        f2.d dVar2 = n0Var.f28587f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f26583h >> 32));
        float f11 = dVar2.f26576a;
        dVar.w0(j11, (((long) Float.floatToRawIntBits(dVar2.f26577b)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), (((long) Float.floatToRawIntBits(dVar2.b())) << 32) | (((long) Float.floatToRawIntBits(dVar2.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), gVar, 1.0f);
    }

    public static void o(Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            b.a(canvas, z11);
            return;
        }
        if (!f28559e) {
            try {
                if (i11 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f28557c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f28558d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f28557c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f28558d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f28557c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f28558d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f28559e = true;
        }
        if (z11) {
            try {
                Method method4 = f28557c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z11 || (method = f28558d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final z1.r q(z1.r rVar, fz.c cVar) {
        return rVar.i(new q(cVar));
    }

    public static z1.r r(z1.r rVar, float f5, float f11, float f12, float f13, w0 w0Var, int i11) {
        float f14 = (i11 & 1) != 0 ? 1.0f : f5;
        float f15 = (i11 & 2) != 0 ? 1.0f : f11;
        float f16 = (i11 & 4) != 0 ? 1.0f : f12;
        float f17 = (i11 & 32) != 0 ? 0.0f : f13;
        long j11 = z0.f28631b;
        w0 w0Var2 = (i11 & 2048) != 0 ? f28556b : w0Var;
        long j12 = g0.f28566a;
        return rVar.i(new e0(f14, f15, f16, f17, CropImageView.DEFAULT_ASPECT_RATIO, j11, w0Var2, false, j12, j12));
    }

    public static z1.r s(z1.r rVar, float f5, float f11, float f12, float f13, w0 w0Var, int i11) {
        float f14 = (i11 & 1) != 0 ? 1.0f : f5;
        float f15 = (i11 & 2) != 0 ? 1.0f : f11;
        float f16 = (i11 & 4) != 0 ? 1.0f : f12;
        float f17 = (i11 & 256) != 0 ? 0.0f : f13;
        long j11 = z0.f28631b;
        w0 w0Var2 = (i11 & 2048) != 0 ? f28556b : w0Var;
        boolean z11 = (i11 & 4096) == 0;
        long j12 = g0.f28566a;
        return rVar.i(new e0(f14, f15, f16, CropImageView.DEFAULT_ASPECT_RATIO, f17, j11, w0Var2, z11, j12, j12));
    }

    public static final boolean t(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[2] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[3] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[4] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[5] == 1.0f && fArr[6] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[7] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[8] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[9] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[10] == 1.0f && fArr[11] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[12] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[13] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[14] == CropImageView.DEFAULT_ASPECT_RATIO && fArr[15] == 1.0f;
    }

    public static final long u(float f5, long j11, long j12) {
        h2.m mVar = h2.e.f31482x;
        long jB = x.b(j11, mVar);
        long jB2 = x.b(j12, mVar);
        float fE = x.e(jB);
        float fI = x.i(jB);
        float fH = x.h(jB);
        float f11 = x.f(jB);
        float fE2 = x.e(jB2);
        float fI2 = x.i(jB2);
        float fH2 = x.h(jB2);
        float f12 = x.f(jB2);
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        return x.b(k(android.support.v4.media.session.a.A(fI, fI2, f5), android.support.v4.media.session.a.A(fH, fH2, f5), android.support.v4.media.session.a.A(f11, f12, f5), android.support.v4.media.session.a.A(fE, fE2, f5), mVar), x.g(j12));
    }

    public static final float v(long j11) {
        h2.c cVarG = x.g(j11);
        if (!h2.b.a(cVarG.f31457b, h2.b.f31451a)) {
            i0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) h2.b.b(cVarG.f31457b)));
        }
        h2.n nVar = ((h2.r) cVarG).f31522p;
        double dA = nVar.a(x.i(j11));
        float fA = (float) ((nVar.a(x.f(j11)) * 0.0722d) + (nVar.a(x.h(j11)) * 0.7152d) + (dA * 0.2126d));
        if (fA < CropImageView.DEFAULT_ASPECT_RATIO) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int[] w(int i11, List list) {
        int i12;
        int i13 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i13 < size) {
                iArr[i13] = E(((x) list.get(i13)).f28624a);
                i13++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i11];
        int iA = ns.o.A(list);
        int size2 = list.size();
        int i14 = 0;
        while (i13 < size2) {
            long j11 = ((x) list.get(i13)).f28624a;
            if (x.e(j11) == CropImageView.DEFAULT_ASPECT_RATIO) {
                if (i13 == 0) {
                    i12 = i14 + 1;
                    iArr2[i14] = E(x.c(((x) list.get(1)).f28624a, CropImageView.DEFAULT_ASPECT_RATIO));
                } else if (i13 == iA) {
                    i12 = i14 + 1;
                    iArr2[i14] = E(x.c(((x) list.get(i13 - 1)).f28624a, CropImageView.DEFAULT_ASPECT_RATIO));
                } else {
                    int i15 = i14 + 1;
                    iArr2[i14] = E(x.c(((x) list.get(i13 - 1)).f28624a, CropImageView.DEFAULT_ASPECT_RATIO));
                    i14 += 2;
                    iArr2[i15] = E(x.c(((x) list.get(i13 + 1)).f28624a, CropImageView.DEFAULT_ASPECT_RATIO));
                }
                i14 = i12;
            } else {
                iArr2[i14] = E(j11);
                i14++;
            }
            i13++;
        }
        return iArr2;
    }

    public static final float[] x(int i11, List list) {
        if (i11 == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i11];
        fArr[0] = 0.0f;
        int iA = ns.o.A(list);
        int i12 = 1;
        for (int i13 = 1; i13 < iA; i13++) {
            long j11 = ((x) list.get(i13)).f28624a;
            float fA = i13 / ns.o.A(list);
            int i14 = i12 + 1;
            fArr[i12] = fA;
            if (x.e(j11) == CropImageView.DEFAULT_ASPECT_RATIO) {
                i12 += 2;
                fArr[i14] = fA;
            } else {
                i12 = i14;
            }
        }
        fArr[i12] = 1.0f;
        return fArr;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f21 = fArr[13];
        float f22 = fArr[15];
        fArr[0] = f5;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f21;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f22;
        matrix.setValues(fArr);
        fArr[0] = f5;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void z(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f5 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f5;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public abstract f2.c p();

    public static final void J(List list) {
        if (list.size() >= 2) {
        } else {
            throw new IllegalArgumentException(PQgum.fqFWscl);
        }
    }
}
