package vd;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements td.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h7.t f53862j = new h7.t(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.n f53863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final td.g f53864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final td.g f53865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f53868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final td.j f53869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final td.n f53870i;

    public d0(m0.n nVar, td.g gVar, td.g gVar2, int i11, int i12, td.n nVar2, Class cls, td.j jVar) {
        this.f53863b = nVar;
        this.f53864c = gVar;
        this.f53865d = gVar2;
        this.f53866e = i11;
        this.f53867f = i12;
        this.f53870i = nVar2;
        this.f53868g = cls;
        this.f53869h = jVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        Object objG;
        m0.n nVar = this.f53863b;
        synchronized (nVar) {
            wd.e eVar = (wd.e) nVar.f40578d;
            wd.g gVarS0 = (wd.g) ((ArrayDeque) eVar.f3561b).poll();
            if (gVarS0 == null) {
                gVarS0 = eVar.s0();
            }
            wd.d dVar = (wd.d) gVarS0;
            dVar.f55074b = 8;
            dVar.f55075c = byte[].class;
            objG = nVar.g(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objG;
        ByteBuffer.wrap(bArr).putInt(this.f53866e).putInt(this.f53867f).array();
        this.f53865d.a(messageDigest);
        this.f53864c.a(messageDigest);
        messageDigest.update(bArr);
        td.n nVar2 = this.f53870i;
        if (nVar2 != null) {
            nVar2.a(messageDigest);
        }
        this.f53869h.a(messageDigest);
        h7.t tVar = f53862j;
        Class cls = this.f53868g;
        byte[] bytes = (byte[]) tVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(td.g.f52121a);
            tVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f53863b.i(bArr);
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f53867f == d0Var.f53867f && this.f53866e == d0Var.f53866e && pe.m.b(this.f53870i, d0Var.f53870i) && this.f53868g.equals(d0Var.f53868g) && this.f53864c.equals(d0Var.f53864c) && this.f53865d.equals(d0Var.f53865d) && this.f53869h.equals(d0Var.f53869h)) {
                return true;
            }
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        int iHashCode = ((((this.f53865d.hashCode() + (this.f53864c.hashCode() * 31)) * 31) + this.f53866e) * 31) + this.f53867f;
        td.n nVar = this.f53870i;
        if (nVar != null) {
            iHashCode = (iHashCode * 31) + nVar.hashCode();
        }
        return this.f53869h.f52127b.hashCode() + ((this.f53868g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f53864c + ", signature=" + this.f53865d + ", width=" + this.f53866e + ", height=" + this.f53867f + ", decodedResourceClass=" + this.f53868g + ", transformation='" + this.f53870i + "', options=" + this.f53869h + '}';
    }
}
