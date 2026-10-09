package r;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends v5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f48572a;

    public h2(SwitchCompat switchCompat) {
        this.f48572a = new WeakReference(switchCompat);
    }

    @Override // v5.g
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f48572a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // v5.g
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f48572a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
