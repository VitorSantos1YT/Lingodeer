package p7;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f46426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46427b;

    public m(List list, List list2) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        b7.a.d(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            builder.h(new l((b1) list.get(i11), (List) list2.get(i11)));
        }
        this.f46426a = builder.j();
        this.f46427b = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.b1
    public final boolean a() {
        int i11 = 0;
        while (true) {
            ImmutableList immutableList = this.f46426a;
            if (i11 >= immutableList.size()) {
                return false;
            }
            if (((l) immutableList.get(i11)).f46415a.a()) {
                return true;
            }
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.b1
    public final long h() {
        int i11 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.f46426a;
            if (i11 >= immutableList.size()) {
                break;
            }
            long jH = ((l) immutableList.get(i11)).f46415a.h();
            if (jH != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jH);
            }
            i11++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.b1
    public final boolean u(f7.j0 j0Var) {
        boolean zU;
        boolean z11 = false;
        do {
            long jH = h();
            if (jH == Long.MIN_VALUE) {
                return z11;
            }
            int i11 = 0;
            zU = false;
            while (true) {
                ImmutableList immutableList = this.f46426a;
                if (i11 >= immutableList.size()) {
                    break;
                }
                long jH2 = ((l) immutableList.get(i11)).f46415a.h();
                boolean z12 = jH2 != Long.MIN_VALUE && jH2 <= j0Var.f26811a;
                if (jH2 == jH || z12) {
                    zU |= ((l) immutableList.get(i11)).f46415a.u(j0Var);
                }
                i11++;
            }
            z11 |= zU;
        } while (zU);
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.b1
    public final long w() {
        int i11 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ImmutableList immutableList = this.f46426a;
            if (i11 >= immutableList.size()) {
                break;
            }
            l lVar = (l) immutableList.get(i11);
            long jW = lVar.f46415a.w();
            ImmutableList immutableList2 = lVar.f46416b;
            if ((immutableList2.contains(1) || immutableList2.contains(2) || immutableList2.contains(4)) && jW != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jW);
            }
            if (jW != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jW);
            }
            i11++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f46427b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j11 = this.f46427b;
        return j11 != -9223372036854775807L ? j11 : jMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.b1
    public final void x(long j11) {
        int i11 = 0;
        while (true) {
            ImmutableList immutableList = this.f46426a;
            if (i11 >= immutableList.size()) {
                return;
            }
            ((l) immutableList.get(i11)).x(j11);
            i11++;
        }
    }
}
