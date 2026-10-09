package v0;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClassification f53463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53464c;

    public h(Object obj, TextClassification textClassification, int i11) {
        super(obj);
        this.f53463b = textClassification;
        this.f53464c = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f53451a);
        sb2.append(", textClassification=");
        sb2.append(this.f53463b);
        sb2.append(", index=");
        return ep.a.j(sb2, this.f53464c, ')');
    }
}
