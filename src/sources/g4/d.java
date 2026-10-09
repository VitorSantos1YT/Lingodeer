package g4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f28743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j4.b f28744h;

    @Override // g4.g
    public final void d(j4.b bVar) {
        this.f28744h = bVar;
    }

    @Override // g4.g
    public final void e(View view, float f5) {
        float[] fArr = this.f28743g;
        fArr[0] = a(f5);
        ve.i.G(this.f28744h, view, fArr);
    }
}
