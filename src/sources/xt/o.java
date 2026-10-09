package xt;

import com.lingodeer.data.model.MFSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MFSource f56312b;

    public /* synthetic */ o(MFSource mFSource, int i11) {
        this.f56311a = i11;
        this.f56312b = mFSource;
    }

    @Override // fz.a
    public final Object invoke() {
        int alphatable_f;
        switch (this.f56311a) {
            case 0:
                alphatable_f = this.f56312b.getEsus().getAlphatable_f();
                break;
            case 1:
                alphatable_f = this.f56312b.getCn().getStory_f();
                break;
            case 2:
                alphatable_f = this.f56312b.getJp().getAlphatable_m();
                break;
            case 3:
                alphatable_f = this.f56312b.getJp().getAlphatable_f();
                break;
            case 4:
                alphatable_f = this.f56312b.getKr().getAlphatable_m();
                break;
            case 5:
                alphatable_f = this.f56312b.getKr().getAlphatable_f();
                break;
            case 6:
                alphatable_f = this.f56312b.getKr().getLesson_m();
                break;
            default:
                alphatable_f = this.f56312b.getKr().getLesson_f();
                break;
        }
        return Integer.valueOf(alphatable_f);
    }
}
