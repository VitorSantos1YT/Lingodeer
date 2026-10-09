package i00;

import aj.uZCn.evRpcb;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.h0;
import g00.i1;
import h00.d0;
import hh.p0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements h00.k, f00.c, f00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33891a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h00.c f33893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h00.j f33895e;

    public a(h00.c cVar, String str) {
        this.f33893c = cVar;
        this.f33894d = str;
        this.f33895e = cVar.f29916a;
    }

    @Override // f00.c
    public final byte A() {
        return I(U());
    }

    @Override // f00.c
    public final short B() {
        return P(U());
    }

    @Override // f00.c
    public final float C() {
        return L(U());
    }

    @Override // f00.a
    public final long D(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return O(S(descriptor, i11));
    }

    @Override // f00.c
    public final double E() {
        return K(U());
    }

    public abstract h00.m F(String str);

    public final h00.m G() {
        h00.m mVarF;
        String str = (String) ry.m.A0(this.f33891a);
        return (str == null || (mVarF = F(str)) == null) ? T() : mVarF;
    }

    public final boolean H(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (mVarF instanceof d0) {
            d0 d0Var = (d0) mVarF;
            try {
                Boolean boolD = h00.n.d(d0Var);
                if (boolD != null) {
                    return boolD.booleanValue();
                }
                X(d0Var, "boolean", tag);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(d0Var, "boolean", tag);
                throw null;
            }
        }
        throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of boolean at element: " + W(tag));
    }

    public final byte I(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of byte at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        try {
            long j11 = h00.n.j(d0Var);
            Byte bValueOf = (-128 > j11 || j11 > 127) ? null : Byte.valueOf((byte) j11);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(d0Var, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(d0Var, "byte", tag);
            throw null;
        }
    }

    public final char J(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of char at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        try {
            String strB = d0Var.b();
            kotlin.jvm.internal.m.f(strB, "<this>");
            int length = strB.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strB.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(d0Var, "char", tag);
            throw null;
        }
    }

    public final double K(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of double at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        try {
            h0 h0Var = h00.n.f29938a;
            double d5 = Double.parseDouble(d0Var.b());
            h00.j jVar = this.f33893c.f29916a;
            if (Math.abs(d5) <= Double.MAX_VALUE) {
                return d5;
            }
            Double dValueOf = Double.valueOf(d5);
            String output = G().toString();
            kotlin.jvm.internal.m.f(output, "output");
            throw j.d(-1, j.t(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            X(d0Var, "double", tag);
            throw null;
        }
    }

    public final int N(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of int at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        try {
            long j11 = h00.n.j(d0Var);
            Integer numValueOf = (-2147483648L > j11 || j11 > 2147483647L) ? null : Integer.valueOf((int) j11);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(d0Var, "int", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(d0Var, "int", tag);
            throw null;
        }
    }

    public final short P(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of short at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        try {
            long j11 = h00.n.j(d0Var);
            Short shValueOf = (-32768 > j11 || j11 > 32767) ? null : Short.valueOf((short) j11);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(d0Var, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(d0Var, "short", tag);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of string at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        if (!(d0Var instanceof h00.t)) {
            StringBuilder sbQ = p0.q("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbQ.append(W(tag));
            throw j.c(-1, G().toString(), sbQ.toString());
        }
        h00.t tVar = (h00.t) d0Var;
        if (tVar.f29942a || this.f33893c.f29916a.f29931b) {
            return tVar.f29944c;
        }
        StringBuilder sbQ2 = p0.q("String literal for key '", tag, "' should be quoted at element: ");
        sbQ2.append(W(tag));
        sbQ2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw j.c(-1, G().toString(), sbQ2.toString());
    }

    public String R(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return descriptor.g(i11);
    }

    public final String S(e00.g gVar, int i11) {
        kotlin.jvm.internal.m.f(gVar, "<this>");
        String nestedName = R(gVar, i11);
        kotlin.jvm.internal.m.f(nestedName, "nestedName");
        return nestedName;
    }

    public abstract h00.m T();

    public final Object U() {
        ArrayList arrayList = this.f33891a;
        Object objRemove = arrayList.remove(ns.o.A(arrayList));
        this.f33892b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.f33891a;
        return arrayList.isEmpty() ? "$" : ry.m.y0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String currentTag) {
        kotlin.jvm.internal.m.f(currentTag, "currentTag");
        return V() + '.' + currentTag;
    }

    public final void X(d0 d0Var, String str, String str2) {
        throw j.c(-1, G().toString(), "Failed to parse literal '" + d0Var + "' as " + (oz.x.s0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2));
    }

    @Override // f00.a
    public final com.android.billingclient.api.h a() {
        return this.f33893c.f29917b;
    }

    @Override // h00.k
    public final h00.c b() {
        return this.f33893c;
    }

    @Override // f00.a
    public void c(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
    }

    @Override // f00.c
    public f00.a d(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        h00.m mVarG = G();
        o00.a aVarE = descriptor.e();
        boolean zA = kotlin.jvm.internal.m.a(aVarE, e00.m.f24701d);
        h00.c cVar = this.f33893c;
        if (zA || (aVarE instanceof e00.d)) {
            String strA = descriptor.a();
            if (mVarG instanceof h00.e) {
                return new o(cVar, (h00.e) mVarG);
            }
            throw j.c(-1, mVarG.toString(), "Expected " + kotlin.jvm.internal.z.a(h00.e.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarG.getClass()).g() + " as the serialized body of " + strA + " at element: " + V());
        }
        if (!kotlin.jvm.internal.m.a(aVarE, e00.m.f24702e)) {
            String strA2 = descriptor.a();
            if (mVarG instanceof h00.z) {
                return new n(cVar, (h00.z) mVarG, this.f33894d, 8);
            }
            throw j.c(-1, mVarG.toString(), "Expected " + kotlin.jvm.internal.z.a(h00.z.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarG.getClass()).g() + " as the serialized body of " + strA2 + " at element: " + V());
        }
        e00.g gVarE = j.e(descriptor.i(0), cVar.f29917b);
        o00.a aVarE2 = gVarE.e();
        if (!(aVarE2 instanceof e00.f) && !kotlin.jvm.internal.m.a(aVarE2, e00.l.f24699c)) {
            throw j.b(gVarE);
        }
        String strA3 = descriptor.a();
        if (mVarG instanceof h00.z) {
            return new p(cVar, (h00.z) mVarG);
        }
        throw j.c(-1, mVarG.toString(), "Expected " + kotlin.jvm.internal.z.a(h00.z.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarG.getClass()).g() + " as the serialized body of " + strA3 + " at element: " + V());
    }

    @Override // f00.a
    public final double e(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return K(S(descriptor, i11));
    }

    @Override // f00.c
    public final boolean f() {
        return H(U());
    }

    @Override // f00.c
    public final char g() {
        return J(U());
    }

    @Override // f00.a
    public final short h(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return P(S(descriptor, i11));
    }

    @Override // h00.k
    public final h00.m i() {
        return G();
    }

    @Override // f00.c
    public final int j() {
        return N(U());
    }

    @Override // f00.a
    public final String k(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return Q(S(descriptor, i11));
    }

    @Override // f00.c
    public final String l() {
        return Q(U());
    }

    @Override // f00.a
    public final char m(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return J(S(descriptor, i11));
    }

    @Override // f00.c
    public final long o() {
        return O(U());
    }

    @Override // f00.a
    public final int p(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return N(S(descriptor, i11));
    }

    @Override // f00.a
    public final f00.c q(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return M(S(descriptor, i11), descriptor.i(i11));
    }

    @Override // f00.c
    public boolean r() {
        return !(G() instanceof h00.w);
    }

    @Override // f00.a
    public final Object s(e00.g descriptor, int i11, c00.a deserializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        this.f33891a.add(S(descriptor, i11));
        Object objX = (deserializer.getDescriptor().c() || r()) ? x(deserializer) : null;
        if (!this.f33892b) {
            U();
        }
        this.f33892b = false;
        return objX;
    }

    @Override // f00.a
    public final Object t(e00.g descriptor, int i11, c00.a deserializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        this.f33891a.add(S(descriptor, i11));
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        Object objX = x(deserializer);
        if (!this.f33892b) {
            U();
        }
        this.f33892b = false;
        return objX;
    }

    @Override // f00.c
    public final f00.c u(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        if (ry.m.A0(this.f33891a) != null) {
            return M(U(), descriptor);
        }
        return new l(this.f33893c, T(), this.f33894d).u(descriptor);
    }

    @Override // f00.a
    public final float v(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return L(S(descriptor, i11));
    }

    @Override // f00.a
    public final boolean w(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return H(S(descriptor, i11));
    }

    @Override // f00.c
    public final Object x(c00.a deserializer) {
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        if (!(deserializer instanceof g00.b)) {
            return deserializer.deserialize(this);
        }
        h00.c cVar = this.f33893c;
        h00.j jVar = cVar.f29916a;
        c00.c cVar2 = (c00.c) ((g00.b) deserializer);
        String strH = j.h(cVar2.getDescriptor(), cVar);
        h00.m mVarG = G();
        String strA = cVar2.getDescriptor().a();
        if (!(mVarG instanceof h00.z)) {
            throw j.c(-1, mVarG.toString(), "Expected " + kotlin.jvm.internal.z.a(h00.z.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarG.getClass()).g() + " as the serialized body of " + strA + " at element: " + V());
        }
        h00.z zVar = (h00.z) mVarG;
        h00.m mVar = (h00.m) zVar.get(strH);
        String strB = null;
        if (mVar != null) {
            d0 d0VarH = h00.n.h(mVar);
            if (!(d0VarH instanceof h00.w)) {
                strB = d0VarH.b();
            }
        }
        try {
            return j.o(cVar, strH, zVar, o00.a.r((g00.b) deserializer, this, strB));
        } catch (SerializationException e8) {
            String message = e8.getMessage();
            kotlin.jvm.internal.m.c(message);
            throw j.c(-1, zVar.toString(), message);
        }
    }

    @Override // f00.a
    public final byte y(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return I(S(descriptor, i11));
    }

    @Override // f00.c
    public final int z(e00.g enumDescriptor) {
        kotlin.jvm.internal.m.f(enumDescriptor, "enumDescriptor");
        String tag = (String) U();
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        String strA = enumDescriptor.a();
        if (mVarF instanceof d0) {
            return j.j(enumDescriptor, this.f33893c, ((d0) mVarF).b(), BuildConfig.VERSION_NAME);
        }
        throw j.c(-1, mVarF.toString(), "Expected " + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of " + strA + " at element: " + W(tag));
    }

    public final float L(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (!(mVarF instanceof d0)) {
            throw j.c(-1, mVarF.toString(), OYAvlbfUyD.wvthCgKap + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of float at element: " + W(tag));
        }
        d0 d0Var = (d0) mVarF;
        try {
            h0 h0Var = h00.n.f29938a;
            float f5 = Float.parseFloat(d0Var.b());
            h00.j jVar = this.f33893c.f29916a;
            if (Math.abs(f5) <= Float.MAX_VALUE) {
                return f5;
            }
            Float fValueOf = Float.valueOf(f5);
            String output = G().toString();
            kotlin.jvm.internal.m.f(output, "output");
            throw j.d(-1, j.t(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            X(d0Var, "float", tag);
            throw null;
        }
    }

    public final f00.c M(Object obj, e00.g inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        kotlin.jvm.internal.m.f(inlineDescriptor, "inlineDescriptor");
        if (!y.a(inlineDescriptor)) {
            this.f33891a.add(tag);
            return this;
        }
        h00.m mVarF = F(tag);
        String strA = inlineDescriptor.a();
        if (mVarF instanceof d0) {
            String source = ((d0) mVarF).b();
            h00.c json = this.f33893c;
            kotlin.jvm.internal.m.f(json, "json");
            kotlin.jvm.internal.m.f(source, "source");
            return new h(new a.a(source), json);
        }
        throw j.c(-1, mVarF.toString(), ualZoVVCQs.Gpd + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of " + strA + " at element: " + W(tag));
    }

    public final long O(Object obj) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        h00.m mVarF = F(tag);
        if (mVarF instanceof d0) {
            d0 d0Var = (d0) mVarF;
            try {
                return h00.n.j(d0Var);
            } catch (IllegalArgumentException unused) {
                X(d0Var, Constants.LONG, tag);
                throw null;
            }
        }
        throw j.c(-1, mVarF.toString(), evRpcb.dliVMQuD + kotlin.jvm.internal.z.a(d0.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarF.getClass()).g() + " as the serialized body of long at element: " + W(tag));
    }
}
