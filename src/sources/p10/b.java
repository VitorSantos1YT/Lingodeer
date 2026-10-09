package p10;

import b0.h2;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(w10.a aVar, int i11) {
        super(aVar);
        this.f46276c = i11;
    }

    @Override // b0.h2
    public final void W(w10.a level, String msg) {
        switch (this.f46276c) {
            case 0:
                m.f(level, "level");
                m.f(msg, "msg");
                int i11 = a.f46275a[level.ordinal()];
                break;
            default:
                m.f(level, "level");
                m.f(msg, "msg");
                break;
        }
    }
}
