package i00;

import androidx.drawerlayout.widget.ktFt.FpIL;
import g00.d1;
import g00.h0;
import g00.i1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class m implements h00.q, f00.d, f00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h00.c f33913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f33914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h00.j f33915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f33918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f33919h;

    public m(h00.c cVar, fz.c cVar2, char c11) {
        this.f33912a = new ArrayList();
        this.f33913b = cVar;
        this.f33914c = cVar2;
        this.f33915d = cVar.f29916a;
    }

    @Override // f00.b
    public final void A(e00.g descriptor, int i11, c00.a serializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(serializer, "serializer");
        this.f33912a.add(M(descriptor, i11));
        y(serializer, obj);
    }

    @Override // f00.b
    public final void B(e00.g descriptor, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        String strM = M(descriptor, i11);
        Boolean boolValueOf = Boolean.valueOf(z11);
        h0 h0Var = h00.n.f29938a;
        O(new h00.t(boolValueOf, false, null), strM);
    }

    @Override // f00.d
    public final void C(long j11) {
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.a(Long.valueOf(j11)), tag);
    }

    @Override // f00.d
    public final f00.b D(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return d(descriptor);
    }

    @Override // f00.b
    public final void E(e00.g descriptor, int i11, float f5) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        J(M(descriptor, i11), f5);
    }

    @Override // f00.d
    public final void F(String value) {
        kotlin.jvm.internal.m.f(value, "value");
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.b(value), tag);
    }

    @Override // f00.b
    public final boolean G(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        this.f33915d.getClass();
        return false;
    }

    public final void H(e00.g descriptor, int i11, c00.a serializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(serializer, "serializer");
        this.f33912a.add(M(descriptor, i11));
        super.h(serializer, obj);
    }

    public final void I(Object obj, double d5) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.a(Double.valueOf(d5)), tag);
        this.f33915d.getClass();
        if (Math.abs(d5) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d5);
        String output = L().toString();
        kotlin.jvm.internal.m.f(output, "output");
        throw new JsonEncodingException(j.t(dValueOf, tag, output));
    }

    public final void J(Object obj, float f5) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.a(Float.valueOf(f5)), tag);
        this.f33915d.getClass();
        if (Math.abs(f5) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f5);
        String output = L().toString();
        kotlin.jvm.internal.m.f(output, "output");
        throw new JsonEncodingException(j.t(fValueOf, tag, output));
    }

    public final f00.d K(Object obj, e00.g inlineDescriptor) {
        String tag = (String) obj;
        kotlin.jvm.internal.m.f(tag, "tag");
        kotlin.jvm.internal.m.f(inlineDescriptor, "inlineDescriptor");
        if (y.a(inlineDescriptor)) {
            return new b(this, tag);
        }
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(h00.n.f29938a)) {
            return new b(this, tag, inlineDescriptor);
        }
        this.f33912a.add(tag);
        return this;
    }

    public h00.m L() {
        switch (this.f33918g) {
            case 0:
                h00.m mVar = (h00.m) this.f33919h;
                if (mVar != null) {
                    return mVar;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new h00.z((LinkedHashMap) this.f33919h);
            default:
                return new h00.e((ArrayList) this.f33919h);
        }
    }

    public final String M(e00.g descriptor, int i11) {
        String nestedName;
        kotlin.jvm.internal.m.f(descriptor, "<this>");
        switch (this.f33918g) {
            case 2:
                kotlin.jvm.internal.m.f(descriptor, "descriptor");
                nestedName = String.valueOf(i11);
                break;
            default:
                kotlin.jvm.internal.m.f(descriptor, "descriptor");
                h00.c json = this.f33913b;
                kotlin.jvm.internal.m.f(json, "json");
                j.n(descriptor, json);
                nestedName = descriptor.g(i11);
                break;
        }
        kotlin.jvm.internal.m.f(nestedName, "nestedName");
        return nestedName;
    }

    public final Object N() {
        ArrayList arrayList = this.f33912a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(ns.o.A(arrayList));
    }

    public void O(h00.m element, String key) {
        switch (this.f33918g) {
            case 0:
                kotlin.jvm.internal.m.f(key, "key");
                kotlin.jvm.internal.m.f(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((h00.m) this.f33919h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f33919h = element;
                this.f33914c.invoke(element);
                return;
            case 1:
                kotlin.jvm.internal.m.f(key, "key");
                kotlin.jvm.internal.m.f(element, "element");
                ((LinkedHashMap) this.f33919h).put(key, element);
                return;
            default:
                kotlin.jvm.internal.m.f(key, "key");
                kotlin.jvm.internal.m.f(element, "element");
                ((ArrayList) this.f33919h).add(Integer.parseInt(key), element);
                return;
        }
    }

    @Override // f00.d
    public final com.android.billingclient.api.h a() {
        return this.f33913b.f29917b;
    }

    @Override // h00.q
    public final h00.c b() {
        return this.f33913b;
    }

    @Override // f00.d
    public final f00.b d(e00.g descriptor) {
        m mVar;
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        fz.c nodeConsumer = ry.m.A0(this.f33912a) == null ? this.f33914c : new gr.s(this, 9);
        o00.a aVarE = descriptor.e();
        boolean zA = kotlin.jvm.internal.m.a(aVarE, e00.m.f24701d);
        h00.c cVar = this.f33913b;
        if (zA || (aVarE instanceof e00.d)) {
            mVar = new m(cVar, nodeConsumer, 2);
        } else if (kotlin.jvm.internal.m.a(aVarE, e00.m.f24702e)) {
            e00.g gVarE = j.e(descriptor.i(0), cVar.f29917b);
            o00.a aVarE2 = gVarE.e();
            if (!(aVarE2 instanceof e00.f) && !kotlin.jvm.internal.m.a(aVarE2, e00.l.f24699c)) {
                throw j.b(gVarE);
            }
            kotlin.jvm.internal.m.f(nodeConsumer, "nodeConsumer");
            q qVar = new q(cVar, nodeConsumer, 1);
            qVar.f33931j = true;
            mVar = qVar;
        } else {
            mVar = new m(cVar, nodeConsumer, 1);
        }
        String str = this.f33916e;
        if (str != null) {
            if (mVar instanceof q) {
                q qVar2 = (q) mVar;
                qVar2.O(h00.n.b(str), "key");
                String strA = this.f33917f;
                if (strA == null) {
                    strA = descriptor.a();
                }
                qVar2.O(h00.n.b(strA), "value");
            } else {
                String strA2 = this.f33917f;
                if (strA2 == null) {
                    strA2 = descriptor.a();
                }
                mVar.O(h00.n.b(strA2), str);
            }
            this.f33916e = null;
            this.f33917f = null;
        }
        return mVar;
    }

    @Override // f00.d
    public final void e() {
        String str = (String) ry.m.A0(this.f33912a);
        if (str == null) {
            this.f33914c.invoke(h00.w.INSTANCE);
        } else {
            O(h00.w.INSTANCE, str);
        }
    }

    @Override // h00.q
    public final void f(h00.m element) {
        kotlin.jvm.internal.m.f(element, "element");
        if (this.f33916e == null || (element instanceof h00.z)) {
            y(h00.o.f29939a, element);
        } else {
            j.r(element, this.f33917f);
            throw null;
        }
    }

    @Override // f00.b
    public final void g(int i11, int i12, e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        O(h00.n.a(Integer.valueOf(i12)), M(descriptor, i11));
    }

    @Override // f00.b
    public final void i(i1 descriptor, int i11, byte b3) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        O(h00.n.a(Byte.valueOf(b3)), M(descriptor, i11));
    }

    @Override // f00.d
    public final void j(double d5) {
        I(N(), d5);
    }

    @Override // f00.d
    public final void k(short s3) {
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.a(Short.valueOf(s3)), tag);
    }

    @Override // f00.b
    public final f00.d l(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return K(M(descriptor, i11), descriptor.i(i11));
    }

    @Override // f00.d
    public final void m(byte b3) {
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.a(Byte.valueOf(b3)), tag);
    }

    @Override // f00.b
    public final void n(i1 descriptor, int i11, char c11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        O(h00.n.b(String.valueOf(c11)), M(descriptor, i11));
    }

    @Override // f00.d
    public final void o(boolean z11) {
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        Boolean boolValueOf = Boolean.valueOf(z11);
        h0 h0Var = h00.n.f29938a;
        O(new h00.t(boolValueOf, false, null), tag);
    }

    @Override // f00.d
    public final void p(float f5) {
        J(N(), f5);
    }

    @Override // f00.b
    public final void q(e00.g descriptor, int i11, double d5) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        I(M(descriptor, i11), d5);
    }

    @Override // f00.d
    public final void r(char c11) {
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.b(String.valueOf(c11)), tag);
    }

    @Override // f00.d
    public final void s(e00.g enumDescriptor, int i11) {
        kotlin.jvm.internal.m.f(enumDescriptor, "enumDescriptor");
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.b(enumDescriptor.g(i11)), tag);
    }

    @Override // f00.b
    public final void t(i1 descriptor, int i11, short s3) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        O(h00.n.a(Short.valueOf(s3)), M(descriptor, i11));
    }

    @Override // f00.d
    public final f00.d u(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        if (ry.m.A0(this.f33912a) == null) {
            return new m(this.f33913b, this.f33914c, 0).u(descriptor);
        }
        if (this.f33916e != null) {
            this.f33917f = descriptor.a();
        }
        return K(N(), descriptor);
    }

    @Override // f00.b
    public final void v(e00.g descriptor, int i11, long j11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        O(h00.n.a(Long.valueOf(j11)), M(descriptor, i11));
    }

    @Override // f00.b
    public final void w(e00.g descriptor, int i11, String value) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(value, "value");
        O(h00.n.b(value), M(descriptor, i11));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    @Override // f00.d
    public final void y(c00.a serializer, Object obj) {
        String strH;
        kotlin.jvm.internal.m.f(serializer, "serializer");
        Object objA0 = ry.m.A0(this.f33912a);
        h00.c cVar = this.f33913b;
        if (objA0 == null) {
            e00.g gVarE = j.e(serializer.getDescriptor(), cVar.f29917b);
            if ((gVarE.e() instanceof e00.f) || gVarE.e() == e00.l.f24699c) {
                new m(cVar, this.f33914c, 0).y(serializer, obj);
                return;
            }
        }
        h00.j jVar = cVar.f29916a;
        boolean z11 = serializer instanceof g00.b;
        if (!z11) {
            int i11 = t.f33942a[jVar.f29937h.ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                o00.a aVarE = serializer.getDescriptor().e();
                strH = (kotlin.jvm.internal.m.a(aVarE, e00.m.f24700c) || kotlin.jvm.internal.m.a(aVarE, e00.m.f24703f)) ? j.h(serializer.getDescriptor(), cVar) : null;
            }
        } else if (jVar.f29937h != h00.a.NONE) {
        }
        if (z11) {
            g00.b bVar = (g00.b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + ((c00.c) bVar).getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            c00.a aVarS = o00.a.s(bVar, this, obj);
            if (strH != null) {
                if (serializer instanceof c00.d) {
                    e00.g descriptor = aVarS.getDescriptor();
                    kotlin.jvm.internal.m.f(descriptor, "<this>");
                    if (d1.b(descriptor).contains(strH)) {
                        throw new ClassCastException();
                    }
                }
                j.g(aVarS.getDescriptor().e());
            }
            serializer = aVarS;
        }
        if (strH != null) {
            String strA = serializer.getDescriptor().a();
            this.f33916e = strH;
            this.f33917f = strA;
        }
        serializer.serialize(this, obj);
    }

    @Override // f00.d
    public final void z(int i11) {
        String tag = (String) N();
        kotlin.jvm.internal.m.f(tag, "tag");
        O(h00.n.a(Integer.valueOf(i11)), tag);
    }

    @Override // f00.b
    public final void c(e00.g gVar) {
        kotlin.jvm.internal.m.f(gVar, txBUGYhC.ZglKy);
        if (!this.f33912a.isEmpty()) {
            N();
        }
        this.f33914c.invoke(L());
    }

    @Override // f00.b
    public void x(e00.g gVar, int i11, c00.a serializer, Object obj) {
        switch (this.f33918g) {
            case 1:
                kotlin.jvm.internal.m.f(gVar, FpIL.yQUNrYfqlK);
                kotlin.jvm.internal.m.f(serializer, "serializer");
                if (obj != null || this.f33915d.f29932c) {
                    H(gVar, i11, serializer, obj);
                }
                break;
            default:
                H(gVar, i11, serializer, obj);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(h00.c json, fz.c nodeConsumer, int i11) {
        this(json, nodeConsumer, (char) 0);
        this.f33918g = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(json, "json");
                kotlin.jvm.internal.m.f(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f33919h = new LinkedHashMap();
                break;
            case 2:
                kotlin.jvm.internal.m.f(json, "json");
                kotlin.jvm.internal.m.f(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f33919h = new ArrayList();
                break;
            default:
                kotlin.jvm.internal.m.f(json, "json");
                kotlin.jvm.internal.m.f(nodeConsumer, "nodeConsumer");
                this.f33912a.add("primitive");
                break;
        }
    }
}
