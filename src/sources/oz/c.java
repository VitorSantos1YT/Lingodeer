package oz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements nz.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f46146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.e f46148c;

    public c(CharSequence input, int i11, fz.e eVar) {
        kotlin.jvm.internal.m.f(input, "input");
        this.f46146a = input;
        this.f46147b = i11;
        this.f46148c = eVar;
    }

    @Override // nz.l
    public final Iterator iterator() {
        return new b(this);
    }
}
