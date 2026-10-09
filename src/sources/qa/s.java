package qa;

import android.view.animation.AnimationUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47663c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u5.f f47665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ij.d f47666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f47667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f47668h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47661a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47664d = 0;

    public s(b0 b0Var) {
        this.f47668h = b0Var;
        ij.d dVar = new ij.d(20, false);
        long[] jArr = new long[20];
        dVar.f34422c = jArr;
        dVar.f34423d = new float[20];
        dVar.f34421b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f47666f = dVar;
    }

    @Override // qa.w, qa.t
    public final void f(v vVar) {
        this.f47663c = true;
    }

    public final void g() {
        if (this.f47662b) {
            h();
            this.f47665e.a(this.f47668h.f47679b0 + 1);
        } else {
            this.f47664d = 1;
            this.f47667g = null;
        }
    }

    public final void h() {
        int i11;
        if (this.f47665e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f5 = this.f47661a;
        ij.d dVar = this.f47666f;
        int i12 = dVar.f34421b;
        float[] fArr = (float[]) dVar.f34423d;
        long[] jArr = (long[]) dVar.f34422c;
        char c11 = 20;
        int i13 = (i12 + 1) % 20;
        dVar.f34421b = i13;
        jArr[i13] = jCurrentAnimationTimeMillis;
        fArr[i13] = f5;
        j0.e eVar = new j0.e(4);
        float fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
        eVar.f35276b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f47665e = new u5.f(eVar);
        u5.g gVar = new u5.g();
        gVar.a(1.0f);
        gVar.b(200.0f);
        u5.f fVar = this.f47665e;
        fVar.m = gVar;
        fVar.f52789b = this.f47661a;
        fVar.f52790c = true;
        ArrayList arrayList = fVar.f52799l;
        if (fVar.f52793f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        u5.f fVar2 = this.f47665e;
        int i14 = dVar.f34421b;
        long j11 = Long.MIN_VALUE;
        if (i14 != 0 || jArr[i14] != Long.MIN_VALUE) {
            long j12 = jArr[i14];
            int i15 = 0;
            long j13 = j12;
            while (true) {
                long j14 = jArr[i14];
                if (j14 == j11) {
                    break;
                }
                float f11 = j12 - j14;
                float fAbs = Math.abs(j14 - j13);
                if (f11 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i14 == 0) {
                    i14 = 20;
                }
                i14--;
                i15++;
                if (i15 >= 20) {
                    break;
                }
                j13 = j14;
                j11 = Long.MIN_VALUE;
            }
            if (i15 >= 2) {
                float f12 = 1000.0f;
                if (i15 == 2) {
                    int i16 = dVar.f34421b;
                    int i17 = i16 == 0 ? 19 : i16 - 1;
                    float f13 = jArr[i16] - jArr[i17];
                    if (f13 != CropImageView.DEFAULT_ASPECT_RATIO) {
                        fSqrt = ((fArr[i16] - fArr[i17]) / f13) * 1000.0f;
                    }
                } else {
                    int i18 = dVar.f34421b;
                    int i19 = ((i18 - i15) + 21) % 20;
                    int i21 = (i18 + 21) % 20;
                    long j15 = jArr[i19];
                    float f14 = fArr[i19];
                    int i22 = i19 + 1;
                    int i23 = i22 % 20;
                    float f15 = 0.0f;
                    while (i23 != i21) {
                        long j16 = jArr[i23];
                        char c12 = c11;
                        float f16 = f12;
                        float f17 = j16 - j15;
                        if (f17 == fSqrt) {
                            i11 = i22;
                        } else {
                            float f18 = fArr[i23];
                            int i24 = i22;
                            float f19 = (f18 - f14) / f17;
                            float fAbs2 = (Math.abs(f19) * (f19 - ((float) (Math.sqrt(2.0f * Math.abs(f15)) * ((double) Math.signum(f15)))))) + f15;
                            i11 = i24;
                            if (i23 == i11) {
                                fAbs2 *= 0.5f;
                            }
                            f15 = fAbs2;
                            f14 = f18;
                            j15 = j16;
                        }
                        i23 = (i23 + 1) % 20;
                        i22 = i11;
                        c11 = c12;
                        f12 = f16;
                        fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f15) * 2.0f) * ((double) Math.signum(f15)))) * f12;
                }
            }
        }
        fVar2.f52788a = fSqrt;
        u5.f fVar3 = this.f47665e;
        fVar3.f52794g = this.f47668h.f47679b0 + 1;
        fVar3.f52795h = -1.0f;
        fVar3.f52797j = 4.0f;
        r rVar = new r(this);
        ArrayList arrayList2 = fVar3.f52798k;
        if (arrayList2.contains(rVar)) {
            return;
        }
        arrayList2.add(rVar);
    }
}
