package jz;

import java.util.Random;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f10.b f37395c = new f10.b(1);

    @Override // jz.a
    public final Random f() {
        Object obj = this.f37395c.get();
        m.e(obj, "get(...)");
        return (Random) obj;
    }
}
