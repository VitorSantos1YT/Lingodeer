package d4;

import com.yalantis.ucrop.view.CropImageView;
import e4.q;
import e4.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    public final b4.c A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public b[] F0;
    public b[] G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public WeakReference K0;
    public WeakReference L0;
    public WeakReference M0;
    public WeakReference N0;
    public final HashSet O0;
    public final e4.b P0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f23161u0 = new ArrayList();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ob.m f23162v0 = new ob.m(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final e4.e f23163w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f23164x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public j4.f f23165y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f23166z0;

    public h() {
        e4.e eVar = new e4.e();
        eVar.f24791b = true;
        eVar.f24792c = true;
        eVar.f24795f = new ArrayList();
        new ArrayList();
        eVar.f24797h = null;
        eVar.f24798i = new e4.b();
        eVar.f24796g = new ArrayList();
        eVar.f24793d = this;
        eVar.f24794e = this;
        this.f23163w0 = eVar;
        this.f23165y0 = null;
        this.f23166z0 = false;
        this.A0 = new b4.c();
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = new b[4];
        this.G0 = new b[4];
        this.H0 = 257;
        this.I0 = false;
        this.J0 = false;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = new HashSet();
        this.P0 = new e4.b();
    }

    public static void W(g gVar, j4.f fVar, e4.b bVar) {
        int i11;
        int i12;
        if (fVar == null) {
            return;
        }
        int i13 = gVar.f23133i0;
        int[] iArr = gVar.f23153t;
        if (i13 == 8 || (gVar instanceof l) || (gVar instanceof a)) {
            bVar.f24782e = 0;
            bVar.f24783f = 0;
            return;
        }
        f[] fVarArr = gVar.U;
        bVar.f24778a = fVarArr[0];
        bVar.f24779b = fVarArr[1];
        bVar.f24780c = gVar.r();
        bVar.f24781d = gVar.l();
        bVar.f24786i = false;
        bVar.f24787j = 0;
        f fVar2 = bVar.f24778a;
        f fVar3 = f.MATCH_CONSTRAINT;
        boolean z11 = fVar2 == fVar3;
        boolean z12 = bVar.f24779b == fVar3;
        boolean z13 = z11 && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
        boolean z14 = z12 && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
        if (z11 && gVar.u(0) && gVar.f23149r == 0 && !z13) {
            bVar.f24778a = f.WRAP_CONTENT;
            if (z12 && gVar.f23151s == 0) {
                bVar.f24778a = f.FIXED;
            }
            z11 = false;
        }
        if (z12 && gVar.u(1) && gVar.f23151s == 0 && !z14) {
            bVar.f24779b = f.WRAP_CONTENT;
            if (z11 && gVar.f23149r == 0) {
                bVar.f24779b = f.FIXED;
            }
            z12 = false;
        }
        if (gVar.B()) {
            bVar.f24778a = f.FIXED;
            z11 = false;
        }
        if (gVar.C()) {
            bVar.f24779b = f.FIXED;
            z12 = false;
        }
        if (z13) {
            if (iArr[0] == 4) {
                bVar.f24778a = f.FIXED;
            } else if (!z12) {
                f fVar4 = bVar.f24779b;
                f fVar5 = f.FIXED;
                if (fVar4 == fVar5) {
                    i12 = bVar.f24781d;
                } else {
                    bVar.f24778a = f.WRAP_CONTENT;
                    fVar.b(gVar, bVar);
                    i12 = bVar.f24783f;
                }
                bVar.f24778a = fVar5;
                bVar.f24780c = (int) (gVar.Y * i12);
            }
        }
        if (z14) {
            if (iArr[1] == 4) {
                bVar.f24779b = f.FIXED;
            } else if (!z11) {
                f fVar6 = bVar.f24778a;
                f fVar7 = f.FIXED;
                if (fVar6 == fVar7) {
                    i11 = bVar.f24780c;
                } else {
                    bVar.f24779b = f.WRAP_CONTENT;
                    fVar.b(gVar, bVar);
                    i11 = bVar.f24782e;
                }
                bVar.f24779b = fVar7;
                if (gVar.Z == -1) {
                    bVar.f24781d = (int) (i11 / gVar.Y);
                } else {
                    bVar.f24781d = (int) (gVar.Y * i11);
                }
            }
        }
        fVar.b(gVar, bVar);
        gVar.P(bVar.f24782e);
        gVar.M(bVar.f24783f);
        gVar.E = bVar.f24785h;
        gVar.J(bVar.f24784g);
        bVar.f24787j = 0;
    }

    @Override // d4.g
    public final void D() {
        this.A0.t();
        this.B0 = 0;
        this.C0 = 0;
        this.f23161u0.clear();
        super.D();
    }

    @Override // d4.g
    public final void G(xq.c cVar) {
        super.G(cVar);
        int size = this.f23161u0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((g) this.f23161u0.get(i11)).G(cVar);
        }
    }

    @Override // d4.g
    public final void Q(boolean z11, boolean z12) {
        super.Q(z11, z12);
        int size = this.f23161u0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((g) this.f23161u0.get(i11)).Q(z11, z12);
        }
    }

    public final void S(g gVar, int i11) {
        if (i11 == 0) {
            int i12 = this.D0 + 1;
            b[] bVarArr = this.G0;
            if (i12 >= bVarArr.length) {
                this.G0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.G0;
            int i13 = this.D0;
            bVarArr2[i13] = new b(gVar, 0, this.f23166z0);
            this.D0 = i13 + 1;
            return;
        }
        if (i11 == 1) {
            int i14 = this.E0 + 1;
            b[] bVarArr3 = this.F0;
            if (i14 >= bVarArr3.length) {
                this.F0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.F0;
            int i15 = this.E0;
            bVarArr4[i15] = new b(gVar, 1, this.f23166z0);
            this.E0 = i15 + 1;
        }
    }

    public final void T(b4.c cVar) {
        h hVar;
        b4.c cVar2;
        boolean zX = X(64);
        b(cVar, zX);
        int size = this.f23161u0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f23161u0.get(i11);
            boolean[] zArr = gVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (gVar instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                g gVar2 = (g) this.f23161u0.get(i12);
                if (gVar2 instanceof a) {
                    a aVar = (a) gVar2;
                    for (int i13 = 0; i13 < aVar.f23196v0; i13++) {
                        g gVar3 = aVar.f23195u0[i13];
                        if (aVar.f23087x0 || gVar3.c()) {
                            int i14 = aVar.f23086w0;
                            if (i14 == 0 || i14 == 1) {
                                gVar3.T[0] = true;
                            } else if (i14 == 2 || i14 == 3) {
                                gVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.O0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar4 = (g) this.f23161u0.get(i15);
            gVar4.getClass();
            boolean z12 = gVar4 instanceof p;
            if (z12 || (gVar4 instanceof l)) {
                if (z12) {
                    hashSet.add(gVar4);
                } else {
                    gVar4.b(cVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                p pVar = (p) ((g) it.next());
                for (int i16 = 0; i16 < pVar.f23196v0; i16++) {
                    if (hashSet.contains(pVar.f23195u0[i16])) {
                        pVar.b(cVar, zX);
                        hashSet.remove(pVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b(cVar, zX);
                }
                hashSet.clear();
            }
        }
        if (b4.c.f3892q) {
            HashSet<g> hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                g gVar5 = (g) this.f23161u0.get(i17);
                gVar5.getClass();
                if (!(gVar5 instanceof p) && !(gVar5 instanceof l)) {
                    hashSet2.add(gVar5);
                }
            }
            hVar = this;
            cVar2 = cVar;
            hVar.a(this, cVar2, hashSet2, this.U[0] == f.WRAP_CONTENT ? 0 : 1, false);
            for (g gVar6 : hashSet2) {
                n.b(this, cVar2, gVar6);
                gVar6.b(cVar2, zX);
            }
        } else {
            hVar = this;
            cVar2 = cVar;
            for (int i18 = 0; i18 < size; i18++) {
                g gVar7 = (g) hVar.f23161u0.get(i18);
                if (gVar7 instanceof h) {
                    f[] fVarArr = gVar7.U;
                    f fVar = fVarArr[0];
                    f fVar2 = fVarArr[1];
                    f fVar3 = f.WRAP_CONTENT;
                    if (fVar == fVar3) {
                        gVar7.N(f.FIXED);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.O(f.FIXED);
                    }
                    gVar7.b(cVar2, zX);
                    if (fVar == fVar3) {
                        gVar7.N(fVar);
                    }
                    if (fVar2 == fVar3) {
                        gVar7.O(fVar2);
                    }
                } else {
                    n.b(this, cVar2, gVar7);
                    if (!(gVar7 instanceof p) && !(gVar7 instanceof l)) {
                        gVar7.b(cVar2, zX);
                    }
                }
            }
        }
        if (hVar.D0 > 0) {
            n.a(this, cVar2, null, 0);
        }
        if (hVar.E0 > 0) {
            n.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    public final boolean U(int i11, boolean z11) {
        boolean z12;
        f fVar;
        e4.e eVar = this.f23163w0;
        ArrayList arrayList = (ArrayList) eVar.f24795f;
        h hVar = (h) eVar.f24793d;
        boolean z13 = false;
        f fVarK = hVar.k(0);
        f fVarK2 = hVar.k(1);
        int iS = hVar.s();
        int iT = hVar.t();
        if (z11 && (fVarK == (fVar = f.WRAP_CONTENT) || fVarK2 == fVar)) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                t tVar = (t) obj;
                if (tVar.f24831f == i11 && !tVar.k()) {
                    z11 = false;
                    break;
                }
            }
            if (i11 == 0) {
                if (z11 && fVarK == f.WRAP_CONTENT) {
                    hVar.N(f.FIXED);
                    hVar.P(eVar.d(hVar, 0));
                    hVar.f23122d.f24830e.d(hVar.r());
                }
            } else if (z11 && fVarK2 == f.WRAP_CONTENT) {
                hVar.O(f.FIXED);
                hVar.M(eVar.d(hVar, 1));
                hVar.f23124e.f24830e.d(hVar.l());
            }
        }
        if (i11 == 0) {
            f fVar2 = hVar.U[0];
            if (fVar2 == f.FIXED || fVar2 == f.MATCH_PARENT) {
                int iR = hVar.r() + iS;
                hVar.f23122d.f24834i.d(iR);
                hVar.f23122d.f24830e.d(iR - iS);
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            f fVar3 = hVar.U[1];
            if (fVar3 == f.FIXED || fVar3 == f.MATCH_PARENT) {
                int iL = hVar.l() + iT;
                hVar.f23124e.f24834i.d(iL);
                hVar.f23124e.f24830e.d(iL - iT);
                z12 = true;
            } else {
                z12 = false;
            }
        }
        eVar.g();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            t tVar2 = (t) obj2;
            if (tVar2.f24831f == i11 && (tVar2.f24827b != hVar || tVar2.f24832g)) {
                tVar2.e();
            }
        }
        int size3 = arrayList.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            t tVar3 = (t) obj3;
            if (tVar3.f24831f == i11 && (z12 || tVar3.f24827b != hVar)) {
                if (!tVar3.f24833h.f24808j || !tVar3.f24834i.f24808j || (!(tVar3 instanceof e4.c) && !tVar3.f24830e.f24808j)) {
                    hVar.N(fVarK);
                    hVar.O(fVarK2);
                    return z13;
                }
            }
        }
        z13 = true;
        hVar.N(fVarK);
        hVar.O(fVarK2);
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:333:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:346:0x0616  */
    /* JADX WARN: Code duplicated, block: B:362:0x0649  */
    /* JADX WARN: Code duplicated, block: B:367:0x065f  */
    /* JADX WARN: Code duplicated, block: B:377:0x067a  */
    /* JADX WARN: Code duplicated, block: B:382:0x068b  */
    /* JADX WARN: Code duplicated, block: B:389:0x069d  */
    /* JADX WARN: Code duplicated, block: B:392:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:394:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:398:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:401:0x06d6 A[Catch: Exception -> 0x06e4, LOOP:12: B:400:0x06d4->B:401:0x06d6, LOOP_END, TryCatch #5 {Exception -> 0x06e4, blocks: (B:399:0x06c8, B:401:0x06d6, B:404:0x06ec), top: B:527:0x06c8 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0725  */
    /* JADX WARN: Code duplicated, block: B:424:0x072d A[Catch: Exception -> 0x0716, TryCatch #4 {Exception -> 0x0716, blocks: (B:413:0x070f, B:422:0x0729, B:424:0x072d, B:426:0x0733, B:427:0x074c, B:429:0x0750, B:431:0x0756, B:435:0x076b, B:438:0x0776, B:440:0x077a, B:442:0x0780), top: B:525:0x070f }] */
    /* JADX WARN: Code duplicated, block: B:429:0x0750 A[Catch: Exception -> 0x0716, TryCatch #4 {Exception -> 0x0716, blocks: (B:413:0x070f, B:422:0x0729, B:424:0x072d, B:426:0x0733, B:427:0x074c, B:429:0x0750, B:431:0x0756, B:435:0x076b, B:438:0x0776, B:440:0x077a, B:442:0x0780), top: B:525:0x070f }] */
    /* JADX WARN: Code duplicated, block: B:438:0x0776 A[Catch: Exception -> 0x0716, PHI: r22
      0x0776: PHI (r22v7 d4.d) = (r22v2 d4.d), (r22v2 d4.d), (r22v9 d4.d) binds: [B:428:0x074e, B:430:0x0754, B:435:0x076b] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x0716, blocks: (B:413:0x070f, B:422:0x0729, B:424:0x072d, B:426:0x0733, B:427:0x074c, B:429:0x0750, B:431:0x0756, B:435:0x076b, B:438:0x0776, B:440:0x077a, B:442:0x0780), top: B:525:0x070f }] */
    /* JADX WARN: Code duplicated, block: B:440:0x077a A[Catch: Exception -> 0x0716, TryCatch #4 {Exception -> 0x0716, blocks: (B:413:0x070f, B:422:0x0729, B:424:0x072d, B:426:0x0733, B:427:0x074c, B:429:0x0750, B:431:0x0756, B:435:0x076b, B:438:0x0776, B:440:0x077a, B:442:0x0780), top: B:525:0x070f }] */
    /* JADX WARN: Code duplicated, block: B:450:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:456:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:458:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:460:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:462:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:465:0x0804  */
    /* JADX WARN: Code duplicated, block: B:467:0x080d A[LOOP:15: B:466:0x080b->B:467:0x080d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:471:0x0821 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:486:0x088d  */
    /* JADX WARN: Code duplicated, block: B:489:0x089f  */
    /* JADX WARN: Code duplicated, block: B:492:0x08be  */
    /* JADX WARN: Code duplicated, block: B:493:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:495:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:497:0x08da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:500:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:503:0x08f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:507:0x0910 A[PHI: r19 r21
      0x0910: PHI (r19v8 ??) = (r19v7 ??), (r19v11 ??), (r19v11 ??), (r19v11 ??) binds: [B:494:0x08ce, B:502:0x08f5, B:503:0x08f7, B:505:0x08fd] A[DONT_GENERATE, DONT_INLINE]
      0x0910: PHI (r21v8 boolean) = (r21v7 boolean), (r21v9 boolean), (r21v9 boolean), (r21v9 boolean) binds: [B:494:0x08ce, B:502:0x08f5, B:503:0x08f7, B:505:0x08fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:509:0x0916  */
    /* JADX WARN: Code duplicated, block: B:510:0x0918  */
    /* JADX WARN: Code duplicated, block: B:514:0x0927  */
    /* JADX WARN: Code duplicated, block: B:577:0x06b8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v43 */
    /* JADX WARN: Type inference failed for: r19v44 */
    /* JADX WARN: Type inference failed for: r19v45 */
    /* JADX WARN: Type inference failed for: r19v46 */
    /* JADX WARN: Type inference failed for: r19v47 */
    /* JADX WARN: Type inference failed for: r19v48 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [d4.g, d4.h] */
    public final void V() {
        int i11;
        int i12;
        f fVar;
        f fVar2;
        d dVar;
        d dVar2;
        int i13;
        int iL;
        int iR;
        boolean z11;
        boolean z12;
        char c11;
        f fVar3;
        f fVar4;
        boolean z13;
        int i14;
        int i15;
        boolean zX;
        boolean z14;
        int i16;
        ?? r12;
        boolean z15;
        int i17;
        boolean z16;
        d dVar3;
        ?? r23;
        boolean[] zArr;
        boolean[] zArr2;
        int i18;
        boolean z17;
        int iMax;
        boolean z18;
        int iMax2;
        ?? r11;
        ?? r19;
        int i19;
        ?? r110;
        ?? r13;
        f fVar5;
        f fVar6;
        boolean zX2;
        int size;
        int i21;
        boolean z19;
        g gVar;
        ?? r14;
        int i22;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        g gVar2;
        f fVar7;
        int i23;
        int i24;
        f fVar8;
        f fVar9;
        q qVar;
        q qVar2;
        int i25;
        int i26;
        int iB;
        int iB2;
        q qVar3;
        q qVar4;
        int i27;
        int i28;
        this.f23117a0 = 0;
        this.f23119b0 = 0;
        this.I0 = false;
        this.J0 = false;
        int size2 = this.f23161u0.size();
        int iMax3 = Math.max(0, r());
        int iMax4 = Math.max(0, l());
        f[] fVarArr = this.U;
        f fVar10 = fVarArr[1];
        f fVar11 = fVarArr[0];
        int i29 = this.f23164x0;
        d dVar4 = this.K;
        d dVar5 = this.J;
        if (i29 == 0 && n.c(this.H0, 1)) {
            j4.f fVar12 = this.f23165y0;
            f[] fVarArr2 = this.U;
            f fVar13 = fVarArr2[0];
            f fVar14 = fVarArr2[1];
            F();
            ArrayList arrayList = this.f23161u0;
            int size3 = arrayList.size();
            for (int i30 = 0; i30 < size3; i30++) {
                ((g) arrayList.get(i30)).F();
            }
            boolean z20 = this.f23166z0;
            if (fVar13 == f.FIXED) {
                K(0, r());
            } else {
                dVar5.l(0);
                this.f23117a0 = 0;
            }
            boolean z21 = false;
            int i31 = 0;
            boolean z22 = false;
            while (i31 < size3) {
                g gVar3 = (g) arrayList.get(i31);
                boolean z23 = z21;
                if (gVar3 instanceof l) {
                    l lVar = (l) gVar3;
                    i28 = i31;
                    if (lVar.f23193y0 == 1) {
                        int i32 = lVar.f23190v0;
                        if (i32 != -1) {
                            lVar.S(i32);
                        } else if (lVar.f23191w0 != -1 && B()) {
                            lVar.S(r() - lVar.f23191w0);
                        } else if (B()) {
                            lVar.S((int) ((lVar.f23189u0 * r()) + 0.5f));
                        }
                        z23 = true;
                    }
                } else {
                    i28 = i31;
                    if ((gVar3 instanceof a) && ((a) gVar3).W() == 0) {
                        z21 = z23;
                        z22 = true;
                    }
                    i31 = i28 + 1;
                }
                z21 = z23;
                i31 = i28 + 1;
            }
            if (z21) {
                for (int i33 = 0; i33 < size3; i33 = i27 + 1) {
                    g gVar4 = (g) arrayList.get(i33);
                    if (gVar4 instanceof l) {
                        l lVar2 = (l) gVar4;
                        i27 = i33;
                        if (lVar2.f23193y0 == 1) {
                            e4.i.c(0, lVar2, fVar12, z20);
                        }
                    } else {
                        i27 = i33;
                    }
                }
            }
            e4.i.c(0, this, fVar12, z20);
            if (z22) {
                for (int i34 = 0; i34 < size3; i34++) {
                    g gVar5 = (g) arrayList.get(i34);
                    if (gVar5 instanceof a) {
                        a aVar = (a) gVar5;
                        if (aVar.W() == 0 && aVar.V()) {
                            e4.i.c(1, aVar, fVar12, z20);
                        }
                    }
                }
            }
            if (fVar14 == f.FIXED) {
                L(0, l());
            } else {
                dVar4.l(0);
                this.f23119b0 = 0;
            }
            int i35 = 0;
            boolean z24 = false;
            boolean z25 = false;
            while (i35 < size3) {
                g gVar6 = (g) arrayList.get(i35);
                int i36 = i35;
                if (gVar6 instanceof l) {
                    l lVar3 = (l) gVar6;
                    if (lVar3.f23193y0 == 0) {
                        int i37 = lVar3.f23190v0;
                        if (i37 != -1) {
                            lVar3.S(i37);
                        } else if (lVar3.f23191w0 != -1 && C()) {
                            lVar3.S(l() - lVar3.f23191w0);
                        } else if (C()) {
                            lVar3.S((int) ((lVar3.f23189u0 * l()) + 0.5f));
                        }
                        z24 = true;
                    }
                } else if ((gVar6 instanceof a) && ((a) gVar6).W() == 1) {
                    z25 = true;
                }
                i35 = i36 + 1;
            }
            if (z24) {
                for (int i38 = 0; i38 < size3; i38++) {
                    g gVar7 = (g) arrayList.get(i38);
                    if (gVar7 instanceof l) {
                        l lVar4 = (l) gVar7;
                        if (lVar4.f23193y0 == 0) {
                            e4.i.i(1, lVar4, fVar12);
                        }
                    }
                }
            }
            e4.i.i(0, this, fVar12);
            if (z25) {
                for (int i39 = 0; i39 < size3; i39++) {
                    g gVar8 = (g) arrayList.get(i39);
                    if (gVar8 instanceof a) {
                        a aVar2 = (a) gVar8;
                        if (aVar2.W() == 1 && aVar2.V()) {
                            e4.i.i(1, aVar2, fVar12);
                        }
                    }
                }
            }
            for (int i40 = 0; i40 < size3; i40++) {
                g gVar9 = (g) arrayList.get(i40);
                if (gVar9.A() && e4.i.a(gVar9)) {
                    W(gVar9, fVar12, e4.i.f24811a);
                    if (!(gVar9 instanceof l)) {
                        e4.i.c(0, gVar9, fVar12, z20);
                        e4.i.i(0, gVar9, fVar12);
                    } else if (((l) gVar9).f23193y0 == 0) {
                        e4.i.i(0, gVar9, fVar12);
                    } else {
                        e4.i.c(0, gVar9, fVar12, z20);
                    }
                }
            }
            for (int i41 = 0; i41 < size2; i41++) {
                g gVar10 = (g) this.f23161u0.get(i41);
                if (gVar10.A() && !(gVar10 instanceof l) && !(gVar10 instanceof a) && !(gVar10 instanceof p) && !gVar10.G) {
                    f fVarK = gVar10.k(0);
                    f fVarK2 = gVar10.k(1);
                    f fVar15 = f.MATCH_CONSTRAINT;
                    if (fVarK != fVar15 || gVar10.f23149r == 1 || fVarK2 != fVar15 || gVar10.f23151s == 1) {
                        W(gVar10, this.f23165y0, new e4.b());
                    }
                }
            }
        }
        b4.c cVar = this.A0;
        if (size2 <= 2 || !((fVar11 == (fVar7 = f.WRAP_CONTENT) || fVar10 == fVar7) && n.c(this.H0, 1024))) {
            i11 = size2;
            i12 = iMax4;
            fVar = fVar11;
            fVar2 = fVar10;
            dVar = dVar4;
            dVar2 = dVar5;
            i13 = iMax3;
        } else {
            j4.f fVar16 = this.f23165y0;
            ArrayList arrayList2 = this.f23161u0;
            int size4 = arrayList2.size();
            int i42 = 0;
            while (true) {
                if (i42 < size4) {
                    g gVar11 = (g) arrayList2.get(i42);
                    f[] fVarArr3 = this.U;
                    f fVar17 = fVarArr3[0];
                    f fVar18 = fVarArr3[1];
                    int i43 = i42;
                    f[] fVarArr4 = gVar11.U;
                    dVar2 = dVar5;
                    if (e4.i.h(fVar17, fVar18, fVarArr4[0], fVarArr4[1]) && !(gVar11 instanceof j)) {
                        i42 = i43 + 1;
                        dVar5 = dVar2;
                    } else {
                        i23 = iMax3;
                        i11 = size2;
                        i24 = iMax4;
                        fVar8 = fVar11;
                        fVar9 = fVar10;
                        dVar = dVar4;
                    }
                } else {
                    dVar2 = dVar5;
                    i11 = size2;
                    dVar = dVar4;
                    ArrayList arrayList3 = null;
                    int i44 = 0;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i44 < size4) {
                        int i45 = i44;
                        g gVar12 = (g) arrayList2.get(i44);
                        int i46 = iMax4;
                        f[] fVarArr5 = this.U;
                        f fVar19 = fVarArr5[0];
                        f fVar20 = fVar10;
                        f fVar21 = fVarArr5[1];
                        int i47 = iMax3;
                        f[] fVarArr6 = gVar12.U;
                        f fVar22 = fVar11;
                        if (!e4.i.h(fVar19, fVar21, fVarArr6[0], fVarArr6[1])) {
                            W(gVar12, fVar16, this.P0);
                        }
                        boolean z26 = gVar12 instanceof l;
                        if (z26) {
                            l lVar5 = (l) gVar12;
                            if (lVar5.f23193y0 == 0) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(lVar5);
                            }
                            if (lVar5.f23193y0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(lVar5);
                            }
                        }
                        if (gVar12 instanceof m) {
                            if (gVar12 instanceof a) {
                                a aVar3 = (a) gVar12;
                                if (aVar3.W() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(aVar3);
                                }
                                if (aVar3.W() == 1) {
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(aVar3);
                                }
                            } else {
                                m mVar = (m) gVar12;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(mVar);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(mVar);
                            }
                        }
                        if (gVar12.J.f23111f == null && gVar12.L.f23111f == null && !z26 && !(gVar12 instanceof a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(gVar12);
                        }
                        if (gVar12.K.f23111f == null && gVar12.M.f23111f == null && gVar12.N.f23111f == null && !z26 && !(gVar12 instanceof a)) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(gVar12);
                        }
                        i44 = i45 + 1;
                        iMax4 = i46;
                        iMax3 = i47;
                        fVar10 = fVar20;
                        fVar11 = fVar22;
                    }
                    i23 = iMax3;
                    i24 = iMax4;
                    fVar8 = fVar11;
                    fVar9 = fVar10;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size5 = arrayList3.size();
                        int i48 = 0;
                        while (i48 < size5) {
                            Object obj = arrayList3.get(i48);
                            i48++;
                            e4.i.b((l) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size6 = arrayList4.size();
                        int i49 = 0;
                        while (i49 < size6) {
                            Object obj2 = arrayList4.get(i49);
                            i49++;
                            m mVar2 = (m) obj2;
                            q qVarB = e4.i.b(mVar2, 0, arrayList9, null);
                            mVar2.T(0, qVarB, arrayList9);
                            qVarB.a(arrayList9);
                        }
                    }
                    HashSet hashSet = j(c.LEFT).f23106a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            e4.i.b(((d) it.next()).f23109d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = j(c.RIGHT).f23106a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            e4.i.b(((d) it2.next()).f23109d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = j(c.CENTER).f23106a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            e4.i.b(((d) it3.next()).f23109d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size7 = arrayList8.size();
                        int i50 = 0;
                        while (i50 < size7) {
                            Object obj3 = arrayList8.get(i50);
                            i50++;
                            e4.i.b((g) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i51 = 0;
                        while (i51 < size8) {
                            Object obj4 = arrayList6.get(i51);
                            i51++;
                            e4.i.b((l) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i52 = 0;
                        while (i52 < size9) {
                            Object obj5 = arrayList7.get(i52);
                            i52++;
                            m mVar3 = (m) obj5;
                            q qVarB2 = e4.i.b(mVar3, 1, arrayList9, null);
                            mVar3.T(1, qVarB2, arrayList9);
                            qVarB2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = j(c.TOP).f23106a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            e4.i.b(((d) it4.next()).f23109d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = j(c.BASELINE).f23106a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            e4.i.b(((d) it5.next()).f23109d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = j(c.BOTTOM).f23106a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            e4.i.b(((d) it6.next()).f23109d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = j(c.CENTER).f23106a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            e4.i.b(((d) it7.next()).f23109d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size10 = arrayList5.size();
                        int i53 = 0;
                        while (i53 < size10) {
                            Object obj6 = arrayList5.get(i53);
                            i53++;
                            e4.i.b((g) obj6, 1, arrayList9, null);
                        }
                    }
                    for (int i54 = 0; i54 < size4; i54++) {
                        g gVar13 = (g) arrayList2.get(i54);
                        f[] fVarArr7 = gVar13.U;
                        f fVar23 = fVarArr7[0];
                        f fVar24 = f.MATCH_CONSTRAINT;
                        if (fVar23 == fVar24 && fVarArr7[1] == fVar24) {
                            int i55 = gVar13.f23152s0;
                            int size11 = arrayList9.size();
                            int i56 = 0;
                            while (true) {
                                if (i56 >= size11) {
                                    qVar3 = null;
                                    break;
                                }
                                qVar3 = (q) arrayList9.get(i56);
                                if (i55 == qVar3.f24821b) {
                                    break;
                                } else {
                                    i56++;
                                }
                            }
                            int i57 = gVar13.f23154t0;
                            int size12 = arrayList9.size();
                            int i58 = 0;
                            while (true) {
                                if (i58 >= size12) {
                                    qVar4 = null;
                                    break;
                                }
                                qVar4 = (q) arrayList9.get(i58);
                                if (i57 == qVar4.f24821b) {
                                    break;
                                } else {
                                    i58++;
                                }
                            }
                            if (qVar3 != null && qVar4 != null) {
                                qVar3.c(0, qVar4);
                                qVar4.f24822c = 2;
                                arrayList9.remove(qVar3);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (this.U[0] == f.WRAP_CONTENT) {
                            int size13 = arrayList9.size();
                            qVar = null;
                            int i59 = 0;
                            int i60 = 0;
                            while (i60 < size13) {
                                Object obj7 = arrayList9.get(i60);
                                i60++;
                                q qVar5 = (q) obj7;
                                if (qVar5.f24822c != 1 && (iB2 = qVar5.b(cVar, 0)) > i59) {
                                    qVar = qVar5;
                                    i59 = iB2;
                                }
                            }
                            if (qVar != null) {
                                N(f.FIXED);
                                P(i59);
                            } else {
                                qVar = null;
                            }
                        } else {
                            qVar = null;
                        }
                        if (this.U[1] == f.WRAP_CONTENT) {
                            int size14 = arrayList9.size();
                            qVar2 = null;
                            int i61 = 0;
                            int i62 = 0;
                            while (i62 < size14) {
                                Object obj8 = arrayList9.get(i62);
                                i62++;
                                q qVar6 = (q) obj8;
                                if (qVar6.f24822c != 0 && (iB = qVar6.b(cVar, 1)) > i61) {
                                    qVar2 = qVar6;
                                    i61 = iB;
                                }
                            }
                            if (qVar2 != null) {
                                O(f.FIXED);
                                M(i61);
                            } else {
                                qVar2 = null;
                            }
                        } else {
                            qVar2 = null;
                        }
                        if (qVar != null || qVar2 != null) {
                            f fVar25 = f.WRAP_CONTENT;
                            fVar = fVar8;
                            if (fVar == fVar25) {
                                i25 = i23;
                                if (i25 >= r() || i25 <= 0) {
                                    iR = r();
                                } else {
                                    P(i25);
                                    this.I0 = true;
                                }
                                fVar2 = fVar9;
                                if (fVar2 == fVar25) {
                                    i26 = i24;
                                    if (i26 < l() || i26 <= 0) {
                                        iL = l();
                                    } else {
                                        M(i26);
                                        this.J0 = true;
                                    }
                                    z11 = true;
                                } else {
                                    i26 = i24;
                                }
                                iL = i26;
                                z11 = true;
                            } else {
                                i25 = i23;
                            }
                            iR = i25;
                            fVar2 = fVar9;
                            if (fVar2 == fVar25) {
                                i26 = i24;
                                if (i26 < l()) {
                                }
                                iL = l();
                                z11 = true;
                            } else {
                                i26 = i24;
                            }
                            iL = i26;
                            z11 = true;
                        }
                        if (!X(64) || X(128)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        cVar.getClass();
                        cVar.f3900h = false;
                        if (this.H0 == 0 && z12) {
                            c11 = 1;
                            cVar.f3900h = true;
                        } else {
                            c11 = 1;
                        }
                        ArrayList arrayList10 = this.f23161u0;
                        f[] fVarArr8 = this.U;
                        fVar3 = fVarArr8[0];
                        fVar4 = f.WRAP_CONTENT;
                        if (fVar3 != fVar4 || fVarArr8[c11] == fVar4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        this.D0 = 0;
                        this.E0 = 0;
                        i14 = i11;
                        for (i15 = 0; i15 < i14; i15++) {
                            gVar2 = (g) this.f23161u0.get(i15);
                            if (gVar2 instanceof h) {
                                ((h) gVar2).V();
                            }
                        }
                        zX = X(64);
                        z14 = z11;
                        i16 = 0;
                        r12 = 1;
                        while (r12 != 0) {
                            i17 = i16 + 1;
                            try {
                                cVar.t();
                                this.D0 = 0;
                                this.E0 = 0;
                                h(cVar);
                                for (i22 = 0; i22 < i14; i22++) {
                                    ((g) this.f23161u0.get(i22)).h(cVar);
                                }
                                T(cVar);
                                try {
                                    weakReference = this.K0;
                                    if (weakReference != null || weakReference.get() == null) {
                                        z16 = z14;
                                        dVar3 = dVar;
                                    } else {
                                        dVar3 = dVar;
                                        try {
                                            z16 = z14;
                                            try {
                                                cVar.f(cVar.k((d) this.K0.get()), cVar.k(dVar3), 0, 5);
                                                this.K0 = null;
                                            } catch (Exception e8) {
                                                e = e8;
                                                r14 = 1;
                                                e.printStackTrace();
                                                r23 = r14;
                                                System.out.println("EXCEPTION : " + e);
                                                zArr = n.f23197a;
                                                if (r23 != 0) {
                                                    zArr[2] = false;
                                                    zX2 = X(64);
                                                    R(cVar, zX2);
                                                    size = this.f23161u0.size();
                                                    i21 = 0;
                                                    z19 = false;
                                                    while (i21 < size) {
                                                        boolean[] zArr3 = zArr;
                                                        gVar = (g) this.f23161u0.get(i21);
                                                        gVar.R(cVar, zX2);
                                                        int i63 = i21;
                                                        boolean z27 = zX2;
                                                        if (gVar.f23130h == -1) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = true;
                                                        }
                                                        i21 = i63 + 1;
                                                        zArr = zArr3;
                                                        zX2 = z27;
                                                        z19 = z19;
                                                    }
                                                    zArr2 = zArr;
                                                    z17 = z19;
                                                } else {
                                                    zArr2 = zArr;
                                                    R(cVar, zX);
                                                    for (i18 = 0; i18 < i14; i18++) {
                                                        ((g) this.f23161u0.get(i18)).R(cVar, zX);
                                                    }
                                                    z17 = false;
                                                }
                                                if (!z13) {
                                                }
                                                iMax = Math.max(this.f23123d0, r());
                                                z18 = z17;
                                                if (iMax > r()) {
                                                    P(iMax);
                                                    this.U[0] = f.FIXED;
                                                    z18 = true;
                                                    z16 = true;
                                                }
                                                iMax2 = Math.max(this.f23125e0, l());
                                                if (iMax2 > l()) {
                                                    M(iMax2);
                                                    r11 = 1;
                                                    this.U[1] = f.FIXED;
                                                    r19 = 1;
                                                    z16 = true;
                                                } else {
                                                    r11 = 1;
                                                }
                                                if (z16) {
                                                    r19 = z18;
                                                    z14 = z16;
                                                    i19 = 8;
                                                    r110 = r19;
                                                } else {
                                                    r19 = z18;
                                                    fVar5 = this.U[0];
                                                    fVar6 = f.WRAP_CONTENT;
                                                    if (fVar5 == fVar6) {
                                                        r19 = r19;
                                                        if (r() > iR) {
                                                            this.I0 = r11;
                                                            this.U[0] = f.FIXED;
                                                            P(iR);
                                                            ?? r111 = r11;
                                                            z16 = r111 == true ? 1 : 0;
                                                            r19 = r111;
                                                        }
                                                    }
                                                    r19 = r19;
                                                    r19 = r19;
                                                    if (this.U[r11] == fVar6) {
                                                        r19 = z18;
                                                        z14 = z16;
                                                        i19 = 8;
                                                        r110 = r19;
                                                    } else {
                                                        r19 = z18;
                                                        z14 = z16;
                                                        i19 = 8;
                                                        r110 = r19;
                                                    }
                                                }
                                                if (i17 > i19) {
                                                    r13 = 0;
                                                } else {
                                                    r13 = r110;
                                                }
                                                i16 = i17;
                                                dVar = dVar3;
                                                r12 = r13;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            z16 = z14;
                                        }
                                    }
                                    weakReference2 = this.M0;
                                    if (weakReference2 != null && weakReference2.get() != null) {
                                        cVar.f(cVar.k(this.M), cVar.k((d) this.M0.get()), 0, 5);
                                        this.M0 = null;
                                    }
                                    weakReference3 = this.L0;
                                    if (weakReference3 != null || weakReference3.get() == null) {
                                        weakReference4 = this.N0;
                                        if (weakReference4 == null && weakReference4.get() != null) {
                                            try {
                                                cVar.f(cVar.k(this.L), cVar.k((d) this.N0.get()), 0, 5);
                                                try {
                                                    this.N0 = null;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    r14 = 1;
                                                    e.printStackTrace();
                                                    r23 = r14;
                                                    System.out.println("EXCEPTION : " + e);
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                r14 = 1;
                                                e.printStackTrace();
                                                r23 = r14;
                                                System.out.println("EXCEPTION : " + e);
                                                zArr = n.f23197a;
                                                if (r23 != 0) {
                                                    zArr[2] = false;
                                                    zX2 = X(64);
                                                    R(cVar, zX2);
                                                    size = this.f23161u0.size();
                                                    i21 = 0;
                                                    z19 = false;
                                                    while (i21 < size) {
                                                        boolean[] zArr4 = zArr;
                                                        gVar = (g) this.f23161u0.get(i21);
                                                        gVar.R(cVar, zX2);
                                                        int i64 = i21;
                                                        boolean z28 = zX2;
                                                        if (gVar.f23130h == -1) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = true;
                                                        }
                                                        i21 = i64 + 1;
                                                        zArr = zArr4;
                                                        zX2 = z28;
                                                        z19 = z19;
                                                    }
                                                    zArr2 = zArr;
                                                    z17 = z19;
                                                } else {
                                                    zArr2 = zArr;
                                                    R(cVar, zX);
                                                    while (i18 < i14) {
                                                        ((g) this.f23161u0.get(i18)).R(cVar, zX);
                                                    }
                                                    z17 = false;
                                                }
                                                if (!z13) {
                                                }
                                                iMax = Math.max(this.f23123d0, r());
                                                z18 = z17;
                                                if (iMax > r()) {
                                                    P(iMax);
                                                    this.U[0] = f.FIXED;
                                                    z18 = true;
                                                    z16 = true;
                                                }
                                                iMax2 = Math.max(this.f23125e0, l());
                                                if (iMax2 > l()) {
                                                    M(iMax2);
                                                    r11 = 1;
                                                    this.U[1] = f.FIXED;
                                                    r19 = 1;
                                                    z16 = true;
                                                } else {
                                                    r11 = 1;
                                                }
                                                if (z16) {
                                                    r19 = z18;
                                                    fVar5 = this.U[0];
                                                    fVar6 = f.WRAP_CONTENT;
                                                    if (fVar5 == fVar6) {
                                                        r19 = r19;
                                                        if (r() > iR) {
                                                            this.I0 = r11;
                                                            this.U[0] = f.FIXED;
                                                            P(iR);
                                                            ?? r112 = r11;
                                                            z16 = r112 == true ? 1 : 0;
                                                            r19 = r112;
                                                        }
                                                    }
                                                    r19 = r19;
                                                    r19 = r19;
                                                    if (this.U[r11] == fVar6) {
                                                        r19 = z18;
                                                        z14 = z16;
                                                        i19 = 8;
                                                        r110 = r19;
                                                    } else {
                                                        r19 = z18;
                                                        z14 = z16;
                                                        i19 = 8;
                                                        r110 = r19;
                                                    }
                                                } else {
                                                    r19 = z18;
                                                    z14 = z16;
                                                    i19 = 8;
                                                    r110 = r19;
                                                }
                                                if (i17 > i19) {
                                                    r13 = 0;
                                                } else {
                                                    r13 = r110;
                                                }
                                                i16 = i17;
                                                dVar = dVar3;
                                                r12 = r13;
                                            }
                                        }
                                        cVar.p();
                                        r23 = 1;
                                    } else {
                                        d dVar6 = dVar2;
                                        try {
                                            dVar2 = dVar6;
                                            cVar.f(cVar.k((d) this.L0.get()), cVar.k(dVar6), 0, 5);
                                            this.L0 = null;
                                            weakReference4 = this.N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar.p();
                                            r23 = 1;
                                        } catch (Exception e13) {
                                            e = e13;
                                            dVar2 = dVar6;
                                            r14 = 1;
                                            e.printStackTrace();
                                            r23 = r14;
                                            System.out.println("EXCEPTION : " + e);
                                            zArr = n.f23197a;
                                            if (r23 != 0) {
                                                zArr[2] = false;
                                                zX2 = X(64);
                                                R(cVar, zX2);
                                                size = this.f23161u0.size();
                                                i21 = 0;
                                                z19 = false;
                                                while (i21 < size) {
                                                    boolean[] zArr5 = zArr;
                                                    gVar = (g) this.f23161u0.get(i21);
                                                    gVar.R(cVar, zX2);
                                                    int i65 = i21;
                                                    boolean z29 = zX2;
                                                    if (gVar.f23130h == -1) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    i21 = i65 + 1;
                                                    zArr = zArr5;
                                                    zX2 = z29;
                                                    z19 = z19;
                                                }
                                                zArr2 = zArr;
                                                z17 = z19;
                                            } else {
                                                zArr2 = zArr;
                                                R(cVar, zX);
                                                while (i18 < i14) {
                                                    ((g) this.f23161u0.get(i18)).R(cVar, zX);
                                                }
                                                z17 = false;
                                            }
                                            if (!z13) {
                                            }
                                            iMax = Math.max(this.f23123d0, r());
                                            z18 = z17;
                                            if (iMax > r()) {
                                                P(iMax);
                                                this.U[0] = f.FIXED;
                                                z18 = true;
                                                z16 = true;
                                            }
                                            iMax2 = Math.max(this.f23125e0, l());
                                            if (iMax2 > l()) {
                                                M(iMax2);
                                                r11 = 1;
                                                this.U[1] = f.FIXED;
                                                r19 = 1;
                                                z16 = true;
                                            } else {
                                                r11 = 1;
                                            }
                                            if (z16) {
                                                r19 = z18;
                                                fVar5 = this.U[0];
                                                fVar6 = f.WRAP_CONTENT;
                                                if (fVar5 == fVar6) {
                                                    r19 = r19;
                                                    if (r() > iR) {
                                                        this.I0 = r11;
                                                        this.U[0] = f.FIXED;
                                                        P(iR);
                                                        ?? r113 = r11;
                                                        z16 = r113 == true ? 1 : 0;
                                                        r19 = r113;
                                                    }
                                                }
                                                r19 = r19;
                                                r19 = r19;
                                                if (this.U[r11] == fVar6) {
                                                    r19 = z18;
                                                    z14 = z16;
                                                    i19 = 8;
                                                    r110 = r19;
                                                } else {
                                                    r19 = z18;
                                                    z14 = z16;
                                                    i19 = 8;
                                                    r110 = r19;
                                                }
                                            } else {
                                                r19 = z18;
                                                z14 = z16;
                                                i19 = 8;
                                                r110 = r19;
                                            }
                                            if (i17 > i19) {
                                                r13 = 0;
                                            } else {
                                                r13 = r110;
                                            }
                                            i16 = i17;
                                            dVar = dVar3;
                                            r12 = r13;
                                        }
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    z16 = z14;
                                    dVar3 = dVar;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                z16 = z14;
                                dVar3 = dVar;
                                r14 = r12;
                            }
                            zArr = n.f23197a;
                            if (r23 != 0) {
                                zArr[2] = false;
                                zX2 = X(64);
                                R(cVar, zX2);
                                size = this.f23161u0.size();
                                i21 = 0;
                                z19 = false;
                                while (i21 < size) {
                                    boolean[] zArr6 = zArr;
                                    gVar = (g) this.f23161u0.get(i21);
                                    gVar.R(cVar, zX2);
                                    int i66 = i21;
                                    boolean z210 = zX2;
                                    if (gVar.f23130h == -1 || gVar.f23132i != -1) {
                                        z19 = true;
                                    }
                                    i21 = i66 + 1;
                                    zArr = zArr6;
                                    zX2 = z210;
                                    z19 = z19;
                                }
                                zArr2 = zArr;
                                z17 = z19;
                            } else {
                                zArr2 = zArr;
                                R(cVar, zX);
                                while (i18 < i14) {
                                    ((g) this.f23161u0.get(i18)).R(cVar, zX);
                                }
                                z17 = false;
                            }
                            if (!z13 && i17 < 8) {
                                if (zArr2[2]) {
                                    int iMax5 = 0;
                                    int iMax6 = 0;
                                    for (int i67 = 0; i67 < i14; i67++) {
                                        g gVar14 = (g) this.f23161u0.get(i67);
                                        iMax6 = Math.max(iMax6, gVar14.r() + gVar14.f23117a0);
                                        iMax5 = Math.max(iMax5, gVar14.l() + gVar14.f23119b0);
                                    }
                                    int iMax7 = Math.max(this.f23123d0, iMax6);
                                    int iMax8 = Math.max(this.f23125e0, iMax5);
                                    f fVar26 = f.WRAP_CONTENT;
                                    z17 = z17;
                                    if (fVar == fVar26 && r() < iMax7) {
                                        z17 = z17;
                                        P(iMax7);
                                        this.U[0] = fVar26;
                                        z17 = true;
                                        z16 = true;
                                    }
                                    if (fVar2 == fVar26 && l() < iMax8) {
                                        M(iMax8);
                                        this.U[1] = fVar26;
                                        z17 = true;
                                        z16 = true;
                                    }
                                }
                            }
                            iMax = Math.max(this.f23123d0, r());
                            z18 = z17;
                            if (iMax > r()) {
                                P(iMax);
                                this.U[0] = f.FIXED;
                                z18 = true;
                                z16 = true;
                            }
                            iMax2 = Math.max(this.f23125e0, l());
                            if (iMax2 > l()) {
                                M(iMax2);
                                r11 = 1;
                                this.U[1] = f.FIXED;
                                r19 = 1;
                                z16 = true;
                            } else {
                                r11 = 1;
                            }
                            if (z16) {
                                r19 = z18;
                                fVar5 = this.U[0];
                                fVar6 = f.WRAP_CONTENT;
                                if (fVar5 == fVar6 && iR > 0) {
                                    r19 = r19;
                                    if (r() > iR) {
                                        this.I0 = r11;
                                        this.U[0] = f.FIXED;
                                        P(iR);
                                        ?? r114 = r11;
                                        z16 = r114 == true ? 1 : 0;
                                        r19 = r114;
                                    }
                                }
                                r19 = r19;
                                r19 = r19;
                                if (this.U[r11] == fVar6 || iL <= 0 || l() <= iL) {
                                    r19 = z18;
                                    z14 = z16;
                                    i19 = 8;
                                    r110 = r19;
                                } else {
                                    this.J0 = r11;
                                    this.U[r11] = f.FIXED;
                                    M(iL);
                                    i19 = 8;
                                    z14 = true;
                                    r110 = 1;
                                }
                            } else {
                                r19 = z18;
                                z14 = z16;
                                i19 = 8;
                                r110 = r19;
                            }
                            if (i17 > i19) {
                                r13 = 0;
                            } else {
                                r13 = r110;
                            }
                            i16 = i17;
                            dVar = dVar3;
                            r12 = r13;
                        }
                        z15 = z14;
                        this.f23161u0 = arrayList10;
                        if (z15) {
                            f[] fVarArr9 = this.U;
                            fVarArr9[0] = fVar;
                            fVarArr9[1] = fVar2;
                        }
                        G(cVar.m);
                    }
                }
                i12 = i24;
                i13 = i23;
                fVar2 = fVar9;
                fVar = fVar8;
            }
        }
        iR = i13;
        iL = i12;
        z11 = false;
        if (X(64)) {
            z12 = true;
        } else {
            z12 = true;
        }
        cVar.getClass();
        cVar.f3900h = false;
        if (this.H0 == 0) {
            c11 = 1;
        } else {
            c11 = 1;
        }
        ArrayList arrayList11 = this.f23161u0;
        f[] fVarArr10 = this.U;
        fVar3 = fVarArr10[0];
        fVar4 = f.WRAP_CONTENT;
        if (fVar3 != fVar4) {
            z13 = true;
        } else {
            z13 = true;
        }
        this.D0 = 0;
        this.E0 = 0;
        i14 = i11;
        while (i15 < i14) {
            gVar2 = (g) this.f23161u0.get(i15);
            if (gVar2 instanceof h) {
                ((h) gVar2).V();
            }
        }
        zX = X(64);
        z14 = z11;
        i16 = 0;
        r12 = 1;
        while (r12 != 0) {
            i17 = i16 + 1;
            cVar.t();
            this.D0 = 0;
            this.E0 = 0;
            h(cVar);
            while (i22 < i14) {
                ((g) this.f23161u0.get(i22)).h(cVar);
            }
            T(cVar);
            weakReference = this.K0;
            if (weakReference != null) {
                z16 = z14;
                dVar3 = dVar;
                weakReference2 = this.M0;
                if (weakReference2 != null) {
                    cVar.f(cVar.k(this.M), cVar.k((d) this.M0.get()), 0, 5);
                    this.M0 = null;
                }
                weakReference3 = this.L0;
                if (weakReference3 != null) {
                    weakReference4 = this.N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r23 = 1;
                } else {
                    weakReference4 = this.N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r23 = 1;
                }
            } else {
                z16 = z14;
                dVar3 = dVar;
                weakReference2 = this.M0;
                if (weakReference2 != null) {
                    cVar.f(cVar.k(this.M), cVar.k((d) this.M0.get()), 0, 5);
                    this.M0 = null;
                }
                weakReference3 = this.L0;
                if (weakReference3 != null) {
                    weakReference4 = this.N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r23 = 1;
                } else {
                    weakReference4 = this.N0;
                    if (weakReference4 == null) {
                    }
                    cVar.p();
                    r23 = 1;
                }
            }
            zArr = n.f23197a;
            if (r23 != 0) {
                zArr[2] = false;
                zX2 = X(64);
                R(cVar, zX2);
                size = this.f23161u0.size();
                i21 = 0;
                z19 = false;
                while (i21 < size) {
                    boolean[] zArr7 = zArr;
                    gVar = (g) this.f23161u0.get(i21);
                    gVar.R(cVar, zX2);
                    int i68 = i21;
                    boolean z211 = zX2;
                    if (gVar.f23130h == -1) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    i21 = i68 + 1;
                    zArr = zArr7;
                    zX2 = z211;
                    z19 = z19;
                }
                zArr2 = zArr;
                z17 = z19;
            } else {
                zArr2 = zArr;
                R(cVar, zX);
                while (i18 < i14) {
                    ((g) this.f23161u0.get(i18)).R(cVar, zX);
                }
                z17 = false;
            }
            if (!z13) {
            }
            iMax = Math.max(this.f23123d0, r());
            z18 = z17;
            if (iMax > r()) {
                P(iMax);
                this.U[0] = f.FIXED;
                z18 = true;
                z16 = true;
            }
            iMax2 = Math.max(this.f23125e0, l());
            if (iMax2 > l()) {
                M(iMax2);
                r11 = 1;
                this.U[1] = f.FIXED;
                r19 = 1;
                z16 = true;
            } else {
                r11 = 1;
            }
            if (z16) {
                r19 = z18;
                fVar5 = this.U[0];
                fVar6 = f.WRAP_CONTENT;
                if (fVar5 == fVar6) {
                    r19 = r19;
                    if (r() > iR) {
                        this.I0 = r11;
                        this.U[0] = f.FIXED;
                        P(iR);
                        ?? r115 = r11;
                        z16 = r115 == true ? 1 : 0;
                        r19 = r115;
                    }
                }
                r19 = r19;
                r19 = r19;
                if (this.U[r11] == fVar6) {
                    r19 = z18;
                    z14 = z16;
                    i19 = 8;
                    r110 = r19;
                } else {
                    r19 = z18;
                    z14 = z16;
                    i19 = 8;
                    r110 = r19;
                }
            } else {
                r19 = z18;
                z14 = z16;
                i19 = 8;
                r110 = r19;
            }
            if (i17 > i19) {
                r13 = 0;
            } else {
                r13 = r110;
            }
            i16 = i17;
            dVar = dVar3;
            r12 = r13;
        }
        z15 = z14;
        this.f23161u0 = arrayList11;
        if (z15) {
            f[] fVarArr11 = this.U;
            fVarArr11[0] = fVar;
            fVarArr11[1] = fVar2;
        }
        G(cVar.m);
    }

    public final boolean X(int i11) {
        return (this.H0 & i11) == i11;
    }

    @Override // d4.g
    public final void o(StringBuilder sb2) {
        sb2.append(this.f23134j + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.X);
        sb2.append("\n");
        ArrayList arrayList = this.f23161u0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((g) obj).o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
