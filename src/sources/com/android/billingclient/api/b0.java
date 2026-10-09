package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.android.volley.VolleyError;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import io.grpc.StatusException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import lw.c1;
import lw.n1;
import lw.o0;
import lw.q1;
import lw.s1;
import lw.t1;
import mw.j5;
import mw.k1;
import mw.n0;
import mw.q2;
import mw.y2;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7465d;

    public /* synthetic */ b0() {
        this.f7462a = 11;
    }

    public String toString() {
        switch (this.f7462a) {
            case 3:
                return ((Runnable) this.f7464c).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b0(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f7462a = i11;
        this.f7465d = obj;
        this.f7463b = obj2;
        this.f7464c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw.p pVar;
        nw.o oVar;
        Socket socketF;
        SSLSession session = null;
        Object objCall = null;
        boolean z11 = false;
        switch (this.f7462a) {
            case 0:
                super/*com.android.billingclient.api.d*/.d((hd.b) this.f7464c, (a5.f) this.f7465d);
                return;
            case 1:
                super/*com.android.billingclient.api.d*/.a((b) this.f7464c, (a5.j) this.f7465d);
                return;
            case 2:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f7465d;
                Context context = (Context) this.f7464c;
                Intent intent = (Intent) this.f7463b;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    fb.l lVarB = fb.l.b();
                    int i11 = ConstraintProxyUpdateReceiver.f2801a;
                    lVarB.getClass();
                    pb.h.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    pb.h.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    pb.h.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    pb.h.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 3:
                ((t1) this.f7465d).execute((s1) this.f7463b);
                return;
            case 4:
                ((n0) this.f7465d).f42560i.p((lw.y) this.f7463b, (c1) this.f7464c);
                return;
            case 5:
                ((mw.m0) this.f7465d).f42529a.h((q1) this.f7463b, (c1) this.f7464c);
                return;
            case 6:
                lw.n nVar = (lw.n) this.f7464c;
                o0 o0Var = (o0) this.f7463b;
                q2 q2Var = (q2) this.f7465d;
                y2 y2Var = q2Var.f42648e;
                if (q2Var != y2Var.f42838x) {
                    return;
                }
                y2Var.f42839y = o0Var;
                y2Var.E.g(o0Var);
                if (nVar != lw.n.SHUTDOWN) {
                    q2Var.f42648e.N.i(lw.e.INFO, "Entering {0} state with picker: {1}", nVar, o0Var);
                    q2Var.f42648e.f42832r.c(nVar);
                    return;
                }
                return;
            case 7:
                try {
                    ((CountDownLatch) this.f7463b).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                m00.d0 d0VarC = m00.b.c(new nw.n());
                try {
                    try {
                        try {
                            nw.p pVar2 = (nw.p) this.f7465d;
                            lw.z zVar = pVar2.N;
                            if (zVar == null) {
                                socketF = pVar2.A.createSocket(pVar2.f44237a.getAddress(), ((nw.p) this.f7465d).f44237a.getPort());
                            } else {
                                SocketAddress socketAddress = zVar.f40489a;
                                if (!(socketAddress instanceof InetSocketAddress)) {
                                    throw new StatusException(q1.f40441l.h("Unsupported SocketAddress implementation " + ((nw.p) this.f7465d).N.f40489a.getClass()));
                                }
                                socketF = nw.p.f(pVar2, zVar.f40490b, (InetSocketAddress) socketAddress, zVar.f40491c, zVar.f40492d);
                            }
                            nw.p pVar3 = (nw.p) this.f7465d;
                            SSLSocketFactory sSLSocketFactory = pVar3.B;
                            Socket socket = socketF;
                            if (sSLSocketFactory != null) {
                                String host = pVar3.f44238b;
                                URI uriA = k1.a(host);
                                if (uriA.getHost() != null) {
                                    host = uriA.getHost();
                                }
                                SSLSocket sSLSocketA = nw.w.a(sSLSocketFactory, socketF, host, ((nw.p) this.f7465d).j(), ((nw.p) this.f7465d).E);
                                session = sSLSocketA.getSession();
                                socket = sSLSocketA;
                            }
                            socket.setTcpNoDelay(true);
                            m00.d0 d0VarC2 = m00.b.c(m00.b.j(socket));
                            ((nw.c) this.f7464c).a(m00.b.h(socket), socket);
                            nw.p pVar4 = (nw.p) this.f7465d;
                            lw.b bVar = pVar4.f44256u;
                            bVar.getClass();
                            ob.l lVar = new ob.l(bVar, 20);
                            lVar.C(lw.f.f40373a, socket.getRemoteSocketAddress());
                            lVar.C(lw.f.f40374b, socket.getLocalSocketAddress());
                            lVar.C(lw.f.f40375c, session);
                            lVar.C(j5.f42481a, session == null ? n1.NONE : n1.PRIVACY_AND_INTEGRITY);
                            pVar4.f44256u = lVar.u();
                            nw.p pVar5 = (nw.p) this.f7465d;
                            pVar5.f44243g.getClass();
                            pVar5.f44255t = new nw.o(pVar5, new ow.g(d0VarC2));
                            synchronized (((nw.p) this.f7465d).f44247k) {
                                if (session != null) {
                                    try {
                                        new lw.k(session);
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                break;
                            }
                            return;
                        } catch (Throwable th3) {
                            nw.p pVar6 = (nw.p) this.f7465d;
                            pVar6.f44243g.getClass();
                            pVar6.f44255t = new nw.o(pVar6, new ow.g(d0VarC));
                            throw th3;
                        }
                    } catch (Exception e8) {
                        ((nw.p) this.f7465d).n(e8);
                        pVar = (nw.p) this.f7465d;
                        pVar.f44243g.getClass();
                        oVar = new nw.o(pVar, new ow.g(d0VarC));
                        pVar.f44255t = oVar;
                        return;
                    }
                } catch (StatusException e10) {
                    ((nw.p) this.f7465d).r(0, ow.a.INTERNAL_ERROR, e10.f34500a);
                    pVar = (nw.p) this.f7465d;
                    pVar.f44243g.getClass();
                    oVar = new nw.o(pVar, new ow.g(d0VarC));
                    pVar.f44255t = oVar;
                    return;
                }
                break;
            case 8:
                pd.l lVar2 = (pd.l) this.f7464c;
                pd.h hVar = (pd.h) this.f7463b;
                if (hVar.isCanceled()) {
                    hVar.finish("canceled-at-delivery");
                    return;
                }
                VolleyError volleyError = lVar2.f46800c;
                if (volleyError == null) {
                    hVar.deliverResponse(lVar2.f46798a);
                } else {
                    hVar.deliverError(volleyError);
                }
                if (lVar2.f46801d) {
                    hVar.addMarker(DytezVyM.hrmiafz);
                } else {
                    hVar.finish("done");
                }
                Runnable runnable = (Runnable) this.f7465d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                s20.e eVar = (s20.e) this.f7465d;
                Handler handler = eVar.f51384d;
                try {
                    handler.sendMessage(handler.obtainMessage(1));
                    handler.sendMessage(handler.obtainMessage(0, s20.e.a(eVar, (Context) this.f7463b, (s20.b) this.f7464c)));
                    return;
                } catch (IOException e11) {
                    handler.sendMessage(handler.obtainMessage(2, e11));
                    return;
                }
            case 10:
                sw.v vVar = (sw.v) this.f7465d;
                vVar.f51909l = Long.valueOf(vVar.f51906i.t());
                for (sw.n nVar2 : ((HashMap) ((sw.v) this.f7465d).f51903f.f23241b).values()) {
                    o2 o2Var = nVar2.f51876c;
                    ((AtomicLong) o2Var.f48095b).set(0L);
                    ((AtomicLong) o2Var.f48096c).set(0L);
                    o2 o2Var2 = nVar2.f51875b;
                    nVar2.f51875b = nVar2.f51876c;
                    nVar2.f51876c = o2Var2;
                }
                sw.p pVar7 = (sw.p) this.f7463b;
                lw.f fVar = (lw.f) this.f7464c;
                UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                if (pVar7.f51887e != null) {
                    builder.h(new sw.o(pVar7, fVar, 1));
                }
                if (pVar7.f51888f != null) {
                    builder.h(new sw.o(pVar7, fVar, 0));
                }
                UnmodifiableListIterator unmodifiableListIteratorListIterator = builder.j().listIterator(0);
                while (unmodifiableListIteratorListIterator.hasNext()) {
                    sw.u uVar = (sw.u) unmodifiableListIteratorListIterator.next();
                    sw.v vVar2 = (sw.v) this.f7465d;
                    uVar.a(vVar2.f51903f, vVar2.f51909l.longValue());
                }
                sw.v vVar3 = (sw.v) this.f7465d;
                d7.k kVar = vVar3.f51903f;
                Long l9 = vVar3.f51909l;
                for (sw.n nVar3 : ((HashMap) kVar.f23241b).values()) {
                    if (!nVar3.d()) {
                        int i12 = nVar3.f51878e;
                        nVar3.f51878e = i12 == 0 ? 0 : i12 - 1;
                    }
                    if (nVar3.d()) {
                        if (l9.longValue() > Math.min(nVar3.f51874a.f51884b.longValue() * ((long) nVar3.f51878e), Math.max(nVar3.f51874a.f51884b.longValue(), nVar3.f51874a.f51885c.longValue())) + nVar3.f51877d.longValue()) {
                            nVar3.e();
                        }
                    }
                }
                return;
            default:
                try {
                    objCall = ((w4.e) this.f7463b).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.f7465d).post(new aw.t((a0) this.f7464c, objCall, z11, 23));
                return;
        }
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i11) {
        this.f7462a = i11;
        this.f7463b = obj;
        this.f7464c = obj2;
        this.f7465d = obj3;
    }
}
