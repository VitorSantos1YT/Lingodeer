package i00;

import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;
import d0.m0;
import h00.d0;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends se.p implements h00.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h00.c f33944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f33945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.a f33946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.android.billingclient.api.h f33947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ax.b f33949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h00.j f33950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f33951h;

    public v(h00.c cVar, a0 mode, a.a aVar, e00.g descriptor, ax.b bVar) {
        kotlin.jvm.internal.m.f(mode, "mode");
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        this.f33944a = cVar;
        this.f33945b = mode;
        this.f33946c = aVar;
        this.f33947d = cVar.f29917b;
        this.f33948e = -1;
        this.f33949f = bVar;
        h00.j jVar = cVar.f29916a;
        this.f33950g = jVar;
        this.f33951h = jVar.f29932c ? null : new i(descriptor);
    }

    @Override // se.p, f00.c
    public final byte A() {
        a.a aVar = this.f33946c;
        long jO = aVar.o();
        byte b3 = (byte) jO;
        if (jO == b3) {
            return b3;
        }
        a.a.u(aVar, "Failed to parse byte for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // se.p, f00.c
    public final short B() {
        a.a aVar = this.f33946c;
        long jO = aVar.o();
        short s3 = (short) jO;
        if (jO == s3) {
            return s3;
        }
        a.a.u(aVar, "Failed to parse short for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // se.p, f00.c
    public final float C() {
        a.a aVar = this.f33946c;
        String strQ = aVar.q();
        try {
            float f5 = Float.parseFloat(strQ);
            if (Math.abs(f5) <= Float.MAX_VALUE) {
                return f5;
            }
            j.q(aVar, Float.valueOf(f5));
            throw null;
        } catch (IllegalArgumentException unused) {
            a.a.u(aVar, nv.p.q("Failed to parse type 'float' for input '", strQ, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // se.p, f00.c
    public final double E() {
        a.a aVar = this.f33946c;
        String strQ = aVar.q();
        try {
            double d5 = Double.parseDouble(strQ);
            if (Math.abs(d5) <= Double.MAX_VALUE) {
                return d5;
            }
            j.q(aVar, Double.valueOf(d5));
            throw null;
        } catch (IllegalArgumentException unused) {
            a.a.u(aVar, nv.p.q("Failed to parse type 'double' for input '", strQ, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // f00.a
    public final com.android.billingclient.api.h a() {
        return this.f33947d;
    }

    @Override // h00.k
    public final h00.c b() {
        return this.f33944a;
    }

    @Override // se.p, f00.a
    public final void c(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        if (descriptor.f() == 0 && j.k(descriptor, this.f33944a)) {
            while (n(descriptor) != -1) {
            }
        }
        a.a aVar = this.f33946c;
        if (aVar.X()) {
            j.l(aVar, BuildConfig.VERSION_NAME);
            throw null;
        }
        aVar.n(this.f33945b.end);
        ij.d dVar = (ij.d) aVar.f6c;
        int i11 = dVar.f34421b;
        int[] iArr = (int[]) dVar.f34423d;
        if (iArr[i11] == -2) {
            iArr[i11] = -1;
            dVar.f34421b = i11 - 1;
        }
        int i12 = dVar.f34421b;
        if (i12 != -1) {
            dVar.f34421b = i12 - 1;
        }
    }

    @Override // se.p, f00.c
    public final f00.a d(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        h00.c cVar = this.f33944a;
        a0 a0VarP = j.p(descriptor, cVar);
        a.a aVar = this.f33946c;
        ij.d dVar = (ij.d) aVar.f6c;
        int i11 = dVar.f34421b + 1;
        dVar.f34421b = i11;
        if (i11 == ((Object[]) dVar.f34422c).length) {
            dVar.C();
        }
        ((Object[]) dVar.f34422c)[i11] = descriptor;
        aVar.n(a0VarP.begin);
        if (aVar.I() == 4) {
            a.a.u(aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int i12 = u.f33943a[a0VarP.ordinal()];
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            return new v(cVar, a0VarP, aVar, descriptor, this.f33949f);
        }
        return (this.f33945b == a0VarP && cVar.f29916a.f29932c) ? this : new v(cVar, a0VarP, aVar, descriptor, this.f33949f);
    }

    @Override // se.p, f00.c
    public final boolean f() {
        boolean z11;
        boolean z12;
        a.a aVar = this.f33946c;
        int iW = aVar.W();
        String str = (String) aVar.f9f;
        if (iW == str.length()) {
            a.a.u(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iW) == '\"') {
            iW++;
            z11 = true;
        } else {
            z11 = false;
        }
        int iK = aVar.K(iW);
        if (iK >= str.length() || iK == -1) {
            a.a.u(aVar, "EOF", 0, null, 6);
            throw null;
        }
        int i11 = iK + 1;
        int iCharAt = str.charAt(iK) | ' ';
        if (iCharAt == 102) {
            aVar.j(i11, "alse");
            z12 = false;
        } else {
            if (iCharAt != 116) {
                a.a.u(aVar, "Expected valid boolean literal prefix, but had '" + aVar.q() + '\'', 0, null, 6);
                throw null;
            }
            aVar.j(i11, "rue");
            z12 = true;
        }
        if (!z11) {
            return z12;
        }
        if (aVar.f5b == str.length()) {
            a.a.u(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(aVar.f5b) == '\"') {
            aVar.f5b++;
            return z12;
        }
        a.a.u(aVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // se.p, f00.c
    public final char g() {
        a.a aVar = this.f33946c;
        String strQ = aVar.q();
        if (strQ.length() == 1) {
            return strQ.charAt(0);
        }
        a.a.u(aVar, nv.p.q("Expected single char, but got '", strQ, '\''), 0, null, 6);
        throw null;
    }

    @Override // h00.k
    public final h00.m i() {
        h00.j jVar = this.f33944a.f29916a;
        com.android.billingclient.api.g gVar = new com.android.billingclient.api.g();
        gVar.f7507c = this.f33946c;
        gVar.f7505a = jVar.f29931b;
        return gVar.b();
    }

    @Override // se.p, f00.c
    public final int j() {
        a.a aVar = this.f33946c;
        long jO = aVar.o();
        int i11 = (int) jO;
        if (jO == i11) {
            return i11;
        }
        a.a.u(aVar, "Failed to parse int for input '" + jO + '\'', 0, null, 6);
        throw null;
    }

    @Override // se.p, f00.c
    public final String l() {
        boolean z11 = this.f33950g.f29931b;
        a.a aVar = this.f33946c;
        return z11 ? aVar.r() : aVar.p();
    }

    @Override // se.p, f00.c
    public final long o() {
        return this.f33946c.o();
    }

    @Override // se.p, f00.c
    public final boolean r() {
        i iVar = this.f33951h;
        return ((iVar != null ? iVar.f33908b : false) || this.f33946c.Y(true)) ? false : true;
    }

    @Override // se.p, f00.a
    public final Object t(e00.g descriptor, int i11, c00.a deserializer, Object obj) {
        ij.d dVar = (ij.d) this.f33946c.f6c;
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        boolean z11 = this.f33945b == a0.MAP && (i11 & 1) == 0;
        if (z11) {
            int[] iArr = (int[]) dVar.f34423d;
            int i12 = dVar.f34421b;
            if (iArr[i12] == -2) {
                ((Object[]) dVar.f34422c)[i12] = k.f33910a;
            }
        }
        Object objT = super.t(descriptor, i11, deserializer, obj);
        if (z11) {
            int[] iArr2 = (int[]) dVar.f34423d;
            int i13 = dVar.f34421b;
            if (iArr2[i13] != -2) {
                int i14 = i13 + 1;
                dVar.f34421b = i14;
                if (i14 == ((Object[]) dVar.f34422c).length) {
                    dVar.C();
                }
            }
            Object[] objArr = (Object[]) dVar.f34422c;
            int i15 = dVar.f34421b;
            objArr[i15] = objT;
            ((int[]) dVar.f34423d)[i15] = -2;
        }
        return objT;
    }

    @Override // se.p, f00.c
    public final f00.c u(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return y.a(descriptor) ? new h(this.f33946c, this.f33944a) : this;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0125, please report this as an issue */
    @Override // se.p, f00.c
    public final Object x(c00.a deserializer) {
        String message;
        h00.c cVar = this.f33944a;
        a.a aVar = this.f33946c;
        ij.d dVar = (ij.d) aVar.f6c;
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof g00.b)) {
                return deserializer.deserialize(this);
            }
            String strH = j.h(((c00.c) ((g00.b) deserializer)).getDescriptor(), cVar);
            String strH2 = aVar.H(strH, this.f33950g.f29931b);
            String strB = null;
            if (strH2 != null) {
                try {
                    c00.a aVarR = o00.a.r((g00.b) deserializer, this, strH2);
                    ax.b bVar = new ax.b();
                    bVar.f3257a = strH;
                    this.f33949f = bVar;
                    return aVarR.deserialize(this);
                } catch (SerializationException e8) {
                    String message2 = e8.getMessage();
                    kotlin.jvm.internal.m.c(message2);
                    String strS0 = oz.q.S0(oz.q.e1(message2, '\n'), ".");
                    String message3 = e8.getMessage();
                    kotlin.jvm.internal.m.c(message3);
                    a.a.u(aVar, strS0, 0, oz.q.Z0(message3, BuildConfig.VERSION_NAME, '\n'), 2);
                    throw null;
                }
            }
            if (!(deserializer instanceof g00.b)) {
                return deserializer.deserialize(this);
            }
            String strH3 = j.h(((c00.c) ((g00.b) deserializer)).getDescriptor(), cVar);
            h00.m mVarI = i();
            String strA = ((c00.c) ((g00.b) deserializer)).getDescriptor().a();
            if (!(mVarI instanceof h00.z)) {
                throw j.c(-1, mVarI.toString(), "Expected " + kotlin.jvm.internal.z.a(h00.z.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarI.getClass()).g() + " as the serialized body of " + strA + " at element: " + dVar.s());
            }
            h00.z zVar = (h00.z) mVarI;
            h00.m mVar = (h00.m) zVar.get(strH3);
            if (mVar != null) {
                d0 d0VarH = h00.n.h(mVar);
                if (!(d0VarH instanceof h00.w)) {
                    strB = d0VarH.b();
                }
            }
            try {
                return j.o(cVar, strH3, zVar, o00.a.r((g00.b) deserializer, this, strB));
            } catch (SerializationException e10) {
                String message4 = e10.getMessage();
                kotlin.jvm.internal.m.c(message4);
                throw j.c(-1, zVar.toString(), message4);
            }
            message = e.getMessage();
            kotlin.jvm.internal.m.c(message);
            if (oz.q.v0(message, "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.f38368a, e.getMessage() + " at path: " + dVar.s(), e);
        } catch (MissingFieldException e11) {
            message = e11.getMessage();
            kotlin.jvm.internal.m.c(message);
            if (oz.q.v0(message, "at path", false)) {
                throw e11;
            }
            throw new MissingFieldException(e11.f38368a, e11.getMessage() + " at path: " + dVar.s(), e11);
        }
    }

    @Override // se.p, f00.c
    public final int z(e00.g enumDescriptor) {
        kotlin.jvm.internal.m.f(enumDescriptor, "enumDescriptor");
        return j.j(enumDescriptor, this.f33944a, l(), " at path " + ((ij.d) this.f33946c.f6c).s());
    }

    /* JADX WARN: Code duplicated, block: B:196:0x021f A[EDGE_INSN: B:196:0x021f->B:124:0x021f BREAK  A[LOOP:1: B:89:0x018f->B:94:0x01a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x01a0 A[SYNTHETIC] */
    @Override // f00.a
    public final int n(e00.g descriptor) {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        char c11;
        String strJ;
        a.a aVar = this.f33946c;
        ij.d dVar = (ij.d) aVar.f6c;
        String str = (String) aVar.f9f;
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        int[] iArr = u.f33943a;
        a0 a0Var = this.f33945b;
        int i13 = iArr[a0Var.ordinal()];
        char c12 = ':';
        boolean zX = false;
        int i14 = 0;
        zX = false;
        boolean z13 = true;
        int i15 = -1;
        if (i13 == 2) {
            int i16 = this.f33948e;
            boolean z14 = i16 % 2 != 0;
            if (z14) {
                i11 = -1;
                if (i16 != -1) {
                    zX = aVar.X();
                }
            } else {
                i11 = -1;
                aVar.n(':');
            }
            if (aVar.i()) {
                if (z14) {
                    if (this.f33948e == i11) {
                        int i17 = aVar.f5b;
                        if (zX) {
                            a.a.u(aVar, scNRoQgKSYX.wch, i17, null, 4);
                            throw null;
                        }
                    } else {
                        int i18 = aVar.f5b;
                        if (!zX) {
                            a.a.u(aVar, "Expected comma after the key-value pair", i18, null, 4);
                            throw null;
                        }
                    }
                }
                i15 = this.f33948e + 1;
                this.f33948e = i15;
            } else {
                if (zX) {
                    j.l(aVar, "object");
                    throw null;
                }
                i15 = i11;
            }
        } else if (i13 == 4) {
            boolean zX2 = aVar.X();
            while (true) {
                boolean zI = aVar.i();
                i iVar = this.f33951h;
                if (zI) {
                    h00.j jVar = this.f33950g;
                    boolean z15 = jVar.f29931b;
                    int i19 = i15;
                    String strR = z15 ? aVar.r() : aVar.k();
                    aVar.n(c12);
                    h00.c cVar = this.f33944a;
                    i12 = j.i(descriptor, cVar, strR);
                    if (i12 != -3) {
                        if (jVar.f29934e) {
                            boolean zJ = descriptor.j(i12);
                            e00.g gVarI = descriptor.i(i12);
                            if (zJ && !gVarI.c() && aVar.Y(z13)) {
                                z11 = z13;
                            } else {
                                z11 = z13;
                                if (kotlin.jvm.internal.m.a(gVarI.e(), e00.l.f24699c) && ((!gVarI.c() || !aVar.Y(false)) && (strJ = aVar.J(z15)) != null)) {
                                    int i21 = j.i(gVarI, cVar, strJ);
                                    boolean z16 = (cVar.f29916a.f29932c || !gVarI.c()) ? false : z11;
                                    if (i21 == -3 && (zJ || z16)) {
                                        aVar.p();
                                    }
                                }
                            }
                            zX2 = aVar.X();
                            z12 = false;
                        }
                        if (iVar != null) {
                            g00.x xVar = iVar.f33907a;
                            if (i12 < 64) {
                                xVar.f28489c |= 1 << i12;
                            } else {
                                int i22 = (i12 >>> 6) - 1;
                                long[] jArr = xVar.f28490d;
                                jArr[i22] = (1 << (i12 & 63)) | jArr[i22];
                            }
                        }
                    } else {
                        z11 = z13;
                        z12 = z11;
                        zX2 = false;
                    }
                    if (z12) {
                        if (!j.k(descriptor, cVar)) {
                            ax.b bVar = this.f33949f;
                            if (bVar == null || !kotlin.jvm.internal.m.a(bVar.f3257a, strR)) {
                                int i23 = dVar.f34421b;
                                int[] iArr2 = (int[]) dVar.f34423d;
                                if (iArr2[i23] == -2) {
                                    iArr2[i23] = i19;
                                    dVar.f34421b = i23 - 1;
                                }
                                int i24 = dVar.f34421b;
                                if (i24 != i19) {
                                    dVar.f34421b = i24 + i19;
                                }
                                int iM0 = oz.q.M0(6, str.subSequence(0, aVar.f5b).toString(), strR);
                                StringBuilder sbQ = defpackage.e.q(iM0, "Encountered an unknown key '", strR, "' at offset ", " at path: ");
                                sbQ.append(dVar.s());
                                sbQ.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                                sbQ.append((Object) j.m(str, iM0));
                                throw new JsonDecodingException(sbQ.toString());
                            }
                            bVar.f3257a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bI = aVar.I();
                        if (bI == 8 || bI == 6) {
                            while (true) {
                                byte bI2 = aVar.I();
                                if (bI2 != z11) {
                                    if (bI2 != 8) {
                                        if (bI2 == 6) {
                                            c11 = 6;
                                        } else {
                                            if (bI2 == 9) {
                                                if (((Number) ry.m.z0(arrayList)).byteValue() != 8) {
                                                    throw j.c(aVar.f5b, str, "found ] instead of } at path: " + dVar);
                                                }
                                                ry.m.M0(arrayList);
                                            } else if (bI2 == 7) {
                                                if (((Number) ry.m.z0(arrayList)).byteValue() != 6) {
                                                    throw j.c(aVar.f5b, str, "found } instead of ] at path: " + dVar);
                                                }
                                                ry.m.M0(arrayList);
                                            } else if (bI2 == 10) {
                                                a.a.u(aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                throw null;
                                            }
                                            i14 = 0;
                                            c11 = 6;
                                        }
                                        aVar.l();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    } else {
                                        c11 = 6;
                                    }
                                    i14 = 0;
                                    arrayList.add(Byte.valueOf(bI2));
                                    aVar.l();
                                    if (arrayList.size() == 0) {
                                        break;
                                        break;
                                    }
                                } else if (z15) {
                                    aVar.q();
                                } else {
                                    aVar.k();
                                }
                                z11 = true;
                            }
                        } else {
                            aVar.q();
                            i14 = 0;
                            c11 = 6;
                        }
                        zX2 = aVar.X();
                        c12 = ':';
                    } else {
                        c12 = ':';
                        i14 = 0;
                    }
                    z13 = true;
                    i15 = -1;
                } else if (!zX2) {
                    if (iVar == null) {
                        i15 = -1;
                        break;
                    }
                    g00.x xVar2 = iVar.f33907a;
                    m0 m0Var = xVar2.f28488b;
                    e00.g gVar = xVar2.f28487a;
                    int iF = gVar.f();
                    while (true) {
                        long j11 = xVar2.f28489c;
                        if (j11 == -1) {
                            if (iF > 64) {
                                long[] jArr2 = xVar2.f28490d;
                                int length = jArr2.length;
                                while (true) {
                                    if (i14 < length) {
                                        int i25 = i14 + 1;
                                        int i26 = i25 * 64;
                                        long j12 = jArr2[i14];
                                        while (true) {
                                            if (j12 != -1) {
                                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j12);
                                                j12 |= 1 << iNumberOfTrailingZeros;
                                                i12 = iNumberOfTrailingZeros + i26;
                                                if (((Boolean) m0Var.invoke(gVar, Integer.valueOf(i12))).booleanValue()) {
                                                    jArr2[i14] = j12;
                                                }
                                            } else {
                                                jArr2[i14] = j12;
                                                i14 = i25;
                                            }
                                        }
                                    }
                                }
                            }
                            i15 = -1;
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j11);
                        xVar2.f28489c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) m0Var.invoke(gVar, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i15 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    j.l(aVar, "object");
                    throw null;
                }
                i15 = i12;
                break;
            }
        } else {
            boolean zX3 = aVar.X();
            if (aVar.i()) {
                int i27 = this.f33948e;
                if (i27 != -1 && !zX3) {
                    a.a.u(aVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i15 = i27 + 1;
                this.f33948e = i15;
            } else if (zX3) {
                j.l(aVar, "array");
                throw null;
            }
        }
        if (a0Var != a0.MAP) {
            ((int[]) dVar.f34423d)[dVar.f34421b] = i15;
        }
        return i15;
    }
}
