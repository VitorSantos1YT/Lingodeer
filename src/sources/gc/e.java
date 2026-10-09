package gc;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f28997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f28998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f28999c;

    public e(Drawable drawable, i iVar, Throwable th2) {
        this.f28997a = drawable;
        this.f28998b = iVar;
        this.f28999c = th2;
    }

    @Override // gc.j
    public final Drawable a() {
        return this.f28997a;
    }

    @Override // gc.j
    public final i b() {
        return this.f28998b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f28997a, eVar.f28997a) && kotlin.jvm.internal.m.a(this.f28998b, eVar.f28998b) && kotlin.jvm.internal.m.a(this.f28999c, eVar.f28999c);
    }

    public final int hashCode() {
        Drawable drawable = this.f28997a;
        return this.f28999c.hashCode() + ((this.f28998b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
