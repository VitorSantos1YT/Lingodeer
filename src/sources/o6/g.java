package o6;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import kotlin.jvm.internal.m;
import v3.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6.a f44729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f44730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f44731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f44732d;

    public g(p6.a aVar, o oVar, b bVar, c cVar, int i11) {
        oVar = (i11 & 2) != 0 ? null : oVar;
        bVar = (i11 & 4) != 0 ? null : bVar;
        cVar = (i11 & 16) != 0 ? null : cVar;
        this.f44729a = aVar;
        this.f44730b = oVar;
        this.f44731c = bVar;
        this.f44732d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.f44729a, gVar.f44729a) && m.a(this.f44730b, gVar.f44730b) && m.a(this.f44731c, gVar.f44731c) && m.a(this.f44732d, gVar.f44732d);
    }

    public final int hashCode() {
        int iHashCode = this.f44729a.hashCode() * 31;
        o oVar = this.f44730b;
        int iHashCode2 = (iHashCode + (oVar != null ? Long.hashCode(oVar.f53502a) : 0)) * 31;
        b bVar = this.f44731c;
        return (((iHashCode2 + (bVar != null ? Integer.hashCode(bVar.f44717a) : 0)) * 29791) + (this.f44732d != null ? Integer.hashCode(3) : 0)) * 31;
    }

    public final String toString() {
        return "TextStyle(color=" + this.f44729a + ", fontSize=" + this.f44730b + MzwEyWCkjXL.YPAURljHj + this.f44731c + ", fontStyle=null, textDecoration=null, textAlign=" + this.f44732d + ", fontFamily=null)";
    }
}
