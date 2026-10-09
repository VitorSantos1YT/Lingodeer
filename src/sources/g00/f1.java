package g00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class f1 implements e00.g, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f28390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28392d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f28393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f28394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f28395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f28396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f28397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f28398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f28399k;

    public f1(String str, e0 e0Var, int i11) {
        this.f28389a = str;
        this.f28390b = e0Var;
        this.f28391c = i11;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.f28393e = strArr;
        int i13 = this.f28391c;
        this.f28394f = new List[i13];
        this.f28395g = new boolean[i13];
        this.f28396h = ry.s.f50855a;
        qy.j jVar = qy.j.PUBLICATION;
        final int i14 = 0;
        this.f28397i = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: g00.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f28382b;

            {
                this.f28382b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                c00.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                c00.a[] aVarArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        e0 e0Var2 = this.f28382b.f28390b;
                        return (e0Var2 == null || (aVarArrChildSerializers = e0Var2.childSerializers()) == null) ? d1.f28375b : aVarArrChildSerializers;
                    case 1:
                        e0 e0Var3 = this.f28382b.f28390b;
                        if (e0Var3 == null || (aVarArrTypeParametersSerializers = e0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (c00.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return d1.c(arrayList);
                    default:
                        f1 f1Var = this.f28382b;
                        return Integer.valueOf(d1.g(f1Var, (e00.g[]) f1Var.f28398j.getValue()));
                }
            }
        });
        final int i15 = 1;
        this.f28398j = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: g00.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f28382b;

            {
                this.f28382b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                c00.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                c00.a[] aVarArrTypeParametersSerializers;
                switch (i15) {
                    case 0:
                        e0 e0Var2 = this.f28382b.f28390b;
                        return (e0Var2 == null || (aVarArrChildSerializers = e0Var2.childSerializers()) == null) ? d1.f28375b : aVarArrChildSerializers;
                    case 1:
                        e0 e0Var3 = this.f28382b.f28390b;
                        if (e0Var3 == null || (aVarArrTypeParametersSerializers = e0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (c00.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return d1.c(arrayList);
                    default:
                        f1 f1Var = this.f28382b;
                        return Integer.valueOf(d1.g(f1Var, (e00.g[]) f1Var.f28398j.getValue()));
                }
            }
        });
        final int i16 = 2;
        this.f28399k = com.bumptech.glide.d.u(jVar, new fz.a(this) { // from class: g00.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f28382b;

            {
                this.f28382b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, qy.h] */
            @Override // fz.a
            public final Object invoke() {
                c00.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                c00.a[] aVarArrTypeParametersSerializers;
                switch (i16) {
                    case 0:
                        e0 e0Var2 = this.f28382b.f28390b;
                        return (e0Var2 == null || (aVarArrChildSerializers = e0Var2.childSerializers()) == null) ? d1.f28375b : aVarArrChildSerializers;
                    case 1:
                        e0 e0Var3 = this.f28382b.f28390b;
                        if (e0Var3 == null || (aVarArrTypeParametersSerializers = e0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (c00.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return d1.c(arrayList);
                    default:
                        f1 f1Var = this.f28382b;
                        return Integer.valueOf(d1.g(f1Var, (e00.g[]) f1Var.f28398j.getValue()));
                }
            }
        });
    }

    @Override // e00.g
    public final String a() {
        return this.f28389a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // g00.l
    public final Set b() {
        return this.f28396h.keySet();
    }

    @Override // e00.g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        Integer num = (Integer) this.f28396h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // e00.g
    public o00.a e() {
        return e00.m.f24700c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qy.h] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            e00.g gVar = (e00.g) obj;
            if (this.f28389a.equals(gVar.a()) && Arrays.equals((e00.g[]) this.f28398j.getValue(), (e00.g[]) ((f1) obj).f28398j.getValue())) {
                int iF = gVar.f();
                int i11 = this.f28391c;
                if (i11 == iF) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (kotlin.jvm.internal.m.a(i(i12).a(), gVar.i(i12).a()) && kotlin.jvm.internal.m.a(i(i12).e(), gVar.i(i12).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e00.g
    public final int f() {
        return this.f28391c;
    }

    @Override // e00.g
    public final String g(int i11) {
        return this.f28393e[i11];
    }

    @Override // e00.g
    public final List getAnnotations() {
        return ry.r.f50854a;
    }

    @Override // e00.g
    public final List h(int i11) {
        List list = this.f28394f[i11];
        return list == null ? ry.r.f50854a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public int hashCode() {
        return ((Number) this.f28399k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    @Override // e00.g
    public e00.g i(int i11) {
        return ((c00.a[]) this.f28397i.getValue())[i11].getDescriptor();
    }

    @Override // e00.g
    public boolean isInline() {
        return false;
    }

    @Override // e00.g
    public final boolean j(int i11) {
        return this.f28395g[i11];
    }

    public final void k(String name, boolean z11) {
        kotlin.jvm.internal.m.f(name, "name");
        int i11 = this.f28392d + 1;
        this.f28392d = i11;
        String[] strArr = this.f28393e;
        strArr[i11] = name;
        this.f28395g[i11] = z11;
        this.f28394f[i11] = null;
        if (i11 == this.f28391c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                map.put(strArr[i12], Integer.valueOf(i12));
            }
            this.f28396h = map;
        }
    }

    public String toString() {
        return d1.m(this);
    }
}
