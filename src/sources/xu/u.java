package xu;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.yalantis.ucrop.view.CropImageView;
import h1.a6;
import l1.b3;
import mt.k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    /* JADX WARN: Failed to calculate best type for var: r1v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v11 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r1v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v12 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r2v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v6 ??, new type: long
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
    /* JADX WARN: Failed to calculate best type for var: r2v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: long
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v11 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void a(hu.j r20, fz.a r21, fz.a r22, fz.a r23, fz.a r24, l1.n r25, int r26) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu.u.a(hu.j, fz.a, fz.a, fz.a, fz.a, l1.n, int):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(hu.k kVar, mu.x xVar, fz.a loginNow, l1.n nVar, int i11) {
        hu.k kVar2;
        mu.x xVar2;
        mu.x xVar3;
        int i12;
        final hu.k kVar3;
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(893998131);
        int i13 = i11 | 18 | (sVar.h(loginNow) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i14 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar, i14);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(hu.k.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                hu.k kVar4 = (hu.k) viewModelA;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar, i14);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(mu.x.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
                sVar.p(false);
                xVar3 = (mu.x) viewModelA2;
                i12 = i13 & (-127);
                kVar3 = kVar4;
            } else {
                sVar.W();
                xVar3 = xVar;
                i12 = i13 & (-127);
                kVar3 = kVar;
            }
            sVar.q();
            f.n nVar2 = (f.n) sVar.j(ju.f.f37369c);
            l1.b1 b1VarO = l1.t.o(kVar3.f33795e, sVar);
            l1.b1 b1VarO2 = l1.t.o(xVar3.T, sVar);
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(xVar3.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            b3 b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(xVar3.N, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            if (((Boolean) b3VarCollectAsStateWithLifecycle.getValue()).booleanValue()) {
                sVar.d0(6741072);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(3692687);
            }
            sVar.p(false);
            int length = ((String) b3VarCollectAsStateWithLifecycle2.getValue()).length();
            l1.g gVar = l1.m.f39353a;
            if (length > 0) {
                sVar.d0(6822044);
                String str = (String) b3VarCollectAsStateWithLifecycle2.getValue();
                boolean zH = sVar.h(xVar3);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new mu.m(xVar3, 1);
                    sVar.o0(objQ);
                }
                c(str, (fz.a) objQ, sVar, 0);
            } else {
                sVar.d0(3692687);
            }
            sVar.p(false);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            mu.l lVar = (mu.l) b1VarO2.getValue();
            boolean zH2 = sVar.h(xVar3) | sVar.h(nVar2) | ((i12 & 896) == 256);
            Object objQ4 = sVar.Q();
            if (zH2 || objQ4 == gVar) {
                objQ4 = new ch.i(xVar3, nVar2, loginNow, 1);
                sVar.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean zH3 = sVar.h(xVar3);
            Object objQ5 = sVar.Q();
            if (zH3 || objQ5 == gVar) {
                objQ5 = new mu.m(xVar3, 2);
                sVar.o0(objQ5);
            }
            ku.a.f(b1Var, b1Var2, lVar, cVar, (fz.a) objQ5, sVar, 54);
            hu.j jVar = (hu.j) b1VarO.getValue();
            boolean zH4 = sVar.h(kVar3);
            Object objQ6 = sVar.Q();
            if (zH4 || objQ6 == gVar) {
                final int i15 = 0;
                objQ6 = new fz.a() { // from class: xu.t
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                kVar3.a(hu.f.f33785a);
                                break;
                            default:
                                kVar3.a(hu.e.f33784a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ6);
            }
            fz.a aVar = (fz.a) objQ6;
            boolean zH5 = sVar.h(kVar3);
            Object objQ7 = sVar.Q();
            if (zH5 || objQ7 == gVar) {
                final int i16 = 1;
                objQ7 = new fz.a() { // from class: xu.t
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                kVar3.a(hu.f.f33785a);
                                break;
                            default:
                                kVar3.a(hu.e.f33784a);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ7);
            }
            fz.a aVar2 = (fz.a) objQ7;
            Object objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = new m(9, b1Var);
                sVar.o0(objQ8);
            }
            fz.a aVar3 = (fz.a) objQ8;
            boolean zH6 = sVar.h(xVar3);
            Object objQ9 = sVar.Q();
            if (zH6 || objQ9 == gVar) {
                objQ9 = new mu.m(xVar3, 3);
                sVar.o0(objQ9);
            }
            a(jVar, aVar, aVar2, aVar3, (fz.a) objQ9, sVar, 3072);
            sVar = sVar;
            xVar2 = xVar3;
            kVar2 = kVar3;
        } else {
            sVar.W();
            kVar2 = kVar;
            xVar2 = xVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(kVar2, xVar2, false, loginNow, i11, 26);
        }
    }

    public static final void c(String date, fz.a onDismissRequest, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(date, "date");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1858250773);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(date) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onDismissRequest) ? 32 : 16;
        }
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            a6.a(onDismissRequest, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-1617995448, new dl.h(onDismissRequest, date, 5), sVar2), sVar, (i12 >> 3) & 14, 384, 4094);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new tv.i(date, onDismissRequest, i11);
        }
    }
}
