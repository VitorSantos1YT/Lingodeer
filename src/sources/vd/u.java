package vd;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements td.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f53950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f53951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final td.g f53952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f53953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final td.j f53954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53955j;

    public u(Object obj, td.g gVar, int i11, int i12, Map map, Class cls, Class cls2, td.j jVar) {
        pe.f.c(obj, "Argument must not be null");
        this.f53947b = obj;
        this.f53952g = gVar;
        this.f53948c = i11;
        this.f53949d = i12;
        pe.f.c(map, "Argument must not be null");
        this.f53953h = map;
        pe.f.c(cls, "Resource class must not be null");
        this.f53950e = cls;
        pe.f.c(cls2, "Transcode class must not be null");
        this.f53951f = cls2;
        pe.f.c(jVar, "Argument must not be null");
        this.f53954i = jVar;
    }

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f53947b.equals(uVar.f53947b) && this.f53952g.equals(uVar.f53952g) && this.f53949d == uVar.f53949d && this.f53948c == uVar.f53948c && this.f53953h.equals(uVar.f53953h) && this.f53950e.equals(uVar.f53950e) && this.f53951f.equals(uVar.f53951f) && this.f53954i.equals(uVar.f53954i)) {
                return true;
            }
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        if (this.f53955j == 0) {
            int iHashCode = this.f53947b.hashCode();
            this.f53955j = iHashCode;
            int iHashCode2 = ((((this.f53952g.hashCode() + (iHashCode * 31)) * 31) + this.f53948c) * 31) + this.f53949d;
            this.f53955j = iHashCode2;
            int iHashCode3 = this.f53953h.hashCode() + (iHashCode2 * 31);
            this.f53955j = iHashCode3;
            int iHashCode4 = this.f53950e.hashCode() + (iHashCode3 * 31);
            this.f53955j = iHashCode4;
            int iHashCode5 = this.f53951f.hashCode() + (iHashCode4 * 31);
            this.f53955j = iHashCode5;
            this.f53955j = this.f53954i.f52127b.hashCode() + (iHashCode5 * 31);
        }
        return this.f53955j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f53947b + ", width=" + this.f53948c + ", height=" + this.f53949d + ", resourceClass=" + this.f53950e + ", transcodeClass=" + this.f53951f + ", signature=" + this.f53952g + ", hashCode=" + this.f53955j + ", transformations=" + this.f53953h + ", options=" + this.f53954i + '}';
    }
}
