package s7;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b7.f0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import f7.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import p7.g1;
import y6.p0;
import y6.q0;
import y6.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ordering f51450k = Ordering.b(new bq.h(18));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f51451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f51452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.q f51453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f51454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f51455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f51456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y6.d f51457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f51458j;

    public q(Context context, re.q qVar) {
        j jVar = j.D;
        this.f51451c = new Object();
        this.f51452d = context != null ? context.getApplicationContext() : null;
        this.f51453e = qVar;
        if (jVar != null) {
            this.f51454f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.c(jVar);
            this.f51454f = new j(iVar);
        }
        this.f51457i = y6.d.f57180b;
        if (this.f51454f.f51433y && context == null) {
            b7.a.B("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(g1 g1Var, j jVar, HashMap map) {
        for (int i11 = 0; i11 < g1Var.f46388a; i11++) {
            q0 q0Var = (q0) jVar.f57356s.get(g1Var.a(i11));
            if (q0Var != null) {
                p0 p0Var = q0Var.f57311a;
                q0 q0Var2 = (q0) map.get(Integer.valueOf(p0Var.f57306c));
                if (q0Var2 == null || (q0Var2.f57312b.isEmpty() && !q0Var.f57312b.isEmpty())) {
                    map.put(Integer.valueOf(p0Var.f57306c), q0Var);
                }
            }
        }
    }

    public static int d(y6.p pVar, String str, boolean z11) {
        if (!TextUtils.isEmpty(str) && str.equals(pVar.f57282d)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(pVar.f57282d);
        if (strG2 == null || strG == null) {
            return (z11 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        String str2 = f0.f3975a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i11, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i12;
        RandomAccess randomAccessU;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i13 = uVar2.f51461a;
        int i14 = 0;
        while (i14 < i13) {
            if (i11 == uVar2.f51462b[i14]) {
                g1 g1Var = uVar2.f51463c[i14];
                for (int i15 = 0; i15 < g1Var.f46388a; i15++) {
                    p0 p0VarA = g1Var.a(i15);
                    List listE = nVar.e(i14, p0VarA, iArr[i14][i15]);
                    int i16 = p0VarA.f57304a;
                    boolean[] zArr = new boolean[i16];
                    int i17 = 0;
                    while (i17 < i16) {
                        o oVar = (o) listE.get(i17);
                        int iA = oVar.a();
                        if (zArr[i17] || iA == 0) {
                            i12 = i13;
                        } else {
                            if (iA == 1) {
                                randomAccessU = ImmutableList.u(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i18 = i17 + 1;
                                while (i18 < i16) {
                                    o oVar2 = (o) listE.get(i18);
                                    int i19 = i13;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i18] = true;
                                    }
                                    i18++;
                                    i13 = i19;
                                }
                                randomAccessU = arrayList2;
                            }
                            i12 = i13;
                            arrayList.add(randomAccessU);
                        }
                        i17++;
                        i13 = i12;
                    }
                }
            }
            i14++;
            uVar2 = uVar;
            i13 = i13;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i21 = 0; i21 < list.size(); i21++) {
            iArr2[i21] = ((o) list.get(i21)).f51445c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(0, oVar3.f51444b, iArr2), Integer.valueOf(oVar3.f51443a));
    }

    @Override // s7.v
    public final void a() {
        l lVar;
        synchronized (this.f51451c) {
            try {
                Thread thread = this.f51455g;
                if (thread != null) {
                    b7.a.i("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (lVar = this.f51456h) != null) {
            lVar.d();
            this.f51456h = null;
        }
        this.f51467a = null;
        this.f51468b = null;
    }

    @Override // s7.v
    public final void b(t0 t0Var) {
        if (t0Var instanceof j) {
            i((j) t0Var);
        }
        i iVar = new i(e());
        iVar.c(t0Var);
        i(new j(iVar));
    }

    public final j e() {
        j jVar;
        synchronized (this.f51451c) {
            jVar = this.f51454f;
        }
        return jVar;
    }

    public final void f() {
        boolean z11;
        g0 g0Var;
        l lVar;
        synchronized (this.f51451c) {
            try {
                z11 = this.f51454f.f51433y && Build.VERSION.SDK_INT >= 32 && (lVar = this.f51456h) != null && lVar.f51437b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11 || (g0Var = this.f51467a) == null) {
            return;
        }
        g0Var.H.e(10);
    }

    public final void i(j jVar) {
        boolean zEquals;
        synchronized (this.f51451c) {
            zEquals = this.f51454f.equals(jVar);
            this.f51454f = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.f51433y && this.f51452d == null) {
            b7.a.B("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        g0 g0Var = this.f51467a;
        if (g0Var != null) {
            g0Var.H.e(10);
        }
    }
}
