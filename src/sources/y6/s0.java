package y6;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57315a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57316b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57317c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57318d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f57319e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57320f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f57321g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57322h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImmutableList f57323i = ImmutableList.s();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImmutableList f57324j = ImmutableList.s();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImmutableList f57325k = ImmutableList.s();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f57326l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImmutableList f57327n = ImmutableList.s();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r0 f57328o = r0.f57314a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImmutableList f57329p = ImmutableList.s();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f57330q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f57331r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HashMap f57332s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HashSet f57333t = new HashSet();

    public t0 a() {
        return new t0(this);
    }

    public s0 b(int i11) {
        Iterator it = this.f57332s.values().iterator();
        while (it.hasNext()) {
            if (((q0) it.next()).f57311a.f57306c == i11) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(t0 t0Var) {
        this.f57315a = t0Var.f57339a;
        this.f57316b = t0Var.f57340b;
        this.f57317c = t0Var.f57341c;
        this.f57318d = t0Var.f57342d;
        this.f57319e = t0Var.f57343e;
        this.f57320f = t0Var.f57344f;
        this.f57321g = t0Var.f57345g;
        this.f57322h = t0Var.f57346h;
        this.f57323i = t0Var.f57347i;
        this.f57324j = t0Var.f57348j;
        this.f57325k = t0Var.f57349k;
        this.f57326l = t0Var.f57350l;
        this.m = t0Var.m;
        this.f57327n = t0Var.f57351n;
        this.f57328o = t0Var.f57352o;
        this.f57329p = t0Var.f57353p;
        this.f57330q = t0Var.f57354q;
        this.f57331r = t0Var.f57355r;
        this.f57333t = new HashSet(t0Var.f57357t);
        this.f57332s = new HashMap(t0Var.f57356s);
    }

    public s0 d() {
        this.f57331r = -3;
        return this;
    }

    public s0 e(q0 q0Var) {
        p0 p0Var = q0Var.f57311a;
        b(p0Var.f57306c);
        this.f57332s.put(p0Var, q0Var);
        return this;
    }

    public s0 f() {
        return g(new String[0]);
    }

    public s0 g(String... strArr) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (String str : strArr) {
            str.getClass();
            builder.h(b7.f0.L(str));
        }
        this.f57329p = builder.j();
        this.f57330q = false;
        return this;
    }

    public s0 h() {
        this.f57330q = false;
        return this;
    }

    public s0 i(int i11, boolean z11) {
        if (z11) {
            this.f57333t.add(Integer.valueOf(i11));
            return this;
        }
        this.f57333t.remove(Integer.valueOf(i11));
        return this;
    }
}
