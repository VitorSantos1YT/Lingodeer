package r8;

import androidx.media3.common.ParserException;
import b7.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f48847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f48851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f48852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48854i;

    public a(w wVar, w wVar2, boolean z11) throws ParserException {
        this.f48852g = wVar;
        this.f48851f = wVar2;
        this.f48850e = z11;
        wVar2.I(12);
        this.f48846a = wVar2.A();
        wVar.I(12);
        this.f48854i = wVar.A();
        x7.a.c("first_chunk must be 1", wVar.j() == 1);
        this.f48847b = -1;
    }

    public final boolean a() {
        int i11 = this.f48847b + 1;
        this.f48847b = i11;
        if (i11 == this.f48846a) {
            return false;
        }
        boolean z11 = this.f48850e;
        w wVar = this.f48851f;
        this.f48849d = z11 ? wVar.B() : wVar.y();
        if (this.f48847b == this.f48853h) {
            w wVar2 = this.f48852g;
            this.f48848c = wVar2.A();
            wVar2.J(4);
            int i12 = this.f48854i - 1;
            this.f48854i = i12;
            this.f48853h = i12 > 0 ? wVar2.A() - 1 : -1;
        }
        return true;
    }
}
