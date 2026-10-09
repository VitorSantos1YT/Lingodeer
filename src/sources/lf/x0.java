package lf;

import a0.w1;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.LottieAnimationView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.common.base.Preconditions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableIndexRecyclerAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.j6;
import hj.s5;
import hj.w5;
import io.reactivex.rxjava3.exceptions.CompositeException;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import mw.l5;
import mw.m5;
import qp.f2;
import qp.k3;
import qp.v2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements InstallReferrerStateListener, vq.f, ValueEventListener, o20.h, tx.c, th.c, qx.k, zq.a, ii.a, ry.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40130b;

    public /* synthetic */ x0(Object obj, int i11) {
        this.f40129a = i11;
        this.f40130b = obj;
    }

    public Object B() {
        switch (this.f40129a) {
            case 3:
                return this.f40130b;
            default:
                return m5.a((l5) this.f40130b);
        }
    }

    @Override // ry.u
    public Iterator C() {
        return new nz.g((nz.i) this.f40130b);
    }

    public uz.i D(long j11) {
        n9.n1 n1Var = new n9.n1(new gp.r(new w1(this, j11, (vy.d) null, 6)), new d0.e0(this, j11, null));
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(n1Var, yz.e.f58387a);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void E(DataSnapshot dataSnapshot) {
        cy.a aVar = (cy.a) this.f40130b;
        dataSnapshot.toString();
        if (dataSnapshot.f18954a.f19539a.isEmpty()) {
            try {
                aVar.c(Boolean.FALSE);
                return;
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        try {
            aVar.c(Boolean.TRUE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void F(Object obj) {
        switch (this.f40129a) {
            case 3:
                break;
            default:
                m5.b((l5) this.f40130b, obj);
                break;
        }
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f40129a) {
            case 10:
                ((oo.d0) this.f40130b).y();
                break;
            case 13:
                pi.h hVar = (pi.h) this.f40130b;
                j6 j6Var = hVar.W;
                kotlin.jvm.internal.m.c(j6Var);
                if (j6Var.f32793b != null) {
                    j6 j6Var2 = hVar.W;
                    kotlin.jvm.internal.m.c(j6Var2);
                    android.support.v4.media.session.a.H(j6Var2.f32793b.getBackground());
                    break;
                }
                break;
            default:
                ((qp.l1) this.f40130b).y();
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        float fY;
        int size;
        int i11 = this.f40129a;
        int i12 = 1;
        vy.d dVar = null;
        Object obj2 = this.f40130b;
        switch (i11) {
            case 9:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((om.m) obj2).f45622e.o();
                return;
            case 14:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                qh.e eVar = (qh.e) obj2;
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (bVar.f51685t) {
                    eVar.T.set(true);
                    return;
                } else {
                    eVar.C();
                    return;
                }
            case 15:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                qh.c0 c0Var = (qh.c0) obj2;
                ta.a aVar = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                TextView textView = ((w5) aVar).f33542t;
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView.setText("+" + c0Var.getString(R.string._s_xp, String.valueOf(cVar.f51688c)));
                ta.a aVar2 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ObjectAnimator.ofPropertyValuesHolder(((w5) aVar2).f33542t, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.4f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.4f, 1.0f)).setDuration(300L).start();
                sh.c cVar2 = c0Var.S;
                if (cVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (cVar2.O) {
                    Context contextRequireContext = c0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    fY = j3.y(contextRequireContext);
                    sh.c cVar3 = c0Var.S;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.m.n("viewModel");
                        throw null;
                    }
                    size = cVar3.c().size();
                } else {
                    Context contextRequireContext2 = c0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                    fY = j3.y(contextRequireContext2);
                    size = c0Var.R;
                }
                float f5 = fY / size;
                ta.a aVar3 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                z4.w0 w0VarB = z4.s0.b(((w5) aVar3).f33531h);
                w0VarB.k(f5);
                w0VarB.f(new DecelerateInterpolator());
                w0VarB.e(600L);
                w0VarB.i();
                return;
            case 16:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                th.e eVar2 = ((qh.k0) obj2).N;
                if (eVar2 != null) {
                    eVar2.k(R.raw.menu_pick);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("player");
                    throw null;
                }
            case 20:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                lottieAnimationView.i((String) obj);
                lottieAnimationView.setFailureListener(new pi.g(i12));
                return;
            case 21:
                Boolean it5 = (Boolean) obj;
                f2 f2Var = (f2) obj2;
                kotlin.jvm.internal.m.f(it5, "it");
                if (it5.booleanValue()) {
                    jp.p0 p0Var = (jp.p0) f2Var.f47881a;
                    p0Var.getClass();
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var), null, null, new mv.f0(f2Var, dVar, 12), 3);
                    return;
                }
                return;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Long it6 = (Long) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ((jp.p0) ((qp.f1) obj2).f47881a).X();
                return;
            default:
                Long it7 = (Long) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                ((rq.g) obj2).q();
                return;
        }
    }

    @Override // qx.k
    public void c(rx.b bVar) {
        ((qx.k) this.f40130b).c(bVar);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void d(DatabaseError databaseError) {
        kotlin.jvm.internal.m.f(databaseError, "databaseError");
        try {
            ((cy.a) this.f40130b).a(databaseError.c());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // vq.f
    public void f(View view, Point point) {
        boolean zC;
        kotlin.jvm.internal.m.f(view, "view");
        lp.k kVar = (lp.k) this.f40130b;
        List list = (List) kVar.b().f57089b;
        boolean z11 = false;
        if (list != null) {
            Iterator it = ns.o.y(list).iterator();
            boolean z12 = false;
            while (((lz.f) it).f40537c) {
                View view2 = (View) list.get(((ry.w) it).nextInt());
                kotlin.jvm.internal.m.d(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) view2;
                if (frameLayout.getTag(R.id.tag_rects) != null) {
                    Object tag = frameLayout.getTag(R.id.tag_rects);
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.Rect>");
                    zC = kVar.c(view, point, (List) tag, frameLayout);
                } else {
                    zC = false;
                }
                if (zC) {
                    z12 = true;
                } else {
                    if (view.equals(frameLayout)) {
                        frameLayout.setVisibility(8);
                    }
                    lp.k.h(frameLayout);
                }
                frameLayout.requestLayout();
            }
            z11 = z12;
        }
        if (!z11) {
            kVar.f40212i.setVisibility(4);
        }
        kVar.f40213j.requestLayout();
    }

    @Override // ry.u
    public Object g(Object obj) {
        return (LocalDate) obj;
    }

    @Override // vq.f
    public void h(View view) {
        lp.k kVar = (lp.k) this.f40130b;
        if (!kVar.f40211h) {
            view.setVisibility(0);
        }
        kVar.f40212i.setVisibility(4);
        lp.k.a(kVar, kVar.f40213j);
        kVar.i();
    }

    @Override // o20.h
    public void k(o20.e eVar, o20.t0 t0Var) {
        ((o20.j) this.f40130b).complete(t0Var);
    }

    @Override // qx.k
    public void onComplete() {
        ((qx.k) this.f40130b).onComplete();
    }

    @Override // qx.k
    public void onError(Throwable th2) {
        qx.k kVar = (qx.k) this.f40130b;
        try {
            if (th2 == null) {
                throw new NullPointerException("error == null");
            }
            kVar.onNext(new p20.c(0));
            kVar.onComplete();
        } catch (Throwable th3) {
            try {
                kVar.onError(th3);
            } catch (Throwable th4) {
                ef.e.E(th4);
                qx.p.u(new CompositeException(th3, th4));
            }
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i11) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f40130b;
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (i11 == 0) {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    kotlin.jvm.internal.m.e(installReferrer, "{\n                      …rer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (oz.q.v0(installReferrer2, "fb", false) || oz.q.v0(installReferrer2, "facebook", false))) {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
                        re.s.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString(Constants.INSTALL_REFERRER, installReferrer2).apply();
                    }
                    re.s.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                } catch (RemoteException | Exception unused) {
                    return;
                }
            } else if (i11 == 2) {
                re.s.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
            }
            installReferrerClient.endConnection();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // qx.k
    public void onNext(Object obj) {
        o20.t0 t0Var = (o20.t0) obj;
        qx.k kVar = (qx.k) this.f40130b;
        if (t0Var == null) {
            throw new NullPointerException("response == null");
        }
        kVar.onNext(new p20.c(0));
    }

    @Override // vq.f
    public void r(View view) {
        lp.k kVar = (lp.k) this.f40130b;
        kVar.f40211h = false;
        LayoutTransition layoutTransition = kVar.f40213j.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.setAnimator(1, null);
        }
        view.setVisibility(8);
    }

    @Override // ii.a
    public void start() {
        sq.g gVar = (sq.g) this.f40130b;
        if (hq.a.f33688b == null) {
            synchronized (hq.a.class) {
                if (hq.a.f33688b == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    hq.a.f33688b = new hq.a(lingoSkillApplication, false);
                }
            }
        }
        hq.a aVar = hq.a.f33688b;
        kotlin.jvm.internal.m.c(aVar);
        ArrayList arrayList = new ArrayList();
        Context context = aVar.f33689a;
        arrayList.add(new pq.b(0, ff.h.y(context, R.string.introduction), BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME));
        arrayList.add(new pq.b(1, String.format(ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1)), "Initials “b/p/c/d/r/gi”＋Finals starting with “a/ă/ â”", "a,ai,ao,ay,ây,an,ăn,ân,am,ăm,âm", "b,p,c,d,r,gi", "ba, ca, dai, pai, cao, dao, bay, ran, giam, căn, pân, dăn, pâm, rây, giây"));
        arrayList.add(new pq.b(2, String.format(ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{2}, 1)), "Initials “đ/h/k/gh/ngh/qu”＋Finals starting with “e/ê”", "e,ê,eo,êu,et,êt,en,ên", "đ,h,k,gh,ngh,qu", "đe, he, hê, kê, ghe, nghê, đeo, heo, nghêu, ket, ghen, nghêt,quet, quê, quên"));
        arrayList.add(new pq.b(3, String.format(ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{3}, 1)), "Initials “m/ l/ n/ nh”＋Finals starting with “i/y”", "i,y,iu,in,iên,iêu,inh,ich", "m,l,n,nh", "my, nhi, ny, miu, min, nhiên, liên, nhin, nhiu, ninh, lich, liêu, nhiêu"));
        arrayList.add(new pq.b(4, String.format(ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{4}, 1)), "Initials “x/s/ch/tr/g”+ Finals starting with “o/ô/ơ”", "o,ô,ơ,oa,oi,ôi,ơi,ôp,ơp,on,ơn,ôn,oai", "x,s,ch,tr,g", "xo, sơ, goi, trơn, chô, trôi, trơ, sơi, soa, chôp, trơp, xon, chôn, xoai"));
        arrayList.add(new pq.b(5, String.format(ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{5}, 1)), "Initials v/t/ph/th/kh+Finals starting with “u/ư”", "u,ư,uc,ua,ưa,ui,uy,ung", "v,t,kh,th,ph", "tu, thư, phuc, khu, vua, tua, phưa, khui, vui, tuy, thuy, phung, khung"));
        arrayList.add(new pq.b(6, String.format(ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{6}, 1)), "Tones", "a,ã,ó,ọc,ỏi,ồi,em,ém,u,oả,á,òn,ễm,ị,èo,iển,ỗi", "b,m,ng,h,x,k,ch,th,t,qu,c,tr,ngh,v,n", "ba, mã, ngó, học, hỏi, ngồi, xem, kém, chọc, thu, toả, quá, còn, chễm, trị, nghèo, viển, nỗi"));
        gVar.P.clear();
        gVar.P.addAll(arrayList);
        VTSyllableIndexRecyclerAdapter vTSyllableIndexRecyclerAdapter = gVar.O;
        kotlin.jvm.internal.m.c(vTSyllableIndexRecyclerAdapter);
        vTSyllableIndexRecyclerAdapter.notifyDataSetChanged();
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (b7.e0.d(ij.l.f34436b, 7) > 1) {
            ta.a aVar2 = gVar.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            RecyclerView recyclerView = ((s5) aVar2).f33279c;
            recyclerView.postDelayed(new b2.c(4, recyclerView, new s0.u(gVar, 5)), 0L);
        }
    }

    @Override // vq.f
    public boolean w(View view, Point point) {
        int i11;
        kotlin.jvm.internal.m.f(view, "view");
        lp.k kVar = (lp.k) this.f40130b;
        y4.b bVarB = kVar.b();
        List list = (List) bVarB.f57088a;
        List list2 = (List) bVarB.f57089b;
        if (list == null) {
            return false;
        }
        Iterator it = ns.o.y(list).iterator();
        while (((lz.f) it).f40537c) {
            int iNextInt = ((ry.w) it).nextInt();
            List<Rect> list3 = (List) list.get(iNextInt);
            int size = (list2 == null || (iNextInt != list.size() - 1 && iNextInt < list2.size())) ? iNextInt : list2.size() - 1;
            for (Rect rect : list3) {
                int i12 = point.x;
                if (i12 >= rect.left && i12 < rect.right && (i11 = point.y) >= rect.top && i11 <= rect.bottom) {
                    View view2 = kVar.f40212i;
                    FlexboxLayout flexboxLayout = kVar.f40213j;
                    view2.setVisibility(4);
                    lp.k.a(kVar, flexboxLayout);
                    kVar.f40211h = true;
                    Object tag = view.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    Object tag2 = view.getTag(R.id.bottom_view);
                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type android.view.View");
                    View viewF = kVar.f((View) tag2, (Word) tag);
                    if (iNextInt == list.size() - 1) {
                        flexboxLayout.addView(viewF);
                    } else if (size > flexboxLayout.indexOfChild(view)) {
                        flexboxLayout.addView(viewF, size + 1);
                    } else {
                        flexboxLayout.addView(viewF, size);
                    }
                    flexboxLayout.removeView(view);
                    kVar.i();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // zq.a
    public void x(String str) {
        switch (this.f40129a) {
            case 17:
                qp.w wVar = (qp.w) this.f40130b;
                if (wVar.f48234l != null) {
                    ((jp.p0) wVar.f47881a).I(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
            case 18:
                qp.p0 p0Var = (qp.p0) this.f40130b;
                if (p0Var.f48106l != null) {
                    ((jp.p0) p0Var.f47881a).I(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
            case 22:
                ((jp.p0) ((v2) this.f40130b).f47881a).I(str);
                return;
            default:
                k3 k3Var = (k3) this.f40130b;
                Object obj = k3Var.f47881a;
                qp.h hVar = k3Var.m;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                k3Var.f48015l = hVar.f59276l;
                k3Var.u();
                if (((jp.p0) obj).f36534j0.length() > 0) {
                    ((ji.e) obj).t().c("jxz_main_click_in_lesson_wordtips", new lt.e(k3Var, 22));
                    return;
                }
                return;
        }
    }

    @Override // o20.h
    public void y(o20.e eVar, Throwable th2) {
        ((o20.j) this.f40130b).completeExceptionally(th2);
    }

    public x0(sq.g gVar, Context context) {
        this.f40129a = 25;
        this.f40130b = gVar;
        gVar.N = this;
    }

    public x0(Executor executor) {
        this.f40129a = 3;
        Preconditions.k(executor, "object");
        this.f40130b = executor;
    }

    public x0(InstallReferrerClient installReferrerClient, re.e0 e0Var) {
        this.f40129a = 0;
        this.f40130b = installReferrerClient;
    }

    public x0(ArrayList arrayList) {
        this.f40129a = 5;
        this.f40130b = Collections.unmodifiableList(arrayList);
    }

    public x0(vt.i0 courseRepository) {
        this.f40129a = 11;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        this.f40130b = courseRepository;
    }

    @Override // ii.a
    public void A() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    private final void G(Object obj) {
    }
}
