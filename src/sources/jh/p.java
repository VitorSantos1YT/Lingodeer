package jh;

import com.lingo.lingoskill.object.PdWord;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36379a;

    public /* synthetic */ p(int i11) {
        this.f36379a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36379a) {
            case 0:
                return qx.b.i(((PdWord) obj).getDetailWord(), ((PdWord) obj2).getDetailWord());
            case 1:
                return qx.b.i(((PdWord) obj).getDetailWord(), ((PdWord) obj2).getDetailWord());
            default:
                return qx.b.i(Long.valueOf(Long.parseLong((String) oz.q.W0((String) obj2, new String[]{":"}, 0, 6).get(0))), Long.valueOf(Long.parseLong((String) oz.q.W0((String) obj, new String[]{":"}, 0, 6).get(0))));
        }
    }
}
