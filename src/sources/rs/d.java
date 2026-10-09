package rs;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f49398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f49399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f49400c;

    public d(Map wordsById, Map sentencesById, Map charactersById) {
        m.f(wordsById, "wordsById");
        m.f(sentencesById, "sentencesById");
        m.f(charactersById, "charactersById");
        this.f49398a = wordsById;
        this.f49399b = sentencesById;
        this.f49400c = charactersById;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.f49398a, dVar.f49398a) && m.a(this.f49399b, dVar.f49399b) && m.a(this.f49400c, dVar.f49400c);
    }

    public final int hashCode() {
        return this.f49400c.hashCode() + ((this.f49399b.hashCode() + (this.f49398a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return ypOOxsaJG.AFonukOzFiHuO + this.f49398a + ", sentencesById=" + this.f49399b + ", charactersById=" + this.f49400c + ")";
    }
}
