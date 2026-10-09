package js;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36784a;

    public k(int i11) {
        this.f36784a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length = ((String) obj).length();
        int i11 = this.f36784a;
        return qx.b.i(Integer.valueOf(Math.abs(length - i11)), Integer.valueOf(Math.abs(((String) obj2).length() - i11)));
    }
}
