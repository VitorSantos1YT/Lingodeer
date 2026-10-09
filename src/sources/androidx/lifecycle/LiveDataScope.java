package androidx.lifecycle;

import qy.b0;
import rz.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface LiveDataScope<T> {
    Object emit(T t6, vy.d<? super b0> dVar);

    Object emitSource(LiveData<T> liveData, vy.d<? super q0> dVar);

    T getLatestValue();
}
