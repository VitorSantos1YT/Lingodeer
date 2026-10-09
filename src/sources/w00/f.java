package w00;

import d1.t;
import hh.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import z00.b0;
import z00.v;
import z00.w;
import z00.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final LinkedHashSet f54381u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Map f54382v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a10.e f54383a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54387e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f54392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a10.b f54393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f54394l;
    public final List m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f54395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f54396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a10.a f54397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f54398q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f54400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f54401t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54384b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54385c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54386d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54388f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54389g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54390h = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.bumptech.glide.j f54399r = new com.bumptech.glide.j(1);

    static {
        Object[] objArr = {z00.b.class, z00.k.class, z00.i.class, z00.l.class, b0.class, z00.r.class, z00.o.class};
        ArrayList arrayList = new ArrayList(7);
        for (int i11 = 0; i11 < 7; i11++) {
            Object obj = objArr[i11];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        f54381u = new LinkedHashSet(Collections.unmodifiableList(arrayList));
        HashMap map = new HashMap();
        map.put(z00.b.class, new v00.a(1));
        map.put(z00.k.class, new v00.a(3));
        map.put(z00.i.class, new v00.a(2));
        map.put(z00.l.class, new v00.a(4));
        map.put(b0.class, new v00.a(7));
        map.put(z00.r.class, new v00.a(6));
        map.put(z00.o.class, new v00.a(5));
        f54382v = Collections.unmodifiableMap(map);
    }

    public f(ArrayList arrayList, a10.b bVar, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, a10.a aVar) {
        ArrayList arrayList5 = new ArrayList();
        this.f54400s = arrayList5;
        this.f54401t = new ArrayList();
        this.f54392j = arrayList;
        this.f54393k = bVar;
        this.f54394l = arrayList2;
        this.m = arrayList3;
        this.f54395n = arrayList4;
        this.f54396o = hashSet;
        this.f54397p = aVar;
        c cVar = new c(0);
        this.f54398q = cVar;
        arrayList5.add(new e(cVar, 0));
    }

    public final void a(e eVar) {
        c10.a aVar = eVar.f54379a;
        while (!g().c(aVar.f())) {
            e(1);
        }
        g().f().c(aVar.f());
        this.f54400s.add(eVar);
    }

    public final void b() {
        CharSequence charSequenceSubSequence;
        int i11;
        y yVar;
        int i12;
        if (this.f54387e) {
            int i13 = this.f54385c + 1;
            CharSequence charSequence = this.f54383a.f289a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i13, charSequence.length());
            int i14 = 4 - (this.f54386d % 4);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + i14);
            for (int i15 = 0; i15 < i14; i15++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            int i16 = this.f54385c;
            if (i16 == 0) {
                charSequenceSubSequence = this.f54383a.f289a;
            } else {
                CharSequence charSequence2 = this.f54383a.f289a;
                charSequenceSubSequence = charSequence2.subSequence(i16, charSequence2.length());
            }
        }
        g().a(new a10.e(charSequenceSubSequence, (this.f54397p != a10.a.BLOCKS_AND_INLINES || (i11 = this.f54385c) >= (i12 = (yVar = this.f54383a.f290b).f58456d)) ? null : yVar.a(i11, i12)));
        c();
    }

    public final void c() {
        if (this.f54397p == a10.a.NONE) {
            return;
        }
        int i11 = 1;
        while (true) {
            ArrayList arrayList = this.f54400s;
            if (i11 >= arrayList.size()) {
                return;
            }
            e eVar = (e) arrayList.get(i11);
            int iMin = Math.min(eVar.f54380b, this.f54385c);
            if (this.f54383a.f289a.length() - iMin != 0) {
                c10.a aVar = eVar.f54379a;
                y yVar = this.f54383a.f290b;
                aVar.b(yVar.a(iMin, yVar.f58456d));
            }
            i11++;
        }
    }

    public final void d() {
        char cCharAt = this.f54383a.f289a.charAt(this.f54385c);
        this.f54385c++;
        if (cCharAt != '\t') {
            this.f54386d++;
        } else {
            int i11 = this.f54386d;
            this.f54386d = (4 - (i11 % 4)) + i11;
        }
    }

    public final void e(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            c10.a aVar = ((e) p0.f(1, this.f54400s)).f54379a;
            for (z00.f fVar : aVar.g()) {
                com.bumptech.glide.j jVar = this.f54399r;
                jVar.getClass();
                HashMap map = jVar.f7639a;
                z00.f fVar2 = (z00.f) map.get(fVar.f58423a);
                if (fVar2 == null) {
                    map.put(fVar.f58423a, fVar);
                } else {
                    for (Map.Entry entry : fVar.f58424b.entrySet()) {
                        fVar2.f58424b.putIfAbsent((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            aVar.e();
            this.f54401t.add(aVar);
        }
    }

    public final void f() {
        int i11 = this.f54385c;
        int i12 = this.f54386d;
        this.f54391i = true;
        int length = this.f54383a.f289a.length();
        while (i11 < length) {
            char cCharAt = this.f54383a.f289a.charAt(i11);
            if (cCharAt == '\t') {
                i11++;
                i12 += 4 - (i12 % 4);
            } else if (cCharAt != ' ') {
                this.f54391i = false;
                break;
            } else {
                i11++;
                i12++;
            }
        }
        this.f54388f = i11;
        this.f54389g = i12;
        this.f54390h = i12 - this.f54386d;
    }

    public final c10.a g() {
        return ((e) nv.p.f(1, this.f54400s)).f54379a;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x028e  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a0 A[PHI: r21
      0x02a0: PHI (r21v14 c10.a) = 
      (r21v7 c10.a)
      (r21v7 c10.a)
      (r21v7 c10.a)
      (r21v7 c10.a)
      (r21v7 c10.a)
      (r21v8 c10.a)
      (r21v9 c10.a)
      (r21v9 c10.a)
      (r21v10 c10.a)
      (r21v10 c10.a)
      (r21v10 c10.a)
      (r21v11 c10.a)
      (r21v11 c10.a)
      (r21v11 c10.a)
      (r21v12 c10.a)
      (r21v12 c10.a)
      (r21v12 c10.a)
      (r21v16 c10.a)
      (r21v19 c10.a)
     binds: [B:310:0x05dd, B:312:0x05ef, B:367:0x06ac, B:369:0x06b2, B:371:0x06c7, B:308:0x05cd, B:272:0x0520, B:295:0x0570, B:193:0x03a6, B:263:0x04e3, B:265:0x04ef, B:176:0x0348, B:178:0x0350, B:468:0x02a0, B:169:0x0312, B:171:0x0316, B:173:0x0322, B:148:0x029e, B:82:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:164:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:238:0x047b  */
    /* JADX WARN: Code duplicated, block: B:239:0x048d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0495  */
    /* JADX WARN: Code duplicated, block: B:244:0x049a  */
    /* JADX WARN: Code duplicated, block: B:246:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:249:0x04aa A[LOOP:11: B:245:0x04a0->B:249:0x04aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:253:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:255:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04cf A[LOOP:12: B:254:0x04c3->B:258:0x04cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:261:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:262:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:264:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:266:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:268:0x050e  */
    /* JADX WARN: Code duplicated, block: B:294:0x056f  */
    /* JADX WARN: Code duplicated, block: B:375:0x06e4 A[LOOP:2: B:43:0x00d1->B:375:0x06e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:390:0x0715  */
    /* JADX WARN: Code duplicated, block: B:445:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x06ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x01ca. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    public final void h(int i11, String str) {
        ArrayList arrayList;
        c10.a aVar;
        t tVar;
        int i12;
        List listUnmodifiableList;
        t tVar2;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        u00.c cVar;
        char cCharAt;
        int i15;
        g gVar;
        char cCharAt2;
        int i16;
        int length;
        int i17;
        a10.f fVarD;
        ArrayList arrayList2;
        t tVar3;
        int size;
        int i18;
        int length2;
        int i19;
        h hVar;
        char c11;
        char c12;
        boolean z13;
        int i21;
        n nVar;
        char cCharAt3;
        n nVar2;
        ?? r9;
        boolean zEquals;
        boolean zEquals2;
        int i22;
        int i23;
        char cCharAt4;
        int i24;
        String strReplace = str;
        this.f54384b++;
        int i25 = 0;
        this.f54385c = 0;
        this.f54386d = 0;
        this.f54387e = false;
        if (strReplace.indexOf(0) != -1) {
            strReplace = strReplace.replace((char) 0, (char) 65533);
        }
        this.f54383a = new a10.e(strReplace, this.f54397p != a10.a.NONE ? new y(this.f54384b, 0, i11, strReplace.length()) : null);
        int i26 = 1;
        int i27 = 1;
        while (true) {
            arrayList = this.f54400s;
            if (i26 >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i26);
            c10.a aVar2 = eVar.f54379a;
            f();
            l8.h hVarJ = aVar2.j(this);
            if (hVarJ == null) {
                break;
            }
            eVar.f54380b = this.f54385c;
            if (hVarJ.f39822c) {
                c();
                e(arrayList.size() - i26);
                return;
            }
            int i28 = hVarJ.f39820a;
            if (i28 != -1) {
                j(i28);
            } else {
                int i29 = hVarJ.f39821b;
                if (i29 != -1) {
                    i(i29);
                }
            }
            i27++;
            i26++;
        }
        int size2 = arrayList.size() - i27;
        c10.a aVar3 = ((e) arrayList.get(i27 - 1)).f54379a;
        int i30 = this.f54385c;
        boolean zH = (aVar3.f() instanceof w) || aVar3.h();
        boolean z14 = false;
        while (true) {
            if (zH) {
                i30 = this.f54385c;
                f();
                if (!this.f54391i) {
                    int i31 = 4;
                    if (this.f54390h >= 4 || !Character.isLetter(Character.codePointAt(this.f54383a.f289a, this.f54388f))) {
                        d dVar = new d(aVar3);
                        Iterator it = this.f54392j.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i32 = ((v00.a) it.next()).f53465a;
                                int i33 = i25;
                                char c13 = ' ';
                                char c14 = '\t';
                                Object obj = dVar.f54378a;
                                switch (i32) {
                                    case 0:
                                        aVar = aVar3;
                                        ArrayList arrayList3 = dVar.d().f291a;
                                        if (arrayList3.size() >= 1 && qx.p.p('|', ((a10.e) nv.p.f(1, arrayList3)).f289a, 0) != -1) {
                                            a10.e eVar2 = this.f54383a;
                                            CharSequence charSequence = eVar2.a(this.f54385c, eVar2.f289a.length()).f289a;
                                            ArrayList arrayList4 = new ArrayList();
                                            int i34 = 0;
                                            boolean z15 = false;
                                            int i35 = 0;
                                            while (true) {
                                                if (i34 < charSequence.length()) {
                                                    char cCharAt5 = charSequence.charAt(i34);
                                                    if (cCharAt5 == '\t' || cCharAt5 == ' ') {
                                                        i34++;
                                                    } else {
                                                        int i36 = i34;
                                                        if (cCharAt5 == '-' || cCharAt5 == ':') {
                                                            if (i35 != 0 || arrayList4.isEmpty()) {
                                                                if (cCharAt5 == ':') {
                                                                    i13 = i36 + 1;
                                                                    i14 = 1;
                                                                    z11 = true;
                                                                } else {
                                                                    i13 = i36;
                                                                    i14 = 0;
                                                                    z11 = false;
                                                                }
                                                                boolean z16 = false;
                                                                while (i13 < charSequence.length() && charSequence.charAt(i13) == '-') {
                                                                    i13++;
                                                                    i14++;
                                                                    z16 = true;
                                                                }
                                                                if (z16) {
                                                                    if (i13 >= charSequence.length() || charSequence.charAt(i13) != ':') {
                                                                        z12 = false;
                                                                    } else {
                                                                        i13++;
                                                                        i14++;
                                                                        z12 = true;
                                                                    }
                                                                    if (z11 && z12) {
                                                                        cVar = u00.c.CENTER;
                                                                    } else if (z11) {
                                                                        cVar = u00.c.LEFT;
                                                                    } else {
                                                                        cVar = z12 ? u00.c.RIGHT : null;
                                                                    }
                                                                    arrayList4.add(new v00.b(cVar, i14));
                                                                    i34 = i13;
                                                                    i35 = 0;
                                                                }
                                                            }
                                                        } else if (cCharAt5 == '|') {
                                                            int i37 = i36 + 1;
                                                            i35++;
                                                            if (i35 <= 1) {
                                                                i34 = i37;
                                                                z15 = true;
                                                            }
                                                        }
                                                    }
                                                } else if (!z15) {
                                                }
                                                arrayList4 = null;
                                            }
                                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                a10.e eVar3 = (a10.e) nv.p.f(1, arrayList3);
                                                if (arrayList4.size() >= v00.c.l(eVar3).size()) {
                                                    tVar2 = new t(new c10.a[]{new v00.c(arrayList4, eVar3)});
                                                    tVar2.f22991b = this.f54385c;
                                                    tVar2.f22993d = 1;
                                                    tVar = tVar2;
                                                }
                                                if (tVar == null) {
                                                    aVar3 = aVar;
                                                    i25 = 0;
                                                    i31 = 4;
                                                }
                                            }
                                        }
                                        tVar = null;
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i38 = this.f54388f;
                                        if (a.k(this, i38)) {
                                            int i39 = this.f54386d + this.f54390h;
                                            int i40 = i39 + 1;
                                            CharSequence charSequence2 = this.f54383a.f289a;
                                            int i41 = i38 + 1;
                                            if (i41 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i41)) == '\t' || cCharAt == ' ')) {
                                                i40 = i39 + 2;
                                            }
                                            tVar = new t(new c10.a[]{new a()});
                                            tVar.f22992c = i40;
                                        } else {
                                            tVar = null;
                                        }
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i42 = this.f54390h;
                                        if (i42 < 4) {
                                            int i43 = this.f54388f;
                                            CharSequence charSequence3 = this.f54383a.f289a;
                                            int length3 = charSequence3.length();
                                            int i44 = i43;
                                            int i45 = 0;
                                            int i46 = 0;
                                            while (true) {
                                                i15 = i43;
                                                if (i44 < length3) {
                                                    char cCharAt6 = charSequence3.charAt(i44);
                                                    if (cCharAt6 == '`') {
                                                        i45++;
                                                    } else if (cCharAt6 == '~') {
                                                        i46++;
                                                    }
                                                    i44++;
                                                    i43 = i15;
                                                }
                                            }
                                            if (i45 < 3 || i46 != 0) {
                                                if (i46 < 3 || i45 != 0) {
                                                    gVar = null;
                                                } else {
                                                    gVar = new g(i46, i42, '~');
                                                }
                                            } else if (qx.p.p('`', charSequence3, i15 + i45) != -1) {
                                                gVar = null;
                                            } else {
                                                gVar = new g(i45, i42, '`');
                                            }
                                            if (gVar != null) {
                                                tVar2 = new t(new c10.a[]{gVar});
                                                tVar2.f22991b = gVar.f54402a.f58427h.intValue() + i15;
                                                tVar = tVar2;
                                            }
                                            if (tVar == null) {
                                                aVar3 = aVar;
                                                i25 = 0;
                                                i31 = 4;
                                            }
                                        }
                                        tVar = null;
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        if (this.f54390h >= 4) {
                                            tVar = null;
                                        } else {
                                            a10.e eVar4 = this.f54383a;
                                            int i47 = this.f54388f;
                                            CharSequence charSequence4 = eVar4.f289a;
                                            if (charSequence4.charAt(i47) == '#') {
                                                a10.e eVarA = eVar4.a(i47, charSequence4.length());
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(eVarA);
                                                b10.b bVar = new b10.b(arrayList5);
                                                int i48 = bVar.i('#');
                                                if (i48 == 0 || i48 > 6) {
                                                    i19 = i33;
                                                } else {
                                                    if (bVar.f()) {
                                                        char cN = bVar.n();
                                                        if (cN != ' ') {
                                                            c11 = '\t';
                                                            if (cN != '\t') {
                                                                i19 = 0;
                                                            }
                                                        } else {
                                                            c11 = '\t';
                                                        }
                                                        bVar.q();
                                                        a9.e eVarO = bVar.o();
                                                        a9.e eVarO2 = eVarO;
                                                        boolean z17 = true;
                                                        while (bVar.f()) {
                                                            char cN2 = bVar.n();
                                                            if (cN2 == c11 || cN2 == ' ') {
                                                                c12 = '#';
                                                                bVar.k();
                                                                z17 = true;
                                                            } else {
                                                                c12 = '#';
                                                                if (cN2 != '#') {
                                                                    bVar.k();
                                                                    eVarO2 = bVar.o();
                                                                    z17 = false;
                                                                } else if (z17) {
                                                                    bVar.i('#');
                                                                    int iQ = bVar.q();
                                                                    if (bVar.f()) {
                                                                        eVarO2 = bVar.o();
                                                                    }
                                                                    z17 = iQ > 0;
                                                                } else {
                                                                    bVar.k();
                                                                    eVarO2 = bVar.o();
                                                                }
                                                            }
                                                            c11 = '\t';
                                                        }
                                                        a10.f fVarE = bVar.e(eVarO, eVarO2);
                                                        if (fVarE.e().isEmpty()) {
                                                            i19 = 0;
                                                            hVar = new h(i48, new a10.f(0));
                                                        } else {
                                                            i19 = 0;
                                                            hVar = new h(i48, fVarE);
                                                        }
                                                    } else {
                                                        hVar = new h(i48, new a10.f(i33));
                                                        i19 = 0;
                                                    }
                                                    if (hVar != null) {
                                                        c10.a[] aVarArr = new c10.a[1];
                                                        aVarArr[i19] = hVar;
                                                        tVar = new t(aVarArr);
                                                        tVar.f22991b = charSequence4.length();
                                                    } else {
                                                        cCharAt2 = charSequence4.charAt(i47);
                                                        if (cCharAt2 == '-') {
                                                            length = charSequence4.length();
                                                            for (i16 = i47 + 1; i16 < length; i16++) {
                                                                if (charSequence4.charAt(i16) != '-') {
                                                                    length = i16;
                                                                    if (qx.p.G(charSequence4, length, charSequence4.length()) >= charSequence4.length()) {
                                                                        i17 = 2;
                                                                    } else {
                                                                        i17 = 0;
                                                                    }
                                                                }
                                                            }
                                                            if (qx.p.G(charSequence4, length, charSequence4.length()) >= charSequence4.length()) {
                                                                i17 = 2;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        } else if (cCharAt2 != '=') {
                                                            i17 = 0;
                                                        } else {
                                                            length2 = charSequence4.length();
                                                            for (i18 = i47 + 1; i18 < length2; i18++) {
                                                                if (charSequence4.charAt(i18) != '=') {
                                                                    length2 = i18;
                                                                    if (qx.p.G(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                                        i17 = 1;
                                                                    } else {
                                                                        i17 = 0;
                                                                    }
                                                                }
                                                            }
                                                            if (qx.p.G(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                                i17 = 1;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        }
                                                        if (i17 > 0) {
                                                            fVarD = dVar.d();
                                                            arrayList2 = fVarD.f291a;
                                                            if (arrayList2.isEmpty()) {
                                                                tVar = null;
                                                            } else {
                                                                tVar3 = new t(new c10.a[]{new h(i17, fVarD)});
                                                                tVar3.f22991b = charSequence4.length();
                                                                size = arrayList2.size();
                                                                if (size < 1) {
                                                                    throw new IllegalArgumentException("Lines must be >= 1");
                                                                }
                                                                tVar3.f22993d = size;
                                                                tVar = tVar3;
                                                            }
                                                        } else {
                                                            tVar = null;
                                                        }
                                                    }
                                                }
                                                hVar = null;
                                                if (hVar != null) {
                                                    c10.a[] aVarArr2 = new c10.a[1];
                                                    aVarArr2[i19] = hVar;
                                                    tVar = new t(aVarArr2);
                                                    tVar.f22991b = charSequence4.length();
                                                } else {
                                                    cCharAt2 = charSequence4.charAt(i47);
                                                    if (cCharAt2 == '-') {
                                                        length = charSequence4.length();
                                                        while (i16 < length) {
                                                            if (charSequence4.charAt(i16) != '-') {
                                                                length = i16;
                                                                if (qx.p.G(charSequence4, length, charSequence4.length()) >= charSequence4.length()) {
                                                                    i17 = 2;
                                                                } else {
                                                                    i17 = 0;
                                                                }
                                                            }
                                                        }
                                                        if (qx.p.G(charSequence4, length, charSequence4.length()) >= charSequence4.length()) {
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 0;
                                                        }
                                                    } else if (cCharAt2 != '=') {
                                                        i17 = 0;
                                                    } else {
                                                        length2 = charSequence4.length();
                                                        while (i18 < length2) {
                                                            if (charSequence4.charAt(i18) != '=') {
                                                                length2 = i18;
                                                                if (qx.p.G(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 0;
                                                                }
                                                            }
                                                        }
                                                        if (qx.p.G(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                            i17 = 1;
                                                        } else {
                                                            i17 = 0;
                                                        }
                                                    }
                                                    if (i17 > 0) {
                                                        fVarD = dVar.d();
                                                        arrayList2 = fVarD.f291a;
                                                        if (arrayList2.isEmpty()) {
                                                            tVar3 = new t(new c10.a[]{new h(i17, fVarD)});
                                                            tVar3.f22991b = charSequence4.length();
                                                            size = arrayList2.size();
                                                            if (size < 1) {
                                                                throw new IllegalArgumentException("Lines must be >= 1");
                                                            }
                                                            tVar3.f22993d = size;
                                                            tVar = tVar3;
                                                        } else {
                                                            tVar = null;
                                                        }
                                                    } else {
                                                        tVar = null;
                                                    }
                                                }
                                            } else {
                                                cCharAt2 = charSequence4.charAt(i47);
                                                if (cCharAt2 == '-') {
                                                    length = charSequence4.length();
                                                    while (i16 < length) {
                                                        if (charSequence4.charAt(i16) != '-') {
                                                            length = i16;
                                                            if (qx.p.G(charSequence4, length, charSequence4.length()) >= charSequence4.length()) {
                                                                i17 = 2;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        }
                                                    }
                                                    if (qx.p.G(charSequence4, length, charSequence4.length()) >= charSequence4.length()) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                } else if (cCharAt2 != '=') {
                                                    i17 = 0;
                                                } else {
                                                    length2 = charSequence4.length();
                                                    while (i18 < length2) {
                                                        if (charSequence4.charAt(i18) != '=') {
                                                            length2 = i18;
                                                            if (qx.p.G(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                                i17 = 1;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        }
                                                    }
                                                    if (qx.p.G(charSequence4, length2, charSequence4.length()) >= charSequence4.length()) {
                                                        i17 = 1;
                                                    } else {
                                                        i17 = 0;
                                                    }
                                                }
                                                if (i17 > 0) {
                                                    fVarD = dVar.d();
                                                    arrayList2 = fVarD.f291a;
                                                    if (arrayList2.isEmpty()) {
                                                        tVar3 = new t(new c10.a[]{new h(i17, fVarD)});
                                                        tVar3.f22991b = charSequence4.length();
                                                        size = arrayList2.size();
                                                        if (size < 1) {
                                                            throw new IllegalArgumentException("Lines must be >= 1");
                                                        }
                                                        tVar3.f22993d = size;
                                                        tVar = tVar3;
                                                    } else {
                                                        tVar = null;
                                                    }
                                                } else {
                                                    tVar = null;
                                                }
                                            }
                                        }
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i49 = this.f54388f;
                                        CharSequence charSequence5 = this.f54383a.f289a;
                                        if (this.f54390h >= 4 || charSequence5.charAt(i49) != '<') {
                                            tVar = null;
                                        } else {
                                            int i50 = 1;
                                            while (true) {
                                                if (i50 <= 7) {
                                                    if (i50 != 7 || (!(((c10.a) obj).f() instanceof w) && !g().d())) {
                                                        Pattern[] patternArr = i.f54410e[i50];
                                                        Pattern pattern = patternArr[i33];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence5.subSequence(i49, charSequence5.length())).find()) {
                                                            c10.a[] aVarArr3 = new c10.a[1];
                                                            aVarArr3[i33] = new i(pattern2);
                                                            tVar = new t(aVarArr3);
                                                            tVar.f22991b = this.f54385c;
                                                        }
                                                    }
                                                    i50++;
                                                } else {
                                                    tVar = null;
                                                }
                                            }
                                        }
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        if (this.f54390h < 4 || this.f54391i || (g().f() instanceof w)) {
                                            tVar = null;
                                        } else {
                                            c10.a[] aVarArr4 = new c10.a[1];
                                            aVarArr4[i33] = new h();
                                            tVar = new t(aVarArr4);
                                            tVar.f22992c = this.f54386d + 4;
                                        }
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    case 6:
                                        c10.a aVar4 = (c10.a) obj;
                                        int i51 = this.f54390h;
                                        if (i51 < 4) {
                                            int i52 = this.f54388f;
                                            int i53 = this.f54386d + i51;
                                            boolean zIsEmpty = dVar.d().f291a.isEmpty();
                                            CharSequence charSequence6 = this.f54383a.f289a;
                                            char cCharAt7 = charSequence6.charAt(i52);
                                            if (cCharAt7 == '*' || cCharAt7 == '+' || cCharAt7 == '-') {
                                                z13 = zIsEmpty;
                                                aVar = aVar3;
                                                i21 = i53;
                                                int i54 = i52 + 1;
                                                if (i54 >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i54)) == '\t' || cCharAt3 == ' ') {
                                                    z00.c cVar2 = new z00.c();
                                                    cVar2.f58421g = String.valueOf(cCharAt7);
                                                    nVar = new n(cVar2, i54);
                                                } else {
                                                    nVar = null;
                                                }
                                            } else {
                                                int length4 = charSequence6.length();
                                                z13 = zIsEmpty;
                                                int i55 = i52;
                                                int i56 = i33;
                                                while (true) {
                                                    aVar = aVar3;
                                                    if (i55 < length4) {
                                                        char cCharAt8 = charSequence6.charAt(i55);
                                                        i21 = i53;
                                                        if (cCharAt8 != ')' && cCharAt8 != '.') {
                                                            switch (cCharAt8) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i56++;
                                                                    if (i56 <= 9) {
                                                                        i55++;
                                                                        aVar3 = aVar;
                                                                        i53 = i21;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i56 >= 1 && ((i23 = i55 + 1) >= charSequence6.length() || (cCharAt4 = charSequence6.charAt(i23)) == '\t' || cCharAt4 == ' ')) {
                                                            String string = charSequence6.subSequence(i52, i55).toString();
                                                            v vVar = new v();
                                                            vVar.f58452h = Integer.valueOf(Integer.parseInt(string));
                                                            vVar.f58451g = String.valueOf(cCharAt8);
                                                            nVar = new n(vVar, i23);
                                                        }
                                                    } else {
                                                        i21 = i53;
                                                    }
                                                    nVar = null;
                                                }
                                            }
                                            if (nVar == null) {
                                                nVar2 = null;
                                            } else {
                                                z00.r rVar = nVar.f54437a;
                                                int i57 = nVar.f54438b;
                                                int i58 = (i57 - i52) + i21;
                                                int length5 = charSequence6.length();
                                                int i59 = i58;
                                                while (true) {
                                                    if (i57 < length5) {
                                                        char cCharAt9 = charSequence6.charAt(i57);
                                                        int i60 = i57;
                                                        if (cCharAt9 == '\t') {
                                                            i59 = (4 - (i59 % 4)) + i59;
                                                        } else if (cCharAt9 == ' ') {
                                                            i59++;
                                                        } else {
                                                            i22 = 1;
                                                        }
                                                        i57 = i60 + 1;
                                                    } else {
                                                        i22 = i33;
                                                    }
                                                }
                                                if (z13 || ((!(rVar instanceof v) || ((v) rVar).f58452h.intValue() == 1) && i22 != 0)) {
                                                    if (i22 == 0 || i59 - i58 > 4) {
                                                        i59 = i58 + 1;
                                                    }
                                                    nVar2 = new n(rVar, i59);
                                                } else {
                                                    nVar2 = null;
                                                }
                                            }
                                            if (nVar2 != null) {
                                                z00.r rVar2 = nVar2.f54437a;
                                                int i61 = nVar2.f54438b;
                                                p pVar = new p(i61 - this.f54386d);
                                                if (aVar4 instanceof o) {
                                                    z00.r rVar3 = ((o) aVar4).f54439a;
                                                    if ((rVar3 instanceof z00.c) && (rVar2 instanceof z00.c)) {
                                                        zEquals2 = Objects.equals(((z00.c) rVar3).f58421g, ((z00.c) rVar2).f58421g);
                                                    } else if ((rVar3 instanceof v) && (rVar2 instanceof v)) {
                                                        zEquals = Objects.equals(((v) rVar3).f58451g, ((v) rVar2).f58451g);
                                                    } else {
                                                        r9 = i33;
                                                    }
                                                    if (r9 == 0) {
                                                        r9 = zEquals;
                                                        r9 = zEquals2;
                                                        o oVar = new o(rVar2);
                                                        c10.a[] aVarArr5 = new c10.a[2];
                                                        aVarArr5[i33] = oVar;
                                                        aVarArr5[1] = pVar;
                                                        tVar2 = new t(aVarArr5);
                                                        tVar2.f22992c = i61;
                                                    } else {
                                                        r9 = zEquals;
                                                        r9 = zEquals2;
                                                        c10.a[] aVarArr6 = new c10.a[1];
                                                        aVarArr6[i33] = pVar;
                                                        tVar2 = new t(aVarArr6);
                                                        tVar2.f22992c = i61;
                                                    }
                                                } else {
                                                    r9 = zEquals;
                                                    r9 = zEquals2;
                                                    o oVar2 = new o(rVar2);
                                                    c10.a[] aVarArr7 = new c10.a[2];
                                                    aVarArr7[i33] = oVar2;
                                                    aVarArr7[1] = pVar;
                                                    tVar2 = new t(aVarArr7);
                                                    tVar2.f22992c = i61;
                                                }
                                                tVar = tVar2;
                                            }
                                            if (tVar == null) {
                                                aVar3 = aVar;
                                                i25 = 0;
                                                i31 = 4;
                                            }
                                        } else {
                                            aVar = aVar3;
                                        }
                                        tVar = null;
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                    default:
                                        if (this.f54390h >= i31) {
                                            tVar = null;
                                        } else {
                                            int i62 = this.f54388f;
                                            CharSequence charSequence7 = this.f54383a.f289a;
                                            int length6 = charSequence7.length();
                                            int i63 = i33;
                                            int i64 = i63;
                                            int i65 = i64;
                                            while (true) {
                                                if (i62 >= length6) {
                                                    int i66 = i63;
                                                    int i67 = i64;
                                                    int i68 = i65;
                                                    if ((i66 >= 3 && i67 == 0 && i68 == 0) || ((i67 >= 3 && i66 == 0 && i68 == 0) || (i68 >= 3 && i66 == 0 && i67 == 0))) {
                                                        String.valueOf(charSequence7.subSequence(this.f54385c, charSequence7.length()));
                                                        c10.a[] aVarArr8 = new c10.a[1];
                                                        aVarArr8[i33] = new c(1);
                                                        tVar = new t(aVarArr8);
                                                        tVar.f22991b = charSequence7.length();
                                                    }
                                                } else {
                                                    char cCharAt10 = charSequence7.charAt(i62);
                                                    if (cCharAt10 == c14 || cCharAt10 == c13) {
                                                        i24 = i63;
                                                        i64 = i64;
                                                        i65 = i65;
                                                    } else if (cCharAt10 != '*') {
                                                        if (cCharAt10 == '-') {
                                                            i63++;
                                                        } else if (cCharAt10 == '_') {
                                                            i64++;
                                                        }
                                                        i24 = i63;
                                                    } else {
                                                        i24 = i63;
                                                        i65++;
                                                    }
                                                    i62++;
                                                    i63 = i24;
                                                    c14 = '\t';
                                                    c13 = ' ';
                                                }
                                                tVar = null;
                                            }
                                        }
                                        aVar = aVar3;
                                        if (tVar == null) {
                                            aVar3 = aVar;
                                            i25 = 0;
                                            i31 = 4;
                                        }
                                        break;
                                }
                            } else {
                                aVar = aVar3;
                                tVar = null;
                            }
                        }
                        if (tVar == null) {
                            j(this.f54388f);
                        } else {
                            int i69 = this.f54385c;
                            if (size2 > 0) {
                                e(size2);
                                size2 = 0;
                            }
                            int i70 = tVar.f22991b;
                            if (i70 != -1) {
                                j(i70);
                            } else {
                                int i71 = tVar.f22992c;
                                if (i71 != -1) {
                                    i(i71);
                                }
                            }
                            if (tVar.f22993d < 1) {
                                i12 = 0;
                                listUnmodifiableList = null;
                            } else {
                                c10.a aVarG = g();
                                if (aVarG instanceof q) {
                                    int i72 = tVar.f22993d;
                                    m mVar = ((q) aVarG).f54446b;
                                    mVar.getClass();
                                    ArrayList arrayList6 = mVar.f54431d;
                                    i12 = 0;
                                    listUnmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList6.subList(Math.max(arrayList6.size() - i72, 0), arrayList6.size())));
                                    ArrayList arrayList7 = mVar.f54429b;
                                    if (i72 >= arrayList7.size()) {
                                        arrayList7.clear();
                                    } else {
                                        for (int i73 = 0; i73 < i72; i73++) {
                                            arrayList7.remove(arrayList7.size() - 1);
                                        }
                                    }
                                    if (i72 >= arrayList6.size()) {
                                        arrayList6.clear();
                                    } else {
                                        for (int i74 = 0; i74 < i72; i74++) {
                                            arrayList6.remove(arrayList6.size() - 1);
                                        }
                                    }
                                    e(1);
                                } else {
                                    i12 = 0;
                                    listUnmodifiableList = null;
                                }
                            }
                            c10.a[] aVarArr9 = (c10.a[]) tVar.f22994e;
                            int length7 = aVarArr9.length;
                            int i75 = i12;
                            while (i75 < length7) {
                                c10.a aVar5 = aVarArr9[i75];
                                a(new e(aVar5, i69));
                                if (listUnmodifiableList != null) {
                                    aVar5.f().g(listUnmodifiableList);
                                }
                                i75++;
                                aVar = aVar5;
                                zH = aVar5.h();
                            }
                            i25 = i12;
                            aVar3 = aVar;
                            z14 = true;
                        }
                    }
                }
                aVar = aVar3;
                j(this.f54388f);
            } else {
                aVar = aVar3;
            }
            if (!z14 && !this.f54391i && g().d()) {
                ((e) nv.p.f(1, arrayList)).f54380b = i30;
                b();
                return;
            }
            if (size2 > 0) {
                e(size2);
            }
            if (!aVar.h()) {
                b();
                return;
            } else if (this.f54391i) {
                c();
                return;
            } else {
                a(new e(new q(), i30));
                b();
                return;
            }
        }
    }

    public final void i(int i11) {
        int i12;
        int i13 = this.f54389g;
        if (i11 >= i13) {
            this.f54385c = this.f54388f;
            this.f54386d = i13;
        }
        int length = this.f54383a.f289a.length();
        while (true) {
            i12 = this.f54386d;
            if (i12 >= i11 || this.f54385c == length) {
                break;
            } else {
                d();
            }
        }
        if (i12 <= i11) {
            this.f54387e = false;
            return;
        }
        this.f54385c--;
        this.f54386d = i11;
        this.f54387e = true;
    }

    public final void j(int i11) {
        int i12 = this.f54388f;
        if (i11 >= i12) {
            this.f54385c = i12;
            this.f54386d = this.f54389g;
        }
        int length = this.f54383a.f289a.length();
        while (true) {
            int i13 = this.f54385c;
            if (i13 >= i11 || i13 == length) {
                break;
            } else {
                d();
            }
        }
        this.f54387e = false;
    }
}
