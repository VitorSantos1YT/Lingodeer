package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ExecutionSequencer;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzui implements zzuv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f12019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zztv f12020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f12021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzru f12022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Optional f12023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzwb f12024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12025h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExecutionSequencer f12026i = ExecutionSequencer.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListenableFuture f12027j = null;

    public zzui(String str, ListenableFuture listenableFuture, zztv zztvVar, Executor executor, zzru zzruVar, Optional optional, zzwb zzwbVar) {
        this.f12018a = str;
        this.f12019b = Futures.i(listenableFuture);
        this.f12020c = zztvVar;
        this.f12021d = MoreExecutors.c(executor);
        this.f12022e = zzruVar;
        this.f12023f = optional;
        this.f12024g = zzwbVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0016, B:14:0x0018, B:16:0x001c, B:17:0x0033, B:18:0x0035), top: B:25:0x0003, inners: #0 }] */
    @Override // com.google.android.gms.internal.measurement.zzuv
    public final ListenableFuture a(final zzwy zzwyVar, final Executor executor) {
        final ListenableFuture listenableFuture;
        synchronized (this.f12025h) {
            ListenableFuture listenableFuture2 = this.f12027j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.f12027j == null) {
                    this.f12027j = Futures.i(this.f12026i.b(zzxa.a(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzub
                        @Override // com.google.common.util.concurrent.AsyncCallable
                        public final ListenableFuture call() {
                            final zzui zzuiVar = this.f12008a;
                            try {
                                return Futures.g(zzuiVar.b((Uri) Futures.d(zzuiVar.f12019b)));
                            } catch (IOException e8) {
                                zzty zztyVar = new zzty(zzuiVar);
                                Optional optional = zzuiVar.f12023f;
                                if (!optional.c()) {
                                    return Futures.f(e8);
                                }
                                if ((e8 instanceof zzsg) || (e8.getCause() instanceof zzsg)) {
                                    return Futures.f(e8);
                                }
                                AbstractFuture abstractFutureA = ((zztf) optional.b()).a(e8, zztyVar);
                                AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzue
                                    @Override // com.google.common.util.concurrent.AsyncFunction
                                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                                        zzui zzuiVar2 = zzuiVar;
                                        return Futures.g(zzuiVar2.b((Uri) Futures.d(zzuiVar2.f12019b)));
                                    }
                                };
                                int i11 = zzxa.f12143a;
                                return Futures.m(abstractFutureA, new zzwy(zzvy.a(), asyncFunction), zzuiVar.f12021d);
                            }
                        }
                    }), this.f12021d));
                }
                listenableFuture = this.f12027j;
            } else {
                try {
                    Futures.d(this.f12027j);
                } catch (ExecutionException unused) {
                    this.f12027j = null;
                }
                if (this.f12027j == null) {
                    this.f12027j = Futures.i(this.f12026i.b(zzxa.a(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzub
                        @Override // com.google.common.util.concurrent.AsyncCallable
                        public final ListenableFuture call() {
                            final zzui zzuiVar = this.f12008a;
                            try {
                                return Futures.g(zzuiVar.b((Uri) Futures.d(zzuiVar.f12019b)));
                            } catch (IOException e8) {
                                zzty zztyVar = new zzty(zzuiVar);
                                Optional optional = zzuiVar.f12023f;
                                if (!optional.c()) {
                                    return Futures.f(e8);
                                }
                                if ((e8 instanceof zzsg) || (e8.getCause() instanceof zzsg)) {
                                    return Futures.f(e8);
                                }
                                AbstractFuture abstractFutureA = ((zztf) optional.b()).a(e8, zztyVar);
                                AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzue
                                    @Override // com.google.common.util.concurrent.AsyncFunction
                                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                                        zzui zzuiVar2 = zzuiVar;
                                        return Futures.g(zzuiVar2.b((Uri) Futures.d(zzuiVar2.f12019b)));
                                    }
                                };
                                int i11 = zzxa.f12143a;
                                return Futures.m(abstractFutureA, new zzwy(zzvy.a(), asyncFunction), zzuiVar.f12021d);
                            }
                        }
                    }), this.f12021d));
                }
                listenableFuture = this.f12027j;
            }
            throw th;
        }
        return this.f12026i.b(zzxa.a(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zztz
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                final zzui zzuiVar = this.f12002a;
                final ListenableFuture listenableFutureM = Futures.m(listenableFuture, new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzua
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        ListenableFuture listenableFuture3;
                        zzui zzuiVar2 = zzuiVar;
                        synchronized (zzuiVar2.f12025h) {
                            listenableFuture3 = zzuiVar2.f12027j;
                        }
                        return listenableFuture3;
                    }
                }, MoreExecutors.a());
                final ListenableFuture listenableFutureM2 = Futures.m(listenableFutureM, zzwyVar, executor);
                AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzuc
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        final zzui zzuiVar2 = zzuiVar;
                        ListenableFuture listenableFuture3 = listenableFutureM;
                        final ListenableFuture listenableFuture4 = listenableFutureM2;
                        if (Futures.d(listenableFuture3).equals(Futures.d(listenableFuture4))) {
                            return Futures.g(obj);
                        }
                        AsyncFunction asyncFunction2 = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzud
                            @Override // com.google.common.util.concurrent.AsyncFunction
                            public final /* synthetic */ ListenableFuture apply(Object obj2) throws IOException {
                                zzui zzuiVar3 = zzuiVar2;
                                ListenableFuture listenableFuture5 = listenableFuture4;
                                zzuiVar3.c((Uri) Futures.d(zzuiVar3.f12019b), obj2);
                                synchronized (zzuiVar3.f12025h) {
                                    zzuiVar3.f12027j = listenableFuture5;
                                }
                                return Futures.g(obj2);
                            }
                        };
                        int i11 = zzxa.f12143a;
                        ListenableFuture listenableFutureM3 = Futures.m(listenableFuture4, new zzwy(zzvy.a(), asyncFunction2), zzuiVar2.f12021d);
                        synchronized (zzuiVar2.f12025h) {
                        }
                        return listenableFutureM3;
                    }
                };
                int i11 = zzxa.f12143a;
                return Futures.m(listenableFutureM2, new zzwy(zzvy.a(), asyncFunction), MoreExecutors.a());
            }
        }), MoreExecutors.a());
    }

    public final Object b(Uri uri) throws IOException {
        zztv zztvVar = this.f12020c;
        String str = this.f12018a;
        zzru zzruVar = this.f12022e;
        try {
            try {
                zzwb zzwbVar = this.f12024g;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5);
                sb2.append("Read ");
                sb2.append(str);
                zzwi zzwiVarA = zzwbVar.a(sb2.toString(), zzxd.zza);
                try {
                    InputStream inputStream = (InputStream) zzruVar.a(uri, zzst.b());
                    try {
                        zzadu zzaduVarA = ((zzve) zztvVar).a().f().a(inputStream, ((zzve) zztvVar).b());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        zzwiVarA.close();
                        return zzaduVarA;
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        zzwiVarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e8) {
                throw zzux.a(zzruVar, uri, e8, str);
            }
        } catch (FileNotFoundException e10) {
            zzrs zzrsVarB = zzruVar.b(uri);
            if (zzrsVarB.f11920a.b(zzrsVarB.f11923d)) {
                throw e10;
            }
            return ((zzvd) zztvVar).f12058a;
        }
    }

    public final void c(Uri uri, Object obj) throws IOException {
        String str = this.f12018a;
        zzru zzruVar = this.f12022e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            zzwb zzwbVar = this.f12024g;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
            sb2.append("Write ");
            sb2.append(str);
            zzwi zzwiVarA = zzwbVar.a(sb2.toString(), zzxd.zza);
            try {
                zzse zzseVar = new zzse();
                try {
                    zzsw zzswVarB = zzsw.b();
                    zzswVarB.f11961a = new zzro[]{zzseVar};
                    OutputStream outputStream = (OutputStream) zzruVar.a(uriBuild, zzswVarB);
                    try {
                        ((zzafc) obj).g(outputStream);
                        if (zzseVar.f11949b == null) {
                            throw new zzsk("Cannot sync underlying stream");
                        }
                        zzseVar.f11948a.flush();
                        zzseVar.f11949b.f11952a.getFD().sync();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        zzwiVarA.close();
                        zzrs zzrsVarB = zzruVar.b(uriBuild);
                        zzrs zzrsVarB2 = zzruVar.b(uri);
                        zzsx zzsxVar = zzrsVarB.f11920a;
                        if (zzsxVar != zzrsVarB2.f11920a) {
                            throw new zzsk("Cannot rename file across backends");
                        }
                        zzsxVar.f(zzrsVarB.f11923d, zzrsVarB2.f11923d);
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e8) {
                    throw zzux.a(zzruVar, uri, e8, str);
                }
            } catch (Throwable th4) {
                try {
                    zzwiVarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e10) {
            zzrs zzrsVarB3 = zzruVar.b(uriBuild);
            if (zzrsVarB3.f11920a.b(zzrsVarB3.f11923d)) {
                try {
                    zzrs zzrsVarB4 = zzruVar.b(uriBuild);
                    zzrsVarB4.f11920a.e(zzrsVarB4.f11923d);
                } catch (IOException e11) {
                    e10.addSuppressed(e11);
                }
            }
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzuv
    public final String zzc() {
        return this.f12018a;
    }
}
