package w00;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f54432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f54434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StringBuilder f54435h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f54428a = l.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f54429b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f54430c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f54431d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54436i = false;

    public final void a() {
        if (this.f54436i) {
            String strB = y00.a.b(this.f54433f);
            StringBuilder sb2 = this.f54435h;
            String strB2 = sb2 != null ? y00.a.b(sb2.toString()) : null;
            String string = this.f54432e.toString();
            z00.q qVar = new z00.q();
            qVar.f58440g = string;
            qVar.f58441h = strB;
            qVar.f58442i = strB2;
            ArrayList arrayList = this.f54431d;
            qVar.g(arrayList);
            arrayList.clear();
            this.f54430c.add(qVar);
            this.f54432e = null;
            this.f54436i = false;
            this.f54433f = null;
            this.f54435h = null;
        }
    }
}
