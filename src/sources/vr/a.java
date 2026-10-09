package vr;

import a0.f1;
import a0.l1;
import a0.m1;
import a0.o;
import a0.p0;
import a0.y;
import android.content.Context;
import com.google.api.Service;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.Bookmark;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.k1;
import l1.v2;
import m0.t;
import o3.w;
import oz.x;
import qp.o2;
import qy.b0;
import sy.k;
import wu.j;
import wu.k0;
import wu.v;
import x1.n;
import yr.l;
import zr.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54124a;

    public /* synthetic */ a(int i11) {
        this.f54124a = i11;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = 3;
        Object objInvoke = null;
        boolean z11 = false;
        int i12 = 1;
        switch (this.f54124a) {
            case 0:
                y AnimatedContent = (y) obj;
                m.f(AnimatedContent, "$this$AnimatedContent");
                l1 l1VarE = f1.e(null, 3);
                m1 m1VarF = f1.f(null, 3);
                int i13 = o.f152b;
                return new p0(l1VarE, m1VarF);
            case 1:
                s0.p0 KeyboardActions = (s0.p0) obj;
                m.f(KeyboardActions, "$this$KeyboardActions");
                return b0.f48488a;
            case 2:
                x10.a module = (x10.a) obj;
                m.f(module, "$this$module");
                os.b bVar = new os.b(19);
                b20.b bVar2 = c20.b.f6511e;
                u10.b bVar3 = u10.b.Factory;
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, z.a(v.class), bVar, bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, z.a(k0.class), new os.b(20), bVar3), module)), null);
                md.a.s(new u10.c(module, defpackage.e.w(new u10.a(bVar2, z.a(j.class), new os.b(21), bVar3), module)), null);
                return b0.f48488a;
            case 3:
                o2 o2Var = w.f44703d;
                b1 b1Var = (b1) obj;
                if (!(b1Var instanceof n)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                n nVar = (n) b1Var;
                if (nVar.getValue() != null) {
                    Object value = nVar.getValue();
                    m.c(value);
                    objInvoke = ((fz.c) o2Var.f48096c).invoke(value);
                }
                v2 v2VarE = nVar.e();
                m.d(v2VarE, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return new k1(objInvoke, v2VarE);
            case 4:
                return new w1.c((Map) obj);
            case 5:
                return obj;
            case 6:
                ja.c it = (ja.c) obj;
                m.f(it, "it");
                return Boolean.valueOf(it.r1());
            case 7:
                ja.c statement = (ja.c) obj;
                m.f(statement, "statement");
                k kVar = new k();
                while (statement.r1()) {
                    kVar.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return qx.b.f(kVar);
            case 8:
                return (wb.g) obj;
            case 9:
                m.f((lc.d) obj, "it");
                return b0.f48488a;
            case 10:
                t item = (t) obj;
                int i14 = TURSyllableIntroductionActivity.H;
                m.f(item, "$this$item");
                return new m0.d(ob.f.a(5));
            case 11:
                t item2 = (t) obj;
                int i15 = TURSyllableIntroductionActivity.H;
                m.f(item2, "$this$item");
                return new m0.d(ob.f.a(5));
            case 12:
                x10.a module2 = (x10.a) obj;
                m.f(module2, "$this$module");
                rz.w wVar = new rz.w(28);
                b20.b bVar4 = c20.b.f6511e;
                u10.b bVar5 = u10.b.Factory;
                module2.a(new v10.a(new u10.a(bVar4, z.a(yr.m.class), wVar, bVar5)));
                md.a.s(new u10.c(module2, defpackage.e.w(new u10.a(bVar4, z.a(l.class), new os.b(22), bVar5), module2)), null);
                md.a.s(new u10.c(module2, defpackage.e.w(new u10.a(bVar4, z.a(yr.k.class), new os.b(23), bVar5), module2)), null);
                md.a.s(new u10.c(module2, defpackage.e.w(new u10.a(bVar4, z.a(yr.b.class), new os.b(24), bVar5), module2)), null);
                md.a.s(new u10.c(module2, defpackage.e.w(new u10.a(bVar4, z.a(yr.a.class), new os.b(25), bVar5), module2)), null);
                module2.a(new v10.a(new u10.a(bVar4, z.a(yr.j.class), new rz.w(29), bVar5)));
                md.a.s(new u10.c(module2, defpackage.e.w(new u10.a(bVar4, z.a(zr.m.class), new os.b(26), bVar5), module2)), null);
                module2.a(new v10.a(new u10.a(bVar4, z.a(q.class), new wr.a(z11 ? 1 : 0), bVar5)));
                module2.a(new v10.a(new u10.a(bVar4, z.a(zr.w.class), new wr.a(i12), bVar5)));
                module2.a(new v10.a(new u10.a(bVar4, z.a(zr.n.class), new wr.a(2), bVar5)));
                md.a.s(new u10.c(module2, defpackage.e.w(new u10.a(bVar4, z.a(zr.b.class), new os.b(27), bVar5), module2)), null);
                module2.a(new v10.a(new u10.a(bVar4, z.a(zr.i.class), new wr.a(i11), bVar5)));
                return b0.f48488a;
            case 13:
                Bookmark it2 = (Bookmark) obj;
                m.f(it2, "it");
                return Boolean.valueOf(it2.isFav() == 1);
            case 14:
                Bookmark bookmark = (Bookmark) obj;
                m.f(bookmark, "bookmark");
                return x.u0(oz.q.c1(bookmark.getId()));
            case 15:
                synchronized (x1.l.f55691c) {
                    ?? r9 = x1.l.f55697i;
                    int size = r9.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        ((fz.c) r9.get(i16)).invoke(obj);
                    }
                }
                return b0.f48488a;
            case 16:
                a aVar = x1.l.f55689a;
                return b0.f48488a;
            case 17:
                m.f((lc.d) obj, "it");
                return b0.f48488a;
            case 18:
                t item3 = (t) obj;
                m.f(item3, "$this$item");
                return new m0.d(ob.f.a(5));
            case 19:
                t item4 = (t) obj;
                m.f(item4, "$this$item");
                return new m0.d(ob.f.a(5));
            case 20:
                t item5 = (t) obj;
                m.f(item5, "$this$item");
                return new m0.d(ob.f.a(5));
            case 21:
                t item6 = (t) obj;
                m.f(item6, "$this$item");
                return new m0.d(ob.f.a(5));
            case 22:
                t item7 = (t) obj;
                m.f(item7, "$this$item");
                return new m0.d(ob.f.a(5));
            case 23:
                t item8 = (t) obj;
                m.f(item8, "$this$item");
                return new m0.d(ob.f.a(5));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                t item9 = (t) obj;
                int i17 = UKRSyllableIntroductionActivity.H;
                m.f(item9, "$this$item");
                return new m0.d(ob.f.a(5));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                t item10 = (t) obj;
                int i18 = UKRSyllableIntroductionActivity.H;
                m.f(item10, "$this$item");
                return new m0.d(ob.f.a(5));
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                t item11 = (t) obj;
                int i19 = UKRSyllableIntroductionActivity.H;
                m.f(item11, "$this$item");
                return new m0.d(ob.f.a(5));
            case 27:
                t item12 = (t) obj;
                int i21 = UKRSyllableIntroductionActivity.H;
                m.f(item12, "$this$item");
                return new m0.d(ob.f.a(5));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Context context = (Context) obj;
                m.f(context, "context");
                return new HwView(context);
            default:
                h00.h Json = (h00.h) obj;
                m.f(Json, "$this$Json");
                Json.f29927a = true;
                Json.f29929c = true;
                Json.f29928b = true;
                return b0.f48488a;
        }
    }
}
