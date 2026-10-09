package ow;

import com.google.common.base.Stopwatch;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l1.p0;
import lw.c1;
import m00.d0;
import m00.l;
import mw.a2;
import mw.g2;
import mw.j1;
import mw.p1;
import mw.q1;
import mw.x;
import mw.y1;
import nw.m;
import nw.o;
import nw.p;
import nw.q;
import nw.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f46119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f46120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f46121c;

    public g(d0 d0Var) {
        this.f46119a = d0Var;
        e eVar = new e(d0Var);
        this.f46120b = eVar;
        this.f46121c = new c(eVar);
    }

    public final boolean a(o oVar) throws IOException {
        boolean z11;
        q1 q1Var;
        a aVar;
        z zVar;
        int i11 = 0;
        try {
            this.f46119a.s1(9L);
            int iA = i.a(this.f46119a);
            if (iA < 0 || iA > 16384) {
                i.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iA));
                throw null;
            }
            byte b3 = (byte) (this.f46119a.readByte() & 255);
            byte b11 = (byte) (this.f46119a.readByte() & 255);
            int i12 = this.f46119a.readInt() & Integer.MAX_VALUE;
            Logger logger = i.f46127a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(true, i12, iA, b3, b11));
            }
            switch (b3) {
                case 0:
                    b(oVar, iA, b11, i12);
                    return true;
                case 1:
                    d(oVar, iA, b11, i12);
                    return true;
                case 2:
                    if (iA != 5) {
                        i.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i12 == 0) {
                        i.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    d0 d0Var = this.f46119a;
                    d0Var.readInt();
                    d0Var.readByte();
                    return true;
                case 3:
                    f(oVar, iA, i12);
                    return true;
                case 4:
                    h(oVar, iA, b11, i12);
                    return true;
                case 5:
                    e(oVar, iA, b11, i12);
                    return true;
                case 6:
                    z11 = true;
                    if (iA != 8) {
                        i.c("TYPE_PING length != 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i12 != 0) {
                        i.c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i13 = this.f46119a.readInt();
                    int i14 = this.f46119a.readInt();
                    i11 = (b11 & 1) != 0 ? 1 : 0;
                    long j11 = (((long) i13) << 32) | (((long) i14) & 4294967295L);
                    oVar.f44233a.p(q.INBOUND, j11);
                    if (i11 != 0) {
                        synchronized (oVar.f44236d.f44247k) {
                            try {
                                p pVar = oVar.f44236d;
                                q1Var = pVar.f44259x;
                                if (q1Var != null) {
                                    long j12 = q1Var.f42641a;
                                    if (j12 == j11) {
                                        pVar.f44259x = null;
                                    } else {
                                        Logger logger2 = p.Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j12 + ", got " + j11);
                                    }
                                } else {
                                    p.Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                q1Var = null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        if (q1Var != null) {
                            synchronized (q1Var) {
                                try {
                                    if (!q1Var.f42644d) {
                                        q1Var.f42644d = true;
                                        Stopwatch stopwatch = q1Var.f42642b;
                                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                        long jA = stopwatch.a();
                                        q1Var.f42646f = jA;
                                        LinkedHashMap linkedHashMap = q1Var.f42643c;
                                        q1Var.f42643c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new p1((g2) entry.getKey(), jA));
                                            } catch (Throwable th3) {
                                                q1.f42640g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        }
                        break;
                    } else {
                        synchronized (oVar.f44236d.f44247k) {
                            oVar.f44236d.f44245i.d(i13, i14, true);
                            break;
                        }
                    }
                    return z11;
                case 7:
                    d0 d0Var2 = this.f46119a;
                    if (iA < 8) {
                        i.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    if (i12 != 0) {
                        i.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i15 = d0Var2.readInt();
                    int i16 = d0Var2.readInt();
                    int i17 = iA - 8;
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i11 < length) {
                            aVar = aVarArrValues[i11];
                            if (aVar.httpCode != i16) {
                                i11++;
                            }
                        } else {
                            aVar = null;
                        }
                    }
                    if (aVar == null) {
                        i.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i16));
                        throw null;
                    }
                    l lVarZ = l.f40723d;
                    if (i17 > 0) {
                        lVarZ = d0Var2.z(i17);
                    }
                    p pVar2 = oVar.f44236d;
                    oVar.f44233a.o(q.INBOUND, i15, aVar, lVarZ);
                    if (aVar == a.ENHANCE_YOUR_CALM) {
                        String strV = lVarZ.v();
                        p.Q.log(Level.WARNING, oVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strV);
                        if ("too_many_pings".equals(strV)) {
                            pVar2.J.run();
                        }
                    }
                    lw.q1 q1VarB = j1.a(aVar.httpCode).b("Received Goaway");
                    if (lVarZ.e() > 0) {
                        q1VarB = q1VarB.b(lVarZ.v());
                    }
                    Map map = p.P;
                    pVar2.r(i15, null, q1VarB);
                    return true;
                case 8:
                    if (iA != 4) {
                        i.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iA));
                        throw null;
                    }
                    long j13 = ((long) this.f46119a.readInt()) & 2147483647L;
                    if (j13 == 0) {
                        i.c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    oVar.f44233a.t(q.INBOUND, i12, j13);
                    if (j13 == 0) {
                        if (i12 == 0) {
                            p.e(oVar.f44236d, a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                            return true;
                        }
                        oVar.f44236d.h(i12, lw.q1.f40441l.h("Received 0 flow control window increment."), x.PROCESSED, false, a.PROTOCOL_ERROR, null);
                        return true;
                    }
                    z11 = true;
                    synchronized (oVar.f44236d.f44247k) {
                        try {
                            if (i12 == 0) {
                                oVar.f44236d.f44246j.c(null, (int) j13);
                                return true;
                            }
                            m mVar = (m) oVar.f44236d.f44249n.get(Integer.valueOf(i12));
                            if (mVar != null) {
                                com.android.billingclient.api.d0 d0Var3 = oVar.f44236d.f44246j;
                                nw.l lVar = mVar.P;
                                synchronized (lVar.f44229w) {
                                    zVar = lVar.J;
                                    break;
                                }
                                d0Var3.c(zVar, (int) j13);
                            } else if (!oVar.f44236d.l(i12)) {
                                i11 = 1;
                            }
                            if (i11 != 0) {
                                p.e(oVar.f44236d, a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i12);
                                return true;
                            }
                            return z11;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                default:
                    this.f46119a.skip(iA);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b(o oVar, int i11, byte b3, int i12) throws IOException {
        m mVar;
        boolean z11 = (b3 & 1) != 0;
        if ((b3 & 32) != 0) {
            i.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short s3 = (b3 & 8) != 0 ? (short) (this.f46119a.readByte() & 255) : (short) 0;
        int iB = i.b(i11, b3, s3);
        d0 d0Var = this.f46119a;
        oVar.f44233a.n(q.INBOUND, i12, d0Var.f40691b, iB, z11);
        p pVar = oVar.f44236d;
        synchronized (pVar.f44247k) {
            mVar = (m) pVar.f44249n.get(Integer.valueOf(i12));
        }
        if (mVar == null) {
            if (oVar.f44236d.l(i12)) {
                synchronized (oVar.f44236d.f44247k) {
                    oVar.f44236d.f44245i.e(i12, a.STREAM_CLOSED);
                }
                d0Var.skip(iB);
            } else {
                p.e(oVar.f44236d, a.PROTOCOL_ERROR, "Received data for unknown stream: " + i12);
            }
            this.f46119a.skip(s3);
        }
        long j11 = iB;
        d0Var.s1(j11);
        m00.i iVar = new m00.i();
        iVar.K0(d0Var.f40691b, j11);
        tw.c cVar = mVar.P.I;
        tw.b.f52660a.getClass();
        synchronized (oVar.f44236d.f44247k) {
            mVar.P.n(i11 - iB, iVar, z11);
        }
        p pVar2 = oVar.f44236d;
        int i13 = pVar2.f44254s + i11;
        pVar2.f44254s = i13;
        if (i13 >= pVar2.f44242f * 0.5f) {
            synchronized (pVar2.f44247k) {
                p pVar3 = oVar.f44236d;
                pVar3.f44245i.f(0, pVar3.f44254s);
            }
            oVar.f44236d.f44254s = 0;
        }
        this.f46119a.skip(s3);
    }

    public final ArrayList c(int i11, short s3, byte b3, int i12) throws IOException {
        e eVar = this.f46120b;
        eVar.f46114e = i11;
        eVar.f46111b = i11;
        eVar.f46115f = s3;
        eVar.f46112c = b3;
        eVar.f46113d = i12;
        c cVar = this.f46121c;
        d0 d0Var = cVar.f46100b;
        ArrayList arrayList = cVar.f46099a;
        while (!d0Var.R()) {
            byte b11 = d0Var.readByte();
            int i13 = b11 & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((b11 & 128) == 128) {
                int iE = cVar.e(i13, 127);
                int i14 = iE - 1;
                if (i14 >= 0) {
                    b[] bVarArr = d.f46108b;
                    if (i14 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i14]);
                    }
                }
                int length = cVar.f46104f + 1 + (i14 - d.f46108b.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f46103e;
                    if (length <= bVarArr2.length - 1) {
                        arrayList.add(bVarArr2[length]);
                    }
                }
                throw new IOException(nv.p.j(iE, "Header index too large "));
            }
            if (i13 == 64) {
                l lVarD = cVar.d();
                d.a(lVarD);
                cVar.c(new b(lVarD, cVar.d()));
            } else if ((b11 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i13, 63) - 1), cVar.d()));
            } else if ((b11 & 32) == 32) {
                int iE2 = cVar.e(i13, 31);
                cVar.f46102d = iE2;
                if (iE2 < 0 || iE2 > cVar.f46101c) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f46102d);
                }
                int i15 = cVar.f46106h;
                if (iE2 < i15) {
                    if (iE2 == 0) {
                        Arrays.fill(cVar.f46103e, (Object) null);
                        cVar.f46104f = cVar.f46103e.length - 1;
                        cVar.f46105g = 0;
                        cVar.f46106h = 0;
                    } else {
                        cVar.a(i15 - iE2);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                l lVarD2 = cVar.d();
                d.a(lVarD2);
                arrayList.add(new b(lVarD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i13, 15) - 1), cVar.d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f46119a.close();
    }

    public final void d(o oVar, int i11, byte b3, int i12) throws IOException {
        lw.q1 q1VarH = null;
        boolean z11 = false;
        if (i12 == 0) {
            i.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z12 = (b3 & 1) != 0;
        short s3 = (b3 & 8) != 0 ? (short) (this.f46119a.readByte() & 255) : (short) 0;
        if ((b3 & 32) != 0) {
            d0 d0Var = this.f46119a;
            d0Var.readInt();
            d0Var.readByte();
            i11 -= 5;
        }
        ArrayList arrayListC = c(i.b(i11, b3, s3), s3, b3, i12);
        ob.e eVar = oVar.f44233a;
        q qVar = q.INBOUND;
        if (eVar.l()) {
            ((Logger) eVar.f44804b).log((Level) eVar.f44805c, qVar + " HEADERS: streamId=" + i12 + " headers=" + arrayListC + " endStream=" + z12);
        }
        if (oVar.f44236d.K != Integer.MAX_VALUE) {
            long jE = 0;
            for (int i13 = 0; i13 < arrayListC.size(); i13++) {
                b bVar = (b) arrayListC.get(i13);
                jE += (long) (bVar.f46097b.e() + bVar.f46096a.e() + 32);
            }
            int iMin = (int) Math.min(jE, 2147483647L);
            int i14 = oVar.f44236d.K;
            if (iMin > i14) {
                lw.q1 q1Var = lw.q1.f40439j;
                Locale locale = Locale.US;
                StringBuilder sbQ = defpackage.e.q(i14, "Response ", z12 ? "trailer" : "header", " metadata larger than ", ": ");
                sbQ.append(iMin);
                q1VarH = q1Var.h(sbQ.toString());
            }
        }
        synchronized (oVar.f44236d.f44247k) {
            try {
                m mVar = (m) oVar.f44236d.f44249n.get(Integer.valueOf(i12));
                if (mVar == null) {
                    if (oVar.f44236d.l(i12)) {
                        oVar.f44236d.f44245i.e(i12, a.STREAM_CLOSED);
                    } else {
                        z11 = true;
                    }
                } else if (q1VarH == null) {
                    tw.c cVar = mVar.P.I;
                    tw.b.f52660a.getClass();
                    mVar.P.o(arrayListC, z12);
                } else {
                    if (!z12) {
                        oVar.f44236d.f44245i.e(i12, a.CANCEL);
                    }
                    mVar.P.g(q1VarH, false, new c1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            p.e(oVar.f44236d, a.PROTOCOL_ERROR, "Received header for unknown stream: " + i12);
        }
    }

    public final void e(o oVar, int i11, byte b3, int i12) throws IOException {
        if (i12 == 0) {
            i.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s3 = (b3 & 8) != 0 ? (short) (this.f46119a.readByte() & 255) : (short) 0;
        int i13 = this.f46119a.readInt() & Integer.MAX_VALUE;
        ArrayList arrayListC = c(i.b(i11 - 4, b3, s3), s3, b3, i12);
        ob.e eVar = oVar.f44233a;
        q qVar = q.INBOUND;
        if (eVar.l()) {
            ((Logger) eVar.f44804b).log((Level) eVar.f44805c, qVar + " PUSH_PROMISE: streamId=" + i12 + " promisedStreamId=" + i13 + " headers=" + arrayListC);
        }
        synchronized (oVar.f44236d.f44247k) {
            oVar.f44236d.f44245i.e(i12, a.PROTOCOL_ERROR);
        }
    }

    public final void f(o oVar, int i11, int i12) throws IOException {
        a aVar;
        if (i11 != 4) {
            i.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i11));
            throw null;
        }
        if (i12 == 0) {
            i.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int i13 = this.f46119a.readInt();
        a[] aVarArrValues = a.values();
        int length = aVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i14];
            if (aVar.httpCode == i13) {
                break;
            } else {
                i14++;
            }
        }
        if (aVar == null) {
            i.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i13));
            throw null;
        }
        oVar.f44233a.q(q.INBOUND, i12, aVar);
        lw.q1 q1VarB = p.v(aVar).b("Rst Stream");
        lw.p1 p1Var = q1VarB.f40444a;
        boolean z11 = p1Var == lw.p1.CANCELLED || p1Var == lw.p1.DEADLINE_EXCEEDED;
        synchronized (oVar.f44236d.f44247k) {
            try {
                m mVar = (m) oVar.f44236d.f44249n.get(Integer.valueOf(i12));
                if (mVar != null) {
                    tw.c cVar = mVar.P.I;
                    tw.b.f52660a.getClass();
                    oVar.f44236d.h(i12, q1VarB, aVar == a.REFUSED_STREAM ? x.REFUSED : x.PROCESSED, z11, null, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(o oVar, int i11, byte b3, int i12) throws IOException {
        boolean z11;
        if (i12 != 0) {
            i.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b3 & 1) != 0) {
            if (i11 == 0) {
                return;
            }
            i.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i11 % 6 != 0) {
            i.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i11));
            throw null;
        }
        p0 p0Var = new p0(1, false);
        int i13 = 0;
        while (true) {
            short s3 = 4;
            if (i13 >= i11) {
                oVar.f44233a.r(q.INBOUND, p0Var);
                synchronized (oVar.f44236d.f44247k) {
                    try {
                        if (p0Var.a(4)) {
                            oVar.f44236d.C = p0Var.f39389b[4];
                        }
                        if (p0Var.a(7)) {
                            int i14 = p0Var.f39389b[7];
                            com.android.billingclient.api.d0 d0Var = oVar.f44236d.f44246j;
                            if (i14 < 0) {
                                d0Var.getClass();
                                throw new IllegalArgumentException(nv.p.j(i14, "Invalid initial window size: "));
                            }
                            int i15 = i14 - d0Var.f7497a;
                            d0Var.f7497a = i14;
                            z11 = false;
                            for (z zVar : ((p) d0Var.f7498b).i()) {
                                zVar.a(i15);
                            }
                            if (i15 > 0) {
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                        }
                        if (oVar.f44235c) {
                            p pVar = oVar.f44236d;
                            ie.o oVar2 = pVar.f44244h;
                            lw.b bVar = pVar.f44256u;
                            Iterator it = ((a2) oVar2.f34407d).f42318j.iterator();
                            if (it.hasNext()) {
                                it.next().getClass();
                                throw new ClassCastException();
                            }
                            pVar.f44256u = bVar;
                            ie.o oVar3 = oVar.f44236d.f44244h;
                            a2 a2Var = (a2) oVar3.f34407d;
                            a2Var.f42317i.h(lw.e.INFO, "READY");
                            a2Var.f42319k.execute(new y1(oVar3, 0));
                            oVar.f44235c = false;
                        }
                        oVar.f44236d.f44245i.a(p0Var);
                        if (z11) {
                            oVar.f44236d.f44246j.d();
                        }
                        oVar.f44236d.s();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int i16 = p0Var.f39388a;
                if (((i16 & 2) != 0 ? p0Var.f39389b[1] : -1) >= 0) {
                    c cVar = this.f46121c;
                    int i17 = (i16 & 2) != 0 ? p0Var.f39389b[1] : -1;
                    cVar.f46101c = i17;
                    cVar.f46102d = i17;
                    int i18 = cVar.f46106h;
                    if (i17 < i18) {
                        if (i17 != 0) {
                            cVar.a(i18 - i17);
                            return;
                        }
                        Arrays.fill(cVar.f46103e, (Object) null);
                        cVar.f46104f = cVar.f46103e.length - 1;
                        cVar.f46105g = 0;
                        cVar.f46106h = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            short s11 = this.f46119a.readShort();
            int i19 = this.f46119a.readInt();
            switch (s11) {
                case 1:
                case 6:
                    s3 = s11;
                    break;
                case 2:
                    if (i19 != 0 && i19 != 1) {
                        i.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    s3 = s11;
                    break;
                    break;
                case 3:
                    break;
                case 4:
                    if (i19 < 0) {
                        i.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    s3 = 7;
                    break;
                    break;
                case 5:
                    if (i19 < 16384 || i19 > 16777215) {
                        i.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i19));
                        throw null;
                    }
                    s3 = s11;
                    break;
                    break;
                default:
                    continue;
                    i13 += 6;
                    break;
            }
            p0Var.h(s3, i19);
            i13 += 6;
        }
    }
}
