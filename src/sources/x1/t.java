package x1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import l1.f0;
import l1.g0;
import l1.v2;
import y.i0;
import y.j0;
import y2.u1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f55712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f55713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y.d0 f55714c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55722k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55715d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f55716e = com.bumptech.glide.g.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f55717f = new i0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f55718g = new j0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1.e f55719h = new n1.e(new g0[16]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.r f55720i = new l1.r(this, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f55723l = com.bumptech.glide.g.k();
    public final HashMap m = new HashMap();

    public t(fz.c cVar) {
        this.f55712a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0219 A[DONT_INVERT, PHI: r23
      0x0219: PHI (r23v19 boolean) = (r23v18 boolean), (r23v20 boolean) binds: [B:92:0x01f1, B:100:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x021b A[Catch: all -> 0x012d, LOOP:8: B:91:0x01e7->B:102:0x021b, LOOP_END, TryCatch #1 {all -> 0x012d, blocks: (B:27:0x0084, B:29:0x0088, B:32:0x009c, B:34:0x00ac, B:36:0x00b6, B:38:0x00bc, B:41:0x00d9, B:43:0x00e5, B:45:0x00eb, B:47:0x00ef, B:50:0x0101, B:52:0x010f, B:54:0x0119, B:56:0x011f, B:60:0x0135, B:70:0x016d, B:64:0x0140, B:66:0x014e, B:67:0x0158, B:76:0x0190, B:79:0x01ab, B:82:0x01c3, B:84:0x01cf, B:86:0x01d5, B:88:0x01d9, B:91:0x01e7, B:93:0x01f3, B:95:0x01ff, B:97:0x0205, B:98:0x020f, B:102:0x021b, B:103:0x021e, B:104:0x0224), top: B:324:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02a8 A[DONT_INVERT, PHI: r23
      0x02a8: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:123:0x0280, B:131:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x02aa A[LOOP:6: B:122:0x0276->B:133:0x02aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0428  */
    /* JADX WARN: Code duplicated, block: B:246:0x04fd A[EDGE_INSN: B:246:0x04fd->B:247:0x04fe BREAK  A[LOOP:20: B:230:0x04bc->B:243:0x04f3], PHI: r2
      0x04fd: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v14 boolean) binds: [B:224:0x04a7, B:228:0x04b8, B:244:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x0506  */
    /* JADX WARN: Code duplicated, block: B:274:0x056e A[DONT_INVERT, PHI: r0
      0x056e: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:265:0x0547, B:273:0x056c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x0570 A[LOOP:18: B:264:0x053d->B:275:0x0570, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:335:0x015f A[EDGE_INSN: B:335:0x015f->B:68:0x015f BREAK  A[LOOP:4: B:50:0x0101->B:64:0x0140], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x02b2 A[EDGE_INSN: B:340:0x02b2->B:135:0x02b2 BREAK  A[LOOP:6: B:122:0x0276->B:133:0x02aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x01a6 A[EDGE_INSN: B:345:0x01a6->B:78:0x01a6 BREAK  A[LOOP:8: B:91:0x01e7->B:102:0x021b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x0577 A[EDGE_INSN: B:366:0x0577->B:277:0x0577 BREAK  A[LOOP:18: B:264:0x053d->B:275:0x0570], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[DONT_INVERT, PHI: r23
      0x013e: PHI (r23v29 boolean) = (r23v28 boolean), (r23v30 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: all -> 0x012d, LOOP:4: B:50:0x0101->B:64:0x0140, LOOP_END, TryCatch #1 {all -> 0x012d, blocks: (B:27:0x0084, B:29:0x0088, B:32:0x009c, B:34:0x00ac, B:36:0x00b6, B:38:0x00bc, B:41:0x00d9, B:43:0x00e5, B:45:0x00eb, B:47:0x00ef, B:50:0x0101, B:52:0x010f, B:54:0x0119, B:56:0x011f, B:60:0x0135, B:70:0x016d, B:64:0x0140, B:66:0x014e, B:67:0x0158, B:76:0x0190, B:79:0x01ab, B:82:0x01c3, B:84:0x01cf, B:86:0x01d5, B:88:0x01d9, B:91:0x01e7, B:93:0x01f3, B:95:0x01ff, B:97:0x0205, B:98:0x020f, B:102:0x021b, B:103:0x021e, B:104:0x0224), top: B:324:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    public final boolean a(Set set) throws Throwable {
        long j11;
        boolean z11;
        Iterator it;
        Object obj;
        String str;
        HashMap map;
        int i11;
        boolean z12;
        Iterator it2;
        Object obj2;
        String str2;
        i0 i0Var;
        int i12;
        boolean z13;
        long[] jArr;
        int i13;
        int i14;
        Object[] objArr;
        int i15;
        y.d0 d0Var;
        long[] jArr2;
        l1.g gVar;
        i0 i0Var2;
        Object[] objArr2;
        int i16;
        long[] jArr3;
        l1.g gVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        long j12;
        i0 i0Var3;
        Object[] objArr3;
        boolean z14;
        i0 i0Var4;
        int i22;
        int i23;
        int i24;
        long j13;
        t tVar = this;
        l1.g gVar3 = l1.g.f39303t;
        boolean z15 = set instanceof n1.h;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        n1.e eVar = tVar.f55719h;
        i0 i0Var5 = tVar.f55723l;
        HashMap map2 = tVar.m;
        i0 i0Var6 = tVar.f55716e;
        j0 j0Var = tVar.f55718g;
        if (z15) {
            j0 j0Var2 = ((n1.h) set).f43122a;
            Object[] objArr4 = j0Var2.f56721b;
            long[] jArr4 = j0Var2.f56720a;
            j11 = -9187201950435737472L;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i25 = 0;
                z11 = false;
                while (true) {
                    int i26 = 8;
                    long j14 = jArr4[i25];
                    i0 i0Var7 = i0Var5;
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i25 - length)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & 255) < 128) {
                                Object obj3 = objArr4[(i25 << 3) + i28];
                                jArr3 = jArr4;
                                if (obj3 instanceof z) {
                                    gVar2 = gVar3;
                                    if (!((z) obj3).j(2)) {
                                    }
                                    j14 = j12 >> 8;
                                    i28 = i18 + 1;
                                    i26 = 8;
                                    objArr4 = objArr3;
                                    jArr4 = jArr3;
                                    gVar3 = gVar2;
                                    length = i19;
                                    i25 = i21;
                                    i27 = i17;
                                    i0Var7 = i0Var3;
                                } else {
                                    gVar2 = gVar3;
                                }
                                if (tVar.f55721j) {
                                    i0Var3 = i0Var7;
                                    i17 = i27;
                                    i18 = i28;
                                    i19 = length;
                                    i21 = i25;
                                    j12 = j14;
                                    objArr3 = objArr4;
                                } else {
                                    i0Var3 = i0Var7;
                                    if (i0Var3.c(obj3)) {
                                        tVar.f55721j = true;
                                        try {
                                            Object objG = i0Var3.g(obj3);
                                            if (objG != null) {
                                                objArr3 = objArr4;
                                                try {
                                                    if (objG instanceof j0) {
                                                        j0 j0Var3 = (j0) objG;
                                                        Object[] objArr5 = j0Var3.f56721b;
                                                        long[] jArr5 = j0Var3.f56720a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j12 = j14;
                                                            int i29 = 0;
                                                            while (true) {
                                                                long j15 = jArr5[i29];
                                                                i19 = length;
                                                                i21 = i25;
                                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                                    int i31 = 0;
                                                                    while (i31 < i30) {
                                                                        if ((j15 & 255) < 128) {
                                                                            i23 = i28;
                                                                            g0 g0Var = (g0) objArr5[(i29 << 3) + i31];
                                                                            kotlin.jvm.internal.m.d(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                            i24 = i31;
                                                                            Object obj4 = map2.get(g0Var);
                                                                            j13 = j15;
                                                                            v2 v2Var = g0Var.f39306c;
                                                                            if (v2Var == null) {
                                                                                v2Var = gVar2;
                                                                            }
                                                                            if (v2Var.a(g0Var.m().f39295f, obj4)) {
                                                                                i0Var4 = i0Var3;
                                                                                i22 = i27;
                                                                                eVar.c(g0Var);
                                                                            } else {
                                                                                Object objG2 = i0Var6.g(g0Var);
                                                                                if (objG2 == null) {
                                                                                    i0Var4 = i0Var3;
                                                                                    i22 = i27;
                                                                                } else if (objG2 instanceof j0) {
                                                                                    j0 j0Var4 = (j0) objG2;
                                                                                    Object[] objArr6 = j0Var4.f56721b;
                                                                                    long[] jArr6 = j0Var4.f56720a;
                                                                                    int length3 = jArr6.length - 2;
                                                                                    if (length3 >= 0) {
                                                                                        i22 = i27;
                                                                                        int i32 = 0;
                                                                                        while (true) {
                                                                                            long j16 = jArr6[i32];
                                                                                            i0Var4 = i0Var3;
                                                                                            if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                                if (i32 != length3) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i32++;
                                                                                                i26 = 8;
                                                                                                i0Var3 = i0Var4;
                                                                                            } else {
                                                                                                int i33 = 8 - ((~(i32 - length3)) >>> 31);
                                                                                                for (int i34 = 0; i34 < i33; i34++) {
                                                                                                    if ((j16 & 255) < 128) {
                                                                                                        j0Var.a(objArr6[(i32 << 3) + i34]);
                                                                                                        z11 = true;
                                                                                                    }
                                                                                                    j16 >>= i26;
                                                                                                }
                                                                                                if (i33 != i26) {
                                                                                                    break;
                                                                                                }
                                                                                                if (i32 != length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i32++;
                                                                                                i26 = 8;
                                                                                                i0Var3 = i0Var4;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i0Var4 = i0Var3;
                                                                                        i22 = i27;
                                                                                    }
                                                                                } else {
                                                                                    i0Var4 = i0Var3;
                                                                                    i22 = i27;
                                                                                    j0Var.a(objG2);
                                                                                    z11 = true;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i0Var4 = i0Var3;
                                                                            i22 = i27;
                                                                            i23 = i28;
                                                                            i24 = i31;
                                                                            j13 = j15;
                                                                        }
                                                                        j15 = j13 >> 8;
                                                                        i31 = i24 + 1;
                                                                        i26 = 8;
                                                                        i28 = i23;
                                                                        i27 = i22;
                                                                        i0Var3 = i0Var4;
                                                                    }
                                                                    i0Var3 = i0Var3;
                                                                    i17 = i27;
                                                                    i18 = i28;
                                                                    if (i30 != i26) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i0Var3 = i0Var3;
                                                                    i17 = i27;
                                                                    i18 = i28;
                                                                }
                                                                if (i29 == length2) {
                                                                    break;
                                                                }
                                                                i29++;
                                                                i26 = 8;
                                                                length = i19;
                                                                i25 = i21;
                                                                i28 = i18;
                                                                i27 = i17;
                                                                i0Var3 = i0Var3;
                                                            }
                                                        }
                                                    } else {
                                                        i0Var3 = i0Var3;
                                                        i17 = i27;
                                                        i18 = i28;
                                                        i19 = length;
                                                        i21 = i25;
                                                        j12 = j14;
                                                        g0 g0Var2 = (g0) objG;
                                                        Object obj5 = map2.get(g0Var2);
                                                        v2 v2Var2 = g0Var2.f39306c;
                                                        if (v2Var2 == null) {
                                                            v2Var2 = gVar2;
                                                        }
                                                        if (v2Var2.a(g0Var2.m().f39295f, obj5)) {
                                                            eVar.c(g0Var2);
                                                        } else {
                                                            Object objG3 = i0Var6.g(g0Var2);
                                                            if (objG3 != null) {
                                                                if (objG3 instanceof j0) {
                                                                    j0 j0Var5 = (j0) objG3;
                                                                    Object[] objArr7 = j0Var5.f56721b;
                                                                    long[] jArr7 = j0Var5.f56720a;
                                                                    int length4 = jArr7.length - 2;
                                                                    if (length4 >= 0) {
                                                                        int i35 = 0;
                                                                        while (true) {
                                                                            long j17 = jArr7[i35];
                                                                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i35 != length4) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i35++;
                                                                            } else {
                                                                                int i36 = 8 - ((~(i35 - length4)) >>> 31);
                                                                                for (int i37 = 0; i37 < i36; i37++) {
                                                                                    if ((j17 & 255) < 128) {
                                                                                        j0Var.a(objArr7[(i35 << 3) + i37]);
                                                                                        z11 = true;
                                                                                    }
                                                                                    j17 >>= 8;
                                                                                }
                                                                                if (i36 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i35 != length4) {
                                                                                    break;
                                                                                }
                                                                                i35++;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    j0Var.a(objG3);
                                                                    z11 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    tVar = this;
                                                    tVar.f55721j = false;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z14 = false;
                                                    tVar = this;
                                                    tVar.f55721j = z14;
                                                    throw th;
                                                }
                                            } else {
                                                objArr3 = objArr4;
                                            }
                                            i17 = i27;
                                            i18 = i28;
                                            i19 = length;
                                            i21 = i25;
                                            j12 = j14;
                                            tVar = this;
                                            tVar.f55721j = false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z14 = false;
                                        }
                                    } else {
                                        i0Var3 = i0Var3;
                                        objArr3 = objArr4;
                                        i17 = i27;
                                        i18 = i28;
                                        i19 = length;
                                        i21 = i25;
                                        j12 = j14;
                                    }
                                }
                                Object objG4 = i0Var6.g(obj3);
                                if (objG4 != null) {
                                    if (objG4 instanceof j0) {
                                        j0 j0Var6 = (j0) objG4;
                                        Object[] objArr8 = j0Var6.f56721b;
                                        long[] jArr8 = j0Var6.f56720a;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i38 = 0;
                                            while (true) {
                                                long j18 = jArr8[i38];
                                                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i38 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i38++;
                                                } else {
                                                    int i39 = 8 - ((~(i38 - length5)) >>> 31);
                                                    for (int i40 = 0; i40 < i39; i40++) {
                                                        if ((j18 & 255) < 128) {
                                                            j0Var.a(objArr8[(i38 << 3) + i40]);
                                                            z11 = true;
                                                        }
                                                        j18 >>= 8;
                                                    }
                                                    if (i39 != 8) {
                                                        break;
                                                    }
                                                    if (i38 != length5) {
                                                        break;
                                                    }
                                                    i38++;
                                                }
                                            }
                                        }
                                    } else {
                                        j0Var.a(objG4);
                                        z11 = true;
                                    }
                                }
                                j14 = j12 >> 8;
                                i28 = i18 + 1;
                                i26 = 8;
                                objArr4 = objArr3;
                                jArr4 = jArr3;
                                gVar3 = gVar2;
                                length = i19;
                                i25 = i21;
                                i27 = i17;
                                i0Var7 = i0Var3;
                            } else {
                                jArr3 = jArr4;
                                gVar2 = gVar3;
                            }
                            i17 = i27;
                            i18 = i28;
                            i19 = length;
                            i21 = i25;
                            j12 = j14;
                            i0Var3 = i0Var7;
                            objArr3 = objArr4;
                            j14 = j12 >> 8;
                            i28 = i18 + 1;
                            i26 = 8;
                            objArr4 = objArr3;
                            jArr4 = jArr3;
                            gVar3 = gVar2;
                            length = i19;
                            i25 = i21;
                            i27 = i17;
                            i0Var7 = i0Var3;
                        }
                        jArr2 = jArr4;
                        gVar = gVar3;
                        int i41 = length;
                        int i42 = i25;
                        i0Var2 = i0Var7;
                        objArr2 = objArr4;
                        if (i27 != i26) {
                            break;
                        }
                        length = i41;
                        i16 = i42;
                    } else {
                        jArr2 = jArr4;
                        gVar = gVar3;
                        i0Var2 = i0Var7;
                        objArr2 = objArr4;
                        i16 = i25;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i25 = i16 + 1;
                    objArr4 = objArr2;
                    jArr4 = jArr2;
                    gVar3 = gVar;
                    i0Var5 = i0Var2;
                }
            } else {
                z11 = false;
            }
        } else {
            i0 i0Var8 = i0Var5;
            j11 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z16 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof z) || ((z) next).j(2)) {
                    if (tVar.f55721j) {
                        it = it3;
                        obj = next;
                        str = str3;
                        map = map2;
                        i11 = 0;
                    } else {
                        i0 i0Var9 = i0Var8;
                        if (i0Var9.c(next)) {
                            tVar.f55721j = true;
                            try {
                                Object objG5 = i0Var9.g(next);
                                if (objG5 == null) {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    i0Var8 = i0Var9;
                                    map = map2;
                                } else if (objG5 instanceof j0) {
                                    j0 j0Var7 = (j0) objG5;
                                    Object[] objArr9 = j0Var7.f56721b;
                                    long[] jArr9 = j0Var7.f56720a;
                                    int length6 = jArr9.length - 2;
                                    if (length6 >= 0) {
                                        boolean z17 = z16;
                                        map = map2;
                                        int i43 = 0;
                                        while (true) {
                                            long j19 = jArr9[i43];
                                            long[] jArr10 = jArr9;
                                            Object[] objArr10 = objArr9;
                                            if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i44 = 8 - ((~(i43 - length6)) >>> 31);
                                                long j21 = j19;
                                                int i45 = 0;
                                                while (i45 < i44) {
                                                    if ((j21 & 255) < 128) {
                                                        g0 g0Var3 = (g0) objArr10[(i43 << 3) + i45];
                                                        kotlin.jvm.internal.m.d(g0Var3, str3);
                                                        Object obj6 = map.get(g0Var3);
                                                        it2 = it3;
                                                        v2 v2Var3 = g0Var3.f39306c;
                                                        if (v2Var3 == null) {
                                                            v2Var3 = gVar3;
                                                        }
                                                        str2 = str3;
                                                        if (v2Var3.a(g0Var3.m().f39295f, obj6)) {
                                                            obj2 = next;
                                                            i0Var = i0Var9;
                                                            i12 = i45;
                                                            eVar.c(g0Var3);
                                                        } else {
                                                            Object objG6 = i0Var6.g(g0Var3);
                                                            if (objG6 == null) {
                                                                obj2 = next;
                                                                i0Var = i0Var9;
                                                                i12 = i45;
                                                                z13 = z17;
                                                            } else if (objG6 instanceof j0) {
                                                                j0 j0Var8 = (j0) objG6;
                                                                Object[] objArr11 = j0Var8.f56721b;
                                                                long[] jArr11 = j0Var8.f56720a;
                                                                int length7 = jArr11.length - 2;
                                                                if (length7 >= 0) {
                                                                    i0Var = i0Var9;
                                                                    i12 = i45;
                                                                    int i46 = 0;
                                                                    while (true) {
                                                                        long j22 = jArr11[i46];
                                                                        obj2 = next;
                                                                        Object[] objArr12 = objArr11;
                                                                        if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i47 = 8 - ((~(i46 - length7)) >>> 31);
                                                                            int i48 = 0;
                                                                            while (i48 < i47) {
                                                                                if ((j22 & 255) < 128) {
                                                                                    j0Var.a(objArr12[(i46 << 3) + i48]);
                                                                                    z17 = true;
                                                                                }
                                                                                j22 >>= 8;
                                                                                i48++;
                                                                                jArr11 = jArr11;
                                                                            }
                                                                            jArr = jArr11;
                                                                            if (i47 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr = jArr11;
                                                                        }
                                                                        if (i46 == length7) {
                                                                            break;
                                                                        }
                                                                        i46++;
                                                                        next = obj2;
                                                                        objArr11 = objArr12;
                                                                        jArr11 = jArr;
                                                                    }
                                                                } else {
                                                                    obj2 = next;
                                                                    i0Var = i0Var9;
                                                                    i12 = i45;
                                                                }
                                                                z13 = z17;
                                                            } else {
                                                                obj2 = next;
                                                                i0Var = i0Var9;
                                                                i12 = i45;
                                                                j0Var.a(objG6);
                                                                z13 = true;
                                                            }
                                                            z17 = z13;
                                                        }
                                                    } else {
                                                        it2 = it3;
                                                        obj2 = next;
                                                        str2 = str3;
                                                        i0Var = i0Var9;
                                                        i12 = i45;
                                                    }
                                                    j21 >>= 8;
                                                    i45 = i12 + 1;
                                                    it3 = it2;
                                                    str3 = str2;
                                                    next = obj2;
                                                    i0Var9 = i0Var;
                                                }
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                i0Var8 = i0Var9;
                                                if (i44 != 8) {
                                                    break;
                                                }
                                            } else {
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                i0Var8 = i0Var9;
                                            }
                                            if (i43 == length6) {
                                                break;
                                            }
                                            i43++;
                                            it3 = it;
                                            objArr9 = objArr10;
                                            jArr9 = jArr10;
                                            str3 = str;
                                            next = obj;
                                            i0Var9 = i0Var8;
                                        }
                                        z16 = z17;
                                    } else {
                                        it = it3;
                                        obj = next;
                                        str = str3;
                                        i0Var8 = i0Var9;
                                        map = map2;
                                    }
                                } else {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    i0Var8 = i0Var9;
                                    map = map2;
                                    g0 g0Var4 = (g0) objG5;
                                    Object obj7 = map.get(g0Var4);
                                    v2 v2Var4 = g0Var4.f39306c;
                                    if (v2Var4 == null) {
                                        v2Var4 = gVar3;
                                    }
                                    if (v2Var4.a(g0Var4.m().f39295f, obj7)) {
                                        eVar.c(g0Var4);
                                    } else {
                                        Object objG7 = i0Var6.g(g0Var4);
                                        if (objG7 == null) {
                                            z12 = z16;
                                            break;
                                        }
                                        if (objG7 instanceof j0) {
                                            j0 j0Var9 = (j0) objG7;
                                            Object[] objArr13 = j0Var9.f56721b;
                                            long[] jArr12 = j0Var9.f56720a;
                                            int length8 = jArr12.length - 2;
                                            if (length8 < 0) {
                                                z12 = z16;
                                                break;
                                            }
                                            boolean z18 = z16;
                                            int i49 = 0;
                                            while (true) {
                                                long j23 = jArr12[i49];
                                                if ((((~j23) << 7) & j23 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i50 = 8 - ((~(i49 - length8)) >>> 31);
                                                    long j24 = j23;
                                                    for (int i51 = 0; i51 < i50; i51++) {
                                                        if ((j24 & 255) < 128) {
                                                            j0Var.a(objArr13[(i49 << 3) + i51]);
                                                            z18 = true;
                                                        }
                                                        j24 >>= 8;
                                                    }
                                                    if (i50 != 8) {
                                                        z12 = z18;
                                                        break;
                                                    }
                                                }
                                                if (i49 == length8) {
                                                    z16 = z18;
                                                    z12 = z16;
                                                    break;
                                                }
                                                i49++;
                                            }
                                        } else {
                                            j0Var.a(objG7);
                                            z12 = true;
                                        }
                                        z16 = z12;
                                    }
                                }
                                i11 = 0;
                                tVar.f55721j = false;
                            } catch (Throwable th4) {
                                tVar.f55721j = false;
                                throw th4;
                            }
                        } else {
                            i0Var8 = i0Var9;
                            it = it3;
                            obj = next;
                            str = str3;
                            map = map2;
                            i11 = 0;
                        }
                    }
                    boolean z19 = z16;
                    Object objG8 = i0Var6.g(obj);
                    if (objG8 != null) {
                        if (objG8 instanceof j0) {
                            j0 j0Var10 = (j0) objG8;
                            Object[] objArr14 = j0Var10.f56721b;
                            long[] jArr13 = j0Var10.f56720a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                int i52 = i11;
                                while (true) {
                                    long j25 = jArr13[i52];
                                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i52 != length9) {
                                            break;
                                            break;
                                        }
                                        i52++;
                                    } else {
                                        int i53 = 8 - ((~(i52 - length9)) >>> 31);
                                        for (int i54 = i11; i54 < i53; i54++) {
                                            if ((j25 & 255) < 128) {
                                                j0Var.a(objArr14[(i52 << 3) + i54]);
                                                z19 = true;
                                            }
                                            j25 >>= 8;
                                        }
                                        if (i53 != 8) {
                                            break;
                                        }
                                        if (i52 != length9) {
                                            break;
                                        }
                                        i52++;
                                    }
                                }
                            }
                        } else {
                            j0Var.a(objG8);
                            z19 = true;
                        }
                    }
                    z16 = z19;
                } else {
                    it = it3;
                    str = str3;
                    map = map2;
                }
                it3 = it;
                map2 = map;
                str3 = str;
            }
            z11 = z16;
        }
        int i55 = 0;
        if (!tVar.f55721j && (i13 = eVar.f43114c) != 0) {
            Object[] objArr15 = eVar.f43112a;
            int i56 = 0;
            while (i56 < i13) {
                g0 g0Var5 = (g0) objArr15[i56];
                int iHashCode = Long.hashCode(l.j().g());
                Object objG9 = i0Var6.g(g0Var5);
                if (objG9 != null) {
                    boolean z20 = objG9 instanceof j0;
                    i0 i0Var10 = tVar.f55717f;
                    if (z20) {
                        j0 j0Var11 = (j0) objG9;
                        Object[] objArr16 = j0Var11.f56721b;
                        long[] jArr14 = j0Var11.f56720a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i57 = i55;
                            while (true) {
                                long j26 = jArr14[i57];
                                i15 = i56;
                                if ((((~j26) << 7) & j26 & j11) != j11) {
                                    int i58 = 8 - ((~(i57 - length10)) >>> 31);
                                    int i59 = 0;
                                    while (i59 < i58) {
                                        if ((j26 & 255) < 128) {
                                            Object obj8 = objArr16[(i57 << 3) + i59];
                                            y.d0 d0Var2 = (y.d0) i0Var10.g(obj8);
                                            if (d0Var2 == null) {
                                                d0Var = new y.d0();
                                                i0Var10.m(obj8, d0Var);
                                            } else {
                                                d0Var = d0Var2;
                                            }
                                            tVar.b(g0Var5, iHashCode, obj8, d0Var);
                                        }
                                        j26 >>= 8;
                                        i59++;
                                        i13 = i13;
                                        objArr15 = objArr15;
                                    }
                                    i14 = i13;
                                    objArr = objArr15;
                                    if (i58 != 8) {
                                        break;
                                    }
                                } else {
                                    i14 = i13;
                                    objArr = objArr15;
                                }
                                if (i57 == length10) {
                                    break;
                                }
                                i57++;
                                i56 = i15;
                                i13 = i14;
                                objArr15 = objArr;
                            }
                        } else {
                            i14 = i13;
                            objArr = objArr15;
                            i15 = i56;
                        }
                    } else {
                        i14 = i13;
                        objArr = objArr15;
                        i15 = i56;
                        y.d0 d0Var3 = (y.d0) i0Var10.g(objG9);
                        if (d0Var3 == null) {
                            d0Var3 = new y.d0();
                            i0Var10.m(objG9, d0Var3);
                        }
                        tVar.b(g0Var5, iHashCode, objG9, d0Var3);
                    }
                } else {
                    i14 = i13;
                    objArr = objArr15;
                    i15 = i56;
                }
                i56 = i15 + 1;
                i13 = i14;
                objArr15 = objArr;
                i55 = 0;
            }
            eVar.h();
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i11, Object obj2, y.d0 d0Var) {
        int i12;
        if (this.f55722k > 0) {
            return;
        }
        int iC = d0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i12 = -1;
        } else {
            i12 = d0Var.f56679c[iC];
        }
        d0Var.f56678b[iC] = obj;
        d0Var.f56679c[iC] = i11;
        if ((obj instanceof g0) && i12 != i11) {
            f0 f0VarM = ((g0) obj).m();
            this.m.put(obj, f0VarM.f39295f);
            y.d0 d0Var2 = f0VarM.f39294e;
            i0 i0Var = this.f55723l;
            com.bumptech.glide.g.w(i0Var, obj);
            Object[] objArr = d0Var2.f56678b;
            long[] jArr = d0Var2.f56677a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j11 = jArr[i13];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j11 & 255) < 128) {
                                y yVar = (y) objArr[(i13 << 3) + i15];
                                if (yVar instanceof z) {
                                    ((z) yVar).k(2);
                                }
                                com.bumptech.glide.g.d(i0Var, yVar, obj);
                            }
                            j11 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        } else if (i13 != length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
        if (i12 == -1) {
            if (obj instanceof z) {
                ((z) obj).k(2);
            }
            com.bumptech.glide.g.d(this.f55716e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        i0 i0Var = this.f55716e;
        com.bumptech.glide.g.v(i0Var, obj2, obj);
        if (!(obj2 instanceof g0) || i0Var.c(obj2)) {
            return;
        }
        com.bumptech.glide.g.w(this.f55723l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[LOOP:2: B:16:0x0066->B:28:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[EDGE_INSN: B:48:0x00b0->B:30:0x00b0 BREAK  A[LOOP:2: B:16:0x0066->B:28:0x00a1], SYNTHETIC] */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j11;
        char c11;
        long j12;
        int i11;
        boolean z11;
        i0 i0Var = this.f55717f;
        long[] jArr3 = i0Var.f56713a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j13 = jArr3[i12];
            char c12 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j13 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        c11 = c12;
                        Object obj = i0Var.f56714b[i16];
                        j12 = j14;
                        y.d0 d0Var = (y.d0) i0Var.f56715c[i16];
                        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zR = ((u1) obj).r();
                        if (zR) {
                            jArr2 = jArr3;
                            j11 = j13;
                            z11 = zR;
                        } else {
                            Object[] objArr = d0Var.f56678b;
                            int[] iArr = d0Var.f56679c;
                            long[] jArr4 = d0Var.f56677a;
                            int i17 = i13;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j11 = j13;
                                int i18 = 0;
                                while (true) {
                                    long j15 = jArr4[i18];
                                    long[] jArr5 = jArr4;
                                    z11 = zR;
                                    if ((((~j15) << c11) & j15 & j12) == j12) {
                                        if (i18 != length2) {
                                            break;
                                            break;
                                        }
                                        i18++;
                                        zR = z11;
                                        jArr4 = jArr5;
                                        i17 = 8;
                                    } else {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        for (int i21 = 0; i21 < i19; i21++) {
                                            if ((j15 & 255) < 128) {
                                                int i22 = (i18 << 3) + i21;
                                                Object obj2 = objArr[i22];
                                                int i23 = iArr[i22];
                                                c(obj, obj2);
                                            }
                                            j15 >>= i17;
                                        }
                                        if (i19 != i17) {
                                            break;
                                        }
                                        if (i18 != length2) {
                                            break;
                                        }
                                        i18++;
                                        zR = z11;
                                        jArr4 = jArr5;
                                        i17 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j11 = j13;
                                z11 = zR;
                            }
                        }
                        if (!z11) {
                            i0Var.l(i16);
                        }
                        i11 = 8;
                    } else {
                        jArr2 = jArr3;
                        j11 = j13;
                        c11 = c12;
                        j12 = j14;
                        i11 = i13;
                    }
                    i15++;
                    i13 = i11;
                    j13 = j11 >> i11;
                    c12 = c11;
                    j14 = j12;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i14 != i13) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            jArr3 = jArr;
        }
    }
}
