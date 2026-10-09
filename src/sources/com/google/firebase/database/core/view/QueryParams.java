package com.google.firebase.database.core.view;

import com.google.firebase.database.snapshot.ChildKey;
import com.google.firebase.database.snapshot.Index;
import com.google.firebase.database.snapshot.Node;
import com.google.firebase.database.snapshot.PriorityIndex;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class QueryParams {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final QueryParams f19466i = new QueryParams();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f19467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewFrom f19468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Node f19469c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ChildKey f19470d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Node f19471e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ChildKey f19472f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Index f19473g = PriorityIndex.f19553a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f19474h = null;

    /* JADX INFO: renamed from: com.google.firebase.database.core.view.QueryParams$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19475a;

        static {
            int[] iArr = new int[ViewFrom.values().length];
            f19475a = iArr;
            try {
                iArr[ViewFrom.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19475a[ViewFrom.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ViewFrom {
        private static final /* synthetic */ ViewFrom[] $VALUES;
        public static final ViewFrom LEFT;
        public static final ViewFrom RIGHT;

        static {
            ViewFrom viewFrom = new ViewFrom("LEFT", 0);
            LEFT = viewFrom;
            ViewFrom viewFrom2 = new ViewFrom("RIGHT", 1);
            RIGHT = viewFrom2;
            $VALUES = new ViewFrom[]{viewFrom, viewFrom2};
        }

        public static ViewFrom valueOf(String str) {
            return (ViewFrom) Enum.valueOf(ViewFrom.class, str);
        }

        public static ViewFrom[] values() {
            return (ViewFrom[]) $VALUES.clone();
        }
    }

    public final QueryParams a() {
        QueryParams queryParams = new QueryParams();
        queryParams.f19467a = this.f19467a;
        queryParams.f19469c = this.f19469c;
        queryParams.f19470d = this.f19470d;
        queryParams.f19471e = this.f19471e;
        queryParams.f19472f = this.f19472f;
        queryParams.f19468b = this.f19468b;
        queryParams.f19473g = this.f19473g;
        return queryParams;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        if (e()) {
            map.put("sp", this.f19469c.getValue());
            ChildKey childKey = this.f19470d;
            if (childKey != null) {
                map.put("sn", childKey.f19513a);
            }
        }
        if (c()) {
            map.put("ep", this.f19471e.getValue());
            ChildKey childKey2 = this.f19472f;
            if (childKey2 != null) {
                map.put("en", childKey2.f19513a);
            }
        }
        Integer num = this.f19467a;
        if (num != null) {
            map.put("l", num);
            ViewFrom viewFrom = this.f19468b;
            if (viewFrom == null) {
                viewFrom = e() ? ViewFrom.LEFT : ViewFrom.RIGHT;
            }
            int i11 = AnonymousClass1.f19475a[viewFrom.ordinal()];
            if (i11 == 1) {
                map.put("vf", "l");
            } else if (i11 == 2) {
                map.put("vf", "r");
            }
        }
        if (!this.f19473g.equals(PriorityIndex.f19553a)) {
            map.put("i", this.f19473g.a());
        }
        return map;
    }

    public final boolean c() {
        return this.f19471e != null;
    }

    public final boolean d() {
        return this.f19467a != null;
    }

    public final boolean e() {
        return this.f19469c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QueryParams.class != obj.getClass()) {
            return false;
        }
        QueryParams queryParams = (QueryParams) obj;
        Integer num = this.f19467a;
        if (num == null ? queryParams.f19467a != null : !num.equals(queryParams.f19467a)) {
            return false;
        }
        Index index = this.f19473g;
        if (index == null ? queryParams.f19473g != null : !index.equals(queryParams.f19473g)) {
            return false;
        }
        ChildKey childKey = this.f19472f;
        if (childKey == null ? queryParams.f19472f != null : !childKey.equals(queryParams.f19472f)) {
            return false;
        }
        Node node = this.f19471e;
        if (node == null ? queryParams.f19471e != null : !node.equals(queryParams.f19471e)) {
            return false;
        }
        ChildKey childKey2 = this.f19470d;
        if (childKey2 == null ? queryParams.f19470d != null : !childKey2.equals(queryParams.f19470d)) {
            return false;
        }
        Node node2 = this.f19469c;
        if (node2 == null ? queryParams.f19469c == null : node2.equals(queryParams.f19469c)) {
            return f() == queryParams.f();
        }
        return false;
    }

    public final boolean f() {
        ViewFrom viewFrom = this.f19468b;
        if (viewFrom != null) {
            return viewFrom == ViewFrom.LEFT;
        }
        return e();
    }

    public final QueryParams g() {
        QueryParams queryParamsA = a();
        queryParamsA.f19467a = 10;
        queryParamsA.f19468b = ViewFrom.RIGHT;
        return queryParamsA;
    }

    public final boolean h() {
        return (e() || c() || d()) ? false : true;
    }

    public final int hashCode() {
        Integer num = this.f19467a;
        int iIntValue = (((num != null ? num.intValue() : 0) * 31) + (f() ? 1231 : 1237)) * 31;
        Node node = this.f19469c;
        int iHashCode = (iIntValue + (node != null ? node.hashCode() : 0)) * 31;
        ChildKey childKey = this.f19470d;
        int iHashCode2 = (iHashCode + (childKey != null ? childKey.f19513a.hashCode() : 0)) * 31;
        Node node2 = this.f19471e;
        int iHashCode3 = (iHashCode2 + (node2 != null ? node2.hashCode() : 0)) * 31;
        ChildKey childKey2 = this.f19472f;
        int iHashCode4 = (iHashCode3 + (childKey2 != null ? childKey2.f19513a.hashCode() : 0)) * 31;
        Index index = this.f19473g;
        return iHashCode4 + (index != null ? index.hashCode() : 0);
    }

    public final String toString() {
        return b().toString();
    }
}
