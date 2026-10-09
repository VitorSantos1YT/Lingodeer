package app.rive;

import fz.c;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIKt$RiveUI$7$2$deltaTimeNs$1 extends n implements c {
    final /* synthetic */ x $lastFrameTimeNs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIKt$RiveUI$7$2$deltaTimeNs$1(x xVar) {
        super(1);
        this.$lastFrameTimeNs = xVar;
    }

    @Override // fz.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final Long invoke(long j11) {
        long j12 = this.$lastFrameTimeNs.f38360a;
        Long lValueOf = Long.valueOf(j12 != 0 ? j11 - j12 : 0L);
        this.$lastFrameTimeNs.f38360a = j11;
        return lValueOf;
    }
}
