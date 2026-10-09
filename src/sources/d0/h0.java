package d0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z1.q implements y2.q {
    public final h0.i Q;
    public boolean R;
    public boolean S;
    public boolean T;

    public h0(h0.i iVar) {
        this.Q = iVar;
    }

    @Override // z1.q
    public final void L0() {
        rz.e0.B(H0(), null, null, new b0.a1(this, null, 19), 3);
    }

    @Override // y2.q
    public final void i(y2.k0 k0Var) {
        k0Var.a();
        i2.b bVar = k0Var.f56937a;
        if (this.R) {
            i2.d.U(k0Var, g2.x.c(g2.x.f28615b, 0.3f), 0L, bVar.d(), CropImageView.DEFAULT_ASPECT_RATIO, 122);
        } else if (this.S || this.T) {
            i2.d.U(k0Var, g2.x.c(g2.x.f28615b, 0.1f), 0L, bVar.d(), CropImageView.DEFAULT_ASPECT_RATIO, 122);
        }
    }
}
