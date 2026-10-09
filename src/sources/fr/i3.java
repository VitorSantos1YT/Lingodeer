package fr;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements vt.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f27600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.h1 f27601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f27602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.k0 f27603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.l0 f27604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vt.m0 f27605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt.w0 f27606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vt.r0 f27607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vt.e f27608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vt.h f27609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vt.p0 f27610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dv.u0 f27611l;
    public final wt.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vt.b1 f27612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a00.k f27613o;

    public i3(vt.n0 n0Var, vt.h1 h1Var, vt.c cVar, vt.k0 k0Var, vt.v0 v0Var, vt.l0 l0Var, vt.m0 m0Var, vt.w0 w0Var, vt.r0 r0Var, vt.e eVar, vt.h hVar, vt.p0 p0Var, dv.u0 u0Var, wt.a aVar, vt.b1 b1Var) {
        this.f27600a = n0Var;
        this.f27601b = h1Var;
        this.f27602c = cVar;
        this.f27603d = k0Var;
        this.f27604e = l0Var;
        this.f27605f = m0Var;
        this.f27606g = w0Var;
        this.f27607h = r0Var;
        this.f27608i = eVar;
        this.f27609j = hVar;
        this.f27610k = p0Var;
        this.f27611l = u0Var;
        this.m = aVar;
        this.f27612n = b1Var;
        int i11 = a00.l.f262a;
        this.f27613o = new a00.k(3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e A[PHI: r0 r1 r3
      0x004e: PHI (r0v29 java.lang.Object) = (r0v28 java.lang.Object), (r0v1 java.lang.Object) binds: [B:65:0x01a7, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v9 java.lang.String) binds: [B:65:0x01a7, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r3v18 java.util.List) = (r3v17 java.util.List), (r3v25 java.util.List) binds: [B:65:0x01a7, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121 A[LOOP:1: B:45:0x011b->B:47:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x020f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
    
        if (((fr.c0) r1).a(r0, r8) == r9) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(fr.i3 r23, xy.c r24) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.i3.a(fr.i3, xy.c):java.lang.Object");
    }

    public static LinkedHashMap c(String str) {
        int iH0;
        if (str == null || oz.q.K0(str)) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : oz.q.X0(str, new char[]{';'}, 6)) {
            if (!oz.q.K0(str2) && (iH0 = oz.q.H0(str2, ':', 0, 6)) > 0 && iH0 < oz.q.E0(str2)) {
                String strSubstring = str2.substring(0, iH0);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(iH0 + 1);
                kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                if (!oz.q.K0(strSubstring) && !oz.q.K0(strSubstring2)) {
                    linkedHashMap.put(strSubstring, strSubstring2);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:104:0x0401 A[LOOP:6: B:99:0x03e1->B:104:0x0401, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x081e  */
    /* JADX WARN: Code duplicated, block: B:221:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x027b  */
    /* JADX WARN: Code duplicated, block: B:44:0x027e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0282  */
    /* JADX WARN: Code duplicated, block: B:49:0x02a2 A[PHI: r1
      0x02a2: PHI (r1v18 com.lingodeer.data.model.MeUserData) = (r1v17 com.lingodeer.data.model.MeUserData), (r1v19 com.lingodeer.data.model.MeUserData) binds: [B:47:0x029e, B:32:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x02b6 A[PHI: r1
      0x02b6: PHI (r1v20 com.lingodeer.data.model.MeUserData) = (r1v18 com.lingodeer.data.model.MeUserData), (r1v21 com.lingodeer.data.model.MeUserData) binds: [B:50:0x02b2, B:31:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x02ca A[PHI: r1
      0x02ca: PHI (r1v22 com.lingodeer.data.model.MeUserData) = (r1v20 com.lingodeer.data.model.MeUserData), (r1v28 com.lingodeer.data.model.MeUserData) binds: [B:53:0x02c6, B:30:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x030f A[PHI: r1 r17
      0x030f: PHI (r1v31 com.lingodeer.data.model.MeUserData) = (r1v29 com.lingodeer.data.model.MeUserData), (r1v32 com.lingodeer.data.model.MeUserData) binds: [B:67:0x030b, B:28:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r17v3 vt.n0) = (r6v0 vt.n0), (r17v4 vt.n0) binds: [B:67:0x030b, B:28:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0324 A[PHI: r1 r17
      0x0324: PHI (r1v33 com.lingodeer.data.model.MeUserData) = (r1v31 com.lingodeer.data.model.MeUserData), (r1v35 com.lingodeer.data.model.MeUserData) binds: [B:70:0x0320, B:27:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x0324: PHI (r17v5 vt.n0) = (r17v3 vt.n0), (r17v6 vt.n0) binds: [B:70:0x0320, B:27:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0345  */
    /* JADX WARN: Code duplicated, block: B:79:0x035f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0371 A[PHI: r1 r5 r17
      0x0371: PHI (r1v45 kotlin.jvm.internal.y) = (r1v43 kotlin.jvm.internal.y), (r1v46 kotlin.jvm.internal.y) binds: [B:81:0x036d, B:24:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0371: PHI (r5v29 com.lingodeer.data.model.MeUserData) = (r5v27 com.lingodeer.data.model.MeUserData), (r5v30 com.lingodeer.data.model.MeUserData) binds: [B:81:0x036d, B:24:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0371: PHI (r17v11 vt.n0) = (r17v9 vt.n0), (r17v12 vt.n0) binds: [B:81:0x036d, B:24:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x038f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x039b  */
    /* JADX WARN: Code duplicated, block: B:92:0x03a7  */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v41, types: [com.lingodeer.data.model.MeUserData, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43, types: [com.lingodeer.data.model.MeUserData, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45, types: [com.lingodeer.data.model.MeUserData, kotlin.jvm.internal.y, vy.d] */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x058e -> B:124:0x0593). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x059d -> B:126:0x05a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(xy.c r61) {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.i3.b(xy.c):java.lang.Object");
    }

    public final qy.b0 d(xy.c cVar) {
        boolean zBooleanValue = ((Boolean) this.m.f55231b.f53391a.getValue()).booleanValue();
        qy.b0 b0Var = qy.b0.f48488a;
        if (zBooleanValue) {
            ((vt.d) this.f27602c).n(cVar);
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i11, xy.c cVar) {
        m2 m2Var;
        if (cVar instanceof m2) {
            m2Var = (m2) cVar;
            int i12 = m2Var.f27700c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                m2Var.f27700c = i12 - Integer.MIN_VALUE;
            } else {
                m2Var = new m2(this, cVar);
            }
        } else {
            m2Var = new m2(this, cVar);
        }
        Object objK = m2Var.f27698a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i13 = m2Var.f27700c;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objK);
            fz.c o2Var = new o2(i11, this, null);
            m2Var.f27700c = 1;
            objK = k(o2Var, m2Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objK);
        }
        if (((Boolean) objK).booleanValue()) {
            vt.e1 step = vt.e1.BOOKMARK;
            kotlin.jvm.internal.m.f(step, "step");
            return new vt.f1(step, true, false);
        }
        vt.e1 step2 = vt.e1.BOOKMARK;
        kotlin.jvm.internal.m.f(step2, "step");
        return new vt.f1(step2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) {
        p2 p2Var;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i11 = p2Var.f27777c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p2Var.f27777c = i11 - Integer.MIN_VALUE;
            } else {
                p2Var = new p2(this, cVar);
            }
        } else {
            p2Var = new p2(this, cVar);
        }
        Object objJ = p2Var.f27775a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = p2Var.f27777c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objJ);
            q2 q2Var = new q2(this, null, 0);
            p2Var.f27777c = 1;
            objJ = j(q2Var, p2Var);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objJ);
        }
        if (((Boolean) objJ).booleanValue()) {
            vt.e1 step = vt.e1.ME_USER;
            kotlin.jvm.internal.m.f(step, "step");
            return new vt.f1(step, true, false);
        }
        vt.e1 step2 = vt.e1.ME_USER;
        kotlin.jvm.internal.m.f(step2, "step");
        return new vt.f1(step2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(int i11, xy.c cVar) {
        r2 r2Var;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i12 = r2Var.f27814c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                r2Var.f27814c = i12 - Integer.MIN_VALUE;
            } else {
                r2Var = new r2(this, cVar);
            }
        } else {
            r2Var = new r2(this, cVar);
        }
        Object objK = r2Var.f27812a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i13 = r2Var.f27814c;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objK);
            fz.c a3Var = new a3(i11, this, null);
            r2Var.f27814c = 1;
            objK = k(a3Var, r2Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objK);
        }
        if (((Boolean) objK).booleanValue()) {
            vt.e1 step = vt.e1.REVIEW;
            kotlin.jvm.internal.m.f(step, "step");
            return new vt.f1(step, true, false);
        }
        vt.e1 step2 = vt.e1.REVIEW;
        kotlin.jvm.internal.m.f(step2, "step");
        return new vt.f1(step2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(xy.c cVar) {
        b3 b3Var;
        if (cVar instanceof b3) {
            b3Var = (b3) cVar;
            int i11 = b3Var.f27418c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b3Var.f27418c = i11 - Integer.MIN_VALUE;
            } else {
                b3Var = new b3(this, cVar);
            }
        } else {
            b3Var = new b3(this, cVar);
        }
        Object objK = b3Var.f27416a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = b3Var.f27418c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objK);
            fz.c c3Var = new c3(this, null);
            b3Var.f27418c = 1;
            objK = k(c3Var, b3Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objK);
        }
        if (((Boolean) objK).booleanValue()) {
            vt.e1 step = vt.e1.SUB_LEARN;
            kotlin.jvm.internal.m.f(step, "step");
            return new vt.f1(step, true, false);
        }
        vt.e1 step2 = vt.e1.SUB_LEARN;
        kotlin.jvm.internal.m.f(step2, "step");
        return new vt.f1(step2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(int i11, xy.c cVar) {
        d3 d3Var;
        if (cVar instanceof d3) {
            d3Var = (d3) cVar;
            int i12 = d3Var.f27468c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                d3Var.f27468c = i12 - Integer.MIN_VALUE;
            } else {
                d3Var = new d3(this, cVar);
            }
        } else {
            d3Var = new d3(this, cVar);
        }
        Object objK = d3Var.f27466a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i13 = d3Var.f27468c;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objK);
            fz.c f3Var = new f3(i11, this, null);
            d3Var.f27468c = 1;
            objK = k(f3Var, d3Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objK);
        }
        if (((Boolean) objK).booleanValue()) {
            vt.e1 step = vt.e1.UNIT_LESSON;
            kotlin.jvm.internal.m.f(step, "step");
            return new vt.f1(step, true, false);
        }
        vt.e1 step2 = vt.e1.UNIT_LESSON;
        kotlin.jvm.internal.m.f(step2, "step");
        return new vt.f1(step2, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r4.c(r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0057 -> B:24:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(fr.q2 r10, xy.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof fr.g3
            if (r0 == 0) goto L13
            r0 = r11
            fr.g3 r0 = (fr.g3) r0
            int r1 = r0.f27544f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27544f = r1
            goto L18
        L13:
            fr.g3 r0 = new fr.g3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f27542d
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f27544f
            r3 = 2
            a00.k r4 = r9.f27613o
            r5 = 3
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L43
            if (r2 == r7) goto L38
            if (r2 != r3) goto L30
            com.bumptech.glide.e.F(r11)     // Catch: java.lang.Throwable -> L2e
            goto L68
        L2e:
            r10 = move-exception
            goto L71
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            int r10 = r0.f27541c
            int r2 = r0.f27540b
            fz.c r8 = r0.f27539a
            com.bumptech.glide.e.F(r11)
            r11 = r8
            goto L5a
        L43:
            com.bumptech.glide.e.F(r11)
            r11 = r10
            r2 = r5
            r10 = r6
        L49:
            if (r10 >= r2) goto L5c
            r0.f27539a = r11
            r0.f27540b = r2
            r0.f27541c = r10
            r0.f27544f = r7
            java.lang.Object r8 = r4.c(r0)
            if (r8 != r1) goto L5a
            goto L67
        L5a:
            int r10 = r10 + r7
            goto L49
        L5c:
            r10 = 0
            r0.f27539a = r10     // Catch: java.lang.Throwable -> L2e
            r0.f27544f = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r11 = r11.invoke(r0)     // Catch: java.lang.Throwable -> L2e
            if (r11 != r1) goto L68
        L67:
            return r1
        L68:
            if (r6 >= r5) goto L70
            r4.e()
            int r6 = r6 + 1
            goto L68
        L70:
            return r11
        L71:
            if (r6 >= r5) goto L79
            r4.e()
            int r6 = r6 + 1
            goto L71
        L79:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.i3.j(fr.q2, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(fz.c r7, xy.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fr.h3
            if (r0 == 0) goto L13
            r0 = r8
            fr.h3 r0 = (fr.h3) r0
            int r1 = r0.f27570d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27570d = r1
            goto L18
        L13:
            fr.h3 r0 = new fr.h3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27568b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f27570d
            r3 = 2
            r4 = 1
            a00.k r5 = r6.f27613o
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.bumptech.glide.e.F(r8)     // Catch: java.lang.Throwable -> L2c
            goto L5b
        L2c:
            r7 = move-exception
            goto L5f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            xy.i r7 = r0.f27567a
            fz.c r7 = (fz.c) r7
            com.bumptech.glide.e.F(r8)
            goto L4f
        L3e:
            com.bumptech.glide.e.F(r8)
            r8 = r7
            xy.i r8 = (xy.i) r8
            r0.f27567a = r8
            r0.f27570d = r4
            java.lang.Object r8 = r5.c(r0)
            if (r8 != r1) goto L4f
            goto L5a
        L4f:
            r8 = 0
            r0.f27567a = r8     // Catch: java.lang.Throwable -> L2c
            r0.f27570d = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r1) goto L5b
        L5a:
            return r1
        L5b:
            r5.e()
            return r8
        L5f:
            r5.e()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.i3.k(fz.c, xy.c):java.lang.Object");
    }
}
