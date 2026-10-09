package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzul implements AsyncCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f12029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zztp f12030b;

    public /* synthetic */ zzul(zztp zztpVar) {
        this.f12030b = zztpVar;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public final ListenableFuture call() throws IOException {
        zztp zztpVar = this.f12030b;
        zzwi zzwiVarA = zztpVar.f12052h.a("Initialize ".concat(String.valueOf(zztpVar.f12045a)), zzxd.zza);
        try {
            synchronized (zztpVar.f12051g) {
                try {
                    if (this.f12029a == null) {
                        this.f12029a = zztpVar.f12053i;
                        zztpVar.f12053i = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ArrayList arrayList = new ArrayList(this.f12029a.size());
            zzus zzusVar = new zzus(this.f12030b);
            Iterator it = this.f12029a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((AsyncFunction) it.next()).apply(zzusVar));
                } catch (Exception e8) {
                    arrayList.add(Futures.f(e8));
                }
            }
            ListenableFuture listenableFutureA = new Futures.FutureCombiner(true, ImmutableList.m(arrayList)).a(MoreExecutors.a(), new Callable() { // from class: com.google.android.gms.internal.measurement.zzuk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzul zzulVar = this.f12028a;
                    synchronized (zzulVar.f12030b.f12051g) {
                        zzulVar.f12029a = null;
                    }
                    return null;
                }
            });
            zzwiVarA.a((AbstractFuture) listenableFutureA);
            zzwiVarA.close();
            return listenableFutureA;
        } catch (Throwable th3) {
            try {
                zzwiVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
