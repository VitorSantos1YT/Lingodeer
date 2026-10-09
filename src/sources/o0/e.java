package o0;

import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import w2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f44363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1.i f44366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v3.m f44367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f44370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44372k;

    public e(int i11, int i12, List list, long j11, Object obj, h1 h1Var, z1.i iVar, v3.m mVar) {
        this.f44362a = i11;
        this.f44363b = list;
        this.f44364c = j11;
        this.f44365d = obj;
        this.f44366e = iVar;
        this.f44367f = mVar;
        this.f44368g = h1Var == h1.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            g1 g1Var = (g1) list.get(i13);
            iMax = Math.max(iMax, !this.f44368g ? g1Var.f54502b : g1Var.f54501a);
        }
        this.f44369h = iMax;
        this.f44370i = new int[this.f44363b.size() * 2];
        this.f44372k = Integer.MIN_VALUE;
    }

    public final void a(int i11) {
        this.f44371j += i11;
        int[] iArr = this.f44370i;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            boolean z11 = this.f44368g;
            if ((z11 && i12 % 2 == 1) || (!z11 && i12 % 2 == 0)) {
                iArr[i12] = iArr[i12] + i11;
            }
        }
    }

    public final void b(int i11, int i12, int i13) {
        int i14;
        this.f44371j = i11;
        boolean z11 = this.f44368g;
        this.f44372k = z11 ? i13 : i12;
        List list = this.f44363b;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            g1 g1Var = (g1) list.get(i15);
            int i16 = i15 * 2;
            int[] iArr = this.f44370i;
            if (z11) {
                float f5 = (i12 - g1Var.f54501a) / 2.0f;
                v3.m mVar = v3.m.Ltr;
                v3.m mVar2 = this.f44367f;
                float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (mVar2 != mVar) {
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO * (-1);
                }
                iArr[i16] = Math.round((1 + f11) * f5);
                iArr[i16 + 1] = i11;
                i14 = g1Var.f54502b;
            } else {
                iArr[i16] = i11;
                int i17 = i16 + 1;
                z1.i iVar = this.f44366e;
                if (iVar == null) {
                    i0.a.b("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i17] = iVar.a(g1Var.f54502b, i13);
                i14 = g1Var.f54501a;
            }
            i11 += i14;
        }
    }
}
