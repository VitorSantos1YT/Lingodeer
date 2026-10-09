package com.lingo.course.ui;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import at.f;
import at.h;
import au.d1;
import ch.m;
import ep.a;
import fz.c;
import fz.e;
import i20.b;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.g;
import l1.n;
import l1.s;
import l1.x1;
import mt.f6;
import qy.q;
import rt.m8;
import rt.x8;
import xg.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseReviewListActivity extends d {
    public static final /* synthetic */ int L = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f21614t = com.bumptech.glide.d.v(new m(this, 0));
    public final q H = com.bumptech.glide.d.v(new m(this, 1));
    public final q K = com.bumptech.glide.d.v(new m(this, 2));

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
    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1748299609);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = a.s(p() && !q(), sVar);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new m(this, 3);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            sVar.d0(-1614864554);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelA = b.a(z.a(m8.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
            sVar.p(false);
            m8 m8Var = (m8) viewModelA;
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            q qVar = this.f21614t;
            if (zBooleanValue) {
                sVar.d0(1475100802);
                x8 x8Var = (x8) qVar.getValue();
                boolean zH2 = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new m(this, 4);
                    sVar.o0(objQ3);
                }
                fz.a aVar2 = (fz.a) objQ3;
                boolean zH3 = sVar.h(m8Var);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new d1(26, m8Var, b1Var);
                    sVar.o0(objQ4);
                }
                mt.g.r(x8Var, null, aVar2, (c) objQ4, sVar, 0);
                sVar.p(false);
            } else {
                sVar.d0(1475525688);
                x8 x8Var2 = (x8) qVar.getValue();
                boolean zP = p();
                boolean zQ = q();
                boolean zH4 = sVar.h(this);
                Object objQ5 = sVar.Q();
                if (zH4 || objQ5 == gVar) {
                    objQ5 = new f(19, this, b1Var);
                    sVar.o0(objQ5);
                }
                fz.a aVar3 = (fz.a) objQ5;
                boolean zH5 = sVar.h(this);
                Object objQ6 = sVar.Q();
                if (zH5 || objQ6 == gVar) {
                    objQ6 = new androidx.lifecycle.viewmodel.compose.a(this, 28);
                    sVar.o0(objQ6);
                }
                e eVar = (e) objQ6;
                boolean zH6 = sVar.h(this);
                Object objQ7 = sVar.Q();
                if (zH6 || objQ7 == gVar) {
                    objQ7 = new m(this, 5);
                    sVar.o0(objQ7);
                }
                f6.e(x8Var2, zP, zQ, m8Var, aVar3, eVar, (fz.a) objQ7, sVar, 4096);
                sVar = sVar;
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 27, bundle);
        }
    }

    public final boolean p() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }
}
