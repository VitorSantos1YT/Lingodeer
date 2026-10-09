package d0;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class v1 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f22816a;

    public v1(Magnifier magnifier) {
        this.f22816a = magnifier;
    }

    @Override // d0.t1
    public void a(long j11, long j12) {
        this.f22816a.show(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public final void b() {
        this.f22816a.dismiss();
    }

    public final long c() {
        return (((long) this.f22816a.getHeight()) & 4294967295L) | (((long) this.f22816a.getWidth()) << 32);
    }

    public final void d() {
        this.f22816a.update();
    }
}
