package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzof extends zznp implements zznw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f11773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzps f11774d;

    public zzof(String str, zzph zzphVar) {
        super(str, zzphVar);
        this.f11773c = -1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Override // com.google.android.gms.internal.measurement.zznp
    public final Object c(final zzlk zzlkVar) {
        zzpg zzpgVarA;
        Object objB;
        t0 t0Var;
        int i11 = this.f11773c;
        if (i11 == -1 || i11 < this.f11774d.f11829a.get()) {
            synchronized (this) {
                try {
                    int i12 = this.f11773c;
                    Object objE = null;
                    if (i12 == -1) {
                        zzlk.b();
                        zzlkVar.getClass();
                        zzpgVarA = this.f11762b.a(zzlkVar);
                        this.f11774d = zzpgVarA.f11816g;
                    } else {
                        zzpgVarA = null;
                    }
                    int i13 = this.f11774d.f11829a.get();
                    if (i12 < i13) {
                        zzlk.b();
                        zzlkVar.getClass();
                        Optional optionalA = zzlf.a(zzlkVar.f11704b);
                        if (optionalA.c()) {
                            zzle zzleVar = (zzle) optionalA.b();
                            Uri uriA = zzlg.a();
                            String str = this.f11761a;
                            if (uriA != null) {
                                t0Var = (t0) zzleVar.f11689a.get(uriA.toString());
                            } else {
                                zzleVar.getClass();
                                t0Var = null;
                            }
                            String str2 = t0Var == null ? null : (String) t0Var.get(str);
                            if (str2 == null) {
                                objB = null;
                            } else {
                                try {
                                    objB = d(str2);
                                } catch (IOException | IllegalArgumentException unused) {
                                    "Invalid Phenotype flag value for flag ".concat(this.f11761a);
                                    objB = null;
                                }
                            }
                        } else {
                            objB = null;
                        }
                        if (zzpgVarA == null) {
                            zzpgVarA = this.f11762b.a(zzlkVar);
                        }
                        final String str3 = zzpgVarA.f11812c;
                        if (Build.VERSION.SDK_INT >= 26 && !zzlkVar.f11704b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture listenableFutureSubmit = zzlkVar.a().submit(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context = zzlkVar.f11704b;
                                    Map map = zzpp.f11827c;
                                    if (map == null) {
                                        synchronized (zzpp.f11826b) {
                                            map = zzpp.f11827c;
                                            if (map == null) {
                                                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                                                try {
                                                    String[] list = context.getAssets().list("phenotype");
                                                    if (list != null) {
                                                        for (String str4 : list) {
                                                            if (str4.endsWith("_package_metadata.binarypb")) {
                                                                try {
                                                                    AssetManager assets = context.getAssets();
                                                                    StringBuilder sb2 = new StringBuilder(str4.length() + 10);
                                                                    sb2.append("phenotype/");
                                                                    sb2.append(str4);
                                                                    InputStream inputStreamOpen = assets.open(sb2.toString());
                                                                    try {
                                                                        zzadf zzadfVar = zzadf.f11253b;
                                                                        int i14 = zzacf.f11197a;
                                                                        zzpp zzppVar = new zzpp(context, zzpr.A(inputStreamOpen, zzadf.f11254c));
                                                                        builder.c(zzppVar.f11828a, zzppVar);
                                                                        if (inputStreamOpen != null) {
                                                                            inputStreamOpen.close();
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        if (inputStreamOpen != null) {
                                                                            try {
                                                                                inputStreamOpen.close();
                                                                            } catch (Throwable th3) {
                                                                                th2.addSuppressed(th3);
                                                                            }
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (zzaeh unused2) {
                                                                    new StringBuilder(str4.length() + 45);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (IOException unused3) {
                                                }
                                                ImmutableMap immutableMapA = builder.a(true);
                                                zzpp.f11827c = immutableMapA;
                                                map = immutableMapA;
                                            }
                                        }
                                    }
                                    String str5 = str3;
                                    if (((ImmutableMap) map).containsKey(str5)) {
                                        return;
                                    }
                                    new StringBuilder(str5.length() + 173);
                                }
                            });
                            listenableFutureSubmit.N(new zzpw(listenableFutureSubmit), MoreExecutors.a());
                        }
                        Object obj = zzpgVarA.a().f11882d.get(this.f11761a);
                        if (obj != null) {
                            try {
                                objE = e(obj);
                            } catch (IOException | ClassCastException unused2) {
                                "Invalid Phenotype flag value for flag ".concat(this.f11761a);
                            }
                        }
                        if (true != optionalA.c()) {
                            objB = objE;
                        }
                        if (objB == null) {
                            objB = b();
                        }
                        if (objB != null) {
                            a(objB);
                            this.f11773c = i13;
                        }
                        return objB;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zze();
    }
}
