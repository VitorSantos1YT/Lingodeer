package h1;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f30960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f30961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f30962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz.g f30963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t7 f30964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Locale f30965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Long l9, Long l11, Long l12, lz.g gVar, t7 t7Var, Locale locale) {
        super(0);
        this.f30960a = l9;
        this.f30961b = l11;
        this.f30962c = l12;
        this.f30963d = gVar;
        this.f30964e = t7Var;
        this.f30965f = locale;
    }

    @Override // fz.a
    public final Object invoke() {
        return new t3(this.f30960a, this.f30961b, this.f30962c, this.f30963d, 0, this.f30964e, this.f30965f);
    }
}
