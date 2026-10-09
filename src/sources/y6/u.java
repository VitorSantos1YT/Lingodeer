package y6;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f57358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImmutableList f57361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f57362e;

    static {
        w4.c.s(0, 1, 2, 3, 4);
        b7.f0.G(5);
        b7.f0.G(6);
        b7.f0.G(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(Uri uri, String str, qx.b bVar, List list, ImmutableList immutableList, long j11) {
        this.f57358a = uri;
        this.f57359b = d0.o(str);
        this.f57360c = list;
        this.f57361d = immutableList;
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i11 = 0; i11 < immutableList.size(); i11++) {
            ((w) immutableList.get(i11)).getClass();
            builder.h(new w());
        }
        builder.j();
        this.f57362e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f57358a.equals(uVar.f57358a) && Objects.equals(this.f57359b, uVar.f57359b) && Objects.equals(null, null) && this.f57360c.equals(uVar.f57360c) && this.f57361d.equals(uVar.f57361d) && this.f57362e == uVar.f57362e;
    }

    public final int hashCode() {
        int iHashCode = this.f57358a.hashCode() * 31;
        String str = this.f57359b;
        return (int) ((((long) ((this.f57361d.hashCode() + ((this.f57360c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.f57362e);
    }
}
