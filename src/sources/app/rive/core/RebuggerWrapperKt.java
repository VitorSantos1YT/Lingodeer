package app.rive.core;

import fz.e;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RebuggerWrapperKt {

    /* JADX INFO: renamed from: app.rive.core.RebuggerWrapperKt$RebuggerWrapper$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass1 extends n implements e {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Map<String, Object> $trackMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, ? extends Object> map, int i11) {
            super(2);
            this.$trackMap = map;
            this.$$changed = i11;
        }

        @Override // fz.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((l1.n) obj, ((Number) obj2).intValue());
            return b0.f48488a;
        }

        public final void invoke(l1.n nVar, int i11) {
            RebuggerWrapperKt.RebuggerWrapper(this.$trackMap, nVar, t.M(this.$$changed | 1));
        }
    }

    public static final void RebuggerWrapper(Map<String, ? extends Object> trackMap, l1.n nVar, int i11) {
        m.f(trackMap, "trackMap");
        s sVar = (s) nVar;
        sVar.f0(-1289810294);
        if ((i11 & 1) == 0 && sVar.F()) {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new AnonymousClass1(trackMap, i11);
        }
    }
}
