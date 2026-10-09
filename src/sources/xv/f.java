package xv;

import a0.b2;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import fr.p3;
import hh.p0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ns.o;
import ob.u;
import r.x2;
import re.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {
    public static final ThreadPoolExecutor Y = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15, TimeUnit.SECONDS, new SynchronousQueue(), new ew.b("ConnectionBlock"));
    public int K;
    public final boolean M;
    public g O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public volatile boolean V;
    public volatile Exception W;
    public String X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f56596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bw.c f56597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bw.b f56598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f56600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wv.a f56601f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f56602t;
    public boolean L = false;
    public final ArrayList N = new ArrayList(5);
    public final AtomicBoolean T = new AtomicBoolean(true);
    public volatile boolean U = false;
    public boolean H = false;

    public f(bw.c cVar, bw.b bVar, u uVar, int i11, int i12, boolean z11, boolean z12, int i13) {
        this.f56597b = cVar;
        this.f56598c = bVar;
        this.f56599d = z11;
        this.f56600e = z12;
        x2 x2Var = c.f56595a;
        this.f56601f = x2Var.b();
        x2Var.f().getClass();
        this.M = true;
        this.f56602t = uVar;
        this.K = i13;
        this.f56596a = new h(cVar, i13, i11, i12);
    }

    public final int a(long j11) {
        boolean z11 = this.Q;
        if ((!z11 || this.f56597b.M > 1) && this.R && this.M && !this.S) {
            if (z11) {
                return this.f56597b.M;
            }
            x2 x2Var = c.f56595a;
            int i11 = this.f56597b.f6390a;
            q qVar = (q) x2Var.f48710b;
            if (qVar == null) {
                synchronized (x2Var) {
                    try {
                        if (((q) x2Var.f48710b) == null) {
                            x2Var.f48710b = ((b2) x2Var.c().f32184b) == null ? new q(8) : new q(8);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                qVar = (q) x2Var.f48710b;
            }
            qVar.getClass();
            if (j11 >= 1048576) {
                if (j11 < 5242880) {
                    return 2;
                }
                if (j11 < 52428800) {
                    return 3;
                }
                return j11 < 104857600 ? 4 : 5;
            }
        }
        return 1;
    }

    public final void b() throws d, e {
        bw.c cVar = this.f56597b;
        int i11 = cVar.f6390a;
        if (cVar.f6393d) {
            String strB = cVar.b();
            String str = cVar.f6391b;
            c.f56595a.d().getClass();
            int i12 = 0;
            int iP = p3.p(str, strB, false);
            boolean zD = o.D(strB, i11, this.f56599d, false);
            wv.a aVar = this.f56601f;
            if (zD) {
                aVar.remove(i11);
                aVar.h(i11);
                throw new d();
            }
            bw.c cVarR = aVar.r(iP);
            if (cVarR != null) {
                if (o.E(i11, cVarR, this.f56602t, false)) {
                    aVar.remove(i11);
                    aVar.h(i11);
                    throw new d();
                }
                ArrayList arrayListQ = aVar.q(iP);
                aVar.remove(iP);
                aVar.h(iP);
                String strB2 = cVar.b();
                if (strB2 != null) {
                    File file = new File(strB2);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                if (cVarR.c() == null ? false : ew.f.e(cVarR, cVarR.c())) {
                    cVar.d(cVarR.f6396t.get());
                    cVar.g(cVarR.H);
                    cVar.L = cVarR.L;
                    cVar.M = cVarR.M;
                    aVar.k(cVar);
                    int size = arrayListQ.size();
                    while (i12 < size) {
                        Object obj = arrayListQ.get(i12);
                        i12++;
                        bw.a aVar2 = (bw.a) obj;
                        aVar2.f6384a = i11;
                        aVar.b(aVar2);
                    }
                    throw new e();
                }
            }
            if (o.C(i11, cVar.f6396t.get(), cVar.c(), strB, this.f56602t)) {
                aVar.remove(i11);
                aVar.h(i11);
                throw new d();
            }
        }
    }

    public final void c() {
        boolean z11 = this.f56600e;
        if (z11 && o.f44007a.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            int i11 = this.f56597b.f6390a;
            Locale locale = Locale.ENGLISH;
            throw new FileDownloadGiveUpRetryException(p0.h(i11, "Task[", "] can't start the download runnable, because this task require wifi, but user application nor current process has android.permission.ACCESS_NETWORK_STATE, so we can't check whether the network type connection."));
        }
        if (z11 && ew.f.g()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    public final void d(long j11, List list) throws InterruptedException {
        String str;
        bw.c cVar = this.f56597b;
        int i11 = cVar.f6390a;
        String str2 = cVar.L;
        String str3 = this.X;
        if (str3 == null) {
            str3 = cVar.f6391b;
        }
        String str4 = str3;
        String strC = cVar.c();
        boolean z11 = this.Q;
        Iterator it = list.iterator();
        long j12 = 0;
        while (it.hasNext()) {
            bw.a aVar = (bw.a) it.next();
            long j13 = aVar.f6388e;
            long j14 = j13 == -1 ? j11 - aVar.f6387d : (j13 - aVar.f6387d) + 1;
            long j15 = aVar.f6387d;
            long j16 = aVar.f6386c;
            long j17 = (j15 - j16) + j12;
            if (j14 == 0) {
                str = strC;
            } else {
                b bVar = new b(j16, j15, j13, j14, false);
                int i12 = aVar.f6385b;
                String str5 = z11 ? str2 : null;
                bw.b bVar2 = this.f56598c;
                boolean z12 = this.f56600e;
                Boolean boolValueOf = Boolean.valueOf(z12);
                if (strC == null) {
                    int i13 = ew.f.f25949a;
                    throw new IllegalArgumentException(String.format(Locale.ENGLISH, "%s %s %B", this, strC, boolValueOf));
                }
                if (str4 == null) {
                    throw new IllegalArgumentException();
                }
                a aVar2 = new a(bVar, i11, str4, str5, bVar2);
                str = strC;
                this.N.add(new g(aVar2.f56582a, i12, aVar2, this, z12, str));
            }
            strC = str;
            j12 = j17;
        }
        if (j12 != this.f56597b.f6396t.get()) {
            o00.a.P(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.f56597b.f6396t.get()), Long.valueOf(j12));
            this.f56597b.d(j12);
        }
        ArrayList arrayList = new ArrayList(this.N.size());
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            g gVar = (g) obj;
            if (this.U) {
                gVar.f56608f = true;
                i iVar = gVar.f56607e;
                if (iVar != null) {
                    iVar.m = true;
                }
            } else {
                arrayList.add(Executors.callable(gVar));
            }
        }
        if (this.U) {
            this.f56597b.e((byte) -2);
        } else {
            Y.invokeAll(arrayList);
        }
    }

    public final void e(long j11, String str) throws IOException {
        xq.c cVarA = null;
        if (j11 != -1) {
            try {
                cVarA = ew.f.a(this.f56597b.c());
                long length = new File(str).length();
                long j12 = j11 - length;
                long availableBytes = new StatFs(str).getAvailableBytes();
                if (availableBytes < j12) {
                    Locale locale = Locale.ENGLISH;
                    throw new FileDownloadOutOfSpaceException("The file is too large to store, breakpoint in bytes:  " + length + ", required space in bytes: " + j12 + ", but free space in bytes: " + availableBytes);
                }
                if (!ew.d.f25940a.f25946f) {
                    ((RandomAccessFile) cVarA.f56176d).setLength(j11);
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    cVarA.o();
                }
                throw th2;
            }
        }
        if (cVarA != null) {
            cVarA.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01da  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:117:0x020c  */
    /* JADX WARN: Code duplicated, block: B:118:0x020e  */
    /* JADX WARN: Code duplicated, block: B:124:0x021b  */
    /* JADX WARN: Code duplicated, block: B:134:0x026b  */
    /* JADX WARN: Code duplicated, block: B:135:0x026e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0273  */
    /* JADX WARN: Code duplicated, block: B:141:0x027a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0176  */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f A[Catch: UnsupportedEncodingException | IllegalStateException -> 0x0180, TryCatch #0 {UnsupportedEncodingException | IllegalStateException -> 0x0180, blocks: (B:89:0x0183, B:91:0x018f, B:92:0x019e, B:94:0x01aa), top: B:146:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x019e A[Catch: UnsupportedEncodingException | IllegalStateException -> 0x0180, TryCatch #0 {UnsupportedEncodingException | IllegalStateException -> 0x0180, blocks: (B:89:0x0183, B:91:0x018f, B:92:0x019e, B:94:0x01aa), top: B:146:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa A[Catch: UnsupportedEncodingException | IllegalStateException -> 0x0180, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException | IllegalStateException -> 0x0180, blocks: (B:89:0x0183, B:91:0x018f, B:92:0x019e, B:94:0x01aa), top: B:146:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:144:0x0180
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void f(java.util.Map r27, xv.a r28, vv.a r29) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xv.f.f(java.util.Map, xv.a, vv.a):void");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void g(List list) {
        long length;
        bw.c cVar = this.f56597b;
        int i11 = cVar.M;
        String strC = cVar.c();
        String strB = cVar.b();
        boolean z11 = i11 > 1;
        if (this.L) {
            length = 0;
        } else {
            boolean z12 = this.M;
            if (!z11 || z12) {
                if (!(cVar.c() == null ? false : ew.f.e(cVar, cVar.c()))) {
                    length = 0;
                } else if (!z12) {
                    length = new File(strC).length();
                } else if (!z11) {
                    length = cVar.f6396t.get();
                } else if (i11 != list.size()) {
                    length = 0;
                } else {
                    Iterator it = list.iterator();
                    length = 0;
                    while (it.hasNext()) {
                        bw.a aVar = (bw.a) it.next();
                        length += aVar.f6387d - aVar.f6386c;
                    }
                }
            } else {
                length = 0;
            }
        }
        cVar.d(length);
        boolean z13 = length > 0;
        this.Q = z13;
        if (z13) {
            return;
        }
        this.f56601f.h(cVar.f6390a);
        ew.f.b(strB, strC);
    }

    public final boolean h() {
        if (this.T.get()) {
            return true;
        }
        HandlerThread handlerThread = this.f56596a.K;
        return handlerThread != null && handlerThread.isAlive();
    }

    public final boolean i(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int i11 = ((FileDownloadHttpException) exc).f22393a;
            if (this.P && i11 == 416 && !this.H) {
                bw.c cVar = this.f56597b;
                ew.f.b(cVar.b(), cVar.c());
                this.H = true;
                return true;
            }
        }
        return this.K > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    public final void j(Exception exc) {
        this.V = true;
        this.W = exc;
        if (this.U) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.N.clone();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g gVar = (g) obj;
            if (gVar != null) {
                gVar.f56608f = true;
                i iVar = gVar.f56607e;
                if (iVar != null) {
                    iVar.m = true;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public final void k(long j11) {
        if (this.U) {
            return;
        }
        h hVar = this.f56596a;
        hVar.O.addAndGet(j11);
        hVar.f56610a.f6396t.addAndGet(j11);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!hVar.R.compareAndSet(true, false)) {
            long j12 = jElapsedRealtime - hVar.N;
            if (hVar.f56616t != -1 && hVar.O.get() >= hVar.f56616t && j12 >= hVar.f56614e) {
                if (hVar.P.compareAndSet(false, true)) {
                    hVar.N = jElapsedRealtime;
                    hVar.O.set(0L);
                }
            }
        } else if (hVar.P.compareAndSet(false, true)) {
            hVar.N = jElapsedRealtime;
            hVar.O.set(0L);
        }
        if (hVar.H == null) {
            hVar.c();
        } else if (hVar.P.get()) {
            hVar.j(hVar.H.obtainMessage(3));
        }
    }

    public final void l(Exception exc) {
        if (this.U) {
            return;
        }
        int i11 = this.K;
        int i12 = i11 - 1;
        this.K = i12;
        if (i11 < 0) {
            o00.a.B(6, this, null, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i12), Integer.valueOf(this.f56597b.f6390a));
        }
        h hVar = this.f56596a;
        int i13 = this.K;
        hVar.O.set(0L);
        Handler handler = hVar.H;
        if (handler == null) {
            hVar.d(exc, i13);
        } else {
            hVar.j(handler.obtainMessage(5, i13, 0, exc));
        }
    }

    public final void m(int i11, long j11) throws InterruptedException {
        long j12 = j11 / ((long) i11);
        bw.c cVar = this.f56597b;
        int i12 = cVar.f6390a;
        ArrayList arrayList = new ArrayList();
        long j13 = 0;
        int i13 = 0;
        while (true) {
            wv.a aVar = this.f56601f;
            if (i13 >= i11) {
                cVar.M = i11;
                aVar.s(i12, i11);
                d(j11, arrayList);
                return;
            }
            long j14 = i13 == i11 + (-1) ? -1L : (j13 + j12) - 1;
            bw.a aVar2 = new bw.a();
            aVar2.f6384a = i12;
            aVar2.f6385b = i13;
            aVar2.f6386c = j13;
            aVar2.f6387d = j13;
            aVar2.f6388e = j14;
            arrayList.add(aVar2);
            aVar.b(aVar2);
            j13 += j12;
            i13++;
        }
    }

    public final void n(int i11, List list) throws InterruptedException {
        if (i11 <= 1 || list.size() != i11) {
            throw new IllegalArgumentException();
        }
        d(this.f56597b.H, list);
    }

    public final void o(long j11) {
        b bVar;
        if (this.R) {
            bVar = new b(this.f56597b.f6396t.get(), this.f56597b.f6396t.get(), -1L, j11 - this.f56597b.f6396t.get(), false);
        } else {
            this.f56597b.d(0L);
            bVar = new b(0L, 0L, -1L, j11, false);
        }
        int i11 = this.f56597b.f6390a;
        bw.c cVar = this.f56597b;
        String str = cVar.f6391b;
        String str2 = cVar.L;
        bw.b bVar2 = this.f56598c;
        boolean z11 = this.f56600e;
        Boolean boolValueOf = Boolean.valueOf(z11);
        String strC = this.f56597b.c();
        if (strC == null) {
            int i12 = ew.f.f25949a;
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "%s %s %B", this, strC, boolValueOf));
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        a aVar = new a(bVar, i11, str, str2, bVar2);
        this.O = new g(aVar.f56582a, -1, aVar, this, z11, strC);
        bw.c cVar2 = this.f56597b;
        cVar2.M = 1;
        this.f56601f.s(cVar2.f6390a, 1);
        if (!this.U) {
            this.O.run();
            return;
        }
        this.f56597b.e((byte) -2);
        g gVar = this.O;
        gVar.f56608f = true;
        i iVar = gVar.f56607e;
        if (iVar != null) {
            iVar.m = true;
        }
    }

    public final void p() {
        bw.c cVar = this.f56597b;
        vv.a aVar = null;
        try {
            b bVar = this.L ? new b(0L, 0L, 0L, 0L, true) : new b();
            int i11 = cVar.f6390a;
            String str = cVar.f6391b;
            String str2 = cVar.L;
            bw.b bVar2 = this.f56598c;
            if (str == null) {
                throw new IllegalArgumentException();
            }
            a aVar2 = new a(bVar, i11, str, str2, bVar2);
            vv.a aVarA = aVar2.a();
            f(aVar2.f56587f, aVar2, aVarA);
            aVarA.l();
        } catch (Throwable th2) {
            if (0 != 0) {
                aVar.l();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ab A[Catch: all -> 0x0073, TryCatch #8 {all -> 0x0073, blocks: (B:3:0x0007, B:5:0x0014, B:8:0x001d, B:23:0x0076, B:25:0x007a, B:26:0x008c, B:38:0x00a7, B:40:0x00c1, B:63:0x00f0, B:77:0x0122, B:79:0x0126, B:93:0x014b, B:95:0x014f, B:96:0x0153, B:98:0x015c, B:99:0x0160, B:100:0x0164, B:101:0x0181, B:114:0x01a5, B:116:0x01ab, B:117:0x01b0, B:102:0x0182), top: B:146:0x0007, inners: #14, #14, #11 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:158:0x01b0 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
            if (this.f56597b.a() != 1) {
                if (this.f56597b.a() != -2) {
                    bw.c cVar = this.f56597b;
                    int i11 = cVar.f6390a;
                    byte bA = cVar.a();
                    Locale locale = Locale.ENGLISH;
                    j(new RuntimeException("Task[" + i11 + "] can't start the download runnable, because its status is " + ((int) bA) + " not 1"));
                }
                this.f56596a.a();
                if (this.U) {
                    this.f56596a.h();
                } else if (this.V) {
                    this.f56596a.f(this.W);
                } else {
                    try {
                        this.f56596a.e();
                    } catch (IOException e8) {
                        e = e8;
                        this.f56596a.f(e);
                    }
                }
            } else {
                if (!this.U) {
                    h hVar = this.f56596a;
                    bw.c cVar2 = hVar.f56610a;
                    cVar2.e((byte) 6);
                    hVar.i((byte) 6);
                    hVar.f56611b.j(cVar2.f6390a);
                }
                while (true) {
                    if (this.U) {
                        this.f56596a.a();
                        if (this.U) {
                            this.f56596a.h();
                        } else if (this.V) {
                            this.f56596a.f(this.W);
                        } else {
                            try {
                                this.f56596a.e();
                            } catch (IOException e10) {
                                e = e10;
                                this.f56596a.f(e);
                            }
                        }
                    } else {
                        try {
                            c();
                            p();
                            b();
                            ArrayList arrayListQ = this.f56601f.q(this.f56597b.f6390a);
                            g(arrayListQ);
                            if (this.U) {
                                this.f56597b.e((byte) -2);
                                this.f56596a.a();
                                if (this.U) {
                                    this.f56596a.h();
                                } else if (this.V) {
                                    this.f56596a.f(this.W);
                                } else {
                                    try {
                                        this.f56596a.e();
                                    } catch (IOException e11) {
                                        e = e11;
                                        this.f56596a.f(e);
                                    }
                                }
                            } else {
                                bw.c cVar3 = this.f56597b;
                                long j11 = cVar3.H;
                                e(j11, cVar3.c());
                                int iA = a(j11);
                                if (iA <= 0) {
                                    Locale locale2 = Locale.ENGLISH;
                                    throw new IllegalAccessException("invalid connection count " + iA + ", the connection count must be larger than 0");
                                }
                                if (j11 == 0) {
                                    this.f56596a.a();
                                    if (this.U) {
                                        this.f56596a.h();
                                    } else if (this.V) {
                                        this.f56596a.f(this.W);
                                    } else {
                                        try {
                                            this.f56596a.e();
                                        } catch (IOException e12) {
                                            e = e12;
                                            this.f56596a.f(e);
                                        }
                                    }
                                } else if (this.U) {
                                    this.f56597b.e((byte) -2);
                                    this.f56596a.a();
                                    if (this.U) {
                                        this.f56596a.h();
                                    } else if (this.V) {
                                        this.f56596a.f(this.W);
                                    } else {
                                        try {
                                            this.f56596a.e();
                                        } catch (IOException e13) {
                                            e = e13;
                                            this.f56596a.f(e);
                                        }
                                    }
                                } else {
                                    boolean z11 = iA == 1;
                                    this.P = z11;
                                    if (z11) {
                                        o(j11);
                                    } else {
                                        this.f56596a.g();
                                        if (this.Q) {
                                            n(iA, arrayListQ);
                                        } else {
                                            m(iA, j11);
                                        }
                                    }
                                    this.f56596a.a();
                                    if (this.U) {
                                        this.f56596a.h();
                                    } else if (this.V) {
                                        this.f56596a.f(this.W);
                                    } else {
                                        try {
                                            this.f56596a.e();
                                        } catch (IOException e14) {
                                            e = e14;
                                            this.f56596a.f(e);
                                        }
                                    }
                                }
                            }
                        } catch (FileDownloadGiveUpRetryException e15) {
                            e = e15;
                            if (i(e)) {
                                l(e);
                            } else {
                                j(e);
                            }
                        } catch (FileDownloadSecurityException e16) {
                            e = e16;
                            if (i(e)) {
                                l(e);
                            } else {
                                j(e);
                            }
                        } catch (IOException e17) {
                            e = e17;
                            if (i(e)) {
                                l(e);
                            } else {
                                j(e);
                            }
                        } catch (IllegalAccessException e18) {
                            e = e18;
                            if (i(e)) {
                                l(e);
                            } else {
                                j(e);
                            }
                        } catch (IllegalArgumentException e19) {
                            e = e19;
                            if (i(e)) {
                                l(e);
                            } else {
                                j(e);
                            }
                        } catch (InterruptedException e21) {
                            e = e21;
                            if (i(e)) {
                                l(e);
                            } else {
                                j(e);
                            }
                        } catch (d unused) {
                            this.f56596a.a();
                            if (!this.U) {
                                if (this.V) {
                                    this.f56596a.f(this.W);
                                } else {
                                    try {
                                        this.f56596a.e();
                                    } catch (IOException e22) {
                                        e = e22;
                                        this.f56596a.f(e);
                                    }
                                }
                            }
                        } catch (e unused2) {
                            this.f56597b.e((byte) 5);
                        }
                    }
                }
            }
            this.T.set(false);
        } catch (Throwable th2) {
            this.f56596a.a();
            if (this.U) {
                this.f56596a.h();
            } else if (this.V) {
                this.f56596a.f(this.W);
            } else {
                try {
                    this.f56596a.e();
                } catch (IOException e23) {
                    this.f56596a.f(e23);
                }
            }
            this.T.set(false);
            throw th2;
        }
    }
}
