package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.e1;
import br.b;
import fz.c;
import g.j;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import qx.p;
import z2.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PermissionStateKt {
    public static final PermissionState a(n nVar) {
        PermissionState previewPermissionState;
        s sVar = (s) nVar;
        sVar.d0(923020361);
        sVar.d0(1537041123);
        Object objQ = sVar.Q();
        g gVar = m.f39353a;
        if (objQ == gVar) {
            objQ = new b(27);
            sVar.o0(objQ);
        }
        c cVar = (c) objQ;
        sVar.p(false);
        PermissionStatus.Granted granted = PermissionStatus.Granted.f7791a;
        sVar.d0(-1732095526);
        if (((Boolean) sVar.j(t1.f58672a)).booleanValue()) {
            previewPermissionState = new PreviewPermissionState(granted);
        } else {
            sVar.d0(1424240517);
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            sVar.d0(1134374053);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                kotlin.jvm.internal.m.f(context, "<this>");
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        throw new IllegalStateException("Permissions should be called in the context of an Activity");
                    }
                    if (baseContext instanceof Activity) {
                        objQ2 = new MutablePermissionState(context, (Activity) baseContext);
                        sVar.o0(objQ2);
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            MutablePermissionState mutablePermissionState = (MutablePermissionState) objQ2;
            sVar.p(false);
            PermissionsUtilKt.a(mutablePermissionState, null, sVar, 0);
            e1 e1Var = new e1(3);
            sVar.d0(1134386901);
            boolean zF = sVar.f(mutablePermissionState) | sVar.f(cVar);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                objQ3 = new a(0, mutablePermissionState, cVar);
                sVar.o0(objQ3);
            }
            sVar.p(false);
            j jVarB = p.B(e1Var, (c) objQ3, sVar);
            sVar.d0(1134391322);
            boolean zF2 = sVar.f(mutablePermissionState) | sVar.h(jVarB);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                objQ4 = new a(1, mutablePermissionState, jVarB);
                sVar.o0(objQ4);
            }
            sVar.p(false);
            t.d(mutablePermissionState, jVarB, (c) objQ4, sVar);
            sVar.p(false);
            previewPermissionState = mutablePermissionState;
        }
        sVar.p(false);
        sVar.p(false);
        return previewPermissionState;
    }
}
