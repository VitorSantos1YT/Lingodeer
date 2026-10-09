package zs;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import xu.s1;
import z3.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f59370a = new t1.d(new ys.b(5, 0), false, -470693590);

    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 l1.s, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void a(c uiState, fz.a onDismiss, fz.c onDescriptionChange, fz.c onAcceptAnswerCheckedChange, fz.c onOtherIssueCheckedChange, fz.a onToggleFullScreenImage, fz.a onSend, n nVar, int i11) {
        boolean z11;
        m.f(uiState, "uiState");
        m.f(onDismiss, "onDismiss");
        m.f(onDescriptionChange, "onDescriptionChange");
        m.f(onAcceptAnswerCheckedChange, "onAcceptAnswerCheckedChange");
        m.f(onOtherIssueCheckedChange, "onOtherIssueCheckedChange");
        m.f(onToggleFullScreenImage, "onToggleFullScreenImage");
        m.f(onSend, "onSend");
        s sVar = (s) nVar;
        sVar.f0(242038445);
        int i12 = (sVar.h(uiState) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onDismiss) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onDescriptionChange) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onAcceptAnswerCheckedChange) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onOtherIssueCheckedChange) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(onToggleFullScreenImage) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(onSend) ? 1048576 : 524288;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 599187) != 599186)) {
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Boolean boolValueOf = Boolean.valueOf(uiState.f59353i);
            boolean zH = ((i13 & 112) == 32) | sVar.h(uiState);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new nu.b(25, uiState, onDismiss, null);
                sVar.o0(objQ);
            }
            t.f((fz.e) objQ, boolValueOf, sVar);
            if (!uiState.f59347c || uiState.f59346b == null) {
                z11 = true;
                sVar.d0(-685007979);
            } else {
                sVar.d0(-682182019);
                z11 = true;
                androidx.compose.ui.window.a.a(onToggleFullScreenImage, new r(true, true, false), t1.e.d(-2070487969, new s1(onToggleFullScreenImage, uiState, context, 4), sVar), sVar, ((i13 >> 15) & 14) | 432, 0);
            }
            sVar.p(r10);
            androidx.compose.ui.window.a.a(onDismiss, new r(z11, false, r10), t1.e.d(-1844304892, new b(0, onSend, onDismiss, onToggleFullScreenImage, onAcceptAnswerCheckedChange, onOtherIssueCheckedChange, onDescriptionChange, uiState), sVar), sVar, ((i13 >> 3) & 14) | 432, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.e(i11, onDismiss, onToggleFullScreenImage, onSend, onDescriptionChange, onAcceptAnswerCheckedChange, onOtherIssueCheckedChange, uiState);
        }
    }
}
