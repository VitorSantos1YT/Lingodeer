package h00;

import g00.d1;
import g00.h0;
import g00.t1;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f29938a = d1.a(t1.f28468a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final d0 a(Number number) {
        return new t(number, false, null);
    }

    public static final d0 b(String str) {
        return str == null ? w.INSTANCE : new t(str, true, null);
    }

    public static final void c(m mVar, String str) {
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.z.a(mVar.getClass()) + " is not a " + str);
    }

    public static final Boolean d(d0 d0Var) {
        String strB = d0Var.b();
        String[] strArr = i00.z.f33962a;
        kotlin.jvm.internal.m.f(strB, "<this>");
        if (strB.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strB.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final Integer e(d0 d0Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(j(d0Var));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final e f(m mVar) {
        kotlin.jvm.internal.m.f(mVar, "<this>");
        e eVar = mVar instanceof e ? (e) mVar : null;
        if (eVar != null) {
            return eVar;
        }
        c(mVar, "JsonArray");
        throw null;
    }

    public static final z g(m mVar) {
        kotlin.jvm.internal.m.f(mVar, "<this>");
        z zVar = mVar instanceof z ? (z) mVar : null;
        if (zVar != null) {
            return zVar;
        }
        c(mVar, "JsonObject");
        throw null;
    }

    public static final d0 h(m mVar) {
        d0 d0Var = mVar instanceof d0 ? (d0) mVar : null;
        if (d0Var != null) {
            return d0Var;
        }
        c(mVar, "JsonPrimitive");
        throw null;
    }

    public static final long i(d0 d0Var) {
        try {
            return j(d0Var);
        } catch (JsonDecodingException e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }

    public static final long j(d0 d0Var) {
        String strB = d0Var.b();
        a.a aVar = new a.a(strB);
        long jO = aVar.o();
        if (aVar.l() == 10) {
            return jO;
        }
        int i11 = aVar.f5b;
        int i12 = i11 - 1;
        a.a.u(aVar, ep.a.g("Expected input to contain a single valid number, but got '", (i11 == strB.length() || i12 < 0) ? "EOF" : String.valueOf(strB.charAt(i12)), "' after it"), i12, null, 4);
        throw null;
    }
}
