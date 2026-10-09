package i7;

import android.util.Pair;
import android.util.SparseArray;
import b7.f0;
import com.android.billingclient.api.k0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d7.q;
import f7.h1;
import f7.j0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.a1;
import p7.b0;
import p7.b1;
import p7.g1;
import p7.x;
import p7.y;
import p7.y0;
import p7.z;
import p7.z0;
import re.g0;
import re.v;
import s7.s;
import y6.d0;
import y6.p;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements z, a1, q7.f {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final Pattern f34171b0 = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Pattern f34172c0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final t7.o H;
    public final t7.g K;
    public final g1 L;
    public final a[] M;
    public final p20.c N;
    public final o O;
    public final k7.c Q;
    public final k7.c R;
    public y S;
    public p7.m V;
    public j7.c W;
    public int X;
    public List Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34173a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f34174a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij.d f34175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f34176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.g f34177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f34178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ob.i f34179f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f34180t;
    public boolean Z = true;
    public q7.g[] T = new q7.g[0];
    public l[] U = new l[0];
    public final IdentityHashMap P = new IdentityHashMap();

    public b(int i11, j7.c cVar, ob.i iVar, int i12, ij.d dVar, q qVar, k7.g gVar, k7.c cVar2, v vVar, k7.c cVar3, long j11, t7.o oVar, t7.g gVar2, p20.c cVar4, hd.d dVar2, g7.j jVar) {
        int i13;
        int i14;
        int[][] iArr;
        boolean[] zArr;
        p[][] pVarArr;
        p[] pVarArrM;
        j7.f fVarE;
        Integer num;
        this.f34173a = i11;
        this.W = cVar;
        this.f34179f = iVar;
        this.X = i12;
        this.f34175b = dVar;
        this.f34176c = qVar;
        this.f34177d = gVar;
        this.R = cVar2;
        this.f34178e = vVar;
        this.Q = cVar3;
        this.f34180t = j11;
        this.H = oVar;
        this.K = gVar2;
        this.N = cVar4;
        boolean z11 = true;
        this.O = new o(cVar, dVar2, gVar2);
        int i15 = 0;
        cVar4.getClass();
        this.V = new p7.m(ImmutableList.s(), ImmutableList.s());
        j7.h hVarA = cVar.a(i12);
        List list = hVarA.f36134d;
        this.Y = list;
        List list2 = hVarA.f36133c;
        int size = list2.size();
        HashMap map = new HashMap(Maps.c(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            map.put(Long.valueOf(((j7.a) list2.get(i16)).f36088a), Integer.valueOf(i16));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        int i17 = 0;
        while (i17 < size) {
            j7.a aVar = (j7.a) list2.get(i17);
            List list3 = aVar.f36092e;
            List list4 = aVar.f36093f;
            boolean z12 = z11;
            j7.f fVarE2 = e("http://dashif.org/guidelines/trickmode", list3);
            fVarE2 = fVarE2 == null ? e("http://dashif.org/guidelines/trickmode", list4) : fVarE2;
            int iIntValue = (fVarE2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarE2.f36125b)))) == null || !c(aVar, (j7.a) list2.get(num.intValue()))) ? i17 : num.intValue();
            if (iIntValue == i17 && (fVarE = e("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarE.f36125b;
                String str2 = f0.f3975a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i18 = i15; i18 < length; i18++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i18])));
                    if (num2 != null && c(aVar, (j7.a) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i17) {
                List list5 = (List) sparseArray.get(i17);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i17, list6);
                arrayList.remove(list5);
            }
            i17++;
            z11 = z12;
            i15 = 0;
        }
        boolean z13 = z11;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] iArrF = Ints.f((Collection) arrayList.get(i19));
            iArr2[i19] = iArrF;
            Arrays.sort(iArrF);
        }
        boolean[] zArr2 = new boolean[size2];
        p[][] pVarArr2 = new p[size2][];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr3 = iArr2[i21];
            int length2 = iArr3.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((j7.a) list2.get(iArr3[i23])).f36090c;
                iArr = iArr2;
                for (int i24 = 0; i24 < list7.size(); i24++) {
                    if (!((j7.m) list7.get(i24)).f36147d.isEmpty()) {
                        zArr2[i21] = z13;
                        i22++;
                        break;
                    }
                }
                i23++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i21];
            int length3 = iArr4.length;
            int i25 = 0;
            while (true) {
                if (i25 >= length3) {
                    zArr = zArr2;
                    pVarArr = pVarArr2;
                    pVarArrM = new p[0];
                    break;
                }
                int i26 = iArr4[i25];
                j7.a aVar2 = (j7.a) list2.get(i26);
                List list8 = ((j7.a) list2.get(i26)).f36091d;
                int[] iArr5 = iArr4;
                int i27 = 0;
                while (i27 < list8.size()) {
                    j7.f fVar = (j7.f) list8.get(i27);
                    zArr = zArr2;
                    pVarArr = pVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f36124a)) {
                        y6.o oVar2 = new y6.o();
                        oVar2.m = d0.o("application/cea-608");
                        oVar2.f57253a = defpackage.e.i(aVar2.f36088a, ":cea608", new StringBuilder());
                        pVarArrM = m(fVar, f34171b0, new p(oVar2));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f36124a)) {
                        y6.o oVar3 = new y6.o();
                        oVar3.m = d0.o("application/cea-708");
                        oVar3.f57253a = defpackage.e.i(aVar2.f36088a, ":cea708", new StringBuilder());
                        pVarArrM = m(fVar, f34172c0, new p(oVar3));
                        break;
                    }
                    i27++;
                    pVarArr2 = pVarArr;
                    zArr2 = zArr;
                }
                i25++;
                iArr4 = iArr5;
            }
            pVarArr[i21] = pVarArrM;
            if (pVarArrM.length != 0) {
                i22++;
            }
            i21++;
            pVarArr2 = pVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        p[][] pVarArr3 = pVarArr2;
        int size3 = list.size() + i22 + size2;
        p0[] p0VarArr = new p0[size3];
        a[] aVarArr = new a[size3];
        int i28 = 0;
        int i29 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i30 : iArr7) {
                arrayList3.addAll(((j7.a) list2.get(i30)).f36090c);
            }
            int size4 = arrayList3.size();
            p[] pVarArr4 = new p[size4];
            int i31 = 0;
            while (i31 < size4) {
                int i32 = size2;
                p pVar = ((j7.m) arrayList3.get(i31)).f36144a;
                int i33 = i29;
                y6.o oVarA = pVar.a();
                oVarA.N = gVar.b(pVar);
                pVarArr4[i31] = new p(oVarA);
                i31++;
                size2 = i32;
                i29 = i33;
            }
            int i34 = size2;
            int i35 = i29;
            j7.a aVar3 = (j7.a) list2.get(iArr7[0]);
            long j12 = aVar3.f36088a;
            String string = j12 != -1 ? Long.toString(j12) : nv.p.j(i28, "unset:");
            int i36 = i35 + 1;
            if (zArr3[i28]) {
                i13 = i35 + 2;
            } else {
                i13 = i36;
                i36 = -1;
            }
            if (pVarArr3[i28].length != 0) {
                i14 = i13 + 1;
            } else {
                i14 = i13;
                i13 = -1;
            }
            g(dVar, pVarArr4);
            List list9 = list2;
            p0VarArr[i35] = new p0(string, pVarArr4);
            aVarArr[i35] = new a(aVar3.f36089b, 0, iArr7, i35, i36, i13, -1, ImmutableList.s());
            int i37 = -1;
            if (i36 != -1) {
                String strM = defpackage.e.m(string, ":emsg");
                y6.o oVar4 = new y6.o();
                oVar4.f57253a = strM;
                oVar4.m = d0.o("application/x-emsg");
                p0VarArr[i36] = new p0(strM, new p(oVar4));
                aVarArr[i36] = new a(5, 1, iArr7, i35, -1, -1, -1, ImmutableList.s());
                i37 = -1;
            }
            if (i13 != i37) {
                String strM2 = defpackage.e.m(string, ":cc");
                aVarArr[i13] = new a(3, 1, iArr7, i35, -1, -1, -1, ImmutableList.o(pVarArr3[i28]));
                g(dVar, pVarArr3[i28]);
                p0VarArr[i13] = new p0(strM2, pVarArr3[i28]);
            }
            i28++;
            size2 = i34;
            i29 = i14;
            list2 = list9;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            j7.g gVar3 = (j7.g) list.get(i38);
            y6.o oVar5 = new y6.o();
            oVar5.f57253a = gVar3.a();
            oVar5.m = d0.o("application/x-emsg");
            p0VarArr[i29] = new p0(gVar3.a() + ":" + i38, new p(oVar5));
            aVarArr[i29] = new a(5, 2, new int[0], -1, -1, -1, i38, ImmutableList.s());
            i38++;
            i29++;
        }
        Pair pairCreate = Pair.create(new g1(p0VarArr), aVarArr);
        this.L = (g1) pairCreate.first;
        this.M = (a[]) pairCreate.second;
    }

    public static boolean c(j7.a aVar, j7.a aVar2) {
        int i11 = aVar.f36089b;
        List list = aVar.f36090c;
        int i12 = aVar2.f36089b;
        List list2 = aVar2.f36090c;
        if (i11 == i12) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            p pVar = ((j7.m) list.get(0)).f36144a;
            p pVar2 = ((j7.m) list2.get(0)).f36144a;
            int i13 = pVar.f57284f & (-16385);
            int i14 = pVar2.f57284f & (-16385);
            if (Objects.equals(pVar.f57282d, pVar2.f57282d) && i13 == i14) {
                return true;
            }
        }
        return false;
    }

    public static j7.f e(String str, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            j7.f fVar = (j7.f) list.get(i11);
            if (str.equals(fVar.f36124a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void g(ij.d dVar, p[] pVarArr) {
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            p pVar = pVarArr[i11];
            k0 k0Var = (k0) dVar.f34423d;
            if (k0Var.f7546a && ((g0) k0Var.f7547b).l(pVar)) {
                y6.o oVarA = pVar.a();
                String str = pVar.f57289k;
                oVarA.m = d0.o("application/x-media3-cues");
                oVarA.K = ((g0) k0Var.f7547b).b(pVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pVar.f57291n);
                sb2.append(str != null ? " ".concat(str) : BuildConfig.VERSION_NAME);
                oVarA.f57262j = sb2.toString();
                oVarA.f57269r = Long.MAX_VALUE;
                pVar = new p(oVarA);
            }
            pVarArr[i11] = pVar;
        }
    }

    public static p[] m(j7.f fVar, Pattern pattern, p pVar) {
        String str = fVar.f36125b;
        if (str == null) {
            return new p[]{pVar};
        }
        String str2 = f0.f3975a;
        String[] strArrSplit = str.split(";", -1);
        p[] pVarArr = new p[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new p[]{pVar};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            y6.o oVarA = pVar.a();
            oVarA.f57253a = pVar.f57279a + ":" + i12;
            oVarA.J = i12;
            oVarA.f57256d = matcher.group(2);
            pVarArr[i11] = new p(oVarA);
        }
        return pVarArr;
    }

    @Override // p7.b1
    public final boolean a() {
        return this.V.a();
    }

    @Override // p7.a1
    public final void b(b1 b1Var) {
        this.S.b(this);
    }

    public final int f(int[] iArr, int i11) {
        int i12 = iArr[i11];
        if (i12 != -1) {
            a[] aVarArr = this.M;
            int i13 = aVarArr[i12].f34167e;
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                if (i15 == i13 && aVarArr[i15].f34165c == 0) {
                    return i14;
                }
            }
        }
        return -1;
    }

    @Override // p7.b1
    public final long h() {
        return this.V.h();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // p7.z
    public final long i(long j11, h1 h1Var) {
        long jF;
        int i11 = 0;
        for (q7.g gVar : this.T) {
            if (gVar.f47536a == 2) {
                i[] iVarArr = gVar.f47541e.f34232i;
                int length = iVarArr.length;
                while (i11 < length) {
                    i iVar = iVarArr[i11];
                    h hVar = iVar.f34217d;
                    long j12 = iVar.f34219f;
                    h hVar2 = iVar.f34217d;
                    if (hVar != null) {
                        long jD = iVar.d();
                        if (jD != 0) {
                            b7.a.k(hVar2);
                            long jL = hVar2.l(j11, iVar.f34218e) + j12;
                            long jF2 = iVar.f(jL);
                            if (jF2 >= j11) {
                                jF = jF2;
                            } else {
                                if (jD != -1) {
                                    b7.a.k(hVar2);
                                    if (jL >= ((hVar2.w() + j12) + jD) - 1) {
                                        jF = jF2;
                                    }
                                }
                                jF = iVar.f(jL + 1);
                            }
                            return h1Var.a(j11, jF2, jF);
                        }
                    }
                    i11++;
                    j11 = j11;
                }
                break;
            }
        }
        return j11;
    }

    @Override // p7.z
    public final void j() {
        this.H.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // p7.z
    public final long k(long j11) throws Throwable {
        int i11;
        q7.a aVar;
        boolean zV;
        boolean z11;
        q7.g[] gVarArr = this.T;
        int length = gVarArr.length;
        boolean z12 = false;
        int i12 = 0;
        while (i12 < length) {
            q7.g gVar = gVarArr[i12];
            y0[] y0VarArr = gVar.P;
            y0 y0Var = gVar.O;
            t7.n nVar = gVar.K;
            ?? r14 = gVar.M;
            gVar.V = j11;
            gVar.Y = z12;
            if (gVar.z()) {
                gVar.U = j11;
                z11 = z12;
                i11 = i12;
            } else {
                ?? r15 = z12;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (q7.a) r14.get(r15);
                        long j12 = aVar.f47530t;
                        i11 = i12;
                        if (j12 == j11 && aVar.M == -9223372036854775807L) {
                            break;
                        }
                        if (j12 <= j11) {
                            i12 = i11;
                            r15++;
                        }
                    } else {
                        i11 = i12;
                    }
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    zV = y0Var.u(aVar.a(0));
                } else {
                    long jH = gVar.h();
                    zV = y0Var.v(j11, jH == Long.MIN_VALUE || j11 < jH);
                }
                if (zV) {
                    gVar.W = gVar.B(y0Var.m(), 0);
                    for (y0 y0Var2 : y0VarArr) {
                        y0Var2.v(j11, true);
                    }
                    z11 = false;
                } else {
                    gVar.U = j11;
                    gVar.f47537a0 = false;
                    r14.clear();
                    gVar.W = 0;
                    if (nVar.a()) {
                        y0Var.g();
                        for (y0 y0Var3 : y0VarArr) {
                            y0Var3.g();
                        }
                        t7.k kVar = nVar.f52098b;
                        b7.a.k(kVar);
                        z11 = false;
                        kVar.a(false);
                    } else {
                        z11 = false;
                        nVar.f52099c = null;
                        y0Var.t(false);
                        for (y0 y0Var4 : gVar.P) {
                            y0Var4.t(false);
                        }
                    }
                }
            }
            i12 = i11 + 1;
            z12 = z11;
        }
        l[] lVarArr = this.U;
        int length2 = lVarArr.length;
        for (?? r9 = z12; r9 < length2; r9++) {
            l lVar = lVarArr[r9];
            int iA = f0.a(lVar.f34239c, j11, true);
            lVar.f34243t = iA;
            lVar.H = (lVar.f34240d && iA == lVar.f34239c.length) ? j11 : -9223372036854775807L;
        }
        return j11;
    }

    @Override // p7.z
    public final void l(long j11) throws Throwable {
        long j12;
        for (q7.g gVar : this.T) {
            if (!gVar.z()) {
                y0 y0Var = gVar.O;
                int i11 = y0Var.f46553q;
                y0Var.f(j11, true);
                y0 y0Var2 = gVar.O;
                int i12 = y0Var2.f46553q;
                if (i12 > i11) {
                    synchronized (y0Var2) {
                        j12 = y0Var2.f46552p == 0 ? Long.MIN_VALUE : y0Var2.f46550n[y0Var2.f46554r];
                    }
                    int i13 = 0;
                    while (true) {
                        y0[] y0VarArr = gVar.P;
                        if (i13 >= y0VarArr.length) {
                            break;
                        }
                        y0VarArr[i13].f(j12, gVar.f47540d[i13]);
                        i13++;
                    }
                }
                int iMin = Math.min(gVar.B(i12, 0), gVar.W);
                if (iMin > 0) {
                    ArrayList arrayList = gVar.M;
                    String str = f0.f3975a;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    gVar.W -= iMin;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p7.z
    public final void n(y yVar, long j11) {
        this.S = yVar;
        yVar.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.z
    public final long r(s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j11) throws Throwable {
        int i11;
        boolean z11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        p0 p0VarA;
        int i15;
        n nVar;
        boolean z12;
        int[] iArr2 = new int[sVarArr.length];
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i11 = -1;
            if (i17 >= sVarArr.length) {
                break;
            }
            s sVar = sVarArr[i17];
            if (sVar != null) {
                int iIndexOf = this.L.f46389b.indexOf(sVar.b());
                iArr2[i17] = iIndexOf >= 0 ? iIndexOf : -1;
            } else {
                iArr2[i17] = -1;
            }
            i17++;
        }
        for (int i18 = 0; i18 < sVarArr.length; i18++) {
            if (sVarArr[i18] == null || !zArr[i18]) {
                z0 z0Var = z0VarArr[i18];
                if (z0Var instanceof q7.g) {
                    ((q7.g) z0Var).C(this);
                } else if (z0Var instanceof q7.e) {
                    q7.e eVar = (q7.e) z0Var;
                    q7.g gVar = eVar.f47535e;
                    boolean[] zArr3 = gVar.f47540d;
                    int i19 = eVar.f47533c;
                    b7.a.j(zArr3[i19]);
                    gVar.f47540d[i19] = false;
                }
                z0VarArr[i18] = null;
            }
        }
        int i21 = 0;
        while (true) {
            z11 = true;
            if (i21 >= sVarArr.length) {
                break;
            }
            z0 z0Var2 = z0VarArr[i21];
            if ((z0Var2 instanceof p7.p) || (z0Var2 instanceof q7.e)) {
                int iF = f(iArr2, i21);
                if (iF == -1) {
                    z12 = z0VarArr[i21] instanceof p7.p;
                } else {
                    z0 z0Var3 = z0VarArr[i21];
                    z12 = (z0Var3 instanceof q7.e) && ((q7.e) z0Var3).f47531a == z0VarArr[iF];
                }
                if (!z12) {
                    z0 z0Var4 = z0VarArr[i21];
                    if (z0Var4 instanceof q7.e) {
                        q7.e eVar2 = (q7.e) z0Var4;
                        q7.g gVar2 = eVar2.f47535e;
                        boolean[] zArr4 = gVar2.f47540d;
                        int i22 = eVar2.f47533c;
                        b7.a.j(zArr4[i22]);
                        gVar2.f47540d[i22] = false;
                    }
                    z0VarArr[i21] = null;
                }
            }
            i21++;
        }
        int i23 = 0;
        while (i23 < sVarArr.length) {
            s sVar2 = sVarArr[i23];
            if (sVar2 == null) {
                iArr = iArr2;
                i12 = i16;
                i13 = i23;
            } else {
                z0 z0Var5 = z0VarArr[i23];
                if (z0Var5 == null) {
                    zArr2[i23] = z11;
                    a aVar = this.M[iArr2[i23]];
                    int i24 = aVar.f34165c;
                    if (i24 == 0) {
                        int i25 = aVar.f34168f;
                        boolean z13 = i25 != i11 ? z11 ? 1 : 0 : i16;
                        if (z13 != 0) {
                            p0VarA = this.L.a(i25);
                            i14 = z11 ? 1 : 0;
                        } else {
                            i14 = i16;
                            p0VarA = null;
                        }
                        int i26 = aVar.f34169g;
                        ImmutableList immutableListS = i26 != i11 ? this.M[i26].f34170h : ImmutableList.s();
                        int size = immutableListS.size() + i14;
                        p[] pVarArr = new p[size];
                        int[] iArr3 = new int[size];
                        if (z13 != 0) {
                            pVarArr[i16] = p0VarA.f57307d[i16];
                            iArr3[i16] = 5;
                            i15 = z11 ? 1 : 0;
                        } else {
                            i15 = i16;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i27 = i16; i27 < immutableListS.size(); i27++) {
                            p pVar = (p) immutableListS.get(i27);
                            pVarArr[i15] = pVar;
                            iArr3[i15] = 3;
                            arrayList.add(pVar);
                            i15 += z11 ? 1 : 0;
                        }
                        if (!this.W.f36101d || z13 == 0) {
                            nVar = null;
                        } else {
                            o oVar = this.O;
                            nVar = new n(oVar, oVar.f34251a);
                        }
                        ij.d dVar = this.f34175b;
                        t7.o oVar2 = this.H;
                        j7.c cVar = this.W;
                        ob.i iVar = this.f34179f;
                        int i28 = this.X;
                        int[] iArr4 = aVar.f34163a;
                        int i29 = aVar.f34164b;
                        iArr = iArr2;
                        long j12 = this.f34180t;
                        q qVar = this.f34176c;
                        d7.f fVarS = ((d7.e) dVar.f34422c).s();
                        if (qVar != null) {
                            fVarS.c(qVar);
                        }
                        n nVar2 = nVar;
                        i12 = 0;
                        i13 = i23;
                        q7.g gVar3 = new q7.g(aVar.f34164b, iArr3, pVarArr, new k((k0) dVar.f34423d, oVar2, cVar, iVar, i28, iArr4, sVar2, i29, fVarS, j12, dVar.f34421b, z13, arrayList, nVar), this, this.K, j11, this.f34177d, this.R, this.f34178e, this.Q, this.Z);
                        synchronized (this) {
                            this.P.put(gVar3, nVar2);
                        }
                        z0VarArr[i13] = gVar3;
                    } else {
                        iArr = iArr2;
                        i12 = i16;
                        i13 = i23;
                        if (i24 == 2) {
                            z0VarArr[i13] = new l((j7.g) this.Y.get(aVar.f34166d), sVar2.b().f57307d[i12], this.W.f36101d);
                        }
                    }
                } else {
                    iArr = iArr2;
                    i12 = i16;
                    i13 = i23;
                    if (z0Var5 instanceof q7.g) {
                        ((q7.g) z0Var5).f47541e.f34233j = sVar2;
                    }
                }
            }
            i23 = i13 + 1;
            i16 = i12;
            iArr2 = iArr;
            i11 = -1;
            z11 = true;
        }
        int[] iArr5 = iArr2;
        boolean z14 = i16;
        int i30 = z14 ? 1 : 0;
        while (i30 < sVarArr.length) {
            if (z0VarArr[i30] == null && sVarArr[i30] != null) {
                a aVar2 = this.M[iArr5[i30]];
                if (aVar2.f34165c == 1) {
                    iArr5 = iArr5;
                    int iF2 = f(iArr5, i30);
                    if (iF2 == -1) {
                        z0VarArr[i30] = new p7.p();
                    } else {
                        q7.g gVar4 = (q7.g) z0VarArr[iF2];
                        int i31 = aVar2.f34164b;
                        boolean[] zArr5 = gVar4.f47540d;
                        y0[] y0VarArr = gVar4.P;
                        int i32 = z14 ? 1 : 0;
                        while (true) {
                            if (i32 >= y0VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (gVar4.f47538b[i32] == i31) {
                                b7.a.j(!zArr5[i32]);
                                zArr5[i32] = true;
                                y0VarArr[i32].v(j11, true);
                                z0VarArr[i30] = new q7.e(gVar4, gVar4, y0VarArr[i32], i32);
                                break;
                            }
                            i32++;
                        }
                    }
                }
                i30++;
                iArr5 = iArr5;
            }
            i30++;
            iArr5 = iArr5;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = z0VarArr.length;
        for (int i33 = z14 ? 1 : 0; i33 < length; i33++) {
            z0 z0Var6 = z0VarArr[i33];
            if (z0Var6 instanceof q7.g) {
                arrayList2.add((q7.g) z0Var6);
            } else if (z0Var6 instanceof l) {
                arrayList3.add((l) z0Var6);
            }
        }
        q7.g[] gVarArr = new q7.g[arrayList2.size()];
        this.T = gVarArr;
        arrayList2.toArray(gVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.U = lVarArr;
        arrayList3.toArray(lVarArr);
        p20.c cVar2 = this.N;
        AbstractList abstractListE = Lists.e(arrayList2, new a7.c(4));
        cVar2.getClass();
        this.V = new p7.m(arrayList2, abstractListE);
        if (this.Z) {
            this.Z = z14;
            this.f34174a0 = j11;
        }
        return j11;
    }

    @Override // p7.z
    public final long s() {
        for (q7.g gVar : this.T) {
            gVar.getClass();
            try {
                boolean z11 = gVar.Z;
                gVar.Z = false;
                if (z11) {
                    return this.f34174a0;
                }
            } catch (Throwable th2) {
                gVar.Z = false;
                throw th2;
            }
        }
        return -9223372036854775807L;
    }

    @Override // p7.z
    public final g1 t() {
        return this.L;
    }

    @Override // p7.b1
    public final boolean u(j0 j0Var) {
        return this.V.u(j0Var);
    }

    @Override // p7.b1
    public final long w() {
        return this.V.w();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    @Override // p7.b1
    public final void x(long j11) {
        int i11;
        long j12;
        q7.g[] gVarArr = this.T;
        int length = gVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            q7.g gVar = gVarArr[i12];
            if (gVar.K.a()) {
                i11 = i12;
            } else {
                long jC = this.W.c(this.X);
                y0 y0Var = gVar.O;
                b7.a.j(!gVar.K.a());
                if (gVar.z() || jC == -9223372036854775807L || gVar.M.isEmpty()) {
                    i11 = i12;
                } else {
                    q7.a aVarV = gVar.v();
                    long j13 = aVarV.N;
                    if (j13 == -9223372036854775807L) {
                        j13 = aVarV.H;
                    }
                    if (j13 <= jC) {
                        i11 = i12;
                    } else {
                        synchronized (y0Var) {
                            j12 = y0Var.f46558v;
                        }
                        if (j12 <= jC) {
                            i11 = i12;
                        } else {
                            y0Var.h(Math.max(jC, y0Var.k() + 1));
                            y0[] y0VarArr = gVar.P;
                            int length2 = y0VarArr.length;
                            int i13 = 0;
                            while (i13 < length2) {
                                y0 y0Var2 = y0VarArr[i13];
                                y0Var2.h(Math.max(jC, y0Var2.k() + 1));
                                i13++;
                                i12 = i12;
                            }
                            i11 = i12;
                            k7.c cVar = gVar.f47543t;
                            x xVar = new x(1, gVar.f47536a, null, 3, null, f0.V(jC), f0.V(j12));
                            b0 b0Var = cVar.f37957b;
                            b0Var.getClass();
                            cVar.a(new com.google.firebase.crashlytics.internal.concurrency.a(cVar, b0Var, xVar, 7));
                        }
                    }
                }
            }
            i12 = i11 + 1;
        }
        this.V.x(j11);
    }
}
