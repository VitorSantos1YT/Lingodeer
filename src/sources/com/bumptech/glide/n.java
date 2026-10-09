package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.i1;
import ce.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends le.a {
    public final Context S;
    public final p T;
    public final Class U;
    public final i V;
    public q W;
    public Object X;
    public ArrayList Y;
    public n Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public n f7687a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7688b0 = true;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f7689c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f7690d0;

    static {
    }

    public n(c cVar, p pVar, Class cls, Context context) {
        le.g gVar;
        this.T = pVar;
        this.U = cls;
        this.S = context;
        y.e eVar = pVar.f7693a.f7609d.f7634f;
        q qVar = (q) eVar.get(cls);
        if (qVar == null) {
            for (Map.Entry entry : (i1) eVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    qVar = (q) entry.getValue();
                }
            }
        }
        this.W = qVar == null ? i.f7628k : qVar;
        this.V = cVar.f7609d;
        Iterator it = pVar.K.iterator();
        while (it.hasNext()) {
            t((le.f) it.next());
        }
        synchronized (pVar) {
            gVar = pVar.L;
        }
        a(gVar);
    }

    public final n A(ee.d dVar) {
        if (this.P) {
            return clone().A(dVar);
        }
        this.W = dVar;
        this.f7688b0 = false;
        m();
        return this;
    }

    @Override // le.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return super.equals(nVar) && Objects.equals(this.U, nVar.U) && this.W.equals(nVar.W) && Objects.equals(this.X, nVar.X) && Objects.equals(this.Y, nVar.Y) && Objects.equals(this.Z, nVar.Z) && Objects.equals(this.f7687a0, nVar.f7687a0) && this.f7688b0 == nVar.f7688b0 && this.f7689c0 == nVar.f7689c0;
    }

    @Override // le.a
    public final int hashCode() {
        return pe.m.g(this.f7689c0 ? 1 : 0, pe.m.g(this.f7688b0 ? 1 : 0, pe.m.h(pe.m.h(pe.m.h(pe.m.h(pe.m.h(pe.m.h(pe.m.h(super.hashCode(), this.U), this.W), this.X), this.Y), this.Z), this.f7687a0), null)));
    }

    public final n t(le.f fVar) {
        if (this.P) {
            return clone().t(fVar);
        }
        if (fVar != null) {
            if (this.Y == null) {
                this.Y = new ArrayList();
            }
            this.Y.add(fVar);
        }
        m();
        return this;
    }

    @Override // le.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final n a(le.a aVar) {
        pe.f.b(aVar);
        return (n) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final le.c v(Object obj, me.d dVar, le.e eVar, q qVar, k kVar, int i11, int i12, le.a aVar) {
        le.e eVar2;
        le.e bVar;
        le.a aVar2;
        le.c iVar;
        k kVar2;
        if (this.f7687a0 != null) {
            bVar = new le.b(obj, eVar);
            eVar2 = bVar;
        } else {
            eVar2 = null;
            bVar = eVar;
        }
        n nVar = this.Z;
        if (nVar == null) {
            Context context = this.S;
            i iVar2 = this.V;
            aVar2 = aVar;
            iVar = new le.i(context, iVar2, obj, this.X, this.U, aVar2, i11, i12, kVar, dVar, this.Y, bVar, iVar2.f7635g, qVar.f7700a);
        } else {
            if (this.f7690d0) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            q qVar2 = nVar.f7688b0 ? qVar : nVar.W;
            if (le.a.h(nVar.f39912a, 8)) {
                kVar2 = this.Z.f39914c;
            } else {
                int i13 = m.f7686b[kVar.ordinal()];
                if (i13 == 1) {
                    kVar2 = k.NORMAL;
                } else if (i13 == 2) {
                    kVar2 = k.HIGH;
                } else {
                    if (i13 != 3 && i13 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f39914c);
                    }
                    kVar2 = k.IMMEDIATE;
                }
            }
            k kVar3 = kVar2;
            n nVar2 = this.Z;
            int i14 = nVar2.f39918t;
            int i15 = nVar2.f39917f;
            if (pe.m.i(i11, i12)) {
                n nVar3 = this.Z;
                if (!pe.m.i(nVar3.f39918t, nVar3.f39917f)) {
                    i14 = aVar.f39918t;
                    i15 = aVar.f39917f;
                }
            }
            int i16 = i15;
            le.j jVar = new le.j(obj, bVar);
            Context context2 = this.S;
            le.j jVar2 = jVar;
            i iVar3 = this.V;
            le.i iVar4 = new le.i(context2, iVar3, obj, this.X, this.U, aVar, i11, i12, kVar, dVar, this.Y, jVar2, iVar3.f7635g, qVar.f7700a);
            this.f7690d0 = true;
            n nVar4 = this.Z;
            le.c cVarV = nVar4.v(obj, dVar, jVar2, qVar2, kVar3, i14, i16, nVar4);
            this.f7690d0 = false;
            jVar2.f39952c = iVar4;
            jVar2.f39953d = cVarV;
            aVar2 = aVar;
            iVar = jVar2;
        }
        if (eVar2 == null) {
            return iVar;
        }
        n nVar5 = this.f7687a0;
        int i17 = nVar5.f39918t;
        int i18 = nVar5.f39917f;
        if (pe.m.i(i11, i12)) {
            n nVar6 = this.f7687a0;
            if (!pe.m.i(nVar6.f39918t, nVar6.f39917f)) {
                i17 = aVar2.f39918t;
                i18 = aVar2.f39917f;
            }
        }
        int i19 = i18;
        n nVar7 = this.f7687a0;
        le.b bVar2 = eVar2;
        le.c cVarV2 = nVar7.v(obj, dVar, bVar2, nVar7.W, nVar7.f39914c, i17, i19, nVar7);
        bVar2.f39921c = iVar;
        bVar2.f39922d = cVarV2;
        return bVar2;
    }

    @Override // le.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        n nVar = (n) super.clone();
        nVar.W = nVar.W.clone();
        if (nVar.Y != null) {
            nVar.Y = new ArrayList(nVar.Y);
        }
        n nVar2 = nVar.Z;
        if (nVar2 != null) {
            nVar.Z = nVar2.clone();
        }
        n nVar3 = nVar.f7687a0;
        if (nVar3 != null) {
            nVar.f7687a0 = nVar3.clone();
        }
        return nVar;
    }

    public final void x(ImageView imageView) {
        le.a aVarI;
        me.d aVar;
        pe.m.a();
        pe.f.b(imageView);
        if (!le.a.h(this.f39912a, 2048) && imageView.getScaleType() != null) {
            switch (m.f7685a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarI = clone().i(ce.l.f6870d, new ce.g());
                    break;
                case 2:
                    aVarI = clone().i(ce.l.f6869c, new ce.h());
                    aVarI.Q = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarI = clone().i(ce.l.f6868b, new t());
                    aVarI.Q = true;
                    break;
                case 6:
                    aVarI = clone().i(ce.l.f6869c, new ce.h());
                    aVarI.Q = true;
                    break;
                default:
                    aVarI = this;
                    break;
            }
        } else {
            aVarI = this;
        }
        this.V.f7631c.getClass();
        Class cls = this.U;
        if (Bitmap.class.equals(cls)) {
            aVar = new me.a(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            aVar = new me.a(imageView, 1);
        }
        y(aVar, aVarI);
    }

    public final void y(me.d dVar, le.a aVar) {
        pe.f.b(dVar);
        if (!this.f7689c0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        le.c cVarV = v(new Object(), dVar, null, this.W, aVar.f39914c, aVar.f39918t, aVar.f39917f, aVar);
        le.c cVarG = dVar.g();
        if (cVarV.k(cVarG) && (aVar.f39916e || !cVarG.b())) {
            pe.f.c(cVarG, "Argument must not be null");
            if (cVarG.isRunning()) {
                return;
            }
            cVarG.j();
            return;
        }
        this.T.j(dVar);
        dVar.i(cVarV);
        p pVar = this.T;
        synchronized (pVar) {
            pVar.f7698f.f34408a.add(dVar);
            ie.o oVar = pVar.f7696d;
            ((Set) oVar.f34406c).add(cVarV);
            if (oVar.f34405b) {
                cVarV.clear();
                ((HashSet) oVar.f34407d).add(cVarV);
            } else {
                cVarV.j();
            }
        }
    }

    public final n z(Object obj) {
        if (this.P) {
            return clone().z(obj);
        }
        this.X = obj;
        this.f7689c0 = true;
        m();
        return this;
    }
}
