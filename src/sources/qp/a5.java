package qp;

import android.view.View;
import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a5 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d5 f47829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Word f47830c;

    public /* synthetic */ a5(d5 d5Var, Word word, int i11) {
        this.f47828a = i11;
        this.f47829b = d5Var;
        this.f47830c = word;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f47828a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                this.f47829b.u(this.f47830c);
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                this.f47829b.u(this.f47830c);
                break;
        }
        return qy.b0.f48488a;
    }
}
