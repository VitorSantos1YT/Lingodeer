package q7;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import b7.f0;
import com.android.billingclient.api.k0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import f7.j0;
import i7.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p7.b0;
import p7.b1;
import p7.s;
import p7.x;
import p7.y0;
import p7.z0;
import re.v;
import t7.l;
import t7.m;
import t7.n;
import x7.y;
import y6.d0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements z0, b1, t7.j, m {
    public final v H;
    public final n K = new n("ChunkSampleStream");
    public final k0 L = new k0();
    public final ArrayList M;
    public final List N;
    public final y0 O;
    public final y0[] P;
    public final ob.c Q;
    public d R;
    public p S;
    public f T;
    public long U;
    public long V;
    public int W;
    public a X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47536a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f47537a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f47538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p[] f47539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f47540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7.k f47541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i7.b f47542f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k7.c f47543t;

    public g(int i11, int[] iArr, p[] pVarArr, i7.k kVar, i7.b bVar, t7.g gVar, long j11, k7.g gVar2, k7.c cVar, v vVar, k7.c cVar2, boolean z11) {
        this.f47536a = i11;
        this.f47538b = iArr;
        this.f47539c = pVarArr;
        this.f47541e = kVar;
        this.f47542f = bVar;
        this.f47543t = cVar2;
        this.H = vVar;
        this.Y = z11;
        ArrayList arrayList = new ArrayList();
        this.M = arrayList;
        this.N = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.P = new y0[length];
        this.f47540d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        y0[] y0VarArr = new y0[i12];
        gVar2.getClass();
        y0 y0Var = new y0(gVar, gVar2, cVar);
        this.O = y0Var;
        int i13 = 0;
        iArr2[0] = i11;
        y0VarArr[0] = y0Var;
        while (i13 < length) {
            y0 y0Var2 = new y0(gVar, null, null);
            this.P[i13] = y0Var2;
            int i14 = i13 + 1;
            y0VarArr[i14] = y0Var2;
            iArr2[i14] = this.f47538b[i13];
            i13 = i14;
        }
        this.Q = new ob.c(29, iArr2, y0VarArr);
        this.U = j11;
        this.V = j11;
    }

    public final void A() {
        int iB = B(this.O.m(), this.W - 1);
        while (true) {
            int i11 = this.W;
            if (i11 > iB) {
                return;
            }
            this.W = i11 + 1;
            a aVar = (a) this.M.get(i11);
            p pVar = aVar.f47527d;
            if (!pVar.equals(this.S)) {
                this.f47543t.b(this.f47536a, pVar, aVar.f47528e, aVar.f47529f, aVar.f47530t);
            }
            this.S = pVar;
        }
    }

    public final int B(int i11, int i12) {
        ArrayList arrayList;
        do {
            i12++;
            arrayList = this.M;
            if (i12 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i12)).a(0) <= i11);
        return i12 - 1;
    }

    public final void C(i7.b bVar) {
        this.T = bVar;
        y0 y0Var = this.O;
        y0Var.g();
        hd.b bVar2 = y0Var.f46545h;
        if (bVar2 != null) {
            bVar2.x(y0Var.f46542e);
            y0Var.f46545h = null;
            y0Var.f46544g = null;
        }
        for (y0 y0Var2 : this.P) {
            y0Var2.g();
            hd.b bVar3 = y0Var2.f46545h;
            if (bVar3 != null) {
                bVar3.x(y0Var2.f46542e);
                y0Var2.f46545h = null;
                y0Var2.f46544g = null;
            }
        }
        this.K.c(this);
    }

    @Override // p7.b1
    public final boolean a() {
        return this.K.a();
    }

    @Override // p7.z0
    public final void b() throws BehindLiveWindowException, DrmSession$DrmSessionException {
        n nVar = this.K;
        nVar.b();
        y0 y0Var = this.O;
        hd.b bVar = y0Var.f46545h;
        if (bVar != null && bVar.r() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionO = y0Var.f46545h.o();
            drmSession$DrmSessionExceptionO.getClass();
            throw drmSession$DrmSessionExceptionO;
        }
        if (nVar.a()) {
            return;
        }
        i7.k kVar = this.f47541e;
        BehindLiveWindowException behindLiveWindowException = kVar.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        kVar.f34224a.b();
    }

    @Override // t7.j
    public final void c(l lVar, long j11, long j12) {
        d dVar = (d) lVar;
        this.R = null;
        i7.k kVar = this.f47541e;
        i7.i[] iVarArr = kVar.f34232i;
        if (dVar instanceof i) {
            int iD = kVar.f34233j.d(((i) dVar).f47527d);
            i7.i iVar = iVarArr[iD];
            if (iVar.f34217d == null) {
                c cVar = iVar.f34214a;
                b7.a.k(cVar);
                y yVar = cVar.H;
                x7.i iVar2 = yVar instanceof x7.i ? (x7.i) yVar : null;
                if (iVar2 != null) {
                    j7.m mVar = iVar.f34215b;
                    iVarArr[iD] = new i7.i(iVar.f34218e, mVar, iVar.f34216c, iVar.f34214a, iVar.f34219f, new androidx.recyclerview.widget.e(iVar2, mVar.f36146c, 5));
                }
            }
        }
        i7.n nVar = kVar.f34231h;
        if (nVar != null) {
            long j13 = nVar.f34249d;
            if (j13 == -9223372036854775807L || dVar.H > j13) {
                nVar.f34249d = dVar.H;
            }
            nVar.f34250e.f34257t = true;
        }
        long j14 = dVar.f47524a;
        d7.p pVar = dVar.K;
        Uri uri = pVar.f23255c;
        s sVar = new s(pVar.f23256d);
        this.H.getClass();
        this.f47543t.d(sVar, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H);
        this.f47542f.b(this);
    }

    @Override // t7.m
    public final void d() {
        y0 y0Var = this.O;
        y0Var.t(true);
        hd.b bVar = y0Var.f46545h;
        if (bVar != null) {
            bVar.x(y0Var.f46542e);
            y0Var.f46545h = null;
            y0Var.f46544g = null;
        }
        for (y0 y0Var2 : this.P) {
            y0Var2.t(true);
            hd.b bVar2 = y0Var2.f46545h;
            if (bVar2 != null) {
                bVar2.x(y0Var2.f46542e);
                y0Var2.f46545h = null;
                y0Var2.f46544g = null;
            }
        }
        for (i7.i iVar : this.f47541e.f34232i) {
            c cVar = iVar.f34214a;
            if (cVar != null) {
                cVar.f47517a.release();
            }
        }
        f fVar = this.T;
        if (fVar != null) {
            i7.b bVar3 = (i7.b) fVar;
            synchronized (bVar3) {
                i7.n nVar = (i7.n) bVar3.P.remove(this);
                if (nVar != null) {
                    y0 y0Var3 = nVar.f34246a;
                    y0Var3.t(true);
                    hd.b bVar4 = y0Var3.f46545h;
                    if (bVar4 != null) {
                        bVar4.x(y0Var3.f46542e);
                        y0Var3.f46545h = null;
                        y0Var3.f46544g = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:122:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0250  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:127:0x0258  */
    /* JADX WARN: Code duplicated, block: B:130:0x0262  */
    /* JADX WARN: Code duplicated, block: B:132:0x0269  */
    /* JADX WARN: Code duplicated, block: B:133:0x026e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0271  */
    /* JADX WARN: Code duplicated, block: B:137:0x0278  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a9 A[EDGE_INSN: B:152:0x02a9->B:153:0x02ab BREAK  A[LOOP:0: B:144:0x0287->B:150:0x0297]] */
    /* JADX WARN: Code duplicated, block: B:155:0x02af  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:175:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140 A[LOOP:2: B:66:0x013a->B:68:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0166 A[LOOP:3: B:70:0x0160->B:72:0x0166, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // t7.j
    public final f9.e e(l lVar, long j11, long j12, IOException iOException, int i11) {
        s sVar;
        s sVar2;
        j7.b bVarV;
        s7.s sVar3;
        ImmutableList immutableList;
        v vVar;
        long jElapsedRealtime;
        ArrayList arrayList;
        int length;
        boolean z11;
        int i12;
        int i13;
        HashSet hashSet;
        int i14;
        int size;
        HashSet hashSet2;
        ArrayList arrayListD;
        int i15;
        int size2;
        int i16;
        f9.e eVar;
        int i17;
        long jMax;
        boolean zO;
        int i18;
        f9.e eVar2;
        boolean z12;
        int i19;
        boolean z13;
        v vVar2;
        long jMin;
        boolean z14;
        d dVar = (d) lVar;
        d7.p pVar = dVar.K;
        long j13 = dVar.f47530t;
        p pVar2 = dVar.f47527d;
        long j14 = pVar.f23254b;
        boolean z15 = dVar instanceof a;
        ArrayList arrayList2 = this.M;
        int size3 = arrayList2.size() - 1;
        boolean z16 = (j14 != 0 && z15 && y(size3)) ? false : true;
        boolean z17 = z15;
        d7.p pVar3 = dVar.K;
        Uri uri = pVar3.f23255c;
        s sVar4 = new s(pVar3.f23256d);
        String str = f0.f3975a;
        i7.k kVar = this.f47541e;
        i7.i[] iVarArr = kVar.f34232i;
        ob.i iVar = kVar.f34225b;
        v vVar3 = this.H;
        if (z16) {
            i7.n nVar = kVar.f34231h;
            if (nVar != null) {
                sVar = sVar4;
                long j15 = nVar.f34249d;
                boolean z18 = j15 != -9223372036854775807L && j15 < j13;
                o oVar = nVar.f34250e;
                if (oVar.f34256f.f36101d) {
                    if (!oVar.H) {
                        if (z18) {
                            if (oVar.f34257t) {
                                oVar.H = true;
                                oVar.f34257t = false;
                                i7.g gVar = (i7.g) oVar.f34252b.f32187b;
                                gVar.D.removeCallbacks(gVar.f34210w);
                                gVar.y();
                            }
                        }
                    }
                    sVar2 = sVar;
                    z11 = z16;
                    vVar = vVar3;
                    arrayList = arrayList2;
                    z17 = z17;
                    zO = true;
                }
                if (!zO) {
                    eVar2 = null;
                } else if (z11) {
                    if (z17) {
                        if (q(size3) == dVar) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        b7.a.j(z14);
                        if (arrayList.isEmpty()) {
                            this.U = this.V;
                        }
                    }
                    eVar2 = n.f52095d;
                } else {
                    b7.a.B("Ignoring attempt to cancel non-cancelable load.");
                    eVar2 = null;
                }
                if (eVar2 == null) {
                    vVar.getClass();
                    if (!(iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    int i21 = DataSourceException.f2114b;
                    Throwable cause = iOException;
                    while (true) {
                        if (cause == null) {
                            jMin = Math.min((i11 - 1) * 1000, 5000);
                            break;
                        }
                        if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f2115a == 2008) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        cause = cause.getCause();
                    }
                    if (jMin != -9223372036854775807L) {
                        z12 = false;
                        eVar2 = new f9.e(0, jMin, false);
                    } else {
                        z12 = false;
                        eVar2 = n.f52096e;
                    }
                } else {
                    z12 = false;
                }
                f9.e eVar3 = eVar2;
                i19 = eVar3.f27021b;
                if (i19 != 0 || i19 == 1) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                s sVar5 = sVar2;
                vVar2 = vVar;
                this.f47543t.e(sVar5, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
                if (!z13) {
                    this.R = null;
                    vVar2.getClass();
                    this.f47542f.b(this);
                }
                return eVar3;
            }
            sVar = sVar4;
            if (!kVar.f34234k.f36101d && z17 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f2117d == 404) {
                i7.i iVar2 = iVarArr[kVar.f34233j.d(pVar2)];
                long jD = iVar2.d();
                if (jD == -1 || jD == 0) {
                    sVar2 = sVar;
                } else {
                    i7.h hVar = iVar2.f34217d;
                    b7.a.k(hVar);
                    sVar2 = sVar;
                    if (((a) dVar).b() > ((hVar.w() + iVar2.f34219f) + jD) - 1) {
                        kVar.f34236n = true;
                    }
                }
                i7.i iVar3 = iVarArr[kVar.f34233j.d(pVar2)];
                j7.m mVar = iVar3.f34215b;
                j7.b bVar = iVar3.f34216c;
                bVarV = iVar.v(mVar.f36145b);
                if (bVarV != null) {
                }
                sVar3 = kVar.f34233j;
                immutableList = iVar3.f34215b.f36145b;
                boolean z19 = z16;
                vVar = vVar3;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                length = sVar3.length();
                z11 = z19;
                i13 = 0;
                for (i12 = 0; i12 < length; i12++) {
                    if (sVar3.a(i12, jElapsedRealtime)) {
                        i13++;
                    }
                }
                hashSet = new HashSet();
                for (i14 = 0; i14 < immutableList.size(); i14++) {
                    hashSet.add(Integer.valueOf(((j7.b) immutableList.get(i14)).f36096c));
                }
                size = hashSet.size();
                hashSet2 = new HashSet();
                arrayListD = iVar.d(immutableList);
                for (i15 = 0; i15 < arrayListD.size(); i15++) {
                    hashSet2.add(Integer.valueOf(((j7.b) arrayListD.get(i15)).f36096c));
                }
                size2 = size - hashSet2.size();
                i16 = length - i13;
                if (i16 > 1) {
                }
                vVar.getClass();
                if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
                    eVar = null;
                } else if (size - size2 > 1) {
                    eVar = new f9.e(1, 300000L);
                } else if (i16 > 1) {
                    eVar = new f9.e(2, 60000L);
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    long j16 = eVar.f27020a;
                    i17 = eVar.f27021b;
                    if (i17 == 1) {
                    }
                    i16 = i16;
                    i16 = i16;
                    zO = false;
                } else {
                    i16 = i16;
                    i16 = i16;
                    zO = false;
                }
                if (!zO) {
                    eVar2 = null;
                } else if (z11) {
                    if (z17) {
                        if (q(size3) == dVar) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        b7.a.j(z14);
                        if (arrayList.isEmpty()) {
                            this.U = this.V;
                        }
                    }
                    eVar2 = n.f52095d;
                } else {
                    b7.a.B("Ignoring attempt to cancel non-cancelable load.");
                    eVar2 = null;
                }
                if (eVar2 == null) {
                    vVar.getClass();
                    if (!(iOException instanceof ParserException)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    jMin = -9223372036854775807L;
                    break;
                    if (jMin != -9223372036854775807L) {
                        z12 = false;
                        eVar2 = new f9.e(0, jMin, false);
                    } else {
                        z12 = false;
                        eVar2 = n.f52096e;
                    }
                } else {
                    z12 = false;
                }
                f9.e eVar4 = eVar2;
                i19 = eVar4.f27021b;
                if (i19 != 0) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                s sVar6 = sVar2;
                vVar2 = vVar;
                this.f47543t.e(sVar6, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
                if (!z13) {
                    this.R = null;
                    vVar2.getClass();
                    this.f47542f.b(this);
                }
                return eVar4;
            }
            sVar2 = sVar;
            i7.i iVar4 = iVarArr[kVar.f34233j.d(pVar2)];
            j7.m mVar2 = iVar4.f34215b;
            j7.b bVar2 = iVar4.f34216c;
            bVarV = iVar.v(mVar2.f36145b);
            if (bVarV != null || bVar2.equals(bVarV)) {
                sVar3 = kVar.f34233j;
                immutableList = iVar4.f34215b.f36145b;
                boolean z110 = z16;
                vVar = vVar3;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                length = sVar3.length();
                z11 = z110;
                i13 = 0;
                while (i12 < length) {
                    if (sVar3.a(i12, jElapsedRealtime)) {
                        i13++;
                    }
                }
                hashSet = new HashSet();
                while (i14 < immutableList.size()) {
                    hashSet.add(Integer.valueOf(((j7.b) immutableList.get(i14)).f36096c));
                }
                size = hashSet.size();
                hashSet2 = new HashSet();
                arrayListD = iVar.d(immutableList);
                while (i15 < arrayListD.size()) {
                    hashSet2.add(Integer.valueOf(((j7.b) arrayListD.get(i15)).f36096c));
                }
                size2 = size - hashSet2.size();
                i16 = length - i13;
                if (i16 > 1 || size - size2 > 1) {
                    vVar.getClass();
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) || !((i18 = ((HttpDataSource$InvalidResponseCodeException) iOException).f2117d) == 403 || i18 == 404 || i18 == 410 || i18 == 416 || i18 == 500 || i18 == 503)) {
                        eVar = null;
                    } else if (size - size2 > 1) {
                        eVar = new f9.e(1, 300000L);
                    } else if (i16 > 1) {
                        eVar = new f9.e(2, 60000L);
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        long j17 = eVar.f27020a;
                        i17 = eVar.f27021b;
                        if (i17 == 1 ? i16 > 1 : size - size2 > 1) {
                            i16 = i16;
                            if (i17 == 2) {
                                s7.s sVar7 = kVar.f34233j;
                                zO = sVar7.o(sVar7.d(pVar2), j17);
                            } else if (i17 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j17;
                                String str2 = bVar2.f36095b;
                                HashMap map = (HashMap) iVar.f44813b;
                                if (map.containsKey(str2)) {
                                    Long l9 = (Long) map.get(str2);
                                    String str3 = f0.f3975a;
                                    jMax = Math.max(jElapsedRealtime2, l9.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str2, Long.valueOf(jMax));
                                int i22 = bVar2.f36096c;
                                if (i22 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i22);
                                    HashMap map2 = (HashMap) iVar.f44814c;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l11 = (Long) map2.get(numValueOf);
                                        String str4 = f0.f3975a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l11.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                    if (!zO) {
                        eVar2 = null;
                    } else if (z11) {
                        if (z17) {
                            if (q(size3) == dVar) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            b7.a.j(z14);
                            if (arrayList.isEmpty()) {
                                this.U = this.V;
                            }
                        }
                        eVar2 = n.f52095d;
                    } else {
                        b7.a.B("Ignoring attempt to cancel non-cancelable load.");
                        eVar2 = null;
                    }
                    if (eVar2 == null) {
                        vVar.getClass();
                        if (!(iOException instanceof ParserException)) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        jMin = -9223372036854775807L;
                        break;
                        if (jMin != -9223372036854775807L) {
                            z12 = false;
                            eVar2 = new f9.e(0, jMin, false);
                        } else {
                            z12 = false;
                            eVar2 = n.f52096e;
                        }
                    } else {
                        z12 = false;
                    }
                    f9.e eVar5 = eVar2;
                    i19 = eVar5.f27021b;
                    if (i19 != 0) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    s sVar8 = sVar2;
                    vVar2 = vVar;
                    this.f47543t.e(sVar8, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
                    if (!z13) {
                        this.R = null;
                        vVar2.getClass();
                        this.f47542f.b(this);
                    }
                    return eVar5;
                }
                i16 = i16;
                i16 = i16;
                zO = false;
                if (!zO) {
                    eVar2 = null;
                } else if (z11) {
                    if (z17) {
                        if (q(size3) == dVar) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        b7.a.j(z14);
                        if (arrayList.isEmpty()) {
                            this.U = this.V;
                        }
                    }
                    eVar2 = n.f52095d;
                } else {
                    b7.a.B("Ignoring attempt to cancel non-cancelable load.");
                    eVar2 = null;
                }
                if (eVar2 == null) {
                    vVar.getClass();
                    if (!(iOException instanceof ParserException)) {
                        jMin = -9223372036854775807L;
                        break;
                    }
                    jMin = -9223372036854775807L;
                    break;
                    if (jMin != -9223372036854775807L) {
                        z12 = false;
                        eVar2 = new f9.e(0, jMin, false);
                    } else {
                        z12 = false;
                        eVar2 = n.f52096e;
                    }
                } else {
                    z12 = false;
                }
                f9.e eVar6 = eVar2;
                i19 = eVar6.f27021b;
                if (i19 != 0) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                s sVar9 = sVar2;
                vVar2 = vVar;
                this.f47543t.e(sVar9, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
                if (!z13) {
                    this.R = null;
                    vVar2.getClass();
                    this.f47542f.b(this);
                }
                return eVar6;
            }
            zO = true;
            if (!zO) {
                eVar2 = null;
            } else if (z11) {
                if (z17) {
                    if (q(size3) == dVar) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    b7.a.j(z14);
                    if (arrayList.isEmpty()) {
                        this.U = this.V;
                    }
                }
                eVar2 = n.f52095d;
            } else {
                b7.a.B("Ignoring attempt to cancel non-cancelable load.");
                eVar2 = null;
            }
            if (eVar2 == null) {
                vVar.getClass();
                if (!(iOException instanceof ParserException)) {
                    jMin = -9223372036854775807L;
                    break;
                }
                jMin = -9223372036854775807L;
                break;
                if (jMin != -9223372036854775807L) {
                    z12 = false;
                    eVar2 = new f9.e(0, jMin, false);
                } else {
                    z12 = false;
                    eVar2 = n.f52096e;
                }
            } else {
                z12 = false;
            }
            f9.e eVar7 = eVar2;
            i19 = eVar7.f27021b;
            if (i19 != 0) {
                z13 = true;
            } else {
                z13 = true;
            }
            s sVar10 = sVar2;
            vVar2 = vVar;
            this.f47543t.e(sVar10, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
            if (!z13) {
                this.R = null;
                vVar2.getClass();
                this.f47542f.b(this);
            }
            return eVar7;
            z11 = z16;
            vVar = vVar3;
            arrayList = arrayList2;
            z17 = z17;
            zO = true;
            if (!zO) {
                eVar2 = null;
            } else if (z11) {
                if (z17) {
                    if (q(size3) == dVar) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    b7.a.j(z14);
                    if (arrayList.isEmpty()) {
                        this.U = this.V;
                    }
                }
                eVar2 = n.f52095d;
            } else {
                b7.a.B("Ignoring attempt to cancel non-cancelable load.");
                eVar2 = null;
            }
            if (eVar2 == null) {
                vVar.getClass();
                if (!(iOException instanceof ParserException)) {
                    jMin = -9223372036854775807L;
                    break;
                }
                jMin = -9223372036854775807L;
                break;
                if (jMin != -9223372036854775807L) {
                    z12 = false;
                    eVar2 = new f9.e(0, jMin, false);
                } else {
                    z12 = false;
                    eVar2 = n.f52096e;
                }
            } else {
                z12 = false;
            }
            f9.e eVar8 = eVar2;
            i19 = eVar8.f27021b;
            if (i19 != 0) {
                z13 = true;
            } else {
                z13 = true;
            }
            s sVar11 = sVar2;
            vVar2 = vVar;
            this.f47543t.e(sVar11, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
            if (!z13) {
                this.R = null;
                vVar2.getClass();
                this.f47542f.b(this);
            }
            return eVar8;
        }
        sVar2 = sVar4;
        z11 = z16;
        vVar = vVar3;
        arrayList = arrayList2;
        z17 = z17;
        i16 = i16;
        i16 = i16;
        zO = false;
        if (!zO) {
            eVar2 = null;
        } else if (z11) {
            if (z17) {
                if (q(size3) == dVar) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                b7.a.j(z14);
                if (arrayList.isEmpty()) {
                    this.U = this.V;
                }
            }
            eVar2 = n.f52095d;
        } else {
            b7.a.B("Ignoring attempt to cancel non-cancelable load.");
            eVar2 = null;
        }
        if (eVar2 == null) {
            vVar.getClass();
            if (!(iOException instanceof ParserException)) {
                jMin = -9223372036854775807L;
                break;
            }
            jMin = -9223372036854775807L;
            break;
            if (jMin != -9223372036854775807L) {
                z12 = false;
                eVar2 = new f9.e(0, jMin, false);
            } else {
                z12 = false;
                eVar2 = n.f52096e;
            }
        } else {
            z12 = false;
        }
        f9.e eVar9 = eVar2;
        i19 = eVar9.f27021b;
        if (i19 != 0) {
            z13 = true;
        } else {
            z13 = true;
        }
        s sVar12 = sVar2;
        vVar2 = vVar;
        this.f47543t.e(sVar12, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, iOException, !z13);
        if (!z13) {
            this.R = null;
            vVar2.getClass();
            this.f47542f.b(this);
        }
        return eVar9;
    }

    @Override // p7.z0
    public final boolean f() {
        return !z() && this.O.p(this.f47537a0);
    }

    @Override // t7.j
    public final void g(l lVar, long j11, long j12, boolean z11) {
        d dVar = (d) lVar;
        this.R = null;
        this.X = null;
        long j13 = dVar.f47524a;
        d7.p pVar = dVar.K;
        Uri uri = pVar.f23255c;
        s sVar = new s(pVar.f23256d);
        this.H.getClass();
        this.f47543t.c(sVar, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H);
        if (z11) {
            return;
        }
        if (z()) {
            this.O.t(false);
            for (y0 y0Var : this.P) {
                y0Var.t(false);
            }
        } else if (dVar instanceof a) {
            ArrayList arrayList = this.M;
            q(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.U = this.V;
            }
        }
        this.f47542f.b(this);
    }

    @Override // p7.b1
    public final long h() {
        if (z()) {
            return this.U;
        }
        if (this.f47537a0) {
            return Long.MIN_VALUE;
        }
        return v().H;
    }

    @Override // p7.z0
    public final int m(long j11) {
        if (z()) {
            return 0;
        }
        boolean z11 = this.f47537a0;
        y0 y0Var = this.O;
        int iO = y0Var.o(j11, z11);
        a aVar = this.X;
        if (aVar != null) {
            iO = Math.min(iO, aVar.a(0) - y0Var.m());
        }
        y0Var.w(iO);
        A();
        return iO;
    }

    @Override // p7.z0
    public final int o(ob.e eVar, e7.d dVar, int i11) {
        if (z()) {
            return -3;
        }
        a aVar = this.X;
        y0 y0Var = this.O;
        if (aVar != null && aVar.a(0) <= y0Var.m()) {
            return -3;
        }
        A();
        return y0Var.s(eVar, dVar, i11, this.f47537a0);
    }

    @Override // t7.j
    public final void p(l lVar, long j11, long j12, int i11) {
        s sVar;
        d dVar = (d) lVar;
        if (i11 == 0) {
            long j13 = dVar.f47524a;
            sVar = new s(dVar.f47525b);
        } else {
            long j14 = dVar.f47524a;
            d7.p pVar = dVar.K;
            Uri uri = pVar.f23255c;
            sVar = new s(pVar.f23256d);
        }
        s sVar2 = sVar;
        this.f47543t.f(sVar2, dVar.f47526c, this.f47536a, dVar.f47527d, dVar.f47528e, dVar.f47529f, dVar.f47530t, dVar.H, i11);
    }

    public final a q(int i11) {
        ArrayList arrayList = this.M;
        a aVar = (a) arrayList.get(i11);
        int size = arrayList.size();
        String str = f0.f3975a;
        if (i11 < 0 || size > arrayList.size() || i11 > size) {
            throw new IllegalArgumentException();
        }
        if (i11 != size) {
            arrayList.subList(i11, size).clear();
        }
        this.W = Math.max(this.W, arrayList.size());
        int i12 = 0;
        this.O.i(aVar.a(0));
        while (true) {
            y0[] y0VarArr = this.P;
            if (i12 >= y0VarArr.length) {
                return aVar;
            }
            y0 y0Var = y0VarArr[i12];
            i12++;
            y0Var.i(aVar.a(i12));
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:181:0x040c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0414 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0416 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x041a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0422  */
    /* JADX WARN: Code duplicated, block: B:189:0x0427  */
    /* JADX WARN: Code duplicated, block: B:191:0x042f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0439 A[LOOP:0: B:192:0x0437->B:193:0x0439, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x0446  */
    /* JADX WARN: Code duplicated, block: B:201:0x046b A[LOOP:1: B:199:0x0468->B:201:0x046b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x047f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0483  */
    /* JADX WARN: Instruction removed from duplicated block: B:191:0x042f, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p7.b1
    public final boolean u(j0 j0Var) {
        long j11;
        List list;
        k0 k0Var;
        long j12;
        boolean z11;
        long j13;
        List list2;
        a aVar;
        long j14;
        long jMax;
        n nVar;
        long j15;
        k0 k0Var2;
        boolean z12;
        long j16;
        long jH;
        int i11;
        Object hVar;
        long jH2;
        boolean z13;
        boolean z14;
        d dVar;
        boolean z15;
        ob.c cVar;
        a aVar2;
        y0[] y0VarArr;
        int[] iArr;
        int i12;
        long j17;
        long j18;
        int i13;
        if (!this.f47537a0) {
            n nVar2 = this.K;
            if (!nVar2.a()) {
                if (nVar2.f52099c != null) {
                    return false;
                }
                boolean z16 = z();
                if (z16) {
                    list = Collections.EMPTY_LIST;
                    j11 = this.U;
                } else {
                    j11 = v().H;
                    list = this.N;
                }
                List list3 = list;
                i7.k kVar = this.f47541e;
                i7.i[] iVarArr = kVar.f34232i;
                BehindLiveWindowException behindLiveWindowException = kVar.m;
                k0 k0Var3 = this.L;
                if (behindLiveWindowException == null) {
                    k0Var = k0Var3;
                    long j19 = j0Var.f26811a;
                    j12 = -9223372036854775807L;
                    long j21 = j11 - j19;
                    z11 = z16;
                    long jK = f0.K(kVar.f34234k.a(kVar.f34235l).f36132b) + f0.K(kVar.f34234k.f36098a) + j11;
                    i7.n nVar3 = kVar.f34231h;
                    if (nVar3 != null) {
                        o oVar = nVar3.f34250e;
                        j7.c cVar2 = oVar.f34256f;
                        hd.d dVar2 = oVar.f34252b;
                        if (!cVar2.f36101d) {
                            j13 = j19;
                            z13 = false;
                        } else if (oVar.H) {
                            j13 = j19;
                            z13 = true;
                        } else {
                            j13 = j19;
                            Map.Entry entryCeilingEntry = oVar.f34255e.ceilingEntry(Long.valueOf(cVar2.f36105h));
                            if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jK) {
                                z13 = false;
                            } else {
                                long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                                i7.g gVar = (i7.g) dVar2.f32187b;
                                long j22 = gVar.N;
                                if (j22 == -9223372036854775807L || j22 < jLongValue) {
                                    gVar.N = jLongValue;
                                }
                                z13 = true;
                            }
                            if (z13 && oVar.f34257t) {
                                oVar.H = true;
                                oVar.f34257t = false;
                                i7.g gVar2 = (i7.g) dVar2.f32187b;
                                gVar2.D.removeCallbacks(gVar2.f34210w);
                                gVar2.y();
                            }
                        }
                        if (z13) {
                        }
                        z14 = k0Var2.f7546a;
                        dVar = (d) k0Var2.f7547b;
                        k0Var2.f7547b = null;
                        k0Var2.f7546a = false;
                        if (z14) {
                            this.U = j15;
                            this.f47537a0 = true;
                            return true;
                        }
                        if (dVar == null) {
                            return false;
                        }
                        this.R = dVar;
                        z15 = dVar instanceof a;
                        cVar = this.Q;
                        if (z15) {
                            aVar2 = (a) dVar;
                            if (z11) {
                                j17 = aVar2.f47530t;
                                j18 = this.U;
                                if (j17 < j18) {
                                    this.O.f46556t = j18;
                                    for (y0 y0Var : this.P) {
                                        y0Var.f46556t = this.U;
                                    }
                                    if (this.Y) {
                                        p pVar = aVar2.f47527d;
                                        this.Z = !d0.a(pVar.f57291n, pVar.f57289k);
                                    }
                                }
                                this.Y = false;
                                this.U = -9223372036854775807L;
                            }
                            aVar2.O = cVar;
                            y0VarArr = (y0[]) cVar.f44800c;
                            iArr = new int[y0VarArr.length];
                            for (i12 = 0; i12 < y0VarArr.length; i12++) {
                                y0 y0Var2 = y0VarArr[i12];
                                iArr[i12] = y0Var2.f46553q + y0Var2.f46552p;
                            }
                            aVar2.P = iArr;
                            this.M.add(aVar2);
                        } else if (dVar instanceof i) {
                            ((i) dVar).M = cVar;
                        }
                        nVar.d(dVar, this, this.H.w(dVar.f47526c));
                        return true;
                    }
                    j13 = j19;
                    long jK2 = f0.K(f0.v(kVar.f34229f));
                    j7.c cVar3 = kVar.f34234k;
                    long j23 = cVar3.f36098a;
                    long jK3 = j23 == -9223372036854775807L ? -9223372036854775807L : jK2 - f0.K(j23 + cVar3.a(kVar.f34235l).f36132b);
                    if (list3.isEmpty()) {
                        list2 = list3;
                        aVar = null;
                    } else {
                        list2 = list3;
                        aVar = (a) nv.p.g(1, list2);
                    }
                    int length = kVar.f34233j.length();
                    j[] jVarArr = new j[length];
                    int i14 = 0;
                    while (i14 < length) {
                        i7.i iVar = iVarArr[i14];
                        long j24 = jK3;
                        i7.h hVar2 = iVar.f34217d;
                        ay.k0 k0Var4 = j.f47544w;
                        if (hVar2 == null) {
                            jVarArr[i14] = k0Var4;
                            j21 = j21;
                        } else {
                            long jB = iVar.b(jK2);
                            long jC = iVar.c(jK2);
                            if (aVar != null) {
                                jH2 = aVar.b();
                            } else {
                                i7.h hVar3 = iVar.f34217d;
                                b7.a.k(hVar3);
                                jH2 = f0.h(hVar3.l(j11, iVar.f34218e) + iVar.f34219f, jB, jC);
                            }
                            if (jH2 < jB) {
                                jVarArr[i14] = k0Var4;
                            } else {
                                jVarArr[i14] = new i7.j(kVar.b(i14), jH2, jC);
                            }
                        }
                        i14++;
                        jK3 = j24;
                        j21 = j21;
                    }
                    long j25 = jK3;
                    long j26 = j21;
                    if (!kVar.f34234k.f36101d || iVarArr[0].d() == 0) {
                        j14 = 0;
                        jMax = -9223372036854775807L;
                    } else {
                        long jE = iVarArr[0].e(iVarArr[0].c(jK2));
                        j7.c cVar4 = kVar.f34234k;
                        long j27 = cVar4.f36098a;
                        j14 = 0;
                        jMax = Math.max(0L, Math.min(j27 == -9223372036854775807L ? -9223372036854775807L : jK2 - f0.K(j27 + cVar4.a(kVar.f34235l).f36132b), jE) - j13);
                    }
                    nVar = nVar2;
                    long j28 = j14;
                    long j29 = j13;
                    j15 = -9223372036854775807L;
                    k0Var2 = k0Var;
                    kVar.f34233j.i(j29, j26, jMax, list2, jVarArr);
                    int iC = kVar.f34233j.c();
                    SystemClock.elapsedRealtime();
                    i7.i iVarB = kVar.b(iC);
                    long j30 = iVarB.f34218e;
                    long j31 = iVarB.f34219f;
                    i7.h hVar4 = iVarB.f34217d;
                    j7.b bVar = iVarB.f34216c;
                    c cVar5 = iVarB.f34214a;
                    j7.m mVar = iVarB.f34215b;
                    if (cVar5 != null) {
                        j7.j jVar = cVar5.K == null ? mVar.f36150t : null;
                        j7.j jVarD = hVar4 == null ? mVar.d() : null;
                        if (jVar != null || jVarD != null) {
                            d7.f fVar = kVar.f34228e;
                            p pVarM = kVar.f34233j.m();
                            int iN = kVar.f34233j.n();
                            Object objQ = kVar.f34233j.q();
                            if (jVar != null) {
                                j7.j jVarA = jVar.a(jVarD, bVar.f36094a);
                                if (jVarA != null) {
                                    jVar = jVarA;
                                }
                            } else {
                                jVarD.getClass();
                                jVar = jVarD;
                            }
                            k0Var2.f7547b = new i(fVar, ob.f.f(mVar, bVar.f36094a, jVar, 0, ImmutableMap.k()), pVarM, iN, objQ, iVarB.f34214a);
                        }
                        z14 = k0Var2.f7546a;
                        dVar = (d) k0Var2.f7547b;
                        k0Var2.f7547b = null;
                        k0Var2.f7546a = false;
                        if (z14) {
                            this.U = j15;
                            this.f47537a0 = true;
                            return true;
                        }
                        if (dVar == null) {
                            return false;
                        }
                        this.R = dVar;
                        z15 = dVar instanceof a;
                        cVar = this.Q;
                        if (z15) {
                            aVar2 = (a) dVar;
                            if (z11) {
                                j17 = aVar2.f47530t;
                                j18 = this.U;
                                if (j17 < j18) {
                                    this.O.f46556t = j18;
                                    while (i13 < r5) {
                                        y0Var.f46556t = this.U;
                                    }
                                    if (this.Y) {
                                        p pVar2 = aVar2.f47527d;
                                        this.Z = !d0.a(pVar2.f57291n, pVar2.f57289k);
                                    }
                                }
                                this.Y = false;
                                this.U = -9223372036854775807L;
                            }
                            aVar2.O = cVar;
                            y0VarArr = (y0[]) cVar.f44800c;
                            iArr = new int[y0VarArr.length];
                            while (i12 < y0VarArr.length) {
                                y0 y0Var3 = y0VarArr[i12];
                                iArr[i12] = y0Var3.f46553q + y0Var3.f46552p;
                            }
                            aVar2.P = iArr;
                            this.M.add(aVar2);
                        } else if (dVar instanceof i) {
                            ((i) dVar).M = cVar;
                        }
                        nVar.d(dVar, this, this.H.w(dVar.f47526c));
                        return true;
                    }
                    list2 = list2;
                    j7.c cVar6 = kVar.f34234k;
                    boolean z17 = cVar6.f36101d && kVar.f34235l == cVar6.m.size() + (-1);
                    boolean z18 = (z17 && j30 == -9223372036854775807L) ? false : true;
                    if (iVarB.d() == j28) {
                        k0Var2.f7546a = z18;
                    } else {
                        boolean z19 = z18;
                        long jB2 = iVarB.b(jK2);
                        long jC2 = iVarB.c(jK2);
                        if (z17) {
                            long jE2 = iVarB.e(jC2);
                            z12 = z19 & ((jE2 - iVarB.f(jC2)) + jE2 >= j30);
                        } else {
                            z12 = z19;
                        }
                        if (aVar != null) {
                            jH = aVar.b();
                            j16 = jC2;
                        } else {
                            b7.a.k(hVar4);
                            j16 = jC2;
                            jH = f0.h(hVar4.l(j11, j30) + j31, jB2, j16);
                        }
                        long j32 = jH;
                        if (j32 < jB2) {
                            kVar.m = new BehindLiveWindowException();
                        } else if (j32 <= j16) {
                            long j33 = j11;
                            if (kVar.f34236n && j32 >= j16) {
                                k0Var2.f7546a = z12;
                            } else if (!z12 || iVarB.f(j32) < j30) {
                                int iMin = (int) Math.min(kVar.f34230g, (j16 - j32) + 1);
                                int i15 = (j30 > (-9223372036854775807L) ? 1 : (j30 == (-9223372036854775807L) ? 0 : -1));
                                if (i15 != 0) {
                                    while (iMin > 1 && iVarB.f((((long) iMin) + j32) - 1) >= j30) {
                                        iMin--;
                                    }
                                }
                                long j34 = list2.isEmpty() ? j33 : -9223372036854775807L;
                                d7.f fVar2 = kVar.f34228e;
                                int i16 = kVar.f34227d;
                                p pVarM2 = kVar.f34233j.m();
                                int iN2 = kVar.f34233j.n();
                                Object objQ2 = kVar.f34233j.q();
                                long jF = iVarB.f(j32);
                                b7.a.k(hVar4);
                                j7.j jVarJ = hVar4.j(j32 - j31);
                                if (cVar5 == null) {
                                    hVar = new k(fVar2, ob.f.f(mVar, bVar.f36094a, jVarJ, iVarB.g(j32, j25) ? 0 : 8, ImmutableMap.k()), pVarM2, iN2, objQ2, jF, iVarB.e(j32), j32, i16, pVarM2);
                                } else {
                                    int i17 = 1;
                                    int i18 = 1;
                                    while (true) {
                                        if (i18 >= iMin) {
                                            i11 = i15;
                                            break;
                                        }
                                        int i19 = iMin;
                                        i11 = i15;
                                        b7.a.k(hVar4);
                                        j7.j jVarA2 = jVarJ.a(hVar4.j((j32 + ((long) i18)) - j31), bVar.f36094a);
                                        if (jVarA2 == null) {
                                            break;
                                        }
                                        i17++;
                                        i18++;
                                        jVarJ = jVarA2;
                                        i15 = i11;
                                        iMin = i19;
                                    }
                                    long j35 = (j32 + ((long) i17)) - 1;
                                    long jE3 = iVarB.e(j35);
                                    long j36 = (i11 == 0 || j30 > jE3) ? -9223372036854775807L : j30;
                                    d7.h hVarF = ob.f.f(mVar, bVar.f36094a, jVarJ, iVarB.g(j35, j25) ? 0 : 8, ImmutableMap.k());
                                    long j37 = -mVar.f36146c;
                                    if (d0.l(pVarM2.f57291n)) {
                                        j37 += jF;
                                    }
                                    hVar = new h(fVar2, hVarF, pVarM2, iN2, objQ2, jF, jE3, j34, j36, j32, i17, j37, iVarB.f34214a);
                                }
                                k0Var2.f7547b = hVar;
                            } else {
                                k0Var2.f7546a = true;
                            }
                        } else {
                            k0Var2.f7546a = z12;
                        }
                    }
                    z14 = k0Var2.f7546a;
                    dVar = (d) k0Var2.f7547b;
                    k0Var2.f7547b = null;
                    k0Var2.f7546a = false;
                    if (z14) {
                        this.U = j15;
                        this.f47537a0 = true;
                        return true;
                    }
                    if (dVar == null) {
                        return false;
                    }
                    this.R = dVar;
                    z15 = dVar instanceof a;
                    cVar = this.Q;
                    if (z15) {
                        aVar2 = (a) dVar;
                        if (z11) {
                            j17 = aVar2.f47530t;
                            j18 = this.U;
                            if (j17 < j18) {
                                this.O.f46556t = j18;
                                while (i13 < r5) {
                                    y0Var.f46556t = this.U;
                                }
                                if (this.Y) {
                                    p pVar3 = aVar2.f47527d;
                                    this.Z = !d0.a(pVar3.f57291n, pVar3.f57289k);
                                }
                            }
                            this.Y = false;
                            this.U = -9223372036854775807L;
                        }
                        aVar2.O = cVar;
                        y0VarArr = (y0[]) cVar.f44800c;
                        iArr = new int[y0VarArr.length];
                        while (i12 < y0VarArr.length) {
                            y0 y0Var4 = y0VarArr[i12];
                            iArr[i12] = y0Var4.f46553q + y0Var4.f46552p;
                        }
                        aVar2.P = iArr;
                        this.M.add(aVar2);
                    } else if (dVar instanceof i) {
                        ((i) dVar).M = cVar;
                    }
                    nVar.d(dVar, this, this.H.w(dVar.f47526c));
                    return true;
                }
                z11 = z16;
                k0Var = k0Var3;
                j12 = -9223372036854775807L;
                nVar = nVar2;
                k0Var2 = k0Var;
                j15 = j12;
                z14 = k0Var2.f7546a;
                dVar = (d) k0Var2.f7547b;
                k0Var2.f7547b = null;
                k0Var2.f7546a = false;
                if (z14) {
                    this.U = j15;
                    this.f47537a0 = true;
                    return true;
                }
                if (dVar == null) {
                    return false;
                }
                this.R = dVar;
                z15 = dVar instanceof a;
                cVar = this.Q;
                if (z15) {
                    aVar2 = (a) dVar;
                    if (z11) {
                        j17 = aVar2.f47530t;
                        j18 = this.U;
                        if (j17 < j18) {
                            this.O.f46556t = j18;
                            while (i13 < r5) {
                                y0Var.f46556t = this.U;
                            }
                            if (this.Y) {
                                p pVar4 = aVar2.f47527d;
                                this.Z = !d0.a(pVar4.f57291n, pVar4.f57289k);
                            }
                        }
                        this.Y = false;
                        this.U = -9223372036854775807L;
                    }
                    aVar2.O = cVar;
                    y0VarArr = (y0[]) cVar.f44800c;
                    iArr = new int[y0VarArr.length];
                    while (i12 < y0VarArr.length) {
                        y0 y0Var5 = y0VarArr[i12];
                        iArr[i12] = y0Var5.f46553q + y0Var5.f46552p;
                    }
                    aVar2.P = iArr;
                    this.M.add(aVar2);
                } else if (dVar instanceof i) {
                    ((i) dVar).M = cVar;
                }
                nVar.d(dVar, this, this.H.w(dVar.f47526c));
                return true;
            }
        }
        return false;
    }

    public final a v() {
        return (a) nv.p.f(1, this.M);
    }

    @Override // p7.b1
    public final long w() {
        long j11;
        ArrayList arrayList = this.M;
        if (this.f47537a0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.U;
        }
        long jMax = this.V;
        a aVarV = v();
        if (!aVarV.c()) {
            aVarV = arrayList.size() > 1 ? (a) nv.p.f(2, arrayList) : null;
        }
        if (aVarV != null) {
            jMax = Math.max(jMax, aVarV.H);
        }
        y0 y0Var = this.O;
        synchronized (y0Var) {
            j11 = y0Var.f46558v;
        }
        return Math.max(jMax, j11);
    }

    @Override // p7.b1
    public final void x(long j11) {
        n nVar = this.K;
        if (nVar.f52099c == null && !z()) {
            boolean zA = nVar.a();
            List list = this.N;
            i7.k kVar = this.f47541e;
            ArrayList arrayList = this.M;
            if (zA) {
                d dVar = this.R;
                dVar.getClass();
                boolean z11 = dVar instanceof a;
                if (z11 && y(arrayList.size() - 1)) {
                    return;
                }
                if (kVar.m != null ? false : kVar.f34233j.s(j11, dVar, list)) {
                    t7.k kVar2 = nVar.f52098b;
                    b7.a.k(kVar2);
                    kVar2.a(false);
                    if (z11) {
                        this.X = (a) dVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (kVar.m != null || kVar.f34233j.length() < 2) ? list.size() : kVar.f34233j.j(j11, list);
            if (size < arrayList.size()) {
                b7.a.j(!nVar.a());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!y(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j12 = v().H;
                a aVarQ = q(size);
                if (arrayList.isEmpty()) {
                    this.U = this.V;
                }
                this.f47537a0 = false;
                x xVar = new x(1, this.f47536a, null, 3, null, f0.V(aVarQ.f47530t), f0.V(j12));
                k7.c cVar = this.f47543t;
                b0 b0Var = cVar.f37957b;
                b0Var.getClass();
                cVar.a(new com.google.firebase.crashlytics.internal.concurrency.a(cVar, b0Var, xVar, 7));
            }
        }
    }

    public final boolean y(int i11) {
        int iM;
        a aVar = (a) this.M.get(i11);
        if (this.O.m() > aVar.a(0)) {
            return true;
        }
        int i12 = 0;
        do {
            y0[] y0VarArr = this.P;
            if (i12 >= y0VarArr.length) {
                return false;
            }
            iM = y0VarArr[i12].m();
            i12++;
        } while (iM <= aVar.a(i12));
        return true;
    }

    public final boolean z() {
        return this.U != -9223372036854775807L;
    }
}
