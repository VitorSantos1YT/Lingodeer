package e9;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final double[] f25249r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x7.e0 f25251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq.c f25252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b7.w f25254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f25255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f25256g = new boolean[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f25257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25261l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f25265q;

    public j(xq.c cVar, String str) {
        this.f25252c = cVar;
        this.f25253d = str;
        i iVar = new i();
        iVar.f25248d = new byte[128];
        this.f25257h = iVar;
        if (cVar != null) {
            this.f25255f = new w(178);
            this.f25254e = new b7.w();
        } else {
            this.f25255f = null;
            this.f25254e = null;
        }
        this.m = -9223372036854775807L;
        this.f25263o = -9223372036854775807L;
    }

    @Override // e9.h
    public final void a() {
        c7.q.a(this.f25256g);
        i iVar = this.f25257h;
        iVar.f25245a = false;
        iVar.f25246b = 0;
        iVar.f25247c = 0;
        w wVar = this.f25255f;
        if (wVar != null) {
            wVar.d();
        }
        this.f25258i = 0L;
        this.f25259j = false;
        this.m = -9223372036854775807L;
        this.f25263o = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
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
    @Override // e9.h
    public final void c(b7.w wVar) {
        i iVar;
        w wVar2;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        float f5;
        int i13;
        float f11;
        int i14;
        long j11;
        b7.a.k(this.f25251b);
        int i15 = wVar.f4040b;
        int i16 = wVar.f4041c;
        byte[] bArr = wVar.f4039a;
        this.f25258i += (long) wVar.a();
        boolean z13 = false;
        this.f25251b.a(wVar, wVar.a(), 0);
        while (true) {
            int iB = c7.q.b(bArr, i15, i16, this.f25256g);
            iVar = this.f25257h;
            wVar2 = this.f25255f;
            if (iB == i16) {
                break;
            }
            int i17 = iB + 3;
            int i18 = wVar.f4039a[i17] & 255;
            int i19 = iB - i15;
            if (this.f25260k) {
                i11 = i16;
            } else {
                if (i19 > 0) {
                    iVar.a(bArr, i15, iB);
                }
                ?? r12 = i19 < 0 ? -i19 : z13;
                if (iVar.f25245a) {
                    ?? r15 = iVar.f25246b - r12;
                    iVar.f25246b = r15;
                    if (iVar.f25247c == 0 && i18 == 181) {
                        iVar.f25247c = r15;
                        i11 = i16;
                    } else {
                        iVar.f25245a = z13;
                        String str = this.f25250a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(iVar.f25248d, iVar.f25246b);
                        int i21 = bArrCopyOf[4] & 255;
                        byte b3 = bArrCopyOf[5];
                        i11 = i16;
                        int i22 = ((b3 & 255) >> 4) | (i21 << 4);
                        int i23 = (bArrCopyOf[6] & 255) | ((b3 & 15) << 8);
                        int i24 = (bArrCopyOf[7] & 240) >> 4;
                        if (i24 == 2) {
                            f5 = i23 * 4;
                            i13 = i22 * 3;
                        } else if (i24 != 3) {
                            if (i24 != 4) {
                                f11 = 1.0f;
                            } else {
                                f5 = i23 * 121;
                                i13 = i22 * 100;
                            }
                            y6.o oVar = new y6.o();
                            oVar.f57253a = str;
                            oVar.f57264l = y6.d0.o(this.f25253d);
                            oVar.m = y6.d0.o("video/mpeg2");
                            oVar.f57271t = i22;
                            oVar.f57272u = i23;
                            oVar.f57277z = f11;
                            oVar.f57267p = Collections.singletonList(bArrCopyOf);
                            y6.p pVar = new y6.p(oVar);
                            i14 = (bArrCopyOf[7] & 15) - 1;
                            if (i14 >= 0 || i14 >= 8) {
                                j11 = 0;
                            } else {
                                double d5 = f25249r[i14];
                                byte b11 = bArrCopyOf[iVar.f25247c + 9];
                                int i25 = (b11 & 96) >> 5;
                                int i26 = b11 & 31;
                                if (i25 != i26) {
                                    d5 *= (((double) i25) + 1.0d) / ((double) (i26 + 1));
                                }
                                j11 = (long) (1000000.0d / d5);
                            }
                            Pair pairCreate = Pair.create(pVar, Long.valueOf(j11));
                            this.f25251b.b((y6.p) pairCreate.first);
                            this.f25261l = ((Long) pairCreate.second).longValue();
                            this.f25260k = true;
                        } else {
                            f5 = i23 * 16;
                            i13 = i22 * 9;
                        }
                        f11 = f5 / i13;
                        y6.o oVar2 = new y6.o();
                        oVar2.f57253a = str;
                        oVar2.f57264l = y6.d0.o(this.f25253d);
                        oVar2.m = y6.d0.o("video/mpeg2");
                        oVar2.f57271t = i22;
                        oVar2.f57272u = i23;
                        oVar2.f57277z = f11;
                        oVar2.f57267p = Collections.singletonList(bArrCopyOf);
                        y6.p pVar2 = new y6.p(oVar2);
                        i14 = (bArrCopyOf[7] & 15) - 1;
                        if (i14 >= 0) {
                            j11 = 0;
                        } else {
                            j11 = 0;
                        }
                        Pair pairCreate2 = Pair.create(pVar2, Long.valueOf(j11));
                        this.f25251b.b((y6.p) pairCreate2.first);
                        this.f25261l = ((Long) pairCreate2.second).longValue();
                        this.f25260k = true;
                    }
                } else {
                    i11 = i16;
                    if (i18 == 179) {
                        iVar.f25245a = true;
                    }
                }
                iVar.a(i.f25244e, 0, 3);
            }
            if (wVar2 == null) {
                z11 = true;
            } else {
                if (i19 > 0) {
                    wVar2.a(bArr, i15, iB);
                    i12 = 0;
                } else {
                    i12 = -i19;
                }
                if (wVar2.b(i12)) {
                    int iL = c7.q.l((byte[]) wVar2.f25425e, wVar2.f25424d);
                    String str2 = b7.f0.f3975a;
                    byte[] bArr2 = (byte[]) wVar2.f25425e;
                    b7.w wVar3 = this.f25254e;
                    wVar3.G(bArr2, iL);
                    this.f25252c.q(this.f25263o, wVar3);
                }
                if (i18 == 178) {
                    z11 = true;
                    if (wVar.f4039a[iB + 2] == 1) {
                        wVar2.e(i18);
                    }
                } else {
                    z11 = true;
                }
            }
            if (i18 == 0 || i18 == 179) {
                int i27 = i11 - iB;
                if (this.f25265q && this.f25260k) {
                    long j12 = this.f25263o;
                    if (j12 != -9223372036854775807L) {
                        this.f25251b.d(j12, this.f25264p ? 1 : 0, ((int) (this.f25258i - this.f25262n)) - i27, i27, null);
                    }
                }
                if (!this.f25259j || this.f25265q) {
                    this.f25262n = this.f25258i - ((long) i27);
                    long j13 = this.m;
                    if (j13 == -9223372036854775807L) {
                        long j14 = this.f25263o;
                        j13 = j14 != -9223372036854775807L ? j14 + this.f25261l : -9223372036854775807L;
                    }
                    this.f25263o = j13;
                    z13 = false;
                    this.f25264p = false;
                    this.m = -9223372036854775807L;
                    z12 = true;
                    this.f25259j = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                this.f25265q = i18 == 0 ? z12 : z13;
            } else {
                if (i18 == 184) {
                    this.f25264p = z11;
                }
                z13 = false;
            }
            i15 = i17;
            i16 = i11;
        }
        if (!this.f25260k) {
            iVar.a(bArr, i15, i16);
        }
        if (wVar2 != null) {
            wVar2.a(bArr, i15, i16);
        }
    }

    @Override // e9.h
    public final void d(x7.o oVar, b10.b bVar) {
        bVar.d();
        bVar.j();
        this.f25250a = (String) bVar.f3850e;
        bVar.j();
        this.f25251b = oVar.v(bVar.f3848c, 2);
        xq.c cVar = this.f25252c;
        if (cVar != null) {
            cVar.s(oVar, bVar);
        }
    }

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
    @Override // e9.h
    public final void e(boolean z11) {
        b7.a.k(this.f25251b);
        if (z11) {
            boolean z12 = this.f25264p;
            this.f25251b.d(this.f25263o, z12 ? 1 : 0, (int) (this.f25258i - this.f25262n), 0, null);
        }
    }

    @Override // e9.h
    public final void f(int i11, long j11) {
        this.m = j11;
    }
}
