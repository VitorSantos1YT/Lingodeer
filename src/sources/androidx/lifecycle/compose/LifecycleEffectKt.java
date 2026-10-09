package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import l1.b1;
import l1.b3;
import l1.i0;
import l1.j0;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleEffectKt {
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void LifecycleEventEffect(Lifecycle.Event event, LifecycleOwner lifecycleOwner, fz.a aVar, n nVar, int i11, int i12) {
        int i13;
        s sVar = (s) nVar;
        sVar.f0(-709389590);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.d(event.ordinal()) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && sVar.h(lifecycleOwner)) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(aVar) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i13 &= -113;
            }
            sVar.q();
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            b1 b1VarH = t.H(aVar, sVar);
            boolean zF = sVar.f(b1VarH) | ((i13 & 14) == 4) | sVar.h(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new aj.c(lifecycleOwner, event, b1VarH, 2);
                sVar.o0(objQ);
            }
            t.c(lifecycleOwner, (fz.c) objQ, sVar);
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(event, lifecycleOwner2, aVar, i11, i12, 0);
        }
    }

    private static final fz.a LifecycleEventEffect$lambda$0(b3 b3Var) {
        return (fz.a) b3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 LifecycleEventEffect$lambda$4$lambda$3(final LifecycleOwner lifecycleOwner, Lifecycle.Event event, b3 b3Var, j0 j0Var) {
        final g gVar = new g(0, event, b3Var);
        lifecycleOwner.getLifecycle().addObserver(gVar);
        return new i0() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // l1.i0
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(gVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleEventEffect$lambda$4$lambda$3$lambda$1(Lifecycle.Event event, b3 b3Var, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        if (event2 == event) {
            LifecycleEventEffect$lambda$0(b3Var).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleEventEffect$lambda$5(Lifecycle.Event event, LifecycleOwner lifecycleOwner, fz.a aVar, int i11, int i12, n nVar, int i13) {
        LifecycleEventEffect(event, lifecycleOwner, aVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    public static final void LifecycleResumeEffect(Object obj, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        int i13;
        s sVar = (s) nVar;
        sVar.f0(1220373486);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && sVar.h(lifecycleOwner)) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i13 &= -113;
            }
            sVar.q();
            boolean zF = sVar.f(obj) | sVar.f(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleResumeEffectImpl(lifecycleOwner, (LifecycleResumePauseEffectScope) objQ, cVar, sVar, (i13 & 896) | ((i13 >> 3) & 14));
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b(obj, lifecycleOwner2, cVar, i11, i12, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleResumeEffect$lambda$22(Object obj, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleResumeEffect(obj, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleResumeEffect$lambda$24(Object obj, Object obj2, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleResumeEffect(obj, obj2, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleResumeEffect$lambda$26(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleResumeEffect(obj, obj2, obj3, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleResumeEffect$lambda$28(Object[] objArr, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleResumeEffect(objArr, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleResumeEffect$lambda$29(LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleResumeEffect(lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    private static final void LifecycleResumeEffectImpl(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, fz.c cVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(912823238);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(lifecycleOwner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = sVar.h(lifecycleResumePauseEffectScope) | ((i12 & 896) == 256) | sVar.h(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zH || objQ == m.f39353a) {
                objQ = new aj.c(lifecycleOwner, lifecycleResumePauseEffectScope, cVar, 4);
                sVar.o0(objQ);
            }
            t.d(lifecycleOwner, lifecycleResumePauseEffectScope, (fz.c) objQ, sVar);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(lifecycleOwner, lifecycleResumePauseEffectScope, cVar, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 LifecycleResumeEffectImpl$lambda$34$lambda$33(final LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, fz.c cVar, j0 j0Var) {
        final y yVar = new y();
        final e eVar = new e(lifecycleResumePauseEffectScope, yVar, cVar, 1);
        lifecycleOwner.getLifecycle().addObserver(eVar);
        return new i0() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$34$lambda$33$$inlined$onDispose$1
            @Override // l1.i0
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(eVar);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) yVar.f38361a;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, y yVar, fz.c cVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 3) {
            yVar.f38361a = cVar.invoke(lifecycleResumePauseEffectScope);
        } else {
            if (i11 != 4) {
                return;
            }
            LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) yVar.f38361a;
            if (lifecyclePauseOrDisposeEffectResult != null) {
                lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
            }
            yVar.f38361a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleResumeEffectImpl$lambda$35(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, fz.c cVar, int i11, n nVar, int i12) {
        LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, cVar, nVar, t.M(i11 | 1));
        return b0.f48488a;
    }

    public static final void LifecycleStartEffect(Object obj, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        int i13;
        s sVar = (s) nVar;
        sVar.f0(-1408314671);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && sVar.h(lifecycleOwner)) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i13 &= -113;
            }
            sVar.q();
            boolean zF = sVar.f(obj) | sVar.f(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) objQ, cVar, sVar, (i13 & 896) | ((i13 >> 3) & 14));
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b(obj, lifecycleOwner2, cVar, i11, i12, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleStartEffect$lambda$11(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleStartEffect(obj, obj2, obj3, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleStartEffect$lambda$13(Object[] objArr, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleStartEffect(objArr, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleStartEffect$lambda$14(LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleStartEffect(lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleStartEffect$lambda$7(Object obj, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleStartEffect(obj, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleStartEffect$lambda$9(Object obj, Object obj2, LifecycleOwner lifecycleOwner, fz.c cVar, int i11, int i12, n nVar, int i13) {
        LifecycleStartEffect(obj, obj2, lifecycleOwner, cVar, nVar, t.M(i11 | 1), i12);
        return b0.f48488a;
    }

    private static final void LifecycleStartEffectImpl(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, fz.c cVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(228371534);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(lifecycleOwner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = sVar.h(lifecycleStartStopEffectScope) | ((i12 & 896) == 256) | sVar.h(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zH || objQ == m.f39353a) {
                objQ = new aj.c(lifecycleOwner, lifecycleStartStopEffectScope, cVar, 3);
                sVar.o0(objQ);
            }
            t.d(lifecycleOwner, lifecycleStartStopEffectScope, (fz.c) objQ, sVar);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(lifecycleOwner, lifecycleStartStopEffectScope, cVar, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 LifecycleStartEffectImpl$lambda$19$lambda$18(final LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, fz.c cVar, j0 j0Var) {
        final y yVar = new y();
        final e eVar = new e(lifecycleStartStopEffectScope, yVar, cVar, 0);
        lifecycleOwner.getLifecycle().addObserver(eVar);
        return new i0() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1
            @Override // l1.i0
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(eVar);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) yVar.f38361a;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, y yVar, fz.c cVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            yVar.f38361a = cVar.invoke(lifecycleStartStopEffectScope);
        } else {
            if (i11 != 2) {
                return;
            }
            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) yVar.f38361a;
            if (lifecycleStopOrDisposeEffectResult != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
            }
            yVar.f38361a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 LifecycleStartEffectImpl$lambda$20(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, fz.c cVar, int i11, n nVar, int i12) {
        LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, cVar, nVar, t.M(i11 | 1));
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    public static final void LifecycleResumeEffect(Object obj, Object obj2, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        int i13;
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        boolean zF;
        Object objQ;
        s sVar = (s) nVar;
        sVar.f0(752680142);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.h(obj2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= ((i12 & 4) == 0 && sVar.h(lifecycleOwner)) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            } else {
                if ((i12 & 4) != 0) {
                    lifecycleOwner3 = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    i13 &= -897;
                }
                sVar.q();
                zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(lifecycleOwner3);
                objQ = sVar.Q();
                if (!zF || objQ == m.f39353a) {
                    objQ = new LifecycleResumePauseEffectScope(lifecycleOwner3.getLifecycle());
                    sVar.o0(objQ);
                }
                LifecycleResumeEffectImpl(lifecycleOwner3, (LifecycleResumePauseEffectScope) objQ, cVar, sVar, ((i13 >> 3) & 896) | ((i13 >> 6) & 14));
                lifecycleOwner2 = lifecycleOwner3;
            }
            lifecycleOwner3 = lifecycleOwner;
            sVar.q();
            zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(lifecycleOwner3);
            objQ = sVar.Q();
            if (!zF) {
                objQ = new LifecycleResumePauseEffectScope(lifecycleOwner3.getLifecycle());
                sVar.o0(objQ);
            } else {
                objQ = new LifecycleResumePauseEffectScope(lifecycleOwner3.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleResumeEffectImpl(lifecycleOwner3, (LifecycleResumePauseEffectScope) objQ, cVar, sVar, ((i13 >> 3) & 896) | ((i13 >> 6) & 14));
            lifecycleOwner2 = lifecycleOwner3;
        } else {
            sVar.W();
            lifecycleOwner2 = lifecycleOwner;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(obj, obj2, lifecycleOwner2, cVar, i11, i12, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    public static final void LifecycleStartEffect(Object obj, Object obj2, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        int i13;
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        boolean zF;
        Object objQ;
        s sVar = (s) nVar;
        sVar.f0(696924721);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.h(obj2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= ((i12 & 4) == 0 && sVar.h(lifecycleOwner)) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
            } else {
                if ((i12 & 4) != 0) {
                    lifecycleOwner3 = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    i13 &= -897;
                }
                sVar.q();
                zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(lifecycleOwner3);
                objQ = sVar.Q();
                if (!zF || objQ == m.f39353a) {
                    objQ = new LifecycleStartStopEffectScope(lifecycleOwner3.getLifecycle());
                    sVar.o0(objQ);
                }
                LifecycleStartEffectImpl(lifecycleOwner3, (LifecycleStartStopEffectScope) objQ, cVar, sVar, ((i13 >> 3) & 896) | ((i13 >> 6) & 14));
                lifecycleOwner2 = lifecycleOwner3;
            }
            lifecycleOwner3 = lifecycleOwner;
            sVar.q();
            zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(lifecycleOwner3);
            objQ = sVar.Q();
            if (!zF) {
                objQ = new LifecycleStartStopEffectScope(lifecycleOwner3.getLifecycle());
                sVar.o0(objQ);
            } else {
                objQ = new LifecycleStartStopEffectScope(lifecycleOwner3.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleStartEffectImpl(lifecycleOwner3, (LifecycleStartStopEffectScope) objQ, cVar, sVar, ((i13 >> 3) & 896) | ((i13 >> 6) & 14));
            lifecycleOwner2 = lifecycleOwner3;
        } else {
            sVar.W();
            lifecycleOwner2 = lifecycleOwner;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(obj, obj2, lifecycleOwner2, cVar, i11, i12, 0);
        }
    }

    public static final void LifecycleResumeEffect(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        int i13;
        s sVar = (s) nVar;
        sVar.f0(-485941842);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.h(obj2) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(obj3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= ((i12 & 8) == 0 && sVar.h(lifecycleOwner)) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
            } else if ((i12 & 8) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i13 &= -7169;
            }
            sVar.q();
            boolean zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(obj3) | sVar.f(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleResumeEffectImpl(lifecycleOwner, (LifecycleResumePauseEffectScope) objQ, cVar, sVar, ((i13 >> 6) & 896) | ((i13 >> 9) & 14));
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(obj, obj2, obj3, lifecycleOwner2, cVar, i11, i12, 0);
        }
    }

    public static final void LifecycleStartEffect(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        int i13;
        s sVar = (s) nVar;
        sVar.f0(574812561);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (sVar.h(obj) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.h(obj2) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(obj3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= ((i12 & 8) == 0 && sVar.h(lifecycleOwner)) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
            } else if ((i12 & 8) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i13 &= -7169;
            }
            sVar.q();
            boolean zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(obj3) | sVar.f(lifecycleOwner);
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) objQ, cVar, sVar, ((i13 >> 6) & 896) | ((i13 >> 9) & 14));
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(obj, obj2, obj3, lifecycleOwner2, cVar, i11, i12, 1);
        }
    }

    public static final void LifecycleResumeEffect(Object[] objArr, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        s sVar = (s) nVar;
        sVar.f0(-781756895);
        int i13 = (i11 & 48) == 0 ? (((i12 & 2) == 0 && sVar.h(lifecycleOwner)) ? 32 : 16) | i11 : i11;
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(cVar) ? 256 : 128;
        }
        sVar.a0(350902322, Integer.valueOf(objArr.length));
        int i14 = i13 | (sVar.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i14 |= sVar.h(obj) ? 4 : 0;
        }
        sVar.p(false);
        if ((i14 & 14) == 0) {
            i14 |= 2;
        }
        if (sVar.T(i14 & 1, (i14 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i14 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i14 &= -113;
            }
            sVar.q();
            com.android.billingclient.api.m mVar = new com.android.billingclient.api.m(2);
            ArrayList arrayList = mVar.f7554a;
            mVar.h(objArr);
            arrayList.add(lifecycleOwner);
            boolean zF = false;
            for (Object obj2 : arrayList.toArray(new Object[arrayList.size()])) {
                zF |= sVar.f(obj2);
            }
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleResumeEffectImpl(lifecycleOwner, (LifecycleResumePauseEffectScope) objQ, cVar, sVar, (i14 & 896) | ((i14 >> 3) & 14));
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(objArr, lifecycleOwner2, cVar, i11, i12, 0);
        }
    }

    public static final void LifecycleStartEffect(Object[] objArr, LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        s sVar = (s) nVar;
        sVar.f0(-1510305724);
        int i13 = (i11 & 48) == 0 ? (((i12 & 2) == 0 && sVar.h(lifecycleOwner)) ? 32 : 16) | i11 : i11;
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.h(cVar) ? 256 : 128;
        }
        sVar.a0(295146869, Integer.valueOf(objArr.length));
        int i14 = i13 | (sVar.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i14 |= sVar.h(obj) ? 4 : 0;
        }
        sVar.p(false);
        if ((i14 & 14) == 0) {
            i14 |= 2;
        }
        if (sVar.T(i14 & 1, (i14 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
                if ((i12 & 2) != 0) {
                    i14 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                lifecycleOwner = (LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                i14 &= -113;
            }
            sVar.q();
            com.android.billingclient.api.m mVar = new com.android.billingclient.api.m(2);
            ArrayList arrayList = mVar.f7554a;
            mVar.h(objArr);
            arrayList.add(lifecycleOwner);
            boolean zF = false;
            for (Object obj2 : arrayList.toArray(new Object[arrayList.size()])) {
                zF |= sVar.f(obj2);
            }
            Object objQ = sVar.Q();
            if (zF || objQ == m.f39353a) {
                objQ = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                sVar.o0(objQ);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) objQ, cVar, sVar, (i14 & 896) | ((i14 >> 3) & 14));
        } else {
            sVar.W();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(objArr, lifecycleOwner2, cVar, i11, i12, 1);
        }
    }

    @qy.c
    public static final void LifecycleResumeEffect(LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        s sVar = (s) nVar;
        sVar.f0(-747476210);
        int i13 = i11 & 1;
        if (!sVar.T(i13, i13 != 0)) {
            sVar.W();
            x1 x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new c(lifecycleOwner, cVar, i11, i12, 1);
                return;
            }
            return;
        }
        sVar.Y();
        if (i13 != 0 && !sVar.C()) {
            sVar.W();
            int i14 = i12 & 1;
        } else if ((i12 & 1) != 0) {
        }
        sVar.q();
        throw new IllegalStateException(LifecycleResumeEffectNoParamError);
    }

    @qy.c
    public static final void LifecycleStartEffect(LifecycleOwner lifecycleOwner, fz.c cVar, n nVar, int i11, int i12) {
        s sVar = (s) nVar;
        sVar.f0(-50807951);
        int i13 = i11 & 1;
        if (!sVar.T(i13, i13 != 0)) {
            sVar.W();
            x1 x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new c(lifecycleOwner, cVar, i11, i12, 0);
                return;
            }
            return;
        }
        sVar.Y();
        if (i13 != 0 && !sVar.C()) {
            sVar.W();
            int i14 = i12 & 1;
        } else if ((i12 & 1) != 0) {
        }
        sVar.q();
        throw new IllegalStateException(LifecycleStartEffectNoParamError);
    }
}
