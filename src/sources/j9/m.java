package j9;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f36215b;

    public /* synthetic */ m(int i11, Bundle bundle) {
        this.f36214a = i11;
        this.f36215b = bundle;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        String argName = (String) obj;
        switch (this.f36214a) {
            case 0:
                kotlin.jvm.internal.m.f(argName, "argName");
                Bundle source = this.f36215b;
                kotlin.jvm.internal.m.f(source, "source");
                zContainsKey = source.containsKey(argName);
                break;
            default:
                kotlin.jvm.internal.m.f(argName, "key");
                Bundle source2 = this.f36215b;
                kotlin.jvm.internal.m.f(source2, "source");
                zContainsKey = source2.containsKey(argName);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
