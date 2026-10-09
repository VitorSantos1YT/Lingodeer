package gb;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ka.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f28948a;

    public /* synthetic */ m(Context context) {
        this.f28948a = context;
    }

    @Override // ka.c
    public ka.d g(ka.b bVar) {
        String str = bVar.f38024b;
        c7.f callback = bVar.f38025c;
        kotlin.jvm.internal.m.f(callback, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new la.h(this.f28948a, str, callback, true, true);
    }
}
