package y9;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f57498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f57499c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f57501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f[] f57502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a00.k f57503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gy.i f57504h;

    public j(int i11, fz.a aVar) {
        this.f57497a = i11;
        this.f57498b = aVar;
        this.f57502f = new f[i11];
        int i12 = a00.l.f262a;
        this.f57503g = new a00.k(i11);
        gy.i iVar = new gy.i(2);
        if (i11 < 1) {
            z.a.c("capacity must be >= 1");
            throw null;
        }
        if (i11 > 1073741824) {
            z.a.c("capacity must be <= 2^30");
            throw null;
        }
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        iVar.f29898d = i11 - 1;
        iVar.f29899e = new Object[i11];
        this.f57504h = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xy.c cVar) {
        h hVar;
        j jVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.f57489d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f57489d = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f57487b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = hVar.f57489d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            hVar.f57486a = this;
            hVar.f57489d = 1;
            if (this.f57503g.c(hVar) == aVar) {
                return aVar;
            }
            jVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = hVar.f57486a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            ReentrantLock reentrantLock = jVar.f57499c;
            gy.i iVar = jVar.f57504h;
            reentrantLock.lock();
            try {
                if (jVar.f57501e) {
                    com.bumptech.glide.f.H(21, "Connection pool is closed");
                    throw null;
                }
                if (iVar.f29896b == iVar.f29897c && jVar.f57500d < jVar.f57497a) {
                    f fVar = new f((ja.a) jVar.f57498b.invoke());
                    f[] fVarArr = jVar.f57502f;
                    int i13 = jVar.f57500d;
                    jVar.f57500d = i13 + 1;
                    fVarArr[i13] = fVar;
                    iVar.c(fVar);
                }
                int i14 = iVar.f29896b;
                if (i14 == iVar.f29897c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = iVar.f29899e;
                Object obj2 = objArr[i14];
                objArr[i14] = null;
                iVar.f29896b = (i14 + 1) & iVar.f29898d;
                f fVar2 = (f) obj2;
                reentrantLock.unlock();
                return fVar2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            jVar.f57503g.e();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:29:0x0071, B:31:0x0075, B:35:0x007d, B:39:0x0084), top: B:46:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[Catch: all -> 0x0079, TryCatch #1 {all -> 0x0079, blocks: (B:29:0x0071, B:31:0x0075, B:35:0x007d, B:39:0x0084), top: B:46:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:29:0x0071, B:31:0x0075, B:35:0x007d, B:39:0x0084), top: B:46:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:24:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r10, bt.w r12, xy.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof y9.i
            if (r0 == 0) goto L13
            r0 = r13
            y9.i r0 = (y9.i) r0
            int r1 = r0.f57496t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f57496t = r1
            goto L18
        L13:
            y9.i r0 = new y9.i
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f57494e
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f57496t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r10 = r0.f57493d
            kotlin.jvm.internal.y r12 = r0.f57492c
            fz.a r2 = r0.f57491b
            y9.j r5 = r0.f57490a
            com.bumptech.glide.e.F(r13)     // Catch: java.lang.Throwable -> L30
            goto L60
        L30:
            r13 = move-exception
            goto L6c
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            com.bumptech.glide.e.F(r13)
            r5 = r9
        L3e:
            kotlin.jvm.internal.y r13 = new kotlin.jvm.internal.y
            r13.<init>()
            y0.j r2 = new y0.j     // Catch: java.lang.Throwable -> L6a
            r6 = 1
            r2.<init>(r6, r13, r5, r4)     // Catch: java.lang.Throwable -> L6a
            r0.f57490a = r5     // Catch: java.lang.Throwable -> L6a
            r0.f57491b = r12     // Catch: java.lang.Throwable -> L6a
            r0.f57492c = r13     // Catch: java.lang.Throwable -> L6a
            r0.f57493d = r10     // Catch: java.lang.Throwable -> L6a
            r0.f57496t = r3     // Catch: java.lang.Throwable -> L6a
            long r6 = rz.e0.J(r10)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = rz.e0.N(r6, r2, r0)     // Catch: java.lang.Throwable -> L6a
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r2 = r12
            r12 = r13
        L60:
            r13 = r12
            r12 = r2
            r2 = r0
            r0 = r4
            goto L71
        L65:
            r8 = r2
            r2 = r12
            r12 = r13
            r13 = r8
            goto L6c
        L6a:
            r2 = move-exception
            goto L65
        L6c:
            r8 = r13
            r13 = r12
            r12 = r2
            r2 = r0
            r0 = r8
        L71:
            boolean r6 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L7b
            r12.invoke()     // Catch: java.lang.Throwable -> L79
            goto L82
        L79:
            r10 = move-exception
            goto L85
        L7b:
            if (r0 != 0) goto L84
            java.lang.Object r13 = r13.f38361a     // Catch: java.lang.Throwable -> L79
            if (r13 == 0) goto L82
            return r13
        L82:
            r0 = r2
            goto L3e
        L84:
            throw r0     // Catch: java.lang.Throwable -> L79
        L85:
            java.lang.Object r11 = r13.f38361a
            y9.f r11 = (y9.f) r11
            if (r11 == 0) goto L8e
            r5.e(r11)
        L8e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.j.b(long, bt.w, xy.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f57499c;
        reentrantLock.lock();
        try {
            this.f57501e = true;
            for (f fVar : this.f57502f) {
                if (fVar != null) {
                    fVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(StringBuilder sb2) {
        gy.i iVar = this.f57504h;
        ReentrantLock reentrantLock = this.f57499c;
        reentrantLock.lock();
        try {
            sy.c cVarO = ns.o.o();
            int i11 = (iVar.f29897c - iVar.f29896b) & iVar.f29898d;
            for (int i12 = 0; i12 < i11; i12++) {
                if (i12 >= 0) {
                    int i13 = iVar.f29897c;
                    int i14 = iVar.f29896b;
                    int i15 = iVar.f29898d;
                    if (i12 < ((i13 - i14) & i15)) {
                        Object obj = iVar.f29899e[(i14 + i12) & i15];
                        kotlin.jvm.internal.m.c(obj);
                        cVarO.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            sy.c cVarE = ns.o.e(cVarO);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f57497a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            a00.k kVar = this.f57503g;
            kVar.getClass();
            sb3.append(Math.max(a00.j.f259t.get(kVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + cVarE.b() + ")[" + ry.m.y0(cVarE, null, null, null, null, 63) + "], ");
            sb2.append(")");
            sb2.append('\n');
            f[] fVarArr = this.f57502f;
            int length = fVarArr.length;
            int i16 = 0;
            for (int i17 = 0; i17 < length; i17++) {
                f fVar = fVarArr[i17];
                i16++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i16);
                sb4.append("] - ");
                sb4.append(fVar != null ? fVar.f57478a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (fVar != null) {
                    fVar.c(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(f connection) {
        kotlin.jvm.internal.m.f(connection, "connection");
        ReentrantLock reentrantLock = this.f57499c;
        reentrantLock.lock();
        try {
            this.f57504h.c(connection);
            reentrantLock.unlock();
            this.f57503g.e();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
