package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zzpe f11808i = new zzpe(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zzon f11809j = new zzon(new Function() { // from class: com.google.android.gms.internal.measurement.zzox
        @Override // com.google.common.base.Function
        public final /* synthetic */ Object apply(Object obj) {
            zzpe zzpeVar = zzpg.f11808i;
            return BuildConfig.VERSION_NAME;
        }
    }, false, ImmutableSet.s());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile zzqs f11810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzlk f11811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableSet f11815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzps f11816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzqt f11817h;

    public zzpg(zzlk zzlkVar, zzon zzonVar) {
        this.f11811b = zzlkVar;
        Context context = zzlkVar.f11704b;
        String str = zzonVar.f11786d;
        if (str == null) {
            str = (String) zzonVar.f11783a.apply(context);
            zzonVar.f11786d = str;
        }
        this.f11812c = str;
        this.f11813d = BuildConfig.VERSION_NAME;
        this.f11814e = zzonVar.f11784b;
        this.f11815f = zzonVar.f11785c;
        this.f11810a = null;
        this.f11816g = new zzps();
        this.f11817h = new zzqt(zzlkVar, str);
    }

    public final zzqs a() {
        zzqs zzqsVar;
        zzqs zzqsVar2 = this.f11810a;
        if (zzqsVar2 != null) {
            return zzqsVar2;
        }
        synchronized (this) {
            try {
                zzqsVar = this.f11810a;
                if (zzqsVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        zzqs zzqsVarA = this.f11817h.a();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i11 = zzqsVarA.f11883e.f11878c - 2;
                        if (i11 == 15 || i11 == 16) {
                            zzqsVar = zzqsVarA;
                        } else {
                            zzlk zzlkVar = this.f11811b;
                            zzlkVar.f11709g.a();
                            if (this.f11814e || this.f11817h.b() || !zzqsVarA.f11880b.isEmpty()) {
                                zzlkVar.a().execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzoy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ListenableFuture listenableFutureZzb;
                                        zzmd zzmdVarZ;
                                        final zzpg zzpgVar = this.f11799a;
                                        zzqs zzqsVarA2 = zzpgVar.a();
                                        String str = zzqsVarA2.f11880b;
                                        zzlk zzlkVar2 = zzpgVar.f11811b;
                                        zzrf zzrfVar = zzlkVar2.f11709g;
                                        Supplier supplier = zzlkVar2.f11706d;
                                        zzqn zzqnVarB = zzrfVar.b();
                                        boolean z11 = zzqnVarB.f11870i;
                                        if (zzqnVarB.f11871j) {
                                            if (Strings.b(str) && !z11) {
                                                Futures.h();
                                                return;
                                            }
                                            zzmb zzmbVarZ = zzme.z();
                                            zzqr zzqrVar = zzqsVarA2.f11883e;
                                            if (zzqrVar.f11876a) {
                                                zzmdVarZ = zzmd.z();
                                            } else {
                                                int i12 = zzqrVar.f11877b;
                                                zzmc zzmcVarY = zzmd.y();
                                                zzmcVarY.m();
                                                ((zzmd) zzmcVarY.f11266b).A(i12);
                                                int i13 = zzqrVar.f11878c;
                                                zzmcVarY.m();
                                                ((zzmd) zzmcVarY.f11266b).B(i13);
                                                zzmdVarZ = (zzmd) zzmcVarY.p();
                                            }
                                            zzmbVarZ.m();
                                            ((zzme) zzmbVarZ.f11266b).B(zzmdVarZ);
                                            if (!Strings.b(str)) {
                                                zzmbVarZ.m();
                                                ((zzme) zzmbVarZ.f11266b).A(str);
                                            }
                                            if (z11) {
                                                String str2 = zzpgVar.f11812c;
                                                zzmbVarZ.m();
                                                ((zzme) zzmbVarZ.f11266b).C(str2);
                                            }
                                            listenableFutureZzb = ((zzmj) supplier.get()).b((zzme) zzmbVarZ.p());
                                        } else {
                                            if (Strings.b(str)) {
                                                Futures.h();
                                                return;
                                            }
                                            listenableFutureZzb = ((zzmj) supplier.get()).zzb(str);
                                        }
                                        Futures.c(listenableFutureZzb, zzmk.class, new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzos
                                            @Override // com.google.common.util.concurrent.AsyncFunction
                                            public final ListenableFuture apply(Object obj) {
                                                zzpg zzpgVar2 = zzpgVar;
                                                zzpgVar2.getClass();
                                                int i14 = ((zzmk) obj).f11733a;
                                                if ((i14 == 29501 || i14 == 29537 || i14 == 29538 || i14 == 29539 || i14 == 29540 || i14 == 29541 || i14 == 29542 || i14 == 29543 || i14 == 29544) && !zzpgVar2.f11817h.b()) {
                                                    zzpgVar2.b();
                                                }
                                                return Futures.h();
                                            }
                                        }, zzlkVar2.a());
                                    }
                                });
                                zzlkVar.f11703a.a(zzqsVarA.f11881c, this.f11815f, this.f11812c);
                                if (!this.f11813d.equals(BuildConfig.VERSION_NAME)) {
                                    zzlkVar.a().execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzoq
                                        @Override // java.lang.Runnable
                                        public final void run() throws IOException {
                                            Uri uri;
                                            zznu zznuVar;
                                            zzuj zzujVar;
                                            final zzpg zzpgVar = this.f11789a;
                                            zzlk zzlkVar2 = zzpgVar.f11811b;
                                            final String str = zzpgVar.f11812c;
                                            zzvb zzvbVar = zzpu.f11831a;
                                            zztd zztdVar = new zztd();
                                            zztdVar.f11967e = zztw.f11999a;
                                            byte b3 = (byte) (zztdVar.f11969g | 2);
                                            zztdVar.f11968f = true;
                                            zztdVar.f11969g = (byte) (b3 | 1);
                                            Context context = zzlkVar2.f11704b;
                                            Pattern pattern = zzsa.f11942a;
                                            zzrz zzrzVar = new zzrz(context);
                                            zzrzVar.a("phenotype");
                                            zzrzVar.b("all_accounts.pb");
                                            Uri uriC = zzrzVar.c();
                                            if (uriC == null) {
                                                throw new NullPointerException("Null uri");
                                            }
                                            zztdVar.f11963a = uriC;
                                            zznu zznuVarZ = zznu.z();
                                            if (zznuVarZ == null) {
                                                throw new NullPointerException("Null schema");
                                            }
                                            zztdVar.f11964b = zznuVarZ;
                                            zztdVar.f11965c = Optional.d(zzpu.f11831a);
                                            zztdVar.f11969g = (byte) (zztdVar.f11969g | 2);
                                            if (zztdVar.f11966d == null) {
                                                zztdVar.f11966d = ImmutableList.s();
                                            }
                                            if (zztdVar.f11969g != 3 || (uri = zztdVar.f11963a) == null || (zznuVar = zztdVar.f11964b) == null || (zzujVar = zztdVar.f11967e) == null) {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (zztdVar.f11963a == null) {
                                                    sb2.append(" uri");
                                                }
                                                if (zztdVar.f11964b == null) {
                                                    sb2.append(" schema");
                                                }
                                                if (zztdVar.f11967e == null) {
                                                    sb2.append(" variantConfig");
                                                }
                                                if ((zztdVar.f11969g & 1) == 0) {
                                                    sb2.append(" useGeneratedExtensionRegistry");
                                                }
                                                if ((zztdVar.f11969g & 2) == 0) {
                                                    sb2.append(" enableTracing");
                                                }
                                                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                                            }
                                            zzte zzteVar = new zzte(uri, zznuVar, zztdVar.f11965c, zztdVar.f11966d, zzujVar, zztdVar.f11968f);
                                            zztt zzttVar = zzpu.f11833c;
                                            if (zzttVar == null) {
                                                synchronized (zzpu.f11832b) {
                                                    try {
                                                        zzttVar = zzpu.f11833c;
                                                        if (zzttVar == null) {
                                                            zztu zztuVar = new zztu();
                                                            zztuVar.f11995a = zzlkVar2.a();
                                                            zztuVar.f11996b = (zzru) zzlkVar2.f11708f.get();
                                                            zzuw zzuwVar = zztx.f12000a;
                                                            zzti.zza.getClass();
                                                            HashMap map = zztuVar.f11997c;
                                                            Preconditions.f("There is already a factory registered for the ID %s", !map.containsKey("singleproc"), "singleproc");
                                                            map.put("singleproc", zzuwVar);
                                                            zztt zzttVar2 = new zztt(zztuVar.f11995a, zztuVar.f11996b, zztuVar.f11998d, zztuVar.f11997c);
                                                            zzpu.f11833c = zzttVar2;
                                                            zzttVar = zzttVar2;
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            ConcurrentHashMap concurrentHashMap = zzttVar.f11990a;
                                            Uri uri2 = zzteVar.f11970a;
                                            Pair pairCreate = (Pair) concurrentHashMap.get(uri2);
                                            if (pairCreate == null) {
                                                Uri uri3 = zzteVar.f11970a;
                                                Preconditions.f("Uri must be hierarchical: %s", uri3.isHierarchical(), uri3);
                                                String strD = Strings.d(uri3.getLastPathSegment());
                                                int iLastIndexOf = strD.lastIndexOf(46);
                                                Preconditions.f("Uri extension must be .pb: %s", (iLastIndexOf == -1 ? BuildConfig.VERSION_NAME : strD.substring(iLastIndexOf + 1)).equals("pb"), uri3);
                                                Preconditions.e("Handler cannot be null", zzteVar.f11972c != null);
                                                zzuw zzuwVar2 = (zzuw) zzttVar.f11994e.get("singleproc");
                                                Preconditions.f("No XDataStoreVariantFactory registered for ID %s", zzuwVar2 != null, "singleproc");
                                                String strD2 = Strings.d(zzteVar.f11970a.getLastPathSegment());
                                                int iLastIndexOf2 = strD2.lastIndexOf(46);
                                                if (iLastIndexOf2 != -1) {
                                                    strD2 = strD2.substring(0, iLastIndexOf2);
                                                }
                                                String str2 = strD2;
                                                ListenableFuture listenableFutureM = Futures.m(Futures.g(zzteVar.f11970a), zzttVar.f11993d, MoreExecutors.a());
                                                Executor executor = zzttVar.f11991b;
                                                zzru zzruVar = zzttVar.f11992c;
                                                zzti zztiVar = zzti.zza;
                                                zzui zzuiVarB = zzuwVar2.b(zzteVar, str2, executor, zzruVar, zztiVar);
                                                zzuwVar2.a(zztiVar);
                                                zztp zztpVar = new zztp(zzuiVarB, listenableFutureM);
                                                ImmutableList immutableList = zzteVar.f11973d;
                                                if (!immutableList.isEmpty()) {
                                                    zzto zztoVar = new zzto(immutableList, executor);
                                                    synchronized (zztpVar.f12051g) {
                                                        zztpVar.f12053i.add(zztoVar);
                                                    }
                                                }
                                                pairCreate = Pair.create(zztpVar, zzteVar);
                                                Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri2, pairCreate);
                                                if (pair != null) {
                                                    pairCreate = pair;
                                                }
                                            }
                                            zztp zztpVar2 = (zztp) pairCreate.first;
                                            zztr zztrVar = (zztr) pairCreate.second;
                                            if (zzteVar.equals(zztrVar)) {
                                                final ListenableFuture listenableFutureA = zztpVar2.a(new Function() { // from class: com.google.android.gms.internal.measurement.zzpt
                                                    @Override // com.google.common.base.Function
                                                    public final Object apply(Object obj) {
                                                        zznu zznuVar2 = (zznu) obj;
                                                        zzvb zzvbVar2 = zzpu.f11831a;
                                                        zznr zznrVarZ = zznr.z();
                                                        String str3 = str;
                                                        zznq zznqVar = (zznq) zznuVar2.y(str3, zznrVarZ).q();
                                                        if (!Collections.unmodifiableList(((zznr) zznqVar.f11266b).y()).contains(BuildConfig.VERSION_NAME)) {
                                                            zznqVar.m();
                                                            ((zznr) zznqVar.f11266b).A(BuildConfig.VERSION_NAME);
                                                        }
                                                        zznt zzntVar = (zznt) zznuVar2.q();
                                                        zznqVar.m();
                                                        ((zznr) zznqVar.f11266b).B(BuildConfig.VERSION_NAME);
                                                        zznr zznrVar = (zznr) zznqVar.p();
                                                        zzntVar.m();
                                                        ((zznu) zzntVar.f11266b).A().put(str3, zznrVar);
                                                        return (zznu) zzntVar.p();
                                                    }
                                                }, zzlkVar2.a());
                                                listenableFutureA.N(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzot
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        ListenableFuture listenableFuture = listenableFutureA;
                                                        zzpg zzpgVar2 = zzpgVar;
                                                        zzpgVar2.getClass();
                                                        try {
                                                            Futures.d(listenableFuture);
                                                        } catch (Exception unused) {
                                                            new StringBuilder(String.valueOf(zzpgVar2.f11812c).length() + 73);
                                                        }
                                                    }
                                                }, zzlkVar2.a());
                                                return;
                                            }
                                            String strC = Strings.c("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", zzteVar.f11971b.getClass().getSimpleName(), zzteVar.f11970a);
                                            Preconditions.f(strC, zzteVar.f11970a.equals(zztrVar.a()), "uri");
                                            Preconditions.f(strC, zzteVar.f11971b.equals(zztrVar.b()), "schema");
                                            Preconditions.f(strC, zzteVar.f11972c.equals(zztrVar.c()), "handler");
                                            Preconditions.f(strC, zzteVar.f11973d.equals(zztrVar.d()), "migrations");
                                            Preconditions.f(strC, zzteVar.f11974e.equals(zztrVar.e()), "variantConfig");
                                            Preconditions.f(strC, zzteVar.f11975f == zztrVar.f(), "useGeneratedExtensionRegistry");
                                            throw new IllegalArgumentException(Strings.c(strC, "unknown"));
                                        }
                                    });
                                }
                                if (this.f11817h.b()) {
                                    zzlkVar.a().execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzor
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ListenableFuture listenableFutureA;
                                            zzpg zzpgVar = this.f11790a;
                                            final zzqe zzqeVar = zzpgVar.f11811b.f11711i;
                                            zzabz zzabzVar = zzabz.FILE;
                                            boolean z11 = zzpgVar.f11814e;
                                            zzou zzouVar = new zzqc() { // from class: com.google.android.gms.internal.measurement.zzou
                                                /* JADX WARN: Code duplicated, block: B:39:0x0069 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:25:0x004c, B:27:0x0050, B:29:0x0054, B:34:0x005e, B:39:0x0069, B:40:0x0073), top: B:47:0x004c }] */
                                                @Override // com.google.android.gms.internal.measurement.zzqc
                                                public final boolean a(zzaef zzaefVar) {
                                                    zzpe zzpeVar = zzpg.f11808i;
                                                    zzpeVar.getClass();
                                                    if (zzaefVar == null || zzaefVar.isEmpty()) {
                                                        return false;
                                                    }
                                                    Iterator<E> it = zzaefVar.iterator();
                                                    boolean z12 = false;
                                                    while (it.hasNext()) {
                                                        zzoo zzooVar = (zzoo) zzpeVar.f11806a.get((String) it.next());
                                                        if (zzooVar != null) {
                                                            zzpg zzpgVar2 = zzooVar.f11787a;
                                                            boolean z13 = true;
                                                            if (zzpgVar2.f11814e) {
                                                                zzqs zzqsVar3 = zzpgVar2.f11810a;
                                                                if (zzqsVar3 != null && (zzqsVar3.f11879a || zzqsVar3.f11883e.f11877b == 3 || zzpgVar2.f11817h.b())) {
                                                                    synchronized (zzpgVar2) {
                                                                        try {
                                                                            zzqs zzqsVar4 = zzpgVar2.f11810a;
                                                                            if (zzqsVar4 != null) {
                                                                                if (zzqsVar4.f11879a) {
                                                                                    zzpgVar2.f11810a = null;
                                                                                    zzpgVar2.f11816g.f11829a.incrementAndGet();
                                                                                } else {
                                                                                    if (zzqsVar4.f11883e.f11877b != 3) {
                                                                                        z13 = false;
                                                                                    }
                                                                                    if (z13 || zzpgVar2.f11817h.b()) {
                                                                                        zzpgVar2.f11810a = null;
                                                                                        zzpgVar2.f11816g.f11829a.incrementAndGet();
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                }
                                                                z13 = false;
                                                            }
                                                            z12 |= z13;
                                                        }
                                                    }
                                                    return z12;
                                                }
                                            };
                                            final zzqm zzqmVar = (zzqm) zzqeVar.f11845c.get();
                                            if (zzqmVar == null && !z11) {
                                                Futures.h();
                                                return;
                                            }
                                            int iZza = 1 << zzabzVar.zza();
                                            if ((zzqeVar.f11847e & iZza) == 0) {
                                                CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f11848f;
                                                synchronized (copyOnWriteArrayList) {
                                                    try {
                                                        int i12 = zzqeVar.f11847e;
                                                        if ((i12 & iZza) == 0) {
                                                            copyOnWriteArrayList.add(zzouVar);
                                                            zzqeVar.f11847e = iZza | i12;
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            if (zzqeVar.f11850h == null) {
                                                synchronized (zzqeVar.f11849g) {
                                                    try {
                                                        if (zzqeVar.f11850h == null) {
                                                            if (zzqmVar == null) {
                                                                zzqmVar = new zzqm() { // from class: com.google.android.gms.internal.measurement.zzqb
                                                                    @Override // com.google.android.gms.internal.measurement.zzqm
                                                                    public final /* synthetic */ void zza() {
                                                                    }
                                                                };
                                                            }
                                                            Context context = zzqeVar.f11843a;
                                                            if (zzky.b(context)) {
                                                                listenableFutureA = ((zzmj) zzqeVar.f11846d.get()).a(new zzqd(zzqeVar, zzqmVar));
                                                                zzqeVar.f11850h = listenableFutureA;
                                                            } else {
                                                                zzpz zzpzVar = new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpz
                                                                    @Override // java.lang.Runnable
                                                                    public final /* synthetic */ void run() {
                                                                    }
                                                                };
                                                                Supplier supplier = zzqeVar.f11844b;
                                                                listenableFutureA = Futures.m(zzky.a(context, Executors.callable(zzpzVar, null), (Executor) supplier.get()), new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzqa
                                                                    @Override // com.google.common.util.concurrent.AsyncFunction
                                                                    public final ListenableFuture apply(Object obj) {
                                                                        zzqe zzqeVar2 = zzqeVar;
                                                                        return ((zzmj) zzqeVar2.f11846d.get()).a(new zzqd(zzqeVar2, zzqmVar));
                                                                    }
                                                                }, (Executor) supplier.get());
                                                                zzqeVar.f11850h = listenableFutureA;
                                                            }
                                                            listenableFutureA.N(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpy
                                                                @Override // java.lang.Runnable
                                                                public final /* synthetic */ void run() {
                                                                    try {
                                                                        Futures.d(listenableFutureA);
                                                                    } catch (Exception unused) {
                                                                    }
                                                                }
                                                            }, (Executor) zzqeVar.f11844b.get());
                                                        }
                                                    } catch (Throwable th3) {
                                                        throw th3;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                }
                                zzqsVar = zzqsVarA;
                            } else {
                                zzlkVar.a().execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzop
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f11788a.b();
                                    }
                                });
                                zzqsVar = new zzqs(zzqv.F(), zzqsVarA.f11883e);
                            }
                        }
                        if (!this.f11814e || zzqsVar.f11883e.f11878c != 17) {
                            this.f11810a = zzqsVar;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zzqsVar;
    }

    public final void b() {
        final zzqt zzqtVar = this.f11817h;
        zzlk zzlkVar = zzqtVar.f11885a;
        final ListenableFuture listenableFutureL = Futures.l(((zzmj) zzlkVar.f11706d.get()).zza(zzqtVar.f11887c), new Function() { // from class: com.google.android.gms.internal.measurement.zzqp
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                zzmg zzmgVar = (zzmg) obj;
                zzqu zzquVarE = zzqv.E();
                if (zzmgVar == null) {
                    return (zzqv) zzquVarE.p();
                }
                for (zzmi zzmiVar : zzmgVar.C()) {
                    zzqw zzqwVarE = zzqx.E();
                    String strY = zzmiVar.y();
                    zzqwVarE.m();
                    ((zzqx) zzqwVarE.f11266b).F(strY);
                    int iM = zzmiVar.M();
                    int i11 = iM - 1;
                    if (iM == 0) {
                        throw null;
                    }
                    if (i11 == 0) {
                        long jZ = zzmiVar.z();
                        zzqwVarE.m();
                        ((zzqx) zzqwVarE.f11266b).G(jZ);
                    } else if (i11 == 1) {
                        boolean zA = zzmiVar.A();
                        zzqwVarE.m();
                        ((zzqx) zzqwVarE.f11266b).H(zA);
                    } else if (i11 == 2) {
                        double dB = zzmiVar.B();
                        zzqwVarE.m();
                        ((zzqx) zzqwVarE.f11266b).I(dB);
                    } else if (i11 == 3) {
                        String strC = zzmiVar.C();
                        zzqwVarE.m();
                        ((zzqx) zzqwVarE.f11266b).J(strC);
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        zzacr zzacrVarD = zzmiVar.D();
                        zzqwVarE.m();
                        ((zzqx) zzqwVarE.f11266b).K(zzacrVarD);
                    }
                    zzqx zzqxVar = (zzqx) zzqwVarE.p();
                    zzquVarE.m();
                    ((zzqv) zzquVarE.f11266b).K(zzqxVar);
                }
                String strB = zzmgVar.B();
                zzquVarE.m();
                ((zzqv) zzquVarE.f11266b).I(strB);
                String strY2 = zzmgVar.y();
                zzquVarE.m();
                ((zzqv) zzquVarE.f11266b).G(strY2);
                long jD = zzmgVar.D();
                zzquVarE.m();
                ((zzqv) zzquVarE.f11266b).J(jD);
                if (zzmgVar.z()) {
                    zzacr zzacrVarA = zzmgVar.A();
                    zzquVarE.m();
                    ((zzqv) zzquVarE.f11266b).H(zzacrVarA);
                }
                return (zzqv) zzquVarE.p();
            }
        }, zzlkVar.a());
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzpf
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                final zzqv zzqvVar = (zzqv) obj;
                final zzqt zzqtVar2 = zzqtVar;
                zzqtVar2.getClass();
                return Futures.j(zzqtVar2.f11885a.a(), new Callable() { // from class: com.google.android.gms.internal.measurement.zzqq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzqv zzqvVar2 = zzqvVar;
                        zzqt zzqtVar3 = zzqtVar2;
                        zzlk zzlkVar2 = zzqtVar3.f11885a;
                        zzse zzseVar = new zzse();
                        try {
                            zzru zzruVar = (zzru) zzlkVar2.f11708f.get();
                            Uri uri = zzqtVar3.f11886b;
                            zzsv zzsvVar = new zzsv(zzqvVar2);
                            zzsvVar.f11960b = new zzro[]{zzseVar};
                            return null;
                        } catch (IOException | RuntimeException e8) {
                            zzlz.a(Level.WARNING, zzlkVar2.a(), e8, "Failed to update snapshot for %s flags may be stale.", zzqtVar3.f11887c);
                            return null;
                        }
                    }
                });
            }
        };
        zzlk zzlkVar2 = this.f11811b;
        Futures.m(listenableFutureL, asyncFunction, zzlkVar2.a()).N(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzov
            /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: CancellationException -> 0x001f, ExecutionException -> 0x0021, TryCatch #3 {CancellationException -> 0x001f, ExecutionException -> 0x0021, blocks: (B:3:0x0004, B:5:0x001a, B:18:0x002c, B:20:0x0036, B:22:0x0042, B:28:0x0052, B:30:0x0056, B:12:0x0023, B:33:0x0078, B:14:0x0026, B:17:0x002b, B:26:0x0048, B:27:0x0051), top: B:39:0x0004, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x0042 A[Catch: CancellationException -> 0x001f, ExecutionException -> 0x0021, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x001f, ExecutionException -> 0x0021, blocks: (B:3:0x0004, B:5:0x001a, B:18:0x002c, B:20:0x0036, B:22:0x0042, B:28:0x0052, B:30:0x0056, B:12:0x0023, B:33:0x0078, B:14:0x0026, B:17:0x002b, B:26:0x0048, B:27:0x0051), top: B:39:0x0004, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:36:0x0081  */
            /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() {
                zzqs zzqsVar;
                zzqm zzqmVar;
                final zzpg zzpgVar = this.f11795a;
                try {
                    zzqv zzqvVar = (zzqv) Futures.d(listenableFutureL);
                    zzqs zzqsVar2 = new zzqs(zzqvVar, new zzqr(6, 2));
                    boolean z11 = zzpgVar.f11814e;
                    if (z11 || (zzqsVar = zzpgVar.f11810a) == null) {
                        synchronized (zzpgVar) {
                            if (!z11) {
                                zzqsVar = zzpgVar.f11810a;
                                if (zzqsVar != null) {
                                    if (!zzqsVar.f11882d.equals(zzqsVar2.f11882d)) {
                                        zzqmVar = (zzqm) zzpgVar.f11811b.f11707e.get();
                                        if (zzqmVar != null) {
                                            zzqmVar.zza();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            zzpgVar.f11810a = zzqsVar2;
                            zzpgVar.f11816g.f11829a.incrementAndGet();
                        }
                    } else if (!zzqsVar.f11882d.equals(zzqsVar2.f11882d)) {
                        zzqmVar = (zzqm) zzpgVar.f11811b.f11707e.get();
                        if (zzqmVar != null) {
                            zzqmVar.zza();
                            return;
                        }
                        return;
                    }
                    if (zzpgVar.f11814e) {
                        zzlk zzlkVar3 = zzpgVar.f11811b;
                        Futures.b(((zzmj) zzlkVar3.f11706d.get()).zzb(zzqvVar.y()), Throwable.class, new Function() { // from class: com.google.android.gms.internal.measurement.zzow
                            @Override // com.google.common.base.Function
                            public final /* synthetic */ Object apply(Object obj) {
                                "Failed to commit to updated flags for ".concat(String.valueOf(zzpgVar.f11812c));
                                return null;
                            }
                        }, zzlkVar3.a());
                    }
                } catch (CancellationException e8) {
                    e = e8;
                    if (e.getCause() instanceof SecurityException) {
                    }
                    new StringBuilder(String.valueOf(zzpgVar.f11812c).length() + 64);
                } catch (ExecutionException e10) {
                    e = e10;
                    if (e.getCause() instanceof SecurityException) {
                        new StringBuilder(String.valueOf(zzpgVar.f11812c).length() + 64);
                    }
                }
            }
        }, zzlkVar2.a());
    }
}
