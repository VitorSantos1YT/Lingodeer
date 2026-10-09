package p7;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.h f46433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.e f46434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public re.g0 f46435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f46439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f46440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46441i;

    public o(Context context, x7.k kVar) {
        ob.e eVar = new ob.e(context);
        this.f46434b = eVar;
        re.g0 g0Var = new re.g0(3);
        this.f46435c = g0Var;
        com.android.billingclient.api.h hVar = new com.android.billingclient.api.h();
        hVar.f7509b = kVar;
        hVar.f7513f = g0Var;
        hVar.f7510c = new HashMap();
        hVar.f7511d = new HashMap();
        hVar.f7508a = true;
        this.f46433a = hVar;
        if (eVar != ((ob.e) hVar.f7512e)) {
            hVar.f7512e = eVar;
            ((HashMap) hVar.f7510c).clear();
            ((HashMap) hVar.f7511d).clear();
        }
        this.f46436d = -9223372036854775807L;
        this.f46437e = -9223372036854775807L;
        this.f46438f = -9223372036854775807L;
        this.f46439g = -3.4028235E38f;
        this.f46440h = -3.4028235E38f;
        this.f46441i = true;
    }

    public static a0 e(Class cls, d7.e eVar) {
        try {
            return (a0) cls.getConstructor(d7.e.class).newInstance(eVar);
        } catch (Exception e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // p7.a0
    public final void a(re.g0 g0Var) {
        this.f46435c = g0Var;
        com.android.billingclient.api.h hVar = this.f46433a;
        hVar.f7513f = g0Var;
        x7.k kVar = (x7.k) hVar.f7509b;
        synchronized (kVar) {
            kVar.f55910c = g0Var;
        }
        Iterator it = ((HashMap) hVar.f7511d).values().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a(g0Var);
        }
    }

    @Override // p7.a0
    public final void b() {
        com.android.billingclient.api.h hVar = this.f46433a;
        hVar.getClass();
        synchronized (((x7.k) hVar.f7509b)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.a0
    public final a c(y6.x xVar) {
        y6.x xVar2;
        List list;
        Uri uri;
        String str;
        long j11;
        xVar.f57373b.getClass();
        String scheme = xVar.f57373b.f57358a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(xVar.f57373b.f57359b, "application/x-image-uri")) {
            long j12 = xVar.f57373b.f57362e;
            String str2 = b7.f0.f3975a;
            throw null;
        }
        y6.u uVar = xVar.f57373b;
        int iE = b7.f0.E(uVar.f57358a, uVar.f57359b);
        if (xVar.f57373b.f57362e != -9223372036854775807L) {
            x7.k kVar = (x7.k) this.f46433a.f7509b;
            synchronized (kVar) {
                kVar.f55911d = 1;
            }
        }
        try {
            com.android.billingclient.api.h hVar = this.f46433a;
            HashMap map = (HashMap) hVar.f7511d;
            a0 a0Var = (a0) map.get(Integer.valueOf(iE));
            if (a0Var == null) {
                a0Var = (a0) hVar.j(iE).get();
                a0Var.a((re.g0) hVar.f7513f);
                a0Var.d(hVar.f7508a);
                a0Var.b();
                map.put(Integer.valueOf(iE), a0Var);
            }
            j7.t tVarA = xVar.f57374c.a();
            y6.t tVar = xVar.f57374c;
            if (tVar.f57334a == -9223372036854775807L) {
                tVarA.f36168a = this.f46436d;
            }
            if (tVar.f57337d == -3.4028235E38f) {
                tVarA.f36171d = this.f46439g;
            }
            if (tVar.f57338e == -3.4028235E38f) {
                tVarA.f36172e = this.f46440h;
            }
            if (tVar.f57335b == -9223372036854775807L) {
                tVarA.f36169b = this.f46437e;
            }
            if (tVar.f57336c == -9223372036854775807L) {
                tVarA.f36170c = this.f46438f;
            }
            y6.t tVar2 = new y6.t(tVarA);
            if (tVar2.equals(xVar.f57374c)) {
                xVar2 = xVar;
            } else {
                new y6.w0();
                List list2 = Collections.EMPTY_LIST;
                ImmutableList immutableListS = ImmutableList.s();
                y6.v vVar = y6.v.f57368a;
                y6.s sVar = xVar.f57376e;
                kw.b bVar = new kw.b();
                bVar.f38845a = sVar.f57313a;
                String str3 = xVar.f57372a;
                y6.a0 a0Var2 = xVar.f57375d;
                xVar.f57374c.a();
                y6.v vVar2 = xVar.f57377f;
                y6.u uVar2 = xVar.f57373b;
                if (uVar2 != null) {
                    String str4 = uVar2.f57359b;
                    Uri uri2 = uVar2.f57358a;
                    List list3 = uVar2.f57360c;
                    immutableListS = uVar2.f57361d;
                    new y6.w0();
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j11 = uVar2.f57362e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j11 = -9223372036854775807L;
                }
                ImmutableList immutableList = immutableListS;
                j7.t tVarA2 = tVar2.a();
                y6.u uVar3 = uri != null ? new y6.u(uri, str, null, list, immutableList, j11) : null;
                if (str3 == null) {
                    str3 = BuildConfig.VERSION_NAME;
                }
                String str5 = str3;
                y6.s sVar2 = new y6.s(bVar);
                y6.t tVar3 = new y6.t(tVarA2);
                if (a0Var2 == null) {
                    a0Var2 = y6.a0.B;
                }
                xVar2 = new y6.x(str5, sVar2, uVar3, tVar3, a0Var2, vVar2);
            }
            a aVarC = a0Var.c(xVar2);
            ImmutableList immutableList2 = xVar2.f57373b.f57361d;
            if (!immutableList2.isEmpty()) {
                a[] aVarArr = new a[immutableList2.size() + 1];
                aVarArr[0] = aVarC;
                if (immutableList2.size() > 0) {
                    if (!this.f46441i) {
                        this.f46434b.getClass();
                        y6.w wVar = (y6.w) immutableList2.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        ImmutableMap.k();
                        ImmutableList.s();
                        List list4 = Collections.EMPTY_LIST;
                        ImmutableList.s();
                        y6.v vVar3 = y6.v.f57368a;
                        Uri uri3 = Uri.EMPTY;
                        wVar.getClass();
                        throw null;
                    }
                    y6.o oVar = new y6.o();
                    ((y6.w) immutableList2.get(0)).getClass();
                    ArrayList arrayList = y6.d0.f57182a;
                    oVar.m = null;
                    ((y6.w) immutableList2.get(0)).getClass();
                    oVar.f57256d = null;
                    ((y6.w) immutableList2.get(0)).getClass();
                    oVar.f57257e = 0;
                    ((y6.w) immutableList2.get(0)).getClass();
                    oVar.f57258f = 0;
                    ((y6.w) immutableList2.get(0)).getClass();
                    oVar.f57254b = null;
                    ((y6.w) immutableList2.get(0)).getClass();
                    oVar.f57253a = null;
                    y6.p pVar = new y6.p(oVar);
                    if (this.f46435c.l(pVar)) {
                        y6.o oVarA = pVar.a();
                        oVarA.m = y6.d0.o("application/x-media3-cues");
                        oVarA.f57262j = pVar.f57291n;
                        oVarA.K = this.f46435c.b(pVar);
                        new y6.p(oVarA);
                    }
                    ((y6.w) immutableList2.get(0)).getClass();
                    throw null;
                }
                aVarC = new l0(aVarArr);
            }
            y6.s sVar3 = xVar2.f57376e;
            if (sVar3.f57313a != Long.MIN_VALUE) {
                e eVar = new e(aVarC);
                b7.a.j(!eVar.f46359d);
                long j13 = sVar3.f57313a;
                b7.a.j(!eVar.f46359d);
                eVar.f46357b = j13;
                b7.a.j(!eVar.f46359d);
                eVar.f46358c = true;
                b7.a.j(!eVar.f46359d);
                b7.a.j(!eVar.f46359d);
                b7.a.j(!eVar.f46359d);
                eVar.f46359d = true;
                aVarC = new g(eVar);
            }
            xVar2.f57373b.getClass();
            xVar2.f57373b.getClass();
            return aVarC;
        } catch (ClassNotFoundException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // p7.a0
    public final void d(boolean z11) {
        this.f46441i = z11;
        com.android.billingclient.api.h hVar = this.f46433a;
        hVar.f7508a = z11;
        x7.k kVar = (x7.k) hVar.f7509b;
        synchronized (kVar) {
            kVar.f55909b = z11;
        }
        Iterator it = ((HashMap) hVar.f7511d).values().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).d(z11);
        }
    }
}
