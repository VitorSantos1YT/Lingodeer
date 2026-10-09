package androidx.fragment.app;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.google.android.gms.common.util.BiConsumer;
import com.google.common.collect.ImmutableList;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import fr.j3;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1638d;

    public /* synthetic */ d(View view, vq.d dVar, vq.f fVar) {
        this.f1635a = 19;
        this.f1637c = view;
        this.f1636b = dVar;
        this.f1638d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [fz.a, kotlin.jvm.internal.n] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i11 = 0;
        Object objT = null;
        boolean zBooleanValue = true;
        char c11 = 1;
        switch (this.f1635a) {
            case 0:
                ViewGroup container = (ViewGroup) this.f1636b;
                View view = (View) this.f1637c;
                f this$0 = (f) this.f1638d;
                kotlin.jvm.internal.m.f(container, "$container");
                kotlin.jvm.internal.m.f(this$0, "this$0");
                container.endViewTransition(view);
                this$0.f1653c.f1737a.c(this$0);
                return;
            case 1:
                m2 m2Var = (m2) this.f1636b;
                m2 m2Var2 = (m2) this.f1637c;
                q qVar = (q) this.f1638d;
                k0 inFragment = m2Var.f1756c;
                k0 outFragment = m2Var2.f1756c;
                boolean z11 = qVar.f1799o;
                f2 f2Var = a2.f1614a;
                kotlin.jvm.internal.m.f(inFragment, "inFragment");
                kotlin.jvm.internal.m.f(outFragment, "outFragment");
                if (z11) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 2:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f1636b;
                cf.v vVar = (cf.v) this.f1637c;
                Context context = (Context) this.f1638d;
                if (qf.a.b(cf.g.class)) {
                    return;
                }
                try {
                    ((cf.h) yVar.f38361a).a(cf.w.SUBS, new cf.f(vVar, context, 1));
                    return;
                } catch (Throwable th2) {
                    qf.a.a(cf.g.class, th2);
                    return;
                }
            case 3:
                cf.n nVar = (cf.n) this.f1636b;
                cf.w productType = (cf.w) this.f1637c;
                Runnable runnable = (Runnable) this.f1638d;
                if (qf.a.b(cf.n.class)) {
                    return;
                }
                try {
                    Class cls = nVar.f6942f;
                    kotlin.jvm.internal.m.f(productType, "$productType");
                    Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new cf.k(nVar, productType, runnable));
                    Class cls2 = nVar.f6938b;
                    Method method = nVar.f6946j;
                    if (!qf.a.b(nVar)) {
                        try {
                            objT = nVar.f6937a;
                        } catch (Throwable th3) {
                            qf.a.a(nVar, th3);
                        }
                        break;
                    }
                    cf.x.t(cls2, objT, method, productType.a(), objNewProxyInstance);
                    return;
                } catch (Throwable th4) {
                    qf.a.a(cf.n.class, th4);
                    return;
                }
            case 4:
                cf.o oVar = (cf.o) this.f1636b;
                cf.w productType2 = (cf.w) this.f1637c;
                Runnable runnable2 = (Runnable) this.f1638d;
                if (qf.a.b(cf.o.class)) {
                    return;
                }
                try {
                    Class cls3 = oVar.f6961o;
                    kotlin.jvm.internal.m.f(productType2, "$productType");
                    Object objNewProxyInstance2 = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new cf.m(oVar, new Object[]{productType2, runnable2}, c11 == true ? 1 : 0));
                    Class cls4 = oVar.f6949b;
                    Method method2 = oVar.f6963q;
                    if (!qf.a.b(oVar)) {
                        try {
                            obj = oVar.f6948a;
                        } catch (Throwable th5) {
                            qf.a.a(oVar, th5);
                            obj = null;
                        }
                        break;
                    } else {
                        obj = null;
                    }
                    Class cls5 = oVar.f6958k;
                    if (!qf.a.b(oVar)) {
                        try {
                            objT = cf.x.t(cls5, cf.x.t(cls5, cf.x.t(oVar.f6956i, null, oVar.f6964r, new Object[0]), oVar.f6966t, productType2.a()), oVar.f6965s, new Object[0]);
                        } catch (Throwable th6) {
                            qf.a.a(oVar, th6);
                        }
                        break;
                    }
                    cf.x.t(cls4, obj, method2, objT, objNewProxyInstance2);
                    return;
                } catch (Throwable th7) {
                    qf.a.a(cf.o.class, th7);
                    return;
                }
            case 5:
                BiConsumer biConsumer = (BiConsumer) this.f1636b;
                String str = (String) this.f1637c;
                ConfigContainer configContainer = (ConfigContainer) this.f1638d;
                Pattern pattern = ConfigGetParameterHandler.f20731e;
                biConsumer.accept(str, configContainer);
                return;
            case 6:
                f7.n0 n0Var = (f7.n0) this.f1636b;
                ImmutableList.Builder builder = (ImmutableList.Builder) this.f1637c;
                p7.b0 b0Var = (p7.b0) this.f1638d;
                g7.f fVar = n0Var.f26876c;
                ImmutableList immutableListJ = builder.j();
                g7.e eVar = fVar.f28807d;
                y6.j0 j0Var = fVar.f28810t;
                j0Var.getClass();
                eVar.getClass();
                eVar.f28799b = ImmutableList.n(immutableListJ);
                if (!immutableListJ.isEmpty()) {
                    eVar.f28802e = (p7.b0) immutableListJ.get(0);
                    b0Var.getClass();
                    eVar.f28803f = b0Var;
                }
                if (eVar.f28801d == null) {
                    eVar.f28801d = g7.e.b(j0Var, eVar.f28799b, eVar.f28802e, eVar.f28798a);
                }
                eVar.d(j0Var.F());
                return;
            case 7:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1636b;
                a4.i iVar = (a4.i) this.f1637c;
                fz.a aVar = (fz.a) this.f1638d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    iVar.a(aVar.invoke());
                    return;
                } catch (Throwable th8) {
                    iVar.b(th8);
                    return;
                }
            case 8:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1636b;
                a4.i iVar2 = (a4.i) this.f1637c;
                ?? r9 = (kotlin.jvm.internal.n) this.f1638d;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    iVar2.a(r9.invoke());
                    return;
                } catch (Throwable th9) {
                    iVar2.b(th9);
                    return;
                }
            case 9:
                gb.d dVar = (gb.d) this.f1636b;
                a4.l lVar = (a4.l) this.f1637c;
                gb.a0 a0Var = (gb.a0) this.f1638d;
                try {
                    zBooleanValue = ((Boolean) lVar.f352b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (dVar.f28927k) {
                    try {
                        ob.j jVarS = j3.s(a0Var.f28894a);
                        String str2 = jVarS.f44817a;
                        if (dVar.c(str2) == a0Var) {
                            dVar.b(str2);
                        }
                        fb.l.b().getClass();
                        ArrayList arrayList = dVar.f28926j;
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            ((gb.b) obj2).e(jVarS, zBooleanValue);
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return;
            case 10:
                ((gb.d) ((b1.p) this.f1636b).f3800b).f((gb.i) this.f1637c, (ob.l) this.f1638d);
                return;
            case 11:
                h9.b0.a((h9.b0) this.f1636b, (SurfaceView) this.f1637c, (b2.a) this.f1638d);
                return;
            case 12:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f1636b;
                View view2 = (View) this.f1637c;
                vq.f fVar2 = (vq.f) this.f1638d;
                if (uVar.f38357a) {
                    view2.startDragAndDrop(null, new vq.c(view2), new vq.d(view2, fVar2), 0);
                    return;
                }
                return;
            case 13:
                ob.u uVar2 = (ob.u) this.f1636b;
                o20.h hVar = (o20.h) this.f1637c;
                o20.t0 t0Var = (o20.t0) this.f1638d;
                o20.n nVar2 = (o20.n) uVar2.f44892c;
                if (nVar2.f44537b.b()) {
                    hVar.y(nVar2, new IOException("Canceled"));
                    return;
                } else {
                    hVar.k(nVar2, t0Var);
                    return;
                }
            case 14:
                ((o20.h) this.f1637c).y((o20.n) ((ob.u) this.f1636b).f44892c, (Throwable) this.f1638d);
                return;
            case 15:
                WorkDatabase workDatabase = (WorkDatabase) this.f1636b;
                String str3 = (String) this.f1637c;
                gb.p pVar = (gb.p) this.f1638d;
                ob.s sVarE = workDatabase.E();
                sVarE.getClass();
                w9.u uVarB = w9.u.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                uVarB.l(1, str3);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVarE.f44875a;
                workDatabase_Impl.b();
                Cursor cursorF = cf.x.F(workDatabase_Impl, uVarB, false);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorF.getCount());
                    while (cursorF.moveToNext()) {
                        arrayList2.add(cursorF.getString(0));
                    }
                    cursorF.close();
                    uVarB.release();
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        pb.g.a(pVar, (String) obj3);
                    }
                    return;
                } catch (Throwable th11) {
                    cursorF.close();
                    uVarB.release();
                    throw th11;
                }
            case 16:
                tf.c cVar = (tf.c) this.f1636b;
                tf.t tVar = (tf.t) this.f1637c;
                Bundle bundle = (Bundle) this.f1638d;
                try {
                    cVar.k(tVar, bundle);
                    cVar.s(tVar, bundle, null);
                    return;
                } catch (FacebookException e8) {
                    cVar.s(tVar, null, e8);
                    return;
                }
            case 17:
                tf.i0 i0Var = (tf.i0) this.f1636b;
                tf.t tVar2 = (tf.t) this.f1637c;
                Bundle bundle2 = (Bundle) this.f1638d;
                try {
                    i0Var.k(tVar2, bundle2);
                    i0Var.r(tVar2, bundle2);
                    return;
                } catch (FacebookServiceException e10) {
                    re.r rVar = e10.f7719b;
                    i0Var.q(tVar2, rVar.f49197d, rVar.a(), String.valueOf(rVar.f49195b));
                    return;
                } catch (FacebookException e11) {
                    i0Var.q(tVar2, null, e11.getMessage(), null);
                    return;
                }
            case 18:
                ae.b bVar = (ae.b) this.f1636b;
                ob.f fVar3 = (ob.f) this.f1637c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1638d;
                try {
                    v5.r rVarN = o00.a.n(bVar.f666b);
                    if (rVarN == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    v5.q qVar2 = (v5.q) ((v5.i) rVarN.f53519b);
                    synchronized (qVar2.f53550d) {
                        qVar2.f53552f = threadPoolExecutor;
                        break;
                    }
                    ((v5.i) rVarN.f53519b).a(new v5.l(fVar3, threadPoolExecutor));
                    return;
                } catch (Throwable th12) {
                    fVar3.E(th12);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 19:
                View view3 = (View) this.f1637c;
                vq.d dVar2 = (vq.d) this.f1636b;
                vq.f fVar4 = (vq.f) this.f1638d;
                if (view3 == dVar2.f54094a) {
                    fVar4.h(view3);
                    return;
                }
                return;
            default:
                x0.f fVar5 = (x0.f) this.f1636b;
                x0.d dVar3 = (x0.d) this.f1637c;
                x0.e eVar2 = (x0.e) this.f1638d;
                ActionMode actionModeStartActionMode = fVar5.f55581a.startActionMode(new x0.m(dVar3), 1);
                kotlin.jvm.internal.m.a(fVar5.f55588h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    eVar2.close();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11) {
        this.f1635a = i11;
        this.f1636b = obj;
        this.f1637c = obj2;
        this.f1638d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(AtomicBoolean atomicBoolean, a4.i iVar, fz.a aVar) {
        this.f1635a = 8;
        this.f1636b = atomicBoolean;
        this.f1637c = iVar;
        this.f1638d = (kotlin.jvm.internal.n) aVar;
    }
}
