package com.google.accompanist.permissions;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import ch.z;
import fz.c;
import kotlin.jvm.internal.m;
import l1.g;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PermissionsUtilKt {
    public static final void a(MutablePermissionState permissionState, Lifecycle.Event event, n nVar, int i11) {
        m.f(permissionState, "permissionState");
        s sVar = (s) nVar;
        sVar.f0(-1770945943);
        int i12 = (sVar.f(permissionState) ? 4 : 2) | i11 | 48;
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            event = Lifecycle.Event.ON_RESUME;
            sVar.d0(-2101357749);
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new androidx.lifecycle.compose.g(2, event, permissionState);
                sVar.o0(objQ);
            }
            LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objQ;
            sVar.p(false);
            Lifecycle lifecycle = ((LifecycleOwner) sVar.j(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            sVar.d0(-2101338711);
            boolean zH = sVar.h(lifecycle) | sVar.h(lifecycleEventObserver);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new a(2, lifecycle, lifecycleEventObserver);
                sVar.o0(objQ2);
            }
            sVar.p(false);
            t.d(lifecycle, lifecycleEventObserver, (c) objQ2, sVar);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(permissionState, i11, 5, event);
        }
    }

    public static final boolean b(PermissionStatus permissionStatus) {
        m.f(permissionStatus, "<this>");
        return permissionStatus.equals(PermissionStatus.Granted.f7791a);
    }
}
