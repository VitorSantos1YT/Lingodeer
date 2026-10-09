package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f40433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q1 f40434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q1 f40435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q1 f40436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q1 f40437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q1 f40438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q1 f40439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q1 f40440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q1 f40441l;
    public static final q1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a1 f40442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a1 f40443o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f40444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f40446c;

    static {
        TreeMap treeMap = new TreeMap();
        for (p1 p1Var : p1.values()) {
            q1 q1Var = (q1) treeMap.put(Integer.valueOf(p1Var.c()), new q1(p1Var, null, null));
            if (q1Var != null) {
                throw new IllegalStateException("Code value duplication between " + q1Var.f40444a.name() + " & " + p1Var.name());
            }
        }
        f40433d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f40434e = p1.OK.b();
        f40435f = p1.CANCELLED.b();
        f40436g = p1.UNKNOWN.b();
        p1.INVALID_ARGUMENT.b();
        f40437h = p1.DEADLINE_EXCEEDED.b();
        p1.NOT_FOUND.b();
        p1.ALREADY_EXISTS.b();
        f40438i = p1.PERMISSION_DENIED.b();
        p1.UNAUTHENTICATED.b();
        f40439j = p1.RESOURCE_EXHAUSTED.b();
        f40440k = p1.FAILED_PRECONDITION.b();
        p1.ABORTED.b();
        p1.OUT_OF_RANGE.b();
        p1.UNIMPLEMENTED.b();
        f40441l = p1.INTERNAL.b();
        m = p1.UNAVAILABLE.b();
        p1.DATA_LOSS.b();
        f40442n = new a1("grpc-status", false, new k(10));
        f40443o = new a1("grpc-message", false, new k(1));
    }

    public q1(p1 p1Var, String str, Throwable th2) {
        Preconditions.k(p1Var, "code");
        this.f40444a = p1Var;
        this.f40445b = str;
        this.f40446c = th2;
    }

    public static String c(q1 q1Var) {
        String str = q1Var.f40445b;
        p1 p1Var = q1Var.f40444a;
        if (str == null) {
            return p1Var.toString();
        }
        return p1Var + ": " + q1Var.f40445b;
    }

    public static q1 d(int i11) {
        if (i11 >= 0) {
            List list = f40433d;
            if (i11 < list.size()) {
                return (q1) list.get(i11);
            }
        }
        return f40436g.h("Unknown code " + i11);
    }

    public static q1 e(Throwable th2) {
        Preconditions.k(th2, "t");
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).f34500a;
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).f34502a;
            }
        }
        return f40436g.g(th2);
    }

    public final StatusRuntimeException a() {
        return new StatusRuntimeException(this, null);
    }

    public final q1 b(String str) {
        if (str == null) {
            return this;
        }
        Throwable th2 = this.f40446c;
        p1 p1Var = this.f40444a;
        String str2 = this.f40445b;
        return str2 == null ? new q1(p1Var, str, th2) : new q1(p1Var, ep.a.D(str2, "\n", str), th2);
    }

    public final boolean f() {
        return p1.OK == this.f40444a;
    }

    public final q1 g(Throwable th2) {
        return Objects.a(this.f40446c, th2) ? this : new q1(this.f40444a, this.f40445b, th2);
    }

    public final q1 h(String str) {
        return Objects.a(this.f40445b, str) ? this : new q1(this.f40444a, str, this.f40446c);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40444a.name(), "code");
        toStringHelperB.c(this.f40445b, "description");
        Throwable th2 = this.f40446c;
        Object string = th2;
        if (th2 != null) {
            Object obj = Throwables.f16413a;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        toStringHelperB.c(string, "cause");
        return toStringHelperB.toString();
    }
}
