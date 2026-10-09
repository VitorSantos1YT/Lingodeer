package rq;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import bq.r;
import bq.z;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.RxPermissions;
import hj.w1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.m;
import lf.x0;
import qy.b0;
import qy.q;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f49371b;

    public /* synthetic */ d(g gVar, int i11) {
        this.f49370a = i11;
        this.f49371b = gVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f49370a;
        b0 b0Var = b0.f48488a;
        final g gVar = this.f49371b;
        switch (i11) {
            case 0:
                q qVar = fv.b.f28186a;
                String strA = gVar.f49376k.a(gVar.f49358b.f46984b);
                m.e(strA, "getCharName(...)");
                return fv.b.c(strA, null, null);
            case 1:
                q qVar2 = fv.b.f28186a;
                String strA2 = gVar.f49376k.a(gVar.f49358b.f46985c);
                m.e(strA2, "getCharName(...)");
                return fv.b.c(strA2, null, null);
            case 2:
                q qVar3 = fv.b.f28186a;
                String strA3 = gVar.f49376k.a(gVar.f49358b.f46983a);
                m.e(strA3, "getCharName(...)");
                return fv.b.c(strA3, null, null);
            case 3:
                ta.a aVar = gVar.f49363g;
                m.c(aVar);
                ((w1) aVar).f33504e.animate().alpha(1.0f).setDuration(300L).start();
                ta.a aVar2 = gVar.f49363g;
                m.c(aVar2);
                final int i12 = 1;
                z.b(((w1) aVar2).f33504e, new fz.c() { // from class: rq.e
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i13 = i12;
                        int i14 = 0;
                        b0 b0Var2 = b0.f48488a;
                        g gVar2 = gVar;
                        View it = (View) obj;
                        switch (i13) {
                            case 0:
                                m.f(it, "it");
                                gVar2.r();
                                gVar2.q();
                                th.e eVar = ((p0) gVar2.f49357a).V;
                                if (eVar != null) {
                                    eVar.h(gVar2.f49379o);
                                }
                                ta.a aVar3 = gVar2.f49363g;
                                m.c(aVar3);
                                ((w1) aVar3).f33501b.setBackgroundResource(R.drawable.point_accent);
                                ta.a aVar4 = gVar2.f49363g;
                                m.c(aVar4);
                                android.support.v4.media.session.a.K(((w1) aVar4).f33506g.getBackground());
                                ta.a aVar5 = gVar2.f49363g;
                                m.c(aVar5);
                                ((w1) aVar5).f33507h.setVisibility(0);
                                ij.d dVar = gVar2.f49378n;
                                if (dVar != null) {
                                    dVar.d();
                                }
                                ij.d dVar2 = new ij.d(23);
                                ta.a aVar6 = gVar2.f49363g;
                                m.c(aVar6);
                                dVar2.f34423d = ((w1) aVar6).f33507h;
                                dVar2.f34421b = 2000;
                                dVar2.E();
                                gVar2.f49378n = dVar2;
                                int[] iArr = r.f4959a;
                                long jB = bq.m.B(gVar2.f49379o);
                                rx.b bVar = gVar2.f49380p;
                                if (bVar != null) {
                                    bVar.dispose();
                                }
                                gVar2.f49380p = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new x0(gVar2, 28), a.f49352d);
                                break;
                            case 1:
                                m.f(it, "it");
                                mp.b bVar2 = gVar2.f49357a;
                                String str = (String) gVar2.f49381q.getValue();
                                ta.a aVar7 = gVar2.f49363g;
                                m.c(aVar7);
                                ((p0) bVar2).H((ImageView) ((w1) aVar7).f33503d.f32490c, str);
                                ta.a aVar8 = gVar2.f49363g;
                                m.c(aVar8);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar8).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 2:
                                m.f(it, "it");
                                mp.b bVar3 = gVar2.f49357a;
                                String str2 = (String) gVar2.f49382r.getValue();
                                ta.a aVar9 = gVar2.f49363g;
                                m.c(aVar9);
                                ((p0) bVar3).H((ImageView) ((w1) aVar9).f33503d.f32490c, str2);
                                ta.a aVar10 = gVar2.f49363g;
                                m.c(aVar10);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar10).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 3:
                                m.f(it, "it");
                                gVar2.f49377l = 0L;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((String) gVar2.f49381q.getValue());
                                arrayList.add((String) gVar2.f49382r.getValue());
                                arrayList.add((String) gVar2.f49383s.getValue());
                                int size = arrayList.size();
                                while (i14 < size) {
                                    Object obj2 = arrayList.get(i14);
                                    i14++;
                                    m.e(obj2, "next(...)");
                                    String str3 = (String) obj2;
                                    int iIndexOf = arrayList.indexOf(str3);
                                    if (iIndexOf > 0) {
                                        long j11 = gVar2.f49377l;
                                        int[] iArr2 = r.f4959a;
                                        gVar2.f49377l = bq.m.B((String) arrayList.get(iIndexOf - 1)) + j11;
                                    }
                                    j.a(qx.h.m(gVar2.f49377l, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ij.d(gVar2, iIndexOf, 21, str3), a.f49355t), gVar2.f49364h);
                                }
                                break;
                            default:
                                m.f(it, "it");
                                p0 p0Var = (p0) gVar2.f49357a;
                                th.e eVar2 = p0Var.V;
                                if (eVar2 != null) {
                                    eVar2.n();
                                }
                                ta.a aVar11 = gVar2.f49363g;
                                m.c(aVar11);
                                android.support.v4.media.session.a.H(((ImageView) ((w1) aVar11).f33503d.f32490c).getBackground());
                                lp.j jVar = new lp.j(gVar2, 25);
                                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                                Context contextC = p0Var.C();
                                rxPermissions.setLogging(true);
                                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                                    jVar.m();
                                } else {
                                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(jVar, contextC, rxPermissions, 17), vx.b.f54316e);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                });
                ta.a aVar3 = gVar.f49363g;
                m.c(aVar3);
                ((w1) aVar3).f33504e.performClick();
                j.a(qx.h.m(1500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(gVar, 27), a.H), gVar.f49364h);
                return b0Var;
            case 4:
                ta.a aVar4 = gVar.f49363g;
                m.c(aVar4);
                ((w1) aVar4).f33505f.animate().alpha(1.0f).setDuration(300L).start();
                ta.a aVar5 = gVar.f49363g;
                m.c(aVar5);
                final int i13 = 2;
                z.b(((w1) aVar5).f33505f, new fz.c() { // from class: rq.e
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i14 = i13;
                        int i15 = 0;
                        b0 b0Var2 = b0.f48488a;
                        g gVar2 = gVar;
                        View it = (View) obj;
                        switch (i14) {
                            case 0:
                                m.f(it, "it");
                                gVar2.r();
                                gVar2.q();
                                th.e eVar = ((p0) gVar2.f49357a).V;
                                if (eVar != null) {
                                    eVar.h(gVar2.f49379o);
                                }
                                ta.a aVar6 = gVar2.f49363g;
                                m.c(aVar6);
                                ((w1) aVar6).f33501b.setBackgroundResource(R.drawable.point_accent);
                                ta.a aVar7 = gVar2.f49363g;
                                m.c(aVar7);
                                android.support.v4.media.session.a.K(((w1) aVar7).f33506g.getBackground());
                                ta.a aVar8 = gVar2.f49363g;
                                m.c(aVar8);
                                ((w1) aVar8).f33507h.setVisibility(0);
                                ij.d dVar = gVar2.f49378n;
                                if (dVar != null) {
                                    dVar.d();
                                }
                                ij.d dVar2 = new ij.d(23);
                                ta.a aVar9 = gVar2.f49363g;
                                m.c(aVar9);
                                dVar2.f34423d = ((w1) aVar9).f33507h;
                                dVar2.f34421b = 2000;
                                dVar2.E();
                                gVar2.f49378n = dVar2;
                                int[] iArr = r.f4959a;
                                long jB = bq.m.B(gVar2.f49379o);
                                rx.b bVar = gVar2.f49380p;
                                if (bVar != null) {
                                    bVar.dispose();
                                }
                                gVar2.f49380p = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new x0(gVar2, 28), a.f49352d);
                                break;
                            case 1:
                                m.f(it, "it");
                                mp.b bVar2 = gVar2.f49357a;
                                String str = (String) gVar2.f49381q.getValue();
                                ta.a aVar10 = gVar2.f49363g;
                                m.c(aVar10);
                                ((p0) bVar2).H((ImageView) ((w1) aVar10).f33503d.f32490c, str);
                                ta.a aVar11 = gVar2.f49363g;
                                m.c(aVar11);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar11).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 2:
                                m.f(it, "it");
                                mp.b bVar3 = gVar2.f49357a;
                                String str2 = (String) gVar2.f49382r.getValue();
                                ta.a aVar12 = gVar2.f49363g;
                                m.c(aVar12);
                                ((p0) bVar3).H((ImageView) ((w1) aVar12).f33503d.f32490c, str2);
                                ta.a aVar13 = gVar2.f49363g;
                                m.c(aVar13);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar13).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 3:
                                m.f(it, "it");
                                gVar2.f49377l = 0L;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((String) gVar2.f49381q.getValue());
                                arrayList.add((String) gVar2.f49382r.getValue());
                                arrayList.add((String) gVar2.f49383s.getValue());
                                int size = arrayList.size();
                                while (i15 < size) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    m.e(obj2, "next(...)");
                                    String str3 = (String) obj2;
                                    int iIndexOf = arrayList.indexOf(str3);
                                    if (iIndexOf > 0) {
                                        long j11 = gVar2.f49377l;
                                        int[] iArr2 = r.f4959a;
                                        gVar2.f49377l = bq.m.B((String) arrayList.get(iIndexOf - 1)) + j11;
                                    }
                                    j.a(qx.h.m(gVar2.f49377l, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ij.d(gVar2, iIndexOf, 21, str3), a.f49355t), gVar2.f49364h);
                                }
                                break;
                            default:
                                m.f(it, "it");
                                p0 p0Var = (p0) gVar2.f49357a;
                                th.e eVar2 = p0Var.V;
                                if (eVar2 != null) {
                                    eVar2.n();
                                }
                                ta.a aVar14 = gVar2.f49363g;
                                m.c(aVar14);
                                android.support.v4.media.session.a.H(((ImageView) ((w1) aVar14).f33503d.f32490c).getBackground());
                                lp.j jVar = new lp.j(gVar2, 25);
                                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                                Context contextC = p0Var.C();
                                rxPermissions.setLogging(true);
                                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                                    jVar.m();
                                } else {
                                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(jVar, contextC, rxPermissions, 17), vx.b.f54316e);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                });
                ta.a aVar6 = gVar.f49363g;
                m.c(aVar6);
                ((w1) aVar6).f33505f.performClick();
                return b0Var;
            case 5:
                ta.a aVar7 = gVar.f49363g;
                m.c(aVar7);
                ((ImageView) ((w1) aVar7).f33503d.f32490c).animate().alpha(1.0f).setDuration(300L).start();
                ta.a aVar8 = gVar.f49363g;
                m.c(aVar8);
                final int i14 = 3;
                z.b((ImageView) ((w1) aVar8).f33503d.f32490c, new fz.c() { // from class: rq.e
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i15 = i14;
                        int i16 = 0;
                        b0 b0Var2 = b0.f48488a;
                        g gVar2 = gVar;
                        View it = (View) obj;
                        switch (i15) {
                            case 0:
                                m.f(it, "it");
                                gVar2.r();
                                gVar2.q();
                                th.e eVar = ((p0) gVar2.f49357a).V;
                                if (eVar != null) {
                                    eVar.h(gVar2.f49379o);
                                }
                                ta.a aVar9 = gVar2.f49363g;
                                m.c(aVar9);
                                ((w1) aVar9).f33501b.setBackgroundResource(R.drawable.point_accent);
                                ta.a aVar10 = gVar2.f49363g;
                                m.c(aVar10);
                                android.support.v4.media.session.a.K(((w1) aVar10).f33506g.getBackground());
                                ta.a aVar11 = gVar2.f49363g;
                                m.c(aVar11);
                                ((w1) aVar11).f33507h.setVisibility(0);
                                ij.d dVar = gVar2.f49378n;
                                if (dVar != null) {
                                    dVar.d();
                                }
                                ij.d dVar2 = new ij.d(23);
                                ta.a aVar12 = gVar2.f49363g;
                                m.c(aVar12);
                                dVar2.f34423d = ((w1) aVar12).f33507h;
                                dVar2.f34421b = 2000;
                                dVar2.E();
                                gVar2.f49378n = dVar2;
                                int[] iArr = r.f4959a;
                                long jB = bq.m.B(gVar2.f49379o);
                                rx.b bVar = gVar2.f49380p;
                                if (bVar != null) {
                                    bVar.dispose();
                                }
                                gVar2.f49380p = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new x0(gVar2, 28), a.f49352d);
                                break;
                            case 1:
                                m.f(it, "it");
                                mp.b bVar2 = gVar2.f49357a;
                                String str = (String) gVar2.f49381q.getValue();
                                ta.a aVar13 = gVar2.f49363g;
                                m.c(aVar13);
                                ((p0) bVar2).H((ImageView) ((w1) aVar13).f33503d.f32490c, str);
                                ta.a aVar14 = gVar2.f49363g;
                                m.c(aVar14);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar14).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 2:
                                m.f(it, "it");
                                mp.b bVar3 = gVar2.f49357a;
                                String str2 = (String) gVar2.f49382r.getValue();
                                ta.a aVar15 = gVar2.f49363g;
                                m.c(aVar15);
                                ((p0) bVar3).H((ImageView) ((w1) aVar15).f33503d.f32490c, str2);
                                ta.a aVar16 = gVar2.f49363g;
                                m.c(aVar16);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar16).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 3:
                                m.f(it, "it");
                                gVar2.f49377l = 0L;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((String) gVar2.f49381q.getValue());
                                arrayList.add((String) gVar2.f49382r.getValue());
                                arrayList.add((String) gVar2.f49383s.getValue());
                                int size = arrayList.size();
                                while (i16 < size) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    m.e(obj2, "next(...)");
                                    String str3 = (String) obj2;
                                    int iIndexOf = arrayList.indexOf(str3);
                                    if (iIndexOf > 0) {
                                        long j11 = gVar2.f49377l;
                                        int[] iArr2 = r.f4959a;
                                        gVar2.f49377l = bq.m.B((String) arrayList.get(iIndexOf - 1)) + j11;
                                    }
                                    j.a(qx.h.m(gVar2.f49377l, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ij.d(gVar2, iIndexOf, 21, str3), a.f49355t), gVar2.f49364h);
                                }
                                break;
                            default:
                                m.f(it, "it");
                                p0 p0Var = (p0) gVar2.f49357a;
                                th.e eVar2 = p0Var.V;
                                if (eVar2 != null) {
                                    eVar2.n();
                                }
                                ta.a aVar17 = gVar2.f49363g;
                                m.c(aVar17);
                                android.support.v4.media.session.a.H(((ImageView) ((w1) aVar17).f33503d.f32490c).getBackground());
                                lp.j jVar = new lp.j(gVar2, 25);
                                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                                Context contextC = p0Var.C();
                                rxPermissions.setLogging(true);
                                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                                    jVar.m();
                                } else {
                                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(jVar, contextC, rxPermissions, 17), vx.b.f54316e);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                });
                return b0Var;
            case 6:
                ta.a aVar9 = gVar.f49363g;
                m.c(aVar9);
                ((w1) aVar9).m.b();
                ta.a aVar10 = gVar.f49363g;
                m.c(aVar10);
                ((w1) aVar10).f33502c.setBackgroundResource(R.drawable.bg_speak_btn_enable);
                ta.a aVar11 = gVar.f49363g;
                m.c(aVar11);
                if (g.p(((w1) aVar11).f33501b, gVar.f49379o)) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    dy.j jVar = ky.e.f38937b;
                    j.a(qx.h.m(300L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new o20.i(gVar, 20), a.f49351c), gVar.f49364h);
                }
                return b0Var;
            case 7:
                ta.a aVar12 = gVar.f49363g;
                m.c(aVar12);
                ((w1) aVar12).f33501b.animate().alpha(1.0f).setDuration(300L).start();
                return b0Var;
            default:
                ta.a aVar13 = gVar.f49363g;
                m.c(aVar13);
                ((w1) aVar13).f33502c.animate().alpha(1.0f).setDuration(300L).start();
                ta.a aVar14 = gVar.f49363g;
                m.c(aVar14);
                final int i15 = 4;
                z.b(((w1) aVar14).f33502c, new fz.c() { // from class: rq.e
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        int i17 = 0;
                        b0 b0Var2 = b0.f48488a;
                        g gVar2 = gVar;
                        View it = (View) obj;
                        switch (i16) {
                            case 0:
                                m.f(it, "it");
                                gVar2.r();
                                gVar2.q();
                                th.e eVar = ((p0) gVar2.f49357a).V;
                                if (eVar != null) {
                                    eVar.h(gVar2.f49379o);
                                }
                                ta.a aVar15 = gVar2.f49363g;
                                m.c(aVar15);
                                ((w1) aVar15).f33501b.setBackgroundResource(R.drawable.point_accent);
                                ta.a aVar16 = gVar2.f49363g;
                                m.c(aVar16);
                                android.support.v4.media.session.a.K(((w1) aVar16).f33506g.getBackground());
                                ta.a aVar17 = gVar2.f49363g;
                                m.c(aVar17);
                                ((w1) aVar17).f33507h.setVisibility(0);
                                ij.d dVar = gVar2.f49378n;
                                if (dVar != null) {
                                    dVar.d();
                                }
                                ij.d dVar2 = new ij.d(23);
                                ta.a aVar18 = gVar2.f49363g;
                                m.c(aVar18);
                                dVar2.f34423d = ((w1) aVar18).f33507h;
                                dVar2.f34421b = 2000;
                                dVar2.E();
                                gVar2.f49378n = dVar2;
                                int[] iArr = r.f4959a;
                                long jB = bq.m.B(gVar2.f49379o);
                                rx.b bVar = gVar2.f49380p;
                                if (bVar != null) {
                                    bVar.dispose();
                                }
                                gVar2.f49380p = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new x0(gVar2, 28), a.f49352d);
                                break;
                            case 1:
                                m.f(it, "it");
                                mp.b bVar2 = gVar2.f49357a;
                                String str = (String) gVar2.f49381q.getValue();
                                ta.a aVar19 = gVar2.f49363g;
                                m.c(aVar19);
                                ((p0) bVar2).H((ImageView) ((w1) aVar19).f33503d.f32490c, str);
                                ta.a aVar110 = gVar2.f49363g;
                                m.c(aVar110);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar110).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 2:
                                m.f(it, "it");
                                mp.b bVar3 = gVar2.f49357a;
                                String str2 = (String) gVar2.f49382r.getValue();
                                ta.a aVar111 = gVar2.f49363g;
                                m.c(aVar111);
                                ((p0) bVar3).H((ImageView) ((w1) aVar111).f33503d.f32490c, str2);
                                ta.a aVar112 = gVar2.f49363g;
                                m.c(aVar112);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar112).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 3:
                                m.f(it, "it");
                                gVar2.f49377l = 0L;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((String) gVar2.f49381q.getValue());
                                arrayList.add((String) gVar2.f49382r.getValue());
                                arrayList.add((String) gVar2.f49383s.getValue());
                                int size = arrayList.size();
                                while (i17 < size) {
                                    Object obj2 = arrayList.get(i17);
                                    i17++;
                                    m.e(obj2, "next(...)");
                                    String str3 = (String) obj2;
                                    int iIndexOf = arrayList.indexOf(str3);
                                    if (iIndexOf > 0) {
                                        long j11 = gVar2.f49377l;
                                        int[] iArr2 = r.f4959a;
                                        gVar2.f49377l = bq.m.B((String) arrayList.get(iIndexOf - 1)) + j11;
                                    }
                                    j.a(qx.h.m(gVar2.f49377l, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ij.d(gVar2, iIndexOf, 21, str3), a.f49355t), gVar2.f49364h);
                                }
                                break;
                            default:
                                m.f(it, "it");
                                p0 p0Var = (p0) gVar2.f49357a;
                                th.e eVar2 = p0Var.V;
                                if (eVar2 != null) {
                                    eVar2.n();
                                }
                                ta.a aVar113 = gVar2.f49363g;
                                m.c(aVar113);
                                android.support.v4.media.session.a.H(((ImageView) ((w1) aVar113).f33503d.f32490c).getBackground());
                                lp.j jVar2 = new lp.j(gVar2, 25);
                                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                                Context contextC = p0Var.C();
                                rxPermissions.setLogging(true);
                                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                                    jVar2.m();
                                } else {
                                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(jVar2, contextC, rxPermissions, 17), vx.b.f54316e);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                });
                ta.a aVar15 = gVar.f49363g;
                m.c(aVar15);
                final int i16 = 0;
                z.b(((w1) aVar15).f33501b, new fz.c() { // from class: rq.e
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        int i18 = 0;
                        b0 b0Var2 = b0.f48488a;
                        g gVar2 = gVar;
                        View it = (View) obj;
                        switch (i17) {
                            case 0:
                                m.f(it, "it");
                                gVar2.r();
                                gVar2.q();
                                th.e eVar = ((p0) gVar2.f49357a).V;
                                if (eVar != null) {
                                    eVar.h(gVar2.f49379o);
                                }
                                ta.a aVar16 = gVar2.f49363g;
                                m.c(aVar16);
                                ((w1) aVar16).f33501b.setBackgroundResource(R.drawable.point_accent);
                                ta.a aVar17 = gVar2.f49363g;
                                m.c(aVar17);
                                android.support.v4.media.session.a.K(((w1) aVar17).f33506g.getBackground());
                                ta.a aVar18 = gVar2.f49363g;
                                m.c(aVar18);
                                ((w1) aVar18).f33507h.setVisibility(0);
                                ij.d dVar = gVar2.f49378n;
                                if (dVar != null) {
                                    dVar.d();
                                }
                                ij.d dVar2 = new ij.d(23);
                                ta.a aVar19 = gVar2.f49363g;
                                m.c(aVar19);
                                dVar2.f34423d = ((w1) aVar19).f33507h;
                                dVar2.f34421b = 2000;
                                dVar2.E();
                                gVar2.f49378n = dVar2;
                                int[] iArr = r.f4959a;
                                long jB = bq.m.B(gVar2.f49379o);
                                rx.b bVar = gVar2.f49380p;
                                if (bVar != null) {
                                    bVar.dispose();
                                }
                                gVar2.f49380p = qx.h.m(jB, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new x0(gVar2, 28), a.f49352d);
                                break;
                            case 1:
                                m.f(it, "it");
                                mp.b bVar2 = gVar2.f49357a;
                                String str = (String) gVar2.f49381q.getValue();
                                ta.a aVar110 = gVar2.f49363g;
                                m.c(aVar110);
                                ((p0) bVar2).H((ImageView) ((w1) aVar110).f33503d.f32490c, str);
                                ta.a aVar111 = gVar2.f49363g;
                                m.c(aVar111);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar111).f33504e, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 2:
                                m.f(it, "it");
                                mp.b bVar3 = gVar2.f49357a;
                                String str2 = (String) gVar2.f49382r.getValue();
                                ta.a aVar112 = gVar2.f49363g;
                                m.c(aVar112);
                                ((p0) bVar3).H((ImageView) ((w1) aVar112).f33503d.f32490c, str2);
                                ta.a aVar113 = gVar2.f49363g;
                                m.c(aVar113);
                                ObjectAnimator.ofPropertyValuesHolder(((w1) aVar113).f33505f, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f, 1.0f)).setDuration(300L).start();
                                break;
                            case 3:
                                m.f(it, "it");
                                gVar2.f49377l = 0L;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add((String) gVar2.f49381q.getValue());
                                arrayList.add((String) gVar2.f49382r.getValue());
                                arrayList.add((String) gVar2.f49383s.getValue());
                                int size = arrayList.size();
                                while (i18 < size) {
                                    Object obj2 = arrayList.get(i18);
                                    i18++;
                                    m.e(obj2, "next(...)");
                                    String str3 = (String) obj2;
                                    int iIndexOf = arrayList.indexOf(str3);
                                    if (iIndexOf > 0) {
                                        long j11 = gVar2.f49377l;
                                        int[] iArr2 = r.f4959a;
                                        gVar2.f49377l = bq.m.B((String) arrayList.get(iIndexOf - 1)) + j11;
                                    }
                                    j.a(qx.h.m(gVar2.f49377l, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ij.d(gVar2, iIndexOf, 21, str3), a.f49355t), gVar2.f49364h);
                                }
                                break;
                            default:
                                m.f(it, "it");
                                p0 p0Var = (p0) gVar2.f49357a;
                                th.e eVar2 = p0Var.V;
                                if (eVar2 != null) {
                                    eVar2.n();
                                }
                                ta.a aVar114 = gVar2.f49363g;
                                m.c(aVar114);
                                android.support.v4.media.session.a.H(((ImageView) ((w1) aVar114).f33503d.f32490c).getBackground());
                                lp.j jVar2 = new lp.j(gVar2, 25);
                                RxPermissions rxPermissions = new RxPermissions((androidx.fragment.app.p0) p0Var.C());
                                Context contextC = p0Var.C();
                                rxPermissions.setLogging(true);
                                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                                    jVar2.m();
                                } else {
                                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(jVar2, contextC, rxPermissions, 17), vx.b.f54316e);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                });
                return b0Var;
        }
    }
}
