package ob;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.impl.WorkDatabase_Impl;
import b0.h2;
import b7.w;
import bp.u3;
import coil.request.NullRequestDataException;
import com.android.billingclient.api.i0;
import com.android.billingclient.api.k0;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.lingo.fluent.ui.base.adapter.PdLearnSpeakAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.espanskill.ui.learn.ESSyllableIntroductionActivity;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.speak.object.PodUser;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.stkouyu.listener.OnInitEngineListener;
import e9.b0;
import e9.c0;
import e9.d0;
import f7.x;
import fr.j3;
import fr.p3;
import g00.b1;
import g00.c1;
import g00.n0;
import h7.a0;
import hh.h0;
import hh.j0;
import hh.p0;
import hj.j4;
import j3.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.g1;
import jp.h1;
import km.p1;
import mt.l0;
import n0.y;
import org.greenrobot.greendao.DaoException;
import p7.y0;
import rz.e0;
import rz.o0;
import w2.r1;
import w2.s1;
import y.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements OnInitEngineListener, g1, i0, b0, ki.a, c1, tx.c, th.c, InstallReferrerStateListener, l1.h, s1, ValueEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44800c;

    public /* synthetic */ c(int i11) {
        this.f44798a = i11;
    }

    public static gc.e n(gc.i iVar, Throwable th2) {
        if (th2 instanceof NullRequestDataException) {
            iVar.getClass();
            gc.c cVar = iVar.f29042z;
            cVar.getClass();
            gc.c cVar2 = kc.f.f38055a;
            cVar.getClass();
        } else {
            iVar.f29042z.getClass();
            gc.c cVar3 = kc.f.f38055a;
        }
        return new gc.e(null, iVar, th2);
    }

    public void A(zzjo zzjoVar) {
        try {
            k0 k0Var = (k0) this.f44800c;
            zzjg zzjgVarV = zzji.v();
            zzjgVarV.i((zzis) this.f44799b);
            zzjgVarV.h();
            zzji.t((zzji) zzjgVarV.f12378b, zzjoVar);
            k0Var.s((zzji) zzjgVarV.f());
        } catch (Throwable unused) {
            int i11 = zzc.f12272a;
        }
    }

    @Override // ki.a
    public void B() {
        int i11 = this.f44798a;
    }

    public void C(zzhx zzhxVar, zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            zzjg zzjgVarV = zzji.v();
            zzjgVarV.i(zzisVar);
            zzjgVarV.h();
            zzji.p((zzji) zzjgVarV.f12378b, zzhxVar);
            ((k0) this.f44800c).s((zzji) zzjgVarV.f());
        } catch (Throwable unused) {
            int i11 = zzc.f12272a;
        }
    }

    public void D(zzib zzibVar, zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            zzjg zzjgVarV = zzji.v();
            zzjgVarV.i(zzisVar);
            zzjgVarV.h();
            zzji.q((zzji) zzjgVarV.f12378b, zzibVar);
            ((k0) this.f44800c).s((zzji) zzjgVarV.f());
        } catch (Throwable unused) {
            int i11 = zzc.f12272a;
        }
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void E(DataSnapshot dataSnapshot) {
        PodUser podUser = (PodUser) this.f44800c;
        if (dataSnapshot.f18954a.f19539a.isEmpty()) {
            return;
        }
        DatabaseReference databaseReference = ((no.s) this.f44799b).f43917b;
        if (databaseReference != null) {
            databaseReference.e(podUser.getUid()).h(podUser.toLatestMap());
        } else {
            kotlin.jvm.internal.m.n("mLatestUserDb");
            throw null;
        }
    }

    @Override // th.c, th.b
    public void a() {
        PdLearnSpeakAdapter pdLearnSpeakAdapter = (PdLearnSpeakAdapter) this.f44800c;
        Drawable drawable = ((ImageView) this.f44799b).getDrawable();
        kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        xx.f fVar = pdLearnSpeakAdapter.f21650l;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        xx.f fVarH = qx.h.m(800L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(pdLearnSpeakAdapter, 18), vx.b.f54316e);
        th.j.a(fVarH, pdLearnSpeakAdapter.f21639a);
        pdLearnSpeakAdapter.f21650l = fVarH;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fd  */
    @Override // tx.c
    public void accept(Object obj) {
        long j11;
        switch (this.f44798a) {
            case 12:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                jh.a aVar = ((hh.f) this.f44799b).P;
                if (aVar != null) {
                    aVar.f36338a.setValue((PdLesson) this.f44800c);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("mViewModel");
                    throw null;
                }
            case 13:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                j0 j0Var = (j0) this.f44799b;
                ta.a aVar2 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                LinearLayout linearLayout = ((j4) aVar2).f32774k;
                ta.a aVar3 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                View childAt = linearLayout.getChildAt(((j4) aVar3).f32774k.getChildCount() - 1);
                int height = childAt.getHeight() + ((int) childAt.getY());
                ta.a aVar4 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                float height2 = height - ((j4) aVar4).f32775l.getHeight();
                Context contextRequireContext = j0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                int iZ = (int) (j3.Z(162, contextRequireContext) + height2);
                ta.a aVar5 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((j4) aVar5).f32775l.getScrollY(), iZ);
                valueAnimatorOfInt.addUpdateListener(new h0(j0Var, 0));
                ta.a aVar6 = j0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                if (((j4) aVar6).f32775l.getScrollY() != 0 || iZ > 0) {
                    ta.a aVar7 = j0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    if (((j4) aVar7).f32775l.getScrollY() == iZ) {
                        j11 = 0;
                    } else {
                        j11 = 200;
                    }
                } else {
                    j11 = 0;
                }
                valueAnimatorOfInt.setDuration(j11);
                valueAnimatorOfInt.start();
                th.j.a(qx.h.m(j11 + ((long) 50), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b1.p(13, j0Var, (kotlin.jvm.internal.u) this.f44800c), vx.b.f54316e), j0Var.f36401t);
                return;
            case 18:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ((TextView) this.f44799b).setText("找不到句子解释！！！");
                a5.f fVar = ((AbsDialogModelAdapter) this.f44800c).f22060i;
                if (fVar != null) {
                    fVar.q();
                }
                it3.printStackTrace();
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Long it4 = (Long) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                FrameLayout frameLayout = (FrameLayout) this.f44799b;
                frameLayout.setBackgroundResource(0);
                Context context = ((om.m) this.f44800c).H;
                if (context != null) {
                    frameLayout.setForeground(new ColorDrawable(context.getColor(R.color.color_ccwhite)));
                    return;
                } else {
                    kotlin.jvm.internal.m.n("mContext");
                    throw null;
                }
            default:
                List list = (List) this.f44800c;
                pp.e eVar = (pp.e) this.f44799b;
                if (((Boolean) obj).booleanValue()) {
                    pp.e.a(eVar, list);
                    return;
                } else {
                    eVar.f(list);
                    return;
                }
        }
    }

    @Override // e9.b0
    public void c(w wVar) {
        d0 d0Var = (d0) this.f44800c;
        SparseArray sparseArray = d0Var.f25186g;
        b7.v vVar = (b7.v) this.f44799b;
        if (wVar.w() == 0 && (wVar.w() & 128) != 0) {
            wVar.J(6);
            int iA = wVar.a() / 4;
            for (int i11 = 0; i11 < iA; i11++) {
                wVar.h(vVar.f4032b, 0, 4);
                vVar.q(0);
                int i12 = vVar.i(16);
                vVar.t(3);
                if (i12 == 0) {
                    vVar.t(13);
                } else {
                    int i13 = vVar.i(13);
                    if (sparseArray.get(i13) == null) {
                        sparseArray.put(i13, new c0(new a.a(d0Var, i13)));
                        d0Var.m++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // l1.h
    public void cancel() {
        if (((t1.a) this.f44800c).compareAndSet(1, 1)) {
            return;
        }
        ((l0) this.f44799b).invoke();
    }

    @Override // com.google.firebase.database.ValueEventListener
    public void d(DatabaseError databaseError) {
        kotlin.jvm.internal.m.f(databaseError, "databaseError");
    }

    @Override // jp.g1
    public void e() {
        ci.v vVar = (ci.v) this.f44799b;
        l.m mVar = vVar.f36398d;
        if (mVar != null) {
            mVar.setResult(INTENTS.RESULT_LESSON_QUIT);
            l.m mVar2 = vVar.f36398d;
            kotlin.jvm.internal.m.c(mVar2);
            mVar2.finish();
        }
        e0.B(LifecycleOwnerKt.getLifecycleScope(vVar), null, null, new ci.u(vVar, null, 1), 3);
    }

    public boolean equals(Object obj) {
        switch (this.f44798a) {
            case 6:
                if (!(obj instanceof y4.b)) {
                    return false;
                }
                y4.b bVar = (y4.b) obj;
                Object obj2 = bVar.f57088a;
                String str = (String) this.f44799b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = bVar.f57089b;
                String str2 = (String) this.f44800c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    @Override // jp.g1
    public void f() {
        ((h1) this.f44800c).v();
    }

    @Override // g00.c1
    public Object g(mz.c cVar, ArrayList arrayList) {
        Object objL;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f44800c;
        Class clsP = qx.b.p(cVar);
        Object b1Var = concurrentHashMap.get(clsP);
        if (b1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsP, (b1Var = new b1()))) != null) {
            b1Var = objPutIfAbsent;
        }
        b1 b1Var2 = (b1) b1Var;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(new n0((mz.k) obj));
        }
        ConcurrentHashMap concurrentHashMap2 = b1Var2.f28364a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                objL = (c00.a) ((fz.e) this.f44799b).invoke(cVar, arrayList);
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            qy.o oVar = new qy.o(objL);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, oVar);
            obj2 = objPutIfAbsent2 == null ? oVar : objPutIfAbsent2;
        }
        return ((qy.o) obj2).f48498a;
    }

    @Override // w2.s1
    public boolean h(Object obj, Object obj2) {
        y yVar = (y) this.f44799b;
        return kotlin.jvm.internal.m.a(yVar.b(obj), yVar.b(obj2));
    }

    public int hashCode() {
        switch (this.f44798a) {
            case 6:
                String str = (String) this.f44799b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.f44800c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // w2.s1
    public void i(r1 r1Var) {
        y.d0 d0Var = (y.d0) this.f44800c;
        d0Var.a();
        f0 f0Var = (f0) r1Var.f54576b;
        Object[] objArr = f0Var.f56693b;
        long[] jArr = f0Var.f56694c;
        int i11 = f0Var.f56696e;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & 2147483647L);
            Object obj = objArr[i11];
            Object objB = ((y) this.f44799b).b(obj);
            int iD = d0Var.d(objB);
            int i13 = iD >= 0 ? d0Var.f56679c[iD] : 0;
            if (i13 == 7) {
                r1Var.remove(obj);
            } else {
                d0Var.g(i13 + 1, objB);
            }
            i11 = i12;
        }
    }

    public o3.w j(List list) {
        o3.g gVar;
        Exception e8;
        try {
            int size = list.size();
            int i11 = 0;
            gVar = null;
            while (i11 < size) {
                try {
                    o3.g gVar2 = (o3.g) list.get(i11);
                    try {
                        gVar2.a((b7.p) this.f44800c);
                        i11++;
                        gVar = gVar2;
                    } catch (Exception e10) {
                        e8 = e10;
                        gVar = gVar2;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(((ar.f) ((b7.p) this.f44800c).f4020f).e());
                        sb3.append(", composition=");
                        sb3.append(((b7.p) this.f44800c).d());
                        sb3.append(", selection=");
                        b7.p pVar = (b7.p) this.f44800c;
                        sb3.append((Object) x0.h(j3.t.b(pVar.f4016b, pVar.f4017c)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        ry.m.x0(list, sb2, "\n", new kp.j(25, gVar, this), 60);
                        String string = sb2.toString();
                        kotlin.jvm.internal.m.e(string, "toString(...)");
                        throw new RuntimeException(string, e8);
                    }
                } catch (Exception e11) {
                    e8 = e11;
                }
            }
            b7.p pVar2 = (b7.p) this.f44800c;
            pVar2.getClass();
            j3.h hVar = new j3.h(((ar.f) pVar2.f4020f).toString());
            b7.p pVar3 = (b7.p) this.f44800c;
            long jB = j3.t.b(pVar3.f4016b, pVar3.f4017c);
            x0 x0Var = x0.g(((o3.w) this.f44799b).f44705b) ? null : new x0(jB);
            o3.w wVar = new o3.w(hVar, x0Var != null ? x0Var.f35823a : j3.t.b(x0.e(jB), x0.f(jB)), ((b7.p) this.f44800c).d());
            this.f44799b = wVar;
            return wVar;
        } catch (Exception e12) {
            gVar = null;
            e8 = e12;
        }
    }

    public void k(org.greenrobot.greendao.d dVar) {
        org.greenrobot.greendao.a aVar = (org.greenrobot.greendao.a) this.f44799b;
        if (aVar != null) {
            for (org.greenrobot.greendao.d dVar2 : aVar.getProperties()) {
                if (dVar == dVar2) {
                    return;
                }
            }
            throw new DaoException("Property '" + dVar.f45725c + "' is not part of " + aVar);
        }
    }

    public f7.e[] l(Handler handler, x xVar, x xVar2, x xVar3, x xVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f44799b;
        v7.h hVar = new v7.h(context);
        ae.b bVar = (ae.b) this.f44800c;
        hVar.f53615c = bVar;
        hVar.f53616d = 5000L;
        hVar.f53617e = handler;
        hVar.f53618f = xVar;
        hVar.f53619g = 50;
        b7.a.j(!hVar.f53614b);
        Handler handler2 = hVar.f53617e;
        b7.a.j((handler2 == null && hVar.f53618f == null) || !(handler2 == null || hVar.f53618f == null));
        hVar.f53614b = true;
        arrayList.add(new v7.j(hVar));
        h7.p pVar = new h7.p(context);
        b7.a.j(!pVar.f31930d);
        pVar.f31930d = true;
        if (pVar.f31929c == null) {
            pVar.f31929c = new xq.c(new z6.f[0]);
        }
        if (pVar.f31933g == null) {
            pVar.f31933g = new u(context, 11);
        }
        arrayList.add(new a0((Context) this.f44799b, bVar, handler, xVar2, new h7.x(pVar)));
        arrayList.add(new r7.e(xVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new n7.b(xVar4, looper));
        arrayList.add(new n7.b(xVar4, looper));
        arrayList.add(new w7.b());
        arrayList.add(new l7.f(new hq.a(context, false)));
        return (f7.e[]) arrayList.toArray(new f7.e[0]);
    }

    @Override // ki.a
    public void m() {
        switch (this.f44798a) {
            case 9:
                int[] iArr = bq.r.f4959a;
                String str = (String) ((kotlin.jvm.internal.y) this.f44799b).f38361a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                bq.m.L(str, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET.txt");
                Toast.makeText((ESSyllableIntroductionActivity) this.f44800c, R.string.success, 1).show();
                break;
            default:
                int[] iArr2 = bq.r.f4959a;
                String str2 = (String) ((kotlin.jvm.internal.y) this.f44799b).f38361a;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                bq.m.L(str2, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET-2.txt");
                Toast.makeText(((p1) this.f44800c).requireContext(), R.string.success, 1).show();
                break;
        }
    }

    public ArrayList o(String str) {
        w9.u uVarB = w9.u.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        uVarB.l(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f44799b;
        workDatabase_Impl.b();
        Cursor cursorF = cf.x.F(workDatabase_Impl, uVarB, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.getString(0));
            }
            cursorF.close();
            uVarB.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorF.close();
            uVarB.release();
            throw th2;
        }
    }

    @Override // com.stkouyu.listener.OnInitEngineListener
    public void onInitEngineFailed(String reason) {
        kotlin.jvm.internal.m.f(reason, "reason");
        a00.e eVar = av.y.f3214d;
        av.y.f3215e = true;
        av.y.a((AtomicBoolean) this.f44799b, (rz.m) this.f44800c, false);
    }

    @Override // com.stkouyu.listener.OnInitEngineListener
    public void onInitEngineSuccess() {
        av.y.a((AtomicBoolean) this.f44799b, (rz.m) this.f44800c, true);
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i11) {
        Object objL;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f44799b;
        if (i11 == 0) {
            try {
                objL = installReferrerClient.getInstallReferrer().getInstallReferrer();
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            ji.b bVar = (ji.b) this.f44800c;
            if (!(objL instanceof qy.n)) {
                e0.B(LifecycleOwnerKt.getLifecycleScope(bVar), null, null, new gu.b(17, bVar, (String) objL, (vy.d) null), 3);
            }
            Throwable thA = qy.o.a(objL);
            if (thA != null) {
                thA.printStackTrace();
            }
            installReferrerClient.endConnection();
        }
    }

    public uz.i p(long j11) {
        bh.t tVar = (bh.t) ((vt.i0) this.f44799b);
        tVar.getClass();
        bh.r rVar = new bh.r(new gp.r(new bh.c(j11, tVar, (vy.d) null, 7)), this, 18);
        yz.f fVar = o0.f50940a;
        return uz.x0.w(rVar, yz.e.f58387a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public gc.l s(gc.i iVar, hc.g gVar) {
        List list = iVar.f29023f;
        Bitmap.Config config = iVar.f29021d;
        if (!list.isEmpty() && !ry.l.D(kc.h.f38057a, config)) {
            config = Bitmap.Config.ARGB_8888;
        } else if (z6.c.k(config)) {
            if (!z6.c.k(config) || iVar.f29028k) {
                if (!((kc.j) this.f44800c).a(gVar)) {
                }
            }
            config = Bitmap.Config.ARGB_8888;
        }
        jh.h hVar = gVar.f32181a;
        hc.b bVar = hc.b.f32178a;
        return new gc.l(iVar.f29018a, config, null, gVar, (hVar.equals(bVar) || gVar.f32182b.equals(bVar)) ? hc.f.FIT : iVar.f29039w, kc.f.a(iVar), iVar.f29029l && iVar.f29023f.isEmpty() && config != Bitmap.Config.ALPHA_8, iVar.m, null, iVar.f29025h, iVar.f29026i, iVar.f29040x, iVar.f29030n, iVar.f29031o, iVar.f29032p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    public Object t(e20.a aVar, oi.c cVar, boolean z11) {
        Object objB;
        Object objO;
        Iterable<e20.a> iterable;
        b20.a aVar2 = aVar.f24765a;
        m mVar = (m) ((a9.i) this.f44799b).f520d;
        a20.a aVar3 = (a20.a) cVar.f44929e;
        b20.a aVar4 = (b20.a) cVar.f44928d;
        String str = (String) cVar.f44930f;
        kotlin.jvm.internal.e eVar = (kotlin.jvm.internal.e) cVar.f44927c;
        h2 h2Var = (h2) cVar.f44925a;
        if (aVar3 == null || aVar3.f320a.isEmpty()) {
            objB = null;
        } else {
            h2Var.V("|- ? " + str + " look in injected parameters");
            objB = aVar3.b(eVar);
        }
        if (objB != null) {
            return objB;
        }
        boolean z12 = aVar.f24767c;
        Object objO2 = mVar.O(aVar4, eVar, aVar2, cVar);
        if (objO2 == null) {
            ThreadLocal threadLocal = aVar.f24771g;
            ry.k kVar = threadLocal != null ? (ry.k) threadLocal.get() : null;
            if (kVar == null || kVar.isEmpty()) {
                objO2 = null;
            } else {
                h2Var.V("|- ? " + str + " look in stack parameters");
                a20.a aVar5 = (a20.a) kVar.g();
                if (aVar5 != null) {
                    objO2 = aVar5.b(eVar);
                } else {
                    objO2 = null;
                }
            }
            if (objO2 == null) {
                if (z12 || !(aVar2 instanceof b20.c)) {
                    objO = null;
                } else {
                    h2Var.V("|- ? " + str + " look at scope archetype");
                    mVar.getClass();
                    b20.c cVar2 = ((e20.a) cVar.f44926b).f24768d;
                    if (cVar2 != null) {
                        objO = mVar.O(aVar4, eVar, cVar2, cVar);
                    } else {
                        objO = null;
                    }
                }
                if (objO != null) {
                    return objO;
                }
                if (!z11) {
                    Iterator it = ((ArrayList) this.f44800c).iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                } else if (!z12) {
                    h2Var.V("|- ? " + str + " look in other scopes");
                    ArrayList arrayList = aVar.f24770f;
                    if (arrayList.size() > 1) {
                        iterable = arrayList;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        ry.k kVar2 = new ry.k(ry.m.f0(arrayList));
                        while (!kVar2.isEmpty()) {
                            e20.a aVar6 = (e20.a) kVar2.removeLast();
                            if (linkedHashSet.add(aVar6)) {
                                Iterator it2 = aVar6.f24770f.iterator();
                                kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    kotlin.jvm.internal.m.e(next, "next(...)");
                                    e20.a aVar7 = (e20.a) next;
                                    if (!linkedHashSet.contains(aVar7)) {
                                        kVar2.addLast(aVar7);
                                    }
                                }
                            }
                        }
                        iterable = linkedHashSet;
                    }
                    iterable = arrayList;
                    for (e20.a aVar8 : iterable) {
                        StringBuilder sbQ = p0.q("|- ? ", str, " look in scope '");
                        sbQ.append(aVar8.f24766b);
                        sbQ.append('\'');
                        h2Var.V(sbQ.toString());
                        Object objT = t(aVar8, !aVar8.f24767c ? new oi.c((h2) cVar.f44925a, aVar8, eVar, (b20.a) cVar.f44928d, (a20.a) cVar.f44929e) : cVar, false);
                        if (objT != null) {
                            return objT;
                        }
                    }
                }
                return null;
            }
        }
        return objO2;
    }

    public String toString() {
        switch (this.f44798a) {
            case 6:
                StringBuilder sb2 = new StringBuilder("Pair{");
                sb2.append(this.f44799b);
                sb2.append(" ");
                sb2.append(this.f44800c);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public x7.e0 u(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = (int[]) this.f44799b;
            if (i12 >= iArr.length) {
                b7.a.o("Unmatched track of type: " + i11);
                return new x7.l();
            }
            if (i11 == iArr[i12]) {
                return ((y0[]) this.f44800c)[i12];
            }
            i12++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    public gc.l v(gc.l lVar) {
        boolean z11;
        boolean z12;
        Bitmap.Config config = lVar.f29045b;
        gc.b bVar = lVar.f29057o;
        boolean z13 = true;
        if (!z6.c.k(config) || ((kc.j) this.f44800c).b()) {
            z11 = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z11 = true;
        }
        Bitmap.Config config2 = config;
        if (lVar.f29057o.a()) {
            kc.m mVar = (kc.m) this.f44799b;
            synchronized (mVar) {
                mVar.a();
                z12 = mVar.f38076e;
            }
            if (z12) {
                z13 = z11;
            } else {
                bVar = gc.b.DISABLED;
            }
        } else {
            z13 = z11;
        }
        return z13 ? new gc.l(lVar.f29044a, config2, lVar.f29046c, lVar.f29047d, lVar.f29048e, lVar.f29049f, lVar.f29050g, lVar.f29051h, lVar.f29052i, lVar.f29053j, lVar.f29054k, lVar.f29055l, lVar.m, lVar.f29056n, bVar) : lVar;
    }

    public void w(zzhx zzhxVar) {
        try {
            C(zzhxVar, (zzis) this.f44799b);
        } catch (Throwable unused) {
            int i11 = zzc.f12272a;
        }
    }

    public void x(zzhx zzhxVar, int i11, long j11) {
        try {
            zziq zziqVar = (zziq) ((zzis) this.f44799b).h();
            zziqVar.h();
            zzis.r((zzis) zziqVar.f12378b, i11);
            zzis zzisVar = (zzis) zziqVar.f();
            this.f44799b = zzisVar;
            if (j11 != 0) {
                zziq zziqVar2 = (zziq) zzisVar.h();
                zziqVar2.h();
                zzis.t((zzis) zziqVar2.f12378b, j11);
                zzisVar = (zzis) zziqVar2.f();
            }
            C(zzhxVar, zzisVar);
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
    }

    public void y(zzhx zzhxVar, long j11, boolean z11) {
        zzis zzisVar;
        try {
            zzhv zzhvVar = (zzhv) zzhxVar.h();
            zzja zzjaVar = (zzja) zzhxVar.q().h();
            zzjaVar.h();
            zzjf.p((zzjf) zzjaVar.f12378b, z11);
            zzhvVar.h();
            zzhx.t((zzhx) zzhvVar.f12378b, (zzjf) zzjaVar.f());
            zzhx zzhxVar2 = (zzhx) zzhvVar.f();
            if (j11 == 0) {
                zzisVar = (zzis) this.f44799b;
            } else {
                zziq zziqVar = (zziq) ((zzis) this.f44799b).h();
                zziqVar.h();
                zzis.t((zzis) zziqVar.f12378b, j11);
                zzisVar = (zzis) zziqVar.f();
            }
            C(zzhxVar2, zzisVar);
        } catch (Throwable unused) {
            int i11 = zzc.f12272a;
        }
    }

    public void z(zzhx zzhxVar, int i11, long j11, boolean z11) {
        zzis zzisVar;
        try {
            zziq zziqVar = (zziq) ((zzis) this.f44799b).h();
            zziqVar.h();
            zzis.r((zzis) zziqVar.f12378b, i11);
            this.f44799b = (zzis) zziqVar.f();
            zzhv zzhvVar = (zzhv) zzhxVar.h();
            zzja zzjaVar = (zzja) zzhxVar.q().h();
            zzjaVar.h();
            zzjf.p((zzjf) zzjaVar.f12378b, z11);
            zzhvVar.h();
            zzhx.t((zzhx) zzhvVar.f12378b, (zzjf) zzjaVar.f());
            zzhx zzhxVar2 = (zzhx) zzhvVar.f();
            if (j11 == 0) {
                zzisVar = (zzis) this.f44799b;
            } else {
                zziq zziqVar2 = (zziq) ((zzis) this.f44799b).h();
                zziqVar2.h();
                zzis.t((zzis) zziqVar2.f12378b, j11);
                zzisVar = (zzis) zziqVar2.f();
            }
            C(zzhxVar2, zzisVar);
        } catch (Throwable unused) {
            int i12 = zzc.f12272a;
        }
    }

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f44798a = i11;
        this.f44799b = obj;
        this.f44800c = obj2;
    }

    public c(Context context, zzis zzisVar) {
        this.f44798a = 4;
        k0 k0Var = new k0();
        try {
            TransportRuntime.b(context);
            k0Var.f7547b = TransportRuntime.a().c(CCTDestination.f7807e).b("PLAY_BILLING_LIBRARY", new Encoding("proto"), new p3(6));
        } catch (Throwable unused) {
            k0Var.f7546a = true;
        }
        this.f44800c = k0Var;
        this.f44799b = zzisVar;
    }

    public c(vb.i iVar, kc.m mVar) {
        Object u3Var;
        this.f44798a = 11;
        this.f44799b = mVar;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 4;
        if (i11 < 26) {
            boolean z11 = kc.a.f38048a;
        } else {
            if (!kc.a.f38048a) {
                if (i11 != 26 && i11 != 27) {
                    u3Var = new u3(true, i12);
                } else {
                    u3Var = new kc.l();
                }
            }
            this.f44800c = u3Var;
        }
        u3Var = new u3(false, i12);
        this.f44800c = u3Var;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f44798a = 0;
        this.f44799b = workDatabase_Impl;
        this.f44800c = new b(workDatabase_Impl, 0);
    }

    private final void q() {
    }

    private final void r() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.stkouyu.listener.OnInitEngineListener
    public void onStartInitEngine() {
    }

    public c(org.greenrobot.greendao.a aVar) {
        this.f44798a = 16;
        this.f44799b = aVar;
        this.f44800c = new ArrayList();
    }

    public c(l0 l0Var) {
        this.f44798a = 19;
        this.f44799b = l0Var;
        this.f44800c = new t1.a(0);
    }

    public c(a9.i iVar) {
        this.f44798a = 5;
        this.f44799b = iVar;
        this.f44800c = new ArrayList();
    }

    public c(bq.f fVar, ViewGroup viewGroup) {
        this.f44798a = 28;
        this.f44800c = fVar;
        this.f44799b = viewGroup;
    }

    public c(Context context) {
        this.f44798a = 8;
        this.f44799b = context;
        this.f44800c = new ae.b(context, 2);
    }

    public c(y yVar) {
        this.f44798a = 22;
        this.f44799b = yVar;
        y.d0 d0Var = y.n0.f56743a;
        this.f44800c = new y.d0();
    }

    public c(fz.e eVar) {
        this.f44798a = 10;
        this.f44799b = eVar;
        this.f44800c = new ConcurrentHashMap();
    }

    public c(List list, int[] iArr) {
        this.f44798a = 2;
        this.f44799b = ImmutableList.n(list);
        this.f44800c = iArr;
    }

    public c(d0 d0Var) {
        this.f44798a = 7;
        this.f44800c = d0Var;
        this.f44799b = new b7.v(new byte[4], 4);
    }

    public c(vt.i0 courseRepository, vt.n0 envRepository) {
        this.f44798a = 26;
        kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
        kotlin.jvm.internal.m.f(envRepository, "envRepository");
        this.f44799b = courseRepository;
        this.f44800c = envRepository;
    }

    @Override // e9.b0
    public void b(b7.b0 b0Var, x7.o oVar, b10.b bVar) {
    }
}
