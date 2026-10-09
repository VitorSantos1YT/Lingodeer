package app.rive.runtime.kotlin.renderers;

import kotlin.jvm.internal.j;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class RiveArtboardRenderer$1$1 extends j implements fz.a {
    public RiveArtboardRenderer$1$1(Object obj) {
        super(0, 0, RiveArtboardRenderer.class, obj, "start", "start()V");
    }

    @Override // fz.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m202invoke();
        return b0.f48488a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m202invoke() {
        ((RiveArtboardRenderer) this.receiver).start();
    }
}
