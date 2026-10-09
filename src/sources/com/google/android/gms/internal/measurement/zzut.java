package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.ExecutionSequencer;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class zzut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f12046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzuv f12047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutionSequencer f12048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzvm f12049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzvm f12050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzwb f12052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f12053i;

    public zzut(zzuv zzuvVar, ListenableFuture listenableFuture) {
        final zztp zztpVar = (zztp) this;
        this.f12050f = new zzvm(new zzul(zztpVar), MoreExecutors.a());
        Object obj = new Object();
        this.f12051g = obj;
        this.f12053i = new ArrayList();
        this.f12047c = zzuvVar;
        this.f12046b = listenableFuture;
        this.f12045a = zzuvVar.zzc();
        final zzui zzuiVar = (zzui) zzuvVar;
        this.f12049e = new zzvm(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzuh
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                final zzui zzuiVar2 = zzuiVar;
                zzuiVar2.getClass();
                AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzug
                    @Override // com.google.common.util.concurrent.AsyncFunction
                    public final ListenableFuture apply(Object obj2) {
                        Uri uri = (Uri) obj2;
                        zzui zzuiVar3 = zzuiVar2;
                        zzuiVar3.getClass();
                        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                        try {
                            zzru zzruVar = zzuiVar3.f12022e;
                            zzrs zzrsVarB = zzruVar.b(uriBuild);
                            if (zzrsVarB.f11920a.b(zzrsVarB.f11923d)) {
                                zzrs zzrsVarB2 = zzruVar.b(uriBuild);
                                zzrs zzrsVarB3 = zzruVar.b(uri);
                                zzsx zzsxVar = zzrsVarB2.f11920a;
                                if (zzsxVar != zzrsVarB3.f11920a) {
                                    throw new zzsk("Cannot rename file across backends");
                                }
                                zzsxVar.f(zzrsVarB2.f11923d, zzrsVarB3.f11923d);
                            }
                            return Futures.h();
                        } catch (IOException e8) {
                            return Futures.f(e8);
                        }
                    }
                };
                int i11 = zzxa.f12143a;
                return Futures.i(Futures.m(zzuiVar2.f12019b, new zzwy(zzvy.a(), asyncFunction), zzuiVar2.f12021d));
            }
        }, MoreExecutors.a());
        this.f12048d = ExecutionSequencer.a();
        this.f12052h = new zzwa();
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzuq
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return zztpVar.f12049e.a();
            }
        };
        synchronized (obj) {
            this.f12053i.add(asyncFunction);
        }
    }

    public final ListenableFuture a(final Function function, final ListeningScheduledExecutorService listeningScheduledExecutorService) throws IOException {
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzuo
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return Futures.g(function.apply(obj));
            }
        };
        int i11 = zzxa.f12143a;
        final zzwy zzwyVar = new zzwy(zzvy.a(), asyncFunction);
        new Stopwatch(zzxh.f12144a).b();
        zzwi zzwiVarA = this.f12052h.a("Update ".concat(String.valueOf(this.f12045a)), zzxd.zza);
        try {
            final AbstractFuture abstractFutureA = this.f12050f.a();
            ExecutionSequencer executionSequencer = this.f12048d;
            executionSequencer.b(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzum
                @Override // com.google.common.util.concurrent.AsyncCallable
                public final /* synthetic */ ListenableFuture call() {
                    return abstractFutureA;
                }
            }, MoreExecutors.a());
            ListenableFuture listenableFutureB = executionSequencer.b(zzxa.a(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zzun
                @Override // com.google.common.util.concurrent.AsyncCallable
                public final ListenableFuture call() {
                    final zzwy zzwyVar2 = zzwyVar;
                    final Executor executor = listeningScheduledExecutorService;
                    final zzut zzutVar = this.f12032a;
                    AsyncFunction asyncFunction2 = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zzup
                        @Override // com.google.common.util.concurrent.AsyncFunction
                        public final /* synthetic */ ListenableFuture apply(Object obj) {
                            return zzutVar.f12047c.a(zzwyVar2, executor);
                        }
                    };
                    int i12 = zzxa.f12143a;
                    return Futures.m(abstractFutureA, new zzwy(zzvy.a(), asyncFunction2), MoreExecutors.a());
                }
            }), MoreExecutors.a());
            Futures.propagateCancellation(listenableFutureB, abstractFutureA);
            Futures.i(this.f12046b);
            ListenableFuture listenableFutureL = Futures.l(listenableFutureB, Functions.a(), MoreExecutors.a());
            zzwiVarA.a((AbstractFuture) listenableFutureL);
            zzwiVarA.close();
            return listenableFutureL;
        } catch (Throwable th2) {
            try {
                zzwiVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
