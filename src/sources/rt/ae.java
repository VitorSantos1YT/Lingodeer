package rt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zd f49469d;

    public ae(boolean z11, List items, String str, zd zdVar) {
        kotlin.jvm.internal.m.f(items, "items");
        this.f49466a = z11;
        this.f49467b = items;
        this.f49468c = str;
        this.f49469d = zdVar;
    }

    public static ae a(ae aeVar, ArrayList arrayList, String str, zd submissionState, int i11) {
        boolean z11 = aeVar.f49466a;
        List items = arrayList;
        if ((i11 & 2) != 0) {
            items = aeVar.f49467b;
        }
        if ((i11 & 4) != 0) {
            str = aeVar.f49468c;
        }
        if ((i11 & 8) != 0) {
            submissionState = aeVar.f49469d;
        }
        aeVar.getClass();
        kotlin.jvm.internal.m.f(items, "items");
        kotlin.jvm.internal.m.f(submissionState, "submissionState");
        return new ae(z11, items, str, submissionState);
    }

    public final boolean b() {
        List list = this.f49467b;
        if (list.isEmpty()) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ud) it.next()).f50509h) {
                return false;
            }
        }
        return true;
    }

    public final int c() {
        int i11 = 0;
        List list = this.f49467b;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ud) it.next()).f50509h && (i11 = i11 + 1) < 0) {
                ns.o.U();
                throw null;
            }
        }
        return i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return this.f49466a == aeVar.f49466a && kotlin.jvm.internal.m.a(this.f49467b, aeVar.f49467b) && kotlin.jvm.internal.m.a(this.f49468c, aeVar.f49468c) && kotlin.jvm.internal.m.a(this.f49469d, aeVar.f49469d);
    }

    public final int hashCode() {
        int iB = hh.p0.b(Boolean.hashCode(this.f49466a) * 31, 31, this.f49467b);
        String str = this.f49468c;
        return this.f49469d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CustomizeReviewSrsSuggestionUiState(isPrepared=" + this.f49466a + ", items=" + this.f49467b + ", editingItemId=" + this.f49468c + ", submissionState=" + this.f49469d + ")";
    }

    public /* synthetic */ ae(int i11, ArrayList arrayList) {
        this((i11 & 1) == 0, (i11 & 2) != 0 ? ry.r.f50854a : arrayList, null, wd.f50596a);
    }
}
