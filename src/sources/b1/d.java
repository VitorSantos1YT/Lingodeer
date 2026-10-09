package b1;

import g2.k0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f3772a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar) {
        super(1, kotlin.jvm.internal.l.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f3772a = rVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        float[] fArr = ((k0) obj).f28579a;
        w2.x xVar = (w2.x) this.f3772a.T.getValue();
        if (xVar != null) {
            if (!xVar.k()) {
                xVar = null;
            }
            if (xVar != null) {
                xVar.l(fArr);
            }
        }
        return b0.f48488a;
    }
}
