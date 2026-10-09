package ob;

import a0.b2;
import a0.o1;
import a0.p1;
import a0.q1;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.k0;
import androidx.work.impl.WorkDatabase_Impl;
import b7.e0;
import bp.g1;
import bq.r;
import bq.z;
import com.android.billingclient.api.c0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.review.adapter.BaseReviewCateAdapter;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import hj.a3;
import hj.i6;
import hj.r5;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import jp.p0;
import jp.w0;
import lw.s0;
import mw.q2;
import mw.y2;
import n5.g0;
import n5.r0;
import n9.f2;
import q.y;
import qp.m4;
import qp.n2;
import qp.n4;
import qy.b0;
import w2.x;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p.b, pd.f, tx.c, zz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f44816e;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f44812a = i11;
        this.f44813b = obj;
        this.f44814c = obj2;
        this.f44815d = obj3;
        this.f44816e = obj4;
    }

    public static void t(long j11, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j11) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            map.remove(arrayList.get(i11));
        }
    }

    @Override // p.b
    public boolean a(p.c cVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f44813b;
        p.g gVarK = k(cVar);
        t0 t0Var = (t0) this.f44816e;
        Menu yVar = (Menu) t0Var.get(menu);
        if (yVar == null) {
            yVar = new y((Context) this.f44814c, (q.l) menu);
            t0Var.put(menu, yVar);
        }
        return callback.onCreateActionMode(gVarK, yVar);
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f44812a) {
            case 12:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                n4 n4Var = (n4) this.f44813b;
                Word word = (Word) this.f44814c;
                View view = (View) this.f44815d;
                CardView cardView = (CardView) this.f44816e;
                Context context = n4Var.f47883c;
                view.setVisibility(8);
                cardView.setVisibility(8);
                ta.a aVar = n4Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                View childAt = ((a3) aVar).f32341e.getChildAt(n4Var.f48083o);
                kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                CardView cardView2 = (CardView) childAt;
                cardView2.setTag(word);
                cardView2.setCardElevation(ff.h.l(2.0f));
                TextView textView = (TextView) cardView2.findViewById(R.id.tv_top);
                TextView textView2 = (TextView) cardView2.findViewById(R.id.tv_middle);
                TextView textView3 = (TextView) cardView2.findViewById(R.id.tv_bottom);
                textView.setVisibility(0);
                textView3.setVisibility(0);
                kotlin.jvm.internal.m.c(textView2);
                n4Var.B(word, textView, textView2, textView3);
                z.b(cardView2, new n2(3, n4Var, word));
                n4Var.f48082n.add(cardView2);
                th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new m4(cardView2, textView2, n4Var, 0), qp.c.W), n4Var.f47887g);
                n4Var.f47818j = null;
                n4Var.f48083o++;
                ArrayList arrayList = n4Var.m;
                if (arrayList == null) {
                    kotlin.jvm.internal.m.n("views");
                    throw null;
                }
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ArrayList arrayList2 = n4Var.m;
                    if (arrayList2 == null) {
                        kotlin.jvm.internal.m.n("views");
                        throw null;
                    }
                    View view2 = (View) arrayList2.get(i11);
                    kotlin.jvm.internal.m.d(view2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    int defaultColor = ((CardView) view2).getCardBackgroundColor().getDefaultColor();
                    kotlin.jvm.internal.m.f(context, "context");
                    if (defaultColor == context.getColor(R.color.white)) {
                        view2.setClickable(true);
                    } else {
                        view2.setClickable(false);
                    }
                }
                ArrayList arrayList3 = n4Var.m;
                if (arrayList3 == null) {
                    kotlin.jvm.internal.m.n("views");
                    throw null;
                }
                int size2 = arrayList3.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ArrayList arrayList4 = n4Var.m;
                    if (arrayList4 == null) {
                        kotlin.jvm.internal.m.n("views");
                        throw null;
                    }
                    View view3 = (View) arrayList4.get(i12);
                    kotlin.jvm.internal.m.d(view3, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    int defaultColor2 = ((CardView) view3).getCardBackgroundColor().getDefaultColor();
                    kotlin.jvm.internal.m.f(context, "context");
                    if (defaultColor2 == context.getColor(R.color.white)) {
                        return;
                    }
                }
                if (n4Var.f48085q) {
                    return;
                }
                ((p0) n4Var.f47881a).O(5);
                n4Var.f48085q = true;
                return;
            default:
                BaseReviewCateAdapter baseReviewCateAdapter = (BaseReviewCateAdapter) this.f44813b;
                ReviewNew reviewNew = (ReviewNew) this.f44814c;
                BaseViewHolder baseViewHolder = (BaseViewHolder) this.f44815d;
                CheckBox checkBox = (CheckBox) this.f44816e;
                kotlin.jvm.internal.m.c(checkBox);
                baseReviewCateAdapter.e((Word) obj, reviewNew, baseViewHolder, checkBox);
                return;
        }
    }

    @Override // p.b
    public boolean b(p.c cVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f44813b).onActionItemClicked(k(cVar), new androidx.appcompat.view.menu.a((Context) this.f44814c, (t4.a) menuItem));
    }

    @Override // p.b
    public boolean c(p.c cVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f44813b;
        p.g gVarK = k(cVar);
        t0 t0Var = (t0) this.f44816e;
        Menu yVar = (Menu) t0Var.get(menu);
        if (yVar == null) {
            yVar = new y((Context) this.f44814c, (q.l) menu);
            t0Var.put(menu, yVar);
        }
        return callback.onPrepareActionMode(gVarK, yVar);
    }

    public ArrayList d(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f44813b;
        t(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f44814c;
        t(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            j7.b bVar = (j7.b) list.get(i11);
            if (!map.containsKey(bVar.f36095b) && !map2.containsKey(Integer.valueOf(bVar.f36096c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public com.android.billingclient.api.h e() {
        ArrayList arrayList = (ArrayList) this.f44815d;
        boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (!z11) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        ArrayList arrayList2 = (ArrayList) this.f44815d;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                if (((com.android.billingclient.api.f) obj) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
        }
        com.android.billingclient.api.h hVar = new com.android.billingclient.api.h();
        hVar.f7508a = z11 && !((com.android.billingclient.api.f) ((ArrayList) this.f44815d).get(0)).f7502a.f7563b.optString("packageName").isEmpty();
        hVar.f7509b = (String) this.f44813b;
        hVar.f7510c = (String) this.f44814c;
        com.android.billingclient.api.g gVar = (com.android.billingclient.api.g) this.f44816e;
        boolean z12 = true;
        if (TextUtils.isEmpty((String) gVar.f7507c) && TextUtils.isEmpty(null)) {
            z12 = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z12 && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!gVar.f7505a && !z12 && zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        c0 c0Var = new c0((char) 0, 2);
        c0Var.f7471c = (String) gVar.f7507c;
        c0Var.f7470b = gVar.f7506b;
        hVar.f7511d = c0Var;
        hVar.f7513f = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f44815d;
        hVar.f7512e = arrayList3 != null ? zzbt.m(arrayList3) : zzbt.n();
        return hVar;
    }

    public void f() {
        r5 r5Var = (r5) this.f44813b;
        r5Var.f33230c.m.setVisibility(8);
        r5Var.f33230c.f32732j.setVisibility(8);
        r5Var.f33230c.f32730h.setImageResource(0);
        r5Var.f33230c.f32731i.setImageResource(0);
        Bitmap bitmap = (Bitmap) this.f44816e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f44816e = null;
    }

    public void g(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((t0) this.f44814c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                g(arrayList2.get(i11), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void h(s2.l lVar, boolean z11) {
        s2.z zVar = (s2.z) this.f44816e;
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((s2.t) r9.get(i11)).b()) {
                w(lVar);
                return;
            }
        }
        x xVar = (x) this.f44813b;
        if (xVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        s2.s.h(lVar, xVar.P(0L), new a0.e(23, this, zVar), false);
        if (((s2.x) this.f44814c) == s2.x.Dispatching) {
            if (z11) {
                int size2 = r9.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((s2.t) r9.get(i12)).a();
                }
            }
            ie.o oVar = lVar.f51329b;
            if (oVar != null) {
                oVar.f34405b = !zVar.f51375c;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(xy.c cVar) {
        n5.g gVar;
        i iVar;
        n5.c cVar2;
        n5.v vVar = (n5.v) this.f44816e;
        if (cVar instanceof n5.g) {
            gVar = (n5.g) cVar;
            int i11 = gVar.f43274d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f43274d = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new n5.g(this, cVar);
            }
        } else {
            gVar = new n5.g(this, cVar);
        }
        Object objF = gVar.f43272b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar.f43274d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objF);
            List list = (List) this.f44815d;
            if (list == null || list.isEmpty()) {
                gVar.f43271a = this;
                gVar.f43274d = 1;
                objF = n5.v.f(vVar, false, gVar);
                if (objF != aVar) {
                    iVar = this;
                    cVar2 = (n5.c) objF;
                }
            } else {
                g0 g0VarG = vVar.g();
                n5.j jVar = new n5.j(vVar, this, null);
                gVar.f43271a = this;
                gVar.f43274d = 2;
                objF = g0VarG.b(jVar, gVar);
                if (objF != aVar) {
                    iVar = this;
                    cVar2 = (n5.c) objF;
                }
            }
            return aVar;
        }
        if (i12 == 1) {
            iVar = gVar.f43271a;
            com.bumptech.glide.e.F(objF);
            cVar2 = (n5.c) objF;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = gVar.f43271a;
            com.bumptech.glide.e.F(objF);
            cVar2 = (n5.c) objF;
        }
        ((n5.v) iVar.f44816e).f43405h.q(cVar2);
        return b0.f48488a;
    }

    @Override // p.b
    public void j(p.c cVar) {
        ((ActionMode.Callback) this.f44813b).onDestroyActionMode(k(cVar));
    }

    public p.g k(p.c cVar) {
        ArrayList arrayList = (ArrayList) this.f44815d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            p.g gVar = (p.g) arrayList.get(i11);
            if (gVar != null && gVar.f46193b == cVar) {
                return gVar;
            }
        }
        p.g gVar2 = new p.g((Context) this.f44814c, cVar);
        arrayList.add(gVar2);
        return gVar2;
    }

    public g l(j id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        String str = id2.f44817a;
        int i11 = id2.f44818b;
        w9.u uVarB = w9.u.b(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        uVarB.l(1, str);
        uVarB.g(2, i11);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44813b;
        workDatabase_Impl.b();
        Cursor cursorF = cf.x.F(workDatabase_Impl, uVarB, false);
        try {
            return cursorF.moveToFirst() ? new g(cursorF.getString(c.a.l(cursorF, "work_spec_id")), cursorF.getInt(c.a.l(cursorF, "generation")), cursorF.getInt(c.a.l(cursorF, "system_id"))) : null;
        } finally {
            cursorF.close();
            uVarB.release();
        }
    }

    public b0.s m(b0.s sVar, b0.s sVar2) {
        if (((b0.s) this.f44816e) == null) {
            this.f44816e = sVar.c();
        }
        b0.s sVar3 = (b0.s) this.f44816e;
        if (sVar3 == null) {
            kotlin.jvm.internal.m.n("targetVector");
            throw null;
        }
        int i11 = 0;
        for (int iB = sVar3.b(); i11 < iB; iB = iB) {
            b0.s sVar4 = (b0.s) this.f44816e;
            if (sVar4 == null) {
                kotlin.jvm.internal.m.n("targetVector");
                throw null;
            }
            b2 b2Var = (b2) this.f44813b;
            float fA = sVar.a(i11);
            float fA2 = sVar2.a(i11);
            p1 p1Var = (p1) b2Var.f27b;
            double dB = p1Var.b(fA2);
            double d5 = q1.f176a;
            float f5 = p1Var.f166a * p1Var.f167b;
            sVar4.e(i11, (Math.signum(fA2) * ((float) (Math.exp((d5 / (d5 - 1.0d)) * dB) * ((double) f5)))) + fA);
            i11++;
        }
        b0.s sVar5 = (b0.s) this.f44816e;
        if (sVar5 != null) {
            return sVar5;
        }
        kotlin.jvm.internal.m.n("targetVector");
        throw null;
    }

    public b0.s n(long j11, b0.s sVar, b0.s sVar2) {
        if (((b0.s) this.f44815d) == null) {
            this.f44815d = sVar.c();
        }
        b0.s sVar3 = (b0.s) this.f44815d;
        if (sVar3 == null) {
            kotlin.jvm.internal.m.n("velocityVector");
            throw null;
        }
        int iB = sVar3.b();
        for (int i11 = 0; i11 < iB; i11++) {
            b0.s sVar4 = (b0.s) this.f44815d;
            if (sVar4 == null) {
                kotlin.jvm.internal.m.n("velocityVector");
                throw null;
            }
            b2 b2Var = (b2) this.f44813b;
            sVar.getClass();
            long j12 = j11 / 1000000;
            o1 o1VarA = ((p1) b2Var.f27b).a(sVar2.a(i11));
            long j13 = o1VarA.f157c;
            sVar4.e(i11, (((Math.signum(o1VarA.f155a) * a0.b.a(j13 > 0 ? j12 / j13 : 1.0f).f11b) * o1VarA.f156b) / j13) * 1000.0f);
        }
        b0.s sVar5 = (b0.s) this.f44815d;
        if (sVar5 != null) {
            return sVar5;
        }
        kotlin.jvm.internal.m.n("velocityVector");
        throw null;
    }

    public void o() {
        r5 r5Var = (r5) this.f44813b;
        r5Var.f33230c.f32728f.getText().clear();
        i6 i6Var = r5Var.f33230c;
        i6Var.f32733k.setBackgroundResource(R.drawable.share_content_toolbar_bg);
        i6Var.f32726d.setVisibility(8);
        final int i11 = 0;
        z.b(i6Var.f32729g, new fz.c(this) { // from class: vq.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ob.i f54123b;

            {
                this.f54123b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                b0 b0Var = b0.f48488a;
                ob.i iVar = this.f54123b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        iVar.f();
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = (Env) iVar.f44815d;
                        l.m mVar = (l.m) iVar.f44814c;
                        if (env.isUnloginUser()) {
                            k0 k0VarC = mVar.getSupportFragmentManager().C(R.id.fl_container);
                            kotlin.jvm.internal.m.d(k0VarC, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseTipsFragment");
                            i.c cVar = ((w0) k0VarC).S;
                            int i13 = LoginActivity.Q;
                            cVar.a(g1.p(mVar, 10));
                        } else if (TextUtils.isEmpty(((r5) iVar.f44813b).f33230c.f32728f.getText())) {
                            String string = mVar.getString(R.string.please_tell_us_more_about_the_problem);
                            kotlin.jvm.internal.m.e(string, "getString(...)");
                            ff.h.C(string);
                        } else if (((Bitmap) iVar.f44816e) == null) {
                            ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                            iVar.f();
                        } else {
                            int[] iArr = r.f4959a;
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(defpackage.e.m(env.feedbackDir, "android_" + bq.m.r(env.keyLanguage) + "_" + UUID.randomUUID() + ".jpg"));
                                try {
                                    Bitmap bitmap = (Bitmap) iVar.f44816e;
                                    kotlin.jvm.internal.m.c(bitmap);
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ns.o.m(fileOutputStream, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                                ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                                iVar.f();
                            }
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(8);
                        ((r5) iVar.f44813b).f33230c.f32731i.setVisibility(8);
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(0);
                        r5 r5Var2 = (r5) iVar.f44813b;
                        r5Var2.f33230c.f32731i.setVisibility(0);
                        i6 i6Var2 = r5Var2.f33230c;
                        ViewGroup.LayoutParams layoutParams = i6Var2.f32731i.getLayoutParams();
                        layoutParams.width = (e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var2.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) iVar.f44816e);
                        return b0Var;
                }
            }
        });
        i6Var.f32728f.addTextChangedListener(new hh.s(this, 10));
        final int i12 = 1;
        z.b(i6Var.f32724b, new fz.c(this) { // from class: vq.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ob.i f54123b;

            {
                this.f54123b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                b0 b0Var = b0.f48488a;
                ob.i iVar = this.f54123b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        iVar.f();
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = (Env) iVar.f44815d;
                        l.m mVar = (l.m) iVar.f44814c;
                        if (env.isUnloginUser()) {
                            k0 k0VarC = mVar.getSupportFragmentManager().C(R.id.fl_container);
                            kotlin.jvm.internal.m.d(k0VarC, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseTipsFragment");
                            i.c cVar = ((w0) k0VarC).S;
                            int i14 = LoginActivity.Q;
                            cVar.a(g1.p(mVar, 10));
                        } else if (TextUtils.isEmpty(((r5) iVar.f44813b).f33230c.f32728f.getText())) {
                            String string = mVar.getString(R.string.please_tell_us_more_about_the_problem);
                            kotlin.jvm.internal.m.e(string, "getString(...)");
                            ff.h.C(string);
                        } else if (((Bitmap) iVar.f44816e) == null) {
                            ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                            iVar.f();
                        } else {
                            int[] iArr = r.f4959a;
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(defpackage.e.m(env.feedbackDir, "android_" + bq.m.r(env.keyLanguage) + "_" + UUID.randomUUID() + ".jpg"));
                                try {
                                    Bitmap bitmap = (Bitmap) iVar.f44816e;
                                    kotlin.jvm.internal.m.c(bitmap);
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ns.o.m(fileOutputStream, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                                ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                                iVar.f();
                            }
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(8);
                        ((r5) iVar.f44813b).f33230c.f32731i.setVisibility(8);
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(0);
                        r5 r5Var2 = (r5) iVar.f44813b;
                        r5Var2.f33230c.f32731i.setVisibility(0);
                        i6 i6Var2 = r5Var2.f33230c;
                        ViewGroup.LayoutParams layoutParams = i6Var2.f32731i.getLayoutParams();
                        layoutParams.width = (e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var2.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) iVar.f44816e);
                        return b0Var;
                }
            }
        });
        final int i13 = 2;
        z.b(i6Var.f32734l, new fz.c(this) { // from class: vq.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ob.i f54123b;

            {
                this.f54123b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                b0 b0Var = b0.f48488a;
                ob.i iVar = this.f54123b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        iVar.f();
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = (Env) iVar.f44815d;
                        l.m mVar = (l.m) iVar.f44814c;
                        if (env.isUnloginUser()) {
                            k0 k0VarC = mVar.getSupportFragmentManager().C(R.id.fl_container);
                            kotlin.jvm.internal.m.d(k0VarC, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseTipsFragment");
                            i.c cVar = ((w0) k0VarC).S;
                            int i15 = LoginActivity.Q;
                            cVar.a(g1.p(mVar, 10));
                        } else if (TextUtils.isEmpty(((r5) iVar.f44813b).f33230c.f32728f.getText())) {
                            String string = mVar.getString(R.string.please_tell_us_more_about_the_problem);
                            kotlin.jvm.internal.m.e(string, "getString(...)");
                            ff.h.C(string);
                        } else if (((Bitmap) iVar.f44816e) == null) {
                            ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                            iVar.f();
                        } else {
                            int[] iArr = r.f4959a;
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(defpackage.e.m(env.feedbackDir, "android_" + bq.m.r(env.keyLanguage) + "_" + UUID.randomUUID() + ".jpg"));
                                try {
                                    Bitmap bitmap = (Bitmap) iVar.f44816e;
                                    kotlin.jvm.internal.m.c(bitmap);
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ns.o.m(fileOutputStream, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                                ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                                iVar.f();
                            }
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(8);
                        ((r5) iVar.f44813b).f33230c.f32731i.setVisibility(8);
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(0);
                        r5 r5Var2 = (r5) iVar.f44813b;
                        r5Var2.f33230c.f32731i.setVisibility(0);
                        i6 i6Var2 = r5Var2.f33230c;
                        ViewGroup.LayoutParams layoutParams = i6Var2.f32731i.getLayoutParams();
                        layoutParams.width = (e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var2.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) iVar.f44816e);
                        return b0Var;
                }
            }
        });
        final int i14 = 3;
        z.b(i6Var.f32730h, new fz.c(this) { // from class: vq.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ob.i f54123b;

            {
                this.f54123b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                b0 b0Var = b0.f48488a;
                ob.i iVar = this.f54123b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        iVar.f();
                        return b0Var;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = (Env) iVar.f44815d;
                        l.m mVar = (l.m) iVar.f44814c;
                        if (env.isUnloginUser()) {
                            k0 k0VarC = mVar.getSupportFragmentManager().C(R.id.fl_container);
                            kotlin.jvm.internal.m.d(k0VarC, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseTipsFragment");
                            i.c cVar = ((w0) k0VarC).S;
                            int i16 = LoginActivity.Q;
                            cVar.a(g1.p(mVar, 10));
                        } else if (TextUtils.isEmpty(((r5) iVar.f44813b).f33230c.f32728f.getText())) {
                            String string = mVar.getString(R.string.please_tell_us_more_about_the_problem);
                            kotlin.jvm.internal.m.e(string, "getString(...)");
                            ff.h.C(string);
                        } else if (((Bitmap) iVar.f44816e) == null) {
                            ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                            iVar.f();
                        } else {
                            int[] iArr = r.f4959a;
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(defpackage.e.m(env.feedbackDir, "android_" + bq.m.r(env.keyLanguage) + "_" + UUID.randomUUID() + ".jpg"));
                                try {
                                    Bitmap bitmap = (Bitmap) iVar.f44816e;
                                    kotlin.jvm.internal.m.c(bitmap);
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ns.o.m(fileOutputStream, th2);
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                                ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                                iVar.f();
                            }
                        }
                        return b0Var;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(8);
                        ((r5) iVar.f44813b).f33230c.f32731i.setVisibility(8);
                        return b0Var;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ((r5) iVar.f44813b).f33230c.f32734l.setVisibility(0);
                        r5 r5Var2 = (r5) iVar.f44813b;
                        r5Var2.f33230c.f32731i.setVisibility(0);
                        i6 i6Var2 = r5Var2.f33230c;
                        ViewGroup.LayoutParams layoutParams = i6Var2.f32731i.getLayoutParams();
                        layoutParams.width = (e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var2.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) iVar.f44816e);
                        return b0Var;
                }
            }
        });
        l.m mVar = (l.m) this.f44814c;
        Bitmap bitmapS = gb.r.S(mVar);
        this.f44816e = bitmapS;
        i6Var.f32730h.setImageBitmap(bitmapS);
        i6Var.m.setVisibility(0);
        i6Var.f32732j.setVisibility(0);
        i6Var.f32732j.setBackgroundColor(mVar.getColor(R.color.color_B3000000));
    }

    public void p(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44813b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f44814c).m(gVar);
            workDatabase_Impl.x();
        } finally {
            workDatabase_Impl.s();
        }
    }

    public synchronized boolean q(pd.h hVar) {
        try {
            String cacheKey = hVar.getCacheKey();
            if (!((HashMap) this.f44813b).containsKey(cacheKey)) {
                ((HashMap) this.f44813b).put(cacheKey, null);
                hVar.setNetworkRequestCompleteListener(this);
                if (pd.p.f46808a) {
                    pd.p.a("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List arrayList = (List) ((HashMap) this.f44813b).get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            hVar.addMarker("waiting-for-response");
            arrayList.add(hVar);
            ((HashMap) this.f44813b).put(cacheKey, arrayList);
            if (pd.p.f46808a) {
                pd.p.a("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void r(f2 f2Var, fz.e eVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44816e;
        try {
            reentrantLock.lock();
            if (f2Var != null) {
                this.f44815d = f2Var;
            }
            eVar.invoke((n9.o) this.f44813b, (n9.o) this.f44814c);
        } finally {
            reentrantLock.unlock();
        }
    }

    public synchronized void s(pd.h hVar) {
        BlockingQueue blockingQueue;
        try {
            String cacheKey = hVar.getCacheKey();
            List list = (List) ((HashMap) this.f44813b).remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (pd.p.f46808a) {
                    pd.p.b("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                pd.h hVar2 = (pd.h) list.remove(0);
                ((HashMap) this.f44813b).put(cacheKey, list);
                hVar2.setNetworkRequestCompleteListener(this);
                if (((pd.b) this.f44815d) != null && (blockingQueue = (BlockingQueue) this.f44816e) != null) {
                    try {
                        blockingQueue.put(hVar2);
                    } catch (InterruptedException e8) {
                        pd.p.a("Couldn't add request to queue. %s", e8.toString());
                        Thread.currentThread().interrupt();
                        pd.b bVar = (pd.b) this.f44815d;
                        bVar.f46774e = true;
                        bVar.interrupt();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(xy.c cVar) throws Throwable {
        r0 r0Var;
        a00.a aVar;
        i iVar;
        a00.a aVar2;
        Throwable th2;
        i iVar2;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i11 = r0Var.f43373e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r0Var.f43373e = i11 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        Object obj = r0Var.f43371c;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = r0Var.f43373e;
        b0 b0Var = b0.f48488a;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                if (((rz.t) this.f44814c).H()) {
                    return b0Var;
                }
                aVar = (a00.e) this.f44813b;
                r0Var.f43369a = this;
                r0Var.f43370b = aVar;
                r0Var.f43373e = 1;
                if (aVar.b(r0Var) != aVar3) {
                    iVar = this;
                }
                return aVar3;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = r0Var.f43370b;
                iVar2 = r0Var.f43369a;
                try {
                    com.bumptech.glide.e.F(obj);
                    ((rz.t) iVar2.f44814c).J(b0Var);
                    aVar2.a(null);
                    return b0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.a(null);
                    throw th2;
                }
            }
            a00.a aVar4 = r0Var.f43370b;
            iVar = r0Var.f43369a;
            com.bumptech.glide.e.F(obj);
            aVar = aVar4;
            if (((rz.t) iVar.f44814c).H()) {
                aVar.a(null);
                return b0Var;
            }
            r0Var.f43369a = iVar;
            r0Var.f43370b = aVar;
            r0Var.f43373e = 2;
            if (iVar.i(r0Var) != aVar3) {
                aVar2 = aVar;
                iVar2 = iVar;
                ((rz.t) iVar2.f44814c).J(b0Var);
                aVar2.a(null);
                return b0Var;
            }
            return aVar3;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.a(null);
            throw th2;
        }
    }

    public j7.b v(List list) {
        j7.b bVar;
        HashMap map = (HashMap) this.f44815d;
        ArrayList arrayListD = d(list);
        if (arrayListD.size() < 2) {
            return (j7.b) Iterators.h(arrayListD.iterator(), null);
        }
        Collections.sort(arrayListD, new bq.h(7));
        ArrayList arrayList = new ArrayList();
        int i11 = ((j7.b) arrayListD.get(0)).f36096c;
        for (int i12 = 0; i12 < arrayListD.size(); i12++) {
            j7.b bVar2 = (j7.b) arrayListD.get(i12);
            if (i11 != bVar2.f36096c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (j7.b) arrayListD.get(0);
            }
            arrayList.add(new Pair(bVar2.f36095b, Integer.valueOf(bVar2.f36097d)));
        }
        j7.b bVar3 = (j7.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListD.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            i13 += ((j7.b) listSubList.get(i14)).f36097d;
        }
        int iNextInt = ((Random) this.f44816e).nextInt(i13);
        int i15 = 0;
        for (int i16 = 0; i16 < listSubList.size(); i16++) {
            bVar = (j7.b) listSubList.get(i16);
            i15 += bVar.f36097d;
            if (iNextInt < i15) {
                map.put(arrayList, bVar);
                return bVar;
            }
        }
        bVar = (j7.b) Iterables.c(listSubList);
        map.put(arrayList, bVar);
        return bVar;
    }

    public void w(s2.l lVar) {
        if (((s2.x) this.f44814c) == s2.x.Dispatching) {
            x xVar = (x) this.f44813b;
            if (xVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            s2.s.h(lVar, xVar.P(0L), new s2.y((s2.z) this.f44816e, 1), true);
        }
        this.f44814c = s2.x.NotDispatching;
    }

    public i(WorkDatabase_Impl workDatabase_Impl) {
        this.f44812a = 0;
        this.f44813b = workDatabase_Impl;
        this.f44814c = new b(workDatabase_Impl, 2);
        this.f44815d = new h(workDatabase_Impl, 0);
        this.f44816e = new h(workDatabase_Impl, 1);
    }

    public i(r5 binding, l.m activity, Env mEnv) {
        this.f44812a = 17;
        kotlin.jvm.internal.m.f(binding, "binding");
        kotlin.jvm.internal.m.f(activity, "activity");
        kotlin.jvm.internal.m.f(mEnv, "mEnv");
        this.f44813b = binding;
        this.f44814c = activity;
        this.f44815d = mEnv;
    }

    public i(int i11) {
        this.f44812a = i11;
        switch (i11) {
            case 4:
                Random random = new Random();
                this.f44815d = new HashMap();
                this.f44816e = random;
                this.f44813b = new HashMap();
                this.f44814c = new HashMap();
                break;
            case 5:
                this.f44813b = new b4.d(10);
                this.f44814c = new t0(0);
                this.f44815d = new ArrayList();
                this.f44816e = new HashSet();
                break;
        }
    }

    public i(s2.z zVar) {
        this.f44812a = 13;
        this.f44816e = zVar;
        this.f44814c = s2.x.Unknown;
    }

    public i(pd.b bVar, BlockingQueue blockingQueue, o20.i iVar) {
        this.f44812a = 11;
        this.f44813b = new HashMap();
        this.f44814c = iVar;
        this.f44815d = bVar;
        this.f44816e = blockingQueue;
    }

    public i(Typeface typeface, w5.b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        this.f44812a = 16;
        this.f44816e = typeface;
        this.f44813b = bVar;
        this.f44815d = new v5.s(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i15 = iA + bVar.f51940a;
            i11 = ((ByteBuffer) bVar.f51943d).getInt(((ByteBuffer) bVar.f51943d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        this.f44814c = new char[i11 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i16 = iA2 + bVar.f51940a;
            i12 = ((ByteBuffer) bVar.f51943d).getInt(((ByteBuffer) bVar.f51943d).getInt(i16) + i16);
        } else {
            i12 = 0;
        }
        for (int i17 = 0; i17 < i12; i17++) {
            v5.v vVar = new v5.v(this, i17);
            w5.a aVarB = vVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f51943d).getInt(iA3 + aVarB.f51940a) : 0, (char[]) this.f44814c, i17 * 2);
            w5.a aVarB2 = vVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i18 = iA4 + aVarB2.f51940a;
                i13 = ((ByteBuffer) aVarB2.f51943d).getInt(((ByteBuffer) aVarB2.f51943d).getInt(i18) + i18);
            } else {
                i13 = 0;
            }
            ns.o.j("invalid metadata codepoint length", i13 > 0);
            v5.s sVar = (v5.s) this.f44815d;
            w5.a aVarB3 = vVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i19 = iA5 + aVarB3.f51940a;
                i14 = ((ByteBuffer) aVarB3.f51943d).getInt(((ByteBuffer) aVarB3.f51943d).getInt(i19) + i19);
            } else {
                i14 = 0;
            }
            sVar.a(vVar, 0, i14 - 1);
        }
    }

    public i(mw.r5 r5Var, q2 q2Var) {
        this.f44812a = 6;
        this.f44816e = r5Var;
        this.f44813b = q2Var;
        s0 s0Var = (s0) r5Var.f42667a;
        String str = (String) r5Var.f42668b;
        lw.r0 r0VarB = s0Var.b(str);
        this.f44815d = r0VarB;
        if (r0VarB != null) {
            this.f44814c = r0VarB.g(q2Var);
            return;
        }
        throw new IllegalStateException(ep.a.g("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
    }

    public i(n9.q qVar) {
        this.f44812a = 9;
        this.f44813b = new n9.o();
        this.f44814c = new n9.o();
        this.f44816e = new ReentrantLock();
    }

    public i(b2 b2Var) {
        this.f44812a = 1;
        this.f44813b = b2Var;
    }

    public i(Context context, ActionMode.Callback callback) {
        this.f44812a = 10;
        this.f44814c = context;
        this.f44813b = callback;
        this.f44815d = new ArrayList();
        this.f44816e = new t0(0);
    }

    public i(List list, c cVar, e eVar, l lVar) {
        this.f44812a = 2;
        this.f44813b = list != null ? ImmutableList.n(list) : ImmutableList.s();
        this.f44814c = cVar;
        this.f44815d = eVar;
        this.f44816e = lVar;
    }

    public i(n5.v vVar, List list) {
        this.f44812a = 8;
        this.f44816e = vVar;
        this.f44813b = new a00.e();
        this.f44814c = rz.e0.b();
        this.f44815d = ry.m.a1(list);
    }

    public i(y2 y2Var) {
        this.f44812a = 7;
        this.f44816e = y2Var;
        this.f44813b = new Object();
        this.f44814c = new HashSet();
    }
}
