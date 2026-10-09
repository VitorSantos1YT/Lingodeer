package d0;

import android.view.KeyEvent;
import com.yalantis.ucrop.view.CropImageView;
import f0.s2;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class z extends f {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public s2.t f22844m0;

    @Override // d0.f, y2.y1
    public final void G() {
        super.G();
        if (this.f22844m0 != null) {
            this.f22844m0 = null;
            a1();
        }
    }

    @Override // d0.f
    public final s2.m0 X0() {
        return null;
    }

    @Override // d0.f
    public final boolean d1(KeyEvent keyEvent) {
        return false;
    }

    @Override // d0.f
    public final void e1(KeyEvent keyEvent) {
        this.Y.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // d0.f, y2.y1
    public final void q(s2.l lVar, s2.m mVar, long j11) {
        super.q(lVar, mVar, j11);
        vy.d dVar = null;
        int i11 = 0;
        if (mVar != s2.m.Main) {
            if (mVar != s2.m.Final || this.f22844m0 == null) {
                return;
            }
            ?? r9 = lVar.f51328a;
            int size = r9.size();
            while (i11 < size) {
                s2.t tVar = (s2.t) r9.get(i11);
                if (tVar.b() && !tVar.equals(this.f22844m0)) {
                    this.f22844m0 = null;
                    a1();
                    return;
                }
                i11++;
            }
            return;
        }
        s2.t tVar2 = this.f22844m0;
        if (tVar2 == null) {
            if (s2.e(lVar, true)) {
                s2.t tVar3 = (s2.t) lVar.f51328a.get(0);
                tVar3.a();
                this.f22844m0 = tVar3;
                if (this.X) {
                    long j12 = tVar3.f51345c;
                    h0.i iVar = this.S;
                    if (iVar != null) {
                        h0.k kVar = new h0.k(j12);
                        if (Y0()) {
                            this.f22693j0 = rz.e0.B(H0(), null, null, new a0.e0(iVar, kVar, this, dVar, 14), 3);
                            return;
                        } else {
                            this.f22687d0 = kVar;
                            rz.e0.B(H0(), null, null, new c(iVar, kVar, null), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        ?? r11 = lVar.f51328a;
        int size2 = r11.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (!s2.s.b((s2.t) r11.get(i12))) {
                long jV0 = y2.f.x(this).f56881b0.v0(((p2) y2.f.i(this, z2.g1.f58557s)).e());
                float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (jV0 >> 32)) - ((int) (j11 >> 32))) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (jV0 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                int size3 = r11.size();
                while (i11 < size3) {
                    s2.t tVar4 = (s2.t) r11.get(i11);
                    if (tVar4.b() || s2.s.e(tVar4, j11, jFloatToRawIntBits)) {
                        this.f22844m0 = null;
                        a1();
                        return;
                    }
                    i11++;
                }
                return;
            }
        }
        ((s2.t) r11.get(0)).a();
        if (this.X) {
            long j13 = tVar2.f51345c;
            h0.i iVar2 = this.S;
            if (iVar2 != null) {
                rz.z1 z1Var = this.f22693j0;
                if (z1Var == null || !z1Var.isActive()) {
                    h0.k kVar2 = this.f22687d0;
                    if (kVar2 != null) {
                        rz.e0.B(H0(), null, null, new c(kVar2, iVar2, dVar, 1), 3);
                    }
                } else {
                    rz.e0.B(H0(), null, null, new bh.l(this, j13, iVar2, (vy.d) null, 3), 3);
                }
                this.f22687d0 = null;
            }
            this.Y.invoke();
        }
        this.f22844m0 = null;
    }
}
