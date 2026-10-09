package qp;

import android.content.Context;
import android.view.View;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends lp.k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f48046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f48047o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(d dVar, Env env, Context context, View view, lp.i iVar, int i11) {
        super(env, context, view, iVar);
        this.f48046n = i11;
        this.f48047o = dVar;
    }

    @Override // lp.k
    public final void g(Word word) {
        int i11 = this.f48046n;
        Env env = this.f40204a;
        d dVar = this.f48047o;
        switch (i11) {
            case 0:
                if (env.isAudioModel) {
                    jp.p0 p0Var = (jp.p0) ((n) dVar).f47881a;
                    if (!p0Var.Q) {
                        qy.q qVar = fv.b.f28186a;
                        p0Var.I(fv.b.Y(word.getWordId(), null, null));
                    }
                }
                break;
            case 1:
                if (env.isAudioModel) {
                    jp.p0 p0Var2 = (jp.p0) ((f0) dVar).f47881a;
                    if (!p0Var2.Q) {
                        qy.q qVar2 = fv.b.f28186a;
                        p0Var2.I(fv.b.Y(word.getWordId(), null, null));
                    }
                }
                break;
            case 2:
                if (env.isAudioModel) {
                    jp.p0 p0Var3 = (jp.p0) ((y1) dVar).f47881a;
                    if (!p0Var3.Q) {
                        qy.q qVar3 = fv.b.f28186a;
                        p0Var3.I(fv.b.Y(word.getWordId(), null, null));
                    }
                }
                break;
            case 3:
                break;
            case 4:
                if (env.isAudioModel) {
                    jp.p0 p0Var4 = (jp.p0) ((h3) dVar).f47881a;
                    if (!p0Var4.Q) {
                        qy.q qVar4 = fv.b.f28186a;
                        p0Var4.I(fv.b.Y(word.getWordId(), null, null));
                    }
                }
                break;
            default:
                s3 s3Var = (s3) dVar;
                if (env.isAudioModel) {
                    jp.p0 p0Var5 = (jp.p0) s3Var.f47881a;
                    if (!p0Var5.Q) {
                        qy.q qVar5 = fv.b.f28186a;
                        p0Var5.I(fv.b.Y(word.getWordId(), null, null));
                    }
                }
                ta.a aVar = s3Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                if (((hj.q2) aVar).f33139c.getVisibility() == 0 && !s3Var.f48192o) {
                    s3Var.f48192o = true;
                    ta.a aVar2 = s3Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    z4.w0 w0VarB = z4.s0.b(((hj.q2) aVar2).f33139c);
                    ta.a aVar3 = s3Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    w0VarB.m(((hj.q2) aVar3).f33139c.getHeight());
                    w0VarB.e(400L);
                    w0VarB.g(new l.t(s3Var, 4));
                    w0VarB.i();
                    break;
                }
                break;
        }
    }

    @Override // lp.k
    public final void k(View view, Word word) {
        switch (this.f48046n) {
            case 0:
                ((n) this.f48047o).s(view, word);
                break;
            case 1:
                ((f0) this.f48047o).t(view, word);
                break;
            case 2:
                ((y1) this.f48047o).s(view, word);
                break;
            case 3:
                ((v2) this.f48047o).s(view, word);
                break;
            case 4:
                ((h3) this.f48047o).s(view, word);
                break;
            default:
                ((s3) this.f48047o).s(view, word);
                break;
        }
    }

    private final void l(Word word) {
    }
}
