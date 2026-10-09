package o6;

import c6.j;
import c6.l;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c6.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f44714b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44713a = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44715c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f44716d = j.f6631a;

    @Override // c6.g
    public final c6.g a() {
        a aVar = new a();
        aVar.f44716d = this.f44716d;
        aVar.f44713a = this.f44713a;
        aVar.f44714b = this.f44714b;
        aVar.f44715c = this.f44715c;
        return aVar;
    }

    @Override // c6.g
    public final l b() {
        return this.f44716d;
    }

    @Override // c6.g
    public final void c(l lVar) {
        this.f44716d = lVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmittableText(");
        sb2.append(this.f44713a);
        sb2.append(", style=");
        sb2.append(this.f44714b);
        sb2.append(", modifier=");
        sb2.append(this.f44716d);
        sb2.append(", maxLines=");
        return ep.a.j(sb2, this.f44715c, ')');
    }
}
