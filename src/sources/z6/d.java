package z6;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f58934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f58935b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f58936c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f58937d;

    public d(ImmutableList immutableList) {
        this.f58934a = immutableList;
        e eVar = e.f58938e;
        this.f58937d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f58935b;
        arrayList.clear();
        this.f58937d = false;
        int i11 = 0;
        while (true) {
            ImmutableList immutableList = this.f58934a;
            if (i11 >= immutableList.size()) {
                break;
            }
            f fVar = (f) immutableList.get(i11);
            fVar.flush();
            if (fVar.isActive()) {
                arrayList.add(fVar);
            }
            i11++;
        }
        this.f58936c = new ByteBuffer[arrayList.size()];
        for (int i12 = 0; i12 <= b(); i12++) {
            this.f58936c[i12] = ((f) arrayList.get(i12)).b();
        }
    }

    public final int b() {
        return this.f58936c.length - 1;
    }

    public final boolean c() {
        return this.f58937d && ((f) this.f58935b.get(b())).a() && !this.f58936c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f58935b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z11;
        for (boolean z12 = true; z12; z12 = z11) {
            z11 = false;
            for (int i11 = 0; i11 <= b(); i11++) {
                if (!this.f58936c[i11].hasRemaining()) {
                    ArrayList arrayList = this.f58935b;
                    f fVar = (f) arrayList.get(i11);
                    if (!fVar.a()) {
                        ByteBuffer byteBuffer2 = i11 > 0 ? this.f58936c[i11 - 1] : byteBuffer.hasRemaining() ? byteBuffer : f.f58943a;
                        long jRemaining = byteBuffer2.remaining();
                        fVar.c(byteBuffer2);
                        this.f58936c[i11] = fVar.b();
                        z11 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f58936c[i11].hasRemaining();
                    } else if (!this.f58936c[i11].hasRemaining() && i11 < b()) {
                        ((f) arrayList.get(i11 + 1)).d();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        ImmutableList immutableList = ((d) obj).f58934a;
        ImmutableList immutableList2 = this.f58934a;
        if (immutableList2.size() != immutableList.size()) {
            return false;
        }
        for (int i11 = 0; i11 < immutableList2.size(); i11++) {
            if (immutableList2.get(i11) != immutableList.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f58934a.hashCode();
    }
}
