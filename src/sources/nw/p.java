package nw;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.android.billingclient.api.d0;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import io.grpc.StatusException;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import l1.p0;
import lw.c1;
import lw.d1;
import lw.e1;
import lw.q1;
import m00.c0;
import mw.f0;
import mw.g2;
import mw.g5;
import mw.h2;
import mw.i1;
import mw.i2;
import mw.j5;
import mw.k1;
import mw.n3;
import mw.n5;
import mw.p1;
import mw.r1;
import mw.r5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements f0 {
    public static final Map P;
    public static final Logger Q;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public int C;
    public final LinkedList D;
    public final io.grpc.okhttp.internal.c E;
    public i2 F;
    public boolean G;
    public long H;
    public long I;
    public final aj.i J;
    public final int K;
    public final r5 L;
    public final r1 M;
    public final lw.z N;
    public final int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f44237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f44240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Supplier f44241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ow.i f44243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ie.o f44244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f44245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f44246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f44247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lw.f0 f44248l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f44249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f44250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g5 f44251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f44252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f44253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f44254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f44255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public lw.b f44256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q1 f44257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public mw.q1 f44259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44260y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44261z;

    static {
        EnumMap enumMap = new EnumMap(ow.a.class);
        ow.a aVar = ow.a.NO_ERROR;
        q1 q1Var = q1.f40441l;
        enumMap.put(aVar, q1Var.h("No error: A GRPC status of OK should have been sent"));
        enumMap.put(ow.a.PROTOCOL_ERROR, q1Var.h("Protocol error"));
        enumMap.put(ow.a.INTERNAL_ERROR, q1Var.h("Internal error"));
        enumMap.put(ow.a.FLOW_CONTROL_ERROR, q1Var.h("Flow control error"));
        enumMap.put(ow.a.STREAM_CLOSED, q1Var.h("Stream closed"));
        enumMap.put(ow.a.FRAME_TOO_LARGE, q1Var.h("Frame too large"));
        enumMap.put(ow.a.REFUSED_STREAM, q1.m.h("Refused stream"));
        enumMap.put(ow.a.CANCEL, q1.f40435f.h("Cancelled"));
        enumMap.put(ow.a.COMPRESSION_ERROR, q1Var.h("Compression error"));
        enumMap.put(ow.a.CONNECT_ERROR, q1Var.h("Connect error"));
        enumMap.put(ow.a.ENHANCE_YOUR_CALM, q1.f40439j.h("Enhance your calm"));
        enumMap.put(ow.a.INADEQUATE_SECURITY, q1.f40438i.h("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(p.class.getName());
    }

    public p(i iVar, InetSocketAddress inetSocketAddress, String str, lw.b bVar, lw.z zVar, aj.i iVar2) {
        i1 i1Var = k1.f42503r;
        ow.i iVar3 = new ow.i();
        this.f44240d = new Random();
        Object obj = new Object();
        this.f44247k = obj;
        this.f44249n = new HashMap();
        this.C = 0;
        this.D = new LinkedList();
        this.M = new r1(this, 2);
        this.O = 30000;
        Preconditions.k(inetSocketAddress, "address");
        this.f44237a = inetSocketAddress;
        this.f44238b = str;
        this.f44253r = iVar.H;
        this.f44242f = iVar.N;
        Executor executor = iVar.f44209b;
        Preconditions.k(executor, "executor");
        this.f44250o = executor;
        this.f44251p = new g5(iVar.f44209b);
        ScheduledExecutorService scheduledExecutorService = iVar.f44211d;
        Preconditions.k(scheduledExecutorService, "scheduledExecutorService");
        this.f44252q = scheduledExecutorService;
        this.m = 3;
        this.A = SocketFactory.getDefault();
        this.B = iVar.f44213f;
        io.grpc.okhttp.internal.c cVar = iVar.f44214t;
        Preconditions.k(cVar, "connectionSpec");
        this.E = cVar;
        Preconditions.k(i1Var, "stopwatchFactory");
        this.f44241e = i1Var;
        this.f44243g = iVar3;
        this.f44239c = "grpc-java-okhttp/1.62.2";
        this.N = zVar;
        this.J = iVar2;
        this.K = iVar.O;
        iVar.f44212e.getClass();
        this.L = new r5();
        this.f44248l = lw.f0.a(p.class, inetSocketAddress.toString());
        lw.b bVar2 = lw.b.f40342b;
        lw.a aVar = j5.f42482b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(aVar, bVar);
        for (Map.Entry entry : bVar2.f40343a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((lw.a) entry.getKey(), entry.getValue());
            }
        }
        this.f44256u = new lw.b(identityHashMap);
        synchronized (obj) {
        }
    }

    public static void e(p pVar, ow.a aVar, String str) {
        pVar.r(0, aVar, v(aVar).b(str));
    }

    public static Socket f(p pVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        SocketFactory socketFactory = pVar.A;
        Socket socket = null;
        try {
            Socket socketCreateSocket = inetSocketAddress2.getAddress() != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(pVar.O);
                m00.d dVarJ = m00.b.j(socketCreateSocket);
                c0 c0VarB = m00.b.b(m00.b.h(socketCreateSocket));
                b1.p pVarG = pVar.g(inetSocketAddress, str, str2);
                a5.j jVar = (a5.j) pVarG.f3801c;
                pw.a aVar = (pw.a) pVarG.f3800b;
                Locale locale = Locale.US;
                c0VarB.l0("CONNECT " + aVar.f47195a + ":" + aVar.f47196b + " HTTP/1.1");
                c0VarB.l0("\r\n");
                String[] strArr = (String[]) jVar.f385b;
                String[] strArr2 = (String[]) jVar.f385b;
                int length = strArr.length / 2;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    c0VarB.l0((i12 < 0 || i12 >= strArr2.length) ? null : strArr2[i12]);
                    c0VarB.l0(": ");
                    int i13 = i12 + 1;
                    c0VarB.l0((i13 < 0 || i13 >= strArr2.length) ? null : strArr2[i13]);
                    c0VarB.l0("\r\n");
                }
                c0VarB.l0("\r\n");
                c0VarB.flush();
                ij.d dVarZ = ij.d.z(o(dVarJ));
                int i14 = dVarZ.f34421b;
                while (!o(dVarJ).equals(BuildConfig.VERSION_NAME)) {
                }
                if (i14 >= 200 && i14 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                m00.i iVar = new m00.i();
                try {
                    socketCreateSocket.shutdownOutput();
                    dVarJ.read(iVar, 1024L);
                } catch (IOException e8) {
                    iVar.Y("Unable to read body: " + e8.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new StatusException(q1.m.h("Response returned from proxy was not successful (expected 2xx, got " + i14 + " " + ((String) dVarZ.f34423d) + "). Response body:\n" + iVar.B()));
            } catch (IOException e10) {
                e = e10;
                socket = socketCreateSocket;
                if (socket != null) {
                    k1.b(socket);
                }
                throw new StatusException(q1.m.h("Failed trying to connect with proxy").g(e));
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static String o(m00.d dVar) throws EOFException {
        m00.i iVar = new m00.i();
        while (dVar.read(iVar, 1L) != -1) {
            if (iVar.h(iVar.f40718b - 1) == 10) {
                return iVar.c0(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: " + iVar.z(iVar.f40718b).f());
    }

    public static q1 v(ow.a aVar) {
        q1 q1Var = (q1) P.get(aVar);
        if (q1Var != null) {
            return q1Var;
        }
        return q1.f40436g.h("Unknown http2 error code: " + aVar.httpCode);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // mw.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Runnable a(mw.f3 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            ie.o r8 = (ie.o) r8
            r7.f44244h = r8
            boolean r8 = r7.G
            if (r8 == 0) goto L1e
            mw.i2 r0 = new mw.i2
            a5.f r1 = new a5.f
            r8 = 27
            r1.<init>(r7, r8)
            java.util.concurrent.ScheduledExecutorService r2 = r7.f44252q
            long r3 = r7.H
            long r5 = r7.I
            r0.<init>(r1, r2, r3, r5)
            r7.F = r0
            monitor-enter(r0)
            monitor-exit(r0)
        L1e:
            mw.g5 r8 = r7.f44251p
            nw.c r4 = new nw.c
            r4.<init>(r8, r7)
            ow.i r8 = r7.f44243g
            m00.c0 r0 = m00.b.b(r4)
            r8.getClass()
            ow.h r8 = new ow.h
            r8.<init>(r0)
            nw.b r0 = new nw.b
            r0.<init>(r4, r8)
            java.lang.Object r8 = r7.f44247k
            monitor-enter(r8)
            nw.d r1 = new nw.d     // Catch: java.lang.Throwable -> L77
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L77
            r7.f44245i = r1     // Catch: java.lang.Throwable -> L77
            com.android.billingclient.api.d0 r0 = new com.android.billingclient.api.d0     // Catch: java.lang.Throwable -> L77
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L77
            r7.f44246j = r0     // Catch: java.lang.Throwable -> L77
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r8 = 1
            r3.<init>(r8)
            mw.g5 r8 = r7.f44251p
            com.android.billingclient.api.b0 r0 = new com.android.billingclient.api.b0
            r1 = 7
            r5 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.execute(r0)
            r7.p()     // Catch: java.lang.Throwable -> L71
            r3.countDown()
            mw.g5 r8 = r2.f44251p
            aj.i r0 = new aj.i
            r1 = 25
            r0.<init>(r7, r1)
            r8.execute(r0)
            r8 = 0
            return r8
        L71:
            r0 = move-exception
            r8 = r0
            r3.countDown()
            throw r8
        L77:
            r0 = move-exception
            r2 = r7
        L79:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7b
            throw r0
        L7b:
            r0 = move-exception
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: nw.p.a(mw.f3):java.lang.Runnable");
    }

    @Override // mw.z
    public final mw.w b(e1 e1Var, c1 c1Var, lw.c cVar, lw.j[] jVarArr) {
        m mVar;
        Preconditions.k(e1Var, "method");
        Preconditions.k(c1Var, "headers");
        lw.b bVar = this.f44256u;
        n5 n5Var = new n5(jVarArr);
        for (lw.j jVar : jVarArr) {
            jVar.n(bVar, c1Var);
        }
        synchronized (this.f44247k) {
            mVar = new m(e1Var, c1Var, this.f44245i, this, this.f44246j, this.f44247k, this.f44253r, this.f44242f, this.f44238b, this.f44239c, n5Var, this.L, cVar);
        }
        return mVar;
    }

    @Override // mw.g3
    public final void c(q1 q1Var) {
        synchronized (this.f44247k) {
            try {
                if (this.f44257v != null) {
                    return;
                }
                this.f44257v = q1Var;
                this.f44244h.i(q1Var);
                u();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lw.e0
    public final lw.f0 d() {
        return this.f44248l;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a6 A[EDGE_INSN: B:106:0x01a6->B:158:0x0252 BREAK  A[LOOP:9: B:145:0x022f->B:156:0x024e], PHI: r16
      0x01a6: PHI (r16v2 int) = (r16v0 int), (r16v0 int), (r16v0 int), (r16v0 int), (r16v0 int), (r16v5 int) binds: [B:187:0x01a6, B:232:0x01a6, B:151:0x0241, B:234:0x01a6, B:143:0x022c, B:105:0x01a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:126:0x01de  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x020e  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:200:0x009a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0161 A[EDGE_INSN: B:207:0x0161->B:92:0x0161 BREAK  A[LOOP:3: B:87:0x014b->B:91:0x0159], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126 A[LOOP:7: B:52:0x00db->B:80:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0159 A[LOOP:3: B:87:0x014b->B:91:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    public final b1.p g(InetSocketAddress inetSocketAddress, String str, String str2) {
        String strSubstring;
        int i11;
        String strB;
        int i12;
        InetAddress byAddress;
        byte[] address;
        int i13;
        int i14;
        int i15;
        int i16;
        m00.i iVar;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        char cCharAt;
        int i25;
        int i26;
        int i27;
        int iA;
        int i28;
        int i29 = 0;
        ij.d dVar = new ij.d(18, (boolean) (0 == true ? 1 : 0));
        dVar.f34421b = -1;
        dVar.f34422c = Constants.SCHEME;
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strSubstring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(iCharCount) == '%') {
                m00.i iVar2 = new m00.i();
                iVar2.W(0, iCharCount, hostName);
                while (iCharCount < length) {
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i28 = iCharCount + 2) >= length) {
                        iVar2.Z(iCodePointAt);
                    } else {
                        int iA2 = pw.a.a(hostName.charAt(iCharCount + 1));
                        int iA3 = pw.a.a(hostName.charAt(i28));
                        if (iA2 == -1 || iA3 == -1) {
                            iVar2.Z(iCodePointAt);
                        } else {
                            iVar2.J((iA2 << 4) + iA3);
                            iCharCount = i28;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = iVar2.B();
                break;
            }
            iCharCount++;
        }
        int i30 = 2;
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            i30 = 2;
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i11 >= lowerCase.length()) {
                            strB = lowerCase;
                            break;
                        }
                        char cCharAt2 = lowerCase.charAt(i11);
                        i11 = (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) ? i11 + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            strB = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i31 = 16;
        byte[] bArr = new byte[16];
        int i32 = -1;
        int i33 = 0;
        int i34 = 1;
        int i35 = -1;
        while (true) {
            try {
                if (i34 < length2) {
                    if (i33 != i31) {
                        int i36 = i34 + 2;
                        if (i36 > length2 || !strSubstring.regionMatches(i34, "::", i29, i30)) {
                            if (i33 == 0) {
                                i25 = i34;
                                i26 = 0;
                                while (i25 < length2) {
                                    iA = pw.a.a(strSubstring.charAt(i25));
                                    if (iA == -1) {
                                        break;
                                        break;
                                    }
                                    i26 = (i26 << 4) + iA;
                                    i25++;
                                }
                                i27 = i25 - i34;
                                if (i27 == 0) {
                                }
                            } else if (strSubstring.regionMatches(i34, ":", i29, 1)) {
                                i34++;
                                i30 = i30;
                                i25 = i34;
                                i26 = 0;
                                while (i25 < length2) {
                                    iA = pw.a.a(strSubstring.charAt(i25));
                                    if (iA == -1) {
                                        break;
                                    }
                                    i26 = (i26 << 4) + iA;
                                    i25++;
                                }
                                i27 = i25 - i34;
                                if (i27 == 0 && i27 <= 4) {
                                    int i37 = i33 + 1;
                                    bArr[i33] = (byte) (255 & (i26 >>> 8));
                                    i33 += 2;
                                    bArr[i37] = (byte) (i26 & 255);
                                    i32 = i34;
                                    i30 = i30;
                                    i31 = 16;
                                    i34 = i25;
                                    i29 = 0;
                                }
                            } else if (strSubstring.regionMatches(i34, ".", i29, 1)) {
                                int i38 = i33 - 2;
                                int i39 = i38;
                                int i40 = i32;
                                while (true) {
                                    if (i40 < length2) {
                                        i30 = i30;
                                        if (i39 != 16) {
                                            if (i39 == i38) {
                                                i21 = i40;
                                                i22 = 0;
                                                while (true) {
                                                    i23 = i38;
                                                    if (i21 < length2) {
                                                        cCharAt = strSubstring.charAt(i21);
                                                        i24 = i33;
                                                        if (cCharAt < '0' && cCharAt <= '9') {
                                                            if ((i22 != 0 || i40 == i21) && (i22 = ((i22 * 10) + cCharAt) - 48) <= 255) {
                                                                i21++;
                                                                i38 = i23;
                                                                i33 = i24;
                                                            }
                                                        }
                                                    } else {
                                                        i24 = i33;
                                                    }
                                                    if (i21 - i40 == 0) {
                                                        bArr[i39] = (byte) i22;
                                                        i39++;
                                                        i40 = i21;
                                                        i30 = i30;
                                                        i38 = i23;
                                                        i33 = i24;
                                                    }
                                                }
                                            } else if (strSubstring.charAt(i40) == '.') {
                                                i40++;
                                                i21 = i40;
                                                i22 = 0;
                                                while (true) {
                                                    i23 = i38;
                                                    if (i21 < length2) {
                                                        cCharAt = strSubstring.charAt(i21);
                                                        i24 = i33;
                                                        if (cCharAt < '0') {
                                                        }
                                                    } else {
                                                        i24 = i33;
                                                    }
                                                    if (i21 - i40 == 0) {
                                                        bArr[i39] = (byte) i22;
                                                        i39++;
                                                        i40 = i21;
                                                        i30 = i30;
                                                        i38 = i23;
                                                        i33 = i24;
                                                    }
                                                    i21++;
                                                    i38 = i23;
                                                    i33 = i24;
                                                }
                                            }
                                        }
                                    } else {
                                        i30 = i30;
                                        int i41 = i33;
                                        if (i39 == i41 + 2) {
                                            i33 = i41 + 2;
                                            i12 = 16;
                                        }
                                        if (byAddress == null) {
                                            strB = null;
                                            break;
                                        }
                                        address = byAddress.getAddress();
                                        i13 = 16;
                                        if (address.length != 16) {
                                            throw new AssertionError();
                                        }
                                        i14 = 0;
                                        i15 = -1;
                                        i16 = 0;
                                        while (i14 < address.length) {
                                            i18 = i14;
                                            while (i18 < i13 && address[i18] == 0 && address[i18 + 1] == 0) {
                                                i18 += 2;
                                                i13 = 16;
                                            }
                                            i19 = i18 - i14;
                                            if (i19 > i16) {
                                                i15 = i14;
                                                i16 = i19;
                                            }
                                            i14 = i18 + 2;
                                            i13 = 16;
                                        }
                                        iVar = new m00.i();
                                        i17 = 0;
                                        while (i17 < address.length) {
                                            if (i17 == i15) {
                                                iVar.J(58);
                                                i17 += i16;
                                                if (i17 == 16) {
                                                    iVar.J(58);
                                                }
                                            } else {
                                                if (i17 > 0) {
                                                    iVar.J(58);
                                                }
                                                iVar.S(((address[i17] & 255) << 8) | (address[i17 + 1] & 255));
                                                i17 += 2;
                                            }
                                        }
                                        strB = iVar.B();
                                    }
                                }
                            }
                        } else if (i35 == -1) {
                            i33 += 2;
                            if (i36 == length2) {
                                i30 = i30;
                                i35 = i33;
                                i12 = 16;
                            } else {
                                i34 = i36;
                                i35 = i33;
                                i25 = i34;
                                i26 = 0;
                                while (i25 < length2) {
                                    iA = pw.a.a(strSubstring.charAt(i25));
                                    if (iA == -1) {
                                        break;
                                        break;
                                    }
                                    i26 = (i26 << 4) + iA;
                                    i25++;
                                }
                                i27 = i25 - i34;
                                if (i27 == 0) {
                                }
                            }
                        }
                        byAddress = null;
                        if (byAddress == null) {
                            strB = null;
                            break;
                        }
                        address = byAddress.getAddress();
                        i13 = 16;
                        if (address.length != 16) {
                            throw new AssertionError();
                        }
                        i14 = 0;
                        i15 = -1;
                        i16 = 0;
                        while (i14 < address.length) {
                            i18 = i14;
                            while (i18 < i13) {
                                i18 += 2;
                                i13 = 16;
                            }
                            i19 = i18 - i14;
                            if (i19 > i16) {
                                i15 = i14;
                                i16 = i19;
                            }
                            i14 = i18 + 2;
                            i13 = 16;
                        }
                        iVar = new m00.i();
                        i17 = 0;
                        while (i17 < address.length) {
                            if (i17 == i15) {
                                iVar.J(58);
                                i17 += i16;
                                if (i17 == 16) {
                                    iVar.J(58);
                                }
                            } else {
                                if (i17 > 0) {
                                    iVar.J(58);
                                }
                                iVar.S(((address[i17] & 255) << 8) | (address[i17 + 1] & 255));
                                i17 += 2;
                            }
                        }
                        strB = iVar.B();
                    }
                    i30 = i30;
                    byAddress = null;
                    if (byAddress == null) {
                        strB = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i13 = 16;
                    if (address.length != 16) {
                        throw new AssertionError();
                    }
                    i14 = 0;
                    i15 = -1;
                    i16 = 0;
                    while (i14 < address.length) {
                        i18 = i14;
                        while (i18 < i13) {
                            i18 += 2;
                            i13 = 16;
                        }
                        i19 = i18 - i14;
                        if (i19 > i16) {
                            i15 = i14;
                            i16 = i19;
                        }
                        i14 = i18 + 2;
                        i13 = 16;
                    }
                    iVar = new m00.i();
                    i17 = 0;
                    while (i17 < address.length) {
                        if (i17 == i15) {
                            iVar.J(58);
                            i17 += i16;
                            if (i17 == 16) {
                                iVar.J(58);
                            }
                        } else {
                            if (i17 > 0) {
                                iVar.J(58);
                            }
                            iVar.S(((address[i17] & 255) << 8) | (address[i17 + 1] & 255));
                            i17 += 2;
                        }
                    }
                    strB = iVar.B();
                } else {
                    i30 = i30;
                    i12 = i31;
                }
                if (i33 != i12) {
                    if (i35 == -1) {
                        byAddress = null;
                    } else {
                        int i42 = i33 - i35;
                        System.arraycopy(bArr, i35, bArr, 16 - i42, i42);
                        Arrays.fill(bArr, i35, (16 - i33) + i35, (byte) 0);
                    }
                    if (byAddress == null) {
                        strB = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i13 = 16;
                    if (address.length != 16) {
                        throw new AssertionError();
                    }
                    i14 = 0;
                    i15 = -1;
                    i16 = 0;
                    while (i14 < address.length) {
                        i18 = i14;
                        while (i18 < i13) {
                            i18 += 2;
                            i13 = 16;
                        }
                        i19 = i18 - i14;
                        if (i19 > i16) {
                            i15 = i14;
                            i16 = i19;
                        }
                        i14 = i18 + 2;
                        i13 = 16;
                    }
                    iVar = new m00.i();
                    i17 = 0;
                    while (i17 < address.length) {
                        if (i17 == i15) {
                            iVar.J(58);
                            i17 += i16;
                            if (i17 == 16) {
                                iVar.J(58);
                            }
                        } else {
                            if (i17 > 0) {
                                iVar.J(58);
                            }
                            iVar.S(((address[i17] & 255) << 8) | (address[i17 + 1] & 255));
                            i17 += 2;
                        }
                    }
                    strB = iVar.B();
                }
                byAddress = InetAddress.getByAddress(bArr);
                if (byAddress == null) {
                    strB = null;
                    break;
                }
                address = byAddress.getAddress();
                i13 = 16;
                if (address.length != 16) {
                    throw new AssertionError();
                }
                i14 = 0;
                i15 = -1;
                i16 = 0;
                while (i14 < address.length) {
                    i18 = i14;
                    while (i18 < i13) {
                        i18 += 2;
                        i13 = 16;
                    }
                    i19 = i18 - i14;
                    if (i19 > i16) {
                        i15 = i14;
                        i16 = i19;
                    }
                    i14 = i18 + 2;
                    i13 = 16;
                }
                iVar = new m00.i();
                i17 = 0;
                while (i17 < address.length) {
                    if (i17 == i15) {
                        iVar.J(58);
                        i17 += i16;
                        if (i17 == 16) {
                            iVar.J(58);
                        }
                    } else {
                        if (i17 > 0) {
                            iVar.J(58);
                        }
                        iVar.S(((address[i17] & 255) << 8) | (address[i17 + 1] & 255));
                        i17 += 2;
                    }
                }
                strB = iVar.B();
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        dVar.f34423d = strB;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(nv.p.j(port, "unexpected port: "));
        }
        dVar.f34421b = port;
        if (((String) dVar.f34423d) == null) {
            throw new IllegalStateException("host == null");
        }
        pw.a aVar = new pw.a(dVar);
        ob.u uVar = new ob.u(27, false);
        uVar.f44892c = new ed.c(i30);
        uVar.f44891b = aVar;
        uVar.v(HttpHeaders.HOST, aVar.f47195a + ":" + aVar.f47196b);
        uVar.v(HttpHeaders.USER_AGENT, this.f44239c);
        if (str != null && str2 != null) {
            try {
                byte[] bytes = (str + ":" + str2).getBytes("ISO-8859-1");
                m00.l lVar = m00.l.f40723d;
                uVar.v("Proxy-Authorization", "Basic " + p3.u(bytes).a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((pw.a) uVar.f44891b) != null) {
            return new b1.p(uVar);
        }
        throw new IllegalStateException("url == null");
    }

    @Override // mw.f0
    public final lw.b getAttributes() {
        return this.f44256u;
    }

    public final void h(int i11, q1 q1Var, mw.x xVar, boolean z11, ow.a aVar, c1 c1Var) {
        synchronized (this.f44247k) {
            try {
                m mVar = (m) this.f44249n.remove(Integer.valueOf(i11));
                if (mVar != null) {
                    if (aVar != null) {
                        this.f44245i.e(i11, ow.a.CANCEL);
                    }
                    if (q1Var != null) {
                        l lVar = mVar.P;
                        if (c1Var == null) {
                            c1Var = new c1();
                        }
                        lVar.f(q1Var, xVar, z11, c1Var);
                    }
                    if (!s()) {
                        u();
                        m(mVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final z[] i() {
        z[] zVarArr;
        z zVar;
        synchronized (this.f44247k) {
            zVarArr = new z[this.f44249n.size()];
            Iterator it = this.f44249n.values().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int i12 = i11 + 1;
                l lVar = ((m) it.next()).P;
                synchronized (lVar.f44229w) {
                    zVar = lVar.J;
                }
                zVarArr[i11] = zVar;
                i11 = i12;
            }
        }
        return zVarArr;
    }

    public final int j() {
        URI uriA = k1.a(this.f44238b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f44237a.getPort();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    public final boolean l(int i11) {
        boolean z11;
        synchronized (this.f44247k) {
            if (i11 < this.m) {
                z11 = true;
                if ((i11 & 1) != 1) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public final void m(m mVar) {
        if (this.f44261z && this.D.isEmpty() && this.f44249n.isEmpty()) {
            this.f44261z = false;
            i2 i2Var = this.F;
            if (i2Var != null) {
                synchronized (i2Var) {
                    try {
                        h2 h2Var = i2Var.f42451d;
                        if (h2Var == h2.PING_SCHEDULED || h2Var == h2.PING_DELAYED) {
                            i2Var.f42451d = h2.IDLE;
                        }
                        if (i2Var.f42451d == h2.PING_SENT) {
                            i2Var.f42451d = h2.IDLE_AND_PING_SENT;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        if (mVar.f42368e) {
            this.M.r0(mVar, false);
        }
    }

    public final void n(Exception exc) {
        r(0, ow.a.INTERNAL_ERROR, q1.m.g(exc));
    }

    public final void p() {
        synchronized (this.f44247k) {
            try {
                d dVar = this.f44245i;
                dVar.getClass();
                try {
                    dVar.f44198b.b();
                } catch (IOException e8) {
                    dVar.f44197a.n(e8);
                }
                p0 p0Var = new p0(1, false);
                p0Var.h(7, this.f44242f);
                d dVar2 = this.f44245i;
                dVar2.f44199c.r(q.OUTBOUND, p0Var);
                try {
                    dVar2.f44198b.f(p0Var);
                } catch (IOException e10) {
                    dVar2.f44197a.n(e10);
                }
                int i11 = this.f44242f;
                if (i11 > 65535) {
                    this.f44245i.f(0, i11 - 65535);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(q1 q1Var) {
        c(q1Var);
        synchronized (this.f44247k) {
            try {
                Iterator it = this.f44249n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((m) entry.getValue()).P.g(q1Var, false, new c1());
                    m((m) entry.getValue());
                }
                for (m mVar : this.D) {
                    mVar.P.f(q1Var, mw.x.MISCARRIED, true, new c1());
                    m(mVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(int i11, ow.a aVar, q1 q1Var) {
        synchronized (this.f44247k) {
            try {
                if (this.f44257v == null) {
                    this.f44257v = q1Var;
                    this.f44244h.i(q1Var);
                }
                if (aVar != null && !this.f44258w) {
                    this.f44258w = true;
                    this.f44245i.c(aVar, new byte[0]);
                }
                Iterator it = this.f44249n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i11) {
                        it.remove();
                        ((m) entry.getValue()).P.f(q1Var, mw.x.REFUSED, false, new c1());
                        m((m) entry.getValue());
                    }
                }
                for (m mVar : this.D) {
                    mVar.P.f(q1Var, mw.x.MISCARRIED, true, new c1());
                    m(mVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean s() {
        boolean z11 = false;
        while (true) {
            LinkedList linkedList = this.D;
            if (linkedList.isEmpty() || this.f44249n.size() >= this.C) {
                break;
            }
            t((m) linkedList.poll());
            z11 = true;
        }
        return z11;
    }

    public final void t(m mVar) {
        boolean zE;
        Preconditions.p("StreamId already assigned", mVar.P.K == -1);
        this.f44249n.put(Integer.valueOf(this.m), mVar);
        if (!this.f44261z) {
            this.f44261z = true;
            i2 i2Var = this.F;
            if (i2Var != null) {
                i2Var.b();
            }
        }
        if (mVar.f42368e) {
            this.M.r0(mVar, true);
        }
        l lVar = mVar.P;
        int i11 = this.m;
        Preconditions.n(i11, "the stream has been started with id %s", lVar.K == -1);
        lVar.K = i11;
        d0 d0Var = lVar.F;
        lVar.J = new z(d0Var, i11, d0Var.f7497a, lVar);
        l lVar2 = lVar.L.P;
        Preconditions.r(lVar2.f42351j != null);
        synchronized (lVar2.f42343b) {
            Preconditions.p("Already allocated", !lVar2.f42347f);
            lVar2.f42347f = true;
        }
        synchronized (lVar2.f42343b) {
            zE = lVar2.e();
        }
        if (zE) {
            lVar2.f42351j.h();
        }
        r5 r5Var = lVar2.f42344c;
        r5Var.getClass();
        ((n3) r5Var.f42667a).t();
        if (lVar.H) {
            d dVar = lVar.E;
            boolean z11 = lVar.L.S;
            int i12 = lVar.K;
            ArrayList arrayList = lVar.f44230x;
            dVar.getClass();
            try {
                ow.h hVar = dVar.f44198b.f44187a;
                synchronized (hVar) {
                    if (hVar.f46126e) {
                        throw new IOException("closed");
                    }
                    hVar.b(i12, arrayList, z11);
                }
            } catch (IOException e8) {
                dVar.f44197a.n(e8);
            }
            for (lw.j jVar : lVar.L.N.f42589a) {
                jVar.h();
            }
            lVar.f44230x = null;
            m00.i iVar = lVar.f44231y;
            if (iVar.f40718b > 0) {
                lVar.F.a(lVar.f44232z, lVar.J, iVar, lVar.A);
            }
            lVar.H = false;
        }
        d1 d1Var = mVar.L.f40367a;
        if ((d1Var != d1.UNARY && d1Var != d1.SERVER_STREAMING) || mVar.S) {
            this.f44245i.flush();
        }
        int i13 = this.m;
        if (i13 < 2147483645) {
            this.m = i13 + 2;
        } else {
            this.m = Integer.MAX_VALUE;
            r(Integer.MAX_VALUE, ow.a.NO_ERROR, q1.m.h("Stream ids exhausted"));
        }
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(this.f44248l.f40379c, "logId");
        toStringHelperB.c(this.f44237a, "address");
        return toStringHelperB.toString();
    }

    public final void u() {
        if (this.f44257v == null || !this.f44249n.isEmpty() || !this.D.isEmpty() || this.f44260y) {
            return;
        }
        this.f44260y = true;
        i2 i2Var = this.F;
        if (i2Var != null) {
            synchronized (i2Var) {
                try {
                    h2 h2Var = i2Var.f42451d;
                    h2 h2Var2 = h2.DISCONNECTED;
                    if (h2Var != h2Var2) {
                        i2Var.f42451d = h2Var2;
                        ScheduledFuture scheduledFuture = i2Var.f42452e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = i2Var.f42453f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            i2Var.f42453f = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        mw.q1 q1Var = this.f44259x;
        if (q1Var != null) {
            StatusException statusExceptionK = k();
            synchronized (q1Var) {
                try {
                    if (!q1Var.f42644d) {
                        q1Var.f42644d = true;
                        q1Var.f42645e = statusExceptionK;
                        LinkedHashMap linkedHashMap = q1Var.f42643c;
                        q1Var.f42643c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new p1((g2) entry.getKey(), statusExceptionK));
                            } catch (Throwable th3) {
                                mw.q1.f42640g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            this.f44259x = null;
        }
        if (!this.f44258w) {
            this.f44258w = true;
            this.f44245i.c(ow.a.NO_ERROR, new byte[0]);
        }
        this.f44245i.close();
    }

    public final StatusException k() {
        synchronized (this.f44247k) {
            try {
                q1 q1Var = this.f44257v;
                if (q1Var != null) {
                    return new StatusException(q1Var);
                }
                return new StatusException(q1.m.h(DytezVyM.qlaMGxcTuJeujP));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
