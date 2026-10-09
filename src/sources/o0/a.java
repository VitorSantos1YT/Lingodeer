package o0;

import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import java.util.concurrent.CancellationException;
import l1.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f44351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f44352b;

    public a(t tVar, h1 h1Var) {
        this.f44351a = tVar;
        this.f44352b = h1Var;
    }

    @Override // r2.a
    public final Object D(long j11, long j12, vy.d dVar) {
        return new v3.q(this.f44352b == h1.Vertical ? v3.q.a(j12, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) : v3.q.a(j12, 1, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        if (i11 != 1) {
            return 0L;
        }
        t tVar = this.f44351a;
        com.android.billingclient.api.h hVar = tVar.f44435d;
        com.android.billingclient.api.h hVar2 = tVar.f44435d;
        if (Math.abs(((g1) hVar.f7511d).l()) <= 1.0E-6d) {
            return 0L;
        }
        float fL = ((g1) hVar2.f7511d).l() * tVar.n();
        float f5 = ((tVar.l().f44401b + tVar.l().f44402c) * (-Math.signum(((g1) hVar2.f7511d).l()))) + fL;
        if (((g1) hVar2.f7511d).l() > CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = fL;
            fL = f5;
        }
        h1 h1Var = h1.Horizontal;
        h1 h1Var2 = this.f44352b;
        float fIntBitsToFloat = -tVar.f44442k.e(-hz.b.k(Float.intBitsToFloat((int) (h1Var2 == h1Var ? j11 >> 32 : j11 & 4294967295L)), fL, f5));
        float fIntBitsToFloat2 = h1Var2 == h1Var ? fIntBitsToFloat : Float.intBitsToFloat((int) (j11 >> 32));
        if (h1Var2 != h1.Vertical) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        if (i11 != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f44352b == h1.Horizontal ? j12 >> 32 : 4294967295L & j12)) == CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }
}
