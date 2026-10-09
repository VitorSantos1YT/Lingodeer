package x00;

import hh.p0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55623a;

    public /* synthetic */ b(int i11) {
        this.f55623a = i11;
    }

    public final Set a() {
        switch (this.f55623a) {
            case 0:
                HashSet hashSet = new HashSet(1);
                Object obj = new Object[]{'<'}[0];
                Objects.requireNonNull(obj);
                if (hashSet.add(obj)) {
                    return Collections.unmodifiableSet(hashSet);
                }
                throw new IllegalArgumentException(p0.k(obj, "duplicate element: "));
            case 1:
                HashSet hashSet2 = new HashSet(1);
                Object obj2 = new Object[]{'\\'}[0];
                Objects.requireNonNull(obj2);
                if (hashSet2.add(obj2)) {
                    return Collections.unmodifiableSet(hashSet2);
                }
                throw new IllegalArgumentException(p0.k(obj2, "duplicate element: "));
            case 2:
                HashSet hashSet3 = new HashSet(1);
                Object obj3 = new Object[]{'`'}[0];
                Objects.requireNonNull(obj3);
                if (hashSet3.add(obj3)) {
                    return Collections.unmodifiableSet(hashSet3);
                }
                throw new IllegalArgumentException(p0.k(obj3, "duplicate element: "));
            case 3:
                HashSet hashSet4 = new HashSet(1);
                Object obj4 = new Object[]{'&'}[0];
                Objects.requireNonNull(obj4);
                if (hashSet4.add(obj4)) {
                    return Collections.unmodifiableSet(hashSet4);
                }
                throw new IllegalArgumentException(p0.k(obj4, "duplicate element: "));
            default:
                HashSet hashSet5 = new HashSet(1);
                Object obj5 = new Object[]{'<'}[0];
                Objects.requireNonNull(obj5);
                if (hashSet5.add(obj5)) {
                    return Collections.unmodifiableSet(hashSet5);
                }
                throw new IllegalArgumentException(p0.k(obj5, "duplicate element: "));
        }
    }
}
