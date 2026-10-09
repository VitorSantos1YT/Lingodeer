package f;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26118d;

    public a(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        float fR = a5.b.r(backEvent);
        float fS = a5.b.s(backEvent);
        float fK = a5.b.k(backEvent);
        int iQ = a5.b.q(backEvent);
        this.f26115a = fR;
        this.f26116b = fS;
        this.f26117c = fK;
        this.f26118d = iQ;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f26115a);
        sb2.append(", touchY=");
        sb2.append(this.f26116b);
        sb2.append(", progress=");
        sb2.append(this.f26117c);
        sb2.append(", swipeEdge=");
        return ep.a.j(sb2, this.f26118d, '}');
    }
}
