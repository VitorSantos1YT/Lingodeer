package t2;

import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f52014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f52016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f52018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f52019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f52020h;

    public d(boolean z11, b bVar) {
        this.f52013a = z11;
        this.f52014b = bVar;
        if (z11 && bVar.equals(b.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i11 = c.f52012a[bVar.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 3;
        }
        this.f52015c = i12;
        this.f52016d = new a[20];
        this.f52018f = new float[20];
        this.f52019g = new float[20];
        this.f52020h = new float[3];
    }

    public final void a(long j11, float f5) {
        int i11 = (this.f52017e + 1) % 20;
        this.f52017e = i11;
        a[] aVarArr = this.f52016d;
        a aVar = aVarArr[i11];
        if (aVar != null) {
            aVar.f52010a = j11;
            aVar.f52011b = f5;
        } else {
            a aVar2 = new a();
            aVar2.f52010a = j11;
            aVar2.f52011b = f5;
            aVarArr[i11] = aVar2;
        }
    }

    public final float b(float f5) {
        b bVar;
        float[] fArr;
        float[] fArr2;
        float f11;
        boolean z11;
        int i11;
        float fSignum;
        float f12 = f5;
        float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            v2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i12 = this.f52017e;
        a[] aVarArr = this.f52016d;
        a aVar = aVarArr[i12];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i13 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i12];
                boolean z12 = this.f52013a;
                bVar = this.f52014b;
                fArr = this.f52018f;
                fArr2 = this.f52019g;
                if (aVar3 == null) {
                    f11 = f13;
                    z11 = z12;
                    i11 = 1;
                    break;
                }
                long j11 = aVar.f52010a;
                f11 = f13;
                int i14 = i12;
                long j12 = aVar3.f52010a;
                float f14 = j11 - j12;
                z11 = z12;
                i11 = 1;
                float fAbs = Math.abs(j12 - aVar2.f52010a);
                aVar2 = (bVar == b.Lsq2 || z11) ? aVar3 : aVar;
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i13] = aVar3.f52011b;
                fArr2[i13] = -f14;
                i12 = (i14 == 0 ? 20 : i14) - 1;
                i13++;
                if (i13 >= 20) {
                    break;
                }
                f13 = f11;
            }
            if (i13 >= this.f52015c) {
                int i15 = c.f52012a[bVar.ordinal()];
                if (i15 == i11) {
                    int i16 = i13 - i11;
                    float f15 = fArr2[i16];
                    int i17 = i16;
                    float fAbs2 = f11;
                    while (i17 > 0) {
                        int i18 = i17 - 1;
                        float f16 = fArr2[i18];
                        if (f15 != f16) {
                            float f17 = (z11 ? -fArr[i18] : fArr[i17] - fArr[i18]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i17 == i16) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i17--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        float[] fArr3 = this.f52020h;
                        g0.v(fArr2, fArr, i13, fArr3);
                        fSignum = fArr3[i11];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f11;
                    }
                }
                f13 = fSignum * 1000;
            } else {
                f13 = f11;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return f11;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public d() {
        this(true, b.Impulse);
    }
}
