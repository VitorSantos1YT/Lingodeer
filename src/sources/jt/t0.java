package jt;

import android.view.View;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.Service;
import com.google.logging.type.LogSeverity;
import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37182a;

    public /* synthetic */ t0(int i11) {
        this.f37182a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f37182a;
        int i12 = 2;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                k2 it = (k2) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Integer.valueOf(-it.f37014d);
            case 1:
                j2 it2 = (j2) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return Integer.valueOf(it2.f36999a);
            case 2:
                j2 it3 = (j2) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                int i13 = u0.f37202a[it3.f37000b.ordinal()];
                if (i13 == 1) {
                    i12 = 0;
                } else if (i13 == 2) {
                    i12 = 1;
                } else if (i13 != 3) {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = 3;
                }
                return Integer.valueOf(i12);
            case 3:
                return ((CourseWord) obj).getWord();
            case 4:
                return ((CourseWord) obj).getWord();
            case 5:
                x10.a module = (x10.a) obj;
                kotlin.jvm.internal.m.f(module, "$this$module");
                ah.h hVar = new ah.h(13);
                u10.b bVar = u10.b.Singleton;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(kv.r0.class);
                b20.b bVar2 = c20.b.f6511e;
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar2, eVarA, hVar, bVar), module)), null);
                md.a.s(new u10.c(module, defpackage.e.x(new u10.a(bVar2, kotlin.jvm.internal.z.a(lv.b.class), new ah.h(14), bVar), module)), null);
                ah.h hVar2 = new ah.h(15);
                u10.b bVar3 = u10.b.Factory;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(mv.g0.class), hVar2, bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, kotlin.jvm.internal.z.a(mv.n.class), new ah.h(16), bVar3), module)), null);
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(mv.y.class), new j3.j0(28), bVar3)));
                module.a(new v10.a(new u10.a(bVar2, kotlin.jvm.internal.z.a(mv.k0.class), new j3.j0(29), bVar3)));
                return b0Var;
            case 6:
                return new k9.a(SavedStateHandleSupport.createSavedStateHandle((CreationExtras) obj));
            case 7:
                j9.q qVar = ((j9.e) ((a0.y) obj).c()).f36188b;
                kotlin.jvm.internal.m.d(qVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i14 = j9.q.f36240e;
                for (j9.q qVar2 : cf.x.o((k9.h) qVar)) {
                }
                return null;
            case 8:
                return a0.f1.e(b0.e.r(LogSeverity.ALERT_VALUE, 0, null, 6), 2);
            case 9:
                return a0.f1.f(b0.e.r(LogSeverity.ALERT_VALUE, 0, null, 6), 2);
            case 10:
                return ((j9.e) obj).f36192f;
            case 11:
                lc.d it4 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                it4.dismiss();
                return b0Var;
            case 12:
                lc.d it5 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                it5.dismiss();
                return b0Var;
            case 13:
                String text = (String) obj;
                kotlin.jvm.internal.m.f(text, "text");
                lz.g gVarD0 = oz.q.D0(text);
                ArrayList arrayList = new ArrayList();
                Iterator it6 = gVarD0.iterator();
                while (((lz.f) it6).hasNext()) {
                    Object next = ((ry.w) it6).next();
                    if (text.charAt(((Number) next).intValue()) == 12387) {
                        arrayList.add(next);
                    }
                }
                return ry.m.f1(arrayList);
            case 14:
                String text2 = (String) obj;
                kotlin.jvm.internal.m.f(text2, "text");
                lz.g gVarD1 = oz.q.D0(text2);
                ArrayList arrayList2 = new ArrayList();
                Iterator it7 = gVarD1.iterator();
                while (((lz.f) it7).hasNext()) {
                    Object next2 = ((ry.w) it7).next();
                    if (text2.charAt(((Number) next2).intValue()) == 12435) {
                        arrayList2.add(next2);
                    }
                }
                return ry.m.f1(arrayList2);
            case 15:
                String text3 = (String) obj;
                kotlin.jvm.internal.m.f(text3, "text");
                lz.g gVarD2 = oz.q.D0(text3);
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = gVarD2.iterator();
                while (((lz.f) it8).hasNext()) {
                    Object next3 = ((ry.w) it8).next();
                    int iIntValue = ((Number) next3).intValue();
                    if (iIntValue != 0 && text3.charAt(iIntValue) == 'n') {
                        arrayList3.add(next3);
                    }
                }
                return ry.m.f1(arrayList3);
            case 16:
                if (obj != null) {
                    throw new ClassCastException();
                }
                kotlin.jvm.internal.m.f(null, "it");
                throw null;
            case 17:
                return ((CourseWord) obj).getWord();
            case 18:
                kotlin.jvm.internal.m.f((String) obj, "it");
                return b0Var;
            case 19:
                kv.j it9 = (kv.j) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                return it9.f38757a;
            case 20:
                kv.x it10 = (kv.x) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                kv.e0 e0Var = it10.f38830a;
                return w4.c.h(e0Var.f38729a, " ", e0Var.f38730b, " → ", it10.f38831b.f38730b);
            case 21:
                kv.x it11 = (kv.x) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                kv.e0 e0Var2 = it11.f38830a;
                String str = e0Var2.f38729a;
                kv.e0 e0Var3 = it11.f38831b;
                String str2 = e0Var3.f38729a;
                String strD = e0Var3.f38730b;
                if (!kotlin.jvm.internal.m.a(str, str2)) {
                    strD = ep.a.D(e0Var3.f38729a, " ", strD);
                }
                return w4.c.h(e0Var2.f38729a, " ", e0Var2.f38730b, " → ", strD);
            case 22:
                kv.j0 it12 = (kv.j0) obj;
                kotlin.jvm.internal.m.f(it12, "it");
                List list = it12.f38765f;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list) {
                    if (((kv.l0) obj2).f38777a == kv.m0.M6) {
                        arrayList4.add(obj2);
                    }
                }
                if (arrayList4.isEmpty()) {
                    arrayList4 = new ArrayList();
                    for (Object obj3 : list) {
                        if (((kv.l0) obj3).f38778b.length() == 1) {
                            arrayList4.add(obj3);
                        }
                    }
                }
                return ry.m.g0(arrayList4);
            case 23:
                kv.l0 it13 = (kv.l0) obj;
                kotlin.jvm.internal.m.f(it13, "it");
                return it13.f38778b;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj).getClass();
                return null;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                List list2 = (List) obj;
                return new l0.w(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return b0Var;
            case 27:
                w2.l1 l1Var = ((l1.d1) obj).f39255a;
                if (l1Var != null) {
                    l1Var.invoke();
                }
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                kotlin.jvm.internal.m.f((View) obj, "it");
                return b0Var;
            default:
                kotlin.jvm.internal.m.f((com.android.billingclient.api.d) obj, "it");
                return b0Var;
        }
    }

    public /* synthetic */ t0(int i11, l0.o oVar) {
        this.f37182a = 26;
    }
}
