package w00;

import fr.j3;
import hh.p0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import z00.a0;
import z00.t;
import z00.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9.i f54416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f54417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f54418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f54419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f54420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BitSet f54421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f54422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b10.b f54423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f54425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f54426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b7.n f54427l;

    public k(a9.i iVar) {
        this.f54416a = iVar;
        ArrayList arrayList = new ArrayList((List) iVar.f517a);
        arrayList.add(new x00.b(1));
        arrayList.add(new x00.b(2));
        arrayList.add(new x00.b(3));
        arrayList.add(new x00.b(0));
        arrayList.add(new x00.b(4));
        this.f54417b = arrayList;
        List list = (List) iVar.f518b;
        HashMap map = new HashMap();
        Object[] objArr = {new x00.a('*'), new x00.a('_')};
        ArrayList arrayList2 = new ArrayList(2);
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        b(Collections.unmodifiableList(arrayList2), map);
        b(list, map);
        this.f54418c = map;
        ArrayList arrayList3 = new ArrayList((List) iVar.f519c);
        arrayList3.add(new x00.f());
        this.f54419d = arrayList3;
        Set set = (Set) iVar.f520d;
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f54421f = bitSet;
        Set setKeySet = this.f54418c.keySet();
        ArrayList arrayList4 = this.f54417b;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        int size = arrayList4.size();
        while (i11 < size) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            Iterator it3 = ((x00.b) obj2).a().iterator();
            while (it3.hasNext()) {
                bitSet2.set(((Character) it3.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f54420e = bitSet2;
    }

    public static void a(char c11, d10.a aVar, HashMap map) {
        if (((d10.a) map.put(Character.valueOf(c11), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c11 + "'");
    }

    public static void b(Iterable iterable, HashMap map) {
        r rVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d10.a aVar = (d10.a) it.next();
            char cD = aVar.d();
            char cB = aVar.b();
            if (cD == cB) {
                d10.a aVar2 = (d10.a) map.get(Character.valueOf(cD));
                if (aVar2 == null || aVar2.d() != aVar2.b()) {
                    a(cD, aVar, map);
                } else {
                    if (aVar2 instanceof r) {
                        rVar = (r) aVar2;
                    } else {
                        r rVar2 = new r(cD);
                        rVar2.e(aVar2);
                        rVar = rVar2;
                    }
                    rVar.e(aVar);
                    map.put(Character.valueOf(cD), rVar);
                }
            } else {
                a(cD, aVar, map);
                a(cB, aVar, map);
            }
        }
    }

    public static a0 i(a10.f fVar) {
        a0 a0Var = new a0(fVar.e());
        a0Var.g(fVar.g());
        return a0Var;
    }

    public final void c(t tVar) {
        t tVar2 = tVar.f58444b;
        if (tVar2 == null) {
            return;
        }
        t tVar3 = tVar.f58445c;
        a0 a0Var = null;
        a0 a0Var2 = null;
        int length = 0;
        while (tVar2 != null) {
            if (tVar2 instanceof a0) {
                a0Var2 = (a0) tVar2;
                if (a0Var == null) {
                    a0Var = a0Var2;
                }
                length = a0Var2.f58420g.length() + length;
            } else {
                d(a0Var, a0Var2, length);
                c(tVar2);
                a0Var = null;
                a0Var2 = null;
                length = 0;
            }
            if (tVar2 == tVar3) {
                break;
            } else {
                tVar2 = tVar2.f58447e;
            }
        }
        d(a0Var, a0Var2, length);
    }

    public final void d(a0 a0Var, a0 a0Var2, int i11) {
        com.android.billingclient.api.m mVar;
        if (a0Var == null || a0Var2 == null || a0Var == a0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(a0Var.f58420g);
        if (this.f54424i) {
            mVar = new com.android.billingclient.api.m();
            mVar.f(a0Var.d());
        } else {
            mVar = null;
        }
        t tVar = a0Var.f58447e;
        t tVar2 = a0Var2.f58447e;
        while (tVar != tVar2) {
            sb2.append(((a0) tVar).f58420g);
            if (mVar != null) {
                mVar.f(tVar.d());
            }
            t tVar3 = tVar.f58447e;
            tVar.i();
            tVar = tVar3;
        }
        a0Var.f58420g = sb2.toString();
        if (mVar != null) {
            List list = mVar.f7554a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            a0Var.g(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0291  */
    /* JADX WARN: Code duplicated, block: B:103:0x0294  */
    /* JADX WARN: Code duplicated, block: B:107:0x029d  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:152:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:154:0x0313  */
    /* JADX WARN: Code duplicated, block: B:158:0x031a  */
    /* JADX WARN: Code duplicated, block: B:167:0x039e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0478  */
    /* JADX WARN: Code duplicated, block: B:237:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:238:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:242:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:243:0x0505  */
    /* JADX WARN: Code duplicated, block: B:248:0x0514  */
    /* JADX WARN: Code duplicated, block: B:251:0x052c  */
    /* JADX WARN: Code duplicated, block: B:252:0x052e  */
    /* JADX WARN: Code duplicated, block: B:255:0x053c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0545  */
    /* JADX WARN: Code duplicated, block: B:261:0x056d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0570  */
    /* JADX WARN: Code duplicated, block: B:271:0x0589  */
    /* JADX WARN: Code duplicated, block: B:280:0x05af A[LOOP:9: B:279:0x05ad->B:280:0x05af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x05bf A[LOOP:10: B:282:0x05bd->B:283:0x05bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:296:0x05fa A[ADDED_TO_REGION, LOOP:11: B:296:0x05fa->B:300:0x0605, LOOP_START, PHI: r2
      0x05fa: PHI (r2v57 b7.n) = (r2v56 b7.n), (r2v59 b7.n) binds: [B:295:0x05f8, B:300:0x0605] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:299:0x0602  */
    /* JADX WARN: Code duplicated, block: B:302:0x060c  */
    /* JADX WARN: Code duplicated, block: B:303:0x060e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x05b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0148  */
    /* JADX WARN: Code duplicated, block: B:47:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a7 A[LOOP:5: B:45:0x0152->B:55:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0205  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f A[LOOP:6: B:74:0x0217->B:76:0x021f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x023f  */
    /* JADX WARN: Code duplicated, block: B:81:0x024f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0266  */
    /* JADX WARN: Code duplicated, block: B:86:0x026b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0279  */
    /* JADX WARN: Code duplicated, block: B:91:0x027c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0285  */
    /* JADX WARN: Code duplicated, block: B:97:0x0288  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v18, types: [int] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void e(a10.f fVar, t tVar) {
        int i11;
        ?? r9;
        ?? UnmodifiableList;
        List listUnmodifiableList;
        String strB;
        pz.g gVar;
        String str;
        a9.i iVar;
        a9.i iVar2;
        a9.e eVarO;
        ArrayList arrayList;
        int size;
        int i12;
        b10.b bVar;
        String str2;
        String str3;
        String str4;
        z00.f fVar2;
        Object obj;
        z00.q qVar;
        bq.f fVarA;
        t tVar2;
        a9.e eVar;
        a9.i iVar3;
        boolean z11;
        int i13;
        t tVar3;
        b7.n nVar;
        b bVar2;
        t tVarI;
        List list;
        d10.a aVar;
        Object objUnmodifiableList;
        b10.b bVar3;
        int i14;
        int codePoint;
        a9.e eVarO2;
        ArrayList arrayList2;
        b10.b bVar4;
        int i15;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r21;
        v4.b bVar5;
        ?? r22;
        char cCharAt;
        ?? r110;
        char cCharAt2;
        b bVar6;
        b bVar7;
        char cCharAt3;
        char cCharAt4;
        a9.e eVarO3;
        Iterator it;
        qh.d dVarA;
        t tVar4;
        Object cVar;
        this.f54423h = new b10.b(fVar.f291a);
        ?? r23 = 1;
        this.f54424i = !fVar.g().isEmpty();
        int i16 = 0;
        this.f54425j = 0;
        v4.b bVar8 = null;
        this.f54426k = null;
        this.f54427l = null;
        HashMap map = new HashMap();
        ArrayList arrayList3 = this.f54417b;
        int size2 = arrayList3.size();
        int i17 = 0;
        while (i17 < size2) {
            Object obj2 = arrayList3.get(i17);
            i17++;
            x00.b bVar9 = (x00.b) obj2;
            switch (bVar9.f55623a) {
                case 0:
                    cVar = new x00.c();
                    break;
                case 1:
                    cVar = new x00.d();
                    break;
                case 2:
                    cVar = new x00.e();
                    break;
                case 3:
                    cVar = new x00.g();
                    break;
                default:
                    cVar = new x00.h();
                    break;
            }
            Iterator it2 = bVar9.a().iterator();
            while (it2.hasNext()) {
                ((List) map.computeIfAbsent((Character) it2.next(), new com.google.android.material.color.utilities.d(29))).add(cVar);
            }
        }
        this.f54422g = map;
        while (true) {
            char cN = this.f54423h.n();
            if (cN != 0) {
                int codePoint2 = 10;
                if (cN != '\n') {
                    if (cN == '[') {
                        a9.e eVarO4 = this.f54423h.o();
                        this.f54423h.k();
                        a9.e eVarO5 = this.f54423h.o();
                        a0 a0VarI = i(this.f54423h.e(eVarO4, eVarO5));
                        b7.n nVar2 = this.f54427l;
                        b7.n nVar3 = new b7.n(null, null, a0VarI, eVarO4, eVarO5, nVar2, this.f54426k);
                        if (nVar2 != null) {
                            nVar2.f4004b = true;
                        }
                        this.f54427l = nVar3;
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj3 = new Object[]{a0VarI}[0];
                        Objects.requireNonNull(obj3);
                        arrayList4.add(obj3);
                        listUnmodifiableList = Collections.unmodifiableList(arrayList4);
                    } else if (cN != ']') {
                        if (this.f54421f.get(cN)) {
                            a9.e eVarO6 = this.f54423h.o();
                            a9.e eVarO7 = this.f54423h.o();
                            this.f54423h.k();
                            a9.e eVarO8 = this.f54423h.o();
                            if (this.f54423h.l('[')) {
                                a9.e eVarO9 = this.f54423h.o();
                                a0 a0VarI2 = i(this.f54423h.e(eVarO7, eVarO8));
                                a0 a0VarI3 = i(this.f54423h.e(eVarO8, eVarO9));
                                b7.n nVar4 = this.f54427l;
                                b7.n nVar5 = new b7.n(a0VarI2, eVarO7, a0VarI3, eVarO8, eVarO9, nVar4, this.f54426k);
                                if (nVar4 != null) {
                                    nVar4.f4004b = r23;
                                }
                                this.f54427l = nVar5;
                                Object[] objArr = {a0VarI2, a0VarI3};
                                ArrayList arrayList5 = new ArrayList(2);
                                for (int i18 = i16; i18 < 2; i18++) {
                                    Object obj4 = objArr[i18];
                                    Objects.requireNonNull(obj4);
                                    arrayList5.add(obj4);
                                }
                                objUnmodifiableList = Collections.unmodifiableList(arrayList5);
                            } else {
                                objUnmodifiableList = bVar8;
                            }
                            if (objUnmodifiableList == null) {
                                this.f54423h.p(eVarO6);
                                if (this.f54420e.get(cN)) {
                                    list = (List) this.f54422g.get(Character.valueOf(cN));
                                    if (list != null) {
                                        eVarO3 = this.f54423h.o();
                                        it = list.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                dVarA = ((b10.a) it.next()).a(this);
                                                if (dVarA != null) {
                                                    tVar4 = (t) dVarA.f47750b;
                                                    this.f54423h.p((a9.e) dVarA.f47751c);
                                                    if (this.f54424i && tVar4.d().isEmpty()) {
                                                        b10.b bVar10 = this.f54423h;
                                                        tVar4.g(bVar10.e(eVarO3, bVar10.o()).g());
                                                    }
                                                    ArrayList arrayList6 = new ArrayList((int) r23);
                                                    Object obj5 = new Object[]{tVar4}[i16];
                                                    Objects.requireNonNull(obj5);
                                                    arrayList6.add(obj5);
                                                    objUnmodifiableList = Collections.unmodifiableList(arrayList6);
                                                } else {
                                                    this.f54423h.p(eVarO3);
                                                }
                                            } else {
                                                aVar = (d10.a) this.f54418c.get(Character.valueOf(cN));
                                                if (aVar == null) {
                                                    Object[] objArr2 = {f()};
                                                    ArrayList arrayList7 = new ArrayList((int) r23);
                                                    Object obj6 = objArr2[i16];
                                                    Objects.requireNonNull(obj6);
                                                    arrayList7.add(obj6);
                                                    objUnmodifiableList = Collections.unmodifiableList(arrayList7);
                                                } else {
                                                    bVar3 = this.f54423h;
                                                    i14 = bVar3.f3847b;
                                                    if (i14 > 0) {
                                                        int i19 = i14 - 1;
                                                        cCharAt3 = ((a10.e) bVar3.f3850e).f289a.charAt(i19);
                                                        if (Character.isLowSurrogate(cCharAt3) && i19 > 0) {
                                                            cCharAt4 = ((a10.e) bVar3.f3850e).f289a.charAt(i14 - 2);
                                                            codePoint = cCharAt3;
                                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                            }
                                                        }
                                                    } else if (bVar3.f3846a > 0) {
                                                        codePoint = 10;
                                                    } else {
                                                        codePoint = i16;
                                                    }
                                                    codePoint = cCharAt3;
                                                    codePoint = cCharAt3;
                                                    eVarO2 = this.f54423h.o();
                                                    if (this.f54423h.i(cN) < aVar.c()) {
                                                        this.f54423h.p(eVarO2);
                                                        bVar5 = bVar8;
                                                    } else {
                                                        arrayList2 = new ArrayList();
                                                        this.f54423h.p(eVarO2);
                                                        while (this.f54423h.l(cN)) {
                                                            b10.b bVar11 = this.f54423h;
                                                            arrayList2.add(i(bVar11.e(eVarO2, bVar11.o())));
                                                            eVarO2 = this.f54423h.o();
                                                        }
                                                        bVar4 = this.f54423h;
                                                        i15 = bVar4.f3847b;
                                                        if (i15 < bVar4.f3848c) {
                                                            cCharAt = ((a10.e) bVar4.f3850e).f289a.charAt(i15);
                                                            if (Character.isHighSurrogate(cCharAt) && (r110 = bVar4.f3847b + r23) < bVar4.f3848c) {
                                                                cCharAt2 = ((a10.e) bVar4.f3850e).f289a.charAt(r110);
                                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                }
                                                            }
                                                        } else if (bVar4.f3846a >= ((List) bVar4.f3849d).size() - r23) {
                                                            codePoint2 = i16;
                                                        }
                                                        if (codePoint != 0 || qx.p.r(codePoint)) {
                                                            r11 = r23;
                                                        } else {
                                                            r11 = i16;
                                                        }
                                                        if (codePoint != 0 || qx.p.t(codePoint)) {
                                                            r12 = r23;
                                                        } else {
                                                            r12 = i16;
                                                        }
                                                        if (codePoint2 != 0 || qx.p.r(codePoint2)) {
                                                            r13 = r23;
                                                        } else {
                                                            r13 = i16;
                                                        }
                                                        if (codePoint2 != 0 || qx.p.t(codePoint2)) {
                                                            r14 = r23;
                                                        } else {
                                                            r14 = i16;
                                                        }
                                                        if (r14 == 0 || (r13 != 0 && r12 == 0 && r11 == 0)) {
                                                            r15 = i16;
                                                        } else {
                                                            r15 = r23;
                                                        }
                                                        if (r12 == 0 || (r11 != 0 && r14 == 0 && r13 == 0)) {
                                                            r16 = i16;
                                                        } else {
                                                            r16 = r23;
                                                        }
                                                        if (cN == '_') {
                                                            if (r15 != 0 || (r16 != 0 && r11 == 0)) {
                                                                r22 = i16;
                                                            } else {
                                                                r22 = r23;
                                                            }
                                                            if (r16 != 0 || (r15 != 0 && r13 == 0)) {
                                                                r21 = i16;
                                                                r19 = r22;
                                                            } else {
                                                                r21 = r23;
                                                                r19 = r22;
                                                            }
                                                        } else {
                                                            if (r15 == 0 && cN == aVar.d()) {
                                                                r17 = r23;
                                                            } else {
                                                                r17 = i16;
                                                            }
                                                            if (r16 == 0 && cN == aVar.b()) {
                                                                r18 = r23;
                                                            } else {
                                                                r18 = i16;
                                                            }
                                                            r19 = r17;
                                                            r21 = r18;
                                                        }
                                                        bVar5 = new v4.b();
                                                        bVar5.f53508c = arrayList2;
                                                        bVar5.f53507b = r19;
                                                        bVar5.f53506a = r21;
                                                    }
                                                    if (bVar5 == null) {
                                                        objUnmodifiableList = bVar8;
                                                    } else {
                                                        ArrayList arrayList8 = (ArrayList) bVar5.f53508c;
                                                        bVar6 = new b(arrayList8, cN, bVar5.f53507b, bVar5.f53506a, this.f54426k);
                                                        this.f54426k = bVar6;
                                                        bVar7 = bVar6.f54374f;
                                                        if (bVar7 != null) {
                                                            bVar7.f54375g = bVar6;
                                                        }
                                                        objUnmodifiableList = arrayList8;
                                                    }
                                                    if (objUnmodifiableList == null) {
                                                        Object[] objArr3 = {f()};
                                                        ArrayList arrayList9 = new ArrayList((int) r23);
                                                        Object obj7 = objArr3[i16];
                                                        Objects.requireNonNull(obj7);
                                                        arrayList9.add(obj7);
                                                        objUnmodifiableList = Collections.unmodifiableList(arrayList9);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        aVar = (d10.a) this.f54418c.get(Character.valueOf(cN));
                                        if (aVar == null) {
                                            Object[] objArr4 = {f()};
                                            ArrayList arrayList10 = new ArrayList((int) r23);
                                            Object obj8 = objArr4[i16];
                                            Objects.requireNonNull(obj8);
                                            arrayList10.add(obj8);
                                            objUnmodifiableList = Collections.unmodifiableList(arrayList10);
                                        } else {
                                            bVar3 = this.f54423h;
                                            i14 = bVar3.f3847b;
                                            if (i14 > 0) {
                                                int i110 = i14 - 1;
                                                cCharAt3 = ((a10.e) bVar3.f3850e).f289a.charAt(i110);
                                                if (Character.isLowSurrogate(cCharAt3)) {
                                                    cCharAt4 = ((a10.e) bVar3.f3850e).f289a.charAt(i14 - 2);
                                                    codePoint = cCharAt3;
                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                    }
                                                }
                                            } else if (bVar3.f3846a > 0) {
                                                codePoint = 10;
                                            } else {
                                                codePoint = i16;
                                            }
                                            codePoint = cCharAt3;
                                            codePoint = cCharAt3;
                                            eVarO2 = this.f54423h.o();
                                            if (this.f54423h.i(cN) < aVar.c()) {
                                                this.f54423h.p(eVarO2);
                                                bVar5 = bVar8;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                this.f54423h.p(eVarO2);
                                                while (this.f54423h.l(cN)) {
                                                    b10.b bVar12 = this.f54423h;
                                                    arrayList2.add(i(bVar12.e(eVarO2, bVar12.o())));
                                                    eVarO2 = this.f54423h.o();
                                                }
                                                bVar4 = this.f54423h;
                                                i15 = bVar4.f3847b;
                                                if (i15 < bVar4.f3848c) {
                                                    cCharAt = ((a10.e) bVar4.f3850e).f289a.charAt(i15);
                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                        cCharAt2 = ((a10.e) bVar4.f3850e).f289a.charAt(r110);
                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                        }
                                                    }
                                                } else if (bVar4.f3846a >= ((List) bVar4.f3849d).size() - r23) {
                                                    codePoint2 = i16;
                                                }
                                                if (codePoint != 0) {
                                                    r11 = r23;
                                                } else {
                                                    r11 = r23;
                                                }
                                                if (codePoint != 0) {
                                                    r12 = r23;
                                                } else {
                                                    r12 = r23;
                                                }
                                                if (codePoint2 != 0) {
                                                    r13 = r23;
                                                } else {
                                                    r13 = r23;
                                                }
                                                if (codePoint2 != 0) {
                                                    r14 = r23;
                                                } else {
                                                    r14 = r23;
                                                }
                                                if (r14 == 0) {
                                                    r15 = i16;
                                                } else {
                                                    r15 = i16;
                                                }
                                                if (r12 == 0) {
                                                    r16 = i16;
                                                } else {
                                                    r16 = i16;
                                                }
                                                if (cN == '_') {
                                                    if (r15 != 0) {
                                                        r22 = i16;
                                                    } else {
                                                        r22 = i16;
                                                    }
                                                    if (r16 != 0) {
                                                        r21 = i16;
                                                        r19 = r22;
                                                    } else {
                                                        r21 = i16;
                                                        r19 = r22;
                                                    }
                                                } else {
                                                    if (r15 == 0) {
                                                        r17 = i16;
                                                    } else {
                                                        r17 = i16;
                                                    }
                                                    if (r16 == 0) {
                                                        r18 = i16;
                                                    } else {
                                                        r18 = i16;
                                                    }
                                                    r19 = r17;
                                                    r21 = r18;
                                                }
                                                bVar5 = new v4.b();
                                                bVar5.f53508c = arrayList2;
                                                bVar5.f53507b = r19;
                                                bVar5.f53506a = r21;
                                            }
                                            if (bVar5 == null) {
                                                objUnmodifiableList = bVar8;
                                            } else {
                                                ArrayList arrayList11 = (ArrayList) bVar5.f53508c;
                                                bVar6 = new b(arrayList11, cN, bVar5.f53507b, bVar5.f53506a, this.f54426k);
                                                this.f54426k = bVar6;
                                                bVar7 = bVar6.f54374f;
                                                if (bVar7 != null) {
                                                    bVar7.f54375g = bVar6;
                                                }
                                                objUnmodifiableList = arrayList11;
                                            }
                                            if (objUnmodifiableList == null) {
                                                Object[] objArr5 = {f()};
                                                ArrayList arrayList12 = new ArrayList((int) r23);
                                                Object obj9 = objArr5[i16];
                                                Objects.requireNonNull(obj9);
                                                arrayList12.add(obj9);
                                                objUnmodifiableList = Collections.unmodifiableList(arrayList12);
                                            }
                                        }
                                    }
                                } else {
                                    Object[] objArr6 = {f()};
                                    ArrayList arrayList13 = new ArrayList((int) r23);
                                    Object obj10 = objArr6[i16];
                                    Objects.requireNonNull(obj10);
                                    arrayList13.add(obj10);
                                    objUnmodifiableList = Collections.unmodifiableList(arrayList13);
                                }
                            }
                        } else if (this.f54420e.get(cN)) {
                            Object[] objArr7 = {f()};
                            ArrayList arrayList14 = new ArrayList((int) r23);
                            Object obj11 = objArr7[i16];
                            Objects.requireNonNull(obj11);
                            arrayList14.add(obj11);
                            objUnmodifiableList = Collections.unmodifiableList(arrayList14);
                        } else {
                            list = (List) this.f54422g.get(Character.valueOf(cN));
                            if (list != null) {
                                eVarO3 = this.f54423h.o();
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        dVarA = ((b10.a) it.next()).a(this);
                                        if (dVarA != null) {
                                            tVar4 = (t) dVarA.f47750b;
                                            this.f54423h.p((a9.e) dVarA.f47751c);
                                            if (this.f54424i) {
                                                b10.b bVar13 = this.f54423h;
                                                tVar4.g(bVar13.e(eVarO3, bVar13.o()).g());
                                            }
                                            ArrayList arrayList15 = new ArrayList((int) r23);
                                            Object obj12 = new Object[]{tVar4}[i16];
                                            Objects.requireNonNull(obj12);
                                            arrayList15.add(obj12);
                                            objUnmodifiableList = Collections.unmodifiableList(arrayList15);
                                        } else {
                                            this.f54423h.p(eVarO3);
                                        }
                                    } else {
                                        aVar = (d10.a) this.f54418c.get(Character.valueOf(cN));
                                        if (aVar == null) {
                                            Object[] objArr8 = {f()};
                                            ArrayList arrayList16 = new ArrayList((int) r23);
                                            Object obj13 = objArr8[i16];
                                            Objects.requireNonNull(obj13);
                                            arrayList16.add(obj13);
                                            objUnmodifiableList = Collections.unmodifiableList(arrayList16);
                                        } else {
                                            bVar3 = this.f54423h;
                                            i14 = bVar3.f3847b;
                                            if (i14 > 0) {
                                                int i111 = i14 - 1;
                                                cCharAt3 = ((a10.e) bVar3.f3850e).f289a.charAt(i111);
                                                if (Character.isLowSurrogate(cCharAt3)) {
                                                    cCharAt4 = ((a10.e) bVar3.f3850e).f289a.charAt(i14 - 2);
                                                    codePoint = cCharAt3;
                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                    }
                                                }
                                            } else if (bVar3.f3846a > 0) {
                                                codePoint = 10;
                                            } else {
                                                codePoint = i16;
                                            }
                                            codePoint = cCharAt3;
                                            codePoint = cCharAt3;
                                            eVarO2 = this.f54423h.o();
                                            if (this.f54423h.i(cN) < aVar.c()) {
                                                this.f54423h.p(eVarO2);
                                                bVar5 = bVar8;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                this.f54423h.p(eVarO2);
                                                while (this.f54423h.l(cN)) {
                                                    b10.b bVar14 = this.f54423h;
                                                    arrayList2.add(i(bVar14.e(eVarO2, bVar14.o())));
                                                    eVarO2 = this.f54423h.o();
                                                }
                                                bVar4 = this.f54423h;
                                                i15 = bVar4.f3847b;
                                                if (i15 < bVar4.f3848c) {
                                                    cCharAt = ((a10.e) bVar4.f3850e).f289a.charAt(i15);
                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                        cCharAt2 = ((a10.e) bVar4.f3850e).f289a.charAt(r110);
                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = cCharAt;
                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                        }
                                                    }
                                                } else if (bVar4.f3846a >= ((List) bVar4.f3849d).size() - r23) {
                                                    codePoint2 = i16;
                                                }
                                                if (codePoint != 0) {
                                                    r11 = r23;
                                                } else {
                                                    r11 = r23;
                                                }
                                                if (codePoint != 0) {
                                                    r12 = r23;
                                                } else {
                                                    r12 = r23;
                                                }
                                                if (codePoint2 != 0) {
                                                    r13 = r23;
                                                } else {
                                                    r13 = r23;
                                                }
                                                if (codePoint2 != 0) {
                                                    r14 = r23;
                                                } else {
                                                    r14 = r23;
                                                }
                                                if (r14 == 0) {
                                                    r15 = i16;
                                                } else {
                                                    r15 = i16;
                                                }
                                                if (r12 == 0) {
                                                    r16 = i16;
                                                } else {
                                                    r16 = i16;
                                                }
                                                if (cN == '_') {
                                                    if (r15 != 0) {
                                                        r22 = i16;
                                                    } else {
                                                        r22 = i16;
                                                    }
                                                    if (r16 != 0) {
                                                        r21 = i16;
                                                        r19 = r22;
                                                    } else {
                                                        r21 = i16;
                                                        r19 = r22;
                                                    }
                                                } else {
                                                    if (r15 == 0) {
                                                        r17 = i16;
                                                    } else {
                                                        r17 = i16;
                                                    }
                                                    if (r16 == 0) {
                                                        r18 = i16;
                                                    } else {
                                                        r18 = i16;
                                                    }
                                                    r19 = r17;
                                                    r21 = r18;
                                                }
                                                bVar5 = new v4.b();
                                                bVar5.f53508c = arrayList2;
                                                bVar5.f53507b = r19;
                                                bVar5.f53506a = r21;
                                            }
                                            if (bVar5 == null) {
                                                objUnmodifiableList = bVar8;
                                            } else {
                                                ArrayList arrayList17 = (ArrayList) bVar5.f53508c;
                                                bVar6 = new b(arrayList17, cN, bVar5.f53507b, bVar5.f53506a, this.f54426k);
                                                this.f54426k = bVar6;
                                                bVar7 = bVar6.f54374f;
                                                if (bVar7 != null) {
                                                    bVar7.f54375g = bVar6;
                                                }
                                                objUnmodifiableList = arrayList17;
                                            }
                                            if (objUnmodifiableList == null) {
                                                Object[] objArr9 = {f()};
                                                ArrayList arrayList18 = new ArrayList((int) r23);
                                                Object obj14 = objArr9[i16];
                                                Objects.requireNonNull(obj14);
                                                arrayList18.add(obj14);
                                                objUnmodifiableList = Collections.unmodifiableList(arrayList18);
                                            }
                                        }
                                    }
                                }
                            } else {
                                aVar = (d10.a) this.f54418c.get(Character.valueOf(cN));
                                if (aVar == null) {
                                    Object[] objArr10 = {f()};
                                    ArrayList arrayList19 = new ArrayList((int) r23);
                                    Object obj15 = objArr10[i16];
                                    Objects.requireNonNull(obj15);
                                    arrayList19.add(obj15);
                                    objUnmodifiableList = Collections.unmodifiableList(arrayList19);
                                } else {
                                    bVar3 = this.f54423h;
                                    i14 = bVar3.f3847b;
                                    if (i14 > 0) {
                                        int i112 = i14 - 1;
                                        cCharAt3 = ((a10.e) bVar3.f3850e).f289a.charAt(i112);
                                        if (Character.isLowSurrogate(cCharAt3)) {
                                            cCharAt4 = ((a10.e) bVar3.f3850e).f289a.charAt(i14 - 2);
                                            codePoint = cCharAt3;
                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                            }
                                        }
                                    } else if (bVar3.f3846a > 0) {
                                        codePoint = 10;
                                    } else {
                                        codePoint = i16;
                                    }
                                    codePoint = cCharAt3;
                                    codePoint = cCharAt3;
                                    eVarO2 = this.f54423h.o();
                                    if (this.f54423h.i(cN) < aVar.c()) {
                                        this.f54423h.p(eVarO2);
                                        bVar5 = bVar8;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f54423h.p(eVarO2);
                                        while (this.f54423h.l(cN)) {
                                            b10.b bVar15 = this.f54423h;
                                            arrayList2.add(i(bVar15.e(eVarO2, bVar15.o())));
                                            eVarO2 = this.f54423h.o();
                                        }
                                        bVar4 = this.f54423h;
                                        i15 = bVar4.f3847b;
                                        if (i15 < bVar4.f3848c) {
                                            cCharAt = ((a10.e) bVar4.f3850e).f289a.charAt(i15);
                                            if (Character.isHighSurrogate(cCharAt)) {
                                                cCharAt2 = ((a10.e) bVar4.f3850e).f289a.charAt(r110);
                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = cCharAt;
                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                }
                                            }
                                        } else if (bVar4.f3846a >= ((List) bVar4.f3849d).size() - r23) {
                                            codePoint2 = i16;
                                        }
                                        if (codePoint != 0) {
                                            r11 = r23;
                                        } else {
                                            r11 = r23;
                                        }
                                        if (codePoint != 0) {
                                            r12 = r23;
                                        } else {
                                            r12 = r23;
                                        }
                                        if (codePoint2 != 0) {
                                            r13 = r23;
                                        } else {
                                            r13 = r23;
                                        }
                                        if (codePoint2 != 0) {
                                            r14 = r23;
                                        } else {
                                            r14 = r23;
                                        }
                                        if (r14 == 0) {
                                            r15 = i16;
                                        } else {
                                            r15 = i16;
                                        }
                                        if (r12 == 0) {
                                            r16 = i16;
                                        } else {
                                            r16 = i16;
                                        }
                                        if (cN == '_') {
                                            if (r15 != 0) {
                                                r22 = i16;
                                            } else {
                                                r22 = i16;
                                            }
                                            if (r16 != 0) {
                                                r21 = i16;
                                                r19 = r22;
                                            } else {
                                                r21 = i16;
                                                r19 = r22;
                                            }
                                        } else {
                                            if (r15 == 0) {
                                                r17 = i16;
                                            } else {
                                                r17 = i16;
                                            }
                                            if (r16 == 0) {
                                                r18 = i16;
                                            } else {
                                                r18 = i16;
                                            }
                                            r19 = r17;
                                            r21 = r18;
                                        }
                                        bVar5 = new v4.b();
                                        bVar5.f53508c = arrayList2;
                                        bVar5.f53507b = r19;
                                        bVar5.f53506a = r21;
                                    }
                                    if (bVar5 == null) {
                                        objUnmodifiableList = bVar8;
                                    } else {
                                        ArrayList arrayList110 = (ArrayList) bVar5.f53508c;
                                        bVar6 = new b(arrayList110, cN, bVar5.f53507b, bVar5.f53506a, this.f54426k);
                                        this.f54426k = bVar6;
                                        bVar7 = bVar6.f54374f;
                                        if (bVar7 != null) {
                                            bVar7.f54375g = bVar6;
                                        }
                                        objUnmodifiableList = arrayList110;
                                    }
                                    if (objUnmodifiableList == null) {
                                        Object[] objArr11 = {f()};
                                        ArrayList arrayList111 = new ArrayList((int) r23);
                                        Object obj16 = objArr11[i16];
                                        Objects.requireNonNull(obj16);
                                        arrayList111.add(obj16);
                                        objUnmodifiableList = Collections.unmodifiableList(arrayList111);
                                    }
                                }
                            }
                        }
                        i11 = i16;
                        r9 = r23;
                        UnmodifiableList = objUnmodifiableList;
                    } else {
                        a9.e eVarO10 = this.f54423h.o();
                        this.f54423h.k();
                        a9.e eVarO11 = this.f54423h.o();
                        b7.n nVar6 = this.f54427l;
                        if (nVar6 == null) {
                            tVarI = i(this.f54423h.e(eVarO10, eVarO11));
                        } else if (nVar6.f4003a) {
                            b10.b bVar16 = this.f54423h;
                            a9.e eVar2 = (a9.e) nVar6.f4009g;
                            a9.e eVar3 = (a9.e) nVar6.f4008f;
                            a9.e eVar4 = (a9.e) nVar6.f4006d;
                            b bVar17 = (b) nVar6.f4011i;
                            t tVar5 = (a0) nVar6.f4007e;
                            a0 a0Var = (a0) nVar6.f4005c;
                            String strE = bVar16.e(eVar2, eVarO10).e();
                            a9.e eVarO12 = this.f54423h.o();
                            b10.b bVar18 = this.f54423h;
                            if (bVar18.l('(')) {
                                bVar18.q();
                                char cN2 = bVar18.n();
                                a9.e eVarO13 = bVar18.o();
                                String strB2 = j3.R(bVar18) ? y00.a.b(cN2 == '<' ? nv.p.i(r23, r23, bVar18.e(eVarO13, bVar18.o()).e()) : bVar18.e(eVarO13, bVar18.o()).e()) : null;
                                if (strB2 != null) {
                                    if (bVar18.q() >= r23) {
                                        a9.e eVarO14 = bVar18.o();
                                        if (bVar18.f()) {
                                            char cN3 = bVar18.n();
                                            ?? r24 = r23;
                                            char c11 = '\"';
                                            if (cN3 == '\"') {
                                                bVar18.k();
                                                if (j3.T(bVar18, c11) && bVar18.f()) {
                                                    bVar18.k();
                                                    String strE2 = bVar18.e(eVarO14, bVar18.o()).e();
                                                    strB = y00.a.b(strE2.substring(r24 == true ? 1 : 0, strE2.length() - 1));
                                                }
                                            } else {
                                                if (cN3 == '\'') {
                                                    c11 = '\'';
                                                } else if (cN3 == '(') {
                                                    c11 = ')';
                                                }
                                                bVar18.k();
                                                if (j3.T(bVar18, c11)) {
                                                    bVar18.k();
                                                    String strE3 = bVar18.e(eVarO14, bVar18.o()).e();
                                                    strB = y00.a.b(strE3.substring(r24 == true ? 1 : 0, strE3.length() - 1));
                                                }
                                            }
                                            bVar18.q();
                                        }
                                        strB = null;
                                        bVar18.q();
                                    } else {
                                        strB = null;
                                    }
                                    if (bVar18.l(')')) {
                                        gVar = new pz.g(strB2, strB, 1);
                                    } else {
                                        gVar = null;
                                    }
                                } else {
                                    gVar = null;
                                }
                            } else {
                                gVar = null;
                            }
                            if (gVar != null) {
                                iVar = new a9.i((a0) nVar6.f4005c, strE, (Object) null, gVar.f47232a, gVar.f47233b);
                            } else {
                                this.f54423h.p(eVarO12);
                                b10.b bVar19 = this.f54423h;
                                if (bVar19.l('[')) {
                                    a9.e eVarO15 = bVar19.o();
                                    if (j3.S(bVar19)) {
                                        a9.e eVarO16 = bVar19.o();
                                        if (bVar19.l(']')) {
                                            String strE4 = bVar19.e(eVarO15, eVarO16).e();
                                            if (strE4.length() > 999) {
                                                str = null;
                                            } else {
                                                str = strE4;
                                            }
                                        } else {
                                            str = null;
                                        }
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    this.f54423h.p(eVarO12);
                                }
                                boolean z12 = str == null || str.isEmpty();
                                if (nVar6.f4004b && z12 && a0Var == null) {
                                    iVar2 = null;
                                } else {
                                    iVar = new a9.i((a0) nVar6.f4005c, strE, str, (Object) null, (Object) null);
                                }
                                if (iVar2 == null) {
                                    tVar2 = null;
                                } else {
                                    eVarO = this.f54423h.o();
                                    arrayList = this.f54419d;
                                    size = arrayList.size();
                                    i12 = 0;
                                    while (true) {
                                        if (i12 < size) {
                                            Object obj17 = arrayList.get(i12);
                                            i12++;
                                            bVar = this.f54423h;
                                            ((x00.f) obj17).getClass();
                                            str2 = (String) iVar2.f520d;
                                            if (str2 != null) {
                                                a0Var = a0Var;
                                                fVarA = x00.f.a(iVar2, bVar, str2, (String) iVar2.f521e);
                                            } else {
                                                a0Var = a0Var;
                                                str3 = (String) iVar2.f519c;
                                                if (str3 != null || str3.isEmpty()) {
                                                    str3 = (String) iVar2.f518b;
                                                }
                                                str4 = str3;
                                                fVar2 = (z00.f) ((com.bumptech.glide.j) this.f54416a.f521e).f7639a.get(z00.q.class);
                                                if (fVar2 == null) {
                                                    obj = null;
                                                } else {
                                                    obj = fVar2.f58424b.get(y00.a.a(str4));
                                                }
                                                qVar = (z00.q) obj;
                                                if (qVar != null) {
                                                    fVarA = x00.f.a(iVar2, bVar, qVar.f58441h, qVar.f58442i);
                                                } else {
                                                    fVarA = null;
                                                }
                                            }
                                            if (fVarA == null) {
                                                this.f54423h.p(eVarO);
                                            } else {
                                                tVar2 = (t) fVarA.f4945c;
                                                eVar = (a9.e) fVarA.f4946d;
                                                iVar3 = iVar2;
                                                z11 = fVarA.f4943a;
                                                i13 = j.f54415a[((x00.i) fVarA.f4944b).ordinal()];
                                                if (i13 != 1) {
                                                    this.f54423h.p(eVar);
                                                    tVar3 = tVar5.f58447e;
                                                    while (tVar3 != null) {
                                                        t tVar6 = tVar3.f58447e;
                                                        tVar2.c(tVar3);
                                                        tVar3 = tVar6;
                                                    }
                                                    if (this.f54424i) {
                                                        if (z11 && eVar4 != null) {
                                                            eVar3 = eVar4;
                                                        }
                                                        b10.b bVar20 = this.f54423h;
                                                        tVar2.g(bVar20.e(eVar3, bVar20.o()).g());
                                                    }
                                                    g(bVar17);
                                                    c(tVar2);
                                                    if (z11 && a0Var != null) {
                                                        a0Var.i();
                                                    }
                                                    tVar5.i();
                                                    nVar = (b7.n) this.f54427l.f4010h;
                                                    this.f54427l = nVar;
                                                    if (a0Var == null) {
                                                        while (nVar != null) {
                                                            if (((a0) nVar.f4005c) == null) {
                                                                nVar.f4003a = false;
                                                            }
                                                            nVar = (b7.n) nVar.f4010h;
                                                        }
                                                    }
                                                } else if (i13 != 2) {
                                                    iVar2 = iVar3;
                                                } else {
                                                    this.f54423h.p(eVar);
                                                    while (true) {
                                                        bVar2 = this.f54426k;
                                                        if (bVar2 == null && bVar2 != bVar17) {
                                                            h(bVar2);
                                                        }
                                                    }
                                                    if (this.f54424i) {
                                                        if (z11 && eVar4 != null) {
                                                            eVar3 = eVar4;
                                                        }
                                                        b10.b bVar21 = this.f54423h;
                                                        tVar2.g(bVar21.e(eVar3, bVar21.o()).g());
                                                    }
                                                    this.f54427l = (b7.n) this.f54427l.f4010h;
                                                    if (z11 && a0Var != null) {
                                                        tVar5 = a0Var;
                                                    }
                                                    while (tVar5 != null) {
                                                        t tVar7 = tVar5.f58447e;
                                                        tVar5.i();
                                                        tVar5 = tVar7;
                                                    }
                                                }
                                            }
                                        } else {
                                            tVar2 = null;
                                        }
                                    }
                                }
                                if (tVar2 != null) {
                                    tVarI = tVar2;
                                } else {
                                    this.f54423h.p(eVarO11);
                                    this.f54427l = (b7.n) this.f54427l.f4010h;
                                    tVarI = i(this.f54423h.e(eVarO10, eVarO11));
                                }
                            }
                            iVar2 = iVar;
                            if (iVar2 == null) {
                                tVar2 = null;
                            } else {
                                eVarO = this.f54423h.o();
                                arrayList = this.f54419d;
                                size = arrayList.size();
                                i12 = 0;
                                while (true) {
                                    if (i12 < size) {
                                        Object obj18 = arrayList.get(i12);
                                        i12++;
                                        bVar = this.f54423h;
                                        ((x00.f) obj18).getClass();
                                        str2 = (String) iVar2.f520d;
                                        if (str2 != null) {
                                            a0Var = a0Var;
                                            fVarA = x00.f.a(iVar2, bVar, str2, (String) iVar2.f521e);
                                        } else {
                                            a0Var = a0Var;
                                            str3 = (String) iVar2.f519c;
                                            if (str3 != null) {
                                                str3 = (String) iVar2.f518b;
                                            } else {
                                                str3 = (String) iVar2.f518b;
                                            }
                                            str4 = str3;
                                            fVar2 = (z00.f) ((com.bumptech.glide.j) this.f54416a.f521e).f7639a.get(z00.q.class);
                                            if (fVar2 == null) {
                                                obj = null;
                                            } else {
                                                obj = fVar2.f58424b.get(y00.a.a(str4));
                                            }
                                            qVar = (z00.q) obj;
                                            if (qVar != null) {
                                                fVarA = x00.f.a(iVar2, bVar, qVar.f58441h, qVar.f58442i);
                                            } else {
                                                fVarA = null;
                                            }
                                        }
                                        if (fVarA == null) {
                                            this.f54423h.p(eVarO);
                                        } else {
                                            tVar2 = (t) fVarA.f4945c;
                                            eVar = (a9.e) fVarA.f4946d;
                                            iVar3 = iVar2;
                                            z11 = fVarA.f4943a;
                                            i13 = j.f54415a[((x00.i) fVarA.f4944b).ordinal()];
                                            if (i13 != 1) {
                                                this.f54423h.p(eVar);
                                                tVar3 = tVar5.f58447e;
                                                while (tVar3 != null) {
                                                    t tVar8 = tVar3.f58447e;
                                                    tVar2.c(tVar3);
                                                    tVar3 = tVar8;
                                                }
                                                if (this.f54424i) {
                                                    if (z11) {
                                                        eVar3 = eVar4;
                                                    }
                                                    b10.b bVar22 = this.f54423h;
                                                    tVar2.g(bVar22.e(eVar3, bVar22.o()).g());
                                                }
                                                g(bVar17);
                                                c(tVar2);
                                                if (z11) {
                                                    a0Var.i();
                                                }
                                                tVar5.i();
                                                nVar = (b7.n) this.f54427l.f4010h;
                                                this.f54427l = nVar;
                                                if (a0Var == null) {
                                                    while (nVar != null) {
                                                        if (((a0) nVar.f4005c) == null) {
                                                            nVar.f4003a = false;
                                                        }
                                                        nVar = (b7.n) nVar.f4010h;
                                                    }
                                                }
                                            } else if (i13 != 2) {
                                                iVar2 = iVar3;
                                            } else {
                                                this.f54423h.p(eVar);
                                                while (true) {
                                                    bVar2 = this.f54426k;
                                                    if (bVar2 == null) {
                                                    }
                                                    if (this.f54424i) {
                                                        if (z11) {
                                                            eVar3 = eVar4;
                                                        }
                                                        b10.b bVar23 = this.f54423h;
                                                        tVar2.g(bVar23.e(eVar3, bVar23.o()).g());
                                                    }
                                                    this.f54427l = (b7.n) this.f54427l.f4010h;
                                                    if (z11) {
                                                        tVar5 = a0Var;
                                                    }
                                                    while (tVar5 != null) {
                                                        t tVar9 = tVar5.f58447e;
                                                        tVar5.i();
                                                        tVar5 = tVar9;
                                                    }
                                                    h(bVar2);
                                                }
                                            }
                                        }
                                    } else {
                                        tVar2 = null;
                                    }
                                }
                            }
                            if (tVar2 != null) {
                                tVarI = tVar2;
                            } else {
                                this.f54423h.p(eVarO11);
                                this.f54427l = (b7.n) this.f54427l.f4010h;
                                tVarI = i(this.f54423h.e(eVarO10, eVarO11));
                            }
                        } else {
                            this.f54427l = (b7.n) nVar6.f4010h;
                            tVarI = i(this.f54423h.e(eVarO10, eVarO11));
                        }
                        ArrayList arrayList20 = new ArrayList(1);
                        Object obj19 = new Object[]{tVarI}[0];
                        Objects.requireNonNull(obj19);
                        arrayList20.add(obj19);
                        listUnmodifiableList = Collections.unmodifiableList(arrayList20);
                    }
                    r9 = 1;
                    i11 = 0;
                    UnmodifiableList = listUnmodifiableList;
                } else {
                    this.f54423h.k();
                    Object jVar = this.f54425j >= 2 ? new z00.j() : new x();
                    r9 = 1;
                    ArrayList arrayList21 = new ArrayList(1);
                    i11 = 0;
                    Object obj20 = new Object[]{jVar}[0];
                    Objects.requireNonNull(obj20);
                    arrayList21.add(obj20);
                    UnmodifiableList = Collections.unmodifiableList(arrayList21);
                }
            } else {
                i11 = i16;
                r9 = r23;
                UnmodifiableList = 0;
            }
            if (UnmodifiableList == 0) {
                g(null);
                c(tVar);
                return;
            }
            Iterator it3 = UnmodifiableList.iterator();
            while (it3.hasNext()) {
                tVar.c((t) it3.next());
            }
            bVar8 = null;
            r23 = r9;
            i16 = i11;
        }
    }

    public final a0 f() {
        char cN;
        a9.e eVarO = this.f54423h.o();
        this.f54423h.k();
        while (true) {
            cN = this.f54423h.n();
            if (cN == 0 || this.f54420e.get(cN)) {
                break;
            }
            this.f54423h.k();
        }
        b10.b bVar = this.f54423h;
        a10.f fVarE = bVar.e(eVarO, bVar.o());
        String strE = fVarE.e();
        if (cN == '\n') {
            int length = strE.length() - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (strE.charAt(length) != ' ') {
                    break;
                }
                length--;
            }
            int i11 = length + 1;
            this.f54425j = strE.length() - i11;
            strE = strE.substring(0, i11);
        } else if (cN == 0) {
            strE = strE.substring(0, qx.p.H(strE, strE.length() - 1, 0) + 1);
        }
        a0 a0Var = new a0(strE);
        a0Var.g(fVarE.g());
        return a0Var;
    }

    public final void g(b bVar) {
        boolean z11;
        HashMap map = new HashMap();
        b bVar2 = this.f54426k;
        while (bVar2 != null) {
            b bVar3 = bVar2.f54374f;
            if (bVar3 == bVar) {
                break;
            } else {
                bVar2 = bVar3;
            }
        }
        while (bVar2 != null) {
            ArrayList arrayList = bVar2.f54369a;
            char c11 = bVar2.f54370b;
            d10.a aVar = (d10.a) this.f54418c.get(Character.valueOf(c11));
            if (!bVar2.f54373e || aVar == null) {
                bVar2 = bVar2.f54375g;
            } else {
                char cD = aVar.d();
                b bVar4 = bVar2.f54374f;
                int iA = 0;
                boolean z12 = false;
                while (true) {
                    if (bVar4 == null || bVar4 == bVar || bVar4 == map.get(Character.valueOf(c11))) {
                        z11 = false;
                        break;
                    }
                    if (bVar4.f54372d && bVar4.f54370b == cD) {
                        iA = aVar.a(bVar4, bVar2);
                        if (iA > 0) {
                            z11 = true;
                            z12 = true;
                            break;
                        }
                        z12 = true;
                    }
                    bVar4 = bVar4.f54374f;
                }
                if (z11) {
                    for (int i11 = 0; i11 < iA; i11++) {
                        ((a0) p0.f(1, bVar4.f54369a)).i();
                    }
                    for (int i12 = 0; i12 < iA; i12++) {
                        ((a0) arrayList.remove(0)).i();
                    }
                    b bVar5 = bVar2.f54374f;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.f54374f;
                        h(bVar5);
                        bVar5 = bVar6;
                    }
                    if (bVar4.f54369a.size() == 0) {
                        h(bVar4);
                    }
                    if (arrayList.size() == 0) {
                        b bVar7 = bVar2.f54375g;
                        h(bVar2);
                        bVar2 = bVar7;
                    }
                } else {
                    if (!z12) {
                        map.put(Character.valueOf(c11), bVar2.f54374f);
                        if (!bVar2.f54372d) {
                            h(bVar2);
                        }
                    }
                    bVar2 = bVar2.f54375g;
                }
            }
        }
        while (true) {
            b bVar8 = this.f54426k;
            if (bVar8 == null || bVar8 == bVar) {
                return;
            } else {
                h(bVar8);
            }
        }
    }

    public final void h(b bVar) {
        b bVar2 = bVar.f54374f;
        if (bVar2 != null) {
            bVar2.f54375g = bVar.f54375g;
        }
        b bVar3 = bVar.f54375g;
        if (bVar3 == null) {
            this.f54426k = bVar2;
        } else {
            bVar3.f54374f = bVar2;
        }
    }
}
