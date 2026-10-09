package app.rive;

import app.rive.core.RiveSurface;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.b1;
import l1.i0;
import l1.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIKt$RiveUI$4$1 extends n implements c {
    final /* synthetic */ b1 $surface$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIKt$RiveUI$4$1(b1 b1Var) {
        super(1);
        this.$surface$delegate = b1Var;
    }

    @Override // fz.c
    public final i0 invoke(j0 DisposableEffect) {
        m.f(DisposableEffect, "$this$DisposableEffect");
        final RiveSurface riveSurfaceRiveUI$lambda$6 = RiveUIKt.RiveUI$lambda$6(this.$surface$delegate);
        return riveSurfaceRiveUI$lambda$6 == null ? new i0() { // from class: app.rive.RiveUIKt$RiveUI$4$1$invoke$$inlined$onDispose$1
            @Override // l1.i0
            public void dispose() {
            }
        } : new i0() { // from class: app.rive.RiveUIKt$RiveUI$4$1$invoke$$inlined$onDispose$2
            @Override // l1.i0
            public void dispose() {
                RiveLog.INSTANCE.getLogger().d(RiveUIKt.SURFACE_TAG, RiveUIKt$RiveUI$4$1$1$1.INSTANCE);
                riveSurfaceRiveUI$lambda$6.dispose();
            }
        };
    }
}
