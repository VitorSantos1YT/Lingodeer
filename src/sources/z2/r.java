package z2;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58658a;

    public r(AndroidComposeView androidComposeView) {
        this.f58658a = androidComposeView;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new j(this.f58658a);
    }

    public final int hashCode() {
        return this.f58658a.hashCode();
    }

    @Override // y2.d1
    public final /* bridge */ /* synthetic */ void j(z1.q qVar) {
    }
}
