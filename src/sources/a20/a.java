package a20;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import ns.o;
import org.koin.core.error.NoParameterFoundException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f321b;

    public a(int i11, ArrayList arrayList) {
        this.f320a = (i11 & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(e eVar) throws NoParameterFoundException {
        List list = this.f320a;
        if (list.size() > 0) {
            return list.get(0);
        }
        String msg = "Can't get injected parameter #0 from " + this + " for type '" + f20.a.a(eVar) + '\'';
        m.f(msg, "msg");
        throw new NoParameterFoundException(msg);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a A[RETURN] */
    public Object b(e eVar) {
        List list = this.f320a;
        if (list.isEmpty()) {
            return null;
        }
        int i11 = this.f321b;
        List list2 = this.f320a;
        Object obj = list2.get(i11);
        if (!eVar.h(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null && this.f321b < o.A(list2)) {
            this.f321b++;
        }
        if (obj2 != null) {
            return obj2;
        }
        for (Object obj3 : list) {
            if (eVar.h(obj3)) {
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            }
        }
        obj3 = null;
        if (obj3 == null) {
            return null;
        }
        return obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return m.a(this.f320a, ((a) obj).f320a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f320a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + ry.m.a1(this.f320a);
    }
}
