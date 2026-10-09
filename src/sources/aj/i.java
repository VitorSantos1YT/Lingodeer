package aj;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.j;
import com.android.billingclient.api.j0;
import com.android.billingclient.api.y;
import com.bumptech.glide.p;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.api.Service;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.net.Socket;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import l.h0;
import lf.t0;
import lw.n;
import lw.q1;
import lw.x0;
import mw.a2;
import mw.b5;
import mw.g0;
import mw.g3;
import mw.i0;
import mw.k3;
import mw.m0;
import mw.n2;
import mw.q0;
import mw.q2;
import mw.r1;
import mw.s3;
import mw.t2;
import mw.u2;
import mw.u3;
import mw.u4;
import mw.w4;
import mw.x2;
import mw.y2;
import p9.v;
import q.l;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f754b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f753a = i11;
        this.f754b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f753a) {
            case 0:
                WaveView waveView = (WaveView) this.f754b;
                if (waveView.f21757t) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - waveView.H >= waveView.f21754d) {
                        waveView.K.add(new h(waveView));
                        waveView.invalidate();
                        waveView.H = jCurrentTimeMillis;
                    }
                    waveView.postDelayed(this, waveView.f21754d);
                    return;
                }
                return;
            case 1:
                y yVar = (y) this.f754b;
                com.android.billingclient.api.d dVar = yVar.f7593d;
                dVar.m(0);
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                j jVar = j0.f7532k;
                dVar.l(jVar, zzieVar);
                yVar.c(jVar);
                return;
            case 2:
                p pVar = (p) this.f754b;
                pVar.f7695c.j(pVar);
                return;
            case 3:
                e5.f fVar = (e5.f) this.f754b;
                View view = fVar.f24849c;
                e5.a aVar = fVar.f24847a;
                if (fVar.Q) {
                    if (fVar.O) {
                        fVar.O = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f24840e = jCurrentAnimationTimeMillis;
                        aVar.f24842g = -1L;
                        aVar.f24841f = jCurrentAnimationTimeMillis;
                        aVar.f24843h = 0.5f;
                    }
                    if ((aVar.f24842g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f24842g + ((long) aVar.f24844i)) || !fVar.k()) {
                        fVar.Q = false;
                        return;
                    }
                    if (fVar.P) {
                        fVar.P = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f24841f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j11 = jCurrentAnimationTimeMillis2 - aVar.f24841f;
                    aVar.f24841f = jCurrentAnimationTimeMillis2;
                    fVar.S.scrollListBy((int) (j11 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f24839d));
                    WeakHashMap weakHashMap = s0.f58893a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                Carousel carousel = (Carousel) this.f754b;
                carousel.R.setProgress(CropImageView.DEFAULT_ASPECT_RATIO);
                carousel.getClass();
                carousel.getClass();
                int i11 = carousel.Q;
                throw null;
            case 5:
                h0 h0Var = (h0) this.f754b;
                Window.Callback callback = h0Var.f38984b;
                Menu menuV = h0Var.v();
                l lVar = menuV instanceof l ? (l) menuV : null;
                if (lVar != null) {
                    lVar.y();
                }
                try {
                    menuV.clear();
                    if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                    }
                    if (lVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (lVar != null) {
                        lVar.x();
                    }
                }
                break;
            case 6:
                ((l5.e) this.f754b).q(0);
                return;
            case 7:
                if (qf.a.b(this)) {
                    return;
                }
                try {
                    t0 t0Var = t0.f40120a;
                    t0.a((lf.s0) this.f754b);
                    return;
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                    return;
                }
            case 8:
                mw.b bVar = (mw.b) this.f754b;
                try {
                    tw.b.c();
                    try {
                        tw.a aVar2 = tw.b.f52660a;
                        aVar2.getClass();
                        k3 k3Var = bVar.f42342a;
                        if (!k3Var.isClosed()) {
                            k3Var.O += (long) 2;
                            k3Var.a();
                            break;
                        }
                        aVar2.getClass();
                        return;
                    } catch (Throwable th3) {
                        try {
                            tw.b.f52660a.getClass();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    ((nw.l) bVar).m(th5);
                    return;
                }
            case 9:
                ((m0) this.f754b).f42529a.l();
                return;
            case 10:
                ((mw.t0) this.f754b).f42685a.h();
                return;
            case 11:
                a2 a2Var = (a2) ((i0) this.f754b).f42445b;
                g3 g3Var = a2Var.f42325r;
                a2Var.f42324q = null;
                a2Var.f42325r = null;
                g3Var.c(q1.m.h("InternalSubchannel closed transport due to address change"));
                return;
            case 12:
                ((y2) ((g0) this.f754b).f42424b).h();
                return;
            case 13:
                y2 y2Var = (y2) this.f754b;
                if (y2Var.f42838x == null) {
                    return;
                }
                y2Var.k(true);
                q0 q0Var = y2Var.E;
                q0Var.g(null);
                y2Var.N.h(lw.e.INFO, "Entering IDLE state");
                y2Var.f42832r.c(n.IDLE);
                r1 r1Var = y2Var.Z;
                Object[] objArr = {y2Var.C, q0Var};
                r1Var.getClass();
                for (int i12 = 0; i12 < 2; i12++) {
                    if (((Set) r1Var.f3561b).contains(objArr[i12])) {
                        y2Var.h();
                        return;
                    }
                }
                return;
            case 14:
                y2 y2Var2 = ((q2) this.f754b).f42648e;
                y2Var2.m.d();
                if (y2Var2.f42837w) {
                    y2Var2.f42836v.j();
                    return;
                }
                return;
            case 15:
                ((u2) this.f754b).f42716d.h();
                return;
            case 16:
                t2 t2Var = (t2) this.f754b;
                LinkedHashSet linkedHashSet = t2Var.f42695r.f42716d.B;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(t2Var);
                    if (((t2) this.f754b).f42695r.f42716d.B.isEmpty()) {
                        y2 y2Var3 = ((t2) this.f754b).f42695r.f42716d;
                        y2Var3.Z.r0(y2Var3.C, false);
                        y2 y2Var4 = ((t2) this.f754b).f42695r.f42716d;
                        y2Var4.B = null;
                        if (y2Var4.G.get()) {
                            ob.i iVar = ((t2) this.f754b).f42695r.f42716d.F;
                            q1 q1Var = y2.f42809e0;
                            synchronized (iVar.f44813b) {
                                try {
                                    if (((q1) iVar.f44815d) == null) {
                                        iVar.f44815d = q1Var;
                                        boolean zIsEmpty = ((HashSet) iVar.f44814c).isEmpty();
                                        if (zIsEmpty) {
                                            ((y2) iVar.f44816e).E.c(q1Var);
                                        }
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                a2 a2Var2 = ((x2) this.f754b).f42790f;
                a2Var2.f42319k.execute(new i0(15, a2Var2, y2.f42810f0));
                return;
            case 18:
                u3 u3Var = (u3) this.f754b;
                u3Var.f42723k = null;
                if (u3Var.f42720h.b()) {
                    u3Var.e();
                    return;
                }
                return;
            case 19:
                ((lw.y) ((s3) this.f754b).f42680c).n();
                return;
            case 20:
                n2 n2Var = (n2) this.f754b;
                if (n2Var.f42574b0) {
                    return;
                }
                n2Var.W.h();
                return;
            case 21:
                u4 u4Var = (u4) this.f754b;
                n2 n2Var2 = (n2) u4Var.f42728c.f42668b;
                w4 w4Var = u4Var.f42727b;
                x0 x0Var = n2.f42567g0;
                n2Var2.m(w4Var);
                return;
            case 22:
                ((b5) this.f754b).j();
                return;
            case 23:
                nw.c cVar = (nw.c) this.f754b;
                nw.p pVar2 = cVar.f44192d;
                try {
                    m00.c cVar2 = cVar.K;
                    if (cVar2 != null) {
                        m00.i iVar2 = cVar.f44190b;
                        long j12 = iVar2.f40718b;
                        if (j12 > 0) {
                            cVar2.K0(iVar2, j12);
                        }
                    }
                } catch (IOException e8) {
                    pVar2.n(e8);
                }
                try {
                    m00.c cVar3 = cVar.K;
                    if (cVar3 != null) {
                        cVar3.close();
                    }
                } catch (IOException e10) {
                    pVar2.n(e10);
                }
                try {
                    Socket socket = cVar.L;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e11) {
                    pVar2.n(e11);
                    return;
                }
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) this.f754b;
                long j13 = eVar.f2443b;
                long jMax = Math.max(2 * j13, j13);
                mw.e eVar2 = (mw.e) eVar.f2444c;
                if (eVar2.f42397b.compareAndSet(j13, jMax)) {
                    mw.e.f42395c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{eVar2.f42396a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((nw.p) this.f754b).getClass();
                nw.p pVar3 = (nw.p) this.f754b;
                pVar3.f44250o.execute(pVar3.f44255t);
                synchronized (((nw.p) this.f754b).f44247k) {
                    nw.p pVar4 = (nw.p) this.f754b;
                    pVar4.C = Integer.MAX_VALUE;
                    pVar4.s();
                    break;
                }
                ((nw.p) this.f754b).getClass();
                return;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((p9.e) this.f754b).z();
                return;
            case 27:
                RecyclerView recyclerView = ((v) this.f754b).f46706c;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                synchronized (this) {
                    ((PreferenceGroup) this.f754b).f2351p0.clear();
                    break;
                }
                return;
            default:
                ((p9.y) this.f754b).d();
                return;
        }
    }
}
