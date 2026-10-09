package l1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends xy.i implements fz.f {
    public y.j0 H;
    public int K;
    public /* synthetic */ w0 L;
    public final /* synthetic */ d2 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f39246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f39247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f39248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y.j0 f39249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y.j0 f39250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.j0 f39251f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Set f39252t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, vy.d dVar) {
        super(3, dVar);
        this.M = d2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    public static final void e(d2 d2Var, List list, List list2, List list3, y.j0 j0Var, y.j0 j0Var2, y.j0 j0Var3, y.j0 j0Var4) {
        char c11;
        long j11;
        long j12;
        synchronized (d2Var.f39259d) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i11 = 0; i11 < size; i11++) {
                    z zVar = (z) list3.get(i11);
                    zVar.a();
                    d2Var.L(zVar);
                }
                list3.clear();
                Object[] objArr = j0Var.f56721b;
                long[] jArr = j0Var.f56720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    j11 = 255;
                    while (true) {
                        long j13 = jArr[i12];
                        c11 = 7;
                        j12 = -9187201950435737472L;
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        } else {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j13 & 255) < 128) {
                                    z zVar2 = (z) objArr[(i12 << 3) + i14];
                                    zVar2.a();
                                    d2Var.L(zVar2);
                                }
                                j13 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            } else if (i12 != length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                } else {
                    c11 = 7;
                    j11 = 255;
                    j12 = -9187201950435737472L;
                }
                j0Var.b();
                Object[] objArr2 = j0Var2.f56721b;
                long[] jArr2 = j0Var2.f56720a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j14 = jArr2[i15];
                        if ((((~j14) << c11) & j14 & j12) == j12) {
                            if (i15 != length2) {
                                break;
                                break;
                            }
                            i15++;
                        } else {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j14 & j11) < 128) {
                                    ((z) objArr2[(i15 << 3) + i17]).g();
                                }
                                j14 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            } else if (i15 != length2) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                j0Var2.b();
                j0Var3.b();
                Object[] objArr3 = j0Var4.f56721b;
                long[] jArr3 = j0Var4.f56720a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j15 = jArr3[i18];
                        if ((((~j15) << c11) & j15 & j12) == j12) {
                            if (i18 != length3) {
                                break;
                                break;
                            }
                            i18++;
                        } else {
                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                            for (int i21 = 0; i21 < i19; i21++) {
                                if ((j15 & j11) < 128) {
                                    z zVar3 = (z) objArr3[(i18 << 3) + i21];
                                    zVar3.a();
                                    d2Var.L(zVar3);
                                }
                                j15 >>= 8;
                            }
                            if (i19 != 8) {
                                break;
                            } else if (i18 != length3) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                j0Var4.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void j(List list, d2 d2Var) {
        list.clear();
        synchronized (d2Var.f39259d) {
            try {
                ArrayList arrayList = d2Var.f39267l;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.add((z0) arrayList.get(i11));
                }
                d2Var.f39267l.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c2 c2Var = new c2(this.M, (vy.d) obj3);
        c2Var.L = (w0) obj2;
        return c2Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d0 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x00c8, B:22:0x00d0), top: B:63:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x01db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0125 -> B:44:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01db -> B:12:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
