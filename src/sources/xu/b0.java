package xu;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b0 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(mu.x xVar, fz.a loginNow, l1.n nVar, int i11) {
        mu.x xVar2;
        int i12;
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1710502453);
        int i13 = i11 | 2 | (sVar.h(loginNow) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mu.x.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-15);
                xVar2 = (mu.x) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-15);
                xVar2 = xVar;
            }
            sVar.q();
            f.n nVar2 = (f.n) sVar.j(ju.f.f37369c);
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(xVar2.T, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            if (((Boolean) FlowExtKt.collectAsStateWithLifecycle(xVar2.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7).getValue()).booleanValue()) {
                sVar.d0(-2086232392);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(-2087024969);
            }
            sVar.p(false);
            mu.l lVar = (mu.l) b3VarCollectAsStateWithLifecycle.getValue();
            boolean zH = sVar.h(xVar2) | sVar.h(nVar2) | ((i12 & 112) == 32);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new ch.i(xVar2, nVar2, loginNow, 2);
                sVar.o0(objQ);
            }
            fz.c cVar = (fz.c) objQ;
            boolean zH2 = sVar.h(xVar2);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new mu.m(xVar2, 4);
                sVar.o0(objQ2);
            }
            ku.a.e(lVar, cVar, (fz.a) objQ2, sVar, 0);
        } else {
            sVar.W();
            xVar2 = xVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.y(xVar2, i11, 24, loginNow);
        }
    }
}
