package av;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv.z f3161c;

    public j(String str, ArrayList arrayList, bv.z zVar) {
        this.f3159a = str;
        this.f3160b = arrayList;
        this.f3161c = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3159a.equals(jVar.f3159a) && this.f3160b.equals(jVar.f3160b) && this.f3161c.equals(jVar.f3161c);
    }

    public final int hashCode() {
        return this.f3161c.hashCode() + nv.p.b(this.f3160b, this.f3159a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChineseToneRecognitionResult(recognizedText=" + this.f3159a + ", wordAccuracyList=" + this.f3160b + ", toneResult=" + this.f3161c + ")";
    }
}
