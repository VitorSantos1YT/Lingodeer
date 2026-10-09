package bp;

import com.lingo.lingoskill.object.LanguageItem;
import h1.e8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f4729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f4730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e8 f4731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f4732e;

    public /* synthetic */ o(fz.c cVar, rz.b0 b0Var, e8 e8Var, fz.a aVar, int i11) {
        this.f4728a = i11;
        this.f4729b = cVar;
        this.f4730c = b0Var;
        this.f4731d = e8Var;
        this.f4732e = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        LanguageItem languageItem = (LanguageItem) obj;
        switch (this.f4728a) {
            case 0:
                kotlin.jvm.internal.m.f(languageItem, "languageItem");
                this.f4729b.invoke(languageItem);
                rz.e0.B(this.f4730c, null, null, new i0(this.f4731d, this.f4732e, null, 1), 3);
                break;
            default:
                kotlin.jvm.internal.m.f(languageItem, "it");
                this.f4729b.invoke(languageItem);
                rz.e0.B(this.f4730c, null, null, new i0(this.f4731d, this.f4732e, null, 0), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
