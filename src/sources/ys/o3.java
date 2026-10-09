package ys;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import rt.tf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o3 {
    public static final void a(fz.c cVar, tf tfVar, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        fz.e eVar;
        tf tfVar2;
        tf tfVar3;
        int i13;
        Object qVar;
        LifecycleOwner lifecycleOwner;
        fz.c onTimeUpdate = cVar;
        kotlin.jvm.internal.m.f(onTimeUpdate, "onTimeUpdate");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2096870466);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(onTimeUpdate) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i14 = i12 | 16;
        if (sVar.T(i14 & 1, (i14 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(tf.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                tfVar3 = (tf) viewModelA;
                i13 = i14 & (-113);
            } else {
                sVar.W();
                i13 = i14 & (-113);
                tfVar3 = tfVar;
            }
            sVar.q();
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new l1.i1(0L);
                sVar.o0(objQ);
            }
            l1.i1 i1Var = (l1.i1) objQ;
            LifecycleOwner lifecycleOwner2 = ProcessLifecycleOwner.Companion.get();
            boolean zH = sVar.h(tfVar3) | ((i13 & 14) == 4) | sVar.h(lifecycleOwner2);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                tfVar2 = tfVar3;
                qVar = new xu.q(lifecycleOwner2, tfVar2, onTimeUpdate, i1Var, 3);
                lifecycleOwner = lifecycleOwner2;
                onTimeUpdate = onTimeUpdate;
                sVar.o0(qVar);
            } else {
                qVar = objQ2;
                tfVar2 = tfVar3;
                lifecycleOwner = lifecycleOwner2;
            }
            l1.t.d(lifecycleOwner, onTimeUpdate, (fz.c) qVar, sVar);
            eVar = dVar;
            eVar.invoke(sVar, 6);
        } else {
            eVar = dVar;
            sVar.W();
            tfVar2 = tfVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new qg.d(onTimeUpdate, tfVar2, eVar, i11, 9);
        }
    }
}
