package h2;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f31510r = new d(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f31514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f31515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f31516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f31517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f31518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f31519l;
    public final n m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f31520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f31521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f31522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f31523q;

    public r(String str, float[] fArr, t tVar, final s sVar, int i11) {
        j jVar;
        j jVar2;
        double d5 = sVar.f31524a;
        boolean z11 = d5 == -3.0d;
        double d11 = sVar.f31530g;
        double d12 = sVar.f31529f;
        if (z11) {
            final int i12 = 4;
            jVar = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i13 = i12;
                    s sVar2 = sVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i13 = 5;
            jVar = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i14 = i13;
                    s sVar2 = sVar;
                    switch (i14) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i14 = 6;
            jVar = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i15 = i14;
                    s sVar2 = sVar;
                    switch (i15) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        } else {
            final int i15 = 7;
            jVar = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i16 = i15;
                    s sVar2 = sVar;
                    switch (i16) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        }
        if (d5 == -3.0d) {
            final int i16 = 0;
            jVar2 = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i17 = i16;
                    s sVar2 = sVar;
                    switch (i17) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i17 = 1;
            jVar2 = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i18 = i17;
                    s sVar2 = sVar;
                    switch (i18) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i18 = 2;
            jVar2 = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i19 = i18;
                    s sVar2 = sVar;
                    switch (i19) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        } else {
            final int i19 = 3;
            jVar2 = new j() { // from class: h2.p
                @Override // h2.j
                public final double a(double d13) {
                    int i110 = i19;
                    s sVar2 = sVar;
                    switch (i110) {
                        case 0:
                            float[] fArr2 = e.f31460a;
                            return e.a(sVar2, d13);
                        case 1:
                            float[] fArr3 = e.f31460a;
                            return e.c(sVar2, d13);
                        case 2:
                            double d14 = sVar2.f31525b;
                            return d13 >= sVar2.f31528e ? Math.pow((d14 * d13) + sVar2.f31526c, sVar2.f31524a) : d13 * sVar2.f31527d;
                        case 3:
                            double d15 = sVar2.f31525b;
                            double d16 = sVar2.f31526c;
                            double d17 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e ? Math.pow((d15 * d13) + d16, sVar2.f31524a) + sVar2.f31529f : (d17 * d13) + sVar2.f31530g;
                        case 4:
                            float[] fArr4 = e.f31460a;
                            return e.b(sVar2, d13);
                        case 5:
                            float[] fArr5 = e.f31460a;
                            return e.d(sVar2, d13);
                        case 6:
                            double d18 = sVar2.f31525b;
                            double d19 = sVar2.f31526c;
                            double d20 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d20 ? (Math.pow(d13, 1.0d / sVar2.f31524a) - d19) / d18 : d13 / d20;
                        default:
                            double d21 = sVar2.f31525b;
                            double d22 = sVar2.f31526c;
                            double d23 = sVar2.f31527d;
                            return d13 >= sVar2.f31528e * d23 ? (Math.pow(d13 - sVar2.f31529f, 1.0d / sVar2.f31524a) - d22) / d21 : (d13 - sVar2.f31530g) / d23;
                    }
                }
            };
        }
        this(str, fArr, tVar, null, jVar, jVar2, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, sVar, i11);
    }

    @Override // h2.c
    public final float a(int i11) {
        return this.f31513f;
    }

    @Override // h2.c
    public final float b(int i11) {
        return this.f31512e;
    }

    @Override // h2.c
    public final boolean c() {
        return this.f31523q;
    }

    @Override // h2.c
    public final long d(float f5, float f11, float f12) {
        double d5 = f5;
        n nVar = this.f31522p;
        float fA = (float) nVar.a(d5);
        float fA2 = (float) nVar.a(f11);
        float fA3 = (float) nVar.a(f12);
        float[] fArr = this.f31516i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        return (((long) Float.floatToRawIntBits((fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA))) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // h2.c
    public final float e(float f5, float f11, float f12) {
        double d5 = f5;
        n nVar = this.f31522p;
        float fA = (float) nVar.a(d5);
        float fA2 = (float) nVar.a(f11);
        float fA3 = (float) nVar.a(f12);
        float[] fArr = this.f31516i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // h2.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        s sVar = rVar.f31514g;
        if (Float.compare(rVar.f31512e, this.f31512e) != 0 || Float.compare(rVar.f31513f, this.f31513f) != 0 || !kotlin.jvm.internal.m.a(this.f31511d, rVar.f31511d) || !Arrays.equals(this.f31515h, rVar.f31515h)) {
            return false;
        }
        s sVar2 = this.f31514g;
        if (sVar2 != null) {
            return kotlin.jvm.internal.m.a(sVar2, sVar);
        }
        if (sVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.m.a(this.f31518k, rVar.f31518k)) {
            return kotlin.jvm.internal.m.a(this.f31520n, rVar.f31520n);
        }
        return false;
    }

    @Override // h2.c
    public final long f(float f5, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.f31517j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f5);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f5);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f5);
        n nVar = this.m;
        return f0.b((float) nVar.a(f14), (float) nVar.a(f15), (float) nVar.a(f16), f13, cVar);
    }

    @Override // h2.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f31515h) + ((this.f31511d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f5 = this.f31512e;
        int iFloatToIntBits = (iHashCode + (f5 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : Float.floatToIntBits(f5))) * 31;
        float f11 = this.f31513f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : Float.floatToIntBits(f11))) * 31;
        s sVar = this.f31514g;
        int iHashCode2 = iFloatToIntBits2 + (sVar != null ? sVar.hashCode() : 0);
        if (sVar == null) {
            return this.f31520n.hashCode() + ((this.f31518k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x021d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0231  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249  */
    /* JADX WARN: Code duplicated, block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0263 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public r(String str, float[] fArr, t tVar, float[] fArr2, j jVar, j jVar2, float f5, float f11, s sVar, int i11) {
        int i12;
        float f12;
        float f13;
        float[] fArr3;
        r rVar;
        double d5;
        int i13;
        super(str, b.f31451a, i11);
        this.f31511d = tVar;
        this.f31512e = f5;
        this.f31513f = f11;
        this.f31514g = sVar;
        this.f31518k = jVar;
        boolean z11 = 1;
        z11 = 1;
        this.f31519l = new q(this, z11 ? 1 : 0);
        int i14 = 0;
        this.m = new n(this, i14);
        this.f31520n = jVar2;
        this.f31521o = new q(this, i14);
        this.f31522p = new n(this, z11 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f5 < f11) {
            float[] fArr4 = new float[6];
            if (fArr.length == 9) {
                float f14 = fArr[0];
                float f15 = fArr[1];
                float f16 = f14 + f15 + fArr[2];
                fArr4[0] = f14 / f16;
                fArr4[1] = f15 / f16;
                float f17 = fArr[3];
                float f18 = fArr[4];
                float f19 = f17 + f18 + fArr[5];
                fArr4[2] = f17 / f19;
                fArr4[3] = f18 / f19;
                float f21 = fArr[6];
                float f22 = fArr[7];
                float f23 = f21 + f22 + fArr[8];
                fArr4[4] = f21 / f23;
                fArr4[5] = f22 / f23;
            } else {
                System.arraycopy(fArr, 0, fArr4, 0, 6);
            }
            this.f31515h = fArr4;
            if (fArr2 == null) {
                float f24 = fArr4[0];
                float f25 = fArr4[1];
                float f26 = fArr4[2];
                float f27 = fArr4[3];
                float f28 = fArr4[4];
                float f29 = fArr4[5];
                f12 = 1.0f;
                float f30 = tVar.f31531a;
                i12 = 0;
                float f31 = tVar.f31532b;
                float f32 = 1;
                float f33 = (f32 - f24) / f25;
                float f34 = (f32 - f26) / f27;
                float f35 = (f32 - f28) / f29;
                float f36 = (f32 - f30) / f31;
                float f37 = f24 / f25;
                float f38 = (f26 / f27) - f37;
                float f39 = (f30 / f31) - f37;
                float f40 = f34 - f33;
                float f41 = (f28 / f29) - f37;
                float f42 = (((f36 - f33) * f38) - (f39 * f40)) / (((f35 - f33) * f38) - (f40 * f41));
                float f43 = (f39 - (f41 * f42)) / f38;
                float f44 = (1.0f - f43) - f42;
                float f45 = f44 / f25;
                float f46 = f43 / f27;
                float f47 = f42 / f29;
                this.f31516i = new float[]{f45 * f24, f44, ((1.0f - f24) - f25) * f45, f46 * f26, f43, ((1.0f - f26) - f27) * f46, f47 * f28, f42, ((1.0f - f28) - f29) * f47};
            } else {
                i12 = 0;
                f12 = 1.0f;
                if (fArr2.length == 9) {
                    this.f31516i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f31517j = k.f(this.f31516i);
            float fB = k.b(fArr4);
            float[] fArr5 = e.f31460a;
            if (fB / k.b(e.f31461b) > 0.9f) {
                float[] fArr6 = e.f31460a;
                float f48 = fArr4[i12];
                float f49 = fArr6[i12];
                float f50 = fArr4[1];
                float f51 = fArr6[1];
                float f52 = fArr4[2];
                float f53 = fArr6[2];
                float f54 = fArr4[3];
                float f55 = fArr6[3];
                float f56 = fArr4[4];
                float f57 = fArr6[4];
                float f58 = fArr4[5];
                float f59 = fArr6[5];
                f13 = CropImageView.DEFAULT_ASPECT_RATIO;
                float[] fArr7 = new float[6];
                fArr7[i12] = f48 - f49;
                fArr7[1] = f50 - f51;
                fArr7[2] = f52 - f53;
                fArr7[3] = f54 - f55;
                fArr7[4] = f56 - f57;
                fArr7[5] = f58 - f59;
                float f60 = fArr7[i12];
                float f61 = fArr7[1];
                if (((f51 - f59) * f60) - ((f49 - f57) * f61) >= CropImageView.DEFAULT_ASPECT_RATIO && ((f49 - f53) * f61) - ((f51 - f55) * f60) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f62 = fArr7[2];
                    float f63 = fArr7[3];
                    if (((f55 - f51) * f62) - ((f53 - f49) * f63) >= CropImageView.DEFAULT_ASPECT_RATIO && ((f53 - f57) * f63) - ((f55 - f59) * f62) >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        float f64 = fArr7[4];
                        float f65 = fArr7[5];
                        if (((f59 - f55) * f64) - ((f57 - f53) * f65) < CropImageView.DEFAULT_ASPECT_RATIO || ((f57 - f49) * f65) - ((f59 - f51) * f64) < CropImageView.DEFAULT_ASPECT_RATIO) {
                        }
                    }
                }
                if (i11 != 0) {
                    fArr3 = e.f31460a;
                    if (fArr4 == fArr3) {
                        i13 = i12;
                        while (true) {
                            if (i13 < 6) {
                                if (Float.compare(fArr4[i13], fArr3[i13]) != 0 || Math.abs(fArr4[i13] - fArr3[i13]) <= 0.001f) {
                                    i13++;
                                }
                            } else {
                                if (k.d(tVar, k.f31495d)) {
                                    break;
                                }
                                float[] fArr8 = e.f31460a;
                                rVar = e.f31464e;
                                while (d5 <= 1.0d) {
                                    if (Math.abs(jVar.a(d5) - rVar.f31518k.a(d5)) <= 0.001d) {
                                    }
                                }
                            }
                            z11 = i12;
                            break;
                        }
                    }
                    if (k.d(tVar, k.f31495d) || f5 != f13 || f11 != f12) {
                        z11 = i12;
                        break;
                    }
                    float[] fArr9 = e.f31460a;
                    rVar = e.f31464e;
                    for (d5 = 0.0d; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                        if (Math.abs(jVar.a(d5) - rVar.f31518k.a(d5)) <= 0.001d || Math.abs(jVar2.a(d5) - rVar.f31520n.a(d5)) > 0.001d) {
                            z11 = i12;
                            break;
                        }
                    }
                }
                this.f31523q = z11;
                return;
            }
            f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            int i15 = (f5 > f13 ? 1 : (f5 == f13 ? 0 : -1));
            if (i11 != 0) {
                fArr3 = e.f31460a;
                if (fArr4 == fArr3) {
                    i13 = i12;
                    while (true) {
                        if (i13 < 6) {
                            if (Float.compare(fArr4[i13], fArr3[i13]) != 0) {
                            }
                            i13++;
                        } else {
                            if (k.d(tVar, k.f31495d)) {
                                break;
                            }
                            float[] fArr10 = e.f31460a;
                            rVar = e.f31464e;
                            while (d5 <= 1.0d) {
                                if (Math.abs(jVar.a(d5) - rVar.f31518k.a(d5)) <= 0.001d) {
                                }
                            }
                        }
                        z11 = i12;
                        break;
                    }
                }
                if (k.d(tVar, k.f31495d)) {
                    z11 = i12;
                    break;
                }
                float[] fArr11 = e.f31460a;
                rVar = e.f31464e;
                while (d5 <= 1.0d) {
                    if (Math.abs(jVar.a(d5) - rVar.f31518k.a(d5)) <= 0.001d) {
                    }
                    z11 = i12;
                }
            }
            this.f31523q = z11;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f5 + ", max=" + f11 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(String str, float[] fArr, t tVar, final double d5, float f5, float f11, int i11) {
        j jVar;
        j jVar2 = f31510r;
        if (d5 == 1.0d) {
            jVar = jVar2;
        } else {
            final int i12 = 0;
            jVar = new j() { // from class: h2.o
                @Override // h2.j
                public final double a(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d5);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d5);
                    }
                }
            };
        }
        if (d5 != 1.0d) {
            final int i13 = 1;
            jVar2 = new j() { // from class: h2.o
                @Override // h2.j
                public final double a(double d11) {
                    switch (i13) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d5);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d5);
                    }
                }
            };
        }
        this(str, fArr, tVar, null, jVar, jVar2, f5, f11, new s(d5, 1.0d, 0.0d, 0.0d, 0.0d), i11);
    }
}
