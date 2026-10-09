package w9;

import android.app.ActivityManager;
import android.content.Context;
import ay.k0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e6.i1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f54832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54834c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f54837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f54838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gb.m f54839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54840i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public File f54848r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f54835d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f54836e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f54841j = r.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f54842k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i1 f54843l = new i1(1);
    public final LinkedHashSet m = new LinkedHashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f54844n = new LinkedHashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f54845o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f54846p = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f54849s = true;

    public q(Context context, Class cls, String str) {
        this.f54832a = kotlin.jvm.internal.z.a(cls);
        this.f54833b = context;
        this.f54834c = str;
    }

    public final void a(aa.a... aVarArr) {
        for (aa.a aVar : aVarArr) {
            Integer numValueOf = Integer.valueOf(aVar.f522a);
            LinkedHashSet linkedHashSet = this.f54844n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f523b));
        }
        aa.a[] migrations = (aa.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        i1 i1Var = this.f54843l;
        i1Var.getClass();
        kotlin.jvm.internal.m.f(migrations, "migrations");
        for (aa.a aVar2 : migrations) {
            i1Var.b(aVar2);
        }
    }

    public final s b() {
        ka.c uVar;
        String name;
        v5.e eVarH;
        LinkedHashMap linkedHashMap;
        List list;
        int size;
        boolean[] zArr;
        Iterator it;
        ka.d dVarA;
        ka.d dVarA2;
        boolean zContainsKey;
        Executor executor = this.f54837f;
        if (executor == null && this.f54838g == null) {
            s.a aVar = s.b.f50981d;
            this.f54838g = aVar;
            this.f54837f = aVar;
        } else if (executor != null && this.f54838g == null) {
            this.f54838g = executor;
        } else if (executor == null) {
            this.f54837f = this.f54838g;
        }
        LinkedHashSet migrationStartAndEndVersions = this.f54844n;
        kotlin.jvm.internal.m.f(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        LinkedHashSet migrationsNotRequiredFrom = this.m;
        kotlin.jvm.internal.m.f(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (!migrationStartAndEndVersions.isEmpty()) {
            Iterator it2 = migrationStartAndEndVersions.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(nv.p.j(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        ka.c k0Var = this.f54839h;
        if (k0Var == null) {
            k0Var = new k0(18);
        }
        boolean z11 = this.f54842k > 0;
        File file = this.f54848r;
        boolean z12 = file != null;
        String str = this.f54834c;
        if (z11) {
            if (str != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        if (!z12) {
            uVar = k0Var;
        } else {
            if (str == null) {
                throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
            }
            if (file == null) {
                throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
            }
            uVar = new ob.u(1, file, k0Var);
        }
        boolean z13 = this.f54840i;
        r rVar = this.f54841j;
        rVar.getClass();
        Context context = this.f54833b;
        kotlin.jvm.internal.m.f(context, "context");
        if (rVar == r.AUTOMATIC) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            rVar = (activityManager == null || activityManager.isLowRamDevice()) ? r.TRUNCATE : r.WRITE_AHEAD_LOGGING;
        }
        r rVar2 = rVar;
        Executor executor2 = this.f54837f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f54838g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b bVar = new b(context, this.f54834c, uVar, this.f54843l, this.f54835d, z13, rVar2, executor2, executor3, null, this.f54846p, this.f54847q, migrationsNotRequiredFrom, null, this.f54848r, null, this.f54836e, this.f54845o, false, null, null);
        bVar.f54775w = this.f54849s;
        Class clsP = qx.b.p(this.f54832a);
        Package r9 = clsP.getPackage();
        if (r9 == null || (name = r9.getName()) == null) {
            name = BuildConfig.VERSION_NAME;
        }
        String canonicalName = clsP.getCanonicalName();
        kotlin.jvm.internal.m.c(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            kotlin.jvm.internal.m.e(canonicalName, "substring(...)");
        }
        String strConcat = oz.x.p0(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsP.getClassLoader());
            kotlin.jvm.internal.m.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            s sVar = (s) cls.getDeclaredConstructor(null).newInstance(null);
            sVar.getClass();
            sVar.f54860k = bVar.f54775w;
            try {
                eVarH = sVar.h();
                kotlin.jvm.internal.m.d(eVarH, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                while (true) {
                    int i11 = -1;
                    if (!it.hasNext()) {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i12 = size2 - 1;
                                if (size2 >= size || !zArr[size2]) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i12 < 0) {
                                    break;
                                }
                                size2 = i12;
                            }
                        }
                        for (aa.a aVar2 : sVar.f(linkedHashMap)) {
                            int i13 = aVar2.f522a;
                            int i14 = aVar2.f523b;
                            i1 i1Var = bVar.f54757d;
                            LinkedHashMap linkedHashMap2 = i1Var.f24942a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i13))) {
                                Map map = (Map) linkedHashMap2.get(Integer.valueOf(i13));
                                if (map == null) {
                                    map = ry.s.f50855a;
                                }
                                zContainsKey = map.containsKey(Integer.valueOf(i14));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                i1Var.b(aVar2);
                            }
                        }
                        LinkedHashMap linkedHashMapO = sVar.o();
                        List list2 = bVar.f54769q;
                        boolean[] zArr2 = new boolean[list2.size()];
                        for (Map.Entry entry : linkedHashMapO.entrySet()) {
                            mz.c cVar = (mz.c) entry.getKey();
                            for (mz.c kclass : (List) entry.getValue()) {
                                int size3 = list2.size() - 1;
                                if (size3 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                while (true) {
                                    int i15 = size3 - 1;
                                    if (((kotlin.jvm.internal.e) kclass).h(list2.get(size3))) {
                                        zArr2[size3] = true;
                                        break;
                                    }
                                    if (i15 < 0) {
                                        size3 = -1;
                                        break;
                                    }
                                    size3 = i15;
                                }
                                if (size3 < 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + ((kotlin.jvm.internal.e) kclass).f() + ") for " + ((kotlin.jvm.internal.e) cVar).f() + " is missing in the database configuration.").toString());
                                }
                                Object converter = list2.get(size3);
                                kotlin.jvm.internal.m.f(kclass, "kclass");
                                kotlin.jvm.internal.m.f(converter, "converter");
                                sVar.f54859j.put(kclass, converter);
                            }
                        }
                        int size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i16 = size4 - 1;
                                if (!zArr2[size4]) {
                                    throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                }
                                if (i16 < 0) {
                                    break;
                                }
                                size4 = i16;
                            }
                        }
                        sVar.f54852c = bVar.f54761h;
                        sVar.f54853d = new pb.j(bVar.f54762i, 1);
                        Executor executor4 = sVar.f54852c;
                        if (executor4 == null) {
                            kotlin.jvm.internal.m.n("internalQueryExecutor");
                            throw null;
                        }
                        wz.d dVarC = rz.e0.c(rz.e0.p(executor4).plus(rz.e0.e()));
                        sVar.f54850a = dVarC;
                        vy.i iVar = dVarC.f55510a;
                        pb.j jVar = sVar.f54853d;
                        if (jVar == null) {
                            kotlin.jvm.internal.m.n("internalTransactionExecutor");
                            throw null;
                        }
                        sVar.f54851b = iVar.plus(rz.e0.p(jVar));
                        sVar.f54857h = bVar.f54759f;
                        p pVar = sVar.f54854e;
                        if (pVar == null) {
                            kotlin.jvm.internal.m.n("connectionManager");
                            throw null;
                        }
                        ka.d dVarC2 = pVar.c();
                        if (dVarC2 == null) {
                            dVarA = null;
                            break;
                        }
                        dVarA = dVarC2;
                        while (!(dVarA instanceof ba.b)) {
                            if (!(dVarA instanceof c)) {
                                dVarA = null;
                                break;
                            }
                            dVarA = ((c) dVarA).a();
                        }
                        ba.b bVar2 = (ba.b) dVarA;
                        if (bVar2 != null) {
                            bVar2.f4060e = bVar;
                        }
                        p pVar2 = sVar.f54854e;
                        if (pVar2 == null) {
                            kotlin.jvm.internal.m.n("connectionManager");
                            throw null;
                        }
                        ka.d dVarC3 = pVar2.c();
                        if (dVarC3 == null) {
                            dVarA2 = null;
                            break;
                        }
                        dVarA2 = dVarC3;
                        while (!(dVarA2 instanceof ba.a)) {
                            if (!(dVarA2 instanceof c)) {
                                dVarA2 = null;
                                break;
                            }
                            dVarA2 = ((c) dVarA2).a();
                        }
                        return sVar;
                    }
                    mz.c cVar2 = (mz.c) it.next();
                    int size5 = list.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i17 = size5 - 1;
                            if (((kotlin.jvm.internal.e) cVar2).h(list.get(size5))) {
                                zArr[size5] = true;
                                i11 = size5;
                                break;
                            }
                            if (i17 < 0) {
                                break;
                            }
                            size5 = i17;
                        }
                    }
                    if (i11 < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + ((kotlin.jvm.internal.e) cVar2).f() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cVar2, list.get(i11));
                }
            } catch (qy.k unused) {
                eVarH = null;
            }
            sVar.f54854e = eVarH == null ? new p(bVar, new s0.a(sVar, 22)) : new p(bVar, eVarH);
            sVar.f54855f = sVar.g();
            linkedHashMap = new LinkedHashMap();
            Set setM = sVar.m();
            list = bVar.f54770r;
            size = list.size();
            zArr = new boolean[size];
            it = setM.iterator();
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("Cannot find implementation for " + clsP.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e8);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot access the constructor " + clsP.getCanonicalName(), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to create an instance of " + clsP.getCanonicalName(), e11);
        }
    }
}
