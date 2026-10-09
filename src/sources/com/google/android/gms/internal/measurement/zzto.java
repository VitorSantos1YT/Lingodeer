package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.d;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzto implements AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f11987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f11988b;

    public zzto(ImmutableList immutableList, Executor executor) {
        this.f11987a = immutableList;
        this.f11988b = executor;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture apply(Object obj) {
        zzth zzthVar = (zzth) obj;
        ImmutableList immutableList = this.f11987a;
        final int size = immutableList.size();
        final ArrayList arrayList = new ArrayList(size);
        int size2 = immutableList.size();
        int i11 = 0;
        while (i11 < size2) {
            E e8 = immutableList.get(i11);
            i11++;
            arrayList.add(((zztj) e8).zza());
        }
        AsyncFunction asyncFunction = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zztn
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj2) {
                final zzafc zzafcVar = (zzafc) obj2;
                final ArrayList arrayList2 = arrayList;
                Futures.FutureCombiner futureCombiner = new Futures.FutureCombiner(false, ImmutableList.m(arrayList2));
                final zzto zztoVar = this;
                final int i12 = size;
                return futureCombiner.b(zzxa.a(new AsyncCallable() { // from class: com.google.android.gms.internal.measurement.zztl
                    @Override // com.google.common.util.concurrent.AsyncCallable
                    public final ListenableFuture call() {
                        ListenableFuture listenableFutureG = Futures.g(zzafcVar);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (((Boolean) Futures.d((Future) arrayList2.get(i13))).booleanValue()) {
                                final zztj zztjVar = (zztj) zztoVar.f11987a.get(i13);
                                AsyncFunction asyncFunction2 = new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zztm
                                    @Override // com.google.common.util.concurrent.AsyncFunction
                                    public final /* synthetic */ ListenableFuture apply(Object obj3) {
                                        return zztjVar.zzc();
                                    }
                                };
                                int i14 = zzxa.f12143a;
                                listenableFutureG = Futures.m(listenableFutureG, new zzwy(zzvy.a(), asyncFunction2), MoreExecutors.a());
                            }
                        }
                        return listenableFutureG;
                    }
                }), zztoVar.f11988b);
            }
        };
        int i12 = zzxa.f12143a;
        return Futures.m(zzthVar.a(new zzwy(zzvy.a(), asyncFunction), MoreExecutors.a()), new zzwy(zzvy.a(), new AsyncFunction() { // from class: com.google.android.gms.internal.measurement.zztk
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final ListenableFuture apply(Object obj2) {
                int i13 = size;
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    if (((Boolean) Futures.d((Future) arrayList.get(i14))).booleanValue()) {
                        arrayList2.add(((zztj) this.f11987a.get(i14)).zzb());
                    }
                }
                return new Futures.FutureCombiner(true, ImmutableList.m(arrayList2)).a(MoreExecutors.a(), new d());
            }
        }), MoreExecutors.a());
    }
}
