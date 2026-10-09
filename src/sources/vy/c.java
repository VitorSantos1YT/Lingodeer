package vy;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import pr.y;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f54318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f54319b;

    public c(g element, i left) {
        m.f(left, "left");
        m.f(element, "element");
        this.f54318a = left;
        this.f54319b = element;
    }

    private final Object writeReplace() {
        int iA = a();
        i[] iVarArr = new i[iA];
        w wVar = new w();
        fold(b0.f48488a, new y(15, iVarArr, wVar));
        if (wVar.f38359a == iA) {
            return new b(iVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a() {
        int i11 = 2;
        c cVar = this;
        while (true) {
            i iVar = cVar.f54318a;
            cVar = iVar instanceof c ? (c) iVar : null;
            if (cVar == null) {
                return i11;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.a() == a()) {
                c cVar2 = this;
                while (true) {
                    g gVar = cVar2.f54319b;
                    if (!m.a(cVar.get(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar = cVar2.f54318a;
                    if (!(iVar instanceof c)) {
                        m.d(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar;
                        zA = m.a(cVar.get(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar2 = (c) iVar;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(this.f54318a.fold(obj, eVar), this.f54319b);
    }

    @Override // vy.i
    public final g get(h key) {
        m.f(key, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f54319b.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f54318a;
            if (!(iVar instanceof c)) {
                return iVar.get(key);
            }
            cVar = (c) iVar;
        }
    }

    public final int hashCode() {
        return this.f54319b.hashCode() + this.f54318a.hashCode();
    }

    @Override // vy.i
    public final i minusKey(h key) {
        m.f(key, "key");
        g gVar = this.f54319b;
        g gVar2 = gVar.get(key);
        i iVar = this.f54318a;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(key);
        if (iVarMinusKey == iVar) {
            return this;
        }
        return iVarMinusKey == j.f54321a ? gVar : new c(gVar, iVarMinusKey);
    }

    @Override // vy.i
    public final i plus(i context) {
        m.f(context, "context");
        return context == j.f54321a ? this : (i) context.fold(this, new rz.w(22));
    }

    public final String toString() {
        return p0.o(new StringBuilder("["), (String) fold(BuildConfig.VERSION_NAME, new rz.w(21)), ']');
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(ypOOxsaJG.cGDnbsfalAbXsS);
    }
}
