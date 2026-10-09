package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import b2.h;
import com.lingodeer.R;
import e3.d;
import fz.c;
import fz.e;
import h1.y4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l1.c3;
import l1.d0;
import l1.g;
import l1.m;
import l1.s;
import l1.t;
import l1.v1;
import l1.w1;
import l1.x1;
import n2.a;
import n2.b;
import qy.b0;
import w1.f;
import y.p0;
import z2.b2;
import z2.g1;
import z2.h0;
import z2.i0;
import z2.j0;
import z2.j1;
import z2.k;
import z2.k1;
import z2.n;
import z2.n1;
import z2.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f1199a = new d0(h0.f58570b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c3 f1200b = new c3(h0.f58572c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f1201c = new d0(n.f58628d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c3 f1202d = new c3(h0.f58574d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c3 f1203e = new c3(h0.f58576e);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c3 f1204f = new c3(h0.f58578f);

    public static final void a(AndroidComposeView androidComposeView, e eVar, l1.n nVar, int i11) {
        LinkedHashMap linkedHashMap;
        boolean z11;
        s sVar = (s) nVar;
        sVar.f0(-520299287);
        int i12 = (sVar.h(androidComposeView) ? 4 : 2) | i11 | (sVar.h(eVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = new r0(context);
                sVar.o0(objQ);
            }
            r0 r0Var = (r0) objQ;
            k viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            da.g gVar2 = viewTreeOwners.f58596b;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                Object parent = androidComposeView.getParent();
                kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = w1.e.class.getSimpleName() + ':' + strValueOf;
                da.e savedStateRegistry = gVar2.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        kotlin.jvm.internal.m.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                n nVar2 = n.f58629e;
                c3 c3Var = w1.g.f54465a;
                f fVar = new f(linkedHashMap, nVar2);
                try {
                    savedStateRegistry.c(str, new f.e(fVar, 2));
                    z11 = true;
                } catch (IllegalArgumentException unused) {
                    z11 = false;
                }
                j1 j1Var = new j1(fVar, new k1(z11, savedStateRegistry, str));
                sVar.o0(j1Var);
                objQ2 = j1Var;
            }
            j1 j1Var2 = (j1) objQ2;
            boolean zH = sVar.h(j1Var2);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new p0(j1Var2, 10);
                sVar.o0(objQ3);
            }
            t.c(b0.f48488a, (c) objQ3, sVar);
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = n1.a(context) ? new b(androidComposeView.getView(), 1) : new b2();
                sVar.o0(objQ4);
            }
            a aVar = (a) objQ4;
            Configuration configuration = androidComposeView.getConfiguration();
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = new e3.c();
                sVar.o0(objQ5);
            }
            e3.c cVar = (e3.c) objQ5;
            Object objQ6 = sVar.Q();
            Object obj = objQ6;
            if (objQ6 == gVar) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                sVar.o0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = new i0(configuration3, cVar);
                sVar.o0(objQ7);
            }
            i0 i0Var = (i0) objQ7;
            boolean zH2 = sVar.h(context);
            Object objQ8 = sVar.Q();
            if (zH2 || objQ8 == gVar) {
                objQ8 = new a0.e(27, context, i0Var);
                sVar.o0(objQ8);
            }
            t.c(cVar, (c) objQ8, sVar);
            Object objQ9 = sVar.Q();
            if (objQ9 == gVar) {
                objQ9 = new d();
                sVar.o0(objQ9);
            }
            d dVar = (d) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == gVar) {
                objQ10 = new j0(dVar);
                sVar.o0(objQ10);
            }
            j0 j0Var = (j0) objQ10;
            boolean zH3 = sVar.h(context);
            Object objQ11 = sVar.Q();
            if (zH3 || objQ11 == gVar) {
                objQ11 = new a0.e(28, context, j0Var);
                sVar.o0(objQ11);
            }
            t.c(dVar, (c) objQ11, sVar);
            d0 d0Var = g1.f58560v;
            t.b(new w1[]{f1199a.a(androidComposeView.getConfiguration()), f1200b.a(context), LocalLifecycleOwnerKt.getLocalLifecycleOwner().a(viewTreeOwners.f58595a), ea.a.f25454a.a(gVar2), w1.g.f54465a.a(j1Var2), f1204f.a(androidComposeView.getView()), f1202d.a(cVar), f1203e.a(dVar), d0Var.a(Boolean.valueOf(((Boolean) sVar.j(d0Var)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui())), g1.f58551l.a(aVar)}, t1.e.d(1059770793, new y4(androidComposeView, r0Var, eVar, 4), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(androidComposeView, i11, 12, eVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final v1 getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.getLocalLifecycleOwner();
    }
}
