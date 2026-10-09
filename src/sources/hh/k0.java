package hh;

import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdLearnIndexActivity f32253b;

    public /* synthetic */ k0(PdLearnIndexActivity pdLearnIndexActivity, int i11) {
        this.f32252a = i11;
        this.f32253b = pdLearnIndexActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f32252a;
        PdLearnIndexActivity pdLearnIndexActivity = this.f32253b;
        switch (i11) {
            case 0:
                int i12 = PdLearnIndexActivity.L;
                return Long.valueOf(pdLearnIndexActivity.getIntent().getLongExtra(INTENTS.EXTRA_LONG, 0L));
            default:
                int i13 = PdLearnIndexActivity.L;
                pdLearnIndexActivity.finish();
                return qy.b0.f48488a;
        }
    }
}
